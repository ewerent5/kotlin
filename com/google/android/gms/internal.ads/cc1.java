package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class cc1 implements e42 {
    static final e42 a = new cc1();

    private cc1() {
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) {
        final String str = (String) obj;
        return y42.a(new zg1(str) { // from class: com.google.android.gms.internal.ads.dc1
            private final String a;

            {
                this.a = str;
            }

            @Override // com.google.android.gms.internal.ads.zg1
            public final void a(Object obj2) {
                ((Bundle) obj2).putString("ms", this.a);
            }
        });
    }
}