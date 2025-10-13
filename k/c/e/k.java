package k.c.e;

import android.graphics.Bitmap;

/* compiled from: ReusableBitmapDrawable.java */
/* loaded from: classes3.dex */
public class k extends b {

    /* renamed from: c, reason: collision with root package name */
    private boolean f16617c;

    /* renamed from: d, reason: collision with root package name */
    private int f16618d;

    public k(Bitmap bitmap) {
        super(bitmap);
        this.f16617c = false;
        this.f16618d = 0;
    }

    public void c() {
        synchronized (this) {
            this.f16618d++;
        }
    }

    public void d() {
        synchronized (this) {
            int i2 = this.f16618d - 1;
            this.f16618d = i2;
            if (i2 < 0) {
                throw new IllegalStateException("Unbalanced endUsingDrawable() called.");
            }
        }
    }

    public boolean e() {
        boolean z;
        synchronized (this) {
            z = !this.f16617c;
        }
        return z;
    }

    public Bitmap f() {
        synchronized (this) {
            if (this.f16618d != 0) {
                return null;
            }
            this.f16617c = true;
            return getBitmap();
        }
    }
}