package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.w0;
import androidx.core.content.c.f;
import androidx.lifecycle.g;
import c.a.o.b;
import c.a.o.f;
import c.h.l.b0;
import c.h.l.e;
import c.h.l.x;
import c.h.l.z;
import com.google.android.gms.ads.AdRequest;
import j$.util.Spliterator;
import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
class f extends androidx.appcompat.app.e implements g.a, LayoutInflater.Factory2 {

    /* renamed from: h */
    private static final c.e.g<String, Integer> f76h = new c.e.g<>();

    /* renamed from: i */
    private static final boolean f77i;

    /* renamed from: j */
    private static final int[] f78j;

    /* renamed from: k */
    private static final boolean f79k;

    /* renamed from: l */
    private static final boolean f80l;

    /* renamed from: m */
    private static boolean f81m;
    PopupWindow A;
    Runnable B;
    x C;
    private boolean D;
    private boolean E;
    ViewGroup F;
    private TextView G;
    private View H;
    private boolean I;
    private boolean J;
    boolean K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    private boolean P;
    private s[] Q;
    private s R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    boolean W;
    private int X;
    private int Y;
    private boolean Z;
    private boolean a0;
    private l b0;
    private l c0;
    boolean d0;
    int e0;
    private final Runnable f0;
    private boolean g0;
    private Rect h0;
    private Rect i0;
    private androidx.appcompat.app.h j0;
    final Object n;
    final Context o;
    Window p;
    private j q;
    final androidx.appcompat.app.d r;
    androidx.appcompat.app.a s;
    MenuInflater t;
    private CharSequence u;
    private c0 v;
    private h w;
    private t x;
    c.a.o.b y;
    ActionBarContextView z;

