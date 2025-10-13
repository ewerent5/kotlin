package com.parizene.netmonitor.q0;

import android.app.AlarmManager;
import android.content.Context;

/* compiled from: AndroidModule_ProvideAlarmManagerFactory.java */
/* loaded from: classes3.dex */
public final class f implements f.c.c<AlarmManager> {
    private final h.a.a<Context> a;

    public f(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static f a(h.a.a<Context> aVar) {
        return new f(aVar);
    }

    public static AlarmManager c(Context context) {
        return (AlarmManager) f.c.f.c(d.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AlarmManager get() {
        return c(this.a.get());
    }
}