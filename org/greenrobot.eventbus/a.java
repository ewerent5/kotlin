package org.greenrobot.eventbus;

import java.lang.reflect.InvocationTargetException;

/* compiled from: AsyncPoster.java */
/* loaded from: classes3.dex */
class a implements Runnable, l {

    /* renamed from: e, reason: collision with root package name */
    private final k f17192e = new k();

    /* renamed from: f, reason: collision with root package name */
    private final c f17193f;

    a(c cVar) {
        this.f17193f = cVar;
    }

    @Override // org.greenrobot.eventbus.l
    public void a(q qVar, Object obj) {
        this.f17192e.a(j.a(qVar, obj));
        this.f17193f.d().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        j jVarB = this.f17192e.b();
        if (jVarB == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f17193f.h(jVarB);
    }
}