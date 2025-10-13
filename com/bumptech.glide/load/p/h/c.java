package com.bumptech.glide.load.p.h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.load.m;
import com.bumptech.glide.load.p.h.g;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: GifDrawable.java */
/* loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {

    /* renamed from: e, reason: collision with root package name */
    private final a f4034e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4035f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4036g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4037h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4038i;

    /* renamed from: j, reason: collision with root package name */
    private int f4039j;

    /* renamed from: k, reason: collision with root package name */
    private int f4040k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4041l;

    /* renamed from: m, reason: collision with root package name */
    private Paint f4042m;
    private Rect n;
    private List<c.t.a.a.b> o;

    /* compiled from: GifDrawable.java */
    static final class a extends Drawable.ConstantState {
        final g a;

        a(g gVar) {
            this.a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, com.bumptech.glide.n.a aVar, m<Bitmap> mVar, int i2, int i3, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.c(context), aVar, i2, i3, mVar, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.n == null) {
            this.n = new Rect();
        }
        return this.n;
    }

    private Paint h() {
        if (this.f4042m == null) {
            this.f4042m = new Paint(2);
        }
        return this.f4042m;
    }

    private void j() {
        List<c.t.a.a.b> list = this.o;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.o.get(i2).a(this);
            }
        }
    }

    private void l() {
        this.f4039j = 0;
    }

    private void n() {
        com.bumptech.glide.t.j.a(!this.f4037h, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f4034e.a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f4035f) {
                return;
            }
            this.f4035f = true;
            this.f4034e.a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f4035f = false;
        this.f4034e.a.s(this);
    }

    @Override // com.bumptech.glide.load.p.h.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f4039j++;
        }
        int i2 = this.f4040k;
        if (i2 == -1 || this.f4039j < i2) {
            return;
        }
        j();
        stop();
    }

    public ByteBuffer c() {
        return this.f4034e.a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f4037h) {
            return;
        }
        if (this.f4041l) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f4041l = false;
        }
        canvas.drawBitmap(this.f4034e.a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f4034e.a.e();
    }

    public int f() {
        return this.f4034e.a.f();
    }

    public int g() {
        return this.f4034e.a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f4034e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4034e.a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4034e.a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f4034e.a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f4035f;
    }

    public void k() {
        this.f4037h = true;
        this.f4034e.a.a();
    }

    public void m(m<Bitmap> mVar, Bitmap bitmap) {
        this.f4034e.a.o(mVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4041l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        h().setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        com.bumptech.glide.t.j.a(!this.f4037h, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f4038i = z;
        if (!z) {
            o();
        } else if (this.f4036g) {
            n();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f4036g = true;
        l();
        if (this.f4038i) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f4036g = false;
        o();
    }

    c(a aVar) {
        this.f4038i = true;
        this.f4040k = -1;
        this.f4034e = (a) com.bumptech.glide.t.j.d(aVar);
    }
}