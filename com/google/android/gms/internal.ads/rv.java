package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rv extends lv implements e03<pz2> {

    /* renamed from: h, reason: collision with root package name */
    private String f8747h;

    /* renamed from: i, reason: collision with root package name */
    private final kt f8748i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8749j;

    /* renamed from: k, reason: collision with root package name */
    private final qv f8750k;

    /* renamed from: l, reason: collision with root package name */
    private final wu f8751l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f8752m;
    private boolean n;
    private final Object o;
    private final String p;
    private final int q;
    private boolean r;

    public rv(lt ltVar, kt ktVar) {
        super(ltVar);
        this.f8748i = ktVar;
        this.f8750k = new qv();
        this.f8751l = new wu();
        this.o = new Object();
        this.p = ltVar != null ? ltVar.zzn() : "";
        this.q = ltVar != null ? ltVar.zzp() : 0;
    }

    protected static final String y(String str) {
        String strValueOf = String.valueOf(xq.d(str));
        return strValueOf.length() != 0 ? "cache:".concat(strValueOf) : new String("cache:");
    }

    private final void z() {
        int iA = (int) this.f8750k.a();
        int iA2 = (int) this.f8751l.a(this.f8752m);
        int iPosition = this.f8752m.position();
        int iRound = Math.round(iA2 * (iPosition / iA));
        boolean z = iRound > 0;
        int iA3 = tu.A();
        int iB = tu.B();
        String str = this.f8747h;
        q(str, y(str), iPosition, iA, iRound, iA2, z, iA3, iB);
    }

    @Override // com.google.android.gms.internal.ads.e03
    public final /* bridge */ /* synthetic */ void g(pz2 pz2Var, rz2 rz2Var) {
        this.f8750k.b((tz2) pz2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a5, code lost:
    
        r26.r = true;
        s(r27, r11, (int) r26.f8751l.a(r26.f8752m));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:
    
        return true;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:? -> B:45:0x0143). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.lv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(java.lang.String r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rv.h(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.e03
    public final /* bridge */ /* synthetic */ void k(pz2 pz2Var, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void o() {
        this.f8749j = true;
    }

    public final String v() {
        return this.f8747h;
    }

    public final boolean w() {
        return this.r;
    }

    public final ByteBuffer x() {
        synchronized (this.o) {
            ByteBuffer byteBuffer = this.f8752m;
            if (byteBuffer != null && !this.n) {
                byteBuffer.flip();
                this.n = true;
            }
            this.f8749j = true;
        }
        return this.f8752m;
    }
}