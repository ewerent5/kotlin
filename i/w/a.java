package i.w;

import i.y.d.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PlatformImplementations.kt */
/* loaded from: classes3.dex */
public class a {

    /* compiled from: PlatformImplementations.kt */
    /* renamed from: i.w.a$a, reason: collision with other inner class name */
    private static final class C0201a {
        public static final Method a;

        /* renamed from: b, reason: collision with root package name */
        public static final Method f15875b;

        /* renamed from: c, reason: collision with root package name */
        public static final C0201a f15876c = new C0201a();

        /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
        static {
            /*
                i.w.a$a r0 = new i.w.a$a
                r0.<init>()
                i.w.a.C0201a.f15876c = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                i.y.d.l.c(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L15:
                java.lang.String r5 = "it"
                r6 = 0
                if (r4 >= r2) goto L49
                r7 = r1[r4]
                i.y.d.l.c(r7, r5)
                java.lang.String r8 = r7.getName()
                java.lang.String r9 = "addSuppressed"
                boolean r8 = i.y.d.l.a(r8, r9)
                if (r8 == 0) goto L42
                java.lang.Class[] r8 = r7.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                i.y.d.l.c(r8, r9)
                java.lang.Object r8 = i.t.d.t(r8)
                java.lang.Class r8 = (java.lang.Class) r8
                boolean r8 = i.y.d.l.a(r8, r0)
                if (r8 == 0) goto L42
                r8 = 1
                goto L43
            L42:
                r8 = 0
            L43:
                if (r8 == 0) goto L46
                goto L4a
            L46:
                int r4 = r4 + 1
                goto L15
            L49:
                r7 = r6
            L4a:
                i.w.a.C0201a.a = r7
                int r0 = r1.length
            L4d:
                if (r3 >= r0) goto L65
                r2 = r1[r3]
                i.y.d.l.c(r2, r5)
                java.lang.String r4 = r2.getName()
                java.lang.String r7 = "getSuppressed"
                boolean r4 = i.y.d.l.a(r4, r7)
                if (r4 == 0) goto L62
                r6 = r2
                goto L65
            L62:
                int r3 = r3 + 1
                goto L4d
            L65:
                i.w.a.C0201a.f15875b = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i.w.a.C0201a.<clinit>():void");
        }

        private C0201a() {
        }
    }

    public void a(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        l.d(th, "cause");
        l.d(th2, "exception");
        Method method = C0201a.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public i.z.c b() {
        return new i.z.b();
    }
}