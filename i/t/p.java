package i.t;

import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollectionsJVM.kt */
/* loaded from: classes3.dex */
public class p extends o {
    public static <T extends Comparable<? super T>> void p(List<T> list) {
        i.y.d.l.d(list, "$this$sort");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}