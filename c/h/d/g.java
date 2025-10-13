package c.h.d;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.c.c;
import c.h.i.b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: TypefaceCompatApi26Impl.java */
/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: g, reason: collision with root package name */
    protected final Class<?> f3010g;

    /* renamed from: h, reason: collision with root package name */
    protected final Constructor<?> f3011h;

    /* renamed from: i, reason: collision with root package name */
    protected final Method f3012i;

    /* renamed from: j, reason: collision with root package name */
    protected final Method f3013j;

    /* renamed from: k, reason: collision with root package name */
    protected final Method f3014k;

    /* renamed from: l, reason: collision with root package name */
    protected final Method f3015l;

    /* renamed from: m, reason: collision with root package name */
    protected final Method f3016m;

    public g() throws NoSuchMethodException, SecurityException {
        Method methodX;
        Constructor<?> constructorZ;
        Method methodV;
        Method methodW;
        Method methodA;
        Method methodU;
        Class<?> cls = null;
        try {
            Class<?> clsY = y();
            constructorZ = z(clsY);
            methodV = v(clsY);
            methodW = w(clsY);
            methodA = A(clsY);
            methodU = u(clsY);
            methodX = x(clsY);
            cls = clsY;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            methodX = null;
            constructorZ = null;
            methodV = null;
            methodW = null;
            methodA = null;
            methodU = null;
        }
        this.f3010g = cls;
        this.f3011h = constructorZ;
        this.f3012i = methodV;
        this.f3013j = methodW;
        this.f3014k = methodA;
        this.f3015l = methodU;
        this.f3016m = methodX;
    }

    private Object o() {
        try {
            return this.f3011h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void p(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f3015l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean q(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3012i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.f3013j.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean s(Object obj) {
        try {
            return ((Boolean) this.f3014k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean t() {
        if (this.f3012i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f3012i != null;
    }

    protected Method A(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // c.h.d.e, c.h.d.j
    public Typeface b(Context context, c.b bVar, Resources resources, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!t()) {
            return super.b(context, bVar, resources, i2);
        }
        Object objO = o();
        if (objO == null) {
            return null;
        }
        for (c.C0009c c0009c : bVar.a()) {
            if (!q(context, objO, c0009c.a(), c0009c.c(), c0009c.e(), c0009c.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0009c.d()))) {
                p(objO);
                return null;
            }
        }
        if (s(objO)) {
            return l(objO);
        }
        return null;
    }

    @Override // c.h.d.e, c.h.d.j
    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceL;
        if (fVarArr.length < 1) {
            return null;
        }
        if (!t()) {
            b.f fVarH = h(fVarArr, i2);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(fVarH.c(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(fVarH.d()).setItalic(fVarH.e()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapI = c.h.i.b.i(context, fVarArr, cancellationSignal);
        Object objO = o();
        if (objO == null) {
            return null;
        }
        boolean z = false;
        for (b.f fVar : fVarArr) {
            ByteBuffer byteBuffer = mapI.get(fVar.c());
            if (byteBuffer != null) {
                if (!r(objO, byteBuffer, fVar.b(), fVar.d(), fVar.e() ? 1 : 0)) {
                    p(objO);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            p(objO);
            return null;
        }
        if (s(objO) && (typefaceL = l(objO)) != null) {
            return Typeface.create(typefaceL, i2);
        }
        return null;
    }

    @Override // c.h.d.j
    public Typeface e(Context context, Resources resources, int i2, String str, int i3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!t()) {
            return super.e(context, resources, i2, str, i3);
        }
        Object objO = o();
        if (objO == null) {
            return null;
        }
        if (!q(context, objO, str, 0, -1, -1, null)) {
            p(objO);
            return null;
        }
        if (s(objO)) {
            return l(objO);
        }
        return null;
    }

    protected Typeface l(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.f3010g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f3016m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method u(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method v(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method w(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method x(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> y() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> z(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }
}