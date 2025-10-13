package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.ads.mediation.f;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public final class CustomEventExtras implements f {
    private final HashMap<String, Object> zza = new HashMap<>();

    @RecentlyNullable
    public Object getExtra(@RecentlyNonNull String str) {
        return this.zza.get(str);
    }

    public void setExtra(@RecentlyNonNull String str, @RecentlyNonNull Object obj) {
        this.zza.put(str, obj);
    }
}