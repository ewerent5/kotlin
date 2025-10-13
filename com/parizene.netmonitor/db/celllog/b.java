package com.parizene.netmonitor.db.celllog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteConstraintException;
import android.graphics.Rect;
import android.os.Environment;
import android.os.Handler;
import androidx.lifecycle.LiveData;
import com.parizene.netmonitor.db.AppDatabase;
import com.parizene.netmonitor.db.celllog.i.i;
import com.parizene.netmonitor.db.celllog.i.l;
import com.parizene.netmonitor.db.celllog.i.o;
import com.parizene.netmonitor.j0;
import com.parizene.netmonitor.u;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* compiled from: CellLogDatabaseAdapter.java */
/* loaded from: classes.dex */
public class b {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private AppDatabase f13057b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f13058c;

    /* renamed from: d, reason: collision with root package name */
    private u f13059d;

    /* renamed from: e, reason: collision with root package name */
    private c.p.a.a f13060e;

    /* renamed from: f, reason: collision with root package name */
    private f.a<com.google.firebase.crashlytics.c> f13061f;

    /* renamed from: g, reason: collision with root package name */
    private BroadcastReceiver f13062g = new a();

    /* compiled from: CellLogDatabaseAdapter.java */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            "com.parizene.netmonitor.action.UPDATE_IMPORT_CELL".equals(intent.getAction());
        }
    }

    public b(Context context, AppDatabase appDatabase, Handler handler, u uVar, c.p.a.a aVar, f.a<com.google.firebase.crashlytics.c> aVar2) {
        this.a = context;
        this.f13057b = appDatabase;
        this.f13058c = handler;
        this.f13059d = uVar;
        this.f13060e = aVar;
        this.f13061f = aVar2;
        this.f13060e.c(this.f13062g, new IntentFilter("com.parizene.netmonitor.action.UPDATE_IMPORT_CELL"));
        if (com.parizene.netmonitor.t0.f.z.g().booleanValue()) {
            this.f13058c.post(new Runnable() { // from class: com.parizene.netmonitor.db.celllog.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13056e.l();
                }
            });
        }
    }

    private com.parizene.netmonitor.db.celllog.i.e B(com.parizene.netmonitor.db.celllog.i.c cVar, long j2, com.parizene.netmonitor.db.celllog.i.e eVar) {
        eVar.f13096j = j2;
        eVar.f13092f = cVar.l();
        eVar.f13093g = cVar.c();
        eVar.f13094h = cVar.d();
        eVar.f13098l = cVar.e();
        if (!eVar.f13095i && cVar.s()) {
            eVar.f13095i = true;
        }
        if (eVar.f13097k == 0 && cVar.k() != 0) {
            eVar.f13097k = cVar.k();
        }
        this.f13057b.F().l(eVar);
        return eVar;
    }

    private com.parizene.netmonitor.db.celllog.i.e g(com.parizene.netmonitor.db.celllog.i.c cVar, long j2) {
        com.parizene.netmonitor.db.celllog.i.e eVar = new com.parizene.netmonitor.db.celllog.i.e(cVar.i(), cVar.j(), cVar.h(), cVar.f(), cVar.l(), cVar.c(), cVar.d(), cVar.m(), j2, cVar.k(), cVar.e());
        long jK = this.f13057b.F().k(eVar);
        if (jK == -1) {
            return null;
        }
        eVar.a = jK;
        this.f13059d.r(new com.parizene.netmonitor.r0.c(Integer.parseInt(eVar.f13088b), Integer.parseInt(eVar.f13089c), eVar.f13090d, eVar.f13091e));
        return eVar;
    }

    public List<o> A() {
        return this.f13057b.F().i();
    }

    public void a() {
        this.f13060e.e(this.f13062g);
        this.f13057b.d();
    }

    public void b() {
        File databasePath = this.a.getDatabasePath("cell_log.db");
        try {
            j0.b(databasePath, new File(Environment.getExternalStorageDirectory(), databasePath.getName()));
        } catch (IOException e2) {
            m.a.a.h(e2, "copyToSdcard", new Object[0]);
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void l() {
        try {
            this.f13057b.c();
            this.f13057b.F().a();
            this.f13057b.J().a();
            this.f13057b.D();
        } finally {
            this.f13057b.h();
        }
    }

    public int d() {
        return this.f13057b.G().a();
    }

    public int e() {
        return this.f13057b.J().a();
    }

    public long f(l lVar) {
        try {
            this.f13057b.J().g(lVar);
            return -1L;
        } catch (SQLiteConstraintException e2) {
            m.a.a.g(e2);
            boolean z = this.f13057b.F().f(lVar.f13128b) > 0;
            this.f13061f.get().c(new IllegalStateException("cellId=" + lVar.f13128b + ", exists=" + z, e2));
            return -1L;
        }
    }

    public int h(List<com.parizene.netmonitor.db.celllog.i.b> list) {
        return this.f13057b.F().b(list).length;
    }

    public int i(List<i> list) {
        return this.f13057b.G().b(list).length;
    }

    public com.parizene.netmonitor.db.celllog.i.e j(com.parizene.netmonitor.db.celllog.i.c cVar, long j2, boolean z, boolean z2) {
        com.parizene.netmonitor.db.celllog.i.e eVarH = this.f13057b.F().h(cVar.i(), cVar.j(), cVar.h(), cVar.f(), z, z2);
        if (eVarH != null) {
            return B(cVar, j2, eVarH);
        }
        g(cVar, j2);
        return this.f13057b.F().h(cVar.i(), cVar.j(), cVar.h(), cVar.f(), z, z2);
    }

    int m() {
        return this.f13057b.F().m();
    }

    public List<com.parizene.netmonitor.db.celllog.i.b> n(long j2, long j3) {
        return this.f13057b.F().c(j2, j3);
    }

    List<com.parizene.netmonitor.db.celllog.i.f> o(long j2, long j3, com.parizene.netmonitor.db.celllog.i.g gVar, boolean z, boolean z2) {
        return this.f13057b.F().e(z, z2, gVar, j2, j3);
    }

    List<com.parizene.netmonitor.db.celllog.i.e> p(long j2, long j3, boolean z, boolean z2) {
        return this.f13057b.F().d(z, z2, j2, j3);
    }

    public int q(String str, String str2) {
        return this.f13057b.G().g(str, str2);
    }

    public List<i> r(long j2, long j3) {
        return this.f13057b.G().c(j2, j3);
    }

    public List<i> s(String str, String str2, long j2, long j3) {
        return this.f13057b.G().e(str, str2, j2, j3);
    }

    public long t(com.parizene.netmonitor.db.celllog.i.g gVar) {
        return this.f13057b.J().b(gVar);
    }

    public long u(long j2, long j3) {
        return this.f13057b.J().e(j2, j3);
    }

    List<l> v(long j2, long j3, long j4, long j5) {
        return this.f13057b.J().c(j4, j5, j2, j3);
    }

    List<l> w(long j2, long j3, long j4) {
        return this.f13057b.J().d(j2, j3, j4);
    }

    public long x() {
        long jF = this.f13057b.J().f(0);
        if (jF > 0) {
            return jF;
        }
        return Long.MIN_VALUE;
    }

    public long y() {
        long jF = this.f13057b.J().f(1);
        if (jF > 0) {
            return jF;
        }
        return Long.MAX_VALUE;
    }

    public LiveData<List<com.parizene.netmonitor.db.celllog.i.e>> z(Rect rect, boolean z, boolean z2) {
        long jNanoTime = System.nanoTime();
        LiveData<List<com.parizene.netmonitor.db.celllog.i.e>> liveDataJ = this.f13057b.F().j(z, z2, rect.bottom, rect.left, rect.right, rect.top);
        m.a.a.a("time: %s (ms)", Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d));
        return liveDataJ;
    }
}