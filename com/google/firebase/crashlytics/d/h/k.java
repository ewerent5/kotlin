package com.google.firebase.crashlytics.d.h;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.firebase.crashlytics.d.h.q;
import com.google.firebase.crashlytics.d.i.b;
import com.google.firebase.crashlytics.d.n.b;
import com.google.firebase.crashlytics.d.n.c.c;
import j$.util.Comparator;
import j$.util.Spliterator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes.dex */
class k {
    static final FilenameFilter a = new i("BeginSession");

    /* renamed from: b, reason: collision with root package name */
    static final FilenameFilter f12375b = com.google.firebase.crashlytics.d.h.j.a();

    /* renamed from: c, reason: collision with root package name */
    static final FilenameFilter f12376c = new n();

    /* renamed from: d, reason: collision with root package name */
    static final Comparator<File> f12377d = new o();

    /* renamed from: e, reason: collision with root package name */
    static final Comparator<File> f12378e = new p();

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f12379f = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, String> f12380g = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f12381h = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    private final com.google.firebase.crashlytics.d.f.a A;
    private final g0 B;
    private com.google.firebase.crashlytics.d.h.q C;

    /* renamed from: j, reason: collision with root package name */
    private final Context f12383j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.h.s f12384k;

    /* renamed from: l, reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.h.n f12385l;

    /* renamed from: m, reason: collision with root package name */
    private final i0 f12386m;
    private final com.google.firebase.crashlytics.d.h.i n;
    private final com.google.firebase.crashlytics.d.k.c o;
    private final com.google.firebase.crashlytics.d.h.x p;
    private final com.google.firebase.crashlytics.d.l.h q;
    private final com.google.firebase.crashlytics.d.h.b r;
    private final b.InterfaceC0149b s;
    private final z t;
    private final com.google.firebase.crashlytics.d.i.b u;
    private final com.google.firebase.crashlytics.d.n.a v;
    private final b.a w;
    private final com.google.firebase.crashlytics.d.a x;
    private final com.google.firebase.crashlytics.d.q.d y;
    private final String z;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f12382i = new AtomicInteger(0);
    e.c.b.b.e.i<Boolean> D = new e.c.b.b.e.i<>();
    e.c.b.b.e.i<Boolean> E = new e.c.b.b.e.i<>();
    e.c.b.b.e.i<Void> F = new e.c.b.b.e.i<>();
    AtomicBoolean G = new AtomicBoolean(false);

    /* compiled from: CrashlyticsController.java */
    class a implements Callable<Void> {
        final /* synthetic */ long a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12387b;

        a(long j2, String str) {
            this.a = j2;
            this.f12387b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (k.this.i0()) {
                return null;
            }
            k.this.u.i(this.a, this.f12387b);
            return null;
        }
    }

    /* compiled from: CrashlyticsController.java */
    private final class a0 implements b.c {
        private a0() {
        }

        @Override // com.google.firebase.crashlytics.d.n.b.c
        public File[] a() {
            return k.this.o0();
        }

        @Override // com.google.firebase.crashlytics.d.n.b.c
        public File[] b() {
            return k.this.l0();
        }

        /* synthetic */ a0(k kVar, i iVar) {
            this();
        }
    }

    /* compiled from: CrashlyticsController.java */
    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Date f12389e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Throwable f12390f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Thread f12391g;

