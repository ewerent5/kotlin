package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class bd1 implements zg1 {
    private final ArrayList a;

    bd1(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final void a(Object obj) {
        ((Bundle) obj).putStringArrayList("android_permissions", this.a);
    }
}