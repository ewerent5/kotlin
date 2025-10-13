package com.parizene.netmonitor;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements OnInitializationCompleteListener {
    public static final /* synthetic */ b a = ;

    private /* synthetic */ b() {
    }

    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
    public final void onInitializationComplete(InitializationStatus initializationStatus) {
        App.f(initializationStatus);
    }
}