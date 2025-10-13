package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.status.ErrorStatus;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ThrowableProxyConverter extends ThrowableHandlingConverter {
    protected static final int BUILDER_CAPACITY = 2048;
    int lengthOption;
    List<EventEvaluator<ILoggingEvent>> evaluatorList = null;
    int errorCount = 0;

    private void addEvaluator(EventEvaluator<ILoggingEvent> eventEvaluator) {
        if (this.evaluatorList == null) {
            this.evaluatorList = new ArrayList();
        }
        this.evaluatorList.add(eventEvaluator);
    }

    private void recursiveAppend(StringBuilder sb, String str, int i2, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy == null) {
            return;
        }
        subjoinFirstLine(sb, str, i2, iThrowableProxy);
        sb.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb, i2, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                recursiveAppend(sb, CoreConstants.SUPPRESSED, i2 + 1, iThrowableProxy2);
            }
        }
        recursiveAppend(sb, CoreConstants.CAUSED_BY, i2, iThrowableProxy.getCause());
    }

    private void subjoinExceptionMessage(StringBuilder sb, IThrowableProxy iThrowableProxy) {
        sb.append(iThrowableProxy.getClassName());
        sb.append(": ");
        sb.append(iThrowableProxy.getMessage());
    }

    private void subjoinFirstLine(StringBuilder sb, String str, int i2, IThrowableProxy iThrowableProxy) {
        ThrowableProxyUtil.indent(sb, i2 - 1);
        if (str != null) {
            sb.append(str);
        }
        subjoinExceptionMessage(sb, iThrowableProxy);
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        IThrowableProxy throwableProxy = iLoggingEvent.getThrowableProxy();
        if (throwableProxy == null) {
            return "";
        }
        if (this.evaluatorList != null) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.evaluatorList.size()) {
                    z = true;
                    break;
                }
                EventEvaluator<ILoggingEvent> eventEvaluator = this.evaluatorList.get(i2);
                try {
                } catch (EvaluationException e2) {
                    this.errorCount++;
                    if (this.errorCount < 4) {
                        addError("Exception thrown for evaluator named [" + eventEvaluator.getName() + "]", e2);
                    } else if (this.errorCount == 4) {
                        ErrorStatus errorStatus = new ErrorStatus("Exception thrown for evaluator named [" + eventEvaluator.getName() + "].", this, e2);
                        errorStatus.add(new ErrorStatus("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        addStatus(errorStatus);
                    }
                }
                if (eventEvaluator.evaluate(iLoggingEvent)) {
                    break;
                }
                i2++;
            }
            if (!z) {
                return "";
            }
        }
        return throwableProxyToString(throwableProxy);
    }

    protected void extraData(StringBuilder sb, StackTraceElementProxy stackTraceElementProxy) {
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void start() {
        /*
            r6 = this;
            java.lang.String r0 = r6.getFirstOption()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 1
            if (r0 != 0) goto Ld
        La:
            r6.lengthOption = r1
            goto L46
        Ld:
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r3 = "full"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L1a
            goto La
        L1a:
            java.lang.String r3 = "short"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L25
            r6.lengthOption = r2
            goto L46
        L25:
            int r3 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L2c
            r6.lengthOption = r3     // Catch: java.lang.NumberFormatException -> L2c
            goto L46
        L2c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not parse ["
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "] as an integer"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r6.addError(r0)
            goto La
        L46:
            java.util.List r0 = r6.getOptionList()
            if (r0 == 0) goto L76
            int r1 = r0.size()
            if (r1 <= r2) goto L76
            int r1 = r0.size()
        L56:
            if (r2 >= r1) goto L76
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            ch.qos.logback.core.Context r4 = r6.getContext()
            java.lang.String r5 = "EVALUATOR_MAP"
            java.lang.Object r4 = r4.getObject(r5)
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r3 = r4.get(r3)
            ch.qos.logback.core.boolex.EventEvaluator r3 = (ch.qos.logback.core.boolex.EventEvaluator) r3
            r6.addEvaluator(r3)
            int r2 = r2 + 1
            goto L56
        L76:
            super.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.classic.pattern.ThrowableProxyConverter.start():void");
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.evaluatorList = null;
        super.stop();
    }

    protected void subjoinSTEPArray(StringBuilder sb, int i2, IThrowableProxy iThrowableProxy) {
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        int commonFrames = iThrowableProxy.getCommonFrames();
        int length = this.lengthOption;
        boolean z = length > stackTraceElementProxyArray.length;
        if (z) {
            length = stackTraceElementProxyArray.length;
        }
        if (commonFrames > 0 && z) {
            length -= commonFrames;
        }
        for (int i3 = 0; i3 < length; i3++) {
            ThrowableProxyUtil.indent(sb, i2);
            sb.append(stackTraceElementProxyArray[i3]);
            extraData(sb, stackTraceElementProxyArray[i3]);
            sb.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames <= 0 || !z) {
            return;
        }
        ThrowableProxyUtil.indent(sb, i2);
        sb.append("... ");
        sb.append(iThrowableProxy.getCommonFrames());
        sb.append(" common frames omitted");
        sb.append(CoreConstants.LINE_SEPARATOR);
    }

    protected String throwableProxyToString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb = new StringBuilder(BUILDER_CAPACITY);
        recursiveAppend(sb, null, 1, iThrowableProxy);
        return sb.toString();
    }
}