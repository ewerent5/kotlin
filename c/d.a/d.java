package c.d.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import c.d.a.h;

/* compiled from: CardViewBaseImpl.java */
/* loaded from: classes.dex */
class d implements f {
    final RectF a = new RectF();

    /* compiled from: CardViewBaseImpl.java */
    class a implements h.a {
        a() {
        }

        @Override // c.d.a.h.a
        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            float f3 = 2.0f * f2;
            float fWidth = (rectF.width() - f3) - 1.0f;
            float fHeight = (rectF.height() - f3) - 1.0f;
            if (f2 >= 1.0f) {
                float f4 = f2 + 0.5f;
                float f5 = -f4;
                d.this.a.set(f5, f5, f4, f4);
                int iSave = canvas.save();
                canvas.translate(rectF.left + f4, rectF.top + f4);
                canvas.drawArc(d.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(fHeight, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(iSave);
                float f6 = (rectF.left + f4) - 1.0f;
                float f7 = rectF.top;
                canvas.drawRect(f6, f7, (rectF.right - f4) + 1.0f, f7 + f4, paint);
                float f8 = (rectF.left + f4) - 1.0f;
                float f9 = rectF.bottom;
                canvas.drawRect(f8, f9 - f4, (rectF.right - f4) + 1.0f, f9, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f2, rectF.right, rectF.bottom - f2, paint);
        }
    }

    d() {
    }

    private h n(e eVar) {
        return (h) eVar.e();
    }

    @Override // c.d.a.f
    public void a(e eVar, float f2) {
        n(eVar).p(f2);
        o(eVar);
    }

    @Override // c.d.a.f
    public float b(e eVar) {
        return n(eVar).l();
    }

    @Override // c.d.a.f
    public float c(e eVar) {
        return n(eVar).g();
    }

    @Override // c.d.a.f
    public void d(e eVar) {
    }

    @Override // c.d.a.f
    public void e(e eVar, float f2) {
        n(eVar).r(f2);
    }

    @Override // c.d.a.f
    public float f(e eVar) {
        return n(eVar).i();
    }

    @Override // c.d.a.f
    public ColorStateList g(e eVar) {
        return n(eVar).f();
    }

    @Override // c.d.a.f
    public void h() {
        h.f2690b = new a();
    }

    @Override // c.d.a.f
    public float i(e eVar) {
        return n(eVar).j();
    }

    @Override // c.d.a.f
    public float j(e eVar) {
        return n(eVar).k();
    }

    @Override // c.d.a.f
    public void k(e eVar) {
        n(eVar).m(eVar.c());
        o(eVar);
    }

    @Override // c.d.a.f
    public void l(e eVar, ColorStateList colorStateList) {
        n(eVar).o(colorStateList);
    }

    @Override // c.d.a.f
    public void m(e eVar, float f2) {
        n(eVar).q(f2);
        o(eVar);
    }

    public void o(e eVar) {
        Rect rect = new Rect();
        n(eVar).h(rect);
        eVar.b((int) Math.ceil(j(eVar)), (int) Math.ceil(i(eVar)));
        eVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}