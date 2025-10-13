package k.c.g.g;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import java.util.ArrayList;
import k.c.f.r;
import k.c.g.g.e;
import k.c.g.g.f;

/* compiled from: ItemizedOverlay.java */
/* loaded from: classes3.dex */
public abstract class c<Item extends f> extends e implements e.a {

    /* renamed from: g, reason: collision with root package name */
    protected final Drawable f16870g;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList<Item> f16871h;

    /* renamed from: i, reason: collision with root package name */
    private boolean[] f16872i;
    private Item o;
    private b q;

    /* renamed from: f, reason: collision with root package name */
    protected int f16869f = Integer.MAX_VALUE;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f16873j = new Rect();

    /* renamed from: k, reason: collision with root package name */
    private final Rect f16874k = new Rect();

    /* renamed from: l, reason: collision with root package name */
    private final Rect f16875l = new Rect();

    /* renamed from: m, reason: collision with root package name */
    private final Point f16876m = new Point();
    protected boolean n = true;
    private boolean p = false;
    private Rect r = new Rect();
    private Rect s = new Rect();

    /* compiled from: ItemizedOverlay.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.a.values().length];
            a = iArr;
            try {
                iArr[f.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.a.LEFT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.a.UPPER_LEFT_CORNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[f.a.LOWER_LEFT_CORNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[f.a.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[f.a.BOTTOM_CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[f.a.TOP_CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[f.a.RIGHT_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[f.a.UPPER_RIGHT_CORNER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[f.a.LOWER_RIGHT_CORNER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: ItemizedOverlay.java */
    public interface b {
        void a(c<?> cVar, f fVar);
    }

