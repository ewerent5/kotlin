package androidx.work;

import android.util.Log;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public abstract class h {
    private static h a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final int f2128b = 20;

    /* compiled from: Logger.java */
    public static class a extends h {

        /* renamed from: c, reason: collision with root package name */
        private int f2129c;

        public a(int i2) {
            super(i2);
            this.f2129c = i2;
        }

        @Override // androidx.work.h
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f2129c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.h
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f2129c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.h
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f2129c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.h
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f2129c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // androidx.work.h
        public void h(String str, String str2, Throwable... thArr) {
            if (this.f2129c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public h(int i2) {
    }

    public static synchronized h c() {
        if (a == null) {
            a = new a(3);
        }
        return a;
    }

    public static synchronized void e(h hVar) {
        a = hVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i2 = f2128b;
        if (length >= i2) {
            sb.append(str.substring(0, i2));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}