package e.c.b.d.a.b;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class b extends k0 implements c {
    public static c U(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new a(iBinder);
    }
}