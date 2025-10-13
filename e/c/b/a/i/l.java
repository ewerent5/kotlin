package e.c.b.a.i;

import com.google.auto.value.AutoValue;
import e.c.b.a.i.b;

/* compiled from: SendRequest.java */
@AutoValue
/* loaded from: classes.dex */
abstract class l {

    /* compiled from: SendRequest.java */
    @AutoValue.Builder
    public static abstract class a {
        public abstract l a();

        abstract a b(e.c.b.a.b bVar);

        abstract a c(e.c.b.a.c<?> cVar);

        abstract a d(e.c.b.a.e<?, byte[]> eVar);

        public abstract a e(m mVar);

        public abstract a f(String str);
    }

    l() {
    }

    public static a a() {
        return new b.C0174b();
    }

    public abstract e.c.b.a.b b();

    abstract e.c.b.a.c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    abstract e.c.b.a.e<?, byte[]> e();

    public abstract m f();

    public abstract String g();
}