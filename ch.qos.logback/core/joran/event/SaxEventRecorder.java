package ch.qos.logback.core.joran.event;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.ContextAwareImpl;
import ch.qos.logback.core.status.Status;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.sax2.Driver;

/* loaded from: classes.dex */
public class SaxEventRecorder extends DefaultHandler implements ContextAware {
    private final ContextAwareImpl cai;
    ElementPath globalElementPath;
    private Locator locator;
    private List<SaxEvent> saxEventList;

    public SaxEventRecorder() {
        this.saxEventList = new ArrayList();
        this.globalElementPath = new ElementPath();
        this.cai = new ContextAwareImpl(null, this);
    }

    public SaxEventRecorder(Context context) {
        this.saxEventList = new ArrayList();
        this.globalElementPath = new ElementPath();
        this.cai = new ContextAwareImpl(context, this);
    }

    private Driver buildPullParser() throws SAXNotRecognizedException, SAXNotSupportedException, JoranException {
        try {
            Driver driver = new Driver();
            try {
                driver.setFeature("http://xml.org/sax/features/validation", false);
            } catch (SAXNotSupportedException unused) {
            }
            driver.setFeature("http://xml.org/sax/features/namespaces", true);
            return driver;
        } catch (Exception e2) {
            addError("Parser configuration error occurred", e2);
            throw new JoranException("Parser configuration error occurred", e2);
        }
    }

    private void handleError(String str, Throwable th) throws JoranException {
        addError(str, th);
        throw new JoranException(str, th);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addError(String str) {
        this.cai.addError(str);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addError(String str, Throwable th) {
        this.cai.addError(str, th);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addInfo(String str) {
        this.cai.addInfo(str);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addInfo(String str, Throwable th) {
        this.cai.addInfo(str, th);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addStatus(Status status) {
        this.cai.addStatus(status);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addWarn(String str) {
        this.cai.addWarn(str);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void addWarn(String str, Throwable th) {
        this.cai.addWarn(str, th);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i2, int i3) {
        String str = new String(cArr, i2, i3);
        SaxEvent lastEvent = getLastEvent();
        if (lastEvent instanceof BodyEvent) {
            ((BodyEvent) lastEvent).append(str);
        } else {
            if (isSpaceOnly(str)) {
                return;
            }
            this.saxEventList.add(new BodyEvent(str, getLocator()));
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        if (str3 != null) {
            str3.length();
        }
        this.saxEventList.add(new EndEvent(str, str2, str3, getLocator()));
        this.globalElementPath.pop();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) {
        addError("XML_PARSING - Parsing error on line " + sAXParseException.getLineNumber() + " and column " + sAXParseException.getColumnNumber(), sAXParseException);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) {
        addError("XML_PARSING - Parsing fatal error on line " + sAXParseException.getLineNumber() + " and column " + sAXParseException.getColumnNumber(), sAXParseException);
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public Context getContext() {
        return this.cai.getContext();
    }

    SaxEvent getLastEvent() {
        if (this.saxEventList.isEmpty()) {
            return null;
        }
        return this.saxEventList.get(this.saxEventList.size() - 1);
    }

    public Locator getLocator() {
        return this.locator;
    }

    public List<SaxEvent> getSaxEventList() {
        return this.saxEventList;
    }

    String getTagName(String str, String str2) {
        return (str == null || str.length() < 1) ? str2 : str;
    }

    boolean isSpaceOnly(String str) {
        return str.trim().length() == 0;
    }

    public List<SaxEvent> recordEvents(InputSource inputSource) throws SAXException, JoranException, IOException {
        String str;
        Driver driverBuildPullParser = buildPullParser();
        try {
            driverBuildPullParser.setContentHandler(this);
            driverBuildPullParser.setErrorHandler(this);
            driverBuildPullParser.parse(inputSource);
            return this.saxEventList;
        } catch (EOFException e2) {
            handleError(e2.getLocalizedMessage(), new SAXParseException(e2.getLocalizedMessage(), this.locator, e2));
            throw new IllegalStateException("This point can never be reached");
        } catch (IOException e3) {
            e = e3;
            str = "I/O error occurred while parsing xml file";
            handleError(str, e);
            throw new IllegalStateException("This point can never be reached");
        } catch (SAXException e4) {
            throw new JoranException("Problem parsing XML document. See previously reported errors.", e4);
        } catch (Exception e5) {
            e = e5;
            str = "Unexpected exception while parsing XML document.";
            handleError(str, e);
            throw new IllegalStateException("This point can never be reached");
        }
    }

    public final void recordEvents(InputStream inputStream) throws SAXException, JoranException, IOException {
        recordEvents(new InputSource(inputStream));
    }

    @Override // ch.qos.logback.core.spi.ContextAware
    public void setContext(Context context) {
        this.cai.setContext(context);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.locator = locator;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (str3 != null) {
            str3.length();
        }
        this.globalElementPath.push(getTagName(str2, str3));
        this.saxEventList.add(new StartEvent(this.globalElementPath.duplicate(), str, str2, str3, attributes, getLocator()));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) {
        addWarn("XML_PARSING - Parsing warning on line " + sAXParseException.getLineNumber() + " and column " + sAXParseException.getColumnNumber(), sAXParseException);
    }
}