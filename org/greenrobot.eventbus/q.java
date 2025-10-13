package org.greenrobot.eventbus;

/* compiled from: Subscription.java */
/* loaded from: classes3.dex */
final class q {
    final Object a;

    /* renamed from: b */
    final o f17254b;

    /* renamed from: c */
    volatile boolean f17255c = true;

    q(Object obj, o oVar) {
        this.a = obj;
        this.f17254b = oVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.f17254b.equals(qVar.f17254b);
    }

    public int hashCode() {
        return this.a.hashCode() + this.f17254b.f17242f.hashCode();
    }
}