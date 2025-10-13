package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class sn2 implements f50 {

    /* renamed from: e, reason: collision with root package name */
    private static final eo2 f8930e = eo2.b(sn2.class);

    /* renamed from: f, reason: collision with root package name */
    protected final String f8931f;

    /* renamed from: g, reason: collision with root package name */
    private g60 f8932g;

    /* renamed from: j, reason: collision with root package name */
    private ByteBuffer f8935j;

    /* renamed from: k, reason: collision with root package name */
    long f8936k;

    /* renamed from: m, reason: collision with root package name */
    xn2 f8938m;

    /* renamed from: l, reason: collision with root package name */
    long f8937l = -1;
    private ByteBuffer n = null;

    /* renamed from: i, reason: collision with root package name */
    boolean f8934i = true;

    /* renamed from: h, reason: collision with root package name */
    boolean f8933h = true;

    protected sn2(String str) {
        this.f8931f = str;
    }

    private final synchronized void a() {
        if (this.f8934i) {
            return;
        }
        try {
            eo2 eo2Var = f8930e;
            String str = this.f8931f;
            eo2Var.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.f8935j = this.f8938m.f(this.f8936k, this.f8937l);
            this.f8934i = true;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.f50
    public final void b(xn2 xn2Var, ByteBuffer byteBuffer, long j2, c20 c20Var) {
        this.f8936k = xn2Var.zzc();
        byteBuffer.remaining();
        this.f8937l = j2;
        this.f8938m = xn2Var;
        xn2Var.a(xn2Var.zzc() + j2);
        this.f8934i = false;
        this.f8933h = false;
        e();
    }

    @Override // com.google.android.gms.internal.ads.f50
    public final void c(g60 g60Var) {
        this.f8932g = g60Var;
    }

    protected abstract void d(ByteBuffer byteBuffer);

    public final synchronized void e() {
        a();
        eo2 eo2Var = f8930e;
        String str = this.f8931f;
        eo2Var.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.f8935j;
        if (byteBuffer != null) {
            this.f8933h = true;
            byteBuffer.rewind();
            d(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.n = byteBuffer.slice();
            }
            this.f8935j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.f50
    public final String zzb() {
        return this.f8931f;
    }
}