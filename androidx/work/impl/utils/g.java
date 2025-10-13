package androidx.work.impl.utils;

import androidx.work.WorkerParameters;

/* compiled from: StartWorkRunnable.java */
/* loaded from: classes.dex */
public class g implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private androidx.work.impl.h f2363e;

    /* renamed from: f, reason: collision with root package name */
    private String f2364f;

    /* renamed from: g, reason: collision with root package name */
    private WorkerParameters.a f2365g;

    public g(androidx.work.impl.h hVar, String str, WorkerParameters.a aVar) {
        this.f2363e = hVar;
        this.f2364f = str;
        this.f2365g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2363e.l().g(this.f2364f, this.f2365g);
    }
}