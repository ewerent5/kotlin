package org.greenrobot.eventbus;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.h;

/* compiled from: EventBusBuilder.java */
/* loaded from: classes3.dex */
public class d {
    private static final ExecutorService a = Executors.newCachedThreadPool();

    /* renamed from: f */
    boolean f17218f;

    /* renamed from: h */
    boolean f17220h;

    /* renamed from: i */
    boolean f17221i;

    /* renamed from: k */
    List<org.greenrobot.eventbus.s.b> f17223k;

    /* renamed from: l */
    g f17224l;

    /* renamed from: m */
    h f17225m;

    /* renamed from: b */
    boolean f17214b = true;

    /* renamed from: c */
    boolean f17215c = true;

    /* renamed from: d */
    boolean f17216d = true;

    /* renamed from: e */
    boolean f17217e = true;

    /* renamed from: g */
    boolean f17219g = true;

    /* renamed from: j */
    ExecutorService f17222j = a;

    d() {
    }

    static Object a() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    g b() {
        g gVar = this.f17224l;
        return gVar != null ? gVar : g.a.a();
    }

    h c() {
        Object objA;
        h hVar = this.f17225m;
        if (hVar != null) {
            return hVar;
        }
        if (!org.greenrobot.eventbus.r.a.c() || (objA = a()) == null) {
            return null;
        }
        return new h.a((Looper) objA);
    }
}