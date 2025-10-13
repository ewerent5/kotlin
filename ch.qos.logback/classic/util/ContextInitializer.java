package ch.qos.logback.classic.util;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.android.CommonPathUtil;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public class ContextInitializer {
    private static final String ASSETS_DIR = CommonPathUtil.getAssetsDirectoryPath();
    public static final String AUTOCONFIG_FILE = "logback.xml";
    public static final String CONFIG_FILE_PROPERTY = "logback.configurationFile";
    public static final String STATUS_LISTENER_CLASS = "logback.statusListenerClass";
    final ClassLoader classLoader = Loader.getClassLoaderOfObject(this);
    final LoggerContext loggerContext;

    public ContextInitializer(LoggerContext loggerContext) {
        this.loggerContext = loggerContext;
    }

    private URL findConfigFileFromSystemProperties(boolean z) {
        URL url;
        String systemProperty = OptionHelper.getSystemProperty(CONFIG_FILE_PROPERTY);
        try {
            if (systemProperty != null) {
                try {
                    File file = new File(systemProperty);
                    if (file.exists() && file.isFile()) {
                        if (z) {
                            statusOnResourceSearch(systemProperty, this.classLoader, systemProperty);
                        }
                        url = file.toURI().toURL();
                    } else {
                        url = new URL(systemProperty);
                    }
                    if (z) {
                        statusOnResourceSearch(systemProperty, this.classLoader, url != null ? url.toString() : null);
                    }
                    return url;
                } catch (MalformedURLException unused) {
                    URL resource = Loader.getResource(systemProperty, this.classLoader);
                    if (resource != null) {
                        if (z) {
                            statusOnResourceSearch(systemProperty, this.classLoader, resource.toString());
                        }
                        return resource;
                    }
                    if (z) {
                        statusOnResourceSearch(systemProperty, this.classLoader, resource != null ? resource.toString() : null);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            if (z) {
                statusOnResourceSearch(systemProperty, this.classLoader, null);
            }
            throw th;
        }
    }

    private InputStream findConfigFileURLFromAssets(boolean z) {
        return getResource(ASSETS_DIR + "/" + AUTOCONFIG_FILE, this.classLoader, z);
    }

    private InputStream getResource(String str, ClassLoader classLoader, boolean z) {
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (z) {
            statusOnResourceSearch(str, classLoader, resourceAsStream != null ? str : null);
        }
        return resourceAsStream;
    }

    private void statusOnResourceSearch(String str, ClassLoader classLoader, String str2) {
        StatusManager statusManager = this.loggerContext.getStatusManager();
        if (str2 == null) {
            statusManager.add(new InfoStatus("Could NOT find resource [" + str + "]", this.loggerContext));
            return;
        }
        statusManager.add(new InfoStatus("Found resource [" + str + "] at [" + str2 + "]", this.loggerContext));
    }

    public void autoConfig() throws JoranException, IOException {
        boolean z;
        InputStream inputStreamFindConfigFileURLFromAssets;
        StatusListenerConfigHelper.installIfAsked(this.loggerContext);
        JoranConfigurator joranConfigurator = new JoranConfigurator();
        joranConfigurator.setContext(this.loggerContext);
        URL urlFindConfigFileFromSystemProperties = findConfigFileFromSystemProperties(true);
        if (urlFindConfigFileFromSystemProperties != null) {
            joranConfigurator.doConfigure(urlFindConfigFileFromSystemProperties);
            z = true;
        } else {
            z = false;
        }
        if (z || (inputStreamFindConfigFileURLFromAssets = findConfigFileURLFromAssets(true)) == null) {
            return;
        }
        joranConfigurator.doConfigure(inputStreamFindConfigFileURLFromAssets);
    }
}