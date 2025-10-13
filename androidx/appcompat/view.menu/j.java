package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import c.h.l.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: MenuItemWrapperICS.java */
/* loaded from: classes.dex */
public class j extends androidx.appcompat.view.menu.c implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    private final c.h.e.a.b f266d;

    /* renamed from: e, reason: collision with root package name */
    private Method f267e;

    /* compiled from: MenuItemWrapperICS.java */
    private class a extends c.h.l.b {

        /* renamed from: d, reason: collision with root package name */
        final ActionProvider f268d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f268d = actionProvider;
        }

        @Override // c.h.l.b
        public boolean a() {
            return this.f268d.hasSubMenu();
        }

        @Override // c.h.l.b
        public View c() {
            return this.f268d.onCreateActionView();
        }

        @Override // c.h.l.b
        public boolean e() {
            return this.f268d.onPerformDefaultAction();
        }

        @Override // c.h.l.b
        public void f(SubMenu subMenu) {
            this.f268d.onPrepareSubMenu(j.this.d(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f, reason: collision with root package name */
        private b.InterfaceC0057b f270f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // c.h.l.b
        public boolean b() {
            return this.f268d.isVisible();
        }

        @Override // c.h.l.b
        public View d(MenuItem menuItem) {
            return this.f268d.onCreateActionView(menuItem);
        }

        @Override // c.h.l.b
        public boolean g() {
            return this.f268d.overridesItemVisibility();
        }

        @Override // c.h.l.b
        public void j(b.InterfaceC0057b interfaceC0057b) {
            this.f270f = interfaceC0057b;
            this.f268d.setVisibilityListener(interfaceC0057b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            b.InterfaceC0057b interfaceC0057b = this.f270f;
            if (interfaceC0057b != null) {
                interfaceC0057b.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    static class c extends FrameLayout implements c.a.o.c {

        /* renamed from: e, reason: collision with root package name */
        final CollapsibleActionView f272e;

        /* JADX WARN: Multi-variable type inference failed */
        c(View view) {
            super(view.getContext());
            this.f272e = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f272e;
        }

        @Override // c.a.o.c
        public void c() {
            this.f272e.onActionViewExpanded();
        }

        @Override // c.a.o.c
        public void f() {
            this.f272e.onActionViewCollapsed();
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    private class d implements MenuItem.OnActionExpandListener {
        private final MenuItem.OnActionExpandListener a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.a.onMenuItemActionCollapse(j.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.a.onMenuItemActionExpand(j.this.c(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: e, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f274e;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f274e = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f274e.onMenuItemClick(j.this.c(menuItem));
        }
    }

    public j(Context context, c.h.e.a.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f266d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f266d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f266d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        c.h.l.b bVarB = this.f266d.b();
        if (bVarB instanceof a) {
            return ((a) bVarB).f268d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f266d.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f266d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f266d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f266d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f266d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f266d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f266d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f266d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f266d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f266d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f266d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f266d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f266d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f266d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f266d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f266d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f266d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f266d.getTooltipText();
    }

    public void h(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.f267e == null) {
                this.f267e = this.f266d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f267e.invoke(this.f266d, Boolean.valueOf(z));
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f266d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f266d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f266d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f266d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f266d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f266d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        c.h.l.b bVar = Build.VERSION.SDK_INT >= 16 ? new b(this.a, actionProvider) : new a(this.a, actionProvider);
        c.h.e.a.b bVar2 = this.f266d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f266d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f266d.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f266d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f266d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f266d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f266d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f266d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f266d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f266d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f266d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f266d.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f266d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f266d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f266d.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i2) {
        this.f266d.setShowAsAction(i2);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        this.f266d.setShowAsActionFlags(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f266d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f266d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f266d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f266d.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f266d.setAlphabeticShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f266d.setIcon(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f266d.setNumericShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f266d.setShortcut(c2, c3, i2, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f266d.setTitle(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
        this.f266d.setActionView(i2);
        View actionView = this.f266d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f266d.setActionView(new c(actionView));
        }
        return this;
    }
}