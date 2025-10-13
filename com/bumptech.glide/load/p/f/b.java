package com.bumptech.glide.load.p.f;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.n.r;
import com.bumptech.glide.load.n.v;
import com.bumptech.glide.t.j;

/* compiled from: DrawableResource.java */
/* loaded from: classes.dex */
public abstract class b<T extends Drawable> implements v<T>, r {

    /* renamed from: e, reason: collision with root package name */
    protected final T f4026e;

    public b(T t) {
        this.f4026e = (T) j.d(t);
    }

    @Override // com.bumptech.glide.load.n.r
    public void a() {
        T t = this.f4026e;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof com.bumptech.glide.load.p.h.c) {
            ((com.bumptech.glide.load.p.h.c) t).e().prepareToDraw();
        }
    }

    @Override // com.bumptech.glide.load.n.v
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f4026e.getConstantState();
        return constantState == null ? this.f4026e : (T) constantState.newDrawable();
    }
}