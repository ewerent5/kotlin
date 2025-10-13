package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class up1 {
    public static yo1 a(List<yo1> list, yo1 yo1Var) {
        return list.get(0);
    }

    public static r93 b(Context context, List<yo1> list) {
        ArrayList arrayList = new ArrayList();
        for (yo1 yo1Var : list) {
            if (yo1Var.f10459c) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(yo1Var.a, yo1Var.f10458b));
            }
        }
        return new r93(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static yo1 c(r93 r93Var) {
        return r93Var.f8623m ? new yo1(-3, 0, true) : new yo1(r93Var.f8619i, r93Var.f8616f, false);
    }
}