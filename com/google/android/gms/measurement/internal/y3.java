package com.google.android.gms.measurement.internal;

import j$.util.Spliterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class y3 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f11342e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11343f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Object f11344g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Object f11345h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ Object f11346i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ v3 f11347j;

    y3(v3 v3Var, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.f11347j = v3Var;
        this.f11342e = i2;
        this.f11343f = str;
        this.f11344g = obj;
        this.f11345h = obj2;
        this.f11346i = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i4 i4VarS = this.f11347j.a.s();
        if (!i4VarS.k()) {
            this.f11347j.v(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f11347j.f11285c == 0) {
            if (this.f11347j.i().x()) {
                this.f11347j.f11285c = 'C';
            } else {
                this.f11347j.f11285c = 'c';
            }
        }
        if (this.f11347j.f11286d < 0) {
            this.f11347j.f11286d = 33025L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.f11342e);
        char c2 = this.f11347j.f11285c;
        long j2 = this.f11347j.f11286d;
        String strU = v3.u(true, this.f11343f, this.f11344g, this.f11345h, this.f11346i);
        StringBuilder sb = new StringBuilder(String.valueOf(strU).length() + 24);
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c2);
        sb.append(j2);
        sb.append(":");
        sb.append(strU);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = this.f11343f.substring(0, Spliterator.IMMUTABLE);
        }
        i4VarS.f10925e.b(string, 1L);
    }
}