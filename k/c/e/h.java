package k.c.e;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import k.c.f.m;
import k.c.f.q;
import k.c.f.r;
import k.c.f.s;
import k.c.f.t;

/* compiled from: MapTileProviderBase.java */
/* loaded from: classes3.dex */
public abstract class h implements k.c.e.c {

    /* renamed from: e, reason: collision with root package name */
    private static int f16598e = -3355444;

    /* renamed from: f, reason: collision with root package name */
    protected final e f16599f;

    /* renamed from: g, reason: collision with root package name */
    private final Collection<Handler> f16600g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f16601h;

    /* renamed from: i, reason: collision with root package name */
    protected Drawable f16602i;

    /* renamed from: j, reason: collision with root package name */
    private k.c.e.n.d f16603j;

    /* compiled from: MapTileProviderBase.java */
    private abstract class b extends s {

        /* renamed from: e, reason: collision with root package name */
        protected final HashMap<Long, Bitmap> f16604e;

        /* renamed from: f, reason: collision with root package name */
        protected int f16605f;

        /* renamed from: g, reason: collision with root package name */
        protected int f16606g;

        /* renamed from: h, reason: collision with root package name */
        protected int f16607h;

        /* renamed from: i, reason: collision with root package name */
        protected int f16608i;

        /* renamed from: j, reason: collision with root package name */
        protected Rect f16609j;

        /* renamed from: k, reason: collision with root package name */
        protected Rect f16610k;

        /* renamed from: l, reason: collision with root package name */
        protected Paint f16611l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f16612m;

        private b() {
            this.f16604e = new HashMap<>();
        }

        @Override // k.c.f.s
        public void a() {
            while (!this.f16604e.isEmpty()) {
                long jLongValue = this.f16604e.keySet().iterator().next().longValue();
                i(jLongValue, this.f16604e.remove(Long.valueOf(jLongValue)));
            }
        }

        @Override // k.c.f.s
        public void b(long j2, int i2, int i3) {
            if (this.f16612m && h.this.k(j2) == null) {
                try {
                    g(j2, i2, i3);
                } catch (OutOfMemoryError unused) {
                    Log.e("OsmDroid", "OutOfMemoryError rescaling cache");
                }
            }
        }

        @Override // k.c.f.s
        public void c() {
            super.c();
            int iAbs = Math.abs(this.f16767b - this.f16605f);
            this.f16607h = iAbs;
            this.f16608i = this.f16606g >> iAbs;
            this.f16612m = iAbs != 0;
        }

        protected abstract void g(long j2, int i2, int i3);

        public void h(double d2, r rVar, double d3, int i2) {
            this.f16609j = new Rect();
            this.f16610k = new Rect();
            this.f16611l = new Paint();
            this.f16605f = t.k(d3);
            this.f16606g = i2;
            d(d2, rVar);
        }

        protected void i(long j2, Bitmap bitmap) {
            h.this.q(j2, new k(bitmap), -3);
            if (k.c.b.a.a().c()) {
                Log.d("OsmDroid", "Created scaled tile: " + m.h(j2));
                this.f16611l.setTextSize(40.0f);
                new Canvas(bitmap).drawText("scaled", 50.0f, 50.0f, this.f16611l);
            }
        }
    }

    /* compiled from: MapTileProviderBase.java */
    private class c extends b {
        private c() {
            super();
        }

        @Override // k.c.e.h.b
        public void g(long j2, int i2, int i3) {
            Bitmap bitmapQ;
            Drawable drawableE = h.this.f16599f.e(m.b(this.f16605f, m.c(j2) >> this.f16607h, m.d(j2) >> this.f16607h));
            if (!(drawableE instanceof BitmapDrawable) || (bitmapQ = k.c.e.m.j.q((BitmapDrawable) drawableE, j2, this.f16607h)) == null) {
                return;
            }
            this.f16604e.put(Long.valueOf(j2), bitmapQ);
        }
    }

    /* compiled from: MapTileProviderBase.java */
    private class d extends b {
        private d() {
            super();
        }

