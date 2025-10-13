package com.google.android.gms.measurement.a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.f6;
import e.c.b.b.c.e.h;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
public class a {
    private final h a;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
    /* renamed from: com.google.android.gms.measurement.a.a$a */
    public interface InterfaceC0115a extends f6 {
    }

    public a(h hVar) {
        this.a = hVar;
    }

    public static a k(Context context, String str, String str2, String str3, Bundle bundle) {
        return h.c(context, str, str2, str3, bundle).f();
    }

    public void a(String str) {
        this.a.B(str);
    }

    public void b(String str, String str2, Bundle bundle) {
        this.a.C(str, str2, bundle);
    }

    public void c(String str) {
        this.a.G(str);
    }

    public long d() {
        return this.a.L();
    }

    public String e() {
        return this.a.S();
    }

    public String f() {
        return this.a.K();
    }

    public List<Bundle> g(String str, String str2) {
        return this.a.y(str, str2);
    }

    public String h() {
        return this.a.Q();
    }

    public String i() {
        return this.a.O();
    }

    public String j() {
        return this.a.F();
    }

    public int l(String str) {
        return this.a.J(str);
    }

    public Map<String, Object> m(String str, String str2, boolean z) {
        return this.a.g(str, str2, z);
    }

    public void n(String str, String str2, Bundle bundle) {
        this.a.q(str, str2, bundle);
    }

    public void o(Bundle bundle) {
        this.a.a(bundle, false);
    }

    public Bundle p(Bundle bundle) {
        return this.a.a(bundle, true);
    }

    public void q(InterfaceC0115a interfaceC0115a) {
        this.a.n(interfaceC0115a);
    }

    public void r(Bundle bundle) {
        this.a.j(bundle);
    }

    public void s(Bundle bundle) {
        this.a.A(bundle);
    }

    public void t(Activity activity, String str, String str2) {
        this.a.i(activity, str, str2);
    }

    public void u(String str, String str2, Object obj) {
        this.a.s(str, str2, obj, true);
    }

    public final void v(boolean z) {
        this.a.t(z);
    }
}