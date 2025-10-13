package c.h.l.c0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import c.h.l.c0.f;
import com.google.android.gms.ads.AdRequest;
import j$.util.Spliterator;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* loaded from: classes.dex */
public class c {
    private static int a;

    /* renamed from: b, reason: collision with root package name */
    private final AccessibilityNodeInfo f3128b;

    /* renamed from: c, reason: collision with root package name */
    public int f3129c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f3130d = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a a = new a(1, null);

        /* renamed from: b, reason: collision with root package name */
        public static final a f3131b = new a(2, null);

        /* renamed from: c, reason: collision with root package name */
        public static final a f3132c = new a(4, null);

        /* renamed from: d, reason: collision with root package name */
        public static final a f3133d = new a(8, null);

        /* renamed from: e, reason: collision with root package name */
        public static final a f3134e = new a(16, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f3135f = new a(32, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f3136g = new a(64, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f3137h = new a(128, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f3138i = new a(256, (CharSequence) null, (Class<? extends f.a>) f.b.class);

        /* renamed from: j, reason: collision with root package name */
        public static final a f3139j = new a(AdRequest.MAX_CONTENT_URL_LENGTH, (CharSequence) null, (Class<? extends f.a>) f.b.class);

        /* renamed from: k, reason: collision with root package name */
        public static final a f3140k = new a(Spliterator.IMMUTABLE, (CharSequence) null, (Class<? extends f.a>) f.c.class);

        /* renamed from: l, reason: collision with root package name */
        public static final a f3141l = new a(2048, (CharSequence) null, (Class<? extends f.a>) f.c.class);

        /* renamed from: m, reason: collision with root package name */
        public static final a f3142m = new a(Spliterator.CONCURRENT, null);
        public static final a n = new a(8192, null);
        public static final a o = new a(16384, null);
        public static final a p = new a(32768, null);
        public static final a q = new a(65536, null);
        public static final a r = new a(131072, (CharSequence) null, (Class<? extends f.a>) f.g.class);
        public static final a s = new a(262144, null);
        public static final a t = new a(524288, null);
        public static final a u = new a(1048576, null);
        public static final a v = new a(2097152, (CharSequence) null, (Class<? extends f.a>) f.h.class);
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;
        final Object L;
        private final int M;
        private final Class<? extends f.a> N;
        protected final f O;

        static {
            int i2 = Build.VERSION.SDK_INT;
            w = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            x = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, f.e.class);
            y = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            z = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            A = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            B = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            C = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            D = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            E = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            F = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            G = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            H = new a(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, f.C0059f.class);
            I = new a(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, f.d.class);
            J = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            K = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a(null, this.M, charSequence, fVar, this.N);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.L).getId();
            }
            return 0;
        }

        public CharSequence c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.L).getLabel();
            }
            return null;
        }

        public boolean d(View view, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            if (this.O == null) {
                return false;
            }
            f.a aVar = null;
            Class<? extends f.a> cls = this.N;
            if (cls != null) {
                try {
                    f.a aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        aVarNewInstance.a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e2) {
                        e = e2;
                        aVar = aVarNewInstance;
                        Class<? extends f.a> cls2 = this.N;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                        return this.O.a(view, aVar);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            return this.O.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.L;
            return obj2 == null ? aVar.L == null : obj2.equals(aVar.L);
        }

        public int hashCode() {
            Object obj = this.L;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i2, CharSequence charSequence, f fVar) {
            this(null, i2, charSequence, fVar, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends f.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        a(Object obj, int i2, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.M = i2;
            this.O = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                this.L = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.L = obj;
            }
            this.N = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class b {
        final Object a;

        b(Object obj) {
            this.a = obj;
        }

        public static b a(int i2, int i3, boolean z, int i4) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z, i4)) : i5 >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z)) : new b(null);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: c.h.l.c0.c$c, reason: collision with other inner class name */
    public static class C0058c {
        final Object a;

        C0058c(Object obj) {
            this.a = obj;
        }

        public static C0058c f(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
            int i6 = Build.VERSION.SDK_INT;
            return i6 >= 21 ? new C0058c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z, z2)) : i6 >= 19 ? new C0058c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z)) : new C0058c(null);
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getColumnIndex();
            }
            return 0;
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getColumnSpan();
            }
            return 0;
        }

        public int c() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getRowIndex();
            }
            return 0;
        }

        public int d() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getRowSpan();
            }
            return 0;
        }

        public boolean e() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).isSelected();
            }
            return false;
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3128b = accessibilityNodeInfo;
    }

    public static c L() {
        return y0(AccessibilityNodeInfo.obtain());
    }

    public static c M(View view) {
        return y0(AccessibilityNodeInfo.obtain(view));
    }

    public static c N(c cVar) {
        return y0(AccessibilityNodeInfo.obtain(cVar.f3128b));
    }

    private void R(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayV = v(view);
        if (sparseArrayV != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < sparseArrayV.size(); i2++) {
                if (sparseArrayV.valueAt(i2).get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                sparseArrayV.remove(((Integer) arrayList.get(i3)).intValue());
            }
        }
    }

    private void T(int i2, boolean z) {
        Bundle bundleS = s();
        if (bundleS != null) {
            int i3 = bundleS.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i2);
            if (!z) {
                i2 = 0;
            }
            bundleS.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    private void d(ClickableSpan clickableSpan, Spanned spanned, int i2) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
    }

    private void f() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3128b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f3128b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f3128b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f3128b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private List<Integer> g(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f3128b.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f3128b.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String i(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case Spliterator.IMMUTABLE /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case Spliterator.CONCURRENT /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i2) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    private boolean k(int i2) {
        Bundle bundleS = s();
        return bundleS != null && (bundleS.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i2) == i2;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> t(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayV = v(view);
        if (sparseArrayV != null) {
            return sparseArrayV;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(c.h.b.I, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> v(View view) {
        return (SparseArray) view.getTag(c.h.b.I);
    }

    private boolean y() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public static c y0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    private int z(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals(sparseArray.valueAt(i2).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = a;
        a = i3 + 1;
        return i3;
    }

    public boolean A() {
        return this.f3128b.isCheckable();
    }

    public boolean B() {
        return this.f3128b.isChecked();
    }

    public boolean C() {
        return this.f3128b.isClickable();
    }

    public boolean D() {
        return this.f3128b.isEnabled();
    }

    public boolean E() {
        return this.f3128b.isFocusable();
    }

    public boolean F() {
        return this.f3128b.isFocused();
    }

    public boolean G() {
        return this.f3128b.isLongClickable();
    }

    public boolean H() {
        return this.f3128b.isPassword();
    }

    public boolean I() {
        return this.f3128b.isScrollable();
    }

    public boolean J() {
        return this.f3128b.isSelected();
    }

    public boolean K() {
        return Build.VERSION.SDK_INT >= 26 ? this.f3128b.isShowingHintText() : k(4);
    }

    public boolean O(int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f3128b.performAction(i2, bundle);
        }
        return false;
    }

    public void P() {
        this.f3128b.recycle();
    }

    public boolean Q(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f3128b.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.L);
        }
        return false;
    }

    public void S(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3128b.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    public void U(Rect rect) {
        this.f3128b.setBoundsInParent(rect);
    }

    public void V(Rect rect) {
        this.f3128b.setBoundsInScreen(rect);
    }

    public void W(boolean z) {
        this.f3128b.setCheckable(z);
    }

    public void X(boolean z) {
        this.f3128b.setChecked(z);
    }

    public void Y(CharSequence charSequence) {
        this.f3128b.setClassName(charSequence);
    }

    public void Z(boolean z) {
        this.f3128b.setClickable(z);
    }

    public void a(int i2) {
        this.f3128b.addAction(i2);
    }

    public void a0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3128b.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).a);
        }
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3128b.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.L);
        }
    }

    public void b0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3128b.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0058c) obj).a);
        }
    }

    public void c(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3128b.addChild(view, i2);
        }
    }

    public void c0(CharSequence charSequence) {
        this.f3128b.setContentDescription(charSequence);
    }

    public void d0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3128b.setDismissable(z);
        }
    }

    public void e(CharSequence charSequence, View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19 || i2 >= 26) {
            return;
        }
        f();
        R(view);
        ClickableSpan[] clickableSpanArrP = p(charSequence);
        if (clickableSpanArrP == null || clickableSpanArrP.length <= 0) {
            return;
        }
        s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", c.h.b.a);
        SparseArray<WeakReference<ClickableSpan>> sparseArrayT = t(view);
        for (int i3 = 0; i3 < clickableSpanArrP.length; i3++) {
            int iZ = z(clickableSpanArrP[i3], sparseArrayT);
            sparseArrayT.put(iZ, new WeakReference<>(clickableSpanArrP[i3]));
            d(clickableSpanArrP[i3], (Spanned) charSequence, iZ);
        }
    }

    public void e0(boolean z) {
        this.f3128b.setEnabled(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3128b;
        if (accessibilityNodeInfo == null) {
            if (cVar.f3128b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f3128b)) {
            return false;
        }
        return this.f3130d == cVar.f3130d && this.f3129c == cVar.f3129c;
    }

    public void f0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3128b.setError(charSequence);
        }
    }

    public void g0(boolean z) {
        this.f3128b.setFocusable(z);
    }

    public List<a> h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f3128b.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new a(actionList.get(i2)));
        }
        return arrayList;
    }

    public void h0(boolean z) {
        this.f3128b.setFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3128b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3128b.setHeading(z);
        } else {
            T(2, z);
        }
    }

    public int j() {
        return this.f3128b.getActions();
    }

    public void j0(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f3128b.setHintText(charSequence);
        } else if (i2 >= 19) {
            this.f3128b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void k0(int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3128b.setMaxTextLength(i2);
        }
    }

    @Deprecated
    public void l(Rect rect) {
        this.f3128b.getBoundsInParent(rect);
    }

    public void l0(CharSequence charSequence) {
        this.f3128b.setPackageName(charSequence);
    }

    public void m(Rect rect) {
        this.f3128b.getBoundsInScreen(rect);
    }

    public void m0(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.f3128b.setPaneTitle(charSequence);
        } else if (i2 >= 19) {
            this.f3128b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public int n() {
        return this.f3128b.getChildCount();
    }

    public void n0(View view) {
        this.f3129c = -1;
        this.f3128b.setParent(view);
    }

    public CharSequence o() {
        return this.f3128b.getClassName();
    }

    public void o0(View view, int i2) {
        this.f3129c = i2;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3128b.setParent(view, i2);
        }
    }

    public void p0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3128b.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    public C0058c q() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT < 19 || (collectionItemInfo = this.f3128b.getCollectionItemInfo()) == null) {
            return null;
        }
        return new C0058c(collectionItemInfo);
    }

    public void q0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3128b.setScreenReaderFocusable(z);
        } else {
            T(1, z);
        }
    }

    public CharSequence r() {
        return this.f3128b.getContentDescription();
    }

    public void r0(boolean z) {
        this.f3128b.setScrollable(z);
    }

    public Bundle s() {
        return Build.VERSION.SDK_INT >= 19 ? this.f3128b.getExtras() : new Bundle();
    }

    public void s0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3128b.setShowingHintText(z);
        } else {
            T(4, z);
        }
    }

    public void t0(View view, int i2) {
        this.f3130d = i2;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3128b.setSource(view, i2);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb.append("; boundsInParent: " + rect);
        m(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(u());
        sb.append("; className: ");
        sb.append(o());
        sb.append("; text: ");
        sb.append(w());
        sb.append("; contentDescription: ");
        sb.append(r());
        sb.append("; viewId: ");
        sb.append(x());
        sb.append("; checkable: ");
        sb.append(A());
        sb.append("; checked: ");
        sb.append(B());
        sb.append("; focusable: ");
        sb.append(E());
        sb.append("; focused: ");
        sb.append(F());
        sb.append("; selected: ");
        sb.append(J());
        sb.append("; clickable: ");
        sb.append(C());
        sb.append("; longClickable: ");
        sb.append(G());
        sb.append("; enabled: ");
        sb.append(D());
        sb.append("; password: ");
        sb.append(H());
        sb.append("; scrollable: " + I());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> listH = h();
            for (int i2 = 0; i2 < listH.size(); i2++) {
                a aVar = listH.get(i2);
                String strI = i(aVar.b());
                if (strI.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                    strI = aVar.c().toString();
                }
                sb.append(strI);
                if (i2 != listH.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int iJ = j();
            while (iJ != 0) {
                int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(iJ);
                iJ &= ~iNumberOfTrailingZeros;
                sb.append(i(iNumberOfTrailingZeros));
                if (iJ != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence u() {
        return this.f3128b.getPackageName();
    }

    public void u0(CharSequence charSequence) {
        this.f3128b.setText(charSequence);
    }

    public void v0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f3128b.setTraversalAfter(view);
        }
    }

    public CharSequence w() {
        if (!y()) {
            return this.f3128b.getText();
        }
        List<Integer> listG = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listG2 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listG3 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listG4 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3128b.getText(), 0, this.f3128b.getText().length()));
        for (int i2 = 0; i2 < listG.size(); i2++) {
            spannableString.setSpan(new c.h.l.c0.a(listG4.get(i2).intValue(), this, s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listG.get(i2).intValue(), listG2.get(i2).intValue(), listG3.get(i2).intValue());
        }
        return spannableString;
    }

    public void w0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3128b.setVisibleToUser(z);
        }
    }

    public String x() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f3128b.getViewIdResourceName();
        }
        return null;
    }

    public AccessibilityNodeInfo x0() {
        return this.f3128b;
    }
}