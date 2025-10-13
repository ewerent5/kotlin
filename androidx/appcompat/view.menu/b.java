package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter.java */
/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: e, reason: collision with root package name */
    protected Context f193e;

    /* renamed from: f, reason: collision with root package name */
    protected Context f194f;

    /* renamed from: g, reason: collision with root package name */
    protected g f195g;

    /* renamed from: h, reason: collision with root package name */
    protected LayoutInflater f196h;

    /* renamed from: i, reason: collision with root package name */
    protected LayoutInflater f197i;

    /* renamed from: j, reason: collision with root package name */
    private m.a f198j;

    /* renamed from: k, reason: collision with root package name */
    private int f199k;

    /* renamed from: l, reason: collision with root package name */
    private int f200l;

    /* renamed from: m, reason: collision with root package name */
    protected n f201m;
    private int n;

    public b(Context context, int i2, int i3) {
        this.f193e = context;
        this.f196h = LayoutInflater.from(context);
        this.f199k = i2;
        this.f200l = i3;
    }

    protected void a(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f201m).addView(view, i2);
    }

    public abstract void b(i iVar, n.a aVar);

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z) {
        m.a aVar = this.f198j;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f201m;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f195g;
        int i2 = 0;
        if (gVar != null) {
            gVar.r();
            ArrayList<i> arrayListE = this.f195g.E();
            int size = arrayListE.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                i iVar = arrayListE.get(i4);
                if (q(i3, iVar)) {
                    View childAt = viewGroup.getChildAt(i3);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View viewN = n(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        a(viewN, i3);
                    }
                    i3++;
                }
            }
            i2 = i3;
        }
        while (i2 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i2)) {
                i2++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.f198j = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(Context context, g gVar) {
        this.f194f = context;
        this.f197i = LayoutInflater.from(context);
        this.f195g = gVar;
    }

    public n.a j(ViewGroup viewGroup) {
        return (n.a) this.f196h.inflate(this.f200l, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        m.a aVar = this.f198j;
        r rVar2 = rVar;
        if (aVar == null) {
            return false;
        }
        if (rVar == null) {
            rVar2 = this.f195g;
        }
        return aVar.d(rVar2);
    }

    protected boolean l(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public m.a m() {
        return this.f198j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a aVarJ = view instanceof n.a ? (n.a) view : j(viewGroup);
        b(iVar, aVarJ);
        return (View) aVarJ;
    }

    public n o(ViewGroup viewGroup) {
        if (this.f201m == null) {
            n nVar = (n) this.f196h.inflate(this.f199k, viewGroup, false);
            this.f201m = nVar;
            nVar.b(this.f195g);
            d(true);
        }
        return this.f201m;
    }

    public void p(int i2) {
        this.n = i2;
    }

    public abstract boolean q(int i2, i iVar);
}