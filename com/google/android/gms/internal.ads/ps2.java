package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ps2 extends Handler {
    final /* synthetic */ qs2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ps2(qs2 qs2Var, Looper looper) {
        super(looper);
        this.a = qs2Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.a.l(message);
    }
}