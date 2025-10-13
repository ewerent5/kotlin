package org.greenrobot.eventbus;

import android.os.Looper;

/* compiled from: MainThreadSupport.java */
/* loaded from: classes3.dex */
public interface h {

    /* compiled from: MainThreadSupport.java */
    public static class a implements h {
        private final Looper a;

        public a(Looper looper) {
            this.a = looper;
        }

        @Override // org.greenrobot.eventbus.h
        public l a(c cVar) {
            return new f(cVar, this.a, 10);
        }

        @Override // org.greenrobot.eventbus.h
        public boolean b() {
            return this.a == Looper.myLooper();
        }
    }

    l a(c cVar);

    boolean b();
}