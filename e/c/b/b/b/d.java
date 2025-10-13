package e.c.b.b.b;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.p;
import e.c.b.b.b.b;
import java.lang.reflect.Field;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class d<T> extends b.a {

    /* renamed from: e, reason: collision with root package name */
    private final T f14351e;

    private d(T t) {
        this.f14351e = t;
    }

    @RecentlyNonNull
    public static <T> T Y(@RecentlyNonNull b bVar) {
        if (bVar instanceof d) {
            return ((d) bVar).f14351e;
        }
        IBinder iBinderAsBinder = bVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i2 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i2++;
                field = field2;
            }
        }
        if (i2 != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        p.j(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
        } catch (NullPointerException e3) {
            throw new IllegalArgumentException("Binder object is null.", e3);
        }
    }

    @RecentlyNonNull
    public static <T> b m4(@RecentlyNonNull T t) {
        return new d(t);
    }
}