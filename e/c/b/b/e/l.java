package e.c.b.b.e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class l implements a<Void, h<List<h<?>>>> {
    private final /* synthetic */ Collection a;

    l(Collection collection) {
        this.a = collection;
    }

    @Override // e.c.b.b.e.a
    public final /* synthetic */ h<List<h<?>>> a(h<Void> hVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a);
        return k.d(arrayList);
    }
}