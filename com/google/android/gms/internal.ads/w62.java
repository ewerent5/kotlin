package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class w62<P> {
    private final ConcurrentMap<v62, List<u62<P>>> a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private u62<P> f9901b;

    /* renamed from: c, reason: collision with root package name */
    private final Class<P> f9902c;

    private w62(Class<P> cls) {
        this.f9902c = cls;
    }

    public static <P> w62<P> b(Class<P> cls) {
        return new w62<>(cls);
    }

    public final u62<P> a() {
        return this.f9901b;
    }

    public final void c(u62<P> u62Var) {
        if (u62Var.b() != td2.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        List<u62<P>> listEmptyList = this.a.get(new v62(u62Var.d(), null));
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.f9901b = u62Var;
    }

    public final u62<P> d(P p, de2 de2Var) throws GeneralSecurityException {
        byte[] bArrArray;
        if (de2Var.F() != td2.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        ye2 ye2Var = ye2.UNKNOWN_PREFIX;
        int iOrdinal = de2Var.H().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(de2Var.G()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(de2Var.G()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(de2Var.G()).array();
        } else {
            bArrArray = d62.a;
        }
        u62<P> u62Var = new u62<>(p, bArrArray, de2Var.F(), de2Var.H(), de2Var.G());
        ArrayList arrayList = new ArrayList();
        arrayList.add(u62Var);
        v62 v62Var = new v62(u62Var.d(), null);
        List<u62<P>> listPut = this.a.put(v62Var, Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(u62Var);
            this.a.put(v62Var, Collections.unmodifiableList(arrayList2));
        }
        return u62Var;
    }

    public final Class<P> e() {
        return this.f9902c;
    }
}