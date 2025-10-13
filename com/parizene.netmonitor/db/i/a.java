package com.parizene.netmonitor.db.i;

import com.parizene.netmonitor.db.AppDatabase;
import java.util.List;

/* compiled from: Backup.java */
/* loaded from: classes.dex */
abstract class a<T> {
    com.parizene.netmonitor.db.celllog.b a;

    /* renamed from: b, reason: collision with root package name */
    protected final AppDatabase f13168b;

    public a(com.parizene.netmonitor.db.celllog.b bVar, AppDatabase appDatabase) {
        this.a = bVar;
        this.f13168b = appDatabase;
    }

    abstract T a(g.a.a.a.d dVar);

    abstract T b(String[] strArr);

    abstract void c();

    abstract String[] d(T t);

    abstract String[] e();

    abstract int f(List<T> list);

    abstract boolean g(int i2);

    abstract List<T> h(long j2, long j3);
}