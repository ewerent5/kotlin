package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.l0;
import c.h.l.t;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: f, reason: collision with root package name */
    private static final int f204f = c.a.g.f2498e;
    private boolean B;
    private m.a C;
    ViewTreeObserver D;
    private PopupWindow.OnDismissListener E;
    boolean F;

    /* renamed from: g, reason: collision with root package name */
    private final Context f205g;

    /* renamed from: h, reason: collision with root package name */
    private final int f206h;

    /* renamed from: i, reason: collision with root package name */
    private final int f207i;

    /* renamed from: j, reason: collision with root package name */
    private final int f208j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f209k;

    /* renamed from: l, reason: collision with root package name */
    final Handler f210l;
    private View t;
    View u;
    private boolean w;
    private boolean x;
    private int y;
    private int z;

    /* renamed from: m, reason: collision with root package name */
    private final List<g> f211m = new ArrayList();
    final List<C0002d> n = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener o = new a();
    private final View.OnAttachStateChangeListener p = new b();
    private final k0 q = new c();
    private int r = 0;
    private int s = 0;
    private boolean A = false;
    private int v = D();

    /* compiled from: CascadingMenuPopup.java */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.a() || d.this.n.size() <= 0 || d.this.n.get(0).a.B()) {
                return;
            }
            View view = d.this.u;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<C0002d> it = d.this.n.iterator();
            while (it.hasNext()) {
                it.next().a.b();
            }
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.D;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.D = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.D.removeGlobalOnLayoutListener(dVar.o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    class c implements k0 {

        /* compiled from: CascadingMenuPopup.java */
        class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0002d f215e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ MenuItem f216f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ g f217g;

            a(C0002d c0002d, MenuItem menuItem, g gVar) {
                this.f215e = c0002d;
                this.f216f = menuItem;
                this.f217g = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0002d c0002d = this.f215e;
                if (c0002d != null) {
                    d.this.F = true;
                    c0002d.f219b.e(false);
                    d.this.F = false;
                }
                if (this.f216f.isEnabled() && this.f216f.hasSubMenu()) {
                    this.f217g.L(this.f216f, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.k0
        public void e(g gVar, MenuItem menuItem) {
            d.this.f210l.removeCallbacksAndMessages(null);
            int size = d.this.n.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (gVar == d.this.n.get(i2).f219b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            d.this.f210l.postAtTime(new a(i3 < d.this.n.size() ? d.this.n.get(i3) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.k0
        public void h(g gVar, MenuItem menuItem) {
            d.this.f210l.removeCallbacksAndMessages(gVar);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    private static class C0002d {
        public final l0 a;

        /* renamed from: b, reason: collision with root package name */
        public final g f219b;

        /* renamed from: c, reason: collision with root package name */
        public final int f220c;

        public C0002d(l0 l0Var, g gVar, int i2) {
            this.a = l0Var;
            this.f219b = gVar;
            this.f220c = i2;
        }

        public ListView a() {
            return this.a.j();
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z) {
        this.f205g = context;
        this.t = view;
        this.f207i = i2;
        this.f208j = i3;
        this.f209k = z;
        Resources resources = context.getResources();
        this.f206h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(c.a.d.f2462d));
        this.f210l = new Handler();
    }

    private int A(g gVar) {
        int size = this.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (gVar == this.n.get(i2).f219b) {
                return i2;
            }
        }
        return -1;
    }

    private MenuItem B(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = gVar.getItem(i2);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(C0002d c0002d, g gVar) {
        f fVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemB = B(c0002d.f219b, gVar);
        if (menuItemB == null) {
            return null;
        }
        ListView listViewA = c0002d.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            headersCount = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (menuItemB == fVar.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return t.B(this.t) == 1 ? 0 : 1;
    }

    private int E(int i2) {
        List<C0002d> list = this.n;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.u.getWindowVisibleDisplayFrame(rect);
        return this.v == 1 ? (iArr[0] + listViewA.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    private void F(g gVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C0002d c0002d;
        View viewC;
        int i2;
        int i3;
        int i4;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f205g);
        f fVar = new f(gVar, layoutInflaterFrom, this.f209k, f204f);
        if (!a() && this.A) {
            fVar.d(true);
        } else if (a()) {
            fVar.d(k.x(gVar));
        }
        int iO = k.o(fVar, null, this.f205g, this.f206h);
        l0 l0VarZ = z();
        l0VarZ.p(fVar);
        l0VarZ.F(iO);
        l0VarZ.G(this.s);
        if (this.n.size() > 0) {
            List<C0002d> list = this.n;
            c0002d = list.get(list.size() - 1);
            viewC = C(c0002d, gVar);
        } else {
            c0002d = null;
            viewC = null;
        }
        if (viewC != null) {
            l0VarZ.U(false);
            l0VarZ.R(null);
            int iE = E(iO);
            boolean z = iE == 1;
            this.v = iE;
            if (Build.VERSION.SDK_INT >= 26) {
                l0VarZ.D(viewC);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.t.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewC.getLocationOnScreen(iArr2);
                if ((this.s & 7) == 5) {
                    iArr[0] = iArr[0] + this.t.getWidth();
                    iArr2[0] = iArr2[0] + viewC.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.s & 5) == 5) {
                if (!z) {
                    iO = viewC.getWidth();
                    i4 = i2 - iO;
                }
                i4 = i2 + iO;
            } else {
                if (z) {
                    iO = viewC.getWidth();
                    i4 = i2 + iO;
                }
                i4 = i2 - iO;
            }
            l0VarZ.f(i4);
            l0VarZ.M(true);
            l0VarZ.l(i3);
        } else {
            if (this.w) {
                l0VarZ.f(this.y);
            }
            if (this.x) {
                l0VarZ.l(this.z);
            }
            l0VarZ.H(n());
        }
        this.n.add(new C0002d(l0VarZ, gVar, this.v));
        l0VarZ.b();
        ListView listViewJ = l0VarZ.j();
        listViewJ.setOnKeyListener(this);
        if (c0002d == null && this.B && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(c.a.g.f2505l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.x());
            listViewJ.addHeaderView(frameLayout, null, false);
            l0VarZ.b();
        }
    }

    private l0 z() {
        l0 l0Var = new l0(this.f205g, null, this.f207i, this.f208j);
        l0Var.T(this.q);
        l0Var.L(this);
        l0Var.K(this);
        l0Var.D(this.t);
        l0Var.G(this.s);
        l0Var.J(true);
        l0Var.I(2);
        return l0Var;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean a() {
        return this.n.size() > 0 && this.n.get(0).a.a();
    }

    @Override // androidx.appcompat.view.menu.p
    public void b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        Iterator<g> it = this.f211m.iterator();
        while (it.hasNext()) {
            F(it.next());
        }
        this.f211m.clear();
        View view = this.t;
        this.u = view;
        if (view != null) {
            boolean z = this.D == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.D = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.o);
            }
            this.u.addOnAttachStateChangeListener(this.p);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z) {
        int iA = A(gVar);
        if (iA < 0) {
            return;
        }
        int i2 = iA + 1;
        if (i2 < this.n.size()) {
            this.n.get(i2).f219b.e(false);
        }
        C0002d c0002dRemove = this.n.remove(iA);
        c0002dRemove.f219b.O(this);
        if (this.F) {
            c0002dRemove.a.S(null);
            c0002dRemove.a.E(0);
        }
        c0002dRemove.a.dismiss();
        int size = this.n.size();
        if (size > 0) {
            this.v = this.n.get(size - 1).f220c;
        } else {
            this.v = D();
        }
        if (size != 0) {
            if (z) {
                this.n.get(0).f219b.e(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.C;
        if (aVar != null) {
            aVar.c(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.D;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.D.removeGlobalOnLayoutListener(this.o);
            }
            this.D = null;
        }
        this.u.removeOnAttachStateChangeListener(this.p);
        this.E.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z) {
        Iterator<C0002d> it = this.n.iterator();
        while (it.hasNext()) {
            k.y(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.n.size();
        if (size > 0) {
            C0002d[] c0002dArr = (C0002d[]) this.n.toArray(new C0002d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0002d c0002d = c0002dArr[i2];
                if (c0002d.a.a()) {
                    c0002d.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.C = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        if (this.n.isEmpty()) {
            return null;
        }
        return this.n.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (C0002d c0002d : this.n) {
            if (rVar == c0002d.f219b) {
                c0002d.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        l(rVar);
        m.a aVar = this.C;
        if (aVar != null) {
            aVar.d(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        gVar.c(this, this.f205g);
        if (a()) {
            F(gVar);
        } else {
            this.f211m.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0002d c0002d;
        int size = this.n.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0002d = null;
                break;
            }
            c0002d = this.n.get(i2);
            if (!c0002d.a.a()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0002d != null) {
            c0002d.f219b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void p(View view) {
        if (this.t != view) {
            this.t = view;
            this.s = c.h.l.d.b(this.r, t.B(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z) {
        this.A = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i2) {
        if (this.r != i2) {
            this.r = i2;
            this.s = c.h.l.d.b(i2, t.B(this.t));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i2) {
        this.w = true;
        this.y = i2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z) {
        this.B = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i2) {
        this.x = true;
        this.z = i2;
    }
}