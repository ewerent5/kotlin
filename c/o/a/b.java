package c.o.a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.k;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import c.e.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes.dex */
class b extends c.o.a.a {
    static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private final k f3269b;

    /* renamed from: c, reason: collision with root package name */
    private final c f3270c;

    /* compiled from: LoaderManagerImpl.java */
    public static class a<D> extends q<D> {

        /* renamed from: k, reason: collision with root package name */
        private final int f3271k;

        /* renamed from: l, reason: collision with root package name */
        private final Bundle f3272l;

        /* renamed from: m, reason: collision with root package name */
        private final c.o.b.a<D> f3273m;
        private k n;
        private C0066b<D> o;
        private c.o.b.a<D> p;

        @Override // androidx.lifecycle.LiveData
        protected void h() {
            if (b.a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void i() {
            if (b.a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void k(r<? super D> rVar) {
            super.k(rVar);
            this.n = null;
        }

        @Override // androidx.lifecycle.q, androidx.lifecycle.LiveData
        public void l(D d2) {
            super.l(d2);
            if (this.p != null) {
                throw null;
            }
        }

        c.o.b.a<D> m(boolean z) {
            if (b.a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void n(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3271k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3272l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f3273m);
            String str2 = str + "  ";
            throw null;
        }

        void o() {
            k kVar = this.n;
            C0066b<D> c0066b = this.o;
            if (kVar == null || c0066b == null) {
                return;
            }
            super.k(c0066b);
            f(kVar, c0066b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3271k);
            sb.append(" : ");
            c.h.k.a.a(this.f3273m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: c.o.a.b$b, reason: collision with other inner class name */
    static class C0066b<D> implements r<D> {
    }

    /* compiled from: LoaderManagerImpl.java */
    static class c extends x {

        /* renamed from: c, reason: collision with root package name */
        private static final z.a f3274c = new a();

        /* renamed from: d, reason: collision with root package name */
        private h<a> f3275d = new h<>();

        /* renamed from: e, reason: collision with root package name */
        private boolean f3276e = false;

        /* compiled from: LoaderManagerImpl.java */
        static class a implements z.a {
            a() {
            }

            @Override // androidx.lifecycle.z.a
            public <T extends x> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c g(a0 a0Var) {
            return (c) new z(a0Var, f3274c).a(c.class);
        }

        @Override // androidx.lifecycle.x
        protected void d() {
            super.d();
            int iN = this.f3275d.n();
            for (int i2 = 0; i2 < iN; i2++) {
                this.f3275d.o(i2).m(true);
            }
            this.f3275d.b();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3275d.n() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i2 = 0; i2 < this.f3275d.n(); i2++) {
                    a aVarO = this.f3275d.o(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3275d.j(i2));
                    printWriter.print(": ");
                    printWriter.println(aVarO.toString());
                    aVarO.n(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void h() {
            int iN = this.f3275d.n();
            for (int i2 = 0; i2 < iN; i2++) {
                this.f3275d.o(i2).o();
            }
        }
    }

    b(k kVar, a0 a0Var) {
        this.f3269b = kVar;
        this.f3270c = c.g(a0Var);
    }

    @Override // c.o.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3270c.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // c.o.a.a
    public void c() {
        this.f3270c.h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        c.h.k.a.a(this.f3269b, sb);
        sb.append("}}");
        return sb.toString();
    }
}