package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.g;
import androidx.lifecycle.u;
import c.h.l.e;

/* compiled from: ComponentActivity.java */
/* loaded from: classes.dex */
public class f extends Activity implements androidx.lifecycle.k, e.a {

    /* renamed from: e, reason: collision with root package name */
    private c.e.g<Class<?>, ?> f841e = new c.e.g<>();

    /* renamed from: f, reason: collision with root package name */
    private androidx.lifecycle.l f842f = new androidx.lifecycle.l(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !c.h.l.e.d(decorView, keyEvent)) {
            return c.h.l.e.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !c.h.l.e.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u.g(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f842f.j(g.c.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // c.h.l.e.a
    public boolean r(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}