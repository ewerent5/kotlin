package i.t;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sets.kt */
/* loaded from: classes3.dex */
public class g0 extends f0 {
    public static <T> Set<T> b() {
        return x.f15843e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> c(Set<? extends T> set) {
        i.y.d.l.d(set, "$this$optimizeReadOnlySet");
        int size = set.size();
        return size != 0 ? size != 1 ? set : f0.a(set.iterator().next()) : b();
    }
}