        @Override // k.c.e.h.b
        protected void g(long j2, int i2, int i3) {
            Bitmap bitmap;
            if (this.f16607h >= 4) {
                return;
            }
            int iC = m.c(j2) << this.f16607h;
            int iD = m.d(j2);
            int i4 = this.f16607h;
            int i5 = iD << i4;
            int i6 = 1 << i4;
            Bitmap bitmapT = null;
            Canvas canvas = null;
            for (int i7 = 0; i7 < i6; i7++) {
                for (int i8 = 0; i8 < i6; i8++) {
                    Drawable drawableE = h.this.f16599f.e(m.b(this.f16605f, iC + i7, i5 + i8));
                    if ((drawableE instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawableE).getBitmap()) != null) {
                        if (bitmapT == null) {
                            bitmapT = k.c.e.m.j.t(this.f16606g);
                            canvas = new Canvas(bitmapT);
                            canvas.drawColor(h.f16598e);
                        }
                        Rect rect = this.f16610k;
                        int i9 = this.f16608i;
                        rect.set(i7 * i9, i8 * i9, (i7 + 1) * i9, i9 * (i8 + 1));
                        canvas.drawBitmap(bitmap, (Rect) null, this.f16610k, (Paint) null);
                    }
                }
            }
            if (bitmapT != null) {
                this.f16604e.put(Long.valueOf(j2), bitmapT);
            }
        }
    }

    public h(k.c.e.n.d dVar) {
        this(dVar, null);
    }

    private void s(int i2) {
        for (int i3 = 0; i3 < 3 && !t(i2); i3++) {
        }
    }

    private boolean t(int i2) {
        for (Handler handler : this.f16600g) {
            try {
                if (handler != null) {
                    handler.sendEmptyMessage(i2);
                }
            } catch (ConcurrentModificationException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // k.c.e.c
    public void a(j jVar) {
        if (this.f16602i != null) {
            q(jVar.b(), this.f16602i, -4);
            s(0);
        } else {
            s(1);
        }
        if (k.c.b.a.a().l()) {
            Log.d("OsmDroid", "MapTileProviderBase.mapTileRequestFailed(): " + m.h(jVar.b()));
        }
    }

    @Override // k.c.e.c
    public void c(j jVar, Drawable drawable) {
        q(jVar.b(), drawable, k.c.e.b.a(drawable));
        s(0);
        if (k.c.b.a.a().l()) {
            Log.d("OsmDroid", "MapTileProviderBase.mapTileRequestExpiredTile(): " + m.h(jVar.b()));
        }
    }

    @Override // k.c.e.c
    public void d(j jVar, Drawable drawable) {
        q(jVar.b(), drawable, -1);
        s(0);
        if (k.c.b.a.a().l()) {
            Log.d("OsmDroid", "MapTileProviderBase.mapTileRequestCompleted(): " + m.h(jVar.b()));
        }
    }

    public void g() {
        this.f16599f.a();
    }

    public e h() {
        return new e();
    }

    public void i() {
        Bitmap bitmap;
        g();
        Drawable drawable = this.f16602i;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT < 9 && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
                bitmap.recycle();
            }
            if (this.f16602i instanceof k) {
                k.c.e.a.d().f((k) this.f16602i);
            }
        }
        this.f16602i = null;
        g();
    }

    public void j(int i2) {
        this.f16599f.b(i2);
    }

    public abstract Drawable k(long j2);

    public abstract int l();

    public abstract int m();

    public e n() {
        return this.f16599f;
    }

    public Collection<Handler> o() {
        return this.f16600g;
    }

    public k.c.e.n.d p() {
        return this.f16603j;
    }

    protected void q(long j2, Drawable drawable, int i2) {
        if (drawable == null) {
            return;
        }
        Drawable drawableE = this.f16599f.e(j2);
        if (drawableE == null || k.c.e.b.a(drawableE) <= i2) {
            k.c.e.b.b(drawable, i2);
            this.f16599f.m(j2, drawable);
        }
    }

    public void r(k.c.g.f fVar, double d2, double d3, Rect rect) {
        if (t.k(d2) == t.k(d3)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (k.c.b.a.a().l()) {
            Log.i("OsmDroid", "rescale tile cache from " + d3 + " to " + d2);
        }
        q qVarI = fVar.I(rect.left, rect.top, null);
        q qVarI2 = fVar.I(rect.right, rect.bottom, null);
        (d2 > d3 ? new c() : new d()).h(d2, new r(qVarI.a, qVarI.f16763b, qVarI2.a, qVarI2.f16763b), d3, p().a());
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (k.c.b.a.a().l()) {
            Log.i("OsmDroid", "Finished rescale in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms");
        }
    }

    public void u(k.c.e.n.d dVar) {
        this.f16603j = dVar;
        g();
    }

    public void v(boolean z) {
        this.f16601h = z;
    }

    public boolean w() {
        return this.f16601h;
    }

    public h(k.c.e.n.d dVar, Handler handler) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f16600g = linkedHashSet;
        this.f16601h = true;
        this.f16602i = null;
        this.f16599f = h();
        linkedHashSet.add(handler);
        this.f16603j = dVar;
    }
}