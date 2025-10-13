package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.lk2;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class j62<PrimitiveT, KeyProtoT extends lk2> implements h62<PrimitiveT> {
    private final n62<KeyProtoT> a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<PrimitiveT> f6699b;

    public j62(n62<KeyProtoT> n62Var, Class<PrimitiveT> cls) {
        if (!n62Var.g().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", n62Var.toString(), cls.getName()));
        }
        this.a = n62Var;
        this.f6699b = cls;
    }

    private final PrimitiveT a(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (Void.class.equals(this.f6699b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.a.e(keyprotot);
        return (PrimitiveT) this.a.f(keyprotot, this.f6699b);
    }

    private final i62<?, KeyProtoT> b() {
        return new i62<>(this.a.i());
    }

    @Override // com.google.android.gms.internal.ads.h62
    public final qd2 i(ci2 ci2Var) throws GeneralSecurityException {
        try {
            lk2 lk2VarA = b().a(ci2Var);
            nd2 nd2VarG = qd2.G();
            nd2VarG.q(this.a.b());
            nd2VarG.r(lk2VarA.d());
            nd2VarG.s(this.a.c());
            return nd2VarG.n();
        } catch (qj2 e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.h62
    public final PrimitiveT j(lk2 lk2Var) throws GeneralSecurityException {
        String name = this.a.a().getName();
        String strConcat = name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type ");
        if (this.a.a().isInstance(lk2Var)) {
            return a(lk2Var);
        }
        throw new GeneralSecurityException(strConcat);
    }

    @Override // com.google.android.gms.internal.ads.h62
    public final lk2 k(ci2 ci2Var) throws GeneralSecurityException {
        try {
            return b().a(ci2Var);
        } catch (qj2 e2) {
            String name = this.a.i().a().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.h62
    public final PrimitiveT l(ci2 ci2Var) throws GeneralSecurityException {
        try {
            return a(this.a.d(ci2Var));
        } catch (qj2 e2) {
            String name = this.a.a().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.h62
    public final String zzd() {
        return this.a.b();
    }

    @Override // com.google.android.gms.internal.ads.h62
    public final Class<PrimitiveT> zze() {
        return this.f6699b;
    }
}