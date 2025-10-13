package com.bumptech.glide.load.p.d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* compiled from: DrawableToBitmapConverter.java */
/* loaded from: classes.dex */
final class n {
    private static final com.bumptech.glide.load.n.a0.e a = new a();

    /* compiled from: DrawableToBitmapConverter.java */
    class a extends com.bumptech.glide.load.n.a0.f {
        a() {
        }

        @Override // com.bumptech.glide.load.n.a0.f, com.bumptech.glide.load.n.a0.e
        public void c(Bitmap bitmap) {
        }
    }

    static com.bumptech.glide.load.n.v<Bitmap> a(com.bumptech.glide.load.n.a0.e eVar, Drawable drawable, int i2, int i3) {
        Bitmap bitmapB;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmapB = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapB = null;
        } else {
            bitmapB = b(eVar, current, i2, i3);
            z = true;
        }
        if (!z) {
            eVar = a;
        }
        return e.f(bitmapB, eVar);
    }

    private static Bitmap b(com.bumptech.glide.load.n.a0.e eVar, Drawable drawable, int i2, int i3) {
        if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i3 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i2 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i3 = drawable.getIntrinsicHeight();
        }
        Lock lockF = z.f();
        lockF.lock();
        Bitmap bitmapD = eVar.d(i2, i3, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapD);
            drawable.setBounds(0, 0, i2, i3);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapD;
        } finally {
            lockF.unlock();
        }
    }
}