package androidx.work.impl.k.e;

import android.content.Context;
import android.os.Build;
import androidx.work.i;
import androidx.work.impl.l.j;

/* compiled from: NetworkNotRoamingController.java */
/* loaded from: classes.dex */
public class f extends c<androidx.work.impl.k.b> {

    /* renamed from: e, reason: collision with root package name */
    private static final String f2269e = androidx.work.h.f("NetworkNotRoamingCtrlr");

    public f(Context context, androidx.work.impl.utils.k.a aVar) {
        super(androidx.work.impl.k.f.g.c(context, aVar).d());
    }

    @Override // androidx.work.impl.k.e.c
    boolean b(j jVar) {
        return jVar.f2311l.b() == i.NOT_ROAMING;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.k.e.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(androidx.work.impl.k.b bVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return (bVar.a() && bVar.c()) ? false : true;
        }
        androidx.work.h.c().a(f2269e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}