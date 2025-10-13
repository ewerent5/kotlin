package i.t;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionsJVM.kt */
/* loaded from: classes3.dex */
public class k {
    public static final <T> Object[] a(T[] tArr, boolean z) {
        i.y.d.l.d(tArr, "$this$copyToArrayOfAny");
        if (z && i.y.d.l.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        i.y.d.l.c(objArrCopyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return objArrCopyOf;
    }

    public static <T> List<T> b(T t) {
        List<T> listSingletonList = Collections.singletonList(t);
        i.y.d.l.c(listSingletonList, "java.util.Collections.singletonList(element)");
        return listSingletonList;
    }
}