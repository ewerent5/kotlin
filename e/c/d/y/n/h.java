package e.c.d.y.n;

import e.c.d.v;
import e.c.d.w;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ObjectTypeAdapter.java */
/* loaded from: classes.dex */
public final class h extends v<Object> {
    public static final w a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final e.c.d.f f15519b;

    /* compiled from: ObjectTypeAdapter.java */
    class a implements w {
        a() {
        }

        @Override // e.c.d.w
        public <T> v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
            if (aVar.c() == Object.class) {
                return new h(fVar);
            }
            return null;
        }
    }

    /* compiled from: ObjectTypeAdapter.java */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.c.d.a0.b.values().length];
            a = iArr;
            try {
                iArr[e.c.d.a0.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.c.d.a0.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.c.d.a0.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.c.d.a0.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.c.d.a0.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.c.d.a0.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    h(e.c.d.f fVar) {
        this.f15519b = fVar;
    }

    @Override // e.c.d.v
    public Object b(e.c.d.a0.a aVar) throws IOException {
        switch (b.a[aVar.k0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.v()) {
                    arrayList.add(b(aVar));
                }
                aVar.j();
                return arrayList;
            case 2:
                e.c.d.y.h hVar = new e.c.d.y.h();
                aVar.c();
                while (aVar.v()) {
                    hVar.put(aVar.W(), b(aVar));
                }
                aVar.q();
                return hVar;
            case 3:
                return aVar.h0();
            case 4:
                return Double.valueOf(aVar.K());
            case 5:
                return Boolean.valueOf(aVar.D());
            case 6:
                aVar.a0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // e.c.d.v
    public void d(e.c.d.a0.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.C();
            return;
        }
        v vVarM = this.f15519b.m(obj.getClass());
        if (!(vVarM instanceof h)) {
            vVarM.d(cVar, obj);
        } else {
            cVar.g();
            cVar.q();
        }
    }
}