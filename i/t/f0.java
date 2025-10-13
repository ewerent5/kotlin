package i.t;

import java.util.Collections;
import java.util.Set;

/* compiled from: SetsJVM.kt */
/* loaded from: classes3.dex */
class f0 {
    public static final <T> Set<T> a(T t) {
        Set<T> setSingleton = Collections.singleton(t);
        i.y.d.l.c(setSingleton, "java.util.Collections.singleton(element)");
        return setSingleton;
    }
}