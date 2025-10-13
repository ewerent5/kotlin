package e.c.d;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: GsonBuilder.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: h, reason: collision with root package name */
    private String f15443h;
    private e.c.d.y.d a = e.c.d.y.d.f15469e;

    /* renamed from: b, reason: collision with root package name */
    private u f15437b = u.f15450e;

    /* renamed from: c, reason: collision with root package name */
    private e f15438c = d.f15418e;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Type, h<?>> f15439d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final List<w> f15440e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List<w> f15441f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private boolean f15442g = false;

    /* renamed from: i, reason: collision with root package name */
    private int f15444i = 2;

    /* renamed from: j, reason: collision with root package name */
    private int f15445j = 2;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15446k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15447l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f15448m = true;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;

    private void a(String str, int i2, int i3, List<w> list) {
        a aVar;
        a aVar2;
        a aVar3;
        if (str != null && !"".equals(str.trim())) {
            aVar = new a(Date.class, str);
            aVar2 = new a(Timestamp.class, str);
            aVar3 = new a(java.sql.Date.class, str);
        } else {
            if (i2 == 2 || i3 == 2) {
                return;
            }
            a aVar4 = new a(Date.class, i2, i3);
            a aVar5 = new a(Timestamp.class, i2, i3);
            a aVar6 = new a(java.sql.Date.class, i2, i3);
            aVar = aVar4;
            aVar2 = aVar5;
            aVar3 = aVar6;
        }
        list.add(e.c.d.y.n.n.b(Date.class, aVar));
        list.add(e.c.d.y.n.n.b(Timestamp.class, aVar2));
        list.add(e.c.d.y.n.n.b(java.sql.Date.class, aVar3));
    }

    public f b() {
        List<w> arrayList = new ArrayList<>(this.f15440e.size() + this.f15441f.size() + 3);
        arrayList.addAll(this.f15440e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f15441f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f15443h, this.f15444i, this.f15445j, arrayList);
        return new f(this.a, this.f15438c, this.f15439d, this.f15442g, this.f15446k, this.o, this.f15448m, this.n, this.p, this.f15447l, this.f15437b, this.f15443h, this.f15444i, this.f15445j, this.f15440e, this.f15441f, arrayList);
    }

    public g c(Type type, Object obj) {
        boolean z = obj instanceof s;
        e.c.d.y.a.a(z || (obj instanceof k) || (obj instanceof h) || (obj instanceof v));
        if (obj instanceof h) {
            this.f15439d.put(type, (h) obj);
        }
        if (z || (obj instanceof k)) {
            this.f15440e.add(e.c.d.y.n.l.f(e.c.d.z.a.b(type), obj));
        }
        if (obj instanceof v) {
            this.f15440e.add(e.c.d.y.n.n.a(e.c.d.z.a.b(type), (v) obj));
        }
        return this;
    }
}