package c.h.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.c.c;
import c.h.i.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi21Impl.java */
/* loaded from: classes.dex */
class e extends j {

    /* renamed from: b, reason: collision with root package name */
    private static Class<?> f3001b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Constructor<?> f3002c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f3003d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Method f3004e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f3005f = false;

    e() {
    }

    private static boolean k(Object obj, String str, int i2, boolean z) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        n();
        try {
            return ((Boolean) f3003d.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface l(Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        n();
        try {
            Object objNewInstance = Array.newInstance(f3001b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f3004e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private File m(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void n() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f3005f) {
            return;
        }
        f3005f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f3002c = constructor;
        f3001b = cls;
        f3003d = method2;
        f3004e = method;
    }

    private static Object o() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        n();
        try {
            return f3002c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // c.h.d.j
    public Typeface b(Context context, c.b bVar, Resources resources, int i2) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Object objO = o();
        for (c.C0009c c0009c : bVar.a()) {
            File fileE = k.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!k.c(fileE, resources, c0009c.b())) {
                    return null;
                }
                if (!k(objO, fileE.getPath(), c0009c.e(), c0009c.f())) {
                    return null;
                }
                fileE.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return l(objO);
    }

    @Override // c.h.d.j
    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) throws IOException {
        if (fVarArr.length < 1) {
            return null;
        }
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
                File fileM = m(parcelFileDescriptorOpenFileDescriptor);
                if (fileM != null && fileM.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileM);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceD = super.d(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceD;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}