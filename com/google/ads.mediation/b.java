package com.google.ads.mediation;

import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public interface b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends e> {
    void destroy();

    @RecentlyNonNull
    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    @RecentlyNonNull
    Class<SERVER_PARAMETERS> getServerParametersType();
}