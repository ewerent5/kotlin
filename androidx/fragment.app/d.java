package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.a;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import okhttp3.internal.http2.Settings;

/* compiled from: FragmentActivity.java */
/* loaded from: classes.dex */
public class d extends ComponentActivity implements a.b, a.d {

    /* renamed from: l, reason: collision with root package name */
    final h f1008l;

    /* renamed from: m, reason: collision with root package name */
    final androidx.lifecycle.l f1009m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    int t;
    c.e.h<String> u;

    /* compiled from: FragmentActivity.java */
    class a extends j<d> implements b0, androidx.activity.c {
        public a() {
            super(d.this);
        }

        @Override // androidx.lifecycle.b0
        public a0 D() {
            return d.this.D();
        }

        @Override // androidx.fragment.app.j, androidx.fragment.app.f
        public View b(int i2) {
            return d.this.findViewById(i2);
        }

        @Override // androidx.fragment.app.j, androidx.fragment.app.f
        public boolean c() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.j
        public void g(Fragment fragment) {
            d.this.B(fragment);
        }

        @Override // androidx.lifecycle.k
        public androidx.lifecycle.g i() {
            return d.this.f1009m;
        }

        @Override // androidx.fragment.app.j
        public LayoutInflater j() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher k() {
            return d.this.k();
        }

        @Override // androidx.fragment.app.j
        public void l(Fragment fragment, String[] strArr, int i2) {
            d.this.F(fragment, strArr, i2);
        }

        @Override // androidx.fragment.app.j
        public boolean m(Fragment fragment) {
            return !d.this.isFinishing();
        }

        @Override // androidx.fragment.app.j
        public boolean n(String str) {
            return androidx.core.app.a.o(d.this, str);
        }

        @Override // androidx.fragment.app.j
        public void o(Fragment fragment, Intent intent, int i2, Bundle bundle) {
            d.this.G(fragment, intent, i2, bundle);
        }

        @Override // androidx.fragment.app.j
        public void p() {
            d.this.H();
        }

        @Override // androidx.fragment.app.j
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public d h() {
            return d.this;
        }
    }

    public d() {
        this.f1008l = h.b(new a());
        this.f1009m = new androidx.lifecycle.l(this);
        this.p = true;
    }

    private static boolean A(m mVar, g.c cVar) {
        boolean zA = false;
        for (Fragment fragment : mVar.f0()) {
            if (fragment != null) {
                if (fragment.w0() != null) {
                    zA |= A(fragment.p0(), cVar);
                }
                if (fragment.i().b().a(g.c.STARTED)) {
                    fragment.W.o(cVar);
                    zA = true;
                }
            }
        }
        return zA;
    }

    private int v(Fragment fragment) {
        if (this.u.n() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.u.h(this.t) >= 0) {
            this.t = (this.t + 1) % 65534;
        }
        int i2 = this.t;
        this.u.k(i2, fragment.f977j);
        this.t = (this.t + 1) % 65534;
        return i2;
    }

