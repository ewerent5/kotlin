package c.h.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.c.c;
import c.h.i.b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: TypefaceCompatApi24Impl.java */
/* loaded from: classes.dex */
class f extends j {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f3006b;

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor<?> f3007c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f3008d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f3009e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f3007c = constructor;
        f3006b = cls;
        f3008d = method2;
        f3009e = method;
    }

    f() {
    }

    private static boolean k(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) f3008d.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface l(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(f3006b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f3009e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean m() {
        Method method = f3008d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object n() {
        try {
            return f3007c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // c.h.d.j
    public Typeface b(Context context, c.b bVar, Resources resources, int i2) {
        Object objN = n();
        if (objN == null) {
            return null;
        }
        for (c.C0009c c0009c : bVar.a()) {
            ByteBuffer byteBufferB = k.b(context, resources, c0009c.b());
            if (byteBufferB == null || !k(objN, byteBufferB, c0009c.c(), c0009c.e(), c0009c.f())) {
                return null;
            }
        }
        return l(objN);
    }

    @Override // c.h.d.j
    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objN = n();
        if (objN == null) {
            return null;
        }
        c.e.g gVar = new c.e.g();
        for (b.f fVar : fVarArr) {
            Uri uriC = fVar.c();
            ByteBuffer byteBufferF = (ByteBuffer) gVar.get(uriC);
            if (byteBufferF == null) {
                byteBufferF = k.f(context, cancellationSignal, uriC);
                gVar.put(uriC, byteBufferF);
            }
            if (byteBufferF == null || !k(objN, byteBufferF, fVar.b(), fVar.d(), fVar.e())) {
                return null;
            }
        }
        Typeface typefaceL = l(objN);
        if (typefaceL == null) {
            return null;
        }
        return Typeface.create(typefaceL, i2);
    }
}