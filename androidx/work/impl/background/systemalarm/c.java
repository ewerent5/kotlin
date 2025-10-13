package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.h;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.l.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ConstraintsCommandHandler.java */
/* loaded from: classes.dex */
class c {
    private static final String a = h.f("ConstraintsCmdHandler");

    /* renamed from: b */
    private final Context f2150b;

    /* renamed from: c */
    private final int f2151c;

    /* renamed from: d */
    private final e f2152d;

    /* renamed from: e */
    private final androidx.work.impl.k.d f2153e;

    c(Context context, int i2, e eVar) {
        this.f2150b = context;
        this.f2151c = i2;
        this.f2152d = eVar;
        this.f2153e = new androidx.work.impl.k.d(context, eVar.f(), null);
    }

    void a() {
        List<j> listG = this.f2152d.g().n().M().g();
        ConstraintProxy.a(this.f2150b, listG);
        this.f2153e.d(listG);
        ArrayList arrayList = new ArrayList(listG.size());
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (j jVar : listG) {
            String str = jVar.f2302c;
            if (jCurrentTimeMillis >= jVar.a() && (!jVar.b() || this.f2153e.c(str))) {
                arrayList.add(jVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((j) it.next()).f2302c;
            Intent intentB = b.b(this.f2150b, str2);
            h.c().a(a, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.f2152d;
            eVar.k(new e.b(eVar, intentB, this.f2151c));
        }
        this.f2153e.e();
    }
}