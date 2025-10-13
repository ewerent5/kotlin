package com.google.android.gms.ads.initialization;

import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public interface AdapterStatus {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public enum State {
        NOT_READY,
        READY
    }

    @RecentlyNonNull
    String getDescription();

    @RecentlyNonNull
    State getInitializationState();

    int getLatency();
}