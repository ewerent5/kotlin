package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class sg2 extends ThreadLocal<Mac> {
    final /* synthetic */ tg2 a;

    sg2(tg2 tg2Var) {
        this.a = tg2Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            Mac macA = fg2.f5864d.a(this.a.f9138b);
            macA.init(this.a.f9139c);
            return macA;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}