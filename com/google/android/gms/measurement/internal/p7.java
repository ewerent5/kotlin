package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class p7 extends f5 {

    /* renamed from: c, reason: collision with root package name */
    private volatile q7 f11114c;

    /* renamed from: d, reason: collision with root package name */
    private q7 f11115d;

    /* renamed from: e, reason: collision with root package name */
    protected q7 f11116e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Activity, q7> f11117f;

    /* renamed from: g, reason: collision with root package name */
    private Activity f11118g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f11119h;

    /* renamed from: i, reason: collision with root package name */
    private volatile q7 f11120i;

    /* renamed from: j, reason: collision with root package name */
    private q7 f11121j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11122k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f11123l;

    /* renamed from: m, reason: collision with root package name */
    private q7 f11124m;
    private String n;

    public p7(z4 z4Var) {
        super(z4Var);
        this.f11123l = new Object();
        this.f11117f = new ConcurrentHashMap();
    }

    private final void C(Activity activity, q7 q7Var, boolean z) {
        q7 q7Var2;
        q7 q7Var3 = this.f11114c == null ? this.f11115d : this.f11114c;
        if (q7Var.f11151b == null) {
            q7Var2 = new q7(q7Var.a, activity != null ? z(activity.getClass().getCanonicalName()) : null, q7Var.f11152c, q7Var.f11154e, q7Var.f11155f);
        } else {
            q7Var2 = q7Var;
        }
        this.f11115d = this.f11114c;
        this.f11114c = q7Var2;
        zzp().u(new r7(this, q7Var2, q7Var3, zzl().c(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(Bundle bundle, q7 q7Var, q7 q7Var2, long j2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        K(q7Var, q7Var2, j2, true, g().y(null, "screen_view", bundle, null, true, true));
    }

    public static void J(q7 q7Var, Bundle bundle, boolean z) {
        if (bundle == null || q7Var == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && q7Var == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = q7Var.a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = q7Var.f11151b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", q7Var.f11152c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(com.google.android.gms.measurement.internal.q7 r10, com.google.android.gms.measurement.internal.q7 r11, long r12, boolean r14, android.os.Bundle r15) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p7.K(com.google.android.gms.measurement.internal.q7, com.google.android.gms.measurement.internal.q7, long, boolean, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(q7 q7Var, boolean z, long j2) {
        j().q(zzl().c());
        if (!p().z(q7Var != null && q7Var.f11153d, z, j2) || q7Var == null) {
            return;
        }
        q7Var.f11153d = false;
    }

    private final q7 R(Activity activity) {
        com.google.android.gms.common.internal.p.j(activity);
        q7 q7Var = this.f11117f.get(activity);
        if (q7Var == null) {
            q7 q7Var2 = new q7(null, z(activity.getClass().getCanonicalName()), g().z0());
            this.f11117f.put(activity, q7Var2);
            q7Var = q7Var2;
        }
        return (i().o(t.w0) && this.f11120i != null) ? this.f11120i : q7Var;
    }

    static /* synthetic */ q7 x(p7 p7Var, q7 q7Var) {
        p7Var.f11121j = null;
        return null;
    }

    private static String z(String str) {
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    public final void A(Activity activity) {
        if (i().o(t.w0)) {
            synchronized (this.f11123l) {
                this.f11122k = true;
                if (activity != this.f11118g) {
                    synchronized (this.f11123l) {
                        this.f11118g = activity;
                        this.f11119h = false;
                    }
                    if (i().o(t.v0) && i().D().booleanValue()) {
                        this.f11120i = null;
                        zzp().u(new v7(this));
                    }
                }
            }
        }
        if (i().o(t.v0) && !i().D().booleanValue()) {
            this.f11114c = this.f11120i;
            zzp().u(new u7(this));
        } else {
            C(activity, R(activity), false);
            a aVarJ = j();
            aVarJ.zzp().u(new e3(aVarJ, aVarJ.zzl().c()));
        }
    }

    public final void B(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!i().D().booleanValue() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f11117f.put(activity, new q7(bundle2.getString(Action.NAME_ATTRIBUTE), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @Deprecated
    public final void D(Activity activity, String str, String str2) {
        if (!i().D().booleanValue()) {
            zzq().F().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        if (this.f11114c == null) {
            zzq().F().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f11117f.get(activity) == null) {
            zzq().F().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = z(activity.getClass().getCanonicalName());
        }
        boolean zW0 = da.w0(this.f11114c.f11151b, str2);
        boolean zW02 = da.w0(this.f11114c.a, str);
        if (zW0 && zW02) {
            zzq().F().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > 100)) {
            zzq().F().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
            zzq().F().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzq().I().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        q7 q7Var = new q7(str, str2, g().z0());
        this.f11117f.put(activity, q7Var);
        C(activity, q7Var, true);
    }

    public final void E(Bundle bundle, long j2) {
        String str;
        if (!i().o(t.w0)) {
            zzq().F().a("Manual screen reporting is disabled.");
            return;
        }
        synchronized (this.f11123l) {
            if (!this.f11122k) {
                zzq().F().a("Cannot log screen view event when the app is in the background.");
                return;
            }
            String strZ = null;
            if (bundle != null) {
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > 100)) {
                    zzq().F().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > 100)) {
                    zzq().F().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                } else {
                    str = string;
                    strZ = string2;
                }
            } else {
                str = null;
            }
            if (strZ == null) {
                Activity activity = this.f11118g;
                strZ = activity != null ? z(activity.getClass().getCanonicalName()) : "Activity";
            }
            String str2 = strZ;
            if (this.f11119h && this.f11114c != null) {
                this.f11119h = false;
                boolean zW0 = da.w0(this.f11114c.f11151b, str2);
                boolean zW02 = da.w0(this.f11114c.a, str);
                if (zW0 && zW02) {
                    zzq().F().a("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            zzq().I().c("Logging screen view with name, class", str == null ? "null" : str, str2 == null ? "null" : str2);
            q7 q7Var = this.f11114c == null ? this.f11115d : this.f11114c;
            q7 q7Var2 = new q7(str, str2, g().z0(), true, j2);
            this.f11114c = q7Var2;
            this.f11115d = q7Var;
            this.f11120i = q7Var2;
            zzp().u(new s7(this, bundle, q7Var2, q7Var, zzl().c()));
        }
    }

    public final void M(String str, q7 q7Var) {
        d();
        synchronized (this) {
            String str2 = this.n;
            if (str2 == null || str2.equals(str) || q7Var != null) {
                this.n = str;
                this.f11124m = q7Var;
            }
        }
    }

    public final q7 N() {
        return this.f11114c;
    }

    public final void O(Activity activity) {
        if (i().o(t.w0)) {
            synchronized (this.f11123l) {
                this.f11122k = false;
                this.f11119h = true;
            }
        }
        long jC = zzl().c();
        if (i().o(t.v0) && !i().D().booleanValue()) {
            this.f11114c = null;
            zzp().u(new t7(this, jC));
        } else {
            q7 q7VarR = R(activity);
            this.f11115d = this.f11114c;
            this.f11114c = null;
            zzp().u(new w7(this, q7VarR, jC));
        }
    }

    public final void P(Activity activity, Bundle bundle) {
        q7 q7Var;
        if (!i().D().booleanValue() || bundle == null || (q7Var = this.f11117f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", q7Var.f11152c);
        bundle2.putString(Action.NAME_ATTRIBUTE, q7Var.a);
        bundle2.putString("referrer_name", q7Var.f11151b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void Q(Activity activity) {
        synchronized (this.f11123l) {
            if (activity == this.f11118g) {
                this.f11118g = null;
            }
        }
        if (i().D().booleanValue()) {
            this.f11117f.remove(activity);
        }
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ l e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ t3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ da g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ i4 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ c i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ a j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ i6 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ s3 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ y7 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ p7 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ r3 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ e9 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean u() {
        return false;
    }

    public final q7 y(boolean z) {
        r();
        d();
        if (!i().o(t.w0) || !z) {
            return this.f11116e;
        }
        q7 q7Var = this.f11116e;
        return q7Var != null ? q7Var : this.f11121j;
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.f zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ Context zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ w4 zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ v3 zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ ta zzt() {
        return super.zzt();
    }
}