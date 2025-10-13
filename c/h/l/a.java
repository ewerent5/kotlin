package c.h.l;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import c.h.l.c0.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityDelegateCompat.java */
/* loaded from: classes.dex */
public class a {
    private static final View.AccessibilityDelegate a = new View.AccessibilityDelegate();

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f3108b;

    /* renamed from: c, reason: collision with root package name */
    private final View.AccessibilityDelegate f3109c;

    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: c.h.l.a$a, reason: collision with other inner class name */
    static final class C0056a extends View.AccessibilityDelegate {
        final a a;

        C0056a(a aVar) {
            this.a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            c.h.l.c0.d dVarB = this.a.b(view);
            if (dVarB != null) {
                return (AccessibilityNodeProvider) dVarB.d();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            c.h.l.c0.c cVarY0 = c.h.l.c0.c.y0(accessibilityNodeInfo);
            cVarY0.q0(t.T(view));
            cVarY0.i0(t.O(view));
            cVarY0.m0(t.p(view));
            this.a.g(view, cVarY0);
            cVarY0.e(accessibilityNodeInfo.getText(), view);
            List<c.a> listC = a.c(view);
            for (int i2 = 0; i2 < listC.size(); i2++) {
                cVarY0.b(listC.get(i2));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.a.j(view, i2, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i2) {
            this.a.l(view, i2);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(a);
    }

    static List<c.a> c(View view) {
        List<c.a> list = (List) view.getTag(c.h.b.H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrP = c.h.l.c0.c.p(view.createAccessibilityNodeInfo().getText());
            for (int i2 = 0; clickableSpanArrP != null && i2 < clickableSpanArrP.length; i2++) {
                if (clickableSpan.equals(clickableSpanArrP[i2])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i2, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(c.h.b.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i2)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3108b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public c.h.l.c0.d b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f3108b.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new c.h.l.c0.d(accessibilityNodeProvider);
    }

    View.AccessibilityDelegate d() {
        return this.f3109c;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f3108b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, c.h.l.c0.c cVar) {
        this.f3108b.onInitializeAccessibilityNodeInfo(view, cVar.x0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f3108b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3108b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i2, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        List<c.a> listC = c(view);
        boolean zPerformAccessibilityAction = false;
        int i3 = 0;
        while (true) {
            if (i3 >= listC.size()) {
                break;
            }
            c.a aVar = listC.get(i3);
            if (aVar.b() == i2) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
            i3++;
        }
        if (!zPerformAccessibilityAction && Build.VERSION.SDK_INT >= 16) {
            zPerformAccessibilityAction = this.f3108b.performAccessibilityAction(view, i2, bundle);
        }
        return (zPerformAccessibilityAction || i2 != c.h.b.a) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i2) {
        this.f3108b.sendAccessibilityEvent(view, i2);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f3108b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3108b = accessibilityDelegate;
        this.f3109c = new C0056a(this);
    }
}