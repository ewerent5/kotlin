package c.c.b;

import android.content.ComponentName;
import android.os.IBinder;

/* compiled from: CustomTabsSession.java */
/* loaded from: classes.dex */
public final class e {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final b.a.a.b f2669b;

    /* renamed from: c, reason: collision with root package name */
    private final b.a.a.a f2670c;

    /* renamed from: d, reason: collision with root package name */
    private final ComponentName f2671d;

    e(b.a.a.b bVar, b.a.a.a aVar, ComponentName componentName) {
        this.f2669b = bVar;
        this.f2670c = aVar;
        this.f2671d = componentName;
    }

    IBinder a() {
        return this.f2670c.asBinder();
    }

    ComponentName b() {
        return this.f2671d;
    }
}