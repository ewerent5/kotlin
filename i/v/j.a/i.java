package i.v.j.a;

import ch.qos.logback.core.joran.action.Action;
import i.y.d.l;
import java.lang.reflect.Method;

/* compiled from: DebugMetadata.kt */
/* loaded from: classes3.dex */
final class i {

    /* renamed from: b, reason: collision with root package name */
    public static a f15870b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f15871c = new i();
    private static final a a = new a(null, null, null);

    /* compiled from: DebugMetadata.kt */
    private static final class a {
        public final Method a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f15872b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f15873c;

        public a(Method method, Method method2, Method method3) {
            this.a = method;
            this.f15872b = method2;
            this.f15873c = method3;
        }
    }

    private i() {
    }

    private final a a(i.v.j.a.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(Action.NAME_ATTRIBUTE, new Class[0]));
            f15870b = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = a;
            f15870b = aVar3;
            return aVar3;
        }
    }

    public final String b(i.v.j.a.a aVar) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        l.d(aVar, "continuation");
        a aVarA = f15870b;
        if (aVarA == null) {
            aVarA = a(aVar);
        }
        if (aVarA == a || (method = aVarA.a) == null || (objInvoke = method.invoke(aVar.getClass(), new Object[0])) == null || (method2 = aVarA.f15872b) == null || (objInvoke2 = method2.invoke(objInvoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = aVarA.f15873c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
        return (String) (objInvoke3 instanceof String ? objInvoke3 : null);
    }
}