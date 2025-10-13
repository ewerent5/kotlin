package k.c.g.g;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import ch.qos.logback.classic.Level;
import java.util.List;
import k.c.g.g.b;
import k.c.g.g.f;

/* compiled from: ItemizedOverlayWithFocus.java */
@Deprecated
/* loaded from: classes3.dex */
public class d<Item extends f> extends b<Item> {
    private int A;
    private int B;
    protected int C;
    protected Paint D;
    protected Paint E;
    protected Paint F;
    protected Drawable G;
    protected int H;
    protected boolean I;
    private int J;
    private final Point K;
    private Context L;
    private String M;
    private final Rect N;
    private final int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public d(Context context, List<Item> list, b.d<Item> dVar) {
        this(list, dVar, context);
    }

    private void M() {
        int iApplyDimension = (int) TypedValue.applyDimension(1, this.z, this.L.getResources().getDisplayMetrics());
        this.J = iApplyDimension;
        this.B = iApplyDimension + 5;
        this.A = (int) (this.L.getResources().getDisplayMetrics().widthPixels * 0.8d);
        this.M = this.L.getResources().getString(k.c.d.b.a);
        this.D = new Paint();
        Paint paint = new Paint();
        this.E = paint;
        paint.setAntiAlias(true);
        this.E.setTextSize(this.J);
        Paint paint2 = new Paint();
        this.F = paint2;
        paint2.setTextSize(this.J);
        this.F.setFakeBoldText(true);
        this.F.setAntiAlias(true);
    }

    @Override // k.c.g.g.b
    protected boolean I(int i2, Item item, k.c.g.d dVar) {
        if (this.I) {
            this.H = i2;
            dVar.postInvalidate();
        }
        return this.u.b(i2, item);
    }

    public void N(int i2) {
        this.x = i2;
    }

    public void O(int i2) {
        this.w = i2;
    }

    public void P(int i2) {
        this.B = i2;
        M();
    }

    public void Q(int i2) {
        this.A = i2;
        M();
    }

    public void R(int i2) {
        this.y = i2;
    }

    public void S(boolean z) {
        this.I = z;
    }

    public void T(int i2) {
        this.C = i2;
    }

    public void U(int i2) {
        this.E.setColor(i2);
    }

    public void V() {
        this.H = Level.ALL_INT;
    }

    @Override // k.c.g.g.c, k.c.g.g.e
    public void c(Canvas canvas, k.c.g.f fVar) {
        List<Item> list;
        super.c(canvas, fVar);
        int i2 = this.H;
        if (i2 == Integer.MIN_VALUE || (list = this.t) == null) {
            return;
        }
        Item item = list.get(i2);
        Drawable drawableA = item.a(4);
        if (drawableA == null) {
            drawableA = this.G;
        }
        Drawable drawable = drawableA;
        fVar.J(item.c(), this.K);
        drawable.copyBounds(this.N);
        Rect rect = this.N;
        Point point = this.K;
        rect.offset(point.x, point.y);
        String strE = item.e() == null ? this.M : item.e();
        String strD = item.d() == null ? this.M : item.d();
        int length = strD.length();
        float[] fArr = new float[length];
        this.E.getTextWidths(strD, fArr);
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        int i4 = 0;
        int iMax = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < length) {
            if (!Character.isLetter(strD.charAt(i3))) {
                i6 = i3;
            }
            float f2 = fArr[i3];
            if (strD.charAt(i3) == '\n') {
                int i7 = i3 + 1;
                sb.append(strD.subSequence(i4, i7));
                i6 = i7;
                iMax = Math.max(iMax, i5);
                i5 = 0;
                i4 = i6;
            } else if (i5 + f2 <= this.A) {
                i5 = (int) (i5 + f2);
            } else {
                boolean z = i4 == i6;
                if (!z) {
                    i3 = i6;
                }
                sb.append(strD.subSequence(i4, i3));
                sb.append('\n');
                iMax = Math.max(iMax, i5);
                if (z) {
                    i4 = i3;
                    i6 = i4;
                    i5 = 0;
                    i3--;
                } else {
                    i4 = i3;
                    i6 = i4;
                    i5 = 0;
                    i5 = (int) (i5 + f2);
                }
            }
            i3++;
        }
        if (i3 != i4) {
            String strSubstring = strD.substring(i4, i3);
            iMax = Math.max(iMax, (int) this.E.measureText(strSubstring));
            sb.append(strSubstring);
        }
        String[] strArrSplit = sb.toString().split("\n");
        int iMin = Math.min(Math.max(iMax, (int) this.E.measureText(strE)), this.A);
        Rect rect2 = this.N;
        int iWidth = ((rect2.left - (iMin / 2)) - this.w) + (rect2.width() / 2);
        int i8 = this.w;
        int i9 = iMin + iWidth + (i8 * 2);
        int i10 = this.N.top;
        int length2 = ((i10 - this.y) - ((strArrSplit.length + 1) * this.B)) - (i8 * 2);
        if (fVar.x() != 0.0f) {
            canvas.save();
            float f3 = -fVar.x();
            Point point2 = this.K;
            canvas.rotate(f3, point2.x, point2.y);
        }
        this.D.setColor(-16777216);
        RectF rectF = new RectF(iWidth - 1, length2 - 1, i9 + 1, i10 + 1);
        int i11 = this.x;
        canvas.drawRoundRect(rectF, i11, i11, this.E);
        this.D.setColor(this.C);
        float f4 = iWidth;
        float f5 = i9;
        RectF rectF2 = new RectF(f4, length2, f5, i10);
        int i12 = this.x;
        canvas.drawRoundRect(rectF2, i12, i12, this.D);
        int i13 = this.w;
        int i14 = iWidth + i13;
        int i15 = i10 - i13;
        for (int length3 = strArrSplit.length - 1; length3 >= 0; length3--) {
            canvas.drawText(strArrSplit[length3].trim(), i14, i15, this.E);
            i15 -= this.B;
        }
        canvas.drawText(strE, i14, i15 - this.y, this.F);
        float f6 = i15;
        canvas.drawLine(f4, f6, f5, f6, this.E);
        drawable.setBounds(this.N);
        drawable.draw(canvas);
        Rect rect3 = this.N;
        Point point3 = this.K;
        rect3.offset(-point3.x, -point3.y);
        drawable.setBounds(this.N);
        if (fVar.x() != 0.0f) {
            canvas.restore();
        }
    }

    @Override // k.c.g.g.b, k.c.g.g.e
    public void h(k.c.g.d dVar) {
        super.h(dVar);
        this.L = null;
    }

    public d(List<Item> list, b.d<Item> dVar, Context context) {
        this(list, context.getResources().getDrawable(k.c.d.a.a), null, Level.ALL_INT, dVar, context);
    }

    public d(List<Item> list, Drawable drawable, Drawable drawable2, int i2, b.d<Item> dVar, Context context) {
        super(list, drawable, dVar, context);
        int iRgb = Color.rgb(101, 185, 74);
        this.v = iRgb;
        this.w = 3;
        this.x = 3;
        this.y = 2;
        this.z = 14;
        this.A = 600;
        this.B = 30;
        this.K = new Point();
        this.N = new Rect();
        this.L = context;
        if (drawable2 == null) {
            this.G = v(context.getResources().getDrawable(k.c.d.a.f16570b), f.a.BOTTOM_CENTER);
        } else {
            this.G = drawable2;
        }
        this.C = i2 == Integer.MIN_VALUE ? iRgb : i2;
        M();
        V();
    }
}