        b(Date date, Throwable th, Thread thread) {
            this.f12389e = date;
            this.f12390f = th;
            this.f12391g = thread;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            if (k.this.i0()) {
                return;
            }
            long jE0 = k.e0(this.f12389e);
            String strW = k.this.W();
            if (strW == null) {
                com.google.firebase.crashlytics.d.b.f().b("Tried to write a non-fatal exception while no session was open.");
            } else {
                k.this.B.k(this.f12390f, this.f12391g, k.u0(strW), jE0);
                k.this.O(this.f12391g, this.f12390f, strW, jE0);
            }
        }
    }

    /* compiled from: CrashlyticsController.java */
    private final class b0 implements b.a {
        private b0() {
        }

        @Override // com.google.firebase.crashlytics.d.n.b.a
        public boolean a() {
            return k.this.i0();
        }

        /* synthetic */ b0(k kVar, i iVar) {
            this();
        }
    }

    /* compiled from: CrashlyticsController.java */
    class c implements Callable<Void> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Throwable {
            k.this.L();
            return null;
        }
    }

    /* compiled from: CrashlyticsController.java */
    private static final class c0 implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final Context f12393e;

        /* renamed from: f, reason: collision with root package name */
        private final com.google.firebase.crashlytics.d.n.c.c f12394f;

        /* renamed from: g, reason: collision with root package name */
        private final com.google.firebase.crashlytics.d.n.b f12395g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f12396h;

        public c0(Context context, com.google.firebase.crashlytics.d.n.c.c cVar, com.google.firebase.crashlytics.d.n.b bVar, boolean z) {
            this.f12393e = context;
            this.f12394f = cVar;
            this.f12395g = bVar;
            this.f12396h = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.google.firebase.crashlytics.d.h.h.c(this.f12393e)) {
                com.google.firebase.crashlytics.d.b.f().b("Attempting to send crash report at time of crash...");
                this.f12395g.d(this.f12394f, this.f12396h);
            }
        }
    }

    /* compiled from: CrashlyticsController.java */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.I(kVar.n0(new y()));
        }
    }

    /* compiled from: CrashlyticsController.java */
    static class d0 implements FilenameFilter {
        private final String a;

        public d0(String str) {
            this.a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(".cls");
            return (str.equals(sb.toString()) || !str.contains(this.a) || str.endsWith(".cls_temp")) ? false : true;
        }
    }

    /* compiled from: CrashlyticsController.java */
    class e implements FilenameFilter {
        final /* synthetic */ Set a;

        e(Set set) {
            this.a = set;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            if (str.length() < 35) {
                return false;
            }
            return this.a.contains(str.substring(0, 35));
        }
    }

    /* compiled from: CrashlyticsController.java */
    class f implements w {
        final /* synthetic */ String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12399b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f12400c;

        f(String str, String str2, long j2) {
            this.a = str;
            this.f12399b = str2;
            this.f12400c = j2;
        }

        @Override // com.google.firebase.crashlytics.d.h.k.w
        public void a(com.google.firebase.crashlytics.d.m.c cVar) throws IOException {
            com.google.firebase.crashlytics.d.m.d.p(cVar, this.a, this.f12399b, this.f12400c);
        }
    }

    /* compiled from: CrashlyticsController.java */
    class g implements w {
        final /* synthetic */ String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12402b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f12403c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f12404d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f12405e;

        g(String str, String str2, String str3, String str4, int i2) {
            this.a = str;
            this.f12402b = str2;
            this.f12403c = str3;
            this.f12404d = str4;
            this.f12405e = i2;
        }

        @Override // com.google.firebase.crashlytics.d.h.k.w
        public void a(com.google.firebase.crashlytics.d.m.c cVar) throws IOException {
            com.google.firebase.crashlytics.d.m.d.r(cVar, this.a, this.f12402b, this.f12403c, this.f12404d, this.f12405e, k.this.z);
        }
    }

    /* compiled from: CrashlyticsController.java */
    class h implements w {
        final /* synthetic */ String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12407b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f12408c;

        h(String str, String str2, boolean z) {
            this.a = str;
            this.f12407b = str2;
            this.f12408c = z;
        }

        @Override // com.google.firebase.crashlytics.d.h.k.w
        public void a(com.google.firebase.crashlytics.d.m.c cVar) throws IOException {
            com.google.firebase.crashlytics.d.m.d.B(cVar, this.a, this.f12407b, this.f12408c);
        }
    }

    /* compiled from: CrashlyticsController.java */
    class i extends x {
        i(String str) {
            super(str);
        }

        @Override // com.google.firebase.crashlytics.d.h.k.x, java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(".cls");
        }
    }

    /* compiled from: CrashlyticsController.java */
    class j implements w {
        final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12410b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12411c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f12412d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f12413e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f12414f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f12415g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f12416h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f12417i;

        j(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
            this.a = i2;
            this.f12410b = str;
            this.f12411c = i3;
            this.f12412d = j2;
            this.f12413e = j3;
            this.f12414f = z;
            this.f12415g = i4;
            this.f12416h = str2;
            this.f12417i = str3;
        }

        @Override // com.google.firebase.crashlytics.d.h.k.w
        public void a(com.google.firebase.crashlytics.d.m.c cVar) throws IOException {
            com.google.firebase.crashlytics.d.m.d.t(cVar, this.a, this.f12410b, this.f12411c, this.f12412d, this.f12413e, this.f12414f, this.f12415g, this.f12416h, this.f12417i);
        }
    }

    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.d.h.k$k, reason: collision with other inner class name */
    class C0129k implements w {
        final /* synthetic */ i0 a;

        C0129k(i0 i0Var) {
            this.a = i0Var;
        }

        @Override // com.google.firebase.crashlytics.d.h.k.w
        public void a(com.google.firebase.crashlytics.d.m.c cVar) throws IOException {
            com.google.firebase.crashlytics.d.m.d.C(cVar, this.a.b(), null, null);
        }
    }

    /* compiled from: CrashlyticsController.java */
    class l implements w {
        final /* synthetic */ String a;

        l(String str) {
            this.a = str;
        }

        @Override // com.google.firebase.crashlytics.d.h.k.w
        public void a(com.google.firebase.crashlytics.d.m.c cVar) throws IOException {
            com.google.firebase.crashlytics.d.m.d.s(cVar, this.a);
        }
    }

    /* compiled from: CrashlyticsController.java */
    class m implements Callable<Void> {
        final /* synthetic */ long a;

        m(long j2) {
            this.a = j2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.a);
            k.this.A.a("_ae", bundle);
            return null;
        }
    }

    /* compiled from: CrashlyticsController.java */
    class n implements FilenameFilter {
        n() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(".cls");
        }
    }

    /* compiled from: CrashlyticsController.java */
    class o implements Comparator<File>, j$.util.Comparator {
        o() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ Comparator reversed() {
            return Collections.reverseOrder(this);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ Comparator thenComparing(Function function) {
            return Comparator.CC.$default$thenComparing(this, function);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, function, comparator);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, comparator);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }
    }

    /* compiled from: CrashlyticsController.java */
    class p implements java.util.Comparator<File>, j$.util.Comparator {
        p() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator reversed() {
            return Collections.reverseOrder(this);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function) {
            return Comparator.CC.$default$thenComparing(this, function);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, function, comparator);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, comparator);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }
    }

    /* compiled from: CrashlyticsController.java */
    class q implements q.a {
        q() {
        }

        @Override // com.google.firebase.crashlytics.d.h.q.a
        public void a(com.google.firebase.crashlytics.d.p.e eVar, Thread thread, Throwable th) {
            k.this.h0(eVar, thread, th);
        }
    }

    /* compiled from: CrashlyticsController.java */
    class r implements Callable<e.c.b.b.e.h<Void>> {
        final /* synthetic */ Date a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f12421b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f12422c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.d.p.e f12423d;

        /* compiled from: CrashlyticsController.java */
        class a implements e.c.b.b.e.g<com.google.firebase.crashlytics.d.p.i.b, Void> {
            final /* synthetic */ Executor a;

            a(Executor executor) {
                this.a = executor;
            }

            @Override // e.c.b.b.e.g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e.c.b.b.e.h<Void> a(com.google.firebase.crashlytics.d.p.i.b bVar) throws Throwable {
                if (bVar == null) {
                    com.google.firebase.crashlytics.d.b.f().i("Received null app settings, cannot send reports at crash time.");
                    return e.c.b.b.e.k.d(null);
                }
                k.this.x0(bVar, true);
                return e.c.b.b.e.k.f(k.this.t0(), k.this.B.m(this.a, com.google.firebase.crashlytics.d.h.t.a(bVar)));
            }
        }

        r(Date date, Throwable th, Thread thread, com.google.firebase.crashlytics.d.p.e eVar) {
            this.a = date;
            this.f12421b = th;
            this.f12422c = thread;
            this.f12423d = eVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e.c.b.b.e.h<Void> call() throws Throwable {
            long jE0 = k.e0(this.a);
            String strW = k.this.W();
            if (strW == null) {
                com.google.firebase.crashlytics.d.b.f().d("Tried to write a fatal exception while no session was open.");
                return e.c.b.b.e.k.d(null);
            }
            k.this.f12385l.a();
            k.this.B.j(this.f12421b, this.f12422c, k.u0(strW), jE0);
            k.this.N(this.f12422c, this.f12421b, strW, jE0);
            k.this.M(this.a.getTime());
            com.google.firebase.crashlytics.d.p.i.e eVarB = this.f12423d.b();
            int i2 = eVarB.b().a;
            int i3 = eVarB.b().f12750b;
            k.this.J(i2);
            k.this.L();
            k.this.C0(i3);
            if (!k.this.f12384k.d()) {
                return e.c.b.b.e.k.d(null);
            }
            Executor executorC = k.this.n.c();
            return this.f12423d.a().p(executorC, new a(executorC));
        }
    }

    /* compiled from: CrashlyticsController.java */
    class s implements e.c.b.b.e.g<Void, Boolean> {
        s() {
        }

        @Override // e.c.b.b.e.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e.c.b.b.e.h<Boolean> a(Void r1) {
            return e.c.b.b.e.k.d(Boolean.TRUE);
        }
    }

    /* compiled from: CrashlyticsController.java */
    class t implements e.c.b.b.e.g<Boolean, Void> {
        final /* synthetic */ e.c.b.b.e.h a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f12426b;

        /* compiled from: CrashlyticsController.java */
        class a implements Callable<e.c.b.b.e.h<Void>> {
            final /* synthetic */ Boolean a;

            /* compiled from: CrashlyticsController.java */
            /* renamed from: com.google.firebase.crashlytics.d.h.k$t$a$a, reason: collision with other inner class name */
            class C0130a implements e.c.b.b.e.g<com.google.firebase.crashlytics.d.p.i.b, Void> {
                final /* synthetic */ List a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f12429b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Executor f12430c;

                C0130a(List list, boolean z, Executor executor) {
                    this.a = list;
                    this.f12429b = z;
                    this.f12430c = executor;
                }

                @Override // e.c.b.b.e.g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public e.c.b.b.e.h<Void> a(com.google.firebase.crashlytics.d.p.i.b bVar) throws Throwable {
                    if (bVar == null) {
                        com.google.firebase.crashlytics.d.b.f().i("Received null app settings, cannot send reports during app startup.");
                        return e.c.b.b.e.k.d(null);
                    }
                    for (com.google.firebase.crashlytics.d.n.c.c cVar : this.a) {
                        if (cVar.getType() == c.a.JAVA) {
                            k.z(bVar.f12746f, cVar.c());
                        }
                    }
                    k.this.t0();
                    k.this.s.a(bVar).e(this.a, this.f12429b, t.this.f12426b);
                    k.this.B.m(this.f12430c, com.google.firebase.crashlytics.d.h.t.a(bVar));
                    k.this.F.e(null);
                    return e.c.b.b.e.k.d(null);
                }
            }

            a(Boolean bool) {
                this.a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e.c.b.b.e.h<Void> call() {
                List<com.google.firebase.crashlytics.d.n.c.c> listD = k.this.v.d();
                if (this.a.booleanValue()) {
                    com.google.firebase.crashlytics.d.b.f().b("Reports are being sent.");
                    boolean zBooleanValue = this.a.booleanValue();
                    k.this.f12384k.c(zBooleanValue);
                    Executor executorC = k.this.n.c();
                    return t.this.a.p(executorC, new C0130a(listD, zBooleanValue, executorC));
                }
                com.google.firebase.crashlytics.d.b.f().b("Reports are being deleted.");
                k.G(k.this.k0());
                k.this.v.c(listD);
                k.this.B.l();
                k.this.F.e(null);
                return e.c.b.b.e.k.d(null);
            }
        }

        t(e.c.b.b.e.h hVar, float f2) {
            this.a = hVar;
            this.f12426b = f2;
        }

        @Override // e.c.b.b.e.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e.c.b.b.e.h<Void> a(Boolean bool) {
            return k.this.n.i(new a(bool));
        }
    }

    /* compiled from: CrashlyticsController.java */
    class u implements b.InterfaceC0149b {
        u() {
        }

        @Override // com.google.firebase.crashlytics.d.n.b.InterfaceC0149b
        public com.google.firebase.crashlytics.d.n.b a(com.google.firebase.crashlytics.d.p.i.b bVar) {
            String str = bVar.f12743c;
            String str2 = bVar.f12744d;
            return new com.google.firebase.crashlytics.d.n.b(bVar.f12746f, k.this.r.a, com.google.firebase.crashlytics.d.h.t.a(bVar), k.this.v, k.this.V(str, str2), k.this.w);
        }
    }

    /* compiled from: CrashlyticsController.java */
    private static class v implements FilenameFilter {
        private v() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return !k.f12376c.accept(file, str) && k.f12379f.matcher(str).matches();
        }

        /* synthetic */ v(i iVar) {
            this();
        }
    }

    /* compiled from: CrashlyticsController.java */
    private interface w {
        void a(com.google.firebase.crashlytics.d.m.c cVar);
    }

    /* compiled from: CrashlyticsController.java */
    static class x implements FilenameFilter {
        private final String a;

        public x(String str) {
            this.a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.contains(this.a) && !str.endsWith(".cls_temp");
        }
    }

    /* compiled from: CrashlyticsController.java */
    static class y implements FilenameFilter {
        y() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return com.google.firebase.crashlytics.d.m.b.f12681e.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* compiled from: CrashlyticsController.java */
    private static final class z implements b.InterfaceC0132b {
        private final com.google.firebase.crashlytics.d.l.h a;

        public z(com.google.firebase.crashlytics.d.l.h hVar) {
            this.a = hVar;
        }

        @Override // com.google.firebase.crashlytics.d.i.b.InterfaceC0132b
        public File a() {
            File file = new File(this.a.b(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    k(Context context, com.google.firebase.crashlytics.d.h.i iVar, com.google.firebase.crashlytics.d.k.c cVar, com.google.firebase.crashlytics.d.h.x xVar, com.google.firebase.crashlytics.d.h.s sVar, com.google.firebase.crashlytics.d.l.h hVar, com.google.firebase.crashlytics.d.h.n nVar, com.google.firebase.crashlytics.d.h.b bVar, com.google.firebase.crashlytics.d.n.a aVar, b.InterfaceC0149b interfaceC0149b, com.google.firebase.crashlytics.d.a aVar2, com.google.firebase.crashlytics.d.f.a aVar3, com.google.firebase.crashlytics.d.p.e eVar) {
        this.f12383j = context;
        this.n = iVar;
        this.o = cVar;
        this.p = xVar;
        this.f12384k = sVar;
        this.q = hVar;
        this.f12385l = nVar;
        this.r = bVar;
        if (interfaceC0149b != null) {
            this.s = interfaceC0149b;
        } else {
            this.s = F();
        }
        this.x = aVar2;
        this.z = bVar.f12346g.a();
        this.A = aVar3;
        i0 i0Var = new i0();
        this.f12386m = i0Var;
        z zVar = new z(hVar);
        this.t = zVar;
        com.google.firebase.crashlytics.d.i.b bVar2 = new com.google.firebase.crashlytics.d.i.b(context, zVar);
        this.u = bVar2;
        i iVar2 = null;
        this.v = aVar == null ? new com.google.firebase.crashlytics.d.n.a(new a0(this, iVar2)) : aVar;
        this.w = new b0(this, iVar2);
        com.google.firebase.crashlytics.d.q.a aVar4 = new com.google.firebase.crashlytics.d.q.a(Spliterator.IMMUTABLE, new com.google.firebase.crashlytics.d.q.c(10));
        this.y = aVar4;
        this.B = g0.b(context, xVar, hVar, bVar, bVar2, i0Var, aVar4, eVar);
    }

    private static void A(File file, w wVar) throws Throwable {
        FileOutputStream fileOutputStream;
        com.google.firebase.crashlytics.d.m.c cVarW = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);
            try {
                cVarW = com.google.firebase.crashlytics.d.m.c.w(fileOutputStream);
                wVar.a(cVarW);
                com.google.firebase.crashlytics.d.h.h.j(cVarW, "Failed to flush to append to " + file.getPath());
                com.google.firebase.crashlytics.d.h.h.e(fileOutputStream, "Failed to close " + file.getPath());
            } catch (Throwable th) {
                th = th;
                com.google.firebase.crashlytics.d.h.h.j(cVarW, "Failed to flush to append to " + file.getPath());
                com.google.firebase.crashlytics.d.h.h.e(fileOutputStream, "Failed to close " + file.getPath());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    private void A0(int i2) {
        HashSet hashSet = new HashSet();
        File[] fileArrR0 = r0();
        int iMin = Math.min(i2, fileArrR0.length);
        for (int i3 = 0; i3 < iMin; i3++) {
            hashSet.add(d0(fileArrR0[i3]));
        }
        this.u.b(hashSet);
        w0(n0(new v(null)), hashSet);
    }

    private void B0(String str, int i2) {
        k0.d(Z(), new x(str + "SessionEvent"), i2, f12378e);
    }

    private void C(File[] fileArr, int i2, int i3) throws Throwable {
        com.google.firebase.crashlytics.d.b.f().b("Closing open sessions.");
        while (i2 < fileArr.length) {
            File file = fileArr[i2];
            String strD0 = d0(file);
            com.google.firebase.crashlytics.d.b.f().b("Closing session: " + strD0);
            N0(file, strD0, i3);
            i2++;
        }
    }

    private void D(com.google.firebase.crashlytics.d.m.b bVar) {
        if (bVar == null) {
            return;
        }
        try {
            bVar.b();
        } catch (IOException e2) {
            com.google.firebase.crashlytics.d.b.f().e("Error closing session file stream in the presence of an exception", e2);
        }
    }

    private e.c.b.b.e.h<Boolean> D0() {
        if (this.f12384k.d()) {
            com.google.firebase.crashlytics.d.b.f().b("Automatic data collection is enabled. Allowing upload.");
            this.D.e(Boolean.FALSE);
            return e.c.b.b.e.k.d(Boolean.TRUE);
        }
        com.google.firebase.crashlytics.d.b.f().b("Automatic data collection is disabled.");
        com.google.firebase.crashlytics.d.b.f().b("Notifying that unsent reports are available.");
        this.D.e(Boolean.TRUE);
        e.c.b.b.e.h<TContinuationResult> hVarO = this.f12384k.i().o(new s());
        com.google.firebase.crashlytics.d.b.f().b("Waiting for send/deleteUnsentReports to be called.");
        return k0.h(hVarO, this.E.a());
    }

    private static void E(InputStream inputStream, com.google.firebase.crashlytics.d.m.c cVar, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                break;
            } else {
                i3 += i4;
            }
        }
        cVar.P(bArr);
    }

    private void E0(String str, long j2) throws Throwable {
        String str2 = String.format(Locale.US, "Crashlytics Android SDK/%s", com.google.firebase.crashlytics.d.h.m.i());
        M0(str, "BeginSession", new f(str, str2, j2));
        this.x.d(str, str2, j2);
    }

    private b.InterfaceC0149b F() {
        return new u();
    }

    private void F0(com.google.firebase.crashlytics.d.m.c cVar, String str) throws Throwable {
        for (String str2 : f12381h) {
            File[] fileArrN0 = n0(new x(str + str2 + ".cls"));
            if (fileArrN0.length == 0) {
                com.google.firebase.crashlytics.d.b.f().b("Can't find " + str2 + " data for session ID " + str);
            } else {
                com.google.firebase.crashlytics.d.b.f().b("Collecting " + str2 + " data for session ID " + str);
                P0(cVar, fileArrN0[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(File[] fileArr) {
        if (fileArr == null) {
            return;
        }
        for (File file : fileArr) {
            file.delete();
        }
    }

    private static void G0(com.google.firebase.crashlytics.d.m.c cVar, File[] fileArr, String str) throws Throwable {
        Arrays.sort(fileArr, com.google.firebase.crashlytics.d.h.h.f12358c);
        for (File file : fileArr) {
            try {
                com.google.firebase.crashlytics.d.b.f().b(String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", str, file.getName()));
                P0(cVar, file);
            } catch (Exception e2) {
                com.google.firebase.crashlytics.d.b.f().e("Error writting non-fatal to session.", e2);
            }
        }
    }

    private void I0(String str) throws Throwable {
        String strD = this.p.d();
        com.google.firebase.crashlytics.d.h.b bVar = this.r;
        String str2 = bVar.f12344e;
        String str3 = bVar.f12345f;
        String strA = this.p.a();
        int iB = com.google.firebase.crashlytics.d.h.u.a(this.r.f12342c).b();
        M0(str, "SessionApp", new g(strD, str2, str3, strA, iB));
        this.x.f(str, strD, str2, str3, strA, iB, this.z);
    }

    private void J0(String str) throws Throwable {
        Context contextU = U();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iM = com.google.firebase.crashlytics.d.h.h.m();
        String str2 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jV = com.google.firebase.crashlytics.d.h.h.v();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean zA = com.google.firebase.crashlytics.d.h.h.A(contextU);
        int iN = com.google.firebase.crashlytics.d.h.h.n(contextU);
        String str3 = Build.MANUFACTURER;
        String str4 = Build.PRODUCT;
        M0(str, "SessionDevice", new j(iM, str2, iAvailableProcessors, jV, blockCount, zA, iN, str3, str4));
        this.x.c(str, iM, str2, iAvailableProcessors, jV, blockCount, zA, iN, str3, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K(int i2, boolean z2) throws Throwable {
        A0((z2 ? 1 : 0) + 8);
        File[] fileArrR0 = r0();
        if (fileArrR0.length <= z2) {
            com.google.firebase.crashlytics.d.b.f().b("No open sessions to be closed.");
            return;
        }
        String strD0 = d0(fileArrR0[z2 ? 1 : 0]);
        O0(strD0);
        if (this.x.e(strD0)) {
            R(strD0);
            if (!this.x.a(strD0)) {
                com.google.firebase.crashlytics.d.b.f().b("Could not finalize native session: " + strD0);
            }
        }
        C(fileArrR0, z2 ? 1 : 0, i2);
        this.B.d(X(), z2 != 0 ? u0(d0(fileArrR0[0])) : null);
    }

    private void K0(com.google.firebase.crashlytics.d.m.c cVar, Thread thread, Throwable th, long j2, String str, boolean z2) throws IOException {
        Thread[] threadArr;
        Map<String, String> mapA;
        Map<String, String> treeMap;
        com.google.firebase.crashlytics.d.q.e eVar = new com.google.firebase.crashlytics.d.q.e(th, this.y);
        Context contextU = U();
        com.google.firebase.crashlytics.d.h.e eVarA = com.google.firebase.crashlytics.d.h.e.a(contextU);
        Float fB = eVarA.b();
        int iC = eVarA.c();
        boolean zQ = com.google.firebase.crashlytics.d.h.h.q(contextU);
        int i2 = contextU.getResources().getConfiguration().orientation;
        long jV = com.google.firebase.crashlytics.d.h.h.v() - com.google.firebase.crashlytics.d.h.h.a(contextU);
        long jB = com.google.firebase.crashlytics.d.h.h.b(Environment.getDataDirectory().getPath());
        ActivityManager.RunningAppProcessInfo runningAppProcessInfoK = com.google.firebase.crashlytics.d.h.h.k(contextU.getPackageName(), contextU);
        LinkedList linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = eVar.f12769c;
        String str2 = this.r.f12341b;
        String strD = this.p.d();
        int i3 = 0;
        if (z2) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            Thread[] threadArr2 = new Thread[allStackTraces.size()];
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                threadArr2[i3] = entry.getKey();
                linkedList.add(this.y.a(entry.getValue()));
                i3++;
            }
            threadArr = threadArr2;
        } else {
            threadArr = new Thread[0];
        }
        if (com.google.firebase.crashlytics.d.h.h.l(contextU, "com.crashlytics.CollectCustomKeys", true)) {
            mapA = this.f12386m.a();
            if (mapA != null && mapA.size() > 1) {
                treeMap = new TreeMap(mapA);
            }
            com.google.firebase.crashlytics.d.m.d.u(cVar, j2, str, eVar, thread, stackTraceElementArr, threadArr, linkedList, 8, treeMap, this.u.c(), runningAppProcessInfoK, i2, strD, str2, fB, iC, zQ, jV, jB);
            this.u.a();
        }
        mapA = new TreeMap<>();
        treeMap = mapA;
        com.google.firebase.crashlytics.d.m.d.u(cVar, j2, str, eVar, thread, stackTraceElementArr, threadArr, linkedList, 8, treeMap, this.u.c(), runningAppProcessInfoK, i2, strD, str2, fB, iC, zQ, jV, jB);
        this.u.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() throws Throwable {
        long jX = X();
        String string = new com.google.firebase.crashlytics.d.h.g(this.p).toString();
        com.google.firebase.crashlytics.d.b.f().b("Opening a new session with ID " + string);
        this.x.h(string);
        E0(string, jX);
        I0(string);
        L0(string);
        J0(string);
        this.u.g(string);
        this.B.g(u0(string), jX);
    }

    private void L0(String str) throws Throwable {
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        boolean zC = com.google.firebase.crashlytics.d.h.h.C(U());
        M0(str, "SessionOS", new h(str2, str3, zC));
        this.x.g(str, str2, str3, zC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(long j2) throws IOException {
        try {
            new File(Z(), ".ae" + j2).createNewFile();
        } catch (IOException unused) {
            com.google.firebase.crashlytics.d.b.f().b("Could not write app exception marker.");
        }
    }

    private void M0(String str, String str2, w wVar) throws Throwable {
        com.google.firebase.crashlytics.d.m.b bVar;
        com.google.firebase.crashlytics.d.m.c cVarW = null;
        try {
            bVar = new com.google.firebase.crashlytics.d.m.b(Z(), str + str2);
        } catch (Throwable th) {
            th = th;
            bVar = null;
        }
        try {
            cVarW = com.google.firebase.crashlytics.d.m.c.w(bVar);
            wVar.a(cVarW);
            com.google.firebase.crashlytics.d.h.h.j(cVarW, "Failed to flush to session " + str2 + " file.");
            com.google.firebase.crashlytics.d.h.h.e(bVar, "Failed to close session " + str2 + " file.");
        } catch (Throwable th2) {
            th = th2;
            com.google.firebase.crashlytics.d.h.h.j(cVarW, "Failed to flush to session " + str2 + " file.");
            com.google.firebase.crashlytics.d.h.h.e(bVar, "Failed to close session " + str2 + " file.");
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(Thread thread, Throwable th, String str, long j2) throws Throwable {
        com.google.firebase.crashlytics.d.m.b bVar;
        com.google.firebase.crashlytics.d.m.c cVarW = null;
        try {
            try {
                bVar = new com.google.firebase.crashlytics.d.m.b(Z(), str + "SessionCrash");
            } catch (Exception e2) {
                e = e2;
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
                bVar = null;
                com.google.firebase.crashlytics.d.h.h.j(cVarW, "Failed to flush to session begin file.");
                com.google.firebase.crashlytics.d.h.h.e(bVar, "Failed to close fatal exception file output stream.");
                throw th;
            }
            try {
                cVarW = com.google.firebase.crashlytics.d.m.c.w(bVar);
                K0(cVarW, thread, th, j2, "crash", true);
            } catch (Exception e3) {
                e = e3;
                com.google.firebase.crashlytics.d.b.f().e("An error occurred in the fatal exception logger", e);
                com.google.firebase.crashlytics.d.h.h.j(cVarW, "Failed to flush to session begin file.");
                com.google.firebase.crashlytics.d.h.h.e(bVar, "Failed to close fatal exception file output stream.");
            }
            com.google.firebase.crashlytics.d.h.h.j(cVarW, "Failed to flush to session begin file.");
            com.google.firebase.crashlytics.d.h.h.e(bVar, "Failed to close fatal exception file output stream.");
        } catch (Throwable th3) {
            th = th3;
            com.google.firebase.crashlytics.d.h.h.j(cVarW, "Failed to flush to session begin file.");
            com.google.firebase.crashlytics.d.h.h.e(bVar, "Failed to close fatal exception file output stream.");
            throw th;
        }
    }

    private void N0(File file, String str, int i2) throws Throwable {
        com.google.firebase.crashlytics.d.b.f().b("Collecting session parts for ID " + str);
        File[] fileArrN0 = n0(new x(str + "SessionCrash"));
        boolean z2 = fileArrN0 != null && fileArrN0.length > 0;
        com.google.firebase.crashlytics.d.b bVarF = com.google.firebase.crashlytics.d.b.f();
        Locale locale = Locale.US;
        bVarF.b(String.format(locale, "Session %s has fatal exception: %s", str, Boolean.valueOf(z2)));
        File[] fileArrN02 = n0(new x(str + "SessionEvent"));
        boolean z3 = fileArrN02 != null && fileArrN02.length > 0;
        com.google.firebase.crashlytics.d.b.f().b(String.format(locale, "Session %s has non-fatal exceptions: %s", str, Boolean.valueOf(z3)));
        if (z2 || z3) {
            z0(file, str, f0(str, fileArrN02, i2), z2 ? fileArrN0[0] : null);
        } else {
            com.google.firebase.crashlytics.d.b.f().b("No events present for session ID " + str);
        }
        com.google.firebase.crashlytics.d.b.f().b("Removing session part files for ID " + str);
        G(q0(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(Thread thread, Throwable th, String str, long j2) throws Throwable {
        com.google.firebase.crashlytics.d.m.b bVar;
        com.google.firebase.crashlytics.d.m.c cVar = null;
        cVar = null;
        com.google.firebase.crashlytics.d.m.c cVar2 = null;
        cVar = null;
        try {
            try {
                com.google.firebase.crashlytics.d.b.f().b("Crashlytics is logging non-fatal exception \"" + th + "\" from thread " + thread.getName());
                bVar = new com.google.firebase.crashlytics.d.m.b(Z(), str + "SessionEvent" + com.google.firebase.crashlytics.d.h.h.D(this.f12382i.getAndIncrement()));
                try {
                    com.google.firebase.crashlytics.d.m.c cVarW = com.google.firebase.crashlytics.d.m.c.w(bVar);
                    try {
                        k kVar = this;
                        kVar.K0(cVarW, thread, th, j2, "error", false);
                        com.google.firebase.crashlytics.d.h.h.j(cVarW, "Failed to flush to non-fatal file.");
                        cVar = kVar;
                    } catch (Exception e2) {
                        e = e2;
                        cVar2 = cVarW;
                        com.google.firebase.crashlytics.d.b.f().e("An error occurred in the non-fatal exception logger", e);
                        com.google.firebase.crashlytics.d.h.h.j(cVar2, "Failed to flush to non-fatal file.");
                        cVar = cVar2;
                        com.google.firebase.crashlytics.d.h.h.e(bVar, "Failed to close non-fatal file output stream.");
                        B0(str, 64);
                    } catch (Throwable th2) {
                        th = th2;
                        cVar = cVarW;
                        com.google.firebase.crashlytics.d.h.h.j(cVar, "Failed to flush to non-fatal file.");
                        com.google.firebase.crashlytics.d.h.h.e(bVar, "Failed to close non-fatal file output stream.");
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                bVar = null;
            } catch (Throwable th3) {
                th = th3;
                bVar = null;
            }
            com.google.firebase.crashlytics.d.h.h.e(bVar, "Failed to close non-fatal file output stream.");
            try {
                B0(str, 64);
            } catch (Exception e5) {
                com.google.firebase.crashlytics.d.b.f().e("An error occurred when trimming non-fatal files.", e5);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private void O0(String str) throws Throwable {
        M0(str, "SessionUser", new C0129k(g0(str)));
    }

    private static void P0(com.google.firebase.crashlytics.d.m.c cVar, File file) throws Throwable {
        FileInputStream fileInputStream;
        if (!file.exists()) {
            com.google.firebase.crashlytics.d.b.f().d("Tried to include a file that doesn't exist: " + file.getName());
            return;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            E(fileInputStream, cVar, (int) file.length());
            com.google.firebase.crashlytics.d.h.h.e(fileInputStream, "Failed to close file input stream.");
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            com.google.firebase.crashlytics.d.h.h.e(fileInputStream2, "Failed to close file input stream.");
            throw th;
        }
    }

    private static File[] Q(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    private void R(String str) throws IOException {
        com.google.firebase.crashlytics.d.b.f().b("Finalizing native report for session " + str);
        com.google.firebase.crashlytics.d.d dVarB = this.x.b(str);
        File fileD = dVarB.d();
        if (fileD == null || !fileD.exists()) {
            com.google.firebase.crashlytics.d.b.f().i("No minidump data found for session " + str);
            return;
        }
        long jLastModified = fileD.lastModified();
        com.google.firebase.crashlytics.d.i.b bVar = new com.google.firebase.crashlytics.d.i.b(this.f12383j, this.t, str);
        File file = new File(b0(), str);
        if (!file.mkdirs()) {
            com.google.firebase.crashlytics.d.b.f().b("Couldn't create native sessions directory");
            return;
        }
        M(jLastModified);
        List<com.google.firebase.crashlytics.d.h.b0> listA0 = a0(dVarB, str, U(), Z(), bVar.c());
        com.google.firebase.crashlytics.d.h.c0.b(file, listA0);
        this.B.c(u0(str), listA0);
        bVar.a();
    }

    private static boolean T() throws ClassNotFoundException {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private Context U() {
        return this.f12383j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.firebase.crashlytics.d.n.d.b V(String str, String str2) {
        String strU = com.google.firebase.crashlytics.d.h.h.u(U(), "com.crashlytics.ApiEndpoint");
        return new com.google.firebase.crashlytics.d.n.d.a(new com.google.firebase.crashlytics.d.n.d.c(strU, str, this.o, com.google.firebase.crashlytics.d.h.m.i()), new com.google.firebase.crashlytics.d.n.d.d(strU, str2, this.o, com.google.firebase.crashlytics.d.h.m.i()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String W() {
        File[] fileArrR0 = r0();
        if (fileArrR0.length > 0) {
            return d0(fileArrR0[0]);
        }
        return null;
    }

    private static long X() {
        return e0(new Date());
    }

    static List<com.google.firebase.crashlytics.d.h.b0> a0(com.google.firebase.crashlytics.d.d dVar, String str, Context context, File file, byte[] bArr) {
        com.google.firebase.crashlytics.d.h.a0 a0Var = new com.google.firebase.crashlytics.d.h.a0(file);
        File fileB = a0Var.b(str);
        File fileA = a0Var.a(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.google.firebase.crashlytics.d.h.f("logs_file", "logs", bArr));
        arrayList.add(new com.google.firebase.crashlytics.d.h.w("crash_meta_file", "metadata", dVar.f()));
        arrayList.add(new com.google.firebase.crashlytics.d.h.w("session_meta_file", "session", dVar.e()));
        arrayList.add(new com.google.firebase.crashlytics.d.h.w("app_meta_file", "app", dVar.a()));
        arrayList.add(new com.google.firebase.crashlytics.d.h.w("device_meta_file", "device", dVar.c()));
        arrayList.add(new com.google.firebase.crashlytics.d.h.w("os_meta_file", "os", dVar.b()));
        arrayList.add(new com.google.firebase.crashlytics.d.h.w("minidump_file", "minidump", dVar.d()));
        arrayList.add(new com.google.firebase.crashlytics.d.h.w("user_meta_file", "user", fileB));
        arrayList.add(new com.google.firebase.crashlytics.d.h.w("keys_file", "keys", fileA));
        return arrayList;
    }

    static String d0(File file) {
        return file.getName().substring(0, 35);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long e0(Date date) {
        return date.getTime() / 1000;
    }

    private File[] f0(String str, File[] fileArr, int i2) {
        if (fileArr.length <= i2) {
            return fileArr;
        }
        com.google.firebase.crashlytics.d.b.f().b(String.format(Locale.US, "Trimming down to %d logged exceptions.", Integer.valueOf(i2)));
        B0(str, i2);
        return n0(new x(str + "SessionEvent"));
    }

    private i0 g0(String str) {
        return i0() ? this.f12386m : new com.google.firebase.crashlytics.d.h.a0(Z()).d(str);
    }

    private static File[] m0(File file, FilenameFilter filenameFilter) {
        return Q(file.listFiles(filenameFilter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File[] n0(FilenameFilter filenameFilter) {
        return m0(Z(), filenameFilter);
    }

    private File[] q0(String str) {
        return n0(new d0(str));
    }

    private File[] r0() {
        File[] fileArrP0 = p0();
        Arrays.sort(fileArrP0, f12377d);
        return fileArrP0;
    }

    private e.c.b.b.e.h<Void> s0(long j2) {
        if (!T()) {
            return e.c.b.b.e.k.b(new ScheduledThreadPoolExecutor(1), new m(j2));
        }
        com.google.firebase.crashlytics.d.b.f().b("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
        return e.c.b.b.e.k.d(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e.c.b.b.e.h<Void> t0() {
        ArrayList arrayList = new ArrayList();
        for (File file : k0()) {
            try {
                arrayList.add(s0(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                com.google.firebase.crashlytics.d.b.f().b("Could not parse timestamp from file " + file.getName());
            }
            file.delete();
        }
        return e.c.b.b.e.k.e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u0(String str) {
        return str.replaceAll("-", "");
    }

    private void w0(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = f12379f.matcher(name);
            if (!matcher.matches()) {
                com.google.firebase.crashlytics.d.b.f().b("Deleting unknown file: " + name);
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                com.google.firebase.crashlytics.d.b.f().b("Trimming session file: " + name);
                file.delete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(com.google.firebase.crashlytics.d.p.i.b bVar, boolean z2) throws Throwable {
        Context contextU = U();
        com.google.firebase.crashlytics.d.n.b bVarA = this.s.a(bVar);
        for (File file : l0()) {
            z(bVar.f12746f, file);
            this.n.g(new c0(contextU, new com.google.firebase.crashlytics.d.n.c.d(file, f12380g), bVarA, z2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(String str, File file) throws Throwable {
        if (str == null) {
            return;
        }
        A(file, new l(str));
    }

    private void z0(File file, String str, File[] fileArr, File file2) throws Throwable {
        com.google.firebase.crashlytics.d.m.b bVar;
        boolean z2 = file2 != null;
        File fileY = z2 ? Y() : c0();
        if (!fileY.exists()) {
            fileY.mkdirs();
        }
        com.google.firebase.crashlytics.d.m.c cVarW = null;
        try {
            try {
                bVar = new com.google.firebase.crashlytics.d.m.b(fileY, str);
            } catch (Exception e2) {
                e = e2;
                bVar = null;
            } catch (Throwable th) {
                th = th;
                com.google.firebase.crashlytics.d.h.h.j(null, "Error flushing session file stream");
                com.google.firebase.crashlytics.d.h.h.e(null, "Failed to close CLS file");
                throw th;
            }
            try {
                cVarW = com.google.firebase.crashlytics.d.m.c.w(bVar);
                com.google.firebase.crashlytics.d.b.f().b("Collecting SessionStart data for session ID " + str);
                P0(cVarW, file);
                cVarW.a0(4, X());
                cVarW.A(5, z2);
                cVarW.X(11, 1);
                cVarW.E(12, 3);
                F0(cVarW, str);
                G0(cVarW, fileArr, str);
                if (z2) {
                    P0(cVarW, file2);
                }
                com.google.firebase.crashlytics.d.h.h.j(cVarW, "Error flushing session file stream");
                com.google.firebase.crashlytics.d.h.h.e(bVar, "Failed to close CLS file");
            } catch (Exception e3) {
                e = e3;
                com.google.firebase.crashlytics.d.b.f().e("Failed to write session file for session ID: " + str, e);
                com.google.firebase.crashlytics.d.h.h.j(cVarW, "Error flushing session file stream");
                D(bVar);
            }
        } catch (Throwable th2) {
            th = th2;
            com.google.firebase.crashlytics.d.h.h.j(null, "Error flushing session file stream");
            com.google.firebase.crashlytics.d.h.h.e(null, "Failed to close CLS file");
            throw th;
        }
    }

    void B() {
        this.n.g(new d());
    }

    void C0(int i2) {
        File fileB0 = b0();
        File fileY = Y();
        java.util.Comparator<File> comparator = f12378e;
        int iF = i2 - k0.f(fileB0, fileY, i2, comparator);
        k0.d(Z(), f12376c, iF - k0.c(c0(), iF, comparator), comparator);
    }

    boolean H() {
        if (!this.f12385l.c()) {
            String strW = W();
            return strW != null && this.x.e(strW);
        }
        com.google.firebase.crashlytics.d.b.f().b("Found previous crash marker.");
        this.f12385l.d();
        return true;
    }

    void H0(Thread thread, Throwable th) {
        this.n.g(new b(new Date(), th, thread));
    }

    void I(File[] fileArr) {
        HashSet hashSet = new HashSet();
        for (File file : fileArr) {
            com.google.firebase.crashlytics.d.b.f().b("Found invalid session part file: " + file);
            hashSet.add(d0(file));
        }
        if (hashSet.isEmpty()) {
            return;
        }
        for (File file2 : n0(new e(hashSet))) {
            com.google.firebase.crashlytics.d.b.f().b("Deleting invalid session file: " + file2);
            file2.delete();
        }
    }

    void J(int i2) throws Throwable {
        K(i2, false);
    }

    void P(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.d.p.e eVar) {
        v0();
        com.google.firebase.crashlytics.d.h.q qVar = new com.google.firebase.crashlytics.d.h.q(new q(), eVar, uncaughtExceptionHandler);
        this.C = qVar;
        Thread.setDefaultUncaughtExceptionHandler(qVar);
    }

    void Q0(long j2, String str) {
        this.n.h(new a(j2, str));
    }

    boolean S(int i2) throws Throwable {
        this.n.b();
        if (i0()) {
            com.google.firebase.crashlytics.d.b.f().b("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        com.google.firebase.crashlytics.d.b.f().b("Finalizing previously open sessions.");
        try {
            K(i2, true);
            com.google.firebase.crashlytics.d.b.f().b("Closed all previously open sessions");
            return true;
        } catch (Exception e2) {
            com.google.firebase.crashlytics.d.b.f().e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }

    File Y() {
        return new File(Z(), "fatal-sessions");
    }

    File Z() {
        return this.q.b();
    }

    File b0() {
        return new File(Z(), "native-sessions");
    }

    File c0() {
        return new File(Z(), "nonfatal-sessions");
    }

    synchronized void h0(com.google.firebase.crashlytics.d.p.e eVar, Thread thread, Throwable th) {
        com.google.firebase.crashlytics.d.b.f().b("Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            k0.a(this.n.i(new r(new Date(), th, thread, eVar)));
        } catch (Exception unused) {
        }
    }

    boolean i0() {
        com.google.firebase.crashlytics.d.h.q qVar = this.C;
        return qVar != null && qVar.a();
    }

    File[] k0() {
        return n0(f12375b);
    }

    File[] l0() {
        LinkedList linkedList = new LinkedList();
        File fileY = Y();
        FilenameFilter filenameFilter = f12376c;
        Collections.addAll(linkedList, m0(fileY, filenameFilter));
        Collections.addAll(linkedList, m0(c0(), filenameFilter));
        Collections.addAll(linkedList, m0(Z(), filenameFilter));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    File[] o0() {
        return Q(b0().listFiles());
    }

    File[] p0() {
        return n0(a);
    }

    void v0() {
        this.n.h(new c());
    }

    e.c.b.b.e.h<Void> y0(float f2, e.c.b.b.e.h<com.google.firebase.crashlytics.d.p.i.b> hVar) {
        if (this.v.a()) {
            com.google.firebase.crashlytics.d.b.f().b("Unsent reports are available.");
            return D0().o(new t(hVar, f2));
        }
        com.google.firebase.crashlytics.d.b.f().b("No reports are available.");
        this.D.e(Boolean.FALSE);
        return e.c.b.b.e.k.d(null);
    }
}