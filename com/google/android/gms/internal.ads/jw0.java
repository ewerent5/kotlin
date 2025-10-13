package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class jw0 implements Runnable {

    /* renamed from: e */
    private final qw0 f6865e;

    /* renamed from: f */
    private final Object f6866f;

    /* renamed from: g */
    private final wr f6867g;

    /* renamed from: h */
    private final String f6868h;

    /* renamed from: i */
    private final long f6869i;

    jw0(qw0 qw0Var, Object obj, wr wrVar, String str, long j2) {
        this.f6865e = qw0Var;
        this.f6866f = obj;
        this.f6867g = wrVar;
        this.f6868h = str;
        this.f6869i = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6865e.h(this.f6866f, this.f6867g, this.f6868h, this.f6869i);
    }
}