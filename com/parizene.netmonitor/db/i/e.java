package com.parizene.netmonitor.db.i;

import com.parizene.netmonitor.db.AppDatabase;
import java.util.List;

/* compiled from: CellBackup.java */
/* loaded from: classes.dex */
class e extends a<com.parizene.netmonitor.db.celllog.i.b> {
    e(com.parizene.netmonitor.db.celllog.b bVar, AppDatabase appDatabase) {
        super(bVar, appDatabase);
    }

    @Override // com.parizene.netmonitor.db.i.a
    void c() {
        this.a.l();
    }

    @Override // com.parizene.netmonitor.db.i.a
    String[] e() {
        return new String[]{"mcc", "mnc", "lac", "cid", "psc", "cdma_latitude", "cdma_longitude", "was_current", "last_mentioned", "network_type", "channel", "flags"};
    }

    @Override // com.parizene.netmonitor.db.i.a
    int f(List<com.parizene.netmonitor.db.celllog.i.b> list) {
        return this.a.h(list);
    }

    @Override // com.parizene.netmonitor.db.i.a
    boolean g(int i2) {
        return i2 >= 12;
    }

    @Override // com.parizene.netmonitor.db.i.a
    List<com.parizene.netmonitor.db.celllog.i.b> h(long j2, long j3) {
        return this.a.n(j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.parizene.netmonitor.db.i.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.db.celllog.i.b a(g.a.a.a.d dVar) {
        return new com.parizene.netmonitor.db.celllog.i.b(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.parizene.netmonitor.db.i.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.db.celllog.i.b b(String[] strArr) {
        return new com.parizene.netmonitor.db.celllog.i.b(strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.parizene.netmonitor.db.i.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public String[] d(com.parizene.netmonitor.db.celllog.i.b bVar) {
        return new String[]{bVar.f13088b, bVar.f13089c, String.valueOf(bVar.f13090d), String.valueOf(bVar.f13091e), String.valueOf(bVar.f13092f), String.valueOf(bVar.f13093g), String.valueOf(bVar.f13094h), String.valueOf(bVar.f13095i ? 1 : 0), String.valueOf(bVar.f13096j), String.valueOf(bVar.f13097k), String.valueOf(bVar.f13098l), String.valueOf(bVar.f13099m)};
    }
}