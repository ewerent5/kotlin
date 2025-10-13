package kotlinx.coroutines.internal;

import kotlinx.coroutines.y1;

/* compiled from: MainDispatchers.kt */
/* loaded from: classes3.dex */
final class r extends y1 {

    /* renamed from: f, reason: collision with root package name */
    private final Throwable f16996f;

    /* renamed from: g, reason: collision with root package name */
    private final String f16997g;

    public r(Throwable th, String str) {
        this.f16996f = th;
        this.f16997g = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void k0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f16996f
            if (r0 == 0) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f16997g
            if (r1 == 0) goto L26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 == 0) goto L26
            goto L28
        L26:
            java.lang.String r1 = ""
        L28:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f16996f
            r1.<init>(r0, r2)
            throw r1
        L37:
            kotlinx.coroutines.internal.q.c()
            i.d r0 = new i.d
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.r.k0():java.lang.Void");
    }

    @Override // kotlinx.coroutines.d0
    public boolean a0(i.v.g gVar) {
        k0();
        throw new i.d();
    }

    @Override // kotlinx.coroutines.y1
    public y1 b0() {
        return this;
    }

    @Override // kotlinx.coroutines.d0
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public Void Z(i.v.g gVar, Runnable runnable) {
        k0();
        throw new i.d();
    }

    @Override // kotlinx.coroutines.y1, kotlinx.coroutines.d0
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f16996f != null) {
            str = ", cause=" + this.f16996f;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}