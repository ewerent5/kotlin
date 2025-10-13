package com.bumptech.glide.load.o;

import java.util.Queue;

/* compiled from: ModelCache.java */
/* loaded from: classes.dex */
public class m<A, B> {
    private final com.bumptech.glide.t.g<b<A>, B> a;

    /* compiled from: ModelCache.java */
    class a extends com.bumptech.glide.t.g<b<A>, B> {
        a(long j2) {
            super(j2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.t.g
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b<A> bVar, B b2) {
            bVar.c();
        }
    }

    /* compiled from: ModelCache.java */
    static final class b<A> {
        private static final Queue<b<?>> a = com.bumptech.glide.t.k.e(0);

        /* renamed from: b, reason: collision with root package name */
        private int f3905b;

        /* renamed from: c, reason: collision with root package name */
        private int f3906c;

        /* renamed from: d, reason: collision with root package name */
        private A f3907d;

        private b() {
        }

        static <A> b<A> a(A a2, int i2, int i3) {
            b<A> bVar;
            Queue<b<?>> queue = a;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a2, i2, i3);
            return bVar;
        }

        private void b(A a2, int i2, int i3) {
            this.f3907d = a2;
            this.f3906c = i2;
            this.f3905b = i3;
        }

        public void c() {
            Queue<b<?>> queue = a;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3906c == bVar.f3906c && this.f3905b == bVar.f3905b && this.f3907d.equals(bVar.f3907d);
        }

        public int hashCode() {
            return (((this.f3905b * 31) + this.f3906c) * 31) + this.f3907d.hashCode();
        }
    }

    public m(long j2) {
        this.a = new a(j2);
    }

    public B a(A a2, int i2, int i3) {
        b<A> bVarA = b.a(a2, i2, i3);
        B bG = this.a.g(bVarA);
        bVarA.c();
        return bG;
    }

    public void b(A a2, int i2, int i3, B b2) {
        this.a.k(b.a(a2, i2, i3), b2);
    }
}