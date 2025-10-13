package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes.dex */
abstract class c {
    final Context a;

    /* renamed from: b, reason: collision with root package name */
    private c.e.g<c.h.e.a.b, MenuItem> f202b;

    /* renamed from: c, reason: collision with root package name */
    private c.e.g<c.h.e.a.c, SubMenu> f203c;

    c(Context context) {
        this.a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof c.h.e.a.b)) {
            return menuItem;
        }
        c.h.e.a.b bVar = (c.h.e.a.b) menuItem;
        if (this.f202b == null) {
            this.f202b = new c.e.g<>();
        }
        MenuItem menuItem2 = this.f202b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.a, bVar);
        this.f202b.put(bVar, jVar);
        return jVar;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof c.h.e.a.c)) {
            return subMenu;
        }
        c.h.e.a.c cVar = (c.h.e.a.c) subMenu;
        if (this.f203c == null) {
            this.f203c = new c.e.g<>();
        }
        SubMenu subMenu2 = this.f203c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.a, cVar);
        this.f203c.put(cVar, sVar);
        return sVar;
    }

    final void e() {
        c.e.g<c.h.e.a.b, MenuItem> gVar = this.f202b;
        if (gVar != null) {
            gVar.clear();
        }
        c.e.g<c.h.e.a.c, SubMenu> gVar2 = this.f203c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    final void f(int i2) {
        if (this.f202b == null) {
            return;
        }
        int i3 = 0;
        while (i3 < this.f202b.size()) {
            if (this.f202b.i(i3).getGroupId() == i2) {
                this.f202b.k(i3);
                i3--;
            }
            i3++;
        }
    }

    final void g(int i2) {
        if (this.f202b == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f202b.size(); i3++) {
            if (this.f202b.i(i3).getItemId() == i2) {
                this.f202b.k(i3);
                return;
            }
        }
    }
}