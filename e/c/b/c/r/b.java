package e.c.b.c.r;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import e.c.b.c.r.d;

/* compiled from: CircularRevealFrameLayout.java */
/* loaded from: classes.dex */
public class b extends FrameLayout implements d {

    /* renamed from: e, reason: collision with root package name */
    private final c f15304e;

    @Override // e.c.b.c.r.d
    public void a() {
        throw null;
    }

    @Override // e.c.b.c.r.d
    public void b() {
        throw null;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        if (this.f15304e != null) {
            throw null;
        }
        super.draw(canvas);
    }

    public Drawable getCircularRevealOverlayDrawable() {
        throw null;
    }

    @Override // e.c.b.c.r.d
    public int getCircularRevealScrimColor() {
        throw null;
    }

    @Override // e.c.b.c.r.d
    public d.e getRevealInfo() {
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        if (this.f15304e == null) {
            return super.isOpaque();
        }
        throw null;
    }

    @Override // e.c.b.c.r.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        throw null;
    }

    @Override // e.c.b.c.r.d
    public void setCircularRevealScrimColor(int i2) {
        throw null;
    }

    @Override // e.c.b.c.r.d
    public void setRevealInfo(d.e eVar) {
        throw null;
    }
}