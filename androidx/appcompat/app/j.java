package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.x0;
import c.h.l.t;
import java.util.ArrayList;

/* compiled from: ToolbarActionBar.java */
/* loaded from: classes.dex */
class j extends androidx.appcompat.app.a {
    d0 a;

    /* renamed from: b, reason: collision with root package name */
    boolean f124b;

    /* renamed from: c, reason: collision with root package name */
    Window.Callback f125c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f126d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f127e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<a.b> f128f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f129g = new a();

    /* renamed from: h, reason: collision with root package name */
    private final Toolbar.f f130h;

    /* compiled from: ToolbarActionBar.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.x();
        }
    }

    /* compiled from: ToolbarActionBar.java */
    class b implements Toolbar.f {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return j.this.f125c.onMenuItemSelected(0, menuItem);
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private final class c implements m.a {

        /* renamed from: e, reason: collision with root package name */
        private boolean f132e;

        c() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
            if (this.f132e) {
                return;
            }
            this.f132e = true;
            j.this.a.h();
            Window.Callback callback = j.this.f125c;
            if (callback != null) {
                callback.onPanelClosed(108, gVar);
            }
            this.f132e = false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callback = j.this.f125c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private final class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            j jVar = j.this;
            if (jVar.f125c != null) {
                if (jVar.a.b()) {
                    j.this.f125c.onPanelClosed(108, gVar);
                } else if (j.this.f125c.onPreparePanel(0, null, gVar)) {
                    j.this.f125c.onMenuOpened(108, gVar);
                }
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private class e extends c.a.o.i {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // c.a.o.i, android.view.Window.Callback
        public View onCreatePanelView(int i2) {
            return i2 == 0 ? new View(j.this.a.getContext()) : super.onCreatePanelView(i2);
        }

        @Override // c.a.o.i, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            boolean zOnPreparePanel = super.onPreparePanel(i2, view, menu);
            if (zOnPreparePanel) {
                j jVar = j.this;
                if (!jVar.f124b) {
                    jVar.a.c();
                    j.this.f124b = true;
                }
            }
            return zOnPreparePanel;
        }
    }

    j(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f130h = bVar;
        this.a = new x0(toolbar, false);
        e eVar = new e(callback);
        this.f125c = eVar;
        this.a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.a.setWindowTitle(charSequence);
    }

    private Menu v() {
        if (!this.f126d) {
            this.a.p(new c(), new d());
            this.f126d = true;
        }
        return this.a.l();
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        return this.a.f();
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        if (!this.a.j()) {
            return false;
        }
        this.a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z) {
        if (z == this.f127e) {
            return;
        }
        this.f127e = z;
        int size = this.f128f.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f128f.get(i2).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.a.t();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        return this.a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public boolean k() {
        this.a.r().removeCallbacks(this.f129g);
        t.c0(this.a.r(), this.f129g);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void l(Configuration configuration) {
        super.l(configuration);
    }

    @Override // androidx.appcompat.app.a
    void m() {
        this.a.r().removeCallbacks(this.f129g);
    }

    @Override // androidx.appcompat.app.a
    public boolean n(int i2, KeyEvent keyEvent) {
        Menu menuV = v();
        if (menuV == null) {
            return false;
        }
        menuV.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuV.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            p();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean p() {
        return this.a.g();
    }

    @Override // androidx.appcompat.app.a
    public void q(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z) {
        y(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void t(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    public Window.Callback w() {
        return this.f125c;
    }

    void x() {
        Menu menuV = v();
        androidx.appcompat.view.menu.g gVar = menuV instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menuV : null;
        if (gVar != null) {
            gVar.d0();
        }
        try {
            menuV.clear();
            if (!this.f125c.onCreatePanelMenu(0, menuV) || !this.f125c.onPreparePanel(0, null, menuV)) {
                menuV.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.c0();
            }
        }
    }

    public void y(int i2, int i3) {
        this.a.k((i2 & i3) | ((~i3) & this.a.t()));
    }
}