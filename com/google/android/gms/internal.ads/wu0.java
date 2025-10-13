package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wu0 {

    /* renamed from: e, reason: collision with root package name */
    private final String f10040e;

    /* renamed from: f, reason: collision with root package name */
    private final su0 f10041f;

    /* renamed from: b, reason: collision with root package name */
    private final List<Map<String, String>> f10037b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f10038c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10039d = false;
    private final zzg a = zzs.zzg().l();

    public wu0(String str, su0 su0Var) {
        this.f10040e = str;
        this.f10041f = su0Var;
    }

    private final Map<String, String> f() {
        Map<String, String> mapC = this.f10041f.c();
        mapC.put("tms", Long.toString(zzs.zzj().c(), 10));
        mapC.put("tid", this.a.zzB() ? "" : this.f10040e);
        return mapC;
    }

    public final synchronized void a(String str) {
        if (((Boolean) c.c().b(w3.m1)).booleanValue()) {
            if (!((Boolean) c.c().b(w3.I5)).booleanValue()) {
                Map<String, String> mapF = f();
                mapF.put("action", "adapter_init_started");
                mapF.put("ancn", str);
                this.f10037b.add(mapF);
            }
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) c.c().b(w3.m1)).booleanValue()) {
            if (!((Boolean) c.c().b(w3.I5)).booleanValue()) {
                Map<String, String> mapF = f();
                mapF.put("action", "adapter_init_finished");
                mapF.put("ancn", str);
                this.f10037b.add(mapF);
            }
        }
    }

    public final synchronized void c(String str, String str2) {
        if (((Boolean) c.c().b(w3.m1)).booleanValue()) {
            if (!((Boolean) c.c().b(w3.I5)).booleanValue()) {
                Map<String, String> mapF = f();
                mapF.put("action", "adapter_init_finished");
                mapF.put("ancn", str);
                mapF.put("rqe", str2);
                this.f10037b.add(mapF);
            }
        }
    }

    public final synchronized void d() {
        if (((Boolean) c.c().b(w3.m1)).booleanValue()) {
            if (!((Boolean) c.c().b(w3.I5)).booleanValue()) {
                if (this.f10038c) {
                    return;
                }
                Map<String, String> mapF = f();
                mapF.put("action", "init_started");
                this.f10037b.add(mapF);
                this.f10038c = true;
            }
        }
    }

    public final synchronized void e() {
        if (((Boolean) c.c().b(w3.m1)).booleanValue()) {
            if (!((Boolean) c.c().b(w3.I5)).booleanValue()) {
                if (this.f10039d) {
                    return;
                }
                Map<String, String> mapF = f();
                mapF.put("action", "init_finished");
                this.f10037b.add(mapF);
                Iterator<Map<String, String>> it = this.f10037b.iterator();
                while (it.hasNext()) {
                    this.f10041f.a(it.next());
                }
                this.f10039d = true;
            }
        }
    }
}