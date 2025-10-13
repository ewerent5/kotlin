package k.c.e.m;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k.c.e.m.p;

/* compiled from: MapTileApproximater.java */
/* loaded from: classes3.dex */
public class j extends p {

    /* renamed from: e, reason: collision with root package name */
    private final List<p> f16628e;

    /* renamed from: f, reason: collision with root package name */
    private int f16629f;

    /* compiled from: MapTileApproximater.java */
    protected class a extends p.b {
        protected a() {
            super();
        }

        @Override // k.c.e.m.p.b
        public Drawable a(long j2) {
            Bitmap bitmapO = j.this.o(j2);
            if (bitmapO == null) {
                return null;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapO);
            k.c.e.b.b(bitmapDrawable, -3);
            return bitmapDrawable;
        }
    }

    public j() {
        this(k.c.b.a.a().C(), k.c.b.a.a().g());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:13:0x0027, B:18:0x0030, B:21:0x0036), top: B:30:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap q(android.graphics.drawable.BitmapDrawable r10, long r11, int r13) {
        /*
            r0 = 0
            if (r13 > 0) goto L4
            return r0
        L4:
            android.graphics.Bitmap r1 = r10.getBitmap()
            int r1 = r1.getWidth()
            android.graphics.Bitmap r2 = t(r1)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            boolean r4 = r10 instanceof k.c.e.k
            if (r4 == 0) goto L1d
            r5 = r10
            k.c.e.k r5 = (k.c.e.k) r5
            goto L1e
        L1d:
            r5 = r0
        L1e:
            if (r4 == 0) goto L23
            r5.c()
        L23:
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L30
            boolean r8 = r5.e()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L34
            goto L30
        L2e:
            r10 = move-exception
            goto L63
        L30:
            int r8 = r1 >> r13
            if (r8 != 0) goto L36
        L34:
            r6 = 0
            goto L5a
        L36:
            int r9 = k.c.f.m.c(r11)     // Catch: java.lang.Throwable -> L2e
            int r13 = r6 << r13
            int r9 = r9 % r13
            int r9 = r9 * r8
            int r11 = k.c.f.m.d(r11)     // Catch: java.lang.Throwable -> L2e
            int r11 = r11 % r13
            int r11 = r11 * r8
            android.graphics.Rect r12 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L2e
            int r13 = r9 + r8
            int r8 = r8 + r11
            r12.<init>(r9, r11, r13, r8)     // Catch: java.lang.Throwable -> L2e
            android.graphics.Rect r11 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L2e
            r11.<init>(r7, r7, r1, r1)     // Catch: java.lang.Throwable -> L2e
            android.graphics.Bitmap r10 = r10.getBitmap()     // Catch: java.lang.Throwable -> L2e
            r3.drawBitmap(r10, r12, r11, r0)     // Catch: java.lang.Throwable -> L2e
        L5a:
            if (r4 == 0) goto L5f
            r5.d()
        L5f:
            if (r6 != 0) goto L62
            return r0
        L62:
            return r2
        L63:
            if (r4 == 0) goto L68
            r5.d()
        L68:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k.c.e.m.j.q(android.graphics.drawable.BitmapDrawable, long, int):android.graphics.Bitmap");
    }

    public static Bitmap r(p pVar, long j2, int i2) {
        int iE;
        if (i2 <= 0 || (iE = k.c.f.m.e(j2) - i2) < pVar.e() || iE > pVar.d()) {
            return null;
        }
        try {
            Drawable drawableB = pVar.h().b(k.c.f.m.b(iE, k.c.f.m.c(j2) >> i2, k.c.f.m.d(j2) >> i2));
            if (drawableB instanceof BitmapDrawable) {
                return q((BitmapDrawable) drawableB, j2, i2);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private void s() {
        this.f16629f = 0;
        Iterator<p> it = this.f16628e.iterator();
        boolean z = true;
        while (it.hasNext()) {
            int iE = it.next().e();
            if (z) {
                this.f16629f = iE;
                z = false;
            } else {
                this.f16629f = Math.min(this.f16629f, iE);
            }
        }
    }

    public static Bitmap t(int i2) {
        Bitmap bitmapE = k.c.e.a.d().e(i2, i2);
        if (bitmapE == null) {
            return Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        }
        if (Build.VERSION.SDK_INT >= 12) {
            bitmapE.setHasAlpha(true);
        }
        bitmapE.eraseColor(0);
        return bitmapE;
    }

    @Override // k.c.e.m.p
    public void c() {
        super.c();
        this.f16628e.clear();
    }

    @Override // k.c.e.m.p
    public int d() {
        return k.c.f.t.r();
    }

    @Override // k.c.e.m.p
    public int e() {
        return this.f16629f;
    }

    @Override // k.c.e.m.p
    protected String f() {
        return "Offline Tile Approximation Provider";
    }

    @Override // k.c.e.m.p
    protected String g() {
        return "approximater";
    }

    @Override // k.c.e.m.p
    public boolean i() {
        return false;
    }

    @Override // k.c.e.m.p
    @Deprecated
    public void m(k.c.e.n.d dVar) {
    }

    public void n(p pVar) {
        this.f16628e.add(pVar);
        s();
    }

    public Bitmap o(long j2) {
        for (int i2 = 1; k.c.f.m.e(j2) - i2 >= 0; i2++) {
            Bitmap bitmapP = p(j2, i2);
            if (bitmapP != null) {
                return bitmapP;
            }
        }
        return null;
    }

    public Bitmap p(long j2, int i2) {
        Iterator<p> it = this.f16628e.iterator();
        while (it.hasNext()) {
            Bitmap bitmapR = r(it.next(), j2, i2);
            if (bitmapR != null) {
                return bitmapR;
            }
        }
        return null;
    }

    @Override // k.c.e.m.p
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public a h() {
        return new a();
    }

    public j(int i2, int i3) {
        super(i2, i3);
        this.f16628e = new CopyOnWriteArrayList();
    }
}