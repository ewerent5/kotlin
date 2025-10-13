package androidx.work.impl.k.e;

import android.content.Context;
import android.os.Build;
import androidx.work.i;
import androidx.work.impl.l.j;

/* compiled from: NetworkConnectedController.java */
/* loaded from: classes.dex */
public class d extends c<androidx.work.impl.k.b> {
    public d(Context context, androidx.work.impl.utils.k.a aVar) {
        super(androidx.work.impl.k.f.g.c(context, aVar).d());
    }

    @Override // androidx.work.impl.k.e.c
    boolean b(j jVar) {
        return jVar.f2311l.b() == i.CONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.k.e.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(androidx.work.impl.k.b bVar) {
        return Build.VERSION.SDK_INT >= 26 ? (bVar.a() && bVar.d()) ? false : true : !bVar.a();
    }
}