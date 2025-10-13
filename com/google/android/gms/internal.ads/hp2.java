package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hp2 extends gp2 {
    protected hp2(Context context, String str, boolean z, int i2) {
        super(context, str, z, i2);
    }

    public static hp2 r(String str, Context context, boolean z, int i2) {
        gp2.h(context, z);
        gp2.o(str, context, z, i2);
        return new hp2(context, str, z, i2);
    }

    @Override // com.google.android.gms.internal.ads.gp2
    protected final List<Callable<Void>> k(gq2 gq2Var, Context context, eu0 eu0Var, vk0 vk0Var) {
        if (gq2Var.d() == null || !this.F) {
            return super.k(gq2Var, context, eu0Var, null);
        }
        int iS = gq2Var.s();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.k(gq2Var, context, eu0Var, null));
        arrayList.add(new vq2(gq2Var, "HDBr8nc5ubdBn1y5M6IpuatOFh1+XK9blifaQQrU1HNvfw3hhdVJEUnkWE7sod57", "A6vbZ9nEwiHcLSfXI6B1ZE45FocqpxNzrogO6LWG5xM=", eu0Var, iS, 24));
        return arrayList;
    }
}