package ch.qos.logback.core.rolling;

import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.InvocationGate;
import java.io.File;

/* loaded from: classes.dex */
public class SizeBasedTriggeringPolicy<E> extends TriggeringPolicyBase<E> {
    public static final long DEFAULT_MAX_FILE_SIZE = 10485760;
    public static final String SEE_SIZE_FORMAT = "http://logback.qos.ch/codes.html#sbtp_size_format";
    FileSize maxFileSize;
    String maxFileSizeAsString = Long.toString(DEFAULT_MAX_FILE_SIZE);
    private InvocationGate invocationGate = new InvocationGate();

    public SizeBasedTriggeringPolicy() {
    }

    public SizeBasedTriggeringPolicy(String str) {
        setMaxFileSize(str);
    }

    public String getMaxFileSize() {
        return this.maxFileSizeAsString;
    }

    @Override // ch.qos.logback.core.rolling.TriggeringPolicy
    public boolean isTriggeringEvent(File file, E e2) {
        if (this.invocationGate.skipFurtherWork()) {
            return false;
        }
        this.invocationGate.updateMaskIfNecessary(System.currentTimeMillis());
        return file.length() >= this.maxFileSize.getSize();
    }

    public void setMaxFileSize(String str) {
        this.maxFileSizeAsString = str;
        this.maxFileSize = FileSize.valueOf(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    long toFileSize(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 10485760(0xa00000, double:5.180654E-317)
            if (r9 != 0) goto L6
            return r0
        L6:
            java.lang.String r2 = r9.trim()
            java.lang.String r2 = r2.toUpperCase()
            r3 = 1
            java.lang.String r5 = "KB"
            int r5 = r2.indexOf(r5)
            r6 = 0
            r7 = -1
            if (r5 == r7) goto L21
            r3 = 1024(0x400, double:5.06E-321)
        L1c:
            java.lang.String r2 = r2.substring(r6, r5)
            goto L39
        L21:
            java.lang.String r5 = "MB"
            int r5 = r2.indexOf(r5)
            if (r5 == r7) goto L2d
            r3 = 1048576(0x100000, double:5.180654E-318)
            goto L1c
        L2d:
            java.lang.String r5 = "GB"
            int r5 = r2.indexOf(r5)
            if (r5 == r7) goto L39
            r3 = 1073741824(0x40000000, double:5.304989477E-315)
            goto L1c
        L39:
            if (r2 == 0) goto L7c
            java.lang.Long r5 = java.lang.Long.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L46
            long r0 = r5.longValue()     // Catch: java.lang.NumberFormatException -> L46
            long r0 = r0 * r3
            return r0
        L46:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "["
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "] is not in proper int format. Please refer to "
            r4.append(r2)
            java.lang.String r2 = "http://logback.qos.ch/codes.html#sbtp_size_format"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r8.addError(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r9)
            java.lang.String r9 = "] not in expected format."
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r8.addError(r9, r3)
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy.toFileSize(java.lang.String):long");
    }
}