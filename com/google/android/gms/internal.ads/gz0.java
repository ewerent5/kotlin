package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.internal.b;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class gz0 implements b.a, b.InterfaceC0113b {
    protected final wr<InputStream> a = new wr<>();

    /* renamed from: b, reason: collision with root package name */
    protected final Object f6247b = new Object();

    /* renamed from: c, reason: collision with root package name */
    protected boolean f6248c = false;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f6249d = false;

    /* renamed from: e, reason: collision with root package name */
    protected ql f6250e;

    /* renamed from: f, reason: collision with root package name */
    protected al f6251f;

    @Override // com.google.android.gms.common.internal.b.a
    public final void R(int i2) {
        er.zzd("Cannot connect to remote service, fallback to local instance.");
    }

    public void U(com.google.android.gms.common.b bVar) {
        er.zzd("Disconnected from remote ad request service.");
        this.a.zzd(new uz0(1));
    }

    protected final void a() {
        synchronized (this.f6247b) {
            this.f6249d = true;
            if (this.f6251f.isConnected() || this.f6251f.isConnecting()) {
                this.f6251f.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}