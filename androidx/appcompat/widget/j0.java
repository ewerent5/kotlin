package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import ch.qos.logback.classic.Level;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public class j0 implements androidx.appcompat.view.menu.p {

    /* renamed from: e, reason: collision with root package name */
    private static Method f494e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f495f;

    /* renamed from: g, reason: collision with root package name */
    private static Method f496g;
    private Drawable A;
    private AdapterView.OnItemClickListener B;
    private AdapterView.OnItemSelectedListener C;
    final g D;
    private final f E;
    private final e F;
    private final c G;
    private Runnable H;
    final Handler I;
    private final Rect J;
    private Rect K;
    private boolean L;
    PopupWindow M;

    /* renamed from: h, reason: collision with root package name */
    private Context f497h;

    /* renamed from: i, reason: collision with root package name */
    private ListAdapter f498i;

    /* renamed from: j, reason: collision with root package name */
    f0 f499j;

    /* renamed from: k, reason: collision with root package name */
    private int f500k;

    /* renamed from: l, reason: collision with root package name */
    private int f501l;

    /* renamed from: m, reason: collision with root package name */
    private int f502m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t;
    private boolean u;
    int v;
    private View w;
    private int x;
    private DataSetObserver y;
    private View z;

    /* compiled from: ListPopupWindow.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewT = j0.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            j0.this.b();
        }
    }

    /* compiled from: ListPopupWindow.java */
    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            f0 f0Var;
            if (i2 == -1 || (f0Var = j0.this.f499j) == null) {
                return;
            }
            f0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: ListPopupWindow.java */
    private class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.this.r();
        }
    }

    /* compiled from: ListPopupWindow.java */
    private class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (j0.this.a()) {
                j0.this.b();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            j0.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow.java */
    private class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 != 1 || j0.this.A() || j0.this.M.getContentView() == null) {
                return;
            }
            j0 j0Var = j0.this;
            j0Var.I.removeCallbacks(j0Var.D);
            j0.this.D.run();
        }
    }

    /* compiled from: ListPopupWindow.java */
    private class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = j0.this.M) != null && popupWindow.isShowing() && x >= 0 && x < j0.this.M.getWidth() && y >= 0 && y < j0.this.M.getHeight()) {
                j0 j0Var = j0.this;
                j0Var.I.postDelayed(j0Var.D, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            j0 j0Var2 = j0.this;
            j0Var2.I.removeCallbacks(j0Var2.D);
            return false;
        }
    }

    /* compiled from: ListPopupWindow.java */
    private class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = j0.this.f499j;
            if (f0Var == null || !c.h.l.t.P(f0Var) || j0.this.f499j.getCount() <= j0.this.f499j.getChildCount()) {
                return;
            }
            int childCount = j0.this.f499j.getChildCount();
            j0 j0Var = j0.this;
            if (childCount <= j0Var.v) {
                j0Var.M.setInputMethodMode(2);
                j0.this.b();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f494e = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f496g = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f495f = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public j0(Context context) {
        this(context, null, c.a.a.D);
    }

    private void C() {
        View view = this.w;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.w);
            }
        }
    }

    private void N(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            this.M.setIsClippedToScreen(z);
            return;
        }
        Method method = f494e;
        if (method != null) {
            try {
                method.invoke(this.M, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int q() {
        int measuredHeight;
        int i2;
        int iMakeMeasureSpec;
        int i3;
        if (this.f499j == null) {
            Context context = this.f497h;
            this.H = new a();
            f0 f0VarS = s(context, !this.L);
            this.f499j = f0VarS;
            Drawable drawable = this.A;
            if (drawable != null) {
                f0VarS.setSelector(drawable);
            }
            this.f499j.setAdapter(this.f498i);
            this.f499j.setOnItemClickListener(this.B);
            this.f499j.setFocusable(true);
            this.f499j.setFocusableInTouchMode(true);
            this.f499j.setOnItemSelectedListener(new b());
            this.f499j.setOnScrollListener(this.F);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.C;
            if (onItemSelectedListener != null) {
                this.f499j.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f499j;
            View view2 = this.w;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.x;
                if (i4 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i4 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.x);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i5 = this.f501l;
                if (i5 >= 0) {
                    i3 = Level.ALL_INT;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
            }
            this.M.setContentView(view);
        } else {
            View view3 = this.w;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.M.getBackground();
        if (background != null) {
            background.getPadding(this.J);
            Rect rect = this.J;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.p) {
                this.n = -i6;
            }
        } else {
            this.J.setEmpty();
            i2 = 0;
        }
        int iU = u(t(), this.n, this.M.getInputMethodMode() == 2);
        if (this.t || this.f500k == -1) {
            return iU + i2;
        }
        int i7 = this.f501l;
        if (i7 == -2) {
            int i8 = this.f497h.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.J;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), Level.ALL_INT);
        } else if (i7 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            int i9 = this.f497h.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.J;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f499j.d(iMakeMeasureSpec, 0, -1, iU - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i2 + this.f499j.getPaddingTop() + this.f499j.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int u(View view, int i2, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.M.getMaxAvailableHeight(view, i2, z);
        }
        Method method = f495f;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.M, view, Integer.valueOf(i2), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.M.getMaxAvailableHeight(view, i2);
    }

    public boolean A() {
        return this.M.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.L;
    }

    public void D(View view) {
        this.z = view;
    }

    public void E(int i2) {
        this.M.setAnimationStyle(i2);
    }

    public void F(int i2) {
        Drawable background = this.M.getBackground();
        if (background == null) {
            Q(i2);
            return;
        }
        background.getPadding(this.J);
        Rect rect = this.J;
        this.f501l = rect.left + rect.right + i2;
    }

    public void G(int i2) {
        this.s = i2;
    }

    public void H(Rect rect) {
        this.K = rect != null ? new Rect(rect) : null;
    }

    public void I(int i2) {
        this.M.setInputMethodMode(i2);
    }

    public void J(boolean z) {
        this.L = z;
        this.M.setFocusable(z);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.M.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.B = onItemClickListener;
    }

    public void M(boolean z) {
        this.r = true;
        this.q = z;
    }

    public void O(int i2) {
        this.x = i2;
    }

    public void P(int i2) {
        f0 f0Var = this.f499j;
        if (!a() || f0Var == null) {
            return;
        }
        f0Var.setListSelectionHidden(false);
        f0Var.setSelection(i2);
        if (f0Var.getChoiceMode() != 0) {
            f0Var.setItemChecked(i2, true);
        }
    }

    public void Q(int i2) {
        this.f501l = i2;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean a() {
        return this.M.isShowing();
    }

    @Override // androidx.appcompat.view.menu.p
    public void b() {
        int iQ = q();
        boolean zA = A();
        androidx.core.widget.h.b(this.M, this.o);
        if (this.M.isShowing()) {
            if (c.h.l.t.P(t())) {
                int width = this.f501l;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i2 = this.f500k;
                if (i2 == -1) {
                    if (!zA) {
                        iQ = -1;
                    }
                    if (zA) {
                        this.M.setWidth(this.f501l == -1 ? -1 : 0);
                        this.M.setHeight(0);
                    } else {
                        this.M.setWidth(this.f501l == -1 ? -1 : 0);
                        this.M.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    iQ = i2;
                }
                this.M.setOutsideTouchable((this.u || this.t) ? false : true);
                this.M.update(t(), this.f502m, this.n, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.f501l;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i3 = this.f500k;
        if (i3 == -1) {
            iQ = -1;
        } else if (i3 != -2) {
            iQ = i3;
        }
        this.M.setWidth(width2);
        this.M.setHeight(iQ);
        N(true);
        this.M.setOutsideTouchable((this.u || this.t) ? false : true);
        this.M.setTouchInterceptor(this.E);
        if (this.r) {
            androidx.core.widget.h.a(this.M, this.q);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f496g;
            if (method != null) {
                try {
                    method.invoke(this.M, this.K);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.M.setEpicenterBounds(this.K);
        }
        androidx.core.widget.h.c(this.M, t(), this.f502m, this.n, this.s);
        this.f499j.setSelection(-1);
        if (!this.L || this.f499j.isInTouchMode()) {
            r();
        }
        if (this.L) {
            return;
        }
        this.I.post(this.G);
    }

    public void c(Drawable drawable) {
        this.M.setBackgroundDrawable(drawable);
    }

    public int d() {
        return this.f502m;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.M.dismiss();
        C();
        this.M.setContentView(null);
        this.f499j = null;
        this.I.removeCallbacks(this.D);
    }

    public void f(int i2) {
        this.f502m = i2;
    }

    public Drawable i() {
        return this.M.getBackground();
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        return this.f499j;
    }

    public void l(int i2) {
        this.n = i2;
        this.p = true;
    }

    public int o() {
        if (this.p) {
            return this.n;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.y;
        if (dataSetObserver == null) {
            this.y = new d();
        } else {
            ListAdapter listAdapter2 = this.f498i;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f498i = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.y);
        }
        f0 f0Var = this.f499j;
        if (f0Var != null) {
            f0Var.setAdapter(this.f498i);
        }
    }

    public void r() {
        f0 f0Var = this.f499j;
        if (f0Var != null) {
            f0Var.setListSelectionHidden(true);
            f0Var.requestLayout();
        }
    }

    f0 s(Context context, boolean z) {
        return new f0(context, z);
    }

    public View t() {
        return this.z;
    }

    public Object v() {
        if (a()) {
            return this.f499j.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (a()) {
            return this.f499j.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (a()) {
            return this.f499j.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (a()) {
            return this.f499j.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.f501l;
    }

    public j0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public j0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f500k = -2;
        this.f501l = -2;
        this.o = 1002;
        this.s = 0;
        this.t = false;
        this.u = false;
        this.v = Integer.MAX_VALUE;
        this.x = 0;
        this.D = new g();
        this.E = new f();
        this.F = new e();
        this.G = new c();
        this.J = new Rect();
        this.f497h = context;
        this.I = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.j.o1, i2, i3);
        this.f502m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.a.j.p1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.a.j.q1, 0);
        this.n = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.p = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i2, i3);
        this.M = qVar;
        qVar.setInputMethodMode(1);
    }
}