package androidx.work;

import android.annotation.SuppressLint;

/* compiled from: Operation.java */
/* loaded from: classes.dex */
public interface k {

    @SuppressLint({"SyntheticAccessor"})
    public static final b.c a;

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C0038b f2406b;

    /* compiled from: Operation.java */
    public static abstract class b {

        /* compiled from: Operation.java */
        public static final class a extends b {
            private final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public Throwable a() {
                return this.a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.a.getMessage());
            }
        }

        /* compiled from: Operation.java */
        /* renamed from: androidx.work.k$b$b, reason: collision with other inner class name */
        public static final class C0038b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0038b() {
            }
        }

        /* compiled from: Operation.java */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        a = new b.c();
        f2406b = new b.C0038b();
    }
}