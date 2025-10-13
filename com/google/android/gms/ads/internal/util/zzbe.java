package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.fu2;
import com.google.android.gms.internal.ads.g4;
import com.google.android.gms.internal.ads.g52;
import com.google.android.gms.internal.ads.t83;
import com.google.android.gms.internal.ads.wr;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbe {
    private static g4 zzb;
    private static final Object zzc = new Object();

    @Deprecated
    public static final zzba<Void> zza = new zzax();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[Catch: all -> 0x003e, TryCatch #0 {, blocks: (B:8:0x0011, B:10:0x0015, B:12:0x001e, B:14:0x0030, B:16:0x003a, B:15:0x0035, B:17:0x003c), top: B:22:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbe(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 != 0) goto La
            goto Le
        La:
            android.content.Context r4 = r4.getApplicationContext()
        Le:
            java.lang.Object r0 = com.google.android.gms.ads.internal.util.zzbe.zzc
            monitor-enter(r0)
            com.google.android.gms.internal.ads.g4 r1 = com.google.android.gms.ads.internal.util.zzbe.zzb     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L3c
            com.google.android.gms.internal.ads.w3.a(r4)     // Catch: java.lang.Throwable -> L3e
            boolean r1 = com.google.android.gms.common.util.e.a()     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L35
            com.google.android.gms.internal.ads.o3<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.w3.E2     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.u3 r2 = com.google.android.gms.internal.ads.c.c()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L35
            com.google.android.gms.internal.ads.g4 r4 = com.google.android.gms.ads.internal.util.zzao.zzb(r4)     // Catch: java.lang.Throwable -> L3e
            goto L3a
        L35:
            r1 = 0
            com.google.android.gms.internal.ads.g4 r4 = com.google.android.gms.internal.ads.zy.a(r4, r1)     // Catch: java.lang.Throwable -> L3e
        L3a:
            com.google.android.gms.ads.internal.util.zzbe.zzb = r4     // Catch: java.lang.Throwable -> L3e
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L3e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzbe.<init>(android.content.Context):void");
    }

    public final g52<t83> zza(String str) {
        wr wrVar = new wr();
        zzb.b(new zzbd(str, null, wrVar));
        return wrVar;
    }

    public final g52<String> zzb(int i2, String str, Map<String, String> map, byte[] bArr) {
        zzbb zzbbVar = new zzbb(null);
        zzay zzayVar = new zzay(this, str, zzbbVar);
        dr drVar = new dr(null);
        zzaz zzazVar = new zzaz(this, i2, str, zzbbVar, zzayVar, bArr, map, drVar);
        if (dr.j()) {
            try {
                drVar.b(str, "GET", zzazVar.zzm(), zzazVar.zzn());
            } catch (fu2 e2) {
                er.zzi(e2.getMessage());
            }
        }
        zzb.b(zzazVar);
        return zzbbVar;
    }
}