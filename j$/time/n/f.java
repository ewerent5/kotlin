package j$.time.n;

import j$.time.o.l;
import j$.time.o.n;
import java.util.Locale;

/* loaded from: classes2.dex */
final class f {
    private j$.time.o.k a;

    /* renamed from: b */
    private b f15964b;

    /* renamed from: c */
    private int f15965c;

    /* JADX WARN: Removed duplicated region for block: B:124:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    f(j$.time.o.k r10, j$.time.n.b r11) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.n.f.<init>(j$.time.o.k, j$.time.n.b):void");
    }

    void a() {
        this.f15965c--;
    }

    h b() {
        return this.f15964b.c();
    }

    Locale c() {
        return this.f15964b.d();
    }

    j$.time.o.k d() {
        return this.a;
    }

    Long e(l lVar) {
        try {
            return Long.valueOf(this.a.l(lVar));
        } catch (j$.time.c e2) {
            if (this.f15965c > 0) {
                return null;
            }
            throw e2;
        }
    }

    Object f(n nVar) {
        Object objN = this.a.n(nVar);
        if (objN != null || this.f15965c != 0) {
            return objN;
        }
        StringBuilder sbA = j$.T0.a.a.a.a.a("Unable to extract value: ");
        sbA.append(this.a.getClass());
        throw new j$.time.c(sbA.toString());
    }

    void g() {
        this.f15965c++;
    }

    public String toString() {
        return this.a.toString();
    }
}