package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import j$.util.Spliterator;

/* compiled from: ActionMenuItem.java */
/* loaded from: classes.dex */
public class a implements c.h.e.a.b {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f181b;

    /* renamed from: c, reason: collision with root package name */
    private final int f182c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f183d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f184e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f185f;

    /* renamed from: g, reason: collision with root package name */
    private char f186g;

    /* renamed from: i, reason: collision with root package name */
    private char f188i;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f190k;

    /* renamed from: l, reason: collision with root package name */
    private Context f191l;

    /* renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f192m;
    private CharSequence n;
    private CharSequence o;

    /* renamed from: h, reason: collision with root package name */
    private int f187h = Spliterator.CONCURRENT;

    /* renamed from: j, reason: collision with root package name */
    private int f189j = Spliterator.CONCURRENT;
    private ColorStateList p = null;
    private PorterDuff.Mode q = null;
    private boolean r = false;
    private boolean s = false;
    private int t = 16;

    public a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f191l = context;
        this.a = i3;
        this.f181b = i2;
        this.f182c = i5;
        this.f183d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f190k;
        if (drawable != null) {
            if (this.r || this.s) {
                Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable);
                this.f190k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f190k = drawableMutate;
                if (this.r) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.p);
                }
                if (this.s) {
                    androidx.core.graphics.drawable.a.p(this.f190k, this.q);
                }
            }
        }
    }

    @Override // c.h.e.a.b
    public c.h.e.a.b a(c.h.l.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // c.h.e.a.b
    public c.h.l.b b() {
        return null;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c.h.e.a.b setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public c.h.e.a.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c.h.e.a.b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f189j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f188i;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f181b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f190k;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.p;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f185f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f187h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f186g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f182c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f183d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f184e;
        return charSequence != null ? charSequence : this.f183d;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f188i = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.t = (z ? 1 : 0) | (this.t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.t = (z ? 2 : 0) | (this.t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.t = (z ? 16 : 0) | (this.t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f190k = drawable;
        c();
        return this;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.p = colorStateList;
        this.r = true;
        c();
        return this;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.q = mode;
        this.s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f185f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f186g = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f192m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f186g = c2;
        this.f188i = Character.toLowerCase(c3);
        return this;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f183d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f184e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.t = (this.t & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f188i = Character.toLowerCase(c2);
        this.f189j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public c.h.e.a.b setContentDescription(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f186g = c2;
        this.f187h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f183d = this.f191l.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public c.h.e.a.b setTooltipText(CharSequence charSequence) {
        this.o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f190k = androidx.core.content.a.e(this.f191l, i2);
        c();
        return this;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f186g = c2;
        this.f187h = KeyEvent.normalizeMetaState(i2);
        this.f188i = Character.toLowerCase(c3);
        this.f189j = KeyEvent.normalizeMetaState(i3);
        return this;
    }
}