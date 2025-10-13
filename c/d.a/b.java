package c.d.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import c.d.a.h;

/* compiled from: CardViewApi17Impl.java */
/* loaded from: classes.dex */
class b extends d {

    /* compiled from: CardViewApi17Impl.java */
    class a implements h.a {
        a() {
        }

        @Override // c.d.a.h.a
        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    b() {
    }

    @Override // c.d.a.d, c.d.a.f
    public void h() {
        h.f2690b = new a();
    }
}