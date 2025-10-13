package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ad1 implements x02 {
    static final x02 a = new ad1();

    private ad1() {
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final Object apply(Object obj) {
        final ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zg1(arrayList) { // from class: com.google.android.gms.internal.ads.bd1
            private final ArrayList a;

            {
                this.a = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zg1
            public final void a(Object obj2) {
                ((Bundle) obj2).putStringArrayList("android_permissions", this.a);
            }
        };
    }
}