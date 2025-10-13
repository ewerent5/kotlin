package ch.qos.logback.core.net;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.helpers.CyclicBuffer;
import ch.qos.logback.core.pattern.PatternLayoutBase;
import ch.qos.logback.core.sift.DefaultDiscriminator;
import ch.qos.logback.core.sift.Discriminator;
import ch.qos.logback.core.spi.CyclicBufferTracker;
import ch.qos.logback.core.util.ContentTypeUtil;
import ch.qos.logback.core.util.OptionHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/* loaded from: classes.dex */
public abstract class SMTPAppenderBase<E> extends AppenderBase<E> {
    static InternetAddress[] EMPTY_IA_ARRAY = new InternetAddress[0];
    static final int MAX_DELAY_BETWEEN_STATUS_MESSAGES = 1228800000;
    protected CyclicBufferTracker<E> cbTracker;
    protected EventEvaluator<E> eventEvaluator;
    private String from;
    protected Layout<E> layout;
    String localhost;
    protected MimeMessage mimeMsg;
    String password;
    private String smtpHost;
    protected Layout<E> subjectLayout;
    String username;
    long lastTrackerStatusPrint = 0;
    int delayBetweenStatusMessages = 300000;
    private List<PatternLayoutBase<E>> toPatternLayoutList = new ArrayList();
    private String subjectStr = null;
    private int smtpPort = 25;
    private boolean starttls = false;
    private boolean ssl = false;
    boolean asynchronousSending = true;
    private String charsetEncoding = "UTF-8";
    protected Discriminator<E> discriminator = new DefaultDiscriminator();
    private int errorCount = 0;

    class SenderRunnable implements Runnable {
        final CyclicBuffer<E> cyclicBuffer;

        /* renamed from: e, reason: collision with root package name */
        final E f3509e;

        SenderRunnable(CyclicBuffer<E> cyclicBuffer, E e2) {
            this.cyclicBuffer = cyclicBuffer;
            this.f3509e = e2;
        }

        @Override // java.lang.Runnable
        public void run() {
            SMTPAppenderBase.this.sendBuffer(this.cyclicBuffer, this.f3509e);
        }
    }

    private Session buildSessionFromProperties() {
        Properties properties = new Properties(OptionHelper.getSystemProperties());
        String str = this.smtpHost;
        if (str != null) {
            properties.put("mail.smtp.host", str);
        }
        properties.put("mail.smtp.port", Integer.toString(this.smtpPort));
        String str2 = this.localhost;
        if (str2 != null) {
            properties.put("mail.smtp.localhost", str2);
        }
        LoginAuthenticator loginAuthenticator = null;
        if (this.username != null) {
            loginAuthenticator = new LoginAuthenticator(this.username, this.password);
            properties.put("mail.smtp.auth", "true");
        }
        if (isSTARTTLS() && isSSL()) {
            addError("Both SSL and StartTLS cannot be enabled simultaneously");
        } else {
            if (isSTARTTLS()) {
                properties.put("mail.smtp.starttls.enable", "true");
            }
            if (isSSL()) {
                properties.put("mail.smtp.socketFactory.port", Integer.toString(this.smtpPort));
                properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                properties.put("mail.smtp.socketFactory.fallback", "true");
            }
        }
        return Session.getInstance(properties, loginAuthenticator);
    }

