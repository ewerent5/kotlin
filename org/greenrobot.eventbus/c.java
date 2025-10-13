package org.greenrobot.eventbus;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;

/* compiled from: EventBus.java */
/* loaded from: classes3.dex */
public class c {
    static volatile c a;

    /* renamed from: b, reason: collision with root package name */
    private static final d f17197b = new d();

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<?>, List<Class<?>>> f17198c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArrayList<q>> f17199d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Object, List<Class<?>>> f17200e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, Object> f17201f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreadLocal<C0232c> f17202g;

    /* renamed from: h, reason: collision with root package name */
    private final h f17203h;

    /* renamed from: i, reason: collision with root package name */
    private final l f17204i;

    /* renamed from: j, reason: collision with root package name */
    private final org.greenrobot.eventbus.b f17205j;

    /* renamed from: k, reason: collision with root package name */
    private final org.greenrobot.eventbus.a f17206k;

    /* renamed from: l, reason: collision with root package name */
    private final p f17207l;

    /* renamed from: m, reason: collision with root package name */
    private final ExecutorService f17208m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final int t;
    private final g u;

    /* compiled from: EventBus.java */
    class a extends ThreadLocal<C0232c> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0232c initialValue() {
            return new C0232c();
        }
    }

    /* compiled from: EventBus.java */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: EventBus.java */
    /* renamed from: org.greenrobot.eventbus.c$c, reason: collision with other inner class name */
    static final class C0232c {
        final List<Object> a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        boolean f17209b;

        /* renamed from: c, reason: collision with root package name */
        boolean f17210c;

        /* renamed from: d, reason: collision with root package name */
        q f17211d;

        /* renamed from: e, reason: collision with root package name */
        Object f17212e;

        /* renamed from: f, reason: collision with root package name */
        boolean f17213f;

        C0232c() {
        }
    }

    public c() {
        this(f17197b);
    }

    static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    private void b(q qVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (obj != null) {
            q(qVar, obj, j());
        }
    }

    public static c c() {
        c cVar = a;
        if (cVar == null) {
            synchronized (c.class) {
                cVar = a;
                if (cVar == null) {
                    cVar = new c();
                    a = cVar;
                }
            }
        }
        return cVar;
    }

    private void g(q qVar, Object obj, Throwable th) {
        if (!(obj instanceof n)) {
            if (this.n) {
                throw new e("Invoking subscriber failed", th);
            }
            if (this.o) {
                this.u.b(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + qVar.a.getClass(), th);
            }
            if (this.q) {
                m(new n(this, th, obj, qVar.a));
                return;
            }
            return;
        }
        if (this.o) {
            g gVar = this.u;
            Level level = Level.SEVERE;
            gVar.b(level, "SubscriberExceptionEvent subscriber " + qVar.a.getClass() + " threw an exception", th);
            n nVar = (n) obj;
            this.u.b(level, "Initial event " + nVar.f17236c + " caused exception in " + nVar.f17237d, nVar.f17235b);
        }
    }

    private boolean j() {
        h hVar = this.f17203h;
        return hVar == null || hVar.b();
    }

    private static List<Class<?>> l(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = f17198c;
        synchronized (map) {
            arrayList = map.get(cls);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                    arrayList.add(superclass);
                    a(arrayList, superclass.getInterfaces());
                }
                f17198c.put(cls, arrayList);
            }
        }
        return arrayList;
    }

    private void n(Object obj, C0232c c0232c) {
        boolean zO;
        Class<?> cls = obj.getClass();
        if (this.s) {
            List<Class<?>> listL = l(cls);
            int size = listL.size();
            zO = false;
            for (int i2 = 0; i2 < size; i2++) {
                zO |= o(obj, c0232c, listL.get(i2));
            }
        } else {
            zO = o(obj, c0232c, cls);
        }
        if (zO) {
            return;
        }
        if (this.p) {
            this.u.a(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.r || cls == i.class || cls == n.class) {
            return;
        }
        m(new i(this, obj));
    }

    private boolean o(Object obj, C0232c c0232c, Class<?> cls) {
        CopyOnWriteArrayList<q> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f17199d.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<q> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            q next = it.next();
            c0232c.f17212e = obj;
            c0232c.f17211d = next;
            try {
                q(next, obj, c0232c.f17210c);
                if (c0232c.f17213f) {
                    return true;
                }
            } finally {
                c0232c.f17212e = null;
                c0232c.f17211d = null;
                c0232c.f17213f = false;
            }
        }
        return true;
    }

    private void q(q qVar, Object obj, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i2 = b.a[qVar.f17254b.f17238b.ordinal()];
        if (i2 == 1) {
            i(qVar, obj);
            return;
        }
        if (i2 == 2) {
            if (z) {
                i(qVar, obj);
                return;
            } else {
                this.f17204i.a(qVar, obj);
                return;
            }
        }
        if (i2 == 3) {
            l lVar = this.f17204i;
            if (lVar != null) {
                lVar.a(qVar, obj);
                return;
            } else {
                i(qVar, obj);
                return;
            }
        }
        if (i2 == 4) {
            if (z) {
                this.f17205j.a(qVar, obj);
                return;
            } else {
                i(qVar, obj);
                return;
            }
        }
        if (i2 == 5) {
            this.f17206k.a(qVar, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + qVar.f17254b.f17238b);
    }

    private void s(Object obj, o oVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = oVar.f17239c;
        q qVar = new q(obj, oVar);
        CopyOnWriteArrayList<q> copyOnWriteArrayList = this.f17199d.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f17199d.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(qVar)) {
            throw new e("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i2 = 0; i2 <= size; i2++) {
            if (i2 == size || oVar.f17240d > copyOnWriteArrayList.get(i2).f17254b.f17240d) {
                copyOnWriteArrayList.add(i2, qVar);
                break;
            }
        }
        List<Class<?>> arrayList = this.f17200e.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f17200e.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (oVar.f17241e) {
            if (!this.s) {
                b(qVar, this.f17201f.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.f17201f.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    b(qVar, entry.getValue());
                }
            }
        }
    }

    private void u(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<q> copyOnWriteArrayList = this.f17199d.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i2 = 0;
            while (i2 < size) {
                q qVar = copyOnWriteArrayList.get(i2);
                if (qVar.a == obj) {
                    qVar.f17255c = false;
                    copyOnWriteArrayList.remove(i2);
                    i2--;
                    size--;
                }
                i2++;
            }
        }
    }

    ExecutorService d() {
        return this.f17208m;
    }

    public g e() {
        return this.u;
    }

    public <T> T f(Class<T> cls) {
        T tCast;
        synchronized (this.f17201f) {
            tCast = cls.cast(this.f17201f.get(cls));
        }
        return tCast;
    }

    void h(j jVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = jVar.f17231b;
        q qVar = jVar.f17232c;
        j.b(jVar);
        if (qVar.f17255c) {
            i(qVar, obj);
        }
    }

    void i(q qVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            qVar.f17254b.a.invoke(qVar.a, obj);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        } catch (InvocationTargetException e3) {
            g(qVar, obj, e3.getCause());
        }
    }

    public synchronized boolean k(Object obj) {
        return this.f17200e.containsKey(obj);
    }

    public void m(Object obj) {
        C0232c c0232c = this.f17202g.get();
        List<Object> list = c0232c.a;
        list.add(obj);
        if (c0232c.f17209b) {
            return;
        }
        c0232c.f17210c = j();
        c0232c.f17209b = true;
        if (c0232c.f17213f) {
            throw new e("Internal error. Abort state was not reset");
        }
        while (true) {
            try {
                if (list.isEmpty()) {
                    return;
                } else {
                    n(list.remove(0), c0232c);
                }
            } finally {
                c0232c.f17209b = false;
                c0232c.f17210c = false;
            }
        }
    }

    public void p(Object obj) {
        synchronized (this.f17201f) {
            this.f17201f.put(obj.getClass(), obj);
        }
        m(obj);
    }

    public void r(Object obj) {
        List<o> listA = this.f17207l.a(obj.getClass());
        synchronized (this) {
            Iterator<o> it = listA.iterator();
            while (it.hasNext()) {
                s(obj, it.next());
            }
        }
    }

    public synchronized void t(Object obj) {
        List<Class<?>> list = this.f17200e.get(obj);
        if (list != null) {
            Iterator<Class<?>> it = list.iterator();
            while (it.hasNext()) {
                u(obj, it.next());
            }
            this.f17200e.remove(obj);
        } else {
            this.u.a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.t + ", eventInheritance=" + this.s + "]";
    }

    c(d dVar) {
        this.f17202g = new a();
        this.u = dVar.b();
        this.f17199d = new HashMap();
        this.f17200e = new HashMap();
        this.f17201f = new ConcurrentHashMap();
        h hVarC = dVar.c();
        this.f17203h = hVarC;
        this.f17204i = hVarC != null ? hVarC.a(this) : null;
        this.f17205j = new org.greenrobot.eventbus.b(this);
        this.f17206k = new org.greenrobot.eventbus.a(this);
        List<org.greenrobot.eventbus.s.b> list = dVar.f17223k;
        this.t = list != null ? list.size() : 0;
        this.f17207l = new p(dVar.f17223k, dVar.f17221i, dVar.f17220h);
        this.o = dVar.f17214b;
        this.p = dVar.f17215c;
        this.q = dVar.f17216d;
        this.r = dVar.f17217e;
        this.n = dVar.f17218f;
        this.s = dVar.f17219g;
        this.f17208m = dVar.f17222j;
    }
}