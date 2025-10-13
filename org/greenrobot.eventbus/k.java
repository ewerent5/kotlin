package org.greenrobot.eventbus;

/* compiled from: PendingPostQueue.java */
/* loaded from: classes3.dex */
final class k {
    private j a;

    /* renamed from: b */
    private j f17234b;

    k() {
    }

    synchronized void a(j jVar) {
        try {
            if (jVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            j jVar2 = this.f17234b;
            if (jVar2 != null) {
                jVar2.f17233d = jVar;
                this.f17234b = jVar;
            } else {
                if (this.a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f17234b = jVar;
                this.a = jVar;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized j b() {
        j jVar;
        jVar = this.a;
        if (jVar != null) {
            j jVar2 = jVar.f17233d;
            this.a = jVar2;
            if (jVar2 == null) {
                this.f17234b = null;
            }
        }
        return jVar;
    }

    synchronized j c(int i2) {
        if (this.a == null) {
            wait(i2);
        }
        return b();
    }
}