    private List<InternetAddress> parseAddress(E e2) {
        int size = this.toPatternLayoutList.size();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                String strDoLayout = this.toPatternLayoutList.get(i2).doLayout(e2);
                if (strDoLayout != null && strDoLayout.length() != 0) {
                    arrayList.addAll(Arrays.asList(InternetAddress.parse(strDoLayout, true)));
                }
            } catch (AddressException e3) {
                addError("Could not parse email address for [" + this.toPatternLayoutList.get(i2) + "] for event [" + e2 + "]", e3);
            }
        }
        return arrayList;
    }

    public void addTo(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Null or empty <to> property");
        }
        PatternLayoutBase<E> patternLayoutBaseMakeNewToPatternLayout = makeNewToPatternLayout(str.trim());
        patternLayoutBaseMakeNewToPatternLayout.setContext(this.context);
        patternLayoutBaseMakeNewToPatternLayout.start();
        this.toPatternLayoutList.add(patternLayoutBaseMakeNewToPatternLayout);
    }

    @Override // ch.qos.logback.core.AppenderBase
    protected void append(E e2) {
        if (checkEntryConditions()) {
            String discriminatingValue = this.discriminator.getDiscriminatingValue(e2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            CyclicBuffer<E> orCreate = this.cbTracker.getOrCreate(discriminatingValue, jCurrentTimeMillis);
            subAppend(orCreate, e2);
            try {
                if (this.eventEvaluator.evaluate(e2)) {
                    CyclicBuffer<E> cyclicBuffer = new CyclicBuffer<>(orCreate);
                    orCreate.clear();
                    if (this.asynchronousSending) {
                        this.context.getExecutorService().execute(new SenderRunnable(cyclicBuffer, e2));
                    } else {
                        sendBuffer(cyclicBuffer, e2);
                    }
                }
            } catch (EvaluationException e3) {
                int i2 = this.errorCount + 1;
                this.errorCount = i2;
                if (i2 < 4) {
                    addError("SMTPAppender's EventEvaluator threw an Exception-", e3);
                }
            }
            if (eventMarksEndOfLife(e2)) {
                this.cbTracker.endOfLife(discriminatingValue);
            }
            this.cbTracker.removeStaleComponents(jCurrentTimeMillis);
            if (this.lastTrackerStatusPrint + this.delayBetweenStatusMessages < jCurrentTimeMillis) {
                addInfo("SMTPAppender [" + this.name + "] is tracking [" + this.cbTracker.getComponentCount() + "] buffers");
                this.lastTrackerStatusPrint = jCurrentTimeMillis;
                int i3 = this.delayBetweenStatusMessages;
                if (i3 < MAX_DELAY_BETWEEN_STATUS_MESSAGES) {
                    this.delayBetweenStatusMessages = i3 * 4;
                }
            }
        }
    }

    public boolean checkEntryConditions() {
        StringBuilder sb;
        String name;
        String string;
        if (!this.started) {
            sb = new StringBuilder();
            sb.append("Attempting to append to a non-started appender: ");
            name = getName();
        } else {
            if (this.mimeMsg == null) {
                string = "Message object not configured.";
                addError(string);
                return false;
            }
            if (this.eventEvaluator == null) {
                sb = new StringBuilder();
                sb.append("No EventEvaluator is set for appender [");
                sb.append(this.name);
                name = "].";
            } else {
                if (this.layout != null) {
                    return true;
                }
                sb = new StringBuilder();
                sb.append("No layout set for appender named [");
                sb.append(this.name);
                name = "]. For more information, please visit http://logback.qos.ch/codes.html#smtp_no_layout";
            }
        }
        sb.append(name);
        string = sb.toString();
        addError(string);
        return false;
    }

    protected abstract boolean eventMarksEndOfLife(E e2);

    protected abstract void fillBuffer(CyclicBuffer<E> cyclicBuffer, StringBuffer stringBuffer);

    InternetAddress getAddress(String str) {
        try {
            return new InternetAddress(str);
        } catch (AddressException e2) {
            addError("Could not parse address [" + str + "].", e2);
            return null;
        }
    }

    public String getCharsetEncoding() {
        return this.charsetEncoding;
    }

    public CyclicBufferTracker<E> getCyclicBufferTracker() {
        return this.cbTracker;
    }

    public Discriminator<E> getDiscriminator() {
        return this.discriminator;
    }

    public String getFrom() {
        return this.from;
    }

    public Layout<E> getLayout() {
        return this.layout;
    }

    public String getLocalhost() {
        return this.localhost;
    }

    public Message getMessage() {
        return this.mimeMsg;
    }

    public String getPassword() {
        return this.password;
    }

    public String getSMTPHost() {
        return getSmtpHost();
    }

    public int getSMTPPort() {
        return getSmtpPort();
    }

    public String getSmtpHost() {
        return this.smtpHost;
    }

    public int getSmtpPort() {
        return this.smtpPort;
    }

    public String getSubject() {
        return this.subjectStr;
    }

    public List<String> getToAsListOfString() {
        ArrayList arrayList = new ArrayList();
        Iterator<PatternLayoutBase<E>> it = this.toPatternLayoutList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPattern());
        }
        return arrayList;
    }

    public List<PatternLayoutBase<E>> getToList() {
        return this.toPatternLayoutList;
    }

    public String getUsername() {
        return this.username;
    }

    public boolean isAsynchronousSending() {
        return this.asynchronousSending;
    }

    public boolean isSSL() {
        return this.ssl;
    }

    public boolean isSTARTTLS() {
        return this.starttls;
    }

    protected abstract PatternLayoutBase<E> makeNewToPatternLayout(String str);

    protected abstract Layout<E> makeSubjectLayout(String str);

    protected void sendBuffer(CyclicBuffer<E> cyclicBuffer, E e2) {
        try {
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            StringBuffer stringBuffer = new StringBuffer();
            String fileHeader = this.layout.getFileHeader();
            if (fileHeader != null) {
                stringBuffer.append(fileHeader);
            }
            String presentationHeader = this.layout.getPresentationHeader();
            if (presentationHeader != null) {
                stringBuffer.append(presentationHeader);
            }
            fillBuffer(cyclicBuffer, stringBuffer);
            String presentationFooter = this.layout.getPresentationFooter();
            if (presentationFooter != null) {
                stringBuffer.append(presentationFooter);
            }
            String fileFooter = this.layout.getFileFooter();
            if (fileFooter != null) {
                stringBuffer.append(fileFooter);
            }
            String strDoLayout = "Undefined subject";
            Layout<E> layout = this.subjectLayout;
            if (layout != null) {
                strDoLayout = layout.doLayout(e2);
                int iIndexOf = strDoLayout != null ? strDoLayout.indexOf(10) : -1;
                if (iIndexOf > -1) {
                    strDoLayout = strDoLayout.substring(0, iIndexOf);
                }
            }
            this.mimeMsg.setSubject(strDoLayout, this.charsetEncoding);
            List<InternetAddress> address = parseAddress(e2);
            if (address.isEmpty()) {
                addInfo("Empty destination address. Aborting email transmission");
                return;
            }
            InternetAddress[] internetAddressArr = (InternetAddress[]) address.toArray(EMPTY_IA_ARRAY);
            this.mimeMsg.setRecipients(Message.RecipientType.TO, internetAddressArr);
            String contentType = this.layout.getContentType();
            if (ContentTypeUtil.isTextual(contentType)) {
                mimeBodyPart.setText(stringBuffer.toString(), this.charsetEncoding, ContentTypeUtil.getSubType(contentType));
            } else {
                mimeBodyPart.setContent(stringBuffer.toString(), this.layout.getContentType());
            }
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(mimeBodyPart);
            this.mimeMsg.setContent(mimeMultipart);
            this.mimeMsg.setSentDate(new Date());
            addInfo("About to send out SMTP message \"" + strDoLayout + "\" to " + Arrays.toString(internetAddressArr));
            Transport.send(this.mimeMsg);
        } catch (Exception e3) {
            addError("Error occurred while sending e-mail notification.", e3);
        }
    }

    public void setAsynchronousSending(boolean z) {
        this.asynchronousSending = z;
    }

    public void setCharsetEncoding(String str) {
        this.charsetEncoding = str;
    }

    public void setCyclicBufferTracker(CyclicBufferTracker<E> cyclicBufferTracker) {
        this.cbTracker = cyclicBufferTracker;
    }

    public void setDiscriminator(Discriminator<E> discriminator) {
        this.discriminator = discriminator;
    }

    public void setEvaluator(EventEvaluator<E> eventEvaluator) {
        this.eventEvaluator = eventEvaluator;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setLayout(Layout<E> layout) {
        this.layout = layout;
    }

    public void setLocalhost(String str) {
        this.localhost = str;
    }

    public void setMessage(MimeMessage mimeMessage) {
        this.mimeMsg = mimeMessage;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setSMTPHost(String str) {
        setSmtpHost(str);
    }

    public void setSMTPPort(int i2) {
        setSmtpPort(i2);
    }

    public void setSSL(boolean z) {
        this.ssl = z;
    }

    public void setSTARTTLS(boolean z) {
        this.starttls = z;
    }

    public void setSmtpHost(String str) {
        this.smtpHost = str;
    }

    public void setSmtpPort(int i2) {
        this.smtpPort = i2;
    }

    public void setSubject(String str) {
        this.subjectStr = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.cbTracker == null) {
            this.cbTracker = new CyclicBufferTracker<>();
        }
        Session sessionBuildSessionFromProperties = buildSessionFromProperties();
        if (sessionBuildSessionFromProperties == null) {
            addError("Failed to obtain javax.mail.Session. Cannot start.");
            return;
        }
        MimeMessage mimeMessage = new MimeMessage(sessionBuildSessionFromProperties);
        this.mimeMsg = mimeMessage;
        try {
            String str = this.from;
            if (str != null) {
                mimeMessage.setFrom(getAddress(str));
            } else {
                mimeMessage.setFrom();
            }
            this.subjectLayout = makeSubjectLayout(this.subjectStr);
            this.started = true;
        } catch (MessagingException e2) {
            addError("Could not activate SMTPAppender options.", e2);
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public synchronized void stop() {
        this.started = false;
    }

    protected abstract void subAppend(CyclicBuffer<E> cyclicBuffer, E e2);
}