package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public interface k extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static abstract class a extends e.c.b.b.c.c.b implements k {
        @RecentlyNonNull
        public static k U(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new d1(iBinder);
        }
    }

    @RecentlyNonNull
    Account zzb();
}