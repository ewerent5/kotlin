package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class x3 {
    static List<String> a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, z4.d("gad:dynamite_module:experiment_id", ""));
        c(arrayList, j5.a);
        c(arrayList, j5.f6679b);
        c(arrayList, j5.f6680c);
        c(arrayList, j5.f6681d);
        c(arrayList, j5.f6682e);
        c(arrayList, j5.f6688k);
        c(arrayList, j5.f6683f);
        c(arrayList, j5.f6684g);
        c(arrayList, j5.f6685h);
        c(arrayList, j5.f6686i);
        c(arrayList, j5.f6687j);
        return arrayList;
    }

    static List<String> b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, t5.a);
        return arrayList;
    }

    private static void c(List<String> list, z4<String> z4Var) {
        String strE = z4Var.e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        list.add(strE);
    }
}