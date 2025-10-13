package com.parizene.netmonitor.db.i;

import com.parizene.netmonitor.db.AppDatabase;
import com.parizene.netmonitor.k;
import java.io.File;

/* compiled from: BackupHelper.java */
/* loaded from: classes.dex */
public class b {
    private final com.parizene.netmonitor.db.celllog.b a;

    /* renamed from: b, reason: collision with root package name */
    private final AppDatabase f13169b;

    /* renamed from: c, reason: collision with root package name */
    private final File f13170c;

    /* renamed from: d, reason: collision with root package name */
    private final d f13171d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13172e;

    /* compiled from: BackupHelper.java */
    public interface a {
        void a();

        void b(int i2);

        void c(int[] iArr);
    }

    public b(com.parizene.netmonitor.db.celllog.b bVar, AppDatabase appDatabase, k kVar, d dVar) {
        this.a = bVar;
        this.f13169b = appDatabase;
        this.f13170c = kVar.b();
        this.f13171d = dVar;
    }

    public void a(a aVar) {
        if (this.f13172e) {
            aVar.b(0);
            return;
        }
        this.f13172e = true;
        aVar.a();
        int[] iArr = {this.f13171d.a(new e(this.a, this.f13169b), new File(this.f13170c, "backup-cell.csv")), this.f13171d.a(new f(this.a, this.f13169b), new File(this.f13170c, "backup-clf.csv")), this.f13171d.a(new h(this.a, this.f13169b), new File(this.f13170c, "backup-geolocation.csv"))};
        this.f13172e = false;
        aVar.c(iArr);
    }

    public void b(a aVar) {
        if (this.f13172e) {
            aVar.b(0);
            return;
        }
        this.f13172e = true;
        aVar.a();
        int[] iArr = {this.f13171d.b(new e(this.a, this.f13169b), new File(this.f13170c, "backup-cell.csv")), this.f13171d.b(new f(this.a, this.f13169b), new File(this.f13170c, "backup-clf.csv")), this.f13171d.b(new h(this.a, this.f13169b), new File(this.f13170c, "backup-geolocation.csv"))};
        this.a.e();
        this.f13172e = false;
        aVar.c(iArr);
    }
}