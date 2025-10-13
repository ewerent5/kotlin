package m.a;

import android.os.Build;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Timber.java */
/* loaded from: classes3.dex */
public final class a {
    private static final c[] a;

    /* renamed from: c */
    static volatile c[] f17189c;

    /* renamed from: b */
    private static final List<c> f17188b = new ArrayList();

    /* renamed from: d */
    private static final c f17190d = new C0231a();

    /* compiled from: Timber.java */
    /* renamed from: m.a.a$a */
    static class C0231a extends c {
        C0231a() {
        }

        @Override // m.a.a.c
        public void a(String str, Object... objArr) {
            for (c cVar : a.f17189c) {
                cVar.a(str, objArr);
            }
        }

        @Override // m.a.a.c
        public void e(String str, Object... objArr) {
            for (c cVar : a.f17189c) {
                cVar.e(str, objArr);
            }
        }

        @Override // m.a.a.c
        protected void h(int i2, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }

        @Override // m.a.a.c
        public void i(int i2, String str, Object... objArr) {
            for (c cVar : a.f17189c) {
                cVar.i(i2, str, objArr);
            }
        }

        @Override // m.a.a.c
        public void k(String str, Object... objArr) {
            for (c cVar : a.f17189c) {
                cVar.k(str, objArr);
            }
        }

        @Override // m.a.a.c
        public void l(Throwable th) {
            for (c cVar : a.f17189c) {
                cVar.l(th);
            }
        }

        @Override // m.a.a.c
        public void m(Throwable th, String str, Object... objArr) {
            for (c cVar : a.f17189c) {
                cVar.m(th, str, objArr);
            }
        }
    }

    /* compiled from: Timber.java */
    public static class b extends c {

        /* renamed from: b */
        private static final Pattern f17191b = Pattern.compile("(\\$\\d+)+$");

        @Override // m.a.a.c
        final String d() {
            String strD = super.d();
            if (strD != null) {
                return strD;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 5) {
                return n(stackTrace[5]);
            }
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
        }

        protected String n(StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            Matcher matcher = f17191b.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll("");
            }
            String strSubstring = className.substring(className.lastIndexOf(46) + 1);
            return (strSubstring.length() <= 23 || Build.VERSION.SDK_INT >= 24) ? strSubstring : strSubstring.substring(0, 23);
        }
    }

    /* compiled from: Timber.java */
    public static abstract class c {
        final ThreadLocal<String> a = new ThreadLocal<>();

        private String c(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        private void j(int i2, Throwable th, String str, Object... objArr) {
            String strD = d();
            if (g(strD, i2)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = b(str, objArr);
                    }
                    if (th != null) {
                        str = str + "\n" + c(th);
                    }
                } else if (th == null) {
                    return;
                } else {
                    str = c(th);
                }
                h(i2, strD, str, th);
            }
        }

        public void a(String str, Object... objArr) {
            j(3, null, str, objArr);
        }

        protected String b(String str, Object[] objArr) {
            return String.format(str, objArr);
        }

        String d() {
            String str = this.a.get();
            if (str != null) {
                this.a.remove();
            }
            return str;
        }

        public void e(String str, Object... objArr) {
            j(4, null, str, objArr);
        }

        @Deprecated
        protected boolean f(int i2) {
            return true;
        }

        protected boolean g(String str, int i2) {
            return f(i2);
        }

        protected abstract void h(int i2, String str, String str2, Throwable th);

        public void i(int i2, String str, Object... objArr) {
            j(i2, null, str, objArr);
        }

        public void k(String str, Object... objArr) {
            j(5, null, str, objArr);
        }

        public void l(Throwable th) {
            j(5, th, null, new Object[0]);
        }

        public void m(Throwable th, String str, Object... objArr) {
            j(5, th, str, objArr);
        }
    }

    static {
        c[] cVarArr = new c[0];
        a = cVarArr;
        f17189c = cVarArr;
    }

    public static void a(String str, Object... objArr) {
        f17190d.a(str, objArr);
    }

    public static void b(String str, Object... objArr) {
        f17190d.e(str, objArr);
    }

    public static void c(int i2, String str, Object... objArr) {
        f17190d.i(i2, str, objArr);
    }

    public static void d(c cVar) {
        Objects.requireNonNull(cVar, "tree == null");
        if (cVar == f17190d) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        List<c> list = f17188b;
        synchronized (list) {
            list.add(cVar);
            f17189c = (c[]) list.toArray(new c[list.size()]);
        }
    }

    public static void e(c cVar) {
        List<c> list = f17188b;
        synchronized (list) {
            if (!list.remove(cVar)) {
                throw new IllegalArgumentException("Cannot uproot tree which is not planted: " + cVar);
            }
            f17189c = (c[]) list.toArray(new c[list.size()]);
        }
    }

    public static void f(String str, Object... objArr) {
        f17190d.k(str, objArr);
    }

    public static void g(Throwable th) {
        f17190d.l(th);
    }

    public static void h(Throwable th, String str, Object... objArr) {
        f17190d.m(th, str, objArr);
    }
}