package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import i.m;
import i.n;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes3.dex */
public final class c {
    public static final b a;

    static {
        Object objA;
        byte b2 = 0;
        byte b3 = 0;
        try {
            m.a aVar = m.f15825e;
            objA = m.a(new a(a(Looper.getMainLooper(), true), b3 == true ? 1 : 0, 2, b2 == true ? 1 : 0));
        } catch (Throwable th) {
            m.a aVar2 = m.f15825e;
            objA = m.a(n.a(th));
        }
        a = (b) (m.c(objA) ? null : objA);
    }

    public static final Handler a(Looper looper, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i2;
        if (!z || (i2 = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i2 < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}