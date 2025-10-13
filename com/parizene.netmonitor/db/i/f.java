package com.parizene.netmonitor.db.i;

import com.parizene.netmonitor.db.AppDatabase;
import java.util.List;

/* compiled from: ClfBackup.java */
/* loaded from: classes.dex */
class f extends a<com.parizene.netmonitor.db.celllog.i.i> {
    f(com.parizene.netmonitor.db.celllog.b bVar, AppDatabase appDatabase) {
        super(bVar, appDatabase);
    }

    @Override // com.parizene.netmonitor.db.i.a
    void c() {
        this.a.d();
    }

    @Override // com.parizene.netmonitor.db.i.a
    String[] e() {
        return new String[]{"mcc", "mnc", "lac", "cid", "latitude", "longitude", "info"};
    }

    @Override // com.parizene.netmonitor.db.i.a
    int f(List<com.parizene.netmonitor.db.celllog.i.i> list) {
        return this.a.i(list);
    }

    @Override // com.parizene.netmonitor.db.i.a
    boolean g(int i2) {
        return i2 >= 7;
    }

    @Override // com.parizene.netmonitor.db.i.a
    List<com.parizene.netmonitor.db.celllog.i.i> h(long j2, long j3) {
        return this.a.r(j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.parizene.netmonitor.db.i.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.db.celllog.i.i a(g.a.a.a.d dVar) {
        return new com.parizene.netmonitor.db.celllog.i.i(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.parizene.netmonitor.db.i.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.db.celllog.i.i b(String[] strArr) {
        return new com.parizene.netmonitor.db.celllog.i.i(strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.parizene.netmonitor.db.i.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public String[] d(com.parizene.netmonitor.db.celllog.i.i iVar) {
        return new String[]{iVar.a, iVar.f13112b, String.valueOf(iVar.f13113c), String.valueOf(iVar.f13114d), String.valueOf(iVar.f13115e), String.valueOf(iVar.f13116f), iVar.f13117g};
    }
}