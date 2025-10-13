package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.l.j;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.k;
import java.util.Iterator;
import java.util.List;

/* compiled from: EnqueueRunnable.java */
/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private static final String f2351e = androidx.work.h.f("EnqueueRunnable");

    /* renamed from: f, reason: collision with root package name */
    private final androidx.work.impl.f f2352f;

    /* renamed from: g, reason: collision with root package name */
    private final androidx.work.impl.b f2353g = new androidx.work.impl.b();

    public b(androidx.work.impl.f fVar) {
        this.f2352f = fVar;
    }

    private static boolean b(androidx.work.impl.f fVar) {
        boolean zC = c(fVar.g(), fVar.f(), (String[]) androidx.work.impl.f.l(fVar).toArray(new String[0]), fVar.d(), fVar.b());
        fVar.k();
        return zC;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a4 A[LOOP:6: B:111:0x019e->B:113:0x01a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca A[PHI: r1 r9 r12 r13 r14
  0x00ca: PHI (r1v1 java.lang.String[]) = (r1v0 java.lang.String[]), (r1v0 java.lang.String[]), (r1v4 java.lang.String[]), (r1v4 java.lang.String[]) binds: [B:32:0x006c, B:34:0x007a, B:57:0x00c9, B:56:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r9v2 boolean) = (r9v1 boolean), (r9v1 boolean), (r9v5 boolean), (r9v6 boolean) binds: [B:32:0x006c, B:34:0x007a, B:57:0x00c9, B:56:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v4 boolean), (r12v4 boolean) binds: [B:32:0x006c, B:34:0x007a, B:57:0x00c9, B:56:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v4 boolean), (r13v4 boolean) binds: [B:32:0x006c, B:34:0x007a, B:57:0x00c9, B:56:0x00c7] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r14v2 boolean) = (r14v1 boolean), (r14v1 boolean), (r14v4 boolean), (r14v4 boolean) binds: [B:32:0x006c, B:34:0x007a, B:57:0x00c9, B:56:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(androidx.work.impl.h r19, java.util.List<? extends androidx.work.p> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.f r23) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.b.c(androidx.work.impl.h, java.util.List, java.lang.String[], java.lang.String, androidx.work.f):boolean");
    }

    private static boolean e(androidx.work.impl.f fVar) {
        List<androidx.work.impl.f> listE = fVar.e();
        boolean z = false;
        if (listE != null) {
            boolean zE = false;
            for (androidx.work.impl.f fVar2 : listE) {
                if (fVar2.j()) {
                    androidx.work.h.c().h(f2351e, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", fVar2.c())), new Throwable[0]);
                } else {
                    zE |= e(fVar2);
                }
            }
            z = zE;
        }
        return b(fVar) | z;
    }

    private static void g(j jVar) {
        androidx.work.c cVar = jVar.f2311l;
        if (cVar.f() || cVar.i()) {
            String str = jVar.f2304e;
            e.a aVar = new e.a();
            aVar.c(jVar.f2306g).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            jVar.f2304e = ConstraintTrackingWorker.class.getName();
            jVar.f2306g = aVar.a();
        }
    }

    private static boolean h(androidx.work.impl.h hVar, String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(str);
            Iterator<androidx.work.impl.d> it = hVar.m().iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(it.next().getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase workDatabaseN = this.f2352f.g().n();
        workDatabaseN.c();
        try {
            boolean zE = e(this.f2352f);
            workDatabaseN.D();
            return zE;
        } finally {
            workDatabaseN.h();
        }
    }

    public k d() {
        return this.f2353g;
    }

    public void f() {
        androidx.work.impl.h hVarG = this.f2352f.g();
        androidx.work.impl.e.b(hVarG.h(), hVarG.n(), hVarG.m());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f2352f.h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f2352f));
            }
            if (a()) {
                d.a(this.f2352f.g().g(), RescheduleReceiver.class, true);
                f();
            }
            this.f2353g.a(k.a);
        } catch (Throwable th) {
            this.f2353g.a(new k.b.a(th));
        }
    }
}