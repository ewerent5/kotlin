package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: AppCompatImageButton.java */
/* loaded from: classes.dex */
public class m extends ImageButton implements c.h.l.s, androidx.core.widget.l {

    /* renamed from: e, reason: collision with root package name */
    private final e f511e;

    /* renamed from: f, reason: collision with root package name */
    private final n f512f;

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.B);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f511e;
        if (eVar != null) {
            eVar.b();
        }
        n nVar = this.f512f;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // c.h.l.s
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f511e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // c.h.l.s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f511e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.l
    public ColorStateList getSupportImageTintList() {
        n nVar = this.f512f;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.l
    public PorterDuff.Mode getSupportImageTintMode() {
        n nVar = this.f512f;
        if (nVar != null) {
            return nVar.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f512f.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f511e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f511e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.f512f;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        n nVar = this.f512f;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        this.f512f.g(i2);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.f512f;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // c.h.l.s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f511e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // c.h.l.s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f511e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.f512f;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.f512f;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    public m(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.f511e = eVar;
        eVar.e(attributeSet, i2);
        n nVar = new n(this);
        this.f512f = nVar;
        nVar.f(attributeSet, i2);
    }
}