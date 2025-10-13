package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class gl2 extends nl2 {
    gl2(int i2) {
        super(i2, null);
    }

    @Override // com.google.android.gms.internal.ads.nl2
    public final void a() {
        if (!b()) {
            for (int i2 = 0; i2 < c(); i2++) {
                Map.Entry entryD = d(i2);
                if (((ui2) entryD.getKey()).zzc()) {
                    entryD.setValue(Collections.unmodifiableList((List) entryD.getValue()));
                }
            }
            for (Map.Entry entry : e()) {
                if (((ui2) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}