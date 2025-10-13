package c.h.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.c.c;
import androidx.core.content.c.f;
import c.h.i.b;

/* compiled from: TypefaceCompat.java */
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class d {
    private static final j a;

    /* renamed from: b, reason: collision with root package name */
    private static final c.e.e<String, Typeface> f3000b;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            a = new i();
        } else if (i2 >= 28) {
            a = new h();
        } else if (i2 >= 26) {
            a = new g();
        } else if (i2 >= 24 && f.m()) {
            a = new f();
        } else if (i2 >= 21) {
            a = new e();
        } else {
            a = new j();
        }
        f3000b = new c.e.e<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i2) {
        Typeface typefaceG;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (typefaceG = g(context, typeface, i2)) == null) ? Typeface.create(typeface, i2) : typefaceG;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) {
        return a.c(context, cancellationSignal, fVarArr, i2);
    }

    public static Typeface c(Context context, c.a aVar, Resources resources, int i2, int i3, f.a aVar2, Handler handler, boolean z) throws NoSuchFieldException {
        Typeface typefaceB;
        if (aVar instanceof c.d) {
            c.d dVar = (c.d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.a() == 0) {
                z2 = true;
            }
            typefaceB = c.h.i.b.g(context, dVar.b(), aVar2, handler, z2, z ? dVar.c() : -1, i3);
        } else {
            typefaceB = a.b(context, (c.b) aVar, resources, i3);
            if (aVar2 != null) {
                if (typefaceB != null) {
                    aVar2.b(typefaceB, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typefaceB != null) {
            f3000b.d(e(resources, i2, i3), typefaceB);
        }
        return typefaceB;
    }

    public static Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        Typeface typefaceE = a.e(context, resources, i2, str, i3);
        if (typefaceE != null) {
            f3000b.d(e(resources, i2, i3), typefaceE);
        }
        return typefaceE;
    }

    private static String e(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }

    public static Typeface f(Resources resources, int i2, int i3) {
        return f3000b.c(e(resources, i2, i3));
    }

    private static Typeface g(Context context, Typeface typeface, int i2) throws NoSuchFieldException {
        j jVar = a;
        c.b bVarI = jVar.i(typeface);
        if (bVarI == null) {
            return null;
        }
        return jVar.b(context, bVarI, context.getResources(), i2);
    }
}