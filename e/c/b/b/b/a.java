package e.c.b.b.b;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import e.c.b.b.b.c;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class a<T extends c> {
    private T a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f14348b;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList<InterfaceC0176a> f14349c;

    /* renamed from: d, reason: collision with root package name */
    private final e<T> f14350d = new g(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e.c.b.b.b.a$a, reason: collision with other inner class name */
    interface InterfaceC0176a {
        void a(c cVar);

        int getState();
    }

    public static void k(FrameLayout frameLayout) {
        com.google.android.gms.common.e eVarL = com.google.android.gms.common.e.l();
        Context context = frameLayout.getContext();
        int iG = eVarL.g(context);
        String strD = com.google.android.gms.common.internal.d.d(context, iG);
        String strC = com.google.android.gms.common.internal.d.c(context, iG);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strD);
        linearLayout.addView(textView);
        Intent intentB = eVarL.b(context, iG, null);
        if (intentB != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strC);
            linearLayout.addView(button);
            button.setOnClickListener(new i(context, intentB));
        }
    }

    static /* synthetic */ Bundle l(a aVar, Bundle bundle) {
        aVar.f14348b = null;
        return null;
    }

    private final void o(Bundle bundle, InterfaceC0176a interfaceC0176a) {
        T t = this.a;
        if (t != null) {
            interfaceC0176a.a(t);
            return;
        }
        if (this.f14349c == null) {
            this.f14349c = new LinkedList<>();
        }
        this.f14349c.add(interfaceC0176a);
        if (bundle != null) {
            Bundle bundle2 = this.f14348b;
            if (bundle2 == null) {
                this.f14348b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f14350d);
    }

    private final void q(int i2) {
        while (!this.f14349c.isEmpty() && this.f14349c.getLast().getState() >= i2) {
            this.f14349c.removeLast();
        }
    }

    protected abstract void a(e<T> eVar);

    public T b() {
        return this.a;
    }

    public void c(Bundle bundle) {
        o(bundle, new h(this, bundle));
    }

    public void d() {
        T t = this.a;
        if (t != null) {
            t.onDestroy();
        } else {
            q(1);
        }
    }

    public void e() {
        T t = this.a;
        if (t != null) {
            t.onLowMemory();
        }
    }

    public void f() {
        T t = this.a;
        if (t != null) {
            t.onPause();
        } else {
            q(5);
        }
    }

    public void g() {
        o(null, new k(this));
    }

    public void h(Bundle bundle) {
        T t = this.a;
        if (t != null) {
            t.r(bundle);
            return;
        }
        Bundle bundle2 = this.f14348b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void i() {
        o(null, new j(this));
    }

    public void j() {
        T t = this.a;
        if (t != null) {
            t.l();
        } else {
            q(4);
        }
    }
}