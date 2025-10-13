package k.c.g;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;

/* compiled from: CustomZoomButtonsDisplay.java */
/* loaded from: classes3.dex */
public class b {
    private final d a;

    /* renamed from: b, reason: collision with root package name */
    private final Point f16791b = new Point();

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f16792c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f16793d;

    /* renamed from: e, reason: collision with root package name */
    private Bitmap f16794e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f16795f;

    /* renamed from: g, reason: collision with root package name */
    private Paint f16796g;

    /* renamed from: h, reason: collision with root package name */
    private int f16797h;

    /* renamed from: i, reason: collision with root package name */
    private EnumC0217b f16798i;

    /* renamed from: j, reason: collision with root package name */
    private c f16799j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16800k;

    /* renamed from: l, reason: collision with root package name */
    private float f16801l;

    /* renamed from: m, reason: collision with root package name */
    private float f16802m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;

    /* compiled from: CustomZoomButtonsDisplay.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f16803b;

        static {
            int[] iArr = new int[c.values().length];
            f16803b = iArr;
            try {
                iArr[c.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16803b[c.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16803b[c.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC0217b.values().length];
            a = iArr2;
            try {
                iArr2[EnumC0217b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC0217b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[EnumC0217b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: CustomZoomButtonsDisplay.java */
    /* renamed from: k.c.g.b$b, reason: collision with other inner class name */
    public enum EnumC0217b {
        LEFT,
        CENTER,
        RIGHT
    }

    /* compiled from: CustomZoomButtonsDisplay.java */
    public enum c {
        TOP,
        CENTER,
        BOTTOM
    }

    public b(d dVar) {
        this.a = dVar;
        n(true, EnumC0217b.CENTER, c.BOTTOM);
        m(0.5f, 0.5f);
    }

    private Bitmap b(boolean z, boolean z2) {
        if (this.f16792c == null) {
            l(g(true, true), g(true, false), g(false, true), g(false, false));
        }
        return z ? z2 ? this.f16792c : this.f16794e : z2 ? this.f16793d : this.f16795f;
    }

    private float c(int i2) {
        float f2;
        int i3 = a.a[this.f16798i.ordinal()];
        if (i3 == 1) {
            return this.r;
        }
        if (i3 == 2) {
            float f3 = i2 - this.t;
            int i4 = this.f16797h;
            return (f3 - i4) - (this.f16800k ? (this.f16802m * i4) + i4 : 0.0f);
        }
        if (i3 != 3) {
            throw new IllegalArgumentException();
        }
        float f4 = i2 / 2.0f;
        if (this.f16800k) {
            float f5 = this.f16802m;
            int i5 = this.f16797h;
            f2 = ((f5 * i5) / 2.0f) + i5;
        } else {
            f2 = this.f16797h / 2.0f;
        }
        return f4 - f2;
    }

    private float d(int i2) {
        float f2;
        float f3;
        int i3 = a.f16803b[this.f16799j.ordinal()];
        if (i3 == 1) {
            return this.s;
        }
        if (i3 == 2) {
            float f4 = i2 - this.u;
            int i4 = this.f16797h;
            float f5 = f4 - i4;
            if (this.f16800k) {
                f2 = 0.0f;
            } else {
                f2 = i4 + (this.f16802m * i4);
            }
            return f5 - f2;
        }
        if (i3 != 3) {
            throw new IllegalArgumentException();
        }
        float f6 = i2 / 2.0f;
        if (this.f16800k) {
            f3 = this.f16797h / 2.0f;
        } else {
            float f7 = this.f16802m;
            int i5 = this.f16797h;
            f3 = ((f7 * i5) / 2.0f) + i5;
        }
        return f6 - f3;
    }

    private float f(boolean z, boolean z2) {
        int i2;
        float f2;
        float f3;
        if (z2) {
            float fC = c(this.a.getWidth());
            if (!this.f16800k || !z) {
                return fC;
            }
            i2 = this.f16797h;
            f2 = fC + i2;
            f3 = this.f16802m;
        } else {
            float fD = d(this.a.getHeight());
            if (this.f16800k || z) {
                return fD;
            }
            i2 = this.f16797h;
            f2 = fD + i2;
            f3 = this.f16802m;
        }
        return f2 + (f3 * i2);
    }

    private boolean h(int i2, int i3, boolean z) {
        return j(z, true, (float) i2) && j(z, false, (float) i3);
    }

    private boolean j(boolean z, boolean z2, float f2) {
        float f3 = f(z, z2);
        return f2 >= f3 && f2 <= f3 + ((float) this.f16797h);
    }

    private void k() {
        float f2 = this.f16801l * this.f16797h;
        this.r = this.n + f2;
        this.s = this.o + f2;
        this.t = this.p + f2;
        this.u = f2 + this.q;
    }

    public void a(Canvas canvas, float f2, boolean z, boolean z2) {
        Paint paint;
        if (f2 == 0.0f) {
            return;
        }
        if (f2 == 1.0f) {
            paint = null;
        } else {
            if (this.f16796g == null) {
                this.f16796g = new Paint();
            }
            this.f16796g.setAlpha((int) (f2 * 255.0f));
            paint = this.f16796g;
        }
        canvas.drawBitmap(b(true, z), f(true, true), f(true, false), paint);
        canvas.drawBitmap(b(false, z2), f(false, true), f(false, false), paint);
    }

    protected Bitmap e(boolean z) {
        return ((BitmapDrawable) this.a.getResources().getDrawable(z ? k.c.d.a.f16572d : k.c.d.a.f16573e)).getBitmap();
    }

    protected Bitmap g(boolean z, boolean z2) {
        Bitmap bitmapE = e(z);
        this.f16797h = bitmapE.getWidth();
        k();
        int i2 = this.f16797h;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColor(z2 ? -1 : -3355444);
        paint.setStyle(Paint.Style.FILL);
        int i3 = this.f16797h;
        canvas.drawRect(0.0f, 0.0f, i3 - 1, i3 - 1, paint);
        canvas.drawBitmap(bitmapE, 0.0f, 0.0f, (Paint) null);
        return bitmapCreateBitmap;
    }

    public boolean i(MotionEvent motionEvent, boolean z) {
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            return h((int) motionEvent.getX(), (int) motionEvent.getY(), z);
        }
        return false;
    }

    public void l(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4) {
        this.f16792c = bitmap;
        this.f16794e = bitmap2;
        this.f16793d = bitmap3;
        this.f16795f = bitmap4;
        this.f16797h = bitmap.getWidth();
        k();
    }

    public void m(float f2, float f3) {
        this.f16801l = f2;
        this.f16802m = f3;
        k();
    }

    public void n(boolean z, EnumC0217b enumC0217b, c cVar) {
        this.f16800k = z;
        this.f16798i = enumC0217b;
        this.f16799j = cVar;
    }
}