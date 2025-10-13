package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) aVar.v(remoteActionCompat.a, 1);
        remoteActionCompat.f814b = aVar.l(remoteActionCompat.f814b, 2);
        remoteActionCompat.f815c = aVar.l(remoteActionCompat.f815c, 3);
        remoteActionCompat.f816d = (PendingIntent) aVar.r(remoteActionCompat.f816d, 4);
        remoteActionCompat.f817e = aVar.h(remoteActionCompat.f817e, 5);
        remoteActionCompat.f818f = aVar.h(remoteActionCompat.f818f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.a, 1);
        aVar.D(remoteActionCompat.f814b, 2);
        aVar.D(remoteActionCompat.f815c, 3);
        aVar.H(remoteActionCompat.f816d, 4);
        aVar.z(remoteActionCompat.f817e, 5);
        aVar.z(remoteActionCompat.f818f, 6);
    }
}