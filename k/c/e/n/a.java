package k.c.e.n;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import k.c.e.k;
import k.c.f.m;

/* compiled from: BitmapTileSourceBase.java */
/* loaded from: classes3.dex */
public abstract class a implements d {
    private static int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16679b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16680c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16681d;

    /* renamed from: e, reason: collision with root package name */
    protected String f16682e;

    /* renamed from: f, reason: collision with root package name */
    protected String f16683f;

    /* renamed from: g, reason: collision with root package name */
    protected final String f16684g;

    /* renamed from: h, reason: collision with root package name */
    protected final Random f16685h = new Random();

    /* renamed from: i, reason: collision with root package name */
    private final int f16686i;

    /* compiled from: BitmapTileSourceBase.java */
    /* renamed from: k.c.e.n.a$a, reason: collision with other inner class name */
    public static final class C0213a extends Exception {
        public C0213a(Throwable th) {
            super(th);
        }
    }

    public a(String str, int i2, int i3, int i4, String str2, String str3) {
        int i5 = a;
        a = i5 + 1;
        this.f16681d = i5;
        this.f16682e = str;
        this.f16679b = i2;
        this.f16680c = i3;
        this.f16686i = i4;
        this.f16684g = str2;
        this.f16683f = str3;
    }

    @Override // k.c.e.n.d
    public int a() {
        return this.f16686i;
    }

    @Override // k.c.e.n.d
    public String b(long j2) {
        return i() + '/' + m.e(j2) + '/' + m.c(j2) + '/' + m.d(j2) + h();
    }

    @Override // k.c.e.n.d
    public int c() {
        return this.f16679b;
    }

    @Override // k.c.e.n.d
    public int d() {
        return this.f16680c;
    }

    @Override // k.c.e.n.d
    public Drawable e(InputStream inputStream) throws C0213a, IOException {
        try {
            int i2 = this.f16686i;
            if (inputStream.markSupported()) {
                inputStream.mark(1048576);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream, null, options);
                i2 = options.outHeight;
                inputStream.reset();
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            k.c.e.a.d().b(options2, i2, i2);
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options2);
            if (bitmapDecodeStream != null) {
                return new k(bitmapDecodeStream);
            }
        } catch (Exception e2) {
            Log.w("OsmDroid", "#547 Error loading bitmap" + i(), e2);
        } catch (OutOfMemoryError e3) {
            Log.e("OsmDroid", "OutOfMemoryError loading bitmap");
            System.gc();
            throw new C0213a(e3);
        }
        return null;
    }

    @Override // k.c.e.n.d
    public Drawable g(String str) throws C0213a {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i2 = options.outHeight;
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            k.c.e.a.d().b(options2, i2, i2);
            Bitmap bitmapDecodeFile = Build.VERSION.SDK_INT == 15 ? BitmapFactory.decodeFile(str) : BitmapFactory.decodeFile(str, options2);
            if (bitmapDecodeFile != null) {
                return new k(bitmapDecodeFile);
            }
            if (!new File(str).exists()) {
                Log.d("OsmDroid", "Request tile: " + str + " does not exist");
                return null;
            }
            Log.d("OsmDroid", str + " is an invalid image file, deleting...");
            try {
                new File(str).delete();
                return null;
            } catch (Throwable th) {
                Log.e("OsmDroid", "Error deleting invalid file: " + str, th);
                return null;
            }
        } catch (Exception e2) {
            Log.e("OsmDroid", "Unexpected error loading bitmap: " + str, e2);
            k.c.e.o.b.f16708b = k.c.e.o.b.f16708b + 1;
            System.gc();
            return null;
        } catch (OutOfMemoryError e3) {
            Log.e("OsmDroid", "OutOfMemoryError loading bitmap: " + str);
            System.gc();
            throw new C0213a(e3);
        }
    }

    public String h() {
        return this.f16684g;
    }

    public String i() {
        return this.f16682e;
    }

    @Override // k.c.e.n.d
    public String name() {
        return this.f16682e;
    }

    public String toString() {
        return name();
    }
}