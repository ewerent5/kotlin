package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.l.k;
import androidx.work.k;
import androidx.work.n;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: e */
    private final androidx.work.impl.b f2345e = new androidx.work.impl.b();

    /* compiled from: CancelWorkRunnable.java */
    /* renamed from: androidx.work.impl.utils.a$a */
    static class C0035a extends a {

        /* renamed from: f */
        final /* synthetic */ androidx.work.impl.h f2346f;

        /* renamed from: g */
        final /* synthetic */ String f2347g;

        C0035a(androidx.work.impl.h hVar, String str) {
            this.f2346f = hVar;
            this.f2347g = str;
        }

        @Override // androidx.work.impl.utils.a
        void g() {
            WorkDatabase workDatabaseN = this.f2346f.n();
            workDatabaseN.c();
            try {
                Iterator<String> it = workDatabaseN.M().o(this.f2347g).iterator();
                while (it.hasNext()) {
                    a(this.f2346f, it.next());
                }
                workDatabaseN.D();
                workDatabaseN.h();
                f(this.f2346f);
            } catch (Throwable th) {
                workDatabaseN.h();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable.java */
    static class b extends a {

        /* renamed from: f */
        final /* synthetic */ androidx.work.impl.h f2348f;

        /* renamed from: g */
        final /* synthetic */ String f2349g;

        /* renamed from: h */
        final /* synthetic */ boolean f2350h;

        b(androidx.work.impl.h hVar, String str, boolean z) {
            this.f2348f = hVar;
            this.f2349g = str;
            this.f2350h = z;
        }

        @Override // androidx.work.impl.utils.a
        void g() {
            WorkDatabase workDatabaseN = this.f2348f.n();
            workDatabaseN.c();
            try {
                Iterator<String> it = workDatabaseN.M().k(this.f2349g).iterator();
                while (it.hasNext()) {
                    a(this.f2348f, it.next());
                }
                workDatabaseN.D();
                workDatabaseN.h();
                if (this.f2350h) {
                    f(this.f2348f);
                }
            } catch (Throwable th) {
                workDatabaseN.h();
                throw th;
            }
        }
    }

    public static a b(String str, androidx.work.impl.h hVar, boolean z) {
        return new b(hVar, str, z);
    }

    public static a c(String str, androidx.work.impl.h hVar) {
        return new C0035a(hVar, str);
    }

    private void e(WorkDatabase workDatabase, String str) {
        k kVarM = workDatabase.M();
        androidx.work.impl.l.b bVarG = workDatabase.G();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            n.a aVarL = kVarM.l(str2);
            if (aVarL != n.a.SUCCEEDED && aVarL != n.a.FAILED) {
                kVarM.a(n.a.CANCELLED, str2);
            }
            linkedList.addAll(bVarG.b(str2));
        }
    }

    void a(androidx.work.impl.h hVar, String str) {
        e(hVar.n(), str);
        hVar.l().h(str);
        Iterator<androidx.work.impl.d> it = hVar.m().iterator();
        while (it.hasNext()) {
            it.next().d(str);
        }
    }

    public androidx.work.k d() {
        return this.f2345e;
    }

    void f(androidx.work.impl.h hVar) {
        androidx.work.impl.e.b(hVar.h(), hVar.n(), hVar.m());
    }

    abstract void g();

    @Override // java.lang.Runnable
    public void run() {
        try {
            g();
            this.f2345e.a(androidx.work.k.a);
        } catch (Throwable th) {
            this.f2345e.a(new k.b.a(th));
        }
    }
}