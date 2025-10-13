package androidx.work;

import java.util.List;

/* compiled from: InputMerger.java */
/* loaded from: classes.dex */
public abstract class g {
    private static final String a = h.f("InputMerger");

    public static g a(String str) {
        try {
            return (g) Class.forName(str).newInstance();
        } catch (Exception e2) {
            h.c().b(a, "Trouble instantiating + " + str, e2);
            return null;
        }
    }

    public abstract e b(List<e> list);
}