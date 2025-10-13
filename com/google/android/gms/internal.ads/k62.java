package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.lk2;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class k62<KeyFormatProtoT extends lk2, KeyT> {
    private final Class<KeyFormatProtoT> a;

    public k62(Class<KeyFormatProtoT> cls) {
        this.a = cls;
    }

    public final Class<KeyFormatProtoT> a() {
        return this.a;
    }

    public abstract void b(KeyFormatProtoT keyformatprotot);

    public abstract KeyFormatProtoT c(ci2 ci2Var);

    public abstract KeyT d(KeyFormatProtoT keyformatprotot);
}