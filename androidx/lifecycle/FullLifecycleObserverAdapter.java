package androidx.lifecycle;

import androidx.lifecycle.g;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements i {

    /* renamed from: e, reason: collision with root package name */
    private final e f1170e;

    /* renamed from: f, reason: collision with root package name */
    private final i f1171f;

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
                a[g.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[g.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[g.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[g.b.ON_STOP.ordinal()] = 5;
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

    FullLifecycleObserverAdapter(e eVar, i iVar) {
        this.f1170e = eVar;
        this.f1171f = iVar;
    }

    @Override // androidx.lifecycle.i
    public void c(k kVar, g.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                this.f1170e.b(kVar);
                break;
            case 2:
                this.f1170e.g(kVar);
                break;
            case 3:
                this.f1170e.a(kVar);
                break;
            case 4:
                this.f1170e.d(kVar);
                break;
            case 5:
                this.f1170e.e(kVar);
                break;
            case 6:
                this.f1170e.f(kVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        i iVar = this.f1171f;
        if (iVar != null) {
            iVar.c(kVar, bVar);
        }
    }
}