    static void w(int i2) {
        if ((i2 & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void z() {
        while (A(y(), g.c.CREATED)) {
        }
    }

    public void B(Fragment fragment) {
    }

    @Deprecated
    protected boolean C(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void E() {
        this.f1009m.h(g.b.ON_RESUME);
        this.f1008l.p();
    }

    void F(Fragment fragment, String[] strArr, int i2) {
        if (i2 == -1) {
            androidx.core.app.a.m(this, strArr, i2);
            return;
        }
        w(i2);
        try {
            this.q = true;
            androidx.core.app.a.m(this, strArr, ((v(fragment) + 1) << 16) + (i2 & Settings.DEFAULT_INITIAL_WINDOW_SIZE));
        } finally {
            this.q = false;
        }
    }

    public void G(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        this.s = true;
        try {
            if (i2 == -1) {
                androidx.core.app.a.p(this, intent, -1, bundle);
            } else {
                w(i2);
                androidx.core.app.a.p(this, intent, ((v(fragment) + 1) << 16) + (i2 & Settings.DEFAULT_INITIAL_WINDOW_SIZE), bundle);
            }
        } finally {
            this.s = false;
        }
    }

    @Deprecated
    public void H() {
        invalidateOptionsMenu();
    }

    @Override // androidx.core.app.a.d
    public final void b(int i2) {
        if (this.q || i2 == -1) {
            return;
        }
        w(i2);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.n);
        printWriter.print(" mResumed=");
        printWriter.print(this.o);
        printWriter.print(" mStopped=");
        printWriter.print(this.p);
        if (getApplication() != null) {
            c.o.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f1008l.u().M(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        this.f1008l.v();
        int i4 = i2 >> 16;
        if (i4 == 0) {
            a.c cVarK = androidx.core.app.a.k();
            if (cVarK == null || !cVarK.a(this, i2, i3, intent)) {
                super.onActivityResult(i2, i3, intent);
                return;
            }
            return;
        }
        int i5 = i4 - 1;
        String strF = this.u.f(i5);
        this.u.l(i5);
        if (strF == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment fragmentT = this.f1008l.t(strF);
        if (fragmentT != null) {
            fragmentT.g1(i2 & Settings.DEFAULT_INITIAL_WINDOW_SIZE, i3, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strF);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1008l.v();
        this.f1008l.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f1008l.a(null);
        if (bundle != null) {
            this.f1008l.x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.t = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.u = new c.e.h<>(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.u.k(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.u == null) {
            this.u = new c.e.h<>();
            this.t = 0;
        }
        super.onCreate(bundle);
        this.f1009m.h(g.b.ON_CREATE);
        this.f1008l.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return i2 == 0 ? super.onCreatePanelMenu(i2, menu) | this.f1008l.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i2, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewX = x(view, str, context, attributeSet);
        return viewX == null ? super.onCreateView(view, str, context, attributeSet) : viewX;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f1008l.h();
        this.f1009m.h(g.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f1008l.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.f1008l.k(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.f1008l.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f1008l.j(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f1008l.v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f1008l.l(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.o = false;
        this.f1008l.m();
        this.f1009m.h(g.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f1008l.n(z);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        E();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return i2 == 0 ? C(view, menu) | this.f1008l.o(menu) : super.onPreparePanel(i2, view, menu);
    }

    @Override // android.app.Activity, androidx.core.app.a.b
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f1008l.v();
        int i3 = (i2 >> 16) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String strF = this.u.f(i4);
            this.u.l(i4);
            if (strF == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment fragmentT = this.f1008l.t(strF);
            if (fragmentT != null) {
                fragmentT.F1(i2 & Settings.DEFAULT_INITIAL_WINDOW_SIZE, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strF);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.o = true;
        this.f1008l.v();
        this.f1008l.s();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        z();
        this.f1009m.h(g.b.ON_STOP);
        Parcelable parcelableY = this.f1008l.y();
        if (parcelableY != null) {
            bundle.putParcelable("android:support:fragments", parcelableY);
        }
        if (this.u.n() > 0) {
            bundle.putInt("android:support:next_request_index", this.t);
            int[] iArr = new int[this.u.n()];
            String[] strArr = new String[this.u.n()];
            for (int i2 = 0; i2 < this.u.n(); i2++) {
                iArr[i2] = this.u.j(i2);
                strArr[i2] = this.u.o(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.p = false;
        if (!this.n) {
            this.n = true;
            this.f1008l.c();
        }
        this.f1008l.v();
        this.f1008l.s();
        this.f1009m.h(g.b.ON_START);
        this.f1008l.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f1008l.v();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.p = true;
        z();
        this.f1008l.r();
        this.f1009m.h(g.b.ON_STOP);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        if (!this.s && i2 != -1) {
            w(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        if (!this.r && i2 != -1) {
            w(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    final View x(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1008l.w(view, str, context, attributeSet);
    }

    public m y() {
        return this.f1008l.u();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewX = x(null, str, context, attributeSet);
        return viewX == null ? super.onCreateView(str, context, attributeSet) : viewX;
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (!this.s && i2 != -1) {
            w(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.r && i2 != -1) {
            w(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public d(int i2) {
        super(i2);
        this.f1008l = h.b(new a());
        this.f1009m = new androidx.lifecycle.l(this);
        this.p = true;
    }
}