package g.a.a.a;

import java.io.IOException;
import java.io.Reader;

/* compiled from: RowReader.java */
/* loaded from: classes3.dex */
final class h {
    private final g a = new g(32);

    /* renamed from: b, reason: collision with root package name */
    private final a f15735b;

    /* renamed from: c, reason: collision with root package name */
    private final char f15736c;

    /* renamed from: d, reason: collision with root package name */
    private final char f15737d;

    /* renamed from: e, reason: collision with root package name */
    private final b f15738e;

    /* renamed from: f, reason: collision with root package name */
    private final char f15739f;

    /* renamed from: g, reason: collision with root package name */
    private int f15740g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15741h;

    /* compiled from: RowReader.java */
    private static class a {
        char[] a = new char[8192];

        /* renamed from: b, reason: collision with root package name */
        int f15742b;

        /* renamed from: c, reason: collision with root package name */
        int f15743c;

        /* renamed from: d, reason: collision with root package name */
        int f15744d;

        /* renamed from: e, reason: collision with root package name */
        private final Reader f15745e;

        a(Reader reader) {
            this.f15745e = reader;
        }

        private static char[] b(char[] cArr, int i2) throws IOException {
            int length = cArr.length * 2;
            if (length > 8388608) {
                throw new IOException("Maximum buffer size 8388608 is not enough to read data");
            }
            char[] cArr2 = new char[length];
            System.arraycopy(cArr, i2, cArr2, 0, cArr.length - i2);
            return cArr2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() throws IOException {
            int i2 = this.f15743c;
            int i3 = this.f15744d;
            if (i2 < i3) {
                char[] cArr = this.a;
                if (8192 > cArr.length - i3) {
                    int i4 = i3 - i2;
                    if (8192 > cArr.length - i4) {
                        this.a = b(cArr, i2);
                    } else {
                        System.arraycopy(cArr, i2, cArr, 0, i4);
                    }
                    this.f15744d -= this.f15743c;
                    this.f15743c = 0;
                }
            } else {
                this.f15743c = 0;
                this.f15744d = 0;
            }
            int i5 = this.f15745e.read(this.a, this.f15744d, 8192);
            if (i5 == -1) {
                return true;
            }
            this.f15742b = this.f15744d + i5;
            return false;
        }
    }

    h(Reader reader, char c2, char c3, b bVar, char c4) {
        this.f15735b = new a(reader);
        this.f15736c = c2;
        this.f15737d = c3;
        this.f15738e = bVar;
        this.f15739f = c4;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0016 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(char[] r5, int r6, int r7, char r8) {
        /*
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            if (r6 >= r7) goto L19
            char r3 = r5[r6]
            if (r3 != r8) goto L10
            if (r2 != 0) goto Lf
            int r1 = r1 + 1
            r2 = 1
            goto L16
        Lf:
            r2 = 0
        L10:
            if (r1 <= 0) goto L16
            int r4 = r6 - r1
            r5[r4] = r3
        L16:
            int r6 = r6 + 1
            goto L3
        L19:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.a.h.a(char[], int, int, char):int");
    }

    private static String d(char[] cArr, int i2, int i3, int i4, char c2) {
        if ((i4 & 2) == 0) {
            return new String(cArr, i2, i3);
        }
        int i5 = i2 + 1;
        return new String(cArr, i5, (i3 - 1) - a(cArr, i5, i2 + i3, c2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d4, code lost:
    
        r12.d();
        r0 = r3;
        r1 = r0;
        r2 = 16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean b(g.a.a.a.g r12, char[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.a.h.b(g.a.a.a.g, char[], int):boolean");
    }

    d c() {
        if (this.f15741h) {
            return null;
        }
        while (true) {
            a aVar = this.f15735b;
            if (aVar.f15742b == aVar.f15744d && aVar.c()) {
                a aVar2 = this.f15735b;
                if (aVar2.f15743c < aVar2.f15744d || this.a.g()) {
                    g gVar = this.a;
                    a aVar3 = this.f15735b;
                    char[] cArr = aVar3.a;
                    int i2 = aVar3.f15743c;
                    gVar.a(d(cArr, i2, aVar3.f15744d - i2, this.f15740g, this.f15737d));
                } else if ((this.f15740g & 8) != 0) {
                    this.a.a("");
                }
                this.f15741h = true;
            } else {
                g gVar2 = this.a;
                a aVar4 = this.f15735b;
                if (!b(gVar2, aVar4.a, aVar4.f15742b)) {
                    break;
                }
            }
        }
        return this.a.c();
    }
}