package com.bumptech.glide.load.n.b0;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DiskCacheWriteLocker.java */
/* loaded from: classes.dex */
final class c {
    private final Map<String, a> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final b f3682b = new b();

    /* compiled from: DiskCacheWriteLocker.java */
    private static class a {
        final Lock a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        int f3683b;

        a() {
        }
    }

    /* compiled from: DiskCacheWriteLocker.java */
    private static class b {
        private final Queue<a> a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVarPoll;
            synchronized (this.a) {
                aVarPoll = this.a.poll();
            }
            return aVarPoll == null ? new a() : aVarPoll;
        }

        void b(a aVar) {
            synchronized (this.a) {
                if (this.a.size() < 10) {
                    this.a.offer(aVar);
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            aVarA = this.a.get(str);
            if (aVarA == null) {
                aVarA = this.f3682b.a();
                this.a.put(str, aVarA);
            }
            aVarA.f3683b++;
        }
        aVarA.a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) com.bumptech.glide.t.j.d(this.a.get(str));
            int i2 = aVar.f3683b;
            if (i2 < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f3683b);
            }
            int i3 = i2 - 1;
            aVar.f3683b = i3;
            if (i3 == 0) {
                a aVarRemove = this.a.remove(str);
                if (!aVarRemove.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                }
                this.f3682b.b(aVarRemove);
            }
        }
        aVar.a.unlock();
    }
}