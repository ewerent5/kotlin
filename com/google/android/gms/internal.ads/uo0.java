package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class uo0 implements x02 {
    static final x02 a = new uo0();

    private uo0() {
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (wo0 wo0Var : (List) obj) {
            if (wo0Var != null) {
                arrayList.add(wo0Var);
            }
        }
        return arrayList;
    }
}