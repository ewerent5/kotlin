package e.c.b.b.d;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;

/* loaded from: classes.dex */
final class d extends a.AbstractC0109a<e.c.b.b.d.b.a, a> {
    d() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0109a
    public final /* synthetic */ a.f a(Context context, Looper looper, com.google.android.gms.common.internal.c cVar, a aVar, com.google.android.gms.common.api.f fVar, g gVar) {
        a aVar2 = aVar;
        if (aVar2 == null) {
            aVar2 = a.a;
        }
        return new e.c.b.b.d.b.a(context, looper, true, cVar, aVar2, fVar, gVar);
    }
}