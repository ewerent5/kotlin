package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {
    private UUID a;

    /* renamed from: b, reason: collision with root package name */
    private e f2082b;

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f2083c;

    /* renamed from: d, reason: collision with root package name */
    private a f2084d;

    /* renamed from: e, reason: collision with root package name */
    private int f2085e;

    /* renamed from: f, reason: collision with root package name */
    private Executor f2086f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.work.impl.utils.k.a f2087g;

    /* renamed from: h, reason: collision with root package name */
    private q f2088h;

    public static class a {
        public List<String> a = Collections.emptyList();

        /* renamed from: b, reason: collision with root package name */
        public List<Uri> f2089b = Collections.emptyList();

        /* renamed from: c, reason: collision with root package name */
        public Network f2090c;
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i2, Executor executor, androidx.work.impl.utils.k.a aVar2, q qVar) {
        this.a = uuid;
        this.f2082b = eVar;
        this.f2083c = new HashSet(collection);
        this.f2084d = aVar;
        this.f2085e = i2;
        this.f2086f = executor;
        this.f2087g = aVar2;
        this.f2088h = qVar;
    }

    public Executor a() {
        return this.f2086f;
    }

    public UUID b() {
        return this.a;
    }

    public e c() {
        return this.f2082b;
    }

    public Network d() {
        return this.f2084d.f2090c;
    }

    public int e() {
        return this.f2085e;
    }

    public Set<String> f() {
        return this.f2083c;
    }

    public androidx.work.impl.utils.k.a g() {
        return this.f2087g;
    }

    public List<String> h() {
        return this.f2084d.a;
    }

    public List<Uri> i() {
        return this.f2084d.f2089b;
    }

    public q j() {
        return this.f2088h;
    }
}