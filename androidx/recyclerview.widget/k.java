package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;

/* compiled from: LayoutState.java */
/* loaded from: classes.dex */
class k {

    /* renamed from: b, reason: collision with root package name */
    int f1751b;

    /* renamed from: c, reason: collision with root package name */
    int f1752c;

    /* renamed from: d, reason: collision with root package name */
    int f1753d;

    /* renamed from: e, reason: collision with root package name */
    int f1754e;

    /* renamed from: h, reason: collision with root package name */
    boolean f1757h;

    /* renamed from: i, reason: collision with root package name */
    boolean f1758i;
    boolean a = true;

    /* renamed from: f, reason: collision with root package name */
    int f1755f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f1756g = 0;

    k() {
    }

    boolean a(RecyclerView.a0 a0Var) {
        int i2 = this.f1752c;
        return i2 >= 0 && i2 < a0Var.b();
    }

    View b(RecyclerView.v vVar) {
        View viewO = vVar.o(this.f1752c);
        this.f1752c += this.f1753d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f1751b + ", mCurrentPosition=" + this.f1752c + ", mItemDirection=" + this.f1753d + ", mLayoutDirection=" + this.f1754e + ", mStartLine=" + this.f1755f + ", mEndLine=" + this.f1756g + CoreConstants.CURLY_RIGHT;
    }
}