    /* compiled from: AppCompatDelegateImpl.java */
    class a implements Thread.UncaughtExceptionHandler {
        final /* synthetic */ Thread.UncaughtExceptionHandler a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!a(th)) {
                this.a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.a.uncaughtException(thread, notFoundException);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            if ((fVar.e0 & 1) != 0) {
                fVar.X(0);
            }
            f fVar2 = f.this;
            if ((fVar2.e0 & Spliterator.CONCURRENT) != 0) {
                fVar2.X(108);
            }
            f fVar3 = f.this;
            fVar3.d0 = false;
            fVar3.e0 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class c implements c.h.l.p {
        c() {
        }

        @Override // c.h.l.p
        public b0 a(View view, b0 b0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int iH = b0Var.h();
            int iO0 = f.this.O0(b0Var, null);
            if (iH != iO0) {
                b0Var = b0Var.m(b0Var.f(), iO0, b0Var.g(), b0Var.e());
            }
            return c.h.l.t.X(view, b0Var);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class d implements g0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.g0.a
        public void a(Rect rect) {
            rect.top = f.this.O0(null, rect);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            f.this.V();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.f$f */
    class RunnableC0001f implements Runnable {

        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: androidx.appcompat.app.f$f$a */
        class a extends z {
            a() {
            }

            @Override // c.h.l.y
            public void b(View view) {
                f.this.z.setAlpha(1.0f);
                f.this.C.f(null);
                f.this.C = null;
            }

            @Override // c.h.l.z, c.h.l.y
            public void c(View view) {
                f.this.z.setVisibility(0);
            }
        }

        RunnableC0001f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.A.showAtLocation(fVar.z, 55, 0, 0);
            f.this.Y();
            if (!f.this.G0()) {
                f.this.z.setAlpha(1.0f);
                f.this.z.setVisibility(0);
            } else {
                f.this.z.setAlpha(0.0f);
                f fVar2 = f.this;
                fVar2.C = c.h.l.t.d(fVar2.z).a(1.0f);
                f.this.C.f(new a());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class g extends z {
        g() {
        }

        @Override // c.h.l.y
        public void b(View view) {
            f.this.z.setAlpha(1.0f);
            f.this.C.f(null);
            f.this.C = null;
        }

        @Override // c.h.l.z, c.h.l.y
        public void c(View view) {
            f.this.z.setVisibility(0);
            f.this.z.sendAccessibilityEvent(32);
            if (f.this.z.getParent() instanceof View) {
                c.h.l.t.h0((View) f.this.z.getParent());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private final class h implements m.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
            f.this.O(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackI0 = f.this.i0();
            if (callbackI0 == null) {
                return true;
            }
            callbackI0.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class i implements b.a {
        private b.a a;

        /* compiled from: AppCompatDelegateImpl.java */
        class a extends z {
            a() {
            }

            @Override // c.h.l.y
            public void b(View view) {
                f.this.z.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.z.getParent() instanceof View) {
                    c.h.l.t.h0((View) f.this.z.getParent());
                }
                f.this.z.removeAllViews();
                f.this.C.f(null);
                f fVar2 = f.this;
                fVar2.C = null;
                c.h.l.t.h0(fVar2.F);
            }
        }

        public i(b.a aVar) {
            this.a = aVar;
        }

        @Override // c.a.o.b.a
        public void a(c.a.o.b bVar) {
            this.a.a(bVar);
            f fVar = f.this;
            if (fVar.A != null) {
                fVar.p.getDecorView().removeCallbacks(f.this.B);
            }
            f fVar2 = f.this;
            if (fVar2.z != null) {
                fVar2.Y();
                f fVar3 = f.this;
                fVar3.C = c.h.l.t.d(fVar3.z).a(0.0f);
                f.this.C.f(new a());
            }
            f fVar4 = f.this;
            androidx.appcompat.app.d dVar = fVar4.r;
            if (dVar != null) {
                dVar.g(fVar4.y);
            }
            f fVar5 = f.this;
            fVar5.y = null;
            c.h.l.t.h0(fVar5.F);
        }

        @Override // c.a.o.b.a
        public boolean b(c.a.o.b bVar, Menu menu) {
            return this.a.b(bVar, menu);
        }

        @Override // c.a.o.b.a
        public boolean c(c.a.o.b bVar, Menu menu) {
            c.h.l.t.h0(f.this.F);
            return this.a.c(bVar, menu);
        }

        @Override // c.a.o.b.a
        public boolean d(c.a.o.b bVar, MenuItem menuItem) {
            return this.a.d(bVar, menuItem);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private class k extends l {

        /* renamed from: c */
        private final PowerManager f87c;

        k(Context context) {
            super();
            this.f87c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.f.l
        IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.l
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f87c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.f.l
        public void d() {
            f.this.e();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    abstract class l {
        private BroadcastReceiver a;

        /* compiled from: AppCompatDelegateImpl.java */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                l.this.d();
            }
        }

        l() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    f.this.o.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            f.this.o.registerReceiver(this.a, intentFilterB);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private class m extends l {

        /* renamed from: c */
        private final androidx.appcompat.app.l f90c;

        m(androidx.appcompat.app.l lVar) {
            super();
            this.f90c = lVar;
        }

        @Override // androidx.appcompat.app.f.l
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.l
        public int c() {
            return this.f90c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.f.l
        public void d() {
            f.this.e();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    static class n {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.densityDpi;
            int i3 = configuration2.densityDpi;
            if (i2 != i3) {
                configuration3.densityDpi = i3;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    static class o {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    static class p {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.colorMode & 3;
            int i3 = configuration2.colorMode;
            if (i2 != (i3 & 3)) {
                configuration3.colorMode |= i3 & 3;
            }
            int i4 = configuration.colorMode & 12;
            int i5 = configuration2.colorMode;
            if (i4 != (i5 & 12)) {
                configuration3.colorMode |= i5 & 12;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private static class q {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean c(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.W(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.Q(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(c.a.k.a.a.d(getContext(), i2));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    protected static final class s {
        int a;

        /* renamed from: b */
        int f93b;

        /* renamed from: c */
        int f94c;

        /* renamed from: d */
        int f95d;

        /* renamed from: e */
        int f96e;

        /* renamed from: f */
        int f97f;

        /* renamed from: g */
        ViewGroup f98g;

        /* renamed from: h */
        View f99h;

        /* renamed from: i */
        View f100i;

        /* renamed from: j */
        androidx.appcompat.view.menu.g f101j;

        /* renamed from: k */
        androidx.appcompat.view.menu.e f102k;

        /* renamed from: l */
        Context f103l;

        /* renamed from: m */
        boolean f104m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        s(int i2) {
            this.a = i2;
        }

        androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.f101j == null) {
                return null;
            }
            if (this.f102k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f103l, c.a.g.f2503j);
                this.f102k = eVar;
                eVar.h(aVar);
                this.f101j.b(this.f102k);
            }
            return this.f102k.b(this.f98g);
        }

        public boolean b() {
            if (this.f99h == null) {
                return false;
            }
            return this.f100i != null || this.f102k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f101j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.O(this.f102k);
            }
            this.f101j = gVar;
            if (gVar == null || (eVar = this.f102k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(c.a.a.a, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            }
            themeNewTheme.resolveAttribute(c.a.a.E, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                themeNewTheme.applyStyle(i3, true);
            } else {
                themeNewTheme.applyStyle(c.a.i.f2518b, true);
            }
            c.a.o.d dVar = new c.a.o.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f103l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(c.a.j.z0);
            this.f93b = typedArrayObtainStyledAttributes.getResourceId(c.a.j.C0, 0);
            this.f97f = typedArrayObtainStyledAttributes.getResourceId(c.a.j.B0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private final class t implements m.a {
        t() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g gVarD = gVar.D();
            boolean z2 = gVarD != gVar;
            f fVar = f.this;
            if (z2) {
                gVar = gVarD;
            }
            s sVarB0 = fVar.b0(gVar);
            if (sVarB0 != null) {
                if (!z2) {
                    f.this.R(sVarB0, z);
                } else {
                    f.this.N(sVarB0.a, sVarB0, gVarD);
                    f.this.R(sVarB0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackI0;
            if (gVar != gVar.D()) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.K || (callbackI0 = fVar.i0()) == null || f.this.W) {
                return true;
            }
            callbackI0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 < 21;
        f77i = z;
        f78j = new int[]{R.attr.windowBackground};
        f79k = !"robolectric".equals(Build.FINGERPRINT);
        f80l = i2 >= 17;
        if (!z || f81m) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        f81m = true;
    }

    f(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    private void A0(s sVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (sVar.o || this.W) {
            return;
        }
        if (sVar.a == 0) {
            if ((this.o.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackI0 = i0();
        if (callbackI0 != null && !callbackI0.onMenuOpened(sVar.a, sVar.f101j)) {
            R(sVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.o.getSystemService("window");
        if (windowManager != null && D0(sVar, keyEvent)) {
            ViewGroup viewGroup = sVar.f98g;
            if (viewGroup != null && !sVar.q) {
                View view = sVar.f100i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                }
                sVar.n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, sVar.f95d, sVar.f96e, 1002, 8519680, -3);
                layoutParams2.gravity = sVar.f94c;
                layoutParams2.windowAnimations = sVar.f97f;
                windowManager.addView(sVar.f98g, layoutParams2);
                sVar.o = true;
            }
            if (viewGroup == null) {
                if (!l0(sVar) || sVar.f98g == null) {
                    return;
                }
            } else if (sVar.q && viewGroup.getChildCount() > 0) {
                sVar.f98g.removeAllViews();
            }
            if (!k0(sVar) || !sVar.b()) {
                sVar.q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = sVar.f99h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            sVar.f98g.setBackgroundResource(sVar.f93b);
            ViewParent parent = sVar.f99h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(sVar.f99h);
            }
            sVar.f98g.addView(sVar.f99h, layoutParams3);
            if (!sVar.f99h.hasFocus()) {
                sVar.f99h.requestFocus();
            }
            i2 = -2;
            sVar.n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i2, -2, sVar.f95d, sVar.f96e, 1002, 8519680, -3);
            layoutParams22.gravity = sVar.f94c;
            layoutParams22.windowAnimations = sVar.f97f;
            windowManager.addView(sVar.f98g, layoutParams22);
            sVar.o = true;
        }
    }

    private boolean C0(s sVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f104m || D0(sVar, keyEvent)) && (gVar = sVar.f101j) != null) {
            zPerformShortcut = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.v == null) {
            R(sVar, true);
        }
        return zPerformShortcut;
    }

    private boolean D0(s sVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        if (this.W) {
            return false;
        }
        if (sVar.f104m) {
            return true;
        }
        s sVar2 = this.R;
        if (sVar2 != null && sVar2 != sVar) {
            R(sVar2, false);
        }
        Window.Callback callbackI0 = i0();
        if (callbackI0 != null) {
            sVar.f100i = callbackI0.onCreatePanelView(sVar.a);
        }
        int i2 = sVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (c0Var3 = this.v) != null) {
            c0Var3.c();
        }
        if (sVar.f100i == null && (!z || !(B0() instanceof androidx.appcompat.app.j))) {
            androidx.appcompat.view.menu.g gVar = sVar.f101j;
            if (gVar == null || sVar.r) {
                if (gVar == null && (!m0(sVar) || sVar.f101j == null)) {
                    return false;
                }
                if (z && this.v != null) {
                    if (this.w == null) {
                        this.w = new h();
                    }
                    this.v.a(sVar.f101j, this.w);
                }
                sVar.f101j.d0();
                if (!callbackI0.onCreatePanelMenu(sVar.a, sVar.f101j)) {
                    sVar.c(null);
                    if (z && (c0Var = this.v) != null) {
                        c0Var.a(null, this.w);
                    }
                    return false;
                }
                sVar.r = false;
            }
            sVar.f101j.d0();
            Bundle bundle = sVar.s;
            if (bundle != null) {
                sVar.f101j.P(bundle);
                sVar.s = null;
            }
            if (!callbackI0.onPreparePanel(0, sVar.f100i, sVar.f101j)) {
                if (z && (c0Var2 = this.v) != null) {
                    c0Var2.a(null, this.w);
                }
                sVar.f101j.c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.p = z2;
            sVar.f101j.setQwertyMode(z2);
            sVar.f101j.c0();
        }
        sVar.f104m = true;
        sVar.n = false;
        this.R = sVar;
        return true;
    }

    private void E0(boolean z) {
        c0 c0Var = this.v;
        if (c0Var == null || !c0Var.d() || (ViewConfiguration.get(this.o).hasPermanentMenuKey() && !this.v.e())) {
            s sVarG0 = g0(0, true);
            sVarG0.q = true;
            R(sVarG0, false);
            A0(sVarG0, null);
            return;
        }
        Window.Callback callbackI0 = i0();
        if (this.v.b() && z) {
            this.v.f();
            if (this.W) {
                return;
            }
            callbackI0.onPanelClosed(108, g0(0, true).f101j);
            return;
        }
        if (callbackI0 == null || this.W) {
            return;
        }
        if (this.d0 && (this.e0 & 1) != 0) {
            this.p.getDecorView().removeCallbacks(this.f0);
            this.f0.run();
        }
        s sVarG02 = g0(0, true);
        androidx.appcompat.view.menu.g gVar = sVarG02.f101j;
        if (gVar == null || sVarG02.r || !callbackI0.onPreparePanel(0, sVarG02.f100i, gVar)) {
            return;
        }
        callbackI0.onMenuOpened(108, sVarG02.f101j);
        this.v.g();
    }

    private int F0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean H0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.p.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || c.h.l.t.P((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean J(boolean z) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        if (this.W) {
            return false;
        }
        int iM = M();
        boolean zM0 = M0(q0(this.o, iM), z);
        if (iM == 0) {
            f0(this.o).e();
        } else {
            l lVar = this.b0;
            if (lVar != null) {
                lVar.a();
            }
        }
        if (iM == 3) {
            e0(this.o).e();
        } else {
            l lVar2 = this.c0;
            if (lVar2 != null) {
                lVar2.a();
            }
        }
        return zM0;
    }

    private void K() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.F.findViewById(R.id.content);
        View decorView = this.p.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.o.obtainStyledAttributes(c.a.j.z0);
        typedArrayObtainStyledAttributes.getValue(c.a.j.L0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(c.a.j.M0, contentFrameLayout.getMinWidthMinor());
        int i2 = c.a.j.J0;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = c.a.j.K0;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            typedArrayObtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = c.a.j.H0;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            typedArrayObtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = c.a.j.I0;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            typedArrayObtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void K0() {
        if (this.E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void L(Window window) {
        if (this.p != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof j) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        j jVar = new j(callback);
        this.q = jVar;
        window.setCallback(jVar);
        w0 w0VarU = w0.u(this.o, null, f78j);
        Drawable drawableH = w0VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        w0VarU.w();
        this.p = window;
    }

    private androidx.appcompat.app.c L0() {
        for (Context baseContext = this.o; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private int M() {
        int i2 = this.X;
        return i2 != -100 ? i2 : androidx.appcompat.app.e.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean M0(int r7, boolean r8) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.IllegalArgumentException {
        /*
            r6 = this;
            android.content.Context r0 = r6.o
            r1 = 0
            android.content.res.Configuration r0 = r6.S(r0, r7, r1)
            boolean r2 = r6.o0()
            android.content.Context r3 = r6.o
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.T
            if (r8 == 0) goto L47
            boolean r8 = androidx.appcompat.app.f.f79k
            if (r8 != 0) goto L30
            boolean r8 = r6.U
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.n
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.n
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.a.l(r8)
            r8 = 1
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.N0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.n
            boolean r0 = r8 instanceof androidx.appcompat.app.c
            if (r0 == 0) goto L5e
            androidx.appcompat.app.c r8 = (androidx.appcompat.app.c) r8
            r8.M(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.M0(int, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N0(int i2, boolean z, Configuration configuration) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Resources resources = this.o.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            androidx.appcompat.app.i.a(resources);
        }
        int i4 = this.Y;
        if (i4 != 0) {
            this.o.setTheme(i4);
            if (i3 >= 23) {
                this.o.getTheme().applyStyle(this.Y, true);
            }
        }
        if (z) {
            Object obj = this.n;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.k) {
                    if (((androidx.lifecycle.k) activity).i().b().a(g.c.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.V) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private void P() {
        l lVar = this.b0;
        if (lVar != null) {
            lVar.a();
        }
        l lVar2 = this.c0;
        if (lVar2 != null) {
            lVar2.a();
        }
    }

    private void P0(View view) {
        view.setBackgroundColor((c.h.l.t.J(view) & 8192) != 0 ? androidx.core.content.a.c(this.o, c.a.c.f2453b) : androidx.core.content.a.c(this.o, c.a.c.a));
    }

    private Configuration S(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup T() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.o.obtainStyledAttributes(c.a.j.z0);
        int i2 = c.a.j.E0;
        if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(c.a.j.N0, false)) {
            B(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i2, false)) {
            B(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(c.a.j.F0, false)) {
            B(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(c.a.j.G0, false)) {
            B(10);
        }
        this.N = typedArrayObtainStyledAttributes.getBoolean(c.a.j.A0, false);
        typedArrayObtainStyledAttributes.recycle();
        a0();
        this.p.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.o);
        if (this.O) {
            viewGroup = this.M ? (ViewGroup) layoutInflaterFrom.inflate(c.a.g.o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(c.a.g.n, (ViewGroup) null);
        } else if (this.N) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(c.a.g.f2499f, (ViewGroup) null);
            this.L = false;
            this.K = false;
        } else if (this.K) {
            TypedValue typedValue = new TypedValue();
            this.o.getTheme().resolveAttribute(c.a.a.f2445f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new c.a.o.d(this.o, typedValue.resourceId) : this.o).inflate(c.a.g.p, (ViewGroup) null);
            c0 c0Var = (c0) viewGroup.findViewById(c.a.f.p);
            this.v = c0Var;
            c0Var.setWindowCallback(i0());
            if (this.L) {
                this.v.h(109);
            }
            if (this.I) {
                this.v.h(2);
            }
            if (this.J) {
                this.v.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.K + ", windowActionBarOverlay: " + this.L + ", android:windowIsFloating: " + this.N + ", windowActionModeOverlay: " + this.M + ", windowNoTitle: " + this.O + " }");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            c.h.l.t.w0(viewGroup, new c());
        } else if (viewGroup instanceof g0) {
            ((g0) viewGroup).setOnFitSystemWindowsListener(new d());
        }
        if (this.v == null) {
            this.G = (TextView) viewGroup.findViewById(c.a.f.M);
        }
        c1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(c.a.f.f2483b);
        ViewGroup viewGroup2 = (ViewGroup) this.p.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.p.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    private void Z() {
        if (this.E) {
            return;
        }
        this.F = T();
        CharSequence charSequenceH0 = h0();
        if (!TextUtils.isEmpty(charSequenceH0)) {
            c0 c0Var = this.v;
            if (c0Var != null) {
                c0Var.setWindowTitle(charSequenceH0);
            } else if (B0() != null) {
                B0().t(charSequenceH0);
            } else {
                TextView textView = this.G;
                if (textView != null) {
                    textView.setText(charSequenceH0);
                }
            }
        }
        K();
        z0(this.F);
        this.E = true;
        s sVarG0 = g0(0, false);
        if (this.W) {
            return;
        }
        if (sVarG0 == null || sVarG0.f101j == null) {
            n0(108);
        }
    }

    private void a0() {
        if (this.p == null) {
            Object obj = this.n;
            if (obj instanceof Activity) {
                L(((Activity) obj).getWindow());
            }
        }
        if (this.p == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration c0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                o.a(configuration, configuration2, configuration3);
            } else if (!c.h.k.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & 192;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 192)) {
                configuration3.screenLayout |= i22 & 192;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                p.a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            if (i6 >= 17) {
                n.a(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    private l e0(Context context) {
        if (this.c0 == null) {
            this.c0 = new k(context);
        }
        return this.c0;
    }

    private l f0(Context context) {
        if (this.b0 == null) {
            this.b0 = new m(androidx.appcompat.app.l.a(context));
        }
        return this.b0;
    }

    private void j0() {
        Z();
        if (this.K && this.s == null) {
            Object obj = this.n;
            if (obj instanceof Activity) {
                this.s = new androidx.appcompat.app.m((Activity) this.n, this.L);
            } else if (obj instanceof Dialog) {
                this.s = new androidx.appcompat.app.m((Dialog) this.n);
            }
            androidx.appcompat.app.a aVar = this.s;
            if (aVar != null) {
                aVar.q(this.g0);
            }
        }
    }

    private boolean k0(s sVar) {
        View view = sVar.f100i;
        if (view != null) {
            sVar.f99h = view;
            return true;
        }
        if (sVar.f101j == null) {
            return false;
        }
        if (this.x == null) {
            this.x = new t();
        }
        View view2 = (View) sVar.a(this.x);
        sVar.f99h = view2;
        return view2 != null;
    }

    private boolean l0(s sVar) {
        sVar.d(d0());
        sVar.f98g = new r(sVar.f103l);
        sVar.f94c = 81;
        return true;
    }

    private boolean m0(s sVar) {
        Context context = this.o;
        int i2 = sVar.a;
        if ((i2 == 0 || i2 == 108) && this.v != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(c.a.a.f2445f, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(c.a.a.f2446g, typedValue, true);
            } else {
                theme.resolveAttribute(c.a.a.f2446g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                c.a.o.d dVar = new c.a.o.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        sVar.c(gVar);
        return true;
    }

    private void n0(int i2) {
        this.e0 = (1 << i2) | this.e0;
        if (this.d0) {
            return;
        }
        c.h.l.t.c0(this.p.getDecorView(), this.f0);
        this.d0 = true;
    }

    private boolean o0() throws PackageManager.NameNotFoundException {
        if (!this.a0 && (this.n instanceof Activity)) {
            PackageManager packageManager = this.o.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.o, this.n.getClass()), i2 >= 29 ? 269221888 : i2 >= 24 ? 786432 : 0);
                this.Z = (activityInfo == null || (activityInfo.configChanges & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.Z = false;
            }
        }
        this.a0 = true;
        return this.Z;
    }

    private boolean t0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s sVarG0 = g0(i2, true);
        if (sVarG0.o) {
            return false;
        }
        return D0(sVarG0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean w0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            c.a.o.b r0 = r4.y
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.f$s r2 = r4.g0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.c0 r5 = r4.v
            if (r5 == 0) goto L43
            boolean r5 = r5.d()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.o
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.c0 r5 = r4.v
            boolean r5 = r5.b()
            if (r5 != 0) goto L3c
            boolean r5 = r4.W
            if (r5 != 0) goto L62
            boolean r5 = r4.D0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.c0 r5 = r4.v
            boolean r0 = r5.g()
            goto L68
        L3c:
            androidx.appcompat.widget.c0 r5 = r4.v
            boolean r0 = r5.f()
            goto L68
        L43:
            boolean r5 = r2.o
            if (r5 != 0) goto L64
            boolean r3 = r2.n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f104m
            if (r5 == 0) goto L62
            boolean r5 = r2.r
            if (r5 == 0) goto L5b
            r2.f104m = r1
            boolean r5 = r4.D0(r2, r6)
            goto L5c
        L5b:
            r5 = 1
        L5c:
            if (r5 == 0) goto L62
            r4.A0(r2, r6)
            goto L68
        L62:
            r0 = 0
            goto L68
        L64:
            r4.R(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.o
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            goto L85
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.w0(int, android.view.KeyEvent):boolean");
    }

    @Override // androidx.appcompat.app.e
    public boolean B(int i2) {
        int iF0 = F0(i2);
        if (this.O && iF0 == 108) {
            return false;
        }
        if (this.K && iF0 == 1) {
            this.K = false;
        }
        if (iF0 == 1) {
            K0();
            this.O = true;
            return true;
        }
        if (iF0 == 2) {
            K0();
            this.I = true;
            return true;
        }
        if (iF0 == 5) {
            K0();
            this.J = true;
            return true;
        }
        if (iF0 == 10) {
            K0();
            this.M = true;
            return true;
        }
        if (iF0 == 108) {
            K0();
            this.K = true;
            return true;
        }
        if (iF0 != 109) {
            return this.p.requestFeature(iF0);
        }
        K0();
        this.L = true;
        return true;
    }

    final androidx.appcompat.app.a B0() {
        return this.s;
    }

    @Override // androidx.appcompat.app.e
    public void C(int i2) {
        Z();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.o).inflate(i2, viewGroup);
        this.q.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void D(View view) {
        Z();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.q.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void E(View view, ViewGroup.LayoutParams layoutParams) {
        Z();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.q.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void G(Toolbar toolbar) {
        if (this.n instanceof Activity) {
            androidx.appcompat.app.a aVarO = o();
            if (aVarO instanceof androidx.appcompat.app.m) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.t = null;
            if (aVarO != null) {
                aVarO.m();
            }
            if (toolbar != null) {
                androidx.appcompat.app.j jVar = new androidx.appcompat.app.j(toolbar, h0(), this.q);
                this.s = jVar;
                this.p.setCallback(jVar.w());
            } else {
                this.s = null;
                this.p.setCallback(this.q);
            }
            q();
        }
    }

    final boolean G0() {
        ViewGroup viewGroup;
        return this.E && (viewGroup = this.F) != null && c.h.l.t.Q(viewGroup);
    }

    @Override // androidx.appcompat.app.e
    public void H(int i2) {
        this.Y = i2;
    }

    @Override // androidx.appcompat.app.e
    public final void I(CharSequence charSequence) {
        this.u = charSequence;
        c0 c0Var = this.v;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
            return;
        }
        if (B0() != null) {
            B0().t(charSequence);
            return;
        }
        TextView textView = this.G;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public c.a.o.b I0(b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        c.a.o.b bVar = this.y;
        if (bVar != null) {
            bVar.c();
        }
        i iVar = new i(aVar);
        androidx.appcompat.app.a aVarO = o();
        if (aVarO != null) {
            c.a.o.b bVarU = aVarO.u(iVar);
            this.y = bVarU;
            if (bVarU != null && (dVar = this.r) != null) {
                dVar.f(bVarU);
            }
        }
        if (this.y == null) {
            this.y = J0(iVar);
        }
        return this.y;
    }

    c.a.o.b J0(b.a aVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        c.a.o.b bVarO;
        Context dVar;
        androidx.appcompat.app.d dVar2;
        Y();
        c.a.o.b bVar = this.y;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        androidx.appcompat.app.d dVar3 = this.r;
        if (dVar3 == null || this.W) {
            bVarO = null;
        } else {
            try {
                bVarO = dVar3.o(aVar);
            } catch (AbstractMethodError unused) {
            }
        }
        if (bVarO != null) {
            this.y = bVarO;
        } else {
            if (this.z == null) {
                if (this.N) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.o.getTheme();
                    theme.resolveAttribute(c.a.a.f2445f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.o.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new c.a.o.d(this.o, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.o;
                    }
                    this.z = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, c.a.a.f2448i);
                    this.A = popupWindow;
                    androidx.core.widget.h.b(popupWindow, 2);
                    this.A.setContentView(this.z);
                    this.A.setWidth(-1);
                    dVar.getTheme().resolveAttribute(c.a.a.f2441b, typedValue, true);
                    this.z.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.A.setHeight(-2);
                    this.B = new RunnableC0001f();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.F.findViewById(c.a.f.f2489h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(d0()));
                        this.z = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.z != null) {
                Y();
                this.z.k();
                c.a.o.e eVar = new c.a.o.e(this.z.getContext(), this.z, aVar, this.A == null);
                if (aVar.b(eVar, eVar.e())) {
                    eVar.k();
                    this.z.h(eVar);
                    this.y = eVar;
                    if (G0()) {
                        this.z.setAlpha(0.0f);
                        x xVarA = c.h.l.t.d(this.z).a(1.0f);
                        this.C = xVarA;
                        xVarA.f(new g());
                    } else {
                        this.z.setAlpha(1.0f);
                        this.z.setVisibility(0);
                        this.z.sendAccessibilityEvent(32);
                        if (this.z.getParent() instanceof View) {
                            c.h.l.t.h0((View) this.z.getParent());
                        }
                    }
                    if (this.A != null) {
                        this.p.getDecorView().post(this.B);
                    }
                } else {
                    this.y = null;
                }
            }
        }
        c.a.o.b bVar2 = this.y;
        if (bVar2 != null && (dVar2 = this.r) != null) {
            dVar2.f(bVar2);
        }
        return this.y;
    }

    void N(int i2, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i2 >= 0) {
                s[] sVarArr = this.Q;
                if (i2 < sVarArr.length) {
                    sVar = sVarArr[i2];
                }
            }
            if (sVar != null) {
                menu = sVar.f101j;
            }
        }
        if ((sVar == null || sVar.o) && !this.W) {
            this.q.a().onPanelClosed(i2, menu);
        }
    }

    void O(androidx.appcompat.view.menu.g gVar) {
        if (this.P) {
            return;
        }
        this.P = true;
        this.v.i();
        Window.Callback callbackI0 = i0();
        if (callbackI0 != null && !this.W) {
            callbackI0.onPanelClosed(108, gVar);
        }
        this.P = false;
    }

    final int O0(b0 b0Var, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        boolean z2;
        int iH = b0Var != null ? b0Var.h() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.z;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
            if (this.z.isShown()) {
                if (this.h0 == null) {
                    this.h0 = new Rect();
                    this.i0 = new Rect();
                }
                Rect rect2 = this.h0;
                Rect rect3 = this.i0;
                if (b0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(b0Var.f(), b0Var.h(), b0Var.g(), b0Var.e());
                }
                c1.a(this.F, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                b0 b0VarH = c.h.l.t.H(this.F);
                int iF = b0VarH == null ? 0 : b0VarH.f();
                int iG = b0VarH == null ? 0 : b0VarH.g();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.H != null) {
                    View view = this.H;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != iF || marginLayoutParams2.rightMargin != iG) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = iF;
                            marginLayoutParams2.rightMargin = iG;
                            this.H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.o);
                    this.H = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iF;
                    layoutParams.rightMargin = iG;
                    this.F.addView(this.H, -1, layoutParams);
                }
                View view3 = this.H;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    P0(this.H);
                }
                if (!this.M && z) {
                    iH = 0;
                }
                z = z;
                z = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                this.z.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.H;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return iH;
    }

    void Q(int i2) {
        R(g0(i2, true), true);
    }

    void R(s sVar, boolean z) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (z && sVar.a == 0 && (c0Var = this.v) != null && c0Var.b()) {
            O(sVar.f101j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.o.getSystemService("window");
        if (windowManager != null && sVar.o && (viewGroup = sVar.f98g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                N(sVar.a, sVar, null);
            }
        }
        sVar.f104m = false;
        sVar.n = false;
        sVar.o = false;
        sVar.f99h = null;
        sVar.q = true;
        if (this.R == sVar) {
            this.R = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View U(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean zH0 = false;
        if (this.j0 == null) {
            String string = this.o.obtainStyledAttributes(c.a.j.z0).getString(c.a.j.D0);
            if (string == null) {
                this.j0 = new androidx.appcompat.app.h();
            } else {
                try {
                    this.j0 = (androidx.appcompat.app.h) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.j0 = new androidx.appcompat.app.h();
                }
            }
        }
        boolean z2 = f77i;
        if (z2) {
            if (!(attributeSet instanceof XmlPullParser)) {
                zH0 = H0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                zH0 = true;
            }
            z = zH0;
        } else {
            z = false;
        }
        return this.j0.q(view, str, context, attributeSet, z, z2, true, b1.b());
    }

    void V() {
        androidx.appcompat.view.menu.g gVar;
        c0 c0Var = this.v;
        if (c0Var != null) {
            c0Var.i();
        }
        if (this.A != null) {
            this.p.getDecorView().removeCallbacks(this.B);
            if (this.A.isShowing()) {
                try {
                    this.A.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.A = null;
        }
        Y();
        s sVarG0 = g0(0, false);
        if (sVarG0 == null || (gVar = sVarG0.f101j) == null) {
            return;
        }
        gVar.close();
    }

    boolean W(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.n;
        if (((obj instanceof e.a) || (obj instanceof androidx.appcompat.app.g)) && (decorView = this.p.getDecorView()) != null && c.h.l.e.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.q.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? s0(keyCode, keyEvent) : v0(keyCode, keyEvent);
    }

    void X(int i2) {
        s sVarG0;
        s sVarG02 = g0(i2, true);
        if (sVarG02.f101j != null) {
            Bundle bundle = new Bundle();
            sVarG02.f101j.Q(bundle);
            if (bundle.size() > 0) {
                sVarG02.s = bundle;
            }
            sVarG02.f101j.d0();
            sVarG02.f101j.clear();
        }
        sVarG02.r = true;
        sVarG02.q = true;
        if ((i2 != 108 && i2 != 0) || this.v == null || (sVarG0 = g0(0, false)) == null) {
            return;
        }
        sVarG0.f104m = false;
        D0(sVarG0, null);
    }

    void Y() {
        x xVar = this.C;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        s sVarB0;
        Window.Callback callbackI0 = i0();
        if (callbackI0 == null || this.W || (sVarB0 = b0(gVar.D())) == null) {
            return false;
        }
        return callbackI0.onMenuItemSelected(sVarB0.a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        E0(true);
    }

    s b0(Menu menu) {
        s[] sVarArr = this.Q;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            s sVar = sVarArr[i2];
            if (sVar != null && sVar.f101j == menu) {
                return sVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.e
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        Z();
        ((ViewGroup) this.F.findViewById(R.id.content)).addView(view, layoutParams);
        this.q.a().onContentChanged();
    }

    final Context d0() {
        androidx.appcompat.app.a aVarO = o();
        Context contextJ = aVarO != null ? aVarO.j() : null;
        return contextJ == null ? this.o : contextJ;
    }

    @Override // androidx.appcompat.app.e
    public boolean e() {
        return J(true);
    }

    protected s g0(int i2, boolean z) {
        s[] sVarArr = this.Q;
        if (sVarArr == null || sVarArr.length <= i2) {
            s[] sVarArr2 = new s[i2 + 1];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.Q = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i2];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i2);
        sVarArr[i2] = sVar2;
        return sVar2;
    }

    @Override // androidx.appcompat.app.e
    public Context h(Context context) {
        this.T = true;
        int iQ0 = q0(context, M());
        if (f80l && (context instanceof ContextThemeWrapper)) {
            try {
                q.a((ContextThemeWrapper) context, S(context, iQ0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof c.a.o.d) {
            try {
                ((c.a.o.d) context).a(S(context, iQ0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f79k) {
            return super.h(context);
        }
        try {
            Configuration configuration = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration2 = context.getResources().getConfiguration();
            Configuration configurationS = S(context, iQ0, configuration.equals(configuration2) ? null : c0(configuration, configuration2));
            c.a.o.d dVar = new c.a.o.d(context, c.a.i.f2519c);
            dVar.a(configurationS);
            boolean z = false;
            try {
                z = context.getTheme() != null;
            } catch (NullPointerException unused3) {
            }
            if (z) {
                f.b.a(dVar.getTheme());
            }
            return super.h(dVar);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("Application failed to obtain resources from itself", e2);
        }
    }

    final CharSequence h0() {
        Object obj = this.n;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.u;
    }

    final Window.Callback i0() {
        return this.p.getCallback();
    }

    @Override // androidx.appcompat.app.e
    public <T extends View> T k(int i2) {
        Z();
        return (T) this.p.findViewById(i2);
    }

    @Override // androidx.appcompat.app.e
    public int m() {
        return this.X;
    }

    @Override // androidx.appcompat.app.e
    public MenuInflater n() {
        if (this.t == null) {
            j0();
            androidx.appcompat.app.a aVar = this.s;
            this.t = new c.a.o.g(aVar != null ? aVar.j() : this.o);
        }
        return this.t;
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.app.a o() {
        j0();
        return this.s;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return U(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.e
    public void p() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.o);
        if (layoutInflaterFrom.getFactory() == null) {
            c.h.l.f.b(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof f) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public boolean p0() {
        return this.D;
    }

    @Override // androidx.appcompat.app.e
    public void q() {
        androidx.appcompat.app.a aVarO = o();
        if (aVarO == null || !aVarO.k()) {
            n0(0);
        }
    }

    int q0(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() != 0) {
                    return f0(context).c();
                }
                return -1;
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    return e0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i2;
    }

    @Override // androidx.appcompat.app.e
    public void r(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        androidx.appcompat.app.a aVarO;
        if (this.K && this.E && (aVarO = o()) != null) {
            aVarO.l(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.o);
        J(false);
    }

    boolean r0() {
        c.a.o.b bVar = this.y;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarO = o();
        return aVarO != null && aVarO.g();
    }

    @Override // androidx.appcompat.app.e
    public void s(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        this.T = true;
        J(false);
        a0();
        Object obj = this.n;
        if (obj instanceof Activity) {
            String strC = null;
            try {
                strC = androidx.core.app.g.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarB0 = B0();
                if (aVarB0 == null) {
                    this.g0 = true;
                } else {
                    aVarB0.q(true);
                }
            }
            androidx.appcompat.app.e.c(this);
        }
        this.U = true;
    }

    boolean s0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.S = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            t0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    @Override // androidx.appcompat.app.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.n
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.e.z(r3)
        L9:
            boolean r0 = r3.d0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.p
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f0
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.V = r0
            r0 = 1
            r3.W = r0
            int r0 = r3.X
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.n
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            c.e.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.f.f76h
            java.lang.Object r1 = r3.n
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.X
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            c.e.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.f.f76h
            java.lang.Object r1 = r3.n
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            androidx.appcompat.app.a r0 = r3.s
            if (r0 == 0) goto L5e
            r0.m()
        L5e:
            r3.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f.t():void");
    }

    @Override // androidx.appcompat.app.e
    public void u(Bundle bundle) {
        Z();
    }

    boolean u0(int i2, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarO = o();
        if (aVarO != null && aVarO.n(i2, keyEvent)) {
            return true;
        }
        s sVar = this.R;
        if (sVar != null && C0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            s sVar2 = this.R;
            if (sVar2 != null) {
                sVar2.n = true;
            }
            return true;
        }
        if (this.R == null) {
            s sVarG0 = g0(0, true);
            D0(sVarG0, keyEvent);
            boolean zC0 = C0(sVarG0, keyEvent.getKeyCode(), keyEvent, 1);
            sVarG0.f104m = false;
            if (zC0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void v() {
        androidx.appcompat.app.a aVarO = o();
        if (aVarO != null) {
            aVarO.s(true);
        }
    }

    boolean v0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.S;
            this.S = false;
            s sVarG0 = g0(0, false);
            if (sVarG0 != null && sVarG0.o) {
                if (!z) {
                    R(sVarG0, true);
                }
                return true;
            }
            if (r0()) {
                return true;
            }
        } else if (i2 == 82) {
            w0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void w(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.e
    public void x() {
        this.V = true;
        e();
    }

    void x0(int i2) {
        androidx.appcompat.app.a aVarO;
        if (i2 != 108 || (aVarO = o()) == null) {
            return;
        }
        aVarO.h(true);
    }

    @Override // androidx.appcompat.app.e
    public void y() {
        this.V = false;
        androidx.appcompat.app.a aVarO = o();
        if (aVarO != null) {
            aVarO.s(false);
        }
    }

    void y0(int i2) {
        if (i2 == 108) {
            androidx.appcompat.app.a aVarO = o();
            if (aVarO != null) {
                aVarO.h(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            s sVarG0 = g0(i2, true);
            if (sVarG0.o) {
                R(sVarG0, false);
            }
        }
    }

    void z0(ViewGroup viewGroup) {
    }

    f(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private f(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        c.e.g<String, Integer> gVar;
        Integer num;
        androidx.appcompat.app.c cVarL0;
        this.C = null;
        this.D = true;
        this.X = -100;
        this.f0 = new b();
        this.o = context;
        this.r = dVar;
        this.n = obj;
        if (this.X == -100 && (obj instanceof Dialog) && (cVarL0 = L0()) != null) {
            this.X = cVarL0.J().m();
        }
        if (this.X == -100 && (num = (gVar = f76h).get(obj.getClass().getName())) != null) {
            this.X = num.intValue();
            gVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            L(window);
        }
        androidx.appcompat.widget.j.h();
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class j extends c.a.o.i {
        j(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(f.this.o, callback);
            c.a.o.b bVarI0 = f.this.I0(aVar);
            if (bVarI0 != null) {
                return aVar.e(bVarI0);
            }
            return null;
        }

        @Override // c.a.o.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.W(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // c.a.o.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.u0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // c.a.o.i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // c.a.o.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // c.a.o.i, android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            f.this.x0(i2);
            return true;
        }

        @Override // c.a.o.i, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            super.onPanelClosed(i2, menu);
            f.this.y0(i2);
        }

        @Override // c.a.o.i, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i2 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.a0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i2, view, menu);
            if (gVar != null) {
                gVar.a0(false);
            }
            return zOnPreparePanel;
        }

        @Override // c.a.o.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            androidx.appcompat.view.menu.g gVar;
            s sVarG0 = f.this.g0(0, true);
            if (sVarG0 == null || (gVar = sVarG0.f101j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i2);
            }
        }

        @Override // c.a.o.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return f.this.p0() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // c.a.o.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            if (f.this.p0() && i2 == 0) {
                return b(callback);
            }
            return super.onWindowStartingActionMode(callback, i2);
        }
    }
}