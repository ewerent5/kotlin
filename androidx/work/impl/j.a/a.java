package androidx.work.impl.j.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.h;
import androidx.work.impl.d;
import androidx.work.impl.k.c;
import androidx.work.impl.l.j;
import androidx.work.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GreedyScheduler.java */
/* loaded from: classes.dex */
public class a implements d, c, androidx.work.impl.a {

    /* renamed from: e */
    private static final String f2253e = h.f("GreedyScheduler");

    /* renamed from: f */
    private androidx.work.impl.h f2254f;

    /* renamed from: g */
    private androidx.work.impl.k.d f2255g;

    /* renamed from: i */
    private boolean f2257i;

    /* renamed from: h */
    private List<j> f2256h = new ArrayList();

    /* renamed from: j */
    private final Object f2258j = new Object();

    public a(Context context, androidx.work.impl.utils.k.a aVar, androidx.work.impl.h hVar) {
        this.f2254f = hVar;
        this.f2255g = new androidx.work.impl.k.d(context, aVar, this);
    }

    private void f() {
        if (this.f2257i) {
            return;
        }
        this.f2254f.l().a(this);
        this.f2257i = true;
    }

    private void g(String str) {
        synchronized (this.f2258j) {
            int size = this.f2256h.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (this.f2256h.get(i2).f2302c.equals(str)) {
                    h.c().a(f2253e, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f2256h.remove(i2);
                    this.f2255g.d(this.f2256h);
                    break;
                }
                i2++;
            }
        }
    }

    @Override // androidx.work.impl.d
    public void a(j... jVarArr) {
        f();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (j jVar : jVarArr) {
            if (jVar.f2303d == n.a.ENQUEUED && !jVar.d() && jVar.f2308i == 0 && !jVar.c()) {
                if (!jVar.b()) {
                    h.c().a(f2253e, String.format("Starting work for %s", jVar.f2302c), new Throwable[0]);
                    this.f2254f.t(jVar.f2302c);
                } else if (Build.VERSION.SDK_INT < 24 || !jVar.f2311l.e()) {
                    arrayList.add(jVar);
                    arrayList2.add(jVar.f2302c);
                }
            }
        }
        synchronized (this.f2258j) {
            if (!arrayList.isEmpty()) {
                h.c().a(f2253e, String.format("Starting tracking for [%s]", TextUtils.join(",", arrayList2)), new Throwable[0]);
                this.f2256h.addAll(arrayList);
                this.f2255g.d(this.f2256h);
            }
        }
    }

    @Override // androidx.work.impl.k.c
    public void b(List<String> list) {
        for (String str : list) {
            h.c().a(f2253e, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f2254f.v(str);
        }
    }

    @Override // androidx.work.impl.a
    public void c(String str, boolean z) {
        g(str);
    }

    @Override // androidx.work.impl.d
    public void d(String str) {
        f();
        h.c().a(f2253e, String.format("Cancelling work ID %s", str), new Throwable[0]);
        this.f2254f.v(str);
    }

    @Override // androidx.work.impl.k.c
    public void e(List<String> list) {
        for (String str : list) {
            h.c().a(f2253e, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f2254f.t(str);
        }
    }
}