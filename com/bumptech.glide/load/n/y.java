package com.bumptech.glide.load.n;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler.java */
/* loaded from: classes.dex */
class y {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f3866b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).b();
            return true;
        }
    }

    y() {
    }

    synchronized void a(v<?> vVar, boolean z) {
        if (this.a || z) {
            this.f3866b.obtainMessage(1, vVar).sendToTarget();
        } else {
            this.a = true;
            vVar.b();
            this.a = false;
        }
    }
}