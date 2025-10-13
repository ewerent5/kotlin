package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.b;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class h<T extends IInterface> extends b<T> implements a.f {
    private final c a;

    /* renamed from: b */
    private final Set<Scope> f4699b;

    /* renamed from: c */
    private final Account f4700c;

    protected h(Context context, Looper looper, int i2, c cVar, com.google.android.gms.common.api.f fVar, com.google.android.gms.common.api.g gVar) {
        this(context, looper, i.b(context), com.google.android.gms.common.e.l(), i2, cVar, (com.google.android.gms.common.api.f) p.j(fVar), (com.google.android.gms.common.api.g) p.j(gVar));
    }

    private static b.a d(com.google.android.gms.common.api.f fVar) {
        if (fVar == null) {
            return null;
        }
        return new y(fVar);
    }

    private static b.InterfaceC0113b e(com.google.android.gms.common.api.g gVar) {
        if (gVar == null) {
            return null;
        }
        return new z(gVar);
    }

    private final Set<Scope> f(Set<Scope> set) {
        Set<Scope> setC = c(set);
        Iterator<Scope> it = setC.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setC;
    }

    protected Set<Scope> c(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.internal.b
    public final Account getAccount() {
        return this.f4700c;
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    @Override // com.google.android.gms.common.internal.b
    protected final Set<Scope> getScopes() {
        return this.f4699b;
    }

    protected h(Context context, Looper looper, i iVar, com.google.android.gms.common.e eVar, int i2, c cVar, com.google.android.gms.common.api.f fVar, com.google.android.gms.common.api.g gVar) {
        super(context, looper, iVar, eVar, i2, d(fVar), e(gVar), cVar.e());
        this.a = cVar;
        this.f4700c = cVar.a();
        this.f4699b = f(cVar.c());
    }
}