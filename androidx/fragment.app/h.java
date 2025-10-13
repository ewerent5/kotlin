package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.b0;

/* compiled from: FragmentController.java */
/* loaded from: classes.dex */
public class h {
    private final j<?> a;

    private h(j<?> jVar) {
        this.a = jVar;
    }

    public static h b(j<?> jVar) {
        return new h((j) c.h.k.h.d(jVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        j<?> jVar = this.a;
        jVar.f1032i.g(jVar, jVar, fragment);
    }

    public void c() {
        this.a.f1032i.r();
    }

    public void d(Configuration configuration) {
        this.a.f1032i.s(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.a.f1032i.t(menuItem);
    }

    public void f() {
        this.a.f1032i.u();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.a.f1032i.v(menu, menuInflater);
    }

    public void h() {
        this.a.f1032i.w();
    }

    public void i() {
        this.a.f1032i.y();
    }

    public void j(boolean z) {
        this.a.f1032i.z(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.a.f1032i.A(menuItem);
    }

    public void l(Menu menu) {
        this.a.f1032i.B(menu);
    }

    public void m() {
        this.a.f1032i.D();
    }

    public void n(boolean z) {
        this.a.f1032i.E(z);
    }

    public boolean o(Menu menu) {
        return this.a.f1032i.F(menu);
    }

    public void p() {
        this.a.f1032i.H();
    }

    public void q() {
        this.a.f1032i.I();
    }

    public void r() {
        this.a.f1032i.K();
    }

    public boolean s() {
        return this.a.f1032i.Q(true);
    }

    public Fragment t(String str) {
        return this.a.f1032i.Y(str);
    }

    public m u() {
        return this.a.f1032i;
    }

    public void v() {
        this.a.f1032i.B0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.f1032i.g0().onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        j<?> jVar = this.a;
        if (!(jVar instanceof b0)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        jVar.f1032i.O0(parcelable);
    }

    public Parcelable y() {
        return this.a.f1032i.Q0();
    }
}