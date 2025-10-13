package j.f0;

import i.y.d.l;
import j.f;
import j.i;

/* compiled from: ByteString.kt */
/* loaded from: classes3.dex */
public final class b {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0068, code lost:
    
        return -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f0.b.c(byte[], int):int");
    }

    public static final void d(i iVar, f fVar, int i2, int i3) {
        l.d(iVar, "$this$commonWrite");
        l.d(fVar, "buffer");
        fVar.g0(iVar.e(), i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' > c2 || 'f' < c2) {
            c3 = 'A';
            if ('A' > c2 || 'F' < c2) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c2);
            }
        }
        return (c2 - c3) + 10;
    }

    public static final char[] f() {
        return a;
    }
}