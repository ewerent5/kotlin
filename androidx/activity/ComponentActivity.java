package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.f;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.u;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes.dex */
public class ComponentActivity extends f implements k, b0, androidx.savedstate.b, c {

    /* renamed from: g */
    private final l f0g;

    /* renamed from: h */
    private final androidx.savedstate.a f1h;

    /* renamed from: i */
    private a0 f2i;

    /* renamed from: j */
    private final OnBackPressedDispatcher f3j;

    /* renamed from: k */
    private int f4k;

    /* renamed from: androidx.activity.ComponentActivity$2 */
    class AnonymousClass2 implements i {
        AnonymousClass2() {
        }

        @Override // androidx.lifecycle.i
        public void c(k kVar, g.b bVar) {
            if (bVar == g.b.ON_STOP) {
                Window window = ComponentActivity.this.getWindow();
                View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                if (viewPeekDecorView != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$3 */
    class AnonymousClass3 implements i {
        AnonymousClass3() {
        }

        @Override // androidx.lifecycle.i
        public void c(k kVar, g.b bVar) {
            if (bVar != g.b.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                return;
            }
            ComponentActivity.this.D().a();
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    static final class b {
        Object a;

        /* renamed from: b */
        a0 f8b;

        b() {
        }
    }

    public ComponentActivity() {
        this.f0g = new l(this);
        this.f1h = androidx.savedstate.a.a(this);
        this.f3j = new OnBackPressedDispatcher(new a());
        if (i() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            i().a(new i() { // from class: androidx.activity.ComponentActivity.2
                AnonymousClass2() {
                }

                @Override // androidx.lifecycle.i
                public void c(k kVar, g.b bVar) {
                    if (bVar == g.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                        if (viewPeekDecorView != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        i().a(new i() { // from class: androidx.activity.ComponentActivity.3
            AnonymousClass3() {
            }

            @Override // androidx.lifecycle.i
            public void c(k kVar, g.b bVar) {
                if (bVar != g.b.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.D().a();
            }
        });
        if (19 > i2 || i2 > 23) {
            return;
        }
        i().a(new ImmLeaksCleaner(this));
    }

    @Override // androidx.lifecycle.b0
    public a0 D() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f2i == null) {
            b bVar = (b) getLastNonConfigurationInstance();
            if (bVar != null) {
                this.f2i = bVar.f8b;
            }
            if (this.f2i == null) {
                this.f2i = new a0();
            }
        }
        return this.f2i;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry I() {
        return this.f1h.b();
    }

    @Override // androidx.lifecycle.k
    public g i() {
        return this.f0g;
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher k() {
        return this.f3j;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f3j.c();
    }

    @Override // androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1h.c(bundle);
        u.g(this);
        int i2 = this.f4k;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object objU = u();
        a0 a0Var = this.f2i;
        if (a0Var == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            a0Var = bVar.f8b;
        }
        if (a0Var == null && objU == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.a = objU;
        bVar2.f8b = a0Var;
        return bVar2;
    }

    @Override // androidx.core.app.f, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        g gVarI = i();
        if (gVarI instanceof l) {
            ((l) gVarI).o(g.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f1h.d(bundle);
    }

    @Deprecated
    public Object u() {
        return null;
    }

    public ComponentActivity(int i2) {
        this();
        this.f4k = i2;
    }
}