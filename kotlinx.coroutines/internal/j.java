package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.m0;

/* compiled from: InlineList.kt */
/* loaded from: classes3.dex */
public final class j<E> {
    public static Object a(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, int i2, i.y.d.g gVar) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, E e2) {
        if (m0.a() && !(!(e2 instanceof List))) {
            throw new AssertionError();
        }
        if (obj == null) {
            return a(e2);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e2);
            return a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e2);
        return a(arrayList);
    }
}