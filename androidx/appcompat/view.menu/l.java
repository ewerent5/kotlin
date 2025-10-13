package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import c.h.l.t;

/* compiled from: MenuPopupHelper.java */
/* loaded from: classes.dex */
public class l {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final g f277b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f278c;

    /* renamed from: d, reason: collision with root package name */
    private final int f279d;

    /* renamed from: e, reason: collision with root package name */
    private final int f280e;

    /* renamed from: f, reason: collision with root package name */
    private View f281f;

    /* renamed from: g, reason: collision with root package name */
    private int f282g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f283h;

    /* renamed from: i, reason: collision with root package name */
    private m.a f284i;

    /* renamed from: j, reason: collision with root package name */
    private k f285j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f286k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f287l;

    /* compiled from: MenuPopupHelper.java */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.e();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i2) {
        this(context, gVar, view, z, i2, 0);
    }

    private k a() {
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        k dVar = Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(c.a.d.f2461c) ? new d(this.a, this.f281f, this.f279d, this.f280e, this.f278c) : new q(this.a, this.f277b, this.f281f, this.f279d, this.f280e, this.f278c);
        dVar.l(this.f277b);
        dVar.u(this.f287l);
        dVar.p(this.f281f);
        dVar.h(this.f284i);
        dVar.r(this.f283h);
        dVar.s(this.f282g);
        return dVar;
    }

    private void l(int i2, int i3, boolean z, boolean z2) {
        k kVarC = c();
        kVarC.v(z2);
        if (z) {
            if ((c.h.l.d.b(this.f282g, t.B(this.f281f)) & 7) == 5) {
                i2 -= this.f281f.getWidth();
            }
            kVarC.t(i2);
            kVarC.w(i3);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            kVarC.q(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        kVarC.b();
    }

    public void b() {
        if (d()) {
            this.f285j.dismiss();
        }
    }

    public k c() {
        if (this.f285j == null) {
            this.f285j = a();
        }
        return this.f285j;
    }

    public boolean d() {
        k kVar = this.f285j;
        return kVar != null && kVar.a();
    }

    protected void e() {
        this.f285j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f286k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f281f = view;
    }

    public void g(boolean z) {
        this.f283h = z;
        k kVar = this.f285j;
        if (kVar != null) {
            kVar.r(z);
        }
    }

    public void h(int i2) {
        this.f282g = i2;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f286k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.f284i = aVar;
        k kVar = this.f285j;
        if (kVar != null) {
            kVar.h(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f281f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i2, int i3) {
        if (d()) {
            return true;
        }
        if (this.f281f == null) {
            return false;
        }
        l(i2, i3, true, true);
        return true;
    }

    public l(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.f282g = 8388611;
        this.f287l = new a();
        this.a = context;
        this.f277b = gVar;
        this.f281f = view;
        this.f278c = z;
        this.f279d = i2;
        this.f280e = i3;
    }
}