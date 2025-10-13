package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class le {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f7236b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("lockClient")
    private ve f7237c;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("lockService")
    private ve f7238d;

    private static final Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final ve a(Context context, kr krVar) {
        ve veVar;
        synchronized (this.f7236b) {
            if (this.f7238d == null) {
                this.f7238d = new ve(c(context), krVar, s5.f8817b.e());
            }
            veVar = this.f7238d;
        }
        return veVar;
    }

    public final ve b(Context context, kr krVar) {
        ve veVar;
        synchronized (this.a) {
            if (this.f7237c == null) {
                this.f7237c = new ve(c(context), krVar, (String) c.c().b(w3.a));
            }
            veVar = this.f7237c;
        }
        return veVar;
    }
}