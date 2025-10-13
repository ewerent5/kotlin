package e.g.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Inventory.java */
/* loaded from: classes.dex */
public class h {
    Map<String, k> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    Map<String, i> f15682b = new HashMap();

    h() {
    }

    void a(i iVar) {
        this.f15682b.put(iVar.c(), iVar);
    }

    void b(k kVar) {
        this.a.put(kVar.e(), kVar);
    }

    List<String> c(String str) {
        ArrayList arrayList = new ArrayList();
        for (i iVar : this.f15682b.values()) {
            if (iVar.b().equals(str)) {
                arrayList.add(iVar.c());
            }
        }
        return arrayList;
    }

    public i d(String str) {
        return this.f15682b.get(str);
    }

    public k e(String str) {
        return this.a.get(str);
    }
}