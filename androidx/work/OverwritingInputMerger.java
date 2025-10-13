package androidx.work;

import androidx.work.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends g {
    @Override // androidx.work.g
    public e b(List<e> list) {
        e.a aVar = new e.a();
        HashMap map = new HashMap();
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            map.putAll(it.next().h());
        }
        aVar.d(map);
        return aVar.a();
    }
}