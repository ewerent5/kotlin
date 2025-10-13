package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: FragmentHostCallback.java */
/* loaded from: classes.dex */
public abstract class j<E> extends f {

    /* renamed from: e */
    private final Activity f1028e;

    /* renamed from: f */
    private final Context f1029f;

    /* renamed from: g */
    private final Handler f1030g;

    /* renamed from: h */
    private final int f1031h;

    /* renamed from: i */
    final m f1032i;

    j(d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.f
    public View b(int i2) {
        return null;
    }

    @Override // androidx.fragment.app.f
    public boolean c() {
        return true;
    }

    Activity d() {
        return this.f1028e;
    }

    Context e() {
        return this.f1029f;
    }

    Handler f() {
        return this.f1030g;
    }

    void g(Fragment fragment) {
    }

    public abstract E h();

    public LayoutInflater j() {
        return LayoutInflater.from(this.f1029f);
    }

    public void l(Fragment fragment, String[] strArr, int i2) {
    }

    public boolean m(Fragment fragment) {
        return true;
    }

    public boolean n(String str) {
        return false;
    }

    public void o(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (i2 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f1029f.startActivity(intent);
    }

    public void p() {
    }

    j(Activity activity, Context context, Handler handler, int i2) {
        this.f1032i = new n();
        this.f1028e = activity;
        this.f1029f = (Context) c.h.k.h.d(context, "context == null");
        this.f1030g = (Handler) c.h.k.h.d(handler, "handler == null");
        this.f1031h = i2;
    }
}