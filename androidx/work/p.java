package androidx.work;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkRequest.java */
/* loaded from: classes.dex */
public abstract class p {
    private UUID a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.work.impl.l.j f2418b;

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f2419c;

    /* compiled from: WorkRequest.java */
    public static abstract class a<B extends a, W extends p> {

        /* renamed from: c, reason: collision with root package name */
        androidx.work.impl.l.j f2421c;
        boolean a = false;

        /* renamed from: d, reason: collision with root package name */
        Set<String> f2422d = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        UUID f2420b = UUID.randomUUID();

        a(Class<? extends ListenableWorker> cls) {
            this.f2421c = new androidx.work.impl.l.j(this.f2420b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.f2422d.add(str);
            return (B) d();
        }

        public final W b() {
            W w = (W) c();
            this.f2420b = UUID.randomUUID();
            androidx.work.impl.l.j jVar = new androidx.work.impl.l.j(this.f2421c);
            this.f2421c = jVar;
            jVar.f2302c = this.f2420b.toString();
            return w;
        }

        abstract W c();

        abstract B d();

        public final B e(c cVar) {
            this.f2421c.f2311l = cVar;
            return (B) d();
        }

        public final B f(e eVar) {
            this.f2421c.f2306g = eVar;
            return (B) d();
        }
    }

    protected p(UUID uuid, androidx.work.impl.l.j jVar, Set<String> set) {
        this.a = uuid;
        this.f2418b = jVar;
        this.f2419c = set;
    }

    public String a() {
        return this.a.toString();
    }

    public Set<String> b() {
        return this.f2419c;
    }

    public androidx.work.impl.l.j c() {
        return this.f2418b;
    }
}