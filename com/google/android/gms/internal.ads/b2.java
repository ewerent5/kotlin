package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class b2 extends dc {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c2 f5051e;

    /* synthetic */ b2(c2 c2Var, z1 z1Var) {
        this.f5051e = c2Var;
    }

    @Override // com.google.android.gms.internal.ads.ec
    public final void t3(List<xb> list) {
        c2.q(this.f5051e, false);
        c2.r(this.f5051e, true);
        c2 c2Var = this.f5051e;
        InitializationStatus initializationStatusX = c2.x(list);
        ArrayList arrayList = c2.a().f5238b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((OnInitializationCompleteListener) arrayList.get(i2)).onInitializationComplete(initializationStatusX);
        }
        c2.a().f5238b.clear();
    }
}