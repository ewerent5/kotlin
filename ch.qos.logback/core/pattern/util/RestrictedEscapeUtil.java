package ch.qos.logback.core.pattern.util;

/* loaded from: classes.dex */
public class RestrictedEscapeUtil implements IEscapeUtil {
    @Override // ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c2, int i2) {
        if (str.indexOf(c2) < 0) {
            stringBuffer.append("\\");
        }
        stringBuffer.append(c2);
    }
}