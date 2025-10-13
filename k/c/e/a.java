package k.c.e;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: BitmapPool.java */
/* loaded from: classes3.dex */
public class a {
    private static final a a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedList<Bitmap> f16575b = new LinkedList<>();

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f16576c = Executors.newFixedThreadPool(1, new k.c.e.m.c(1, a.class.getName()));

    /* compiled from: BitmapPool.java */
    /* renamed from: k.c.e.a$a, reason: collision with other inner class name */
    class RunnableC0212a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Drawable f16577e;

        RunnableC0212a(Drawable drawable) {
            this.f16577e = drawable;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.g(this.f16577e);
        }
    }

    private a() {
    }

    public static a d() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Drawable drawable) {
        Bitmap bitmap;
        if (drawable == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 10 && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
            bitmap.recycle();
        }
        if (drawable instanceof k) {
            f((k) drawable);
        }
    }

    public void b(BitmapFactory.Options options, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 11) {
            options.inBitmap = e(i2, i3);
            options.inSampleSize = 1;
            options.inMutable = true;
        }
    }

    public void c(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        this.f16576c.execute(new RunnableC0212a(drawable));
    }

    public Bitmap e(int i2, int i3) {
        synchronized (this.f16575b) {
            if (this.f16575b.isEmpty()) {
                return null;
            }
            Iterator<Bitmap> it = this.f16575b.iterator();
            while (it.hasNext()) {
                Bitmap next = it.next();
                if (next.isRecycled()) {
                    this.f16575b.remove(next);
                    return e(i2, i3);
                }
                if (next.getWidth() == i2 && next.getHeight() == i3) {
                    this.f16575b.remove(next);
                    return next;
                }
            }
            return null;
        }
    }

    public void f(k kVar) {
        Bitmap bitmapF = kVar.f();
        if (bitmapF == null || bitmapF.isRecycled() || !bitmapF.isMutable() || bitmapF.getConfig() == null) {
            if (bitmapF != null) {
                Log.d("OsmDroid", "Rejected bitmap from being added to BitmapPool.");
            }
        } else {
            synchronized (this.f16575b) {
                this.f16575b.addLast(bitmapF);
            }
        }
    }
}