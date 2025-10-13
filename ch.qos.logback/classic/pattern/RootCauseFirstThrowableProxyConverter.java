package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class RootCauseFirstThrowableProxyConverter extends ExtendedThrowableProxyConverter {
    protected void recursiveAppendRootCauseFirst(StringBuilder sb, String str, int i2, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCause() != null) {
            recursiveAppendRootCauseFirst(sb, str, i2, iThrowableProxy.getCause());
            str = null;
        }
        ThrowableProxyUtil.indent(sb, i2 - 1);
        if (str != null) {
            sb.append(str);
        }
        ThrowableProxyUtil.subjoinFirstLineRootCauseFirst(sb, iThrowableProxy);
        sb.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb, i2, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                recursiveAppendRootCauseFirst(sb, CoreConstants.SUPPRESSED, i2 + 1, iThrowableProxy2);
            }
        }
    }

    @Override // ch.qos.logback.classic.pattern.ThrowableProxyConverter
    protected String throwableProxyToString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb = new StringBuilder(2048);
        recursiveAppendRootCauseFirst(sb, null, 1, iThrowableProxy);
        return sb.toString();
    }
}