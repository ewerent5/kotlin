package i.t;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Iterables.kt */
/* loaded from: classes3.dex */
public class m extends l {
    public static <T> int o(Iterable<? extends T> iterable, int i2) {
        i.y.d.l.d(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }
}