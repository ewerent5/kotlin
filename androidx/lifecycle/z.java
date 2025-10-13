package androidx.lifecycle;

/* compiled from: ViewModelProvider.java */
/* loaded from: classes.dex */
public class z {
    private final a a;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f1243b;

    /* compiled from: ViewModelProvider.java */
    public interface a {
        <T extends x> T a(Class<T> cls);
    }

    /* compiled from: ViewModelProvider.java */
    static abstract class b extends c implements a {
        b() {
        }

        public <T extends x> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends x> T c(String str, Class<T> cls);
    }

    /* compiled from: ViewModelProvider.java */
    static class c {
        c() {
        }

        void b(x xVar) {
        }
    }

    public z(b0 b0Var, a aVar) {
        this(b0Var.D(), aVar);
    }

    public <T extends x> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public <T extends x> T b(String str, Class<T> cls) {
        T t = (T) this.f1243b.b(str);
        if (cls.isInstance(t)) {
            Object obj = this.a;
            if (obj instanceof c) {
                ((c) obj).b(t);
            }
            return t;
        }
        a aVar = this.a;
        T t2 = aVar instanceof b ? (T) ((b) aVar).c(str, cls) : (T) aVar.a(cls);
        this.f1243b.d(str, t2);
        return t2;
    }

    public z(a0 a0Var, a aVar) {
        this.a = aVar;
        this.f1243b = a0Var;
    }
}