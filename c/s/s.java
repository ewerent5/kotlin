package c.s;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: b, reason: collision with root package name */
    public View f3415b;
    public final Map<String, Object> a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<m> f3416c = new ArrayList<>();

    @Deprecated
    public s() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f3415b == sVar.f3415b && this.a.equals(sVar.a);
    }

    public int hashCode() {
        return (this.f3415b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3415b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }

    public s(View view) {
        this.f3415b = view;
    }
}