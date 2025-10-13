package com.bumptech.glide.load.p.h;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import com.bumptech.glide.load.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GifFrameLoader.java */
/* loaded from: classes.dex */
class g {
    private final com.bumptech.glide.n.a a;

    /* renamed from: b */
    private final Handler f4044b;

    /* renamed from: c */
    private final List<b> f4045c;

    /* renamed from: d */
    final k f4046d;

    /* renamed from: e */
    private final com.bumptech.glide.load.n.a0.e f4047e;

    /* renamed from: f */
    private boolean f4048f;

    /* renamed from: g */
    private boolean f4049g;

    /* renamed from: h */
    private boolean f4050h;

    /* renamed from: i */
    private com.bumptech.glide.j<Bitmap> f4051i;

    /* renamed from: j */
    private a f4052j;

    /* renamed from: k */
    private boolean f4053k;

    /* renamed from: l */
    private a f4054l;

    /* renamed from: m */
    private Bitmap f4055m;
    private m<Bitmap> n;
    private a o;
    private d p;
    private int q;
    private int r;
    private int s;

    /* compiled from: GifFrameLoader.java */
    static class a extends com.bumptech.glide.r.j.c<Bitmap> {

        /* renamed from: h */
        private final Handler f4056h;

        /* renamed from: i */
        final int f4057i;

        /* renamed from: j */
        private final long f4058j;

        /* renamed from: k */
        private Bitmap f4059k;

        a(Handler handler, int i2, long j2) {
            this.f4056h = handler;
            this.f4057i = i2;
            this.f4058j = j2;
        }

        @Override // com.bumptech.glide.r.j.h
        public void g(Drawable drawable) {
            this.f4059k = null;
        }

        Bitmap j() {
            return this.f4059k;
        }

        @Override // com.bumptech.glide.r.j.h
        /* renamed from: k */
        public void b(Bitmap bitmap, com.bumptech.glide.r.k.b<? super Bitmap> bVar) {
            this.f4059k = bitmap;
            this.f4056h.sendMessageAtTime(this.f4056h.obtainMessage(1, this), this.f4058j);
        }
    }

    /* compiled from: GifFrameLoader.java */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                g.this.m((a) message.obj);
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            g.this.f4046d.n((a) message.obj);
            return false;
        }
    }

    /* compiled from: GifFrameLoader.java */
    interface d {
        void a();
    }

    g(com.bumptech.glide.b bVar, com.bumptech.glide.n.a aVar, int i2, int i3, m<Bitmap> mVar, Bitmap bitmap) {
        this(bVar.f(), com.bumptech.glide.b.t(bVar.h()), aVar, null, i(com.bumptech.glide.b.t(bVar.h()), i2, i3), mVar, bitmap);
    }

    private static com.bumptech.glide.load.g g() {
        return new com.bumptech.glide.s.b(Double.valueOf(Math.random()));
    }

    private static com.bumptech.glide.j<Bitmap> i(k kVar, int i2, int i3) {
        return kVar.k().a(com.bumptech.glide.r.f.h0(com.bumptech.glide.load.n.j.f3776b).f0(true).Z(true).R(i2, i3));
    }

    private void l() {
        if (!this.f4048f || this.f4049g) {
            return;
        }
        if (this.f4050h) {
            com.bumptech.glide.t.j.a(this.o == null, "Pending target must be null when starting from the first frame");
            this.a.g();
            this.f4050h = false;
        }
        a aVar = this.o;
        if (aVar != null) {
            this.o = null;
            m(aVar);
            return;
        }
        this.f4049g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + this.a.d();
        this.a.b();
        this.f4054l = new a(this.f4044b, this.a.h(), jUptimeMillis);
        this.f4051i.a(com.bumptech.glide.r.f.i0(g())).t0(this.a).o0(this.f4054l);
    }

    private void n() {
        Bitmap bitmap = this.f4055m;
        if (bitmap != null) {
            this.f4047e.c(bitmap);
            this.f4055m = null;
        }
    }

    private void p() {
        if (this.f4048f) {
            return;
        }
        this.f4048f = true;
        this.f4053k = false;
        l();
    }

    private void q() {
        this.f4048f = false;
    }

    void a() {
        this.f4045c.clear();
        n();
        q();
        a aVar = this.f4052j;
        if (aVar != null) {
            this.f4046d.n(aVar);
            this.f4052j = null;
        }
        a aVar2 = this.f4054l;
        if (aVar2 != null) {
            this.f4046d.n(aVar2);
            this.f4054l = null;
        }
        a aVar3 = this.o;
        if (aVar3 != null) {
            this.f4046d.n(aVar3);
            this.o = null;
        }
        this.a.clear();
        this.f4053k = true;
    }

    ByteBuffer b() {
        return this.a.f().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f4052j;
        return aVar != null ? aVar.j() : this.f4055m;
    }

    int d() {
        a aVar = this.f4052j;
        if (aVar != null) {
            return aVar.f4057i;
        }
        return -1;
    }

    Bitmap e() {
        return this.f4055m;
    }

    int f() {
        return this.a.c();
    }

    int h() {
        return this.s;
    }

    int j() {
        return this.a.i() + this.q;
    }

    int k() {
        return this.r;
    }

    void m(a aVar) {
        d dVar = this.p;
        if (dVar != null) {
            dVar.a();
        }
        this.f4049g = false;
        if (this.f4053k) {
            this.f4044b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f4048f) {
            if (this.f4050h) {
                this.f4044b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.o = aVar;
                return;
            }
        }
        if (aVar.j() != null) {
            n();
            a aVar2 = this.f4052j;
            this.f4052j = aVar;
            for (int size = this.f4045c.size() - 1; size >= 0; size--) {
                this.f4045c.get(size).a();
            }
            if (aVar2 != null) {
                this.f4044b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    void o(m<Bitmap> mVar, Bitmap bitmap) {
        this.n = (m) com.bumptech.glide.t.j.d(mVar);
        this.f4055m = (Bitmap) com.bumptech.glide.t.j.d(bitmap);
        this.f4051i = this.f4051i.a(new com.bumptech.glide.r.f().a0(mVar));
        this.q = com.bumptech.glide.t.k.g(bitmap);
        this.r = bitmap.getWidth();
        this.s = bitmap.getHeight();
    }

    void r(b bVar) {
        if (this.f4053k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f4045c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f4045c.isEmpty();
        this.f4045c.add(bVar);
        if (zIsEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.f4045c.remove(bVar);
        if (this.f4045c.isEmpty()) {
            q();
        }
    }

    g(com.bumptech.glide.load.n.a0.e eVar, k kVar, com.bumptech.glide.n.a aVar, Handler handler, com.bumptech.glide.j<Bitmap> jVar, m<Bitmap> mVar, Bitmap bitmap) {
        this.f4045c = new ArrayList();
        this.f4046d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f4047e = eVar;
        this.f4044b = handler;
        this.f4051i = jVar;
        this.a = aVar;
        o(mVar, bitmap);
    }
}