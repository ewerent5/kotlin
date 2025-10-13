package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.lk2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class n62<KeyProtoT extends lk2> {
    private final Class<KeyProtoT> a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, m62<?, KeyProtoT>> f7660b;

    /* renamed from: c, reason: collision with root package name */
    private final Class<?> f7661c;

    @SafeVarargs
    protected n62(Class<KeyProtoT> cls, m62<?, KeyProtoT>... m62VarArr) {
        this.a = cls;
        HashMap map = new HashMap();
        for (int i2 = 0; i2 <= 0; i2++) {
            m62<?, KeyProtoT> m62Var = m62VarArr[i2];
            if (map.containsKey(m62Var.a())) {
                String strValueOf = String.valueOf(m62Var.a().getCanonicalName());
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(strValueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            map.put(m62Var.a(), m62Var);
        }
        this.f7661c = m62VarArr[0].a();
        this.f7660b = Collections.unmodifiableMap(map);
    }

    public final Class<KeyProtoT> a() {
        return this.a;
    }

    public abstract String b();

    public abstract pd2 c();

    public abstract KeyProtoT d(ci2 ci2Var);

    public abstract void e(KeyProtoT keyprotot);

    public final <P> P f(KeyProtoT keyprotot, Class<P> cls) {
        m62<?, KeyProtoT> m62Var = this.f7660b.get(cls);
        if (m62Var != null) {
            return (P) m62Var.b(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final Set<Class<?>> g() {
        return this.f7660b.keySet();
    }

    final Class<?> h() {
        return this.f7661c;
    }

    public k62<?, KeyProtoT> i() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}