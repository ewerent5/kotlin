package com.bumptech.glide.load.n.a0;

import com.bumptech.glide.load.n.a0.m;
import java.util.Queue;

/* compiled from: BaseKeyPool.java */
/* loaded from: classes.dex */
abstract class d<T extends m> {
    private final Queue<T> a = com.bumptech.glide.t.k.e(20);

    d() {
    }

    abstract T a();

    T b() {
        T tPoll = this.a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void c(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}