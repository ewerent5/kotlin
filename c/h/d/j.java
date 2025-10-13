package c.h.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.c.c;
import c.h.i.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;

/* compiled from: TypefaceCompatBaseImpl.java */
/* loaded from: classes.dex */
class j {
    private ConcurrentHashMap<Long, c.b> a = new ConcurrentHashMap<>();

    /* compiled from: TypefaceCompatBaseImpl.java */
    class a implements c<b.f> {
        a() {
        }

        @Override // c.h.d.j.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(b.f fVar) {
            return fVar.d();
        }

        @Override // c.h.d.j.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(b.f fVar) {
            return fVar.e();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    class b implements c<c.C0009c> {
        b() {
        }

        @Override // c.h.d.j.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(c.C0009c c0009c) {
            return c0009c.e();
        }

        @Override // c.h.d.j.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(c.C0009c c0009c) {
            return c0009c.f();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    private interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    j() {
    }

    private void a(Typeface typeface, c.b bVar) throws NoSuchFieldException {
        long j2 = j(typeface);
        if (j2 != 0) {
            this.a.put(Long.valueOf(j2), bVar);
        }
    }

    private c.C0009c f(c.b bVar, int i2) {
        return (c.C0009c) g(bVar.a(), i2, new b());
    }

    private static <T> T g(T[] tArr, int i2, c<T> cVar) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(cVar.a(t2) - i3) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i4 > iAbs) {
                t = t2;
                i4 = iAbs;
            }
        }
        return t;
    }

    private static long j(Typeface typeface) throws NoSuchFieldException {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        } catch (NoSuchFieldException e3) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e3);
            return 0L;
        }
    }

    public Typeface b(Context context, c.b bVar, Resources resources, int i2) throws NoSuchFieldException {
        c.C0009c c0009cF = f(bVar, i2);
        if (c0009cF == null) {
            return null;
        }
        Typeface typefaceD = d.d(context, resources, c0009cF.b(), c0009cF.a(), i2);
        a(typefaceD, bVar);
        return typefaceD;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(h(fVarArr, i2).c());
            try {
                Typeface typefaceD = d(context, inputStreamOpenInputStream);
                k.a(inputStreamOpenInputStream);
                return typefaceD;
            } catch (IOException unused) {
                k.a(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                k.a(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    protected Typeface d(Context context, InputStream inputStream) {
        File fileE = k.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (k.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i2, String str, int i3) {
        File fileE = k.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (k.c(fileE, resources, i2)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected b.f h(b.f[] fVarArr, int i2) {
        return (b.f) g(fVarArr, i2, new a());
    }

    c.b i(Typeface typeface) throws NoSuchFieldException {
        long j2 = j(typeface);
        if (j2 == 0) {
            return null;
        }
        return (c.b) this.a.get(Long.valueOf(j2));
    }
}