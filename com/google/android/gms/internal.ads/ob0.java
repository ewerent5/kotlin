package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ob0 extends sf0<jb0> {
    public ob0(Set<nh0<jb0>> set) {
        super(set);
    }

    public final void K0(final Context context) {
        J0(new rf0(context) { // from class: com.google.android.gms.internal.ads.kb0
            private final Context a;

            {
                this.a = context;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((jb0) obj).c(this.a);
            }
        });
    }

    public final void L0(final Context context) {
        J0(new rf0(context) { // from class: com.google.android.gms.internal.ads.mb0
            private final Context a;

            {
                this.a = context;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((jb0) obj).x(this.a);
            }
        });
    }

    public final void M0(final Context context) {
        J0(new rf0(context) { // from class: com.google.android.gms.internal.ads.nb0
            private final Context a;

            {
                this.a = context;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void zza(Object obj) {
                ((jb0) obj).u(this.a);
            }
        });
    }
}