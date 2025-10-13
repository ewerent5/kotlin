package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
final class l0 extends e.c.b.b.c.c.d {
    final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(b bVar, Looper looper) {
        super(looper);
        this.a = bVar;
    }

    private static final void a(Message message) {
        m0 m0Var = (m0) message.obj;
        m0Var.a();
        m0Var.d();
    }

    private static final boolean b(Message message) {
        int i2 = message.what;
        return i2 == 2 || i2 == 1 || i2 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || ((i2 == 4 && !this.a.enableLocalFallback()) || message.what == 5)) && !this.a.isConnecting()) {
            a(message);
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            this.a.zzB = new com.google.android.gms.common.b(message.arg2);
            if (b.zzg(this.a) && !this.a.zzC) {
                this.a.zzp(3, null);
                return;
            }
            com.google.android.gms.common.b bVar = this.a.zzB != null ? this.a.zzB : new com.google.android.gms.common.b(8);
            this.a.zzc.a(bVar);
            this.a.onConnectionFailed(bVar);
            return;
        }
        if (i3 == 5) {
            com.google.android.gms.common.b bVar2 = this.a.zzB != null ? this.a.zzB : new com.google.android.gms.common.b(8);
            this.a.zzc.a(bVar2);
            this.a.onConnectionFailed(bVar2);
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            com.google.android.gms.common.b bVar3 = new com.google.android.gms.common.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.a.zzc.a(bVar3);
            this.a.onConnectionFailed(bVar3);
            return;
        }
        if (i3 == 6) {
            this.a.zzp(5, null);
            if (this.a.zzw != null) {
                this.a.zzw.R(message.arg2);
            }
            this.a.onConnectionSuspended(message.arg2);
            b.zzl(this.a, 5, 1, null);
            return;
        }
        if (i3 == 2 && !this.a.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((m0) message.obj).c();
            return;
        }
        int i4 = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i4);
        Log.wtf("GmsClient", sb.toString(), new Exception());
    }
}