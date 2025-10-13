package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.n;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.l;
import com.google.firebase.components.s;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;
import org.slf4j.Marker;

/* compiled from: FirebaseApp.java */
/* loaded from: classes.dex */
public class c {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f12261b = new d();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("LOCK")
    static final Map<String, c> f12262c = new c.e.a();

    /* renamed from: d, reason: collision with root package name */
    private final Context f12263d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12264e;

    /* renamed from: f, reason: collision with root package name */
    private final i f12265f;

    /* renamed from: g, reason: collision with root package name */
    private final l f12266g;

    /* renamed from: j, reason: collision with root package name */
    private final s<com.google.firebase.o.a> f12269j;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f12267h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f12268i = new AtomicBoolean();

    /* renamed from: k, reason: collision with root package name */
    private final List<b> f12270k = new CopyOnWriteArrayList();

    /* renamed from: l, reason: collision with root package name */
    private final List<?> f12271l = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    public interface b {
        void a(boolean z);
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    /* renamed from: com.google.firebase.c$c, reason: collision with other inner class name */
    private static class C0128c implements a.InterfaceC0111a {
        private static AtomicReference<C0128c> a = new AtomicReference<>();

        private C0128c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (n.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    C0128c c0128c = new C0128c();
                    if (a.compareAndSet(null, c0128c)) {
                        com.google.android.gms.common.api.internal.a.c(application);
                        com.google.android.gms.common.api.internal.a.b().a(c0128c);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.a.InterfaceC0111a
        public void a(boolean z) {
            synchronized (c.a) {
                Iterator it = new ArrayList(c.f12262c.values()).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.f12267h.get()) {
                        cVar.t(z);
                    }
                }
            }
        }
    }

    /* compiled from: FirebaseApp.java */
    private static class d implements Executor {

        /* renamed from: e, reason: collision with root package name */
        private static final Handler f12272e = new Handler(Looper.getMainLooper());

        private d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f12272e.post(runnable);
        }
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(SyslogConstants.LOG_DAEMON)
    private static class e extends BroadcastReceiver {
        private static AtomicReference<e> a = new AtomicReference<>();

        /* renamed from: b, reason: collision with root package name */
        private final Context f12273b;

        public e(Context context) {
            this.f12273b = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (a.get() == null) {
                e eVar = new e(context);
                if (a.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f12273b.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (c.a) {
                Iterator<c> it = c.f12262c.values().iterator();
                while (it.hasNext()) {
                    it.next().l();
                }
            }
            c();
        }
    }

    protected c(Context context, String str, i iVar) {
        this.f12263d = (Context) p.j(context);
        this.f12264e = p.f(str);
        this.f12265f = (i) p.j(iVar);
        List<com.google.firebase.components.h> listA = com.google.firebase.components.f.b(context, ComponentDiscoveryService.class).a();
        listA.add(new FirebaseCommonRegistrar());
        this.f12266g = new l(f12261b, listA, com.google.firebase.components.d.n(context, Context.class, new Class[0]), com.google.firebase.components.d.n(this, c.class, new Class[0]), com.google.firebase.components.d.n(iVar, i.class, new Class[0]));
        this.f12269j = new s<>(com.google.firebase.b.a(this, context));
    }

    private void e() {
        p.n(!this.f12268i.get(), "FirebaseApp was deleted");
    }

    public static c h() {
        c cVar;
        synchronized (a) {
            cVar = f12262c.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + com.google.android.gms.common.util.p.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (!c.h.h.h.a(this.f12263d)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + i());
            e.b(this.f12263d);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + i());
        this.f12266g.e(q());
    }

    public static c m(Context context) {
        synchronized (a) {
            if (f12262c.containsKey("[DEFAULT]")) {
                return h();
            }
            i iVarA = i.a(context);
            if (iVarA == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return n(context, iVarA);
        }
    }

    public static c n(Context context, i iVar) {
        return o(context, iVar, "[DEFAULT]");
    }

    public static c o(Context context, i iVar, String str) {
        c cVar;
        C0128c.c(context);
        String strS = s(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (a) {
            Map<String, c> map = f12262c;
            p.n(!map.containsKey(strS), "FirebaseApp name " + strS + " already exists!");
            p.k(context, "Application context cannot be null.");
            cVar = new c(context, strS, iVar);
            map.put(strS, cVar);
        }
        cVar.l();
        return cVar;
    }

    static /* synthetic */ com.google.firebase.o.a r(c cVar, Context context) {
        return new com.google.firebase.o.a(context, cVar.k(), (com.google.firebase.l.c) cVar.f12266g.a(com.google.firebase.l.c.class));
    }

    private static String s(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<b> it = this.f12270k.iterator();
        while (it.hasNext()) {
            it.next().a(z);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f12264e.equals(((c) obj).i());
        }
        return false;
    }

    public <T> T f(Class<T> cls) {
        e();
        return (T) this.f12266g.a(cls);
    }

    public Context g() {
        e();
        return this.f12263d;
    }

    public int hashCode() {
        return this.f12264e.hashCode();
    }

    public String i() {
        e();
        return this.f12264e;
    }

    public i j() {
        e();
        return this.f12265f;
    }

    public String k() {
        return com.google.android.gms.common.util.c.b(i().getBytes(Charset.defaultCharset())) + Marker.ANY_NON_NULL_MARKER + com.google.android.gms.common.util.c.b(j().c().getBytes(Charset.defaultCharset()));
    }

    public boolean p() {
        e();
        return this.f12269j.get().b();
    }

    public boolean q() {
        return "[DEFAULT]".equals(i());
    }

    public String toString() {
        return o.c(this).a(Action.NAME_ATTRIBUTE, this.f12264e).a("options", this.f12265f).toString();
    }
}