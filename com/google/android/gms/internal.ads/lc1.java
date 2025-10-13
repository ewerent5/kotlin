package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class lc1 implements ah1<zg1<Bundle>> {
    private final Set<String> a;

    lc1(Set<String> set) {
        this.a = set;
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<zg1<Bundle>> zza() {
        final ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return y42.a(new zg1(arrayList) { // from class: com.google.android.gms.internal.ads.kc1
            private final ArrayList a;

            {
                this.a = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zg1
            public final void a(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", this.a);
            }
        });
    }
}