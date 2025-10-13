package com.parizene.netmonitor.db.i;

import com.parizene.netmonitor.db.AppDatabase;
import com.parizene.netmonitor.db.celllog.i.j;
import java.util.List;

/* compiled from: GeolocationBackup.java */
/* loaded from: classes.dex */
class h extends a<j> {
    h(com.parizene.netmonitor.db.celllog.b bVar, AppDatabase appDatabase) {
        super(bVar, appDatabase);
    }

    @Override // com.parizene.netmonitor.db.i.a
    void c() {
        this.f13168b.H().a();
    }

    @Override // com.parizene.netmonitor.db.i.a
    String[] e() {
        return new String[]{"mcc", "mnc", "lac", "cid", "latitude", "longitude", "accuracy", "info", "status", "timestamp", "source"};
    }

    @Override // com.parizene.netmonitor.db.i.a
    int f(List<j> list) {
        return this.f13168b.H().b(list).length;
    }

    @Override // com.parizene.netmonitor.db.i.a
    boolean g(int i2) {
        return i2 >= 10;
    }

    @Override // com.parizene.netmonitor.db.i.a
    List<j> h(long j2, long j3) {
        return this.f13168b.H().c(j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.parizene.netmonitor.db.i.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public j a(g.a.a.a.d dVar) {
        return new j(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.parizene.netmonitor.db.i.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public j b(String[] strArr) {
        return new j(strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.parizene.netmonitor.db.i.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public String[] d(j jVar) {
        return new String[]{String.valueOf(jVar.a), String.valueOf(jVar.f13118b), String.valueOf(jVar.f13119c), String.valueOf(jVar.f13120d), String.valueOf(jVar.f13121e), String.valueOf(jVar.f13122f), String.valueOf(jVar.f13123g), jVar.f13124h, String.valueOf(jVar.f13125i), String.valueOf(jVar.f13126j), String.valueOf(jVar.f13127k)};
    }
}