package e.c.d.y.n;

import e.c.d.t;
import e.c.d.v;
import e.c.d.w;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class i implements w {

    /* renamed from: e, reason: collision with root package name */
    private final e.c.d.y.c f15520e;

    /* renamed from: f, reason: collision with root package name */
    private final e.c.d.e f15521f;

    /* renamed from: g, reason: collision with root package name */
    private final e.c.d.y.d f15522g;

    /* renamed from: h, reason: collision with root package name */
    private final d f15523h;

    /* renamed from: i, reason: collision with root package name */
    private final e.c.d.y.o.b f15524i = e.c.d.y.o.b.a();

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    class a extends c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Field f15525d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f15526e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ v f15527f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e.c.d.f f15528g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ e.c.d.z.a f15529h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f15530i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z, boolean z2, Field field, boolean z3, v vVar, e.c.d.f fVar, e.c.d.z.a aVar, boolean z4) {
            super(str, z, z2);
            this.f15525d = field;
            this.f15526e = z3;
            this.f15527f = vVar;
            this.f15528g = fVar;
            this.f15529h = aVar;
            this.f15530i = z4;
        }

        @Override // e.c.d.y.n.i.c
        void a(e.c.d.a0.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException {
            Object objB = this.f15527f.b(aVar);
            if (objB == null && this.f15530i) {
                return;
            }
            this.f15525d.set(obj, objB);
        }

        @Override // e.c.d.y.n.i.c
        void b(e.c.d.a0.c cVar, Object obj) throws IllegalAccessException, IllegalArgumentException {
            (this.f15526e ? this.f15527f : new m(this.f15528g, this.f15527f, this.f15529h.e())).d(cVar, this.f15525d.get(obj));
        }

        @Override // e.c.d.y.n.i.c
        public boolean c(Object obj) {
            return this.f15533b && this.f15525d.get(obj) != obj;
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    public static final class b<T> extends v<T> {
        private final e.c.d.y.i<T> a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, c> f15532b;

        b(e.c.d.y.i<T> iVar, Map<String, c> map) {
            this.a = iVar;
            this.f15532b = map;
        }

        @Override // e.c.d.v
        public T b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() == e.c.d.a0.b.NULL) {
                aVar.a0();
                return null;
            }
            T tA = this.a.a();
            try {
                aVar.c();
                while (aVar.v()) {
                    c cVar = this.f15532b.get(aVar.W());
                    if (cVar == null || !cVar.f15534c) {
                        aVar.O0();
                    } else {
                        cVar.a(aVar, tA);
                    }
                }
                aVar.q();
                return tA;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new t(e3);
            }
        }

        @Override // e.c.d.v
        public void d(e.c.d.a0.c cVar, T t) throws IOException {
            if (t == null) {
                cVar.C();
                return;
            }
            cVar.g();
            try {
                for (c cVar2 : this.f15532b.values()) {
                    if (cVar2.c(t)) {
                        cVar.A(cVar2.a);
                        cVar2.b(cVar, t);
                    }
                }
                cVar.q();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    static abstract class c {
        final String a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f15533b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f15534c;

        protected c(String str, boolean z, boolean z2) {
            this.a = str;
            this.f15533b = z;
            this.f15534c = z2;
        }

        abstract void a(e.c.d.a0.a aVar, Object obj);

        abstract void b(e.c.d.a0.c cVar, Object obj);

        abstract boolean c(Object obj);
    }

    public i(e.c.d.y.c cVar, e.c.d.e eVar, e.c.d.y.d dVar, d dVar2) {
        this.f15520e = cVar;
        this.f15521f = eVar;
        this.f15522g = dVar;
        this.f15523h = dVar2;
    }

    private c b(e.c.d.f fVar, Field field, String str, e.c.d.z.a<?> aVar, boolean z, boolean z2) {
        boolean zA = e.c.d.y.k.a(aVar.c());
        e.c.d.x.b bVar = (e.c.d.x.b) field.getAnnotation(e.c.d.x.b.class);
        v<?> vVarB = bVar != null ? this.f15523h.b(this.f15520e, fVar, aVar, bVar) : null;
        boolean z3 = vVarB != null;
        if (vVarB == null) {
            vVarB = fVar.l(aVar);
        }
        return new a(str, z, z2, field, z3, vVarB, fVar, aVar, zA);
    }

    static boolean d(Field field, boolean z, e.c.d.y.d dVar) {
        return (dVar.d(field.getType(), z) || dVar.g(field, z)) ? false : true;
    }

    private Map<String, c> e(e.c.d.f fVar, e.c.d.z.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type typeE = aVar.e();
        e.c.d.z.a<?> aVarB = aVar;
        Class<?> clsC = cls;
        while (clsC != Object.class) {
            Field[] declaredFields = clsC.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                boolean zC = c(field, true);
                boolean zC2 = c(field, z);
                if (zC || zC2) {
                    this.f15524i.b(field);
                    Type typeP = e.c.d.y.b.p(aVarB.e(), clsC, field.getGenericType());
                    List<String> listF = f(field);
                    int size = listF.size();
                    c cVar = null;
                    int i3 = 0;
                    while (i3 < size) {
                        String str = listF.get(i3);
                        boolean z2 = i3 != 0 ? false : zC;
                        int i4 = i3;
                        c cVar2 = cVar;
                        int i5 = size;
                        List<String> list = listF;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str, b(fVar, field, str, e.c.d.z.a.b(typeP), z2, zC2)) : cVar2;
                        i3 = i4 + 1;
                        zC = z2;
                        listF = list;
                        size = i5;
                        field = field2;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(typeE + " declares multiple JSON fields named " + cVar3.a);
                    }
                }
                i2++;
                z = false;
            }
            aVarB = e.c.d.z.a.b(e.c.d.y.b.p(aVarB.e(), clsC, clsC.getGenericSuperclass()));
            clsC = aVarB.c();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        e.c.d.x.c cVar = (e.c.d.x.c) field.getAnnotation(e.c.d.x.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f15521f.a(field));
        }
        String strValue = cVar.value();
        String[] strArrAlternate = cVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // e.c.d.w
    public <T> v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
        Class<? super T> clsC = aVar.c();
        if (Object.class.isAssignableFrom(clsC)) {
            return new b(this.f15520e.a(aVar), e(fVar, aVar, clsC));
        }
        return null;
    }

    public boolean c(Field field, boolean z) {
        return d(field, z, this.f15522g);
    }
}