package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public abstract class AbstractIncludeAction extends Action {
    private static final String FILE_ATTR = "file";
    private static final String OPTIONAL_ATTR = "optional";
    private static final String RESOURCE_ATTR = "resource";
    private static final String URL_ATTR = "url";
    private String attributeInUse;
    private boolean optional;
    private URL urlInUse;

    private URL attributeToURL(String str) throws IOException {
        StringBuilder sb;
        String str2;
        try {
            URL url = new URL(str);
            url.openStream().close();
            return url;
        } catch (MalformedURLException e2) {
            e = e2;
            if (this.optional) {
                return null;
            }
            sb = new StringBuilder();
            sb.append("URL [");
            sb.append(str);
            str2 = "] is not well formed.";
            sb.append(str2);
            handleError(sb.toString(), e);
            return null;
        } catch (IOException e3) {
            e = e3;
            if (this.optional) {
                return null;
            }
            sb = new StringBuilder();
            sb.append("URL [");
            sb.append(str);
            str2 = "] cannot be opened.";
            sb.append(str2);
            handleError(sb.toString(), e);
            return null;
        }
    }

    private boolean checkAttributes(Attributes attributes) {
        String str;
        String value = attributes.getValue("file");
        String value2 = attributes.getValue(URL_ATTR);
        String value3 = attributes.getValue(RESOURCE_ATTR);
        int i2 = !OptionHelper.isEmpty(value) ? 1 : 0;
        if (!OptionHelper.isEmpty(value2)) {
            i2++;
        }
        if (!OptionHelper.isEmpty(value3)) {
            i2++;
        }
        if (i2 == 0) {
            str = String.format("One of \"%1$s\", \"%2$s\" or \"%3$s\" attributes must be set.", "file", RESOURCE_ATTR, URL_ATTR);
        } else {
            if (i2 <= 1) {
                if (i2 == 1) {
                    return true;
                }
                throw new IllegalStateException("Count value [" + i2 + "] is not expected");
            }
            str = String.format("Only one of \"%1$s\", \"%2$s\" or \"%3$s\" attributes should be set.", "file", RESOURCE_ATTR, URL_ATTR);
        }
        handleError(str, null);
        return false;
    }

    private URL filePathAsURL(String str) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            try {
                return file.toURI().toURL();
            } catch (MalformedURLException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        if (!this.optional) {
            handleError("File does not exist [" + str + "]", new FileNotFoundException(str));
        }
        return null;
    }

    private URL getInputURL(InterpretationContext interpretationContext, Attributes attributes) {
        String value = attributes.getValue("file");
        String value2 = attributes.getValue(URL_ATTR);
        String value3 = attributes.getValue(RESOURCE_ATTR);
        if (!OptionHelper.isEmpty(value)) {
            String strSubst = interpretationContext.subst(value);
            this.attributeInUse = strSubst;
            return filePathAsURL(strSubst);
        }
        if (!OptionHelper.isEmpty(value2)) {
            String strSubst2 = interpretationContext.subst(value2);
            this.attributeInUse = strSubst2;
            return attributeToURL(strSubst2);
        }
        if (OptionHelper.isEmpty(value3)) {
            throw new IllegalStateException("A URL stream should have been returned");
        }
        String strSubst3 = interpretationContext.subst(value3);
        this.attributeInUse = strSubst3;
        return resourceAsURL(strSubst3);
    }

    private URL resourceAsURL(String str) {
        URL resourceBySelfClassLoader = Loader.getResourceBySelfClassLoader(str);
        if (resourceBySelfClassLoader != null) {
            return resourceBySelfClassLoader;
        }
        if (!this.optional) {
            handleError("Could not find resource corresponding to [" + str + "]", null);
        }
        return null;
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        this.attributeInUse = null;
        this.optional = OptionHelper.toBoolean(attributes.getValue(OPTIONAL_ATTR), false);
        if (checkAttributes(attributes)) {
            try {
                URL inputURL = getInputURL(interpretationContext, attributes);
                if (inputURL != null) {
                    processInclude(interpretationContext, inputURL);
                }
            } catch (JoranException e2) {
                handleError("Error while parsing " + this.attributeInUse, e2);
            }
        }
    }

    protected void close(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
    }

    protected String getAttributeInUse() {
        return this.attributeInUse;
    }

    public URL getUrl() {
        return this.urlInUse;
    }

    protected void handleError(String str, Exception exc) {
        addError(str, exc);
    }

    protected boolean isOptional() {
        return this.optional;
    }

    protected abstract void processInclude(InterpretationContext interpretationContext, URL url);
}