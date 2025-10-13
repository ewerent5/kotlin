package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.k;
import androidx.work.m;
import androidx.work.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WorkContinuationImpl.java */
/* loaded from: classes.dex */
public class f extends m {
    private static final String a = androidx.work.h.f("WorkContinuationImpl");

    /* renamed from: b, reason: collision with root package name */
    private final h f2209b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2210c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.work.f f2211d;

    /* renamed from: e, reason: collision with root package name */
    private final List<? extends p> f2212e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f2213f;

    /* renamed from: g, reason: collision with root package name */
    private final List<String> f2214g;

    /* renamed from: h, reason: collision with root package name */
    private final List<f> f2215h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2216i;

    /* renamed from: j, reason: collision with root package name */
    private k f2217j;

    f(h hVar, List<? extends p> list) {
        this(hVar, null, androidx.work.f.KEEP, list, null);
    }

    private static boolean i(f fVar, Set<String> set) {
        set.addAll(fVar.c());
        Set<String> setL = l(fVar);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setL.contains(it.next())) {
                return true;
            }
        }
        List<f> listE = fVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator<f> it2 = listE.iterator();
            while (it2.hasNext()) {
                if (i(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(fVar.c());
        return false;
    }

    public static Set<String> l(f fVar) {
        HashSet hashSet = new HashSet();
        List<f> listE = fVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator<f> it = listE.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().c());
            }
        }
        return hashSet;
    }

    public k a() {
        if (this.f2216i) {
            androidx.work.h.c().h(a, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f2213f)), new Throwable[0]);
        } else {
            androidx.work.impl.utils.b bVar = new androidx.work.impl.utils.b(this);
            this.f2209b.o().b(bVar);
            this.f2217j = bVar.d();
        }
        return this.f2217j;
    }

    public androidx.work.f b() {
        return this.f2211d;
    }

    public List<String> c() {
        return this.f2213f;
    }

    public String d() {
        return this.f2210c;
    }

    public List<f> e() {
        return this.f2215h;
    }

    public List<? extends p> f() {
        return this.f2212e;
    }

    public h g() {
        return this.f2209b;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f2216i;
    }

    public void k() {
        this.f2216i = true;
    }

    f(h hVar, String str, androidx.work.f fVar, List<? extends p> list, List<f> list2) {
        this.f2209b = hVar;
        this.f2210c = str;
        this.f2211d = fVar;
        this.f2212e = list;
        this.f2215h = list2;
        this.f2213f = new ArrayList(list.size());
        this.f2214g = new ArrayList();
        if (list2 != null) {
            Iterator<f> it = list2.iterator();
            while (it.hasNext()) {
                this.f2214g.addAll(it.next().f2214g);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            String strA = list.get(i2).a();
            this.f2213f.add(strA);
            this.f2214g.add(strA);
        }
    }
}