package e.c.d;

import java.util.Map;
import java.util.Set;

/* compiled from: JsonObject.java */
/* loaded from: classes.dex */
public final class o extends l {
    private final e.c.d.y.h<String, l> a = new e.c.d.y.h<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof o) && ((o) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void n(String str, l lVar) {
        e.c.d.y.h<String, l> hVar = this.a;
        if (lVar == null) {
            lVar = n.a;
        }
        hVar.put(str, lVar);
    }

    public Set<Map.Entry<String, l>> o() {
        return this.a.entrySet();
    }

    public l p(String str) {
        return this.a.get(str);
    }
}