package com.parizene.netmonitor;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.html.HTMLLayout;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import java.io.File;
import m.a.a;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: FileLoggerTree.java */
/* loaded from: classes.dex */
public class s extends a.b {

    /* renamed from: c, reason: collision with root package name */
    private final Logger f13663c;

    public s(File file) {
        o(file.getPath());
        this.f13663c = LoggerFactory.getLogger("logger");
    }

    private void o(String str) {
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        loggerContext.reset();
        HTMLLayout hTMLLayout = new HTMLLayout();
        hTMLLayout.setContext(loggerContext);
        hTMLLayout.setPattern("%d{HH:mm:ss.SSS}%msg");
        hTMLLayout.start();
        LayoutWrappingEncoder layoutWrappingEncoder = new LayoutWrappingEncoder();
        layoutWrappingEncoder.setContext(loggerContext);
        layoutWrappingEncoder.setLayout(hTMLLayout);
        layoutWrappingEncoder.start();
        FileAppender fileAppender = new FileAppender();
        fileAppender.setContext(loggerContext);
        fileAppender.setFile(str);
        fileAppender.setEncoder(layoutWrappingEncoder);
        fileAppender.setLazy(true);
        fileAppender.setAppend(false);
        fileAppender.start();
        ((ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)).addAppender(fileAppender);
    }

    @Override // m.a.a.c
    protected void h(int i2, String str, String str2, Throwable th) {
        if (str2.startsWith("__FILE__ ")) {
            String strReplaceFirst = str2.replaceFirst("__FILE__ ", "");
            if (i2 == 3) {
                this.f13663c.debug(strReplaceFirst);
                return;
            }
            if (i2 == 4) {
                this.f13663c.info(strReplaceFirst);
            } else if (i2 == 5) {
                this.f13663c.warn(strReplaceFirst);
            } else {
                if (i2 != 6) {
                    return;
                }
                this.f13663c.error(strReplaceFirst);
            }
        }
    }
}