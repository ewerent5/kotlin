package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ko0 implements x02 {
    static final x02 a = new ko0();

    private ko0() {
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (c6 c6Var : (List) obj) {
            if (c6Var != null) {
                arrayList.add(c6Var);
            }
        }
        return arrayList;
    }
}