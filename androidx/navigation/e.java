package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.g;
import androidx.savedstate.SavedStateRegistry;
import java.util.UUID;

/* compiled from: NavBackStackEntry.java */
/* loaded from: classes.dex */
public final class e implements androidx.lifecycle.k, b0, androidx.savedstate.b {

    /* renamed from: e, reason: collision with root package name */
    private final Context f1268e;

    /* renamed from: f, reason: collision with root package name */
    private final j f1269f;

    /* renamed from: g, reason: collision with root package name */
    private Bundle f1270g;

    /* renamed from: h, reason: collision with root package name */
    private final androidx.lifecycle.l f1271h;

    /* renamed from: i, reason: collision with root package name */
    private final androidx.savedstate.a f1272i;

    /* renamed from: j, reason: collision with root package name */
    final UUID f1273j;

    /* renamed from: k, reason: collision with root package name */
    private g.c f1274k;

    /* renamed from: l, reason: collision with root package name */
    private g.c f1275l;

    /* renamed from: m, reason: collision with root package name */
    private g f1276m;

    /* compiled from: NavBackStackEntry.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.b.values().length];
            a = iArr;
            try {
                iArr[g.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[g.b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[g.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[g.b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[g.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[g.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    e(Context context, j jVar, Bundle bundle, androidx.lifecycle.k kVar, g gVar) {
        this(context, jVar, bundle, kVar, gVar, UUID.randomUUID(), null);
    }

    private static g.c d(g.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
            case 2:
                return g.c.CREATED;
            case 3:
            case 4:
                return g.c.STARTED;
            case 5:
                return g.c.RESUMED;
            case 6:
                return g.c.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + bVar);
        }
    }

    @Override // androidx.lifecycle.b0
    public a0 D() {
        g gVar = this.f1276m;
        if (gVar != null) {
            return gVar.h(this.f1273j);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    @Override // androidx.savedstate.b
    public SavedStateRegistry I() {
        return this.f1272i.b();
    }

    public Bundle a() {
        return this.f1270g;
    }

    public j b() {
        return this.f1269f;
    }

    g.c c() {
        return this.f1275l;
    }

    void e(g.b bVar) {
        this.f1274k = d(bVar);
        j();
    }

    void f(Bundle bundle) {
        this.f1270g = bundle;
    }

    void g(Bundle bundle) {
        this.f1272i.d(bundle);
    }

    void h(g.c cVar) {
        this.f1275l = cVar;
        j();
    }

    @Override // androidx.lifecycle.k
    public androidx.lifecycle.g i() {
        return this.f1271h;
    }

    void j() {
        if (this.f1274k.ordinal() < this.f1275l.ordinal()) {
            this.f1271h.o(this.f1274k);
        } else {
            this.f1271h.o(this.f1275l);
        }
    }

    e(Context context, j jVar, Bundle bundle, androidx.lifecycle.k kVar, g gVar, UUID uuid, Bundle bundle2) {
        this.f1271h = new androidx.lifecycle.l(this);
        androidx.savedstate.a aVarA = androidx.savedstate.a.a(this);
        this.f1272i = aVarA;
        this.f1274k = g.c.CREATED;
        this.f1275l = g.c.RESUMED;
        this.f1268e = context;
        this.f1273j = uuid;
        this.f1269f = jVar;
        this.f1270g = bundle;
        this.f1276m = gVar;
        aVarA.c(bundle2);
        if (kVar != null) {
            this.f1274k = kVar.i().b();
        }
    }
}