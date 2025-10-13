package com.google.firebase.j;

import android.content.Context;
import com.google.firebase.analytics.a.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: FirebaseABTesting.java */
/* loaded from: classes.dex */
public class c {
    private final com.google.firebase.analytics.a.a a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12869b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f12870c = null;

    public c(Context context, com.google.firebase.analytics.a.a aVar, String str) {
        this.a = aVar;
        this.f12869b = str;
    }

    private void a(a.c cVar) {
        this.a.b(cVar);
    }

    private void b(List<b> list) {
        ArrayDeque arrayDeque = new ArrayDeque(d());
        int iG = g();
        for (b bVar : list) {
            while (arrayDeque.size() >= iG) {
                i(((a.c) arrayDeque.pollFirst()).f12234b);
            }
            a.c cVarD = bVar.d(this.f12869b);
            a(cVarD);
            arrayDeque.offer(cVarD);
        }
    }

    private static List<b> c(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b.a(it.next()));
        }
        return arrayList;
    }

    private List<a.c> d() {
        return this.a.e(this.f12869b, "");
    }

    private ArrayList<b> e(List<b> list, Set<String> set) {
        ArrayList<b> arrayList = new ArrayList<>();
        for (b bVar : list) {
            if (!set.contains(bVar.b())) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private ArrayList<a.c> f(List<a.c> list, Set<String> set) {
        ArrayList<a.c> arrayList = new ArrayList<>();
        for (a.c cVar : list) {
            if (!set.contains(cVar.f12234b)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    private int g() {
        if (this.f12870c == null) {
            this.f12870c = Integer.valueOf(this.a.d(this.f12869b));
        }
        return this.f12870c.intValue();
    }

    private void i(String str) {
        this.a.clearConditionalUserProperty(str, null, null);
    }

    private void j(Collection<a.c> collection) {
        Iterator<a.c> it = collection.iterator();
        while (it.hasNext()) {
            i(it.next().f12234b);
        }
    }

    private void l(List<b> list) throws a {
        if (list.isEmpty()) {
            h();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().b());
        }
        List<a.c> listD = d();
        HashSet hashSet2 = new HashSet();
        Iterator<a.c> it2 = listD.iterator();
        while (it2.hasNext()) {
            hashSet2.add(it2.next().f12234b);
        }
        j(f(listD, hashSet));
        b(e(list, hashSet2));
    }

    private void m() throws a {
        if (this.a == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public void h() throws a {
        m();
        j(d());
    }

    public void k(List<Map<String, String>> list) throws a {
        m();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        l(c(list));
    }
}