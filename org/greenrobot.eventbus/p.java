package org.greenrobot.eventbus;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: SubscriberMethodFinder.java */
/* loaded from: classes3.dex */
class p {
    private static final Map<Class<?>, List<o>> a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final a[] f17243b = new a[4];

    /* renamed from: c */
    private List<org.greenrobot.eventbus.s.b> f17244c;

    /* renamed from: d */
    private final boolean f17245d;

    /* renamed from: e */
    private final boolean f17246e;

    /* compiled from: SubscriberMethodFinder.java */
    static class a {
        final List<o> a = new ArrayList();

        /* renamed from: b */
        final Map<Class, Object> f17247b = new HashMap();

        /* renamed from: c */
        final Map<String, Class> f17248c = new HashMap();

        /* renamed from: d */
        final StringBuilder f17249d = new StringBuilder(128);

        /* renamed from: e */
        Class<?> f17250e;

        /* renamed from: f */
        Class<?> f17251f;

        /* renamed from: g */
        boolean f17252g;

        /* renamed from: h */
        org.greenrobot.eventbus.s.a f17253h;

        a() {
        }

        private boolean b(Method method, Class<?> cls) {
            this.f17249d.setLength(0);
            this.f17249d.append(method.getName());
            StringBuilder sb = this.f17249d;
            sb.append('>');
            sb.append(cls.getName());
            String string = this.f17249d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class clsPut = this.f17248c.put(string, declaringClass);
            if (clsPut == null || clsPut.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f17248c.put(string, clsPut);
            return false;
        }

        boolean a(Method method, Class<?> cls) {
            Object objPut = this.f17247b.put(cls, method);
            if (objPut == null) {
                return true;
            }
            if (objPut instanceof Method) {
                if (!b((Method) objPut, cls)) {
                    throw new IllegalStateException();
                }
                this.f17247b.put(cls, this);
            }
            return b(method, cls);
        }

        void c(Class<?> cls) {
            this.f17251f = cls;
            this.f17250e = cls;
            this.f17252g = false;
            this.f17253h = null;
        }

        void d() {
            if (this.f17252g) {
                this.f17251f = null;
                return;
            }
            Class<? super Object> superclass = this.f17251f.getSuperclass();
            this.f17251f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.f17251f = null;
            }
        }

        void e() {
            this.a.clear();
            this.f17247b.clear();
            this.f17248c.clear();
            this.f17249d.setLength(0);
            this.f17250e = null;
            this.f17251f = null;
            this.f17252g = false;
            this.f17253h = null;
        }
    }

    p(List<org.greenrobot.eventbus.s.b> list, boolean z, boolean z2) {
        this.f17244c = list;
        this.f17245d = z;
        this.f17246e = z2;
    }

    private List<o> b(Class<?> cls) throws SecurityException {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f17251f != null) {
            org.greenrobot.eventbus.s.a aVarF = f(aVarG);
            aVarG.f17253h = aVarF;
            if (aVarF != null) {
                for (o oVar : aVarF.a()) {
                    if (aVarG.a(oVar.a, oVar.f17239c)) {
                        aVarG.a.add(oVar);
                    }
                }
            } else {
                d(aVarG);
            }
            aVarG.d();
        }
        return e(aVarG);
    }

    private List<o> c(Class<?> cls) throws SecurityException {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f17251f != null) {
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    private void d(a aVar) throws SecurityException {
        Method[] methods;
        try {
            try {
                methods = aVar.f17251f.getDeclaredMethods();
            } catch (Throwable unused) {
                methods = aVar.f17251f.getMethods();
                aVar.f17252g = true;
            }
            for (Method method : methods) {
                int modifiers = method.getModifiers();
                if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        m mVar = (m) method.getAnnotation(m.class);
                        if (mVar != null) {
                            Class<?> cls = parameterTypes[0];
                            if (aVar.a(method, cls)) {
                                aVar.a.add(new o(method, cls, mVar.threadMode(), mVar.priority(), mVar.sticky()));
                            }
                        }
                    } else if (this.f17245d && method.isAnnotationPresent(m.class)) {
                        throw new e("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                    }
                } else if (this.f17245d && method.isAnnotationPresent(m.class)) {
                    throw new e((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
                }
            }
        } catch (LinkageError e2) {
            String str = "Could not inspect methods of " + aVar.f17251f.getName();
            throw new e(this.f17246e ? str + ". Please consider using EventBus annotation processor to avoid reflection." : str + ". Please make this class visible to EventBus annotation processor to avoid reflection.", e2);
        }
    }

    private List<o> e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.a);
        aVar.e();
        synchronized (f17243b) {
            int i2 = 0;
            while (true) {
                if (i2 >= 4) {
                    break;
                }
                a[] aVarArr = f17243b;
                if (aVarArr[i2] == null) {
                    aVarArr[i2] = aVar;
                    break;
                }
                i2++;
            }
        }
        return arrayList;
    }

    private org.greenrobot.eventbus.s.a f(a aVar) {
        org.greenrobot.eventbus.s.a aVar2 = aVar.f17253h;
        if (aVar2 != null && aVar2.b() != null) {
            org.greenrobot.eventbus.s.a aVarB = aVar.f17253h.b();
            if (aVar.f17251f == aVarB.c()) {
                return aVarB;
            }
        }
        List<org.greenrobot.eventbus.s.b> list = this.f17244c;
        if (list == null) {
            return null;
        }
        Iterator<org.greenrobot.eventbus.s.b> it = list.iterator();
        while (it.hasNext()) {
            org.greenrobot.eventbus.s.a aVarA = it.next().a(aVar.f17251f);
            if (aVarA != null) {
                return aVarA;
            }
        }
        return null;
    }

    private a g() {
        synchronized (f17243b) {
            for (int i2 = 0; i2 < 4; i2++) {
                a[] aVarArr = f17243b;
                a aVar = aVarArr[i2];
                if (aVar != null) {
                    aVarArr[i2] = null;
                    return aVar;
                }
            }
            return new a();
        }
    }

    List<o> a(Class<?> cls) {
        Map<Class<?>, List<o>> map = a;
        List<o> list = map.get(cls);
        if (list != null) {
            return list;
        }
        List<o> listC = this.f17246e ? c(cls) : b(cls);
        if (!listC.isEmpty()) {
            map.put(cls, listC);
            return listC;
        }
        throw new e("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}