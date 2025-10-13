package c.h.l;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionProvider.java */
/* loaded from: classes.dex */
public abstract class b {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private a f3110b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0057b f3111c;

    /* compiled from: ActionProvider.java */
    public interface a {
    }

    /* compiled from: ActionProvider.java */
    /* renamed from: c.h.l.b$b, reason: collision with other inner class name */
    public interface InterfaceC0057b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public b(Context context) {
        this.a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f3111c = null;
        this.f3110b = null;
    }

    public void i(a aVar) {
        this.f3110b = aVar;
    }

    public void j(InterfaceC0057b interfaceC0057b) {
        if (this.f3111c != null && interfaceC0057b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f3111c = interfaceC0057b;
    }
}