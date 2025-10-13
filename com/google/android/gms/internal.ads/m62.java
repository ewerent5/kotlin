package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class m62<PrimitiveT, KeyT> {
    private final Class<PrimitiveT> a;

    public m62(Class<PrimitiveT> cls) {
        this.a = cls;
    }

    final Class<PrimitiveT> a() {
        return this.a;
    }

    public abstract PrimitiveT b(KeyT keyt);
}