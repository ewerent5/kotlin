package com.google.android.gms.common.internal;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public abstract class m0<TListener> {
    private TListener a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4707b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f4708c;

    public m0(b bVar, TListener tlistener) {
        this.f4708c = bVar;
        this.a = tlistener;
    }

    protected abstract void a();

    protected abstract void b(TListener tlistener);

    public final void c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.a;
            if (this.f4707b) {
                String strValueOf = String.valueOf(this);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                sb.append("Callback proxy ");
                sb.append(strValueOf);
                sb.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb.toString());
            }
        }
        if (tlistener != null) {
            try {
                b(tlistener);
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        synchronized (this) {
            this.f4707b = true;
        }
        d();
    }

    public final void d() {
        e();
        synchronized (this.f4708c.zzt) {
            this.f4708c.zzt.remove(this);
        }
    }

    public final void e() {
        synchronized (this) {
            this.a = null;
        }
    }
}