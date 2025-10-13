package e.c.b.c.b0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: ShadowRenderer.java */
/* loaded from: classes.dex */
public class a {
    private static final int[] a = new int[3];

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f15083b = {0.0f, 0.5f, 1.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f15084c = new int[4];

    /* renamed from: d, reason: collision with root package name */
    private static final float[] f15085d = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: e, reason: collision with root package name */
    private final Paint f15086e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f15087f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f15088g;

    /* renamed from: h, reason: collision with root package name */
    private int f15089h;

    /* renamed from: i, reason: collision with root package name */
    private int f15090i;

    /* renamed from: j, reason: collision with root package name */
    private int f15091j;

    /* renamed from: k, reason: collision with root package name */
    private final Path f15092k;

    /* renamed from: l, reason: collision with root package name */
    private Paint f15093l;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f2, float f3) {
        boolean z = f3 < 0.0f;
        Path path = this.f15092k;
        if (z) {
            int[] iArr = f15084c;
            iArr[0] = 0;
            iArr[1] = this.f15091j;
            iArr[2] = this.f15090i;
            iArr[3] = this.f15089h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i2;
            rectF.inset(f4, f4);
            int[] iArr2 = f15084c;
            iArr2[0] = 0;
            iArr2[1] = this.f15089h;
            iArr2[2] = this.f15090i;
            iArr2[3] = this.f15091j;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f5 = 1.0f - (i2 / fWidth);
        float[] fArr = f15085d;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        this.f15087f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f15084c, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f15093l);
        }
        canvas.drawArc(rectF, f2, f3, true, this.f15087f);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = a;
        iArr[0] = this.f15091j;
        iArr[1] = this.f15090i;
        iArr[2] = this.f15089h;
        Paint paint = this.f15088g;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, f15083b, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f15088g);
        canvas.restore();
    }

    public Paint c() {
        return this.f15086e;
    }

    public void d(int i2) {
        this.f15089h = c.h.d.a.d(i2, 68);
        this.f15090i = c.h.d.a.d(i2, 20);
        this.f15091j = c.h.d.a.d(i2, 0);
        this.f15086e.setColor(this.f15089h);
    }

    public a(int i2) {
        this.f15092k = new Path();
        this.f15093l = new Paint();
        this.f15086e = new Paint();
        d(i2);
        this.f15093l.setColor(0);
        Paint paint = new Paint(4);
        this.f15087f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f15088g = new Paint(paint);
    }
}