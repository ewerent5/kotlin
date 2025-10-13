package ch.qos.logback.core.pattern.util;

/* loaded from: classes.dex */
public class AlmostAsIsEscapeUtil extends RestrictedEscapeUtil {
    @Override // ch.qos.logback.core.pattern.util.RestrictedEscapeUtil, ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c2, int i2) {
        super.escape("%)", stringBuffer, c2, i2);
    }
}