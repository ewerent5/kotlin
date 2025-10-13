package k.c.e.m;

import android.graphics.drawable.Drawable;
import android.util.Log;
import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: MapTileModuleProviderBase.java */
/* loaded from: classes3.dex */
public abstract class p {
    private final ExecutorService a;

    /* renamed from: b, reason: collision with root package name */
    protected final Object f16652b = new Object();

    /* renamed from: c, reason: collision with root package name */
    protected final HashMap<Long, k.c.e.j> f16653c;

    /* renamed from: d, reason: collision with root package name */
    protected final LinkedHashMap<Long, k.c.e.j> f16654d;

    /* compiled from: MapTileModuleProviderBase.java */
    class a extends LinkedHashMap<Long, k.c.e.j> implements Map {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f16655e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i2, float f2, boolean z, int i3) {
            super(i2, f2, z);
            this.f16655e = i3;
        }

        @Override // j$.util.Map
        public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
            return Map.CC.$default$compute(this, obj, biFunction);
        }

        @Override // j$.util.Map
        public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
            return Map.CC.$default$computeIfAbsent(this, obj, function);
        }

        @Override // j$.util.Map
        public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
            return Map.CC.$default$computeIfPresent(this, obj, biFunction);
        }

        @Override // j$.util.Map
        public /* synthetic */ void forEach(BiConsumer biConsumer) {
            Map.CC.$default$forEach(this, biConsumer);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map, j$.util.Map
        public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return Map.CC.$default$getOrDefault(this, obj, obj2);
        }

        @Override // j$.util.Map
        public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
            return Map.CC.$default$merge(this, obj, obj2, biFunction);
        }

        @Override // java.util.HashMap, java.util.Map, j$.util.Map
        public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
            return Map.CC.$default$putIfAbsent(this, obj, obj2);
        }

        @Override // java.util.HashMap, java.util.Map, j$.util.Map
        public /* synthetic */ boolean remove(Object obj, Object obj2) {
            return Map.CC.$default$remove(this, obj, obj2);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Long, k.c.e.j> entry) {
            k.c.e.j jVar;
            if (size() <= this.f16655e) {
                return false;
            }
            Iterator<Long> it = p.this.f16654d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                long jLongValue = it.next().longValue();
                if (!p.this.f16653c.containsKey(Long.valueOf(jLongValue)) && (jVar = p.this.f16654d.get(Long.valueOf(jLongValue))) != null) {
                    p.this.l(jLongValue);
                    jVar.a().b(jVar);
                    break;
                }
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.Map, j$.util.Map
        public /* synthetic */ Object replace(Object obj, Object obj2) {
            return Map.CC.$default$replace(this, obj, obj2);
        }

        @Override // java.util.HashMap, java.util.Map, j$.util.Map
        public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
            return Map.CC.$default$replace(this, obj, obj2, obj3);
        }

        @Override // j$.util.Map
        public /* synthetic */ void replaceAll(BiFunction biFunction) {
            Map.CC.$default$replaceAll(this, biFunction);
        }
    }

    /* compiled from: MapTileModuleProviderBase.java */
    public abstract class b implements Runnable {
        public b() {
        }

        public abstract Drawable a(long j2);

        public Drawable b(long j2) {
            if (p.this.j(j2)) {
                return a(j2);
            }
            return null;
        }

        protected k.c.e.j c() {
            k.c.e.j jVar;
            synchronized (p.this.f16652b) {
                Long l2 = null;
                for (Long l3 : p.this.f16654d.keySet()) {
                    if (!p.this.f16653c.containsKey(l3)) {
                        if (k.c.b.a.a().l()) {
                            Log.d("OsmDroid", "TileLoader.nextTile() on provider: " + p.this.f() + " found tile in working queue: " + k.c.f.m.h(l3.longValue()));
                        }
                        l2 = l3;
                    }
                }
                if (l2 != null) {
                    if (k.c.b.a.a().l()) {
                        Log.d("OsmDroid", "TileLoader.nextTile() on provider: " + p.this.f() + " adding tile to working queue: " + l2);
                    }
                    p pVar = p.this;
                    pVar.f16653c.put(l2, pVar.f16654d.get(l2));
                }
                jVar = l2 != null ? p.this.f16654d.get(l2) : null;
            }
            return jVar;
        }

        protected void d() {
        }

        protected void e() {
        }

        protected void f(k.c.e.j jVar, Drawable drawable) {
            if (k.c.b.a.a().l()) {
                Log.d("OsmDroid", "TileLoader.tileLoaded() on provider: " + p.this.f() + " with tile: " + k.c.f.m.h(jVar.b()));
            }
            p.this.l(jVar.b());
            k.c.e.b.b(drawable, -1);
            jVar.a().d(jVar, drawable);
        }

        protected void g(k.c.e.j jVar, Drawable drawable) {
            if (k.c.b.a.a().l()) {
                Log.d("OsmDroid", "TileLoader.tileLoadedExpired() on provider: " + p.this.f() + " with tile: " + k.c.f.m.h(jVar.b()));
            }
            p.this.l(jVar.b());
            k.c.e.b.b(drawable, -2);
            jVar.a().c(jVar, drawable);
        }

        protected void h(k.c.e.j jVar) {
            if (k.c.b.a.a().l()) {
                Log.d("OsmDroid", "TileLoader.tileLoadedFailed() on provider: " + p.this.f() + " with tile: " + k.c.f.m.h(jVar.b()));
            }
            p.this.l(jVar.b());
            jVar.a().a(jVar);
        }

        protected void i(k.c.e.j jVar, Drawable drawable) {
            if (k.c.b.a.a().l()) {
                Log.d("OsmDroid", "TileLoader.tileLoadedScaled() on provider: " + p.this.f() + " with tile: " + k.c.f.m.h(jVar.b()));
            }
            p.this.l(jVar.b());
            k.c.e.b.b(drawable, -3);
            jVar.a().c(jVar, drawable);
        }

        @Override // java.lang.Runnable
        public final void run() {
            d();
            while (true) {
                k.c.e.j jVarC = c();
                if (jVarC == null) {
                    e();
                    return;
                }
                if (k.c.b.a.a().l()) {
                    Log.d("OsmDroid", "TileLoader.run() processing next tile: " + k.c.f.m.h(jVarC.b()) + ", pending:" + p.this.f16654d.size() + ", working:" + p.this.f16653c.size());
                }
                Drawable drawableB = null;
                try {
                    drawableB = b(jVarC.b());
                } catch (k.c.e.m.b e2) {
                    Log.i("OsmDroid", "Tile loader can't continue: " + k.c.f.m.h(jVarC.b()), e2);
                    p.this.b();
                } catch (Throwable th) {
                    Log.i("OsmDroid", "Error downloading tile: " + k.c.f.m.h(jVarC.b()), th);
                }
                if (drawableB == null) {
                    h(jVarC);
                } else if (k.c.e.b.a(drawableB) == -2) {
                    g(jVarC, drawableB);
                } else if (k.c.e.b.a(drawableB) == -3) {
                    i(jVarC, drawableB);
                } else {
                    f(jVarC, drawableB);
                }
            }
        }
    }

    public p(int i2, int i3) {
        if (i3 < i2) {
            Log.w("OsmDroid", "The pending queue size is smaller than the thread pool size. Automatically reducing the thread pool size.");
            i2 = i3;
        }
        this.a = Executors.newFixedThreadPool(i2, new c(5, g()));
        this.f16653c = new HashMap<>();
        this.f16654d = new a(i3 + 2, 0.1f, true, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        synchronized (this.f16652b) {
            this.f16654d.clear();
            this.f16653c.clear();
        }
    }

    public void c() {
        b();
        this.a.shutdown();
    }

    public abstract int d();

    public abstract int e();

    protected abstract String f();

    protected abstract String g();

    public abstract b h();

    public abstract boolean i();

    public boolean j(long j2) {
        int iE = k.c.f.m.e(j2);
        return iE >= e() && iE <= d();
    }

    public void k(k.c.e.j jVar) {
        if (this.a.isShutdown()) {
            return;
        }
        synchronized (this.f16652b) {
            if (k.c.b.a.a().l()) {
                Log.d("OsmDroid", "MapTileModuleProviderBase.loadMaptileAsync() on provider: " + f() + " for tile: " + k.c.f.m.h(jVar.b()));
                if (this.f16654d.containsKey(Long.valueOf(jVar.b()))) {
                    Log.d("OsmDroid", "MapTileModuleProviderBase.loadMaptileAsync() tile already exists in request queue for modular provider. Moving to front of queue.");
                } else {
                    Log.d("OsmDroid", "MapTileModuleProviderBase.loadMaptileAsync() adding tile to request queue for modular provider.");
                }
            }
            this.f16654d.put(Long.valueOf(jVar.b()), jVar);
        }
        try {
            this.a.execute(h());
        } catch (RejectedExecutionException e2) {
            Log.w("OsmDroid", "RejectedExecutionException", e2);
        }
    }

    protected void l(long j2) {
        synchronized (this.f16652b) {
            if (k.c.b.a.a().l()) {
                Log.d("OsmDroid", "MapTileModuleProviderBase.removeTileFromQueues() on provider: " + f() + " for tile: " + k.c.f.m.h(j2));
            }
            this.f16654d.remove(Long.valueOf(j2));
            this.f16653c.remove(Long.valueOf(j2));
        }
    }

    public abstract void m(k.c.e.n.d dVar);
}