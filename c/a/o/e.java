package c.a.o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import c.a.o.b;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode.java */
/* loaded from: classes.dex */
public class e extends b implements g.a {

    /* renamed from: g, reason: collision with root package name */
    private Context f2582g;

    /* renamed from: h, reason: collision with root package name */
    private ActionBarContextView f2583h;

    /* renamed from: i, reason: collision with root package name */
    private b.a f2584i;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference<View> f2585j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2586k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2587l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f2588m;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f2582g = context;
        this.f2583h = actionBarContextView;
        this.f2584i = aVar;
        androidx.appcompat.view.menu.g gVarS = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).S(1);
        this.f2588m = gVarS;
        gVarS.R(this);
        this.f2587l = z;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        return this.f2584i.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        k();
        this.f2583h.l();
    }

    @Override // c.a.o.b
    public void c() {
        if (this.f2586k) {
            return;
        }
        this.f2586k = true;
        this.f2583h.sendAccessibilityEvent(32);
        this.f2584i.a(this);
    }

    @Override // c.a.o.b
    public View d() {
        WeakReference<View> weakReference = this.f2585j;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // c.a.o.b
    public Menu e() {
        return this.f2588m;
    }

    @Override // c.a.o.b
    public MenuInflater f() {
        return new g(this.f2583h.getContext());
    }

    @Override // c.a.o.b
    public CharSequence g() {
        return this.f2583h.getSubtitle();
    }

    @Override // c.a.o.b
    public CharSequence i() {
        return this.f2583h.getTitle();
    }

    @Override // c.a.o.b
    public void k() {
        this.f2584i.c(this, this.f2588m);
    }

    @Override // c.a.o.b
    public boolean l() {
        return this.f2583h.j();
    }

    @Override // c.a.o.b
    public void m(View view) {
        this.f2583h.setCustomView(view);
        this.f2585j = view != null ? new WeakReference<>(view) : null;
    }

    @Override // c.a.o.b
    public void n(int i2) {
        o(this.f2582g.getString(i2));
    }

    @Override // c.a.o.b
    public void o(CharSequence charSequence) {
        this.f2583h.setSubtitle(charSequence);
    }

    @Override // c.a.o.b
    public void q(int i2) {
        r(this.f2582g.getString(i2));
    }

    @Override // c.a.o.b
    public void r(CharSequence charSequence) {
        this.f2583h.setTitle(charSequence);
    }

    @Override // c.a.o.b
    public void s(boolean z) {
        super.s(z);
        this.f2583h.setTitleOptional(z);
    }
}