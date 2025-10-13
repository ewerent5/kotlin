package k.c.g.g;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import java.util.List;
import k.c.g.g.f;

/* compiled from: ItemizedIconOverlay.java */
/* loaded from: classes3.dex */
public class b<Item extends f> extends k.c.g.g.c<Item> {
    protected List<Item> t;
    protected d<Item> u;

    /* compiled from: ItemizedIconOverlay.java */
    class a implements c {
        final /* synthetic */ k.c.g.d a;

        a(k.c.g.d dVar) {
            this.a = dVar;
        }

        @Override // k.c.g.g.b.c
        public boolean a(int i2) {
            b bVar = b.this;
            if (bVar.u == null) {
                return false;
            }
            return bVar.I(i2, bVar.t.get(i2), this.a);
        }
    }

    /* compiled from: ItemizedIconOverlay.java */
    /* renamed from: k.c.g.g.b$b, reason: collision with other inner class name */
    class C0222b implements c {
        C0222b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // k.c.g.g.b.c
        public boolean a(int i2) {
            b bVar = b.this;
            if (bVar.u == null) {
                return false;
            }
            return bVar.H(i2, bVar.z(i2));
        }
    }

    /* compiled from: ItemizedIconOverlay.java */
    public interface c {
        boolean a(int i2);
    }

    /* compiled from: ItemizedIconOverlay.java */
    public interface d<T> {
        boolean a(int i2, T t);

        boolean b(int i2, T t);
    }

    public b(List<Item> list, Drawable drawable, d<Item> dVar, Context context) {
        super(drawable);
        this.t = list;
        this.u = dVar;
        D();
    }

    private boolean F(MotionEvent motionEvent, k.c.g.d dVar, c cVar) {
        int iRound = Math.round(motionEvent.getX());
        int iRound2 = Math.round(motionEvent.getY());
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            if (A(z(i2), iRound, iRound2, dVar) && cVar.a(i2)) {
                return true;
            }
        }
        return false;
    }

    @Override // k.c.g.g.c
    public int E() {
        return Math.min(this.t.size(), this.f16869f);
    }

    public boolean G(Item item) {
        boolean zAdd = this.t.add(item);
        D();
        return zAdd;
    }

    protected boolean H(int i2, Item item) {
        return this.u.a(i2, item);
    }

    protected boolean I(int i2, Item item, k.c.g.d dVar) {
        throw null;
    }

    public void J() {
        K(true);
    }

    public void K(boolean z) {
        this.t.clear();
        if (z) {
            D();
        }
    }

    public boolean L(Item item) {
        boolean zRemove = this.t.remove(item);
        D();
        return zRemove;
    }

    @Override // k.c.g.g.e.a
    public boolean d(int i2, int i3, Point point, k.c.a.c cVar) {
        return false;
    }

    @Override // k.c.g.g.e
    public void h(k.c.g.d dVar) {
        List<Item> list = this.t;
        if (list != null) {
            list.clear();
        }
        this.t = null;
        this.u = null;
    }

    @Override // k.c.g.g.e
    public boolean o(MotionEvent motionEvent, k.c.g.d dVar) {
        if (F(motionEvent, dVar, new C0222b())) {
            return true;
        }
        return super.o(motionEvent, dVar);
    }

    @Override // k.c.g.g.c, k.c.g.g.e
    public boolean r(MotionEvent motionEvent, k.c.g.d dVar) {
        if (F(motionEvent, dVar, new a(dVar))) {
            return true;
        }
        return super.r(motionEvent, dVar);
    }

    @Override // k.c.g.g.c
    protected Item x(int i2) {
        return this.t.get(i2);
    }
}