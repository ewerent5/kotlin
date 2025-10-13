package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kh2;
import com.google.android.gms.internal.ads.lh2;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class kh2<MessageType extends lh2<MessageType, BuilderType>, BuilderType extends kh2<MessageType, BuilderType>> implements kk2 {
    @Override // com.google.android.gms.internal.ads.kk2
    public final /* bridge */ /* synthetic */ kk2 K(lk2 lk2Var) {
        if (g().getClass().isInstance(lk2Var)) {
            return h((lh2) lk2Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract BuilderType h(MessageType messagetype);
}