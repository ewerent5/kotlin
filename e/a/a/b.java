package e.a.a;

import java.util.HashMap;
import java.util.Map;

/* compiled from: Amplitude.java */
/* loaded from: classes.dex */
public class b {
    static final Map<String, d> a = new HashMap();

    public static d a() {
        return b(null);
    }

    public static synchronized d b(String str) {
        d dVar;
        String strE = m.e(str);
        Map<String, d> map = a;
        dVar = map.get(strE);
        if (dVar == null) {
            dVar = new d(strE);
            map.put(strE, dVar);
        }
        return dVar;
    }
}