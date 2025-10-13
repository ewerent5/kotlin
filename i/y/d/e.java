package i.y.d;

import ch.qos.logback.core.CoreConstants;
import i.t.b0;
import i.t.c0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ClassReference.kt */
/* loaded from: classes3.dex */
public final class e implements i.b0.c<Object>, d {

    /* renamed from: e, reason: collision with root package name */
    private static final Map<Class<? extends i.c<?>>, Integer> f15880e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, String> f15881f;

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap<String, String> f15882g;

    /* renamed from: h, reason: collision with root package name */
    private static final HashMap<String, String> f15883h;

    /* renamed from: i, reason: collision with root package name */
    private static final Map<String, String> f15884i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f15885j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    private final Class<?> f15886k;

    /* compiled from: ClassReference.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i2 = 0;
        List listH = i.t.l.h(i.y.c.a.class, i.y.c.l.class, i.y.c.p.class, i.y.c.q.class, i.y.c.r.class, i.y.c.s.class, i.y.c.t.class, i.y.c.u.class, i.y.c.v.class, i.y.c.w.class, i.y.c.b.class, i.y.c.c.class, i.y.c.d.class, i.y.c.e.class, i.y.c.f.class, i.y.c.g.class, i.y.c.h.class, i.y.c.i.class, i.y.c.j.class, i.y.c.k.class, i.y.c.m.class, i.y.c.n.class, i.y.c.o.class);
        ArrayList arrayList = new ArrayList(i.t.m.o(listH, 10));
        for (Object obj : listH) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i.t.l.n();
            }
            arrayList.add(i.p.a((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f15880e = c0.g(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f15881f = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f15882g = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        l.c(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            l.c(str, "kotlinName");
            sb.append(i.d0.q.w0(str, CoreConstants.DOT, null, 2, null));
            sb.append("CompanionObject");
            i.l lVarA = i.p.a(sb.toString(), str + ".Companion");
            map3.put(lVarA.c(), lVarA.d());
        }
        for (Map.Entry<Class<? extends i.c<?>>, Integer> entry : f15880e.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f15883h = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(b0.a(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), i.d0.q.w0((String) entry2.getValue(), CoreConstants.DOT, null, 2, null));
        }
        f15884i = linkedHashMap;
    }

    public e(Class<?> cls) {
        l.d(cls, "jClass");
        this.f15886k = cls;
    }

    @Override // i.y.d.d
    public Class<?> a() {
        return this.f15886k;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && l.a(i.y.a.a(this), i.y.a.a((i.b0.c) obj));
    }

    public int hashCode() {
        return i.y.a.a(this).hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}