package f.b;

/* compiled from: AndroidInjector.java */
/* loaded from: classes3.dex */
public interface b<T> {

    /* compiled from: AndroidInjector.java */
    @Deprecated
    public static abstract class a<T> implements InterfaceC0194b<T> {
        @Override // f.b.b.InterfaceC0194b
        public final b<T> a(T t) {
            c(t);
            return b();
        }

        public abstract b<T> b();

        public abstract void c(T t);
    }

    /* compiled from: AndroidInjector.java */
    /* renamed from: f.b.b$b, reason: collision with other inner class name */
    public interface InterfaceC0194b<T> {
        b<T> a(T t);
    }

    void a(T t);
}