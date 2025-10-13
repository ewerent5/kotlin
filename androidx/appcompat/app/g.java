package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import c.a.o.b;
import c.h.l.e;

/* compiled from: AppCompatDialog.java */
/* loaded from: classes.dex */
public class g extends Dialog implements d {

    /* renamed from: e, reason: collision with root package name */
    private e f106e;

    /* renamed from: f, reason: collision with root package name */
    private final e.a f107f;

    /* compiled from: AppCompatDialog.java */
    class a implements e.a {
        a() {
        }

        @Override // c.h.l.e.a
        public boolean r(KeyEvent keyEvent) {
            return g.this.c(keyEvent);
        }
    }

    public g(Context context, int i2) {
        super(context, b(context, i2));
        this.f107f = new a();
        e eVarA = a();
        eVarA.H(b(context, i2));
        eVarA.s(null);
    }

    private static int b(Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(c.a.a.y, typedValue, true);
        return typedValue.resourceId;
    }

    public e a() {
        if (this.f106e == null) {
            this.f106e = e.j(this, this);
        }
        return this.f106e;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i2) {
        return a().B(i2);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().t();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c.h.l.e.e(this.f107f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // androidx.appcompat.app.d
    public void f(c.a.o.b bVar) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i2) {
        return (T) a().k(i2);
    }

    @Override // androidx.appcompat.app.d
    public void g(c.a.o.b bVar) {
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().q();
    }

    @Override // androidx.appcompat.app.d
    public c.a.o.b o(b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        a().p();
        super.onCreate(bundle);
        a().s(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().y();
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        a().C(i2);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().I(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().D(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().E(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        a().I(getContext().getString(i2));
    }
}