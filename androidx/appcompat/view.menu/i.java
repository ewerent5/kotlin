package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import c.h.l.b;
import j$.util.Spliterator;

/* compiled from: MenuItemImpl.java */
/* loaded from: classes.dex */
public final class i implements c.h.e.a.b {
    private View A;
    private c.h.l.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f254b;

    /* renamed from: c, reason: collision with root package name */
    private final int f255c;

    /* renamed from: d, reason: collision with root package name */
    private final int f256d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f257e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f258f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f259g;

    /* renamed from: h, reason: collision with root package name */
    private char f260h;

    /* renamed from: j, reason: collision with root package name */
    private char f262j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f264l;
    g n;
    private r o;
    private Runnable p;
    private MenuItem.OnMenuItemClickListener q;
    private CharSequence r;
    private CharSequence s;
    private int z;

    /* renamed from: i, reason: collision with root package name */
    private int f261i = Spliterator.CONCURRENT;

    /* renamed from: k, reason: collision with root package name */
    private int f263k = Spliterator.CONCURRENT;

    /* renamed from: m, reason: collision with root package name */
    private int f265m = 0;
    private ColorStateList t = null;
    private PorterDuff.Mode u = null;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private int y = 16;
    private boolean D = false;

    /* compiled from: MenuItemImpl.java */
    class a implements b.InterfaceC0057b {
        a() {
        }

        @Override // c.h.l.b.InterfaceC0057b
        public void onActionProviderVisibilityChanged(boolean z) {
            i iVar = i.this;
            iVar.n.J(iVar);
        }
    }

    i(g gVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.z = 0;
        this.n = gVar;
        this.a = i3;
        this.f254b = i2;
        this.f255c = i4;
        this.f256d = i5;
        this.f257e = charSequence;
        this.z = i6;
    }

    private static void d(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.v) {
                androidx.core.graphics.drawable.a.o(drawable, this.t);
            }
            if (this.w) {
                androidx.core.graphics.drawable.a.p(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.n.H() && g() != 0;
    }

    public boolean B() {
        return (this.z & 4) == 4;
    }

    @Override // c.h.e.a.b
    public c.h.e.a.b a(c.h.l.b bVar) {
        c.h.l.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.n.K(true);
        c.h.l.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    @Override // c.h.e.a.b
    public c.h.l.b b() {
        return this.B;
    }

    public void c() {
        this.n.I(this);
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.f(this);
        }
        return false;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f256d;
    }

    char g() {
        return this.n.G() ? this.f262j : this.f260h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        c.h.l.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View viewD = bVar.d(this);
        this.A = viewD;
        return viewD;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f263k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f262j;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f254b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f264l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f265m == 0) {
            return null;
        }
        Drawable drawableD = c.a.k.a.a.d(this.n.u(), this.f265m);
        this.f265m = 0;
        this.f264l = drawableD;
        return e(drawableD);
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f259g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f261i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f260h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f255c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f257e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f258f;
        if (charSequence == null) {
            charSequence = this.f257e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.s;
    }

    String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(c.a.h.f2516k));
        }
        int i2 = this.n.G() ? this.f263k : this.f261i;
        d(sb, i2, 65536, resources.getString(c.a.h.f2512g));
        d(sb, i2, Spliterator.CONCURRENT, resources.getString(c.a.h.f2508c));
        d(sb, i2, 2, resources.getString(c.a.h.f2507b));
        d(sb, i2, 1, resources.getString(c.a.h.f2513h));
        d(sb, i2, 4, resources.getString(c.a.h.f2515j));
        d(sb, i2, 8, resources.getString(c.a.h.f2511f));
        if (cG == '\b') {
            sb.append(resources.getString(c.a.h.f2509d));
        } else if (cG == '\n') {
            sb.append(resources.getString(c.a.h.f2510e));
        } else if (cG != ' ') {
            sb.append(cG);
        } else {
            sb.append(resources.getString(c.a.h.f2514i));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o != null;
    }

    CharSequence i(n.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        c.h.l.b bVar = this.B;
        return (bVar == null || !bVar.g()) ? (this.y & 8) == 0 : (this.y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        c.h.l.b bVar;
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.d(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f259g != null) {
            try {
                this.n.u().startActivity(this.f259g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        c.h.l.b bVar = this.B;
        return bVar != null && bVar.e();
    }

    public boolean l() {
        return (this.y & 32) == 32;
    }

    public boolean m() {
        return (this.y & 4) != 0;
    }

    public boolean n() {
        return (this.z & 1) == 1;
    }

    public boolean o() {
        return (this.z & 2) == 2;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public c.h.e.a.b setActionView(int i2) {
        Context contextU = this.n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i2, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public c.h.e.a.b setActionView(View view) {
        int i2;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i2 = this.a) > 0) {
            view.setId(i2);
        }
        this.n.I(this);
        return this;
    }

    public void r(boolean z) {
        this.D = z;
        this.n.K(false);
    }

    void s(boolean z) {
        int i2 = this.y;
        int i3 = (z ? 2 : 0) | (i2 & (-3));
        this.y = i3;
        if (i2 != i3) {
            this.n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f262j == c2) {
            return this;
        }
        this.f262j = Character.toLowerCase(c2);
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i2 = this.y;
        int i3 = (z ? 1 : 0) | (i2 & (-2));
        this.y = i3;
        if (i2 != i3) {
            this.n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.y & 4) != 0) {
            this.n.T(this);
        } else {
            s(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.y |= 16;
        } else {
            this.y &= -17;
        }
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f265m = 0;
        this.f264l = drawable;
        this.x = true;
        this.n.K(false);
        return this;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.n.K(false);
        return this;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f259g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f260h == c2) {
            return this;
        }
        this.f260h = c2;
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f260h = c2;
        this.f262j = Character.toLowerCase(c3);
        this.n.K(false);
        return this;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.z = i2;
        this.n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f257e = charSequence;
        this.n.K(false);
        r rVar = this.o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f258f = charSequence;
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (y(z)) {
            this.n.J(this);
        }
        return this;
    }

    public void t(boolean z) {
        this.y = (z ? 4 : 0) | (this.y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f257e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z) {
        if (z) {
            this.y |= 32;
        } else {
            this.y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public c.h.e.a.b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public void x(r rVar) {
        this.o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z) {
        int i2 = this.y;
        int i3 = (z ? 0 : 8) | (i2 & (-9));
        this.y = i3;
        return i2 != i3;
    }

    public boolean z() {
        return this.n.A();
    }

    @Override // android.view.MenuItem
    public c.h.e.a.b setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public c.h.e.a.b setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.n.K(false);
        return this;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f262j == c2 && this.f263k == i2) {
            return this;
        }
        this.f262j = Character.toLowerCase(c2);
        this.f263k = KeyEvent.normalizeMetaState(i2);
        this.n.K(false);
        return this;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f260h == c2 && this.f261i == i2) {
            return this;
        }
        this.f260h = c2;
        this.f261i = KeyEvent.normalizeMetaState(i2);
        this.n.K(false);
        return this;
    }

    @Override // c.h.e.a.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f260h = c2;
        this.f261i = KeyEvent.normalizeMetaState(i2);
        this.f262j = Character.toLowerCase(c3);
        this.f263k = KeyEvent.normalizeMetaState(i3);
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f264l = null;
        this.f265m = i2;
        this.x = true;
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        return setTitle(this.n.u().getString(i2));
    }
}