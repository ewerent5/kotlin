package e.c.b.d.a.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes.dex */
final class m extends g {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ IBinder f15345f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ o f15346g;

    m(o oVar, IBinder iBinder) {
        this.f15346g = oVar;
        this.f15345f = iBinder;
    }

    @Override // e.c.b.d.a.b.g
    public final void a() throws RemoteException {
        p pVar = this.f15346g.a;
        pVar.f15358l = (IInterface) pVar.f15354h.a(this.f15345f);
        p.j(this.f15346g.a);
        this.f15346g.a.f15352f = false;
        Iterator it = this.f15346g.a.f15351e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f15346g.a.f15351e.clear();
    }
}