    public c(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("You must pass a default marker to ItemizedOverlay.");
        }
        this.f16870g = drawable;
        this.f16871h = new ArrayList<>();
    }

    protected boolean A(Item item, int i2, int i3, k.c.g.d dVar) {
        int i4 = 0;
        if (item == null) {
            return false;
        }
        dVar.getProjection().J(item.c(), this.f16876m);
        if (this.n && this.o == item) {
            i4 = 4;
        }
        Drawable drawableA = item.a(i4);
        if (drawableA == null) {
            drawableA = y(i4);
        }
        v(drawableA, item.b());
        drawableA.copyBounds(this.f16873j);
        Rect rect = this.f16873j;
        Point point = this.f16876m;
        rect.offset(point.x, point.y);
        Rect rect2 = this.f16873j;
        Point point2 = this.f16876m;
        r.a(rect2, point2.x, point2.y, -dVar.getMapOrientation(), this.f16875l);
        return this.f16875l.contains(i2, i3);
    }

    protected boolean B(Canvas canvas, Item item, Point point, k.c.g.f fVar) {
        int i2 = (this.n && this.o == item) ? 4 : 0;
        Drawable drawableY = item.a(i2) == null ? y(i2) : item.a(i2);
        v(drawableY, item.b());
        Point point2 = this.f16876m;
        int i3 = point2.x;
        int i4 = point2.y;
        drawableY.copyBounds(this.f16873j);
        this.f16874k.set(this.f16873j);
        this.f16873j.offset(i3, i4);
        r.a(this.f16873j, i3, i4, fVar.x(), this.f16875l);
        boolean zIntersects = Rect.intersects(this.f16875l, canvas.getClipBounds());
        if (zIntersects) {
            if (fVar.x() != 0.0f) {
                canvas.save();
                canvas.rotate(-fVar.x(), i3, i4);
            }
            drawableY.setBounds(this.f16873j);
            drawableY.draw(canvas);
            if (fVar.x() != 0.0f) {
                canvas.restore();
            }
            drawableY.setBounds(this.f16874k);
        }
        return zIntersects;
    }

    protected boolean C(int i2) {
        return false;
    }

    protected final void D() {
        int iE = E();
        this.f16871h.clear();
        this.f16871h.ensureCapacity(iE);
        for (int i2 = 0; i2 < iE; i2++) {
            this.f16871h.add(x(i2));
        }
        this.f16872i = null;
    }

    public abstract int E();

    @Override // k.c.g.g.e
    public void c(Canvas canvas, k.c.g.f fVar) {
        b bVar;
        if (this.p && (bVar = this.q) != null) {
            bVar.a(this, this.o);
        }
        this.p = false;
        int iMin = Math.min(this.f16871h.size(), this.f16869f);
        boolean[] zArr = this.f16872i;
        if (zArr == null || zArr.length != iMin) {
            this.f16872i = new boolean[iMin];
        }
        for (int i2 = iMin - 1; i2 >= 0; i2--) {
            f fVarZ = z(i2);
            if (fVarZ != null) {
                fVar.J(fVarZ.c(), this.f16876m);
                w(fVarZ, this.f16876m, this.r);
                this.f16872i[i2] = B(canvas, fVarZ, this.f16876m, fVar);
            }
        }
    }

    @Override // k.c.g.g.e
    public boolean r(MotionEvent motionEvent, k.c.g.d dVar) {
        int iE = E();
        int iRound = Math.round(motionEvent.getX());
        int iRound2 = Math.round(motionEvent.getY());
        for (int i2 = 0; i2 < iE; i2++) {
            if (A(z(i2), iRound, iRound2, dVar) && C(i2)) {
                return true;
            }
        }
        return super.r(motionEvent, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.graphics.drawable.Drawable v(android.graphics.drawable.Drawable r7, k.c.g.g.f.a r8) {
        /*
            r6 = this;
            if (r8 != 0) goto L4
            k.c.g.g.f$a r8 = k.c.g.g.f.a.BOTTOM_CENTER
        L4:
            int r0 = r7.getIntrinsicWidth()
            int r1 = r7.getIntrinsicHeight()
            int[] r2 = k.c.g.g.c.a.a
            int r3 = r8.ordinal()
            r3 = r2[r3]
            r4 = 0
            r5 = 2
            switch(r3) {
                case 5: goto L1d;
                case 6: goto L1d;
                case 7: goto L1d;
                case 8: goto L1b;
                case 9: goto L1b;
                case 10: goto L1b;
                default: goto L19;
            }
        L19:
            r3 = 0
            goto L1f
        L1b:
            int r3 = -r0
            goto L1f
        L1d:
            int r3 = -r0
            int r3 = r3 / r5
        L1f:
            int r8 = r8.ordinal()
            r8 = r2[r8]
            if (r8 == r5) goto L3b
            r2 = 8
            if (r8 == r2) goto L3b
            r2 = 10
            if (r8 == r2) goto L39
            r2 = 4
            if (r8 == r2) goto L39
            r2 = 5
            if (r8 == r2) goto L3b
            r2 = 6
            if (r8 == r2) goto L39
            goto L3e
        L39:
            int r4 = -r1
            goto L3e
        L3b:
            int r8 = -r1
            int r4 = r8 / 2
        L3e:
            int r0 = r0 + r3
            int r1 = r1 + r4
            r7.setBounds(r3, r4, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k.c.g.g.c.v(android.graphics.drawable.Drawable, k.c.g.g.f$a):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected Rect w(Item item, Point point, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        f.a aVarB = item.b();
        if (aVarB == null) {
            aVarB = f.a.BOTTOM_CENTER;
        }
        int i2 = (this.n && this.o == item) ? 4 : 0;
        Drawable drawableY = item.a(i2) == null ? y(i2) : item.a(i2);
        int intrinsicWidth = drawableY.getIntrinsicWidth();
        int intrinsicHeight = drawableY.getIntrinsicHeight();
        switch (a.a[aVarB.ordinal()]) {
            case 1:
                int i3 = point.x;
                int i4 = intrinsicWidth / 2;
                int i5 = point.y;
                int i6 = intrinsicHeight / 2;
                rect.set(i3 - i4, i5 - i6, i3 + i4, i5 + i6);
                return rect;
            case 2:
                int i7 = point.x;
                int i8 = point.y;
                int i9 = intrinsicHeight / 2;
                rect.set(i7, i8 - i9, intrinsicWidth + i7, i8 + i9);
                return rect;
            case 3:
                int i10 = point.x;
                int i11 = point.y;
                rect.set(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
                return rect;
            case 4:
                int i12 = point.x;
                int i13 = point.y;
                rect.set(i12, i13 - intrinsicHeight, intrinsicWidth + i12, i13);
                return rect;
            case 5:
                int i14 = point.x;
                int i15 = intrinsicWidth / 2;
                int i16 = point.y;
                int i17 = intrinsicHeight / 2;
                rect.set(i14 - i15, i16 - i17, i14 + i15, i16 + i17);
                return rect;
            case 6:
                int i18 = point.x;
                int i19 = intrinsicWidth / 2;
                int i20 = point.y;
                rect.set(i18 - i19, i20 - intrinsicHeight, i18 + i19, i20);
                return rect;
            case 7:
                int i21 = point.x;
                int i22 = intrinsicWidth / 2;
                int i23 = point.y;
                rect.set(i21 - i22, i23, i21 + i22, intrinsicHeight + i23);
                return rect;
            case 8:
                int i24 = point.x;
                int i25 = point.y;
                int i26 = intrinsicHeight / 2;
                rect.set(i24 - intrinsicWidth, i25 - i26, i24, i25 + i26);
                return rect;
            case 9:
                int i27 = point.x;
                int i28 = point.y;
                rect.set(i27 - intrinsicWidth, i28, i27, intrinsicHeight + i28);
                return rect;
            case 10:
                int i29 = point.x;
                int i30 = point.y;
                rect.set(i29 - intrinsicWidth, i30 - intrinsicHeight, i29, i30);
                return rect;
            default:
                return rect;
        }
    }

    protected abstract Item x(int i2);

    protected Drawable y(int i2) {
        f.h(this.f16870g, i2);
        return this.f16870g;
    }

    public final Item z(int i2) {
        try {
            return this.f16871h.get(i2);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }
}