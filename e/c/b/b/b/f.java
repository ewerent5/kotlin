package e.c.b.b.b;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.p;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public abstract class f<T> {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private T f14352b;

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static class a extends Exception {
        public a(@RecentlyNonNull String str) {
            super(str);
        }

        public a(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
            super(str, th);
        }
    }

    protected f(@RecentlyNonNull String str) {
        this.a = str;
    }

    @RecentlyNonNull
    protected abstract T a(@RecentlyNonNull IBinder iBinder);

    @RecentlyNonNull
    protected final T b(@RecentlyNonNull Context context) throws a {
        if (this.f14352b == null) {
            p.j(context);
            Context contextC = com.google.android.gms.common.j.c(context);
            if (contextC == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.f14352b = a((IBinder) contextC.getClassLoader().loadClass(this.a).newInstance());
            } catch (ClassNotFoundException e2) {
                throw new a("Could not load creator class.", e2);
            } catch (IllegalAccessException e3) {
                throw new a("Could not access creator.", e3);
            } catch (InstantiationException e4) {
                throw new a("Could not instantiate creator.", e4);
            }
        }
        return this.f14352b;
    }
}