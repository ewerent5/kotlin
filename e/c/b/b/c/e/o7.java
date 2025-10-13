package e.c.b.b.c.e;

import e.c.b.b.c.e.o7;
import e.c.b.b.c.e.o7.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public abstract class o7<MessageType extends o7<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends x5<MessageType, BuilderType> {
    private static Map<Object, o7<?, ?>> zzd = new ConcurrentHashMap();
    protected ja zzb = ja.a();
    private int zzc = -1;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    protected static class a<T extends o7<T, ?>> extends b6<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f14739b;

        public a(T t) {
            this.f14739b = t;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static abstract class b<MessageType extends o7<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends z5<MessageType, BuilderType> {

        /* renamed from: e, reason: collision with root package name */
        private final MessageType f14740e;

        /* renamed from: f, reason: collision with root package name */
        protected MessageType f14741f;

        /* renamed from: g, reason: collision with root package name */
        protected boolean f14742g = false;

        protected b(MessageType messagetype) {
            this.f14740e = messagetype;
            this.f14741f = (MessageType) messagetype.o(e.f14745d, null, null);
        }

        private static void l(MessageType messagetype, MessageType messagetype2) {
            o9.a().c(messagetype).e(messagetype, messagetype2);
        }

        private final BuilderType m(byte[] bArr, int i2, int i3, b7 b7Var) throws a8 {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            try {
                o9.a().c(this.f14741f).f(this.f14741f, bArr, 0, i3, new f6(b7Var));
                return this;
            } catch (a8 e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            } catch (IndexOutOfBoundsException unused) {
                throw a8.a();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e.c.b.b.c.e.z5
        public /* synthetic */ Object clone() {
            b bVar = (b) this.f14740e.o(e.f14746e, null, null);
            bVar.h((o7) zzx());
            return bVar;
        }

        @Override // e.c.b.b.c.e.d9
        public final /* synthetic */ b9 g() {
            return this.f14740e;
        }

        @Override // e.c.b.b.c.e.z5
        public final /* synthetic */ z5 i(byte[] bArr, int i2, int i3) {
            return m(bArr, 0, i3, b7.a());
        }

        @Override // e.c.b.b.c.e.z5
        public final /* synthetic */ z5 j(byte[] bArr, int i2, int i3, b7 b7Var) {
            return m(bArr, 0, i3, b7Var);
        }

        @Override // e.c.b.b.c.e.z5
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public final BuilderType h(MessageType messagetype) {
            if (this.f14742g) {
                n();
                this.f14742g = false;
            }
            l(this.f14741f, messagetype);
            return this;
        }

        protected void n() {
            MessageType messagetype = (MessageType) this.f14741f.o(e.f14745d, null, null);
            l(messagetype, this.f14741f);
            this.f14741f = messagetype;
        }

        @Override // e.c.b.b.c.e.a9
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public MessageType zzx() {
            if (this.f14742g) {
                return this.f14741f;
            }
            MessageType messagetype = this.f14741f;
            o9.a().c(messagetype).b(messagetype);
            this.f14742g = true;
            return this.f14741f;
        }

        @Override // e.c.b.b.c.e.a9
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final MessageType zzy() {
            MessageType messagetype = (MessageType) zzx();
            if (messagetype.f()) {
                return messagetype;
            }
            throw new ha(messagetype);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    static final class c implements j7<c> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // e.c.b.b.c.e.j7
        public final a9 g(a9 a9Var, b9 b9Var) {
            throw new NoSuchMethodError();
        }

        @Override // e.c.b.b.c.e.j7
        public final f9 i(f9 f9Var, f9 f9Var2) {
            throw new NoSuchMethodError();
        }

        @Override // e.c.b.b.c.e.j7
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // e.c.b.b.c.e.j7
        public final ya zzb() {
            throw new NoSuchMethodError();
        }

        @Override // e.c.b.b.c.e.j7
        public final fb zzc() {
            throw new NoSuchMethodError();
        }

        @Override // e.c.b.b.c.e.j7
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // e.c.b.b.c.e.j7
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends o7<MessageType, BuilderType> implements d9 {
        protected h7<c> zzc = h7.c();

        final h7<c> y() {
            if (this.zzc.n()) {
                this.zzc = (h7) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public enum e {
        public static final int a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f14743b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f14744c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f14745d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f14746e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f14747f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f14748g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f14749h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f14749h.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static class f<ContainingType extends b9, Type> extends c7<ContainingType, Type> {
    }

    static <T extends o7<?, ?>> T l(Class<T> cls) throws ClassNotFoundException {
        o7<?, ?> o7Var = zzd.get(cls);
        if (o7Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                o7Var = zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (o7Var == null) {
            o7Var = (T) ((o7) qa.c(cls)).o(e.f14747f, null, null);
            if (o7Var == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, o7Var);
        }
        return (T) o7Var;
    }

    protected static <E> x7<E> m(x7<E> x7Var) {
        int size = x7Var.size();
        return x7Var.b(size == 0 ? 10 : size << 1);
    }

    protected static y7 n(y7 y7Var) {
        int size = y7Var.size();
        return y7Var.b(size == 0 ? 10 : size << 1);
    }

    protected static Object p(b9 b9Var, String str, Object[] objArr) {
        return new p9(b9Var, str, objArr);
    }

    static Object q(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static <T extends o7<?, ?>> void r(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static final <T extends o7<T, ?>> boolean s(T t, boolean z) {
        byte bByteValue = ((Byte) t.o(e.a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zA = o9.a().c(t).a(t);
        if (z) {
            t.o(e.f14743b, zA ? t : null, null);
        }
        return zA;
    }

    protected static v7 v() {
        return s7.e();
    }

    protected static y7 w() {
        return o8.e();
    }

    protected static <E> x7<E> x() {
        return n9.f();
    }

    @Override // e.c.b.b.c.e.b9
    public final /* synthetic */ a9 R() {
        return (b) o(e.f14746e, null, null);
    }

    @Override // e.c.b.b.c.e.b9
    public final int b() {
        if (this.zzc == -1) {
            this.zzc = o9.a().c(this).zzb(this);
        }
        return this.zzc;
    }

    @Override // e.c.b.b.c.e.b9
    public final /* synthetic */ a9 d() {
        b bVar = (b) o(e.f14746e, null, null);
        bVar.h(this);
        return bVar;
    }

    @Override // e.c.b.b.c.e.b9
    public final void e(y6 y6Var) {
        o9.a().c(this).c(this, a7.M(y6Var));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return o9.a().c(this).d(this, (o7) obj);
        }
        return false;
    }

    @Override // e.c.b.b.c.e.d9
    public final boolean f() {
        return s(this, true);
    }

    @Override // e.c.b.b.c.e.d9
    public final /* synthetic */ b9 g() {
        return (o7) o(e.f14747f, null, null);
    }

    public int hashCode() {
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int iZza = o9.a().c(this).zza(this);
        this.zza = iZza;
        return iZza;
    }

    @Override // e.c.b.b.c.e.x5
    final int j() {
        return this.zzc;
    }

    @Override // e.c.b.b.c.e.x5
    final void k(int i2) {
        this.zzc = i2;
    }

    protected abstract Object o(int i2, Object obj, Object obj2);

    protected final <MessageType extends o7<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType t() {
        return (BuilderType) o(e.f14746e, null, null);
    }

    public String toString() {
        return c9.a(this, super.toString());
    }

    public final BuilderType u() {
        BuilderType buildertype = (BuilderType) o(e.f14746e, null, null);
        buildertype.h(this);
        return buildertype;
    }
}