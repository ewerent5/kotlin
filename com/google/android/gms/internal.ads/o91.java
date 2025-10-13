package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class o91 {
    private final ConcurrentHashMap<String, th> a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final js0 f7928b;

    public o91(js0 js0Var) {
        this.f7928b = js0Var;
    }

    public final void a(String str) {
        try {
            this.a.put(str, this.f7928b.c(str));
        } catch (RemoteException e2) {
            er.zzg("Couldn't create RTB adapter : ", e2);
        }
    }

    @CheckForNull
    public final th b(String str) {
        if (this.a.containsKey(str)) {
            return (th) this.a.get(str);
        }
        return null;
    }
}