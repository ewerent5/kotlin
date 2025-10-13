package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import c.h.l.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.http2.Settings;

/* compiled from: MenuBuilder.java */
/* loaded from: classes.dex */
public class g implements c.h.e.a.a {
    private static final int[] a = {1, 4, 5, 3, 2, 0};
    private boolean A;

    /* renamed from: b, reason: collision with root package name */
    private final Context f238b;

    /* renamed from: c, reason: collision with root package name */
    private final Resources f239c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f240d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f241e;

    /* renamed from: f, reason: collision with root package name */
    private a f242f;
    private ContextMenu.ContextMenuInfo n;
    CharSequence o;
    Drawable p;
    View q;
    private i y;

    /* renamed from: m, reason: collision with root package name */
    private int f249m = 0;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private ArrayList<i> w = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<m>> x = new CopyOnWriteArrayList<>();
    private boolean z = false;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<i> f243g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<i> f244h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private boolean f245i = true;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<i> f246j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<i> f247k = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    private boolean f248l = true;

    /* compiled from: MenuBuilder.java */
    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    /* compiled from: MenuBuilder.java */
    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        this.f238b = context;
        this.f239c = context.getResources();
        b0(true);
    }

    private static int B(int i2) {
        int i3 = ((-65536) & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = a;
            if (i3 < iArr.length) {
                return (i2 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i2, boolean z) {
        if (i2 < 0 || i2 >= this.f243g.size()) {
            return;
        }
        this.f243g.remove(i2);
        if (z) {
            K(true);
        }
    }

    private void W(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resourcesC = C();
        if (view != null) {
            this.q = view;
            this.o = null;
            this.p = null;
        } else {
            if (i2 > 0) {
                this.o = resourcesC.getText(i2);
            } else if (charSequence != null) {
                this.o = charSequence;
            }
            if (i3 > 0) {
                this.p = androidx.core.content.a.e(u(), i3);
            } else if (drawable != null) {
                this.p = drawable;
            }
            this.q = null;
        }
        K(false);
    }

    private void b0(boolean z) {
        this.f241e = z && this.f239c.getConfiguration().keyboard != 1 && u.e(ViewConfiguration.get(this.f238b), this.f238b);
    }

    private i g(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new i(this, i2, i3, i4, i5, charSequence, i6);
    }

    private void i(boolean z) {
        if (this.x.isEmpty()) {
            return;
        }
        d0();
        Iterator<WeakReference<m>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.x.remove(next);
            } else {
                mVar.d(z);
            }
        }
        c0();
    }

    private boolean j(r rVar, m mVar) {
        if (this.x.isEmpty()) {
            return false;
        }
        boolean zK = mVar != null ? mVar.k(rVar) : false;
        Iterator<WeakReference<m>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null) {
                this.x.remove(next);
            } else if (!zK) {
                zK = mVar2.k(rVar);
            }
        }
        return zK;
    }

    private static int n(ArrayList<i> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.u;
    }

    Resources C() {
        return this.f239c;
    }

    public g D() {
        return this;
    }

    public ArrayList<i> E() {
        if (!this.f245i) {
            return this.f244h;
        }
        this.f244h.clear();
        int size = this.f243g.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f243g.get(i2);
            if (iVar.isVisible()) {
                this.f244h.add(iVar);
            }
        }
        this.f245i = false;
        this.f248l = true;
        return this.f244h;
    }

    public boolean F() {
        return this.z;
    }

    boolean G() {
        return this.f240d;
    }

    public boolean H() {
        return this.f241e;
    }

    void I(i iVar) {
        this.f248l = true;
        K(true);
    }

    void J(i iVar) {
        this.f245i = true;
        K(true);
    }

    public void K(boolean z) {
        if (this.r) {
            this.s = true;
            if (z) {
                this.t = true;
                return;
            }
            return;
        }
        if (z) {
            this.f245i = true;
            this.f248l = true;
        }
        i(z);
    }

    public boolean L(MenuItem menuItem, int i2) {
        return M(menuItem, null, i2);
    }

    public boolean M(MenuItem menuItem, m mVar, int i2) {
        i iVar = (i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean zK = iVar.k();
        c.h.l.b bVarB = iVar.b();
        boolean z = bVarB != null && bVarB.a();
        if (iVar.j()) {
            zK |= iVar.expandActionView();
            if (zK) {
                e(true);
            }
        } else if (iVar.hasSubMenu() || z) {
            if ((i2 & 4) == 0) {
                e(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.x(new r(u(), this, iVar));
            }
            r rVar = (r) iVar.getSubMenu();
            if (z) {
                bVarB.f(rVar);
            }
            zK |= j(rVar, mVar);
            if (!zK) {
                e(true);
            }
        } else if ((i2 & 1) == 0) {
            e(true);
        }
        return zK;
    }

    public void O(m mVar) {
        Iterator<WeakReference<m>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.x.remove(next);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).P(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f242f = aVar;
    }

    public g S(int i2) {
        this.f249m = i2;
        return this;
    }

    void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f243g.size();
        d0();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f243g.get(i2);
            if (iVar.getGroupId() == groupId && iVar.m() && iVar.isCheckable()) {
                iVar.s(iVar == menuItem);
            }
        }
        c0();
    }

    protected g U(int i2) {
        W(0, null, i2, null, null);
        return this;
    }

    protected g V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    protected g X(int i2) {
        W(i2, null, 0, null, null);
        return this;
    }

    protected g Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    protected g Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int iB = B(i4);
        i iVarG = g(i2, i3, i4, iB, charSequence, this.f249m);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.n;
        if (contextMenuInfo != null) {
            iVarG.v(contextMenuInfo);
        }
        ArrayList<i> arrayList = this.f243g;
        arrayList.add(n(arrayList, iB), iVarG);
        K(true);
        return iVarG;
    }

    public void a0(boolean z) {
        this.A = z;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f238b.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar) {
        c(mVar, this.f238b);
    }

    public void c(m mVar, Context context) {
        this.x.add(new WeakReference<>(mVar));
        mVar.i(context, this);
        this.f248l = true;
    }

    public void c0() {
        this.r = false;
        if (this.s) {
            this.s = false;
            K(this.t);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        i iVar = this.y;
        if (iVar != null) {
            f(iVar);
        }
        this.f243g.clear();
        K(true);
    }

    public void clearHeader() {
        this.p = null;
        this.o = null;
        this.q = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f242f;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (this.r) {
            return;
        }
        this.r = true;
        this.s = false;
        this.t = false;
    }

    public final void e(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        Iterator<WeakReference<m>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.x.remove(next);
            } else {
                mVar.c(this, z);
            }
        }
        this.v = false;
    }

    public boolean f(i iVar) {
        boolean zF = false;
        if (!this.x.isEmpty() && this.y == iVar) {
            d0();
            Iterator<WeakReference<m>> it = this.x.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.x.remove(next);
                } else {
                    zF = mVar.f(this, iVar);
                    if (zF) {
                        break;
                    }
                }
            }
            c0();
            if (zF) {
                this.y = null;
            }
        }
        return zF;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f243g.get(i3);
            if (iVar.getItemId() == i2) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (menuItemFindItem = iVar.getSubMenu().findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return this.f243g.get(i2);
    }

    boolean h(g gVar, MenuItem menuItem) {
        a aVar = this.f242f;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.A) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f243g.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return p(i2, keyEvent) != null;
    }

    public boolean k(i iVar) {
        boolean zG = false;
        if (this.x.isEmpty()) {
            return false;
        }
        d0();
        Iterator<WeakReference<m>> it = this.x.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.x.remove(next);
            } else {
                zG = mVar.g(this, iVar);
                if (zG) {
                    break;
                }
            }
        }
        c0();
        if (zG) {
            this.y = iVar;
        }
        return zG;
    }

    public int l(int i2) {
        return m(i2, 0);
    }

    public int m(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f243g.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public int o(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f243g.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    i p(int i2, KeyEvent keyEvent) {
        ArrayList<i> arrayList = this.w;
        arrayList.clear();
        q(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zG = G();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = arrayList.get(i3);
            char alphabeticShortcut = zG ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zG && alphabeticShortcut == '\b' && i2 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return L(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        i iVarP = p(i2, keyEvent);
        boolean zL = iVarP != null ? L(iVarP, i3) : false;
        if ((i3 & 2) != 0) {
            e(true);
        }
        return zL;
    }

    void q(List<i> list, int i2, KeyEvent keyEvent) {
        boolean zG = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f243g.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar = this.f243g.get(i3);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).q(list, i2, keyEvent);
                }
                char alphabeticShortcut = zG ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((zG ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zG && alphabeticShortcut == '\b' && i2 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<i> arrayListE = E();
        if (this.f248l) {
            Iterator<WeakReference<m>> it = this.x.iterator();
            boolean zE = false;
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.x.remove(next);
                } else {
                    zE |= mVar.e();
                }
            }
            if (zE) {
                this.f246j.clear();
                this.f247k.clear();
                int size = arrayListE.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = arrayListE.get(i2);
                    if (iVar.l()) {
                        this.f246j.add(iVar);
                    } else {
                        this.f247k.add(iVar);
                    }
                }
            } else {
                this.f246j.clear();
                this.f247k.clear();
                this.f247k.addAll(E());
            }
            this.f248l = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int iL = l(i2);
        if (iL >= 0) {
            int size = this.f243g.size() - iL;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f243g.get(iL).getGroupId() != i2) {
                    break;
                }
                N(iL, false);
                i3 = i4;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        N(o(i2), true);
    }

    public ArrayList<i> s() {
        r();
        return this.f246j;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        int size = this.f243g.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f243g.get(i3);
            if (iVar.getGroupId() == i2) {
                iVar.t(z2);
                iVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.z = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z) {
        int size = this.f243g.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f243g.get(i3);
            if (iVar.getGroupId() == i2) {
                iVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z) {
        int size = this.f243g.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f243g.get(i3);
            if (iVar.getGroupId() == i2 && iVar.y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f240d = z;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f243g.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f238b;
    }

    public i v() {
        return this.y;
    }

    public Drawable w() {
        return this.p;
    }

    public CharSequence x() {
        return this.o;
    }

    public View y() {
        return this.q;
    }

    public ArrayList<i> z() {
        r();
        return this.f247k;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.f239c.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f239c.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        i iVar = (i) a(i2, i3, i4, charSequence);
        r rVar = new r(this.f238b, this, iVar);
        iVar.x(rVar);
        return rVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f239c.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f239c.getString(i5));
    }
}