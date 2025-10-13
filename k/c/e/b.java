package k.c.e;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: ExpirableBitmapDrawable.java */
/* loaded from: classes3.dex */
public class b extends BitmapDrawable {
    private static final int[] a = {-2, -3, -4};

    /* renamed from: b, reason: collision with root package name */
    private int[] f16579b;

    public b(Bitmap bitmap) {
        super(bitmap);
        this.f16579b = new int[0];
    }

    public static int a(Drawable drawable) {
        for (int i2 : drawable.getState()) {
            for (int i3 : a) {
                if (i2 == i3) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static void b(Drawable drawable, int i2) {
        drawable.setState(new int[]{i2});
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f16579b;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f16579b.length > 0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        this.f16579b = iArr;
        return true;
    }
}