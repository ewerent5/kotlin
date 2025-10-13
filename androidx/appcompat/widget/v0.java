package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources.java */
/* loaded from: classes.dex */
class v0 extends n0 {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f589b;

    public v0(Context context, Resources resources) {
        super(resources);
        this.f589b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.n0, android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Drawable drawable = super.getDrawable(i2);
        Context context = this.f589b.get();
        if (drawable != null && context != null) {
            m0.h().x(context, i2, drawable);
        }
        return drawable;
    }
}