package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jj1 implements mo2<eh1<JSONObject>> {
    public static eh1<JSONObject> a(fq fqVar, Object obj, wh1 wh1Var, vi1 vi1Var, go2<qh1> go2Var, go2<zh1> go2Var2, go2<gi1> go2Var3, go2<ki1> go2Var4, go2<ri1> go2Var5, go2<yi1> go2Var6, go2<lj1> go2Var7, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        HashSet hashSet = new HashSet();
        hashSet.add((oi1) obj);
        hashSet.add(wh1Var);
        hashSet.add(vi1Var);
        if (((Boolean) c.c().b(w3.Q3)).booleanValue()) {
            hashSet.add(go2Var.zzb());
        }
        if (((Boolean) c.c().b(w3.R3)).booleanValue()) {
            hashSet.add(go2Var2.zzb());
        }
        if (((Boolean) c.c().b(w3.S3)).booleanValue()) {
            hashSet.add(go2Var3.zzb());
        }
        if (((Boolean) c.c().b(w3.T3)).booleanValue()) {
            hashSet.add(go2Var4.zzb());
        }
        if (((Boolean) c.c().b(w3.X3)).booleanValue()) {
            hashSet.add(go2Var6.zzb());
        }
        if (((Boolean) c.c().b(w3.Y3)).booleanValue()) {
            hashSet.add(go2Var7.zzb());
        }
        return new eh1<>(executor, hashSet);
    }
}