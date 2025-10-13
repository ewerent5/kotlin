package e.c.b.b.b;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static abstract class a extends e.c.b.b.c.c.b implements b {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @RecentlyNonNull
        public static b U(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new l(iBinder);
        }
    }
}