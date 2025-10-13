package com.google.android.gms.ads.initialization;

import androidx.annotation.RecentlyNonNull;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public interface InitializationStatus {
    @RecentlyNonNull
    Map<String, AdapterStatus> getAdapterStatusMap();
}