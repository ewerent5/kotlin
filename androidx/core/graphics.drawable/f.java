package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: WrappedDrawableState.java */
/* loaded from: classes.dex */
final class f extends Drawable.ConstantState {
    int a;

    /* renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f927b;

    /* renamed from: c, reason: collision with root package name */
    ColorStateList f928c;

    /* renamed from: d, reason: collision with root package name */
    PorterDuff.Mode f929d;

    f(f fVar) {
        this.f928c = null;
        this.f929d = d.f919e;
        if (fVar != null) {
            this.a = fVar.a;
            this.f927b = fVar.f927b;
            this.f928c = fVar.f928c;
            this.f929d = fVar.f929d;
        }
    }

    boolean a() {
        return this.f927b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i2 = this.a;
        Drawable.ConstantState constantState = this.f927b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new e(this, resources) : new d(this, resources);
    }
}