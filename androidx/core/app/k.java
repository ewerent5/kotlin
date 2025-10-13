package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.i;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: NotificationCompatJellybean.java */
/* loaded from: classes.dex */
class k {

    /* renamed from: b, reason: collision with root package name */
    private static Field f876b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f877c;
    private static final Object a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f878d = new Object();

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundle = list.get(i2);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i2, bundle);
            }
        }
        return sparseArray;
    }

    static Bundle b(i.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatE = aVar.e();
        bundle.putInt("icon", iconCompatE != null ? iconCompatE.c() : 0);
        bundle.putCharSequence("title", aVar.i());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", e(aVar.f()));
        bundle.putBoolean("showsUserInterface", aVar.h());
        bundle.putInt("semanticAction", aVar.g());
        return bundle;
    }

    public static Bundle c(Notification notification) {
        synchronized (a) {
            if (f877c) {
                return null;
            }
            try {
                if (f876b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f877c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f876b = declaredField;
                }
                Bundle bundle = (Bundle) f876b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f876b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f877c = true;
                return null;
            } catch (NoSuchFieldException e3) {
                Log.e("NotificationCompat", "Unable to access notification extras", e3);
                f877c = true;
                return null;
            }
        }
    }

    private static Bundle d(m mVar) {
        new Bundle();
        throw null;
    }

    private static Bundle[] e(m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[mVarArr.length];
        for (int i2 = 0; i2 < mVarArr.length; i2++) {
            bundleArr[i2] = d(mVarArr[i2]);
        }
        return bundleArr;
    }

    public static Bundle f(Notification.Builder builder, i.a aVar) {
        IconCompat iconCompatE = aVar.e();
        builder.addAction(iconCompatE != null ? iconCompatE.c() : 0, aVar.i(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", e(aVar.f()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", e(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }
}