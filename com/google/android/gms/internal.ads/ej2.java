package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bj2;
import com.google.android.gms.internal.ads.ej2;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class ej2<MessageType extends ej2<MessageType, BuilderType>, BuilderType extends bj2<MessageType, BuilderType>> extends lh2<MessageType, BuilderType> {
    private static final Map<Object, ej2<?, ?>> zzb = new ConcurrentHashMap();
    protected sl2 zzc = sl2.a();
    protected int zzd = -1;

    protected static <T extends ej2> void A(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    protected static Object B(lk2 lk2Var, String str, Object[] objArr) {
        return new vk2(lk2Var, str, objArr);
    }

    private static <T extends ej2<T, ?>> T k(T t) throws qj2 {
        if (t == null || t.x()) {
            return t;
        }
        qj2 qj2Var = new qj2(new ql2(t).getMessage());
        qj2Var.a(t);
        throw qj2Var;
    }

    static Object l(Method method, Object obj, Object... objArr) {
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

    protected static jj2 m() {
        return fj2.c();
    }

    protected static jj2 n(jj2 jj2Var) {
        int size = jj2Var.size();
        return jj2Var.v(size == 0 ? 10 : size + size);
    }

    protected static mj2 o() {
        return ak2.c();
    }

    protected static <E> nj2<E> p() {
        return uk2.c();
    }

    protected static <E> nj2<E> q(nj2<E> nj2Var) {
        int size = nj2Var.size();
        return nj2Var.v(size == 0 ? 10 : size + size);
    }

    static <T extends ej2<T, ?>> T r(T t, byte[] bArr, int i2, int i3, qi2 qi2Var) throws qj2 {
        T t2 = (T) t.C(4, null, null);
        try {
            dl2 dl2VarB = tk2.a().b(t2.getClass());
            dl2VarB.k(t2, bArr, 0, i3, new oh2(qi2Var));
            dl2VarB.j(t2);
            if (t2.zza == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof qj2) {
                throw ((qj2) e2.getCause());
            }
            qj2 qj2Var = new qj2(e2.getMessage());
            qj2Var.a(t2);
            throw qj2Var;
        } catch (IndexOutOfBoundsException unused) {
            qj2 qj2VarB = qj2.b();
            qj2VarB.a(t2);
            throw qj2VarB;
        }
    }

    protected static <T extends ej2<T, ?>> T s(T t, ci2 ci2Var) throws qj2 {
        qi2 qi2VarA = qi2.a();
        try {
            gi2 gi2VarZ = ci2Var.z();
            T t2 = (T) t.C(4, null, null);
            try {
                dl2 dl2VarB = tk2.a().b(t2.getClass());
                dl2VarB.f(t2, hi2.A(gi2VarZ), qi2VarA);
                dl2VarB.j(t2);
                try {
                    gi2VarZ.h(0);
                    k(t2);
                    k(t2);
                    return t2;
                } catch (qj2 e2) {
                    e2.a(t2);
                    throw e2;
                }
            } catch (IOException e3) {
                if (e3.getCause() instanceof qj2) {
                    throw ((qj2) e3.getCause());
                }
                qj2 qj2Var = new qj2(e3.getMessage());
                qj2Var.a(t2);
                throw qj2Var;
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof qj2) {
                    throw ((qj2) e4.getCause());
                }
                throw e4;
            }
        } catch (qj2 e5) {
            throw e5;
        }
    }

    protected static <T extends ej2<T, ?>> T t(T t, ci2 ci2Var, qi2 qi2Var) throws qj2 {
        try {
            gi2 gi2VarZ = ci2Var.z();
            T t2 = (T) t.C(4, null, null);
            try {
                dl2 dl2VarB = tk2.a().b(t2.getClass());
                dl2VarB.f(t2, hi2.A(gi2VarZ), qi2Var);
                dl2VarB.j(t2);
                try {
                    gi2VarZ.h(0);
                    k(t2);
                    return t2;
                } catch (qj2 e2) {
                    e2.a(t2);
                    throw e2;
                }
            } catch (IOException e3) {
                if (e3.getCause() instanceof qj2) {
                    throw ((qj2) e3.getCause());
                }
                qj2 qj2Var = new qj2(e3.getMessage());
                qj2Var.a(t2);
                throw qj2Var;
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof qj2) {
                    throw ((qj2) e4.getCause());
                }
                throw e4;
            }
        } catch (qj2 e5) {
            throw e5;
        }
    }

    protected static <T extends ej2<T, ?>> T u(T t, byte[] bArr) throws qj2 {
        T t2 = (T) r(t, bArr, 0, bArr.length, qi2.a());
        k(t2);
        return t2;
    }

    protected static <T extends ej2<T, ?>> T v(T t, byte[] bArr, qi2 qi2Var) throws qj2 {
        T t2 = (T) r(t, bArr, 0, bArr.length, qi2Var);
        k(t2);
        return t2;
    }

    static <T extends ej2> T z(Class<T> cls) throws ClassNotFoundException {
        Map<Object, ej2<?, ?>> map = zzb;
        ej2<?, ?> ej2Var = map.get(cls);
        if (ej2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ej2Var = map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (ej2Var == null) {
            ej2Var = (ej2) ((ej2) cm2.h(cls)).C(6, null, null);
            if (ej2Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, ej2Var);
        }
        return ej2Var;
    }

    protected abstract Object C(int i2, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.lk2
    public final void a(li2 li2Var) {
        tk2.a().b(getClass()).h(this, mi2.l(li2Var));
    }

    @Override // com.google.android.gms.internal.ads.lk2
    public final /* bridge */ /* synthetic */ kk2 b() {
        bj2 bj2Var = (bj2) C(5, null, null);
        bj2Var.o(this);
        return bj2Var;
    }

    @Override // com.google.android.gms.internal.ads.lh2
    final int c() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.lk2
    public final /* bridge */ /* synthetic */ kk2 e() {
        return (bj2) C(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return tk2.a().b(getClass()).e(this, (ej2) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.lk2
    public final int f() {
        int i2 = this.zzd;
        if (i2 != -1) {
            return i2;
        }
        int iC = tk2.a().b(getClass()).c(this);
        this.zzd = iC;
        return iC;
    }

    @Override // com.google.android.gms.internal.ads.mk2
    public final /* bridge */ /* synthetic */ lk2 g() {
        return (ej2) C(6, null, null);
    }

    @Override // com.google.android.gms.internal.ads.lh2
    final void h(int i2) {
        this.zzd = i2;
    }

    public final int hashCode() {
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int iB = tk2.a().b(getClass()).b(this);
        this.zza = iB;
        return iB;
    }

    public final String toString() {
        return nk2.a(this, super.toString());
    }

    protected final <MessageType extends ej2<MessageType, BuilderType>, BuilderType extends bj2<MessageType, BuilderType>> BuilderType w() {
        return (BuilderType) C(5, null, null);
    }

    public final boolean x() {
        byte bByteValue = ((Byte) C(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zI = tk2.a().b(getClass()).i(this);
        C(2, true != zI ? null : this, null);
        return zI;
    }

    public final BuilderType y() {
        BuilderType buildertype = (BuilderType) C(5, null, null);
        buildertype.o(this);
        return buildertype;
    }
}