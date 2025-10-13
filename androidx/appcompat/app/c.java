package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import androidx.core.app.o;
import c.a.o.b;

/* compiled from: AppCompatActivity.java */
/* loaded from: classes.dex */
public class c extends androidx.fragment.app.d implements d, o.a {
    private e v;
    private Resources w;

    public c() {
    }

    private boolean Q(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.fragment.app.d
    public void H() {
        J().q();
    }

    public e J() {
        if (this.v == null) {
            this.v = e.i(this, this);
        }
        return this.v;
    }

    public a K() {
        return J().o();
    }

    public void L(o oVar) {
        oVar.e(this);
    }

    protected void M(int i2) {
    }

    public void N(o oVar) {
    }

    @Deprecated
    public void O() {
    }

    public boolean P() {
        Intent intentM = m();
        if (intentM == null) {
            return false;
        }
        if (!T(intentM)) {
            S(intentM);
            return true;
        }
        o oVarH = o.h(this);
        L(oVarH);
        N(oVarH);
        oVarH.k();
        try {
            androidx.core.app.a.j(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void R(Toolbar toolbar) {
        J().G(toolbar);
    }

    public void S(Intent intent) {
        androidx.core.app.g.e(this, intent);
    }

    public boolean T(Intent intent) {
        return androidx.core.app.g.f(this, intent);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(J().h(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a aVarK = K();
        if (getWindow().hasFeature(0)) {
            if (aVarK == null || !aVarK.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a aVarK = K();
        if (keyCode == 82 && aVarK != null && aVarK.o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.app.d
    public void f(c.a.o.b bVar) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        return (T) J().k(i2);
    }

    @Override // androidx.appcompat.app.d
    public void g(c.a.o.b bVar) {
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return J().n();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.w == null && b1.b()) {
            this.w = new b1(this, super.getResources());
        }
        Resources resources = this.w;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        J().q();
    }

    @Override // androidx.core.app.o.a
    public Intent m() {
        return androidx.core.app.g.a(this);
    }

    @Override // androidx.appcompat.app.d
    public c.a.o.b o(b.a aVar) {
        return null;
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.w != null) {
            this.w.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        J().r(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        O();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        e eVarJ = J();
        eVarJ.p();
        eVarJ.s(bundle);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        J().t();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (Q(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a aVarK = K();
        if (menuItem.getItemId() != 16908332 || aVarK == null || (aVarK.i() & 4) == 0) {
            return false;
        }
        return P();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // androidx.fragment.app.d, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        J().u(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        J().v();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        J().w(bundle);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onStart() {
        super.onStart();
        J().x();
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected void onStop() {
        super.onStop();
        J().y();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        J().I(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a aVarK = K();
        if (getWindow().hasFeature(0)) {
            if (aVarK == null || !aVarK.p()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        J().C(i2);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        super.setTheme(i2);
        J().H(i2);
    }

    public c(int i2) {
        super(i2);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        J().D(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        J().E(view, layoutParams);
    }
}