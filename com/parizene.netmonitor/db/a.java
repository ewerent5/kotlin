package com.parizene.netmonitor.db;

import androidx.lifecycle.LiveData;
import com.parizene.netmonitor.db.celllog.i.o;
import i.y.d.l;
import java.util.List;

/* compiled from: CellDao.kt */
/* loaded from: classes.dex */
public interface a {
    public static final C0155a a = C0155a.a;

    /* compiled from: CellDao.kt */
    /* renamed from: com.parizene.netmonitor.db.a$a, reason: collision with other inner class name */
    public static final class C0155a {
        static final /* synthetic */ C0155a a = new C0155a();

        private C0155a() {
        }
    }

    /* compiled from: CellDao.kt */
    public static final class b {
        public static kotlinx.coroutines.r2.c<List<com.parizene.netmonitor.db.celllog.i.e>> a(a aVar, String str, String str2, String str3, boolean z, boolean z2, int i2, int i3) {
            l.d(aVar, "this");
            return kotlinx.coroutines.r2.e.a(aVar.n(str, str2, str3, z, z2, i2, i3));
        }
    }

    int a();

    long[] b(List<? extends com.parizene.netmonitor.db.celllog.i.b> list);

    List<com.parizene.netmonitor.db.celllog.i.b> c(long j2, long j3);

    List<com.parizene.netmonitor.db.celllog.i.e> d(boolean z, boolean z2, long j2, long j3);

    List<com.parizene.netmonitor.db.celllog.i.f> e(boolean z, boolean z2, com.parizene.netmonitor.db.celllog.i.g gVar, long j2, long j3);

    int f(long j2);

    Object g(long j2, i.v.d<? super Integer> dVar);

    com.parizene.netmonitor.db.celllog.i.e h(String str, String str2, int i2, long j2, boolean z, boolean z2);

    List<o> i();

    LiveData<List<com.parizene.netmonitor.db.celllog.i.e>> j(boolean z, boolean z2, int i2, int i3, int i4, int i5);

    long k(com.parizene.netmonitor.db.celllog.i.b bVar);

    int l(com.parizene.netmonitor.db.celllog.i.b bVar);

    int m();

    kotlinx.coroutines.r2.c<List<com.parizene.netmonitor.db.celllog.i.e>> n(String str, String str2, String str3, boolean z, boolean z2, int i2, int i3);

    kotlinx.coroutines.r2.c<List<com.parizene.netmonitor.db.celllog.i.e>> o(String str, String str2, String str3, boolean z, boolean z2, int i2, int i3);
}