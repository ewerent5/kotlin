package i.y.d;

/* compiled from: ReflectionFactory.java */
/* loaded from: classes3.dex */
public class w {
    public i.b0.e a(i iVar) {
        return iVar;
    }

    public i.b0.c b(Class cls) {
        return new e(cls);
    }

    public i.b0.d c(Class cls, String str) {
        return new q(cls, str);
    }

    public i.b0.g d(n nVar) {
        return nVar;
    }

    public String e(h hVar) {
        String string = hVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String f(m mVar) {
        return e(mVar);
    }
}