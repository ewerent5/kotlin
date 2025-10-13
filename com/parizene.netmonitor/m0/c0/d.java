package com.parizene.netmonitor.m0.c0;

import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.m0.d0.f.o;
import i.t.j;
import i.t.m;
import i.y.d.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Group.kt */
/* loaded from: classes.dex */
public final class d {
    private final List<b> a;

    public d(List<b> list) {
        l.d(list, "data");
        this.a = list;
    }

    public final f a() {
        b bVar = (b) j.w(this.a);
        if (bVar == null) {
            return null;
        }
        return bVar.b();
    }

    public final List<o> b() {
        List<b> list = this.a;
        ArrayList arrayList = new ArrayList(m.o(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).a());
        }
        return arrayList;
    }

    public final List<f> c() {
        List<b> list = this.a;
        ArrayList arrayList = new ArrayList(m.o(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).b());
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && l.a(this.a, ((d) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Group(data=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}