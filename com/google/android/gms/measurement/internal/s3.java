package com.google.android.gms.measurement.internal;

import android.content.Context;
import e.c.b.b.c.e.cf;
import e.c.b.b.c.e.ec;
import e.c.b.b.c.e.pd;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class s3 extends f5 {

    /* renamed from: c */
    private String f11193c;

    /* renamed from: d */
    private String f11194d;

    /* renamed from: e */
    private int f11195e;

    /* renamed from: f */
    private String f11196f;

    /* renamed from: g */
    private String f11197g;

    /* renamed from: h */
    private long f11198h;

    /* renamed from: i */
    private long f11199i;

    /* renamed from: j */
    private List<String> f11200j;

    /* renamed from: k */
    private int f11201k;

    /* renamed from: l */
    private String f11202l;

    /* renamed from: m */
    private String f11203m;
    private String n;

    s3(z4 z4Var, long j2) {
        super(z4Var);
        this.f11199i = j2;
    }

    private final String E() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (cf.a() && i().o(t.m0)) {
            zzq().I().a("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> clsLoadClass = zzm().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (clsLoadClass == null) {
                return null;
            }
            try {
                Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zzm());
                if (objInvoke == null) {
                    return null;
                }
                try {
                    return (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                } catch (Exception unused) {
                    zzq().F().a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                zzq().E().a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    final String A() {
        r();
        return this.n;
    }

    final int B() {
        r();
        return this.f11195e;
    }

    final int C() {
        r();
        return this.f11201k;
    }

    final List<String> D() {
        return this.f11200j;
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
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:132|134|(1:136)(29:255|138|(1:142)(2:143|(1:145))|253|146|(4:148|(1:150)(1:152)|257|153)|158|(1:163)(1:162)|164|(1:169)(1:168)|170|(1:(1:173)(1:174))|(3:176|177|(1:189)(1:190))(0)|191|(1:193)|259|194|(1:199)(1:198)|200|(1:202)(1:203)|204|205|(2:218|(1:220))(4:209|(1:211)(1:212)|213|(1:217))|(3:222|(1:224)(1:225)|226)|230|(3:232|(1:234)(3:236|(3:239|(1:261)(1:263)|237)|262)|235)|(1:243)|244|(1:(2:247|248)(2:249|250))(2:251|252))|137|158|(2:160|163)(0)|164|(2:166|169)(0)|170|(0)|(0)(0)|191|(0)|259|194|(7:196|199|200|(0)(0)|204|205|(4:207|218|(0)|(0))(0))(0)|230|(0)|(0)|244|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0253, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0254, code lost:
    
        zzq().A().c("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.v3.s(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01b9 A[Catch: IllegalStateException -> 0x0253, TryCatch #3 {IllegalStateException -> 0x0253, blocks: (B:194:0x01b3, B:196:0x01b9, B:198:0x01c5, B:200:0x01d4, B:204:0x01dd, B:207:0x01e7, B:209:0x01f3, B:213:0x020a, B:215:0x0212, B:222:0x0236, B:224:0x024a, B:226:0x024f, B:225:0x024d, B:217:0x0218, B:218:0x021f, B:220:0x0225, B:199:0x01d0), top: B:259:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01d0 A[Catch: IllegalStateException -> 0x0253, TryCatch #3 {IllegalStateException -> 0x0253, blocks: (B:194:0x01b3, B:196:0x01b9, B:198:0x01c5, B:200:0x01d4, B:204:0x01dd, B:207:0x01e7, B:209:0x01f3, B:213:0x020a, B:215:0x0212, B:222:0x0236, B:224:0x024a, B:226:0x024f, B:225:0x024d, B:217:0x0218, B:218:0x021f, B:220:0x0225, B:199:0x01d0), top: B:259:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x021f A[Catch: IllegalStateException -> 0x0253, TryCatch #3 {IllegalStateException -> 0x0253, blocks: (B:194:0x01b3, B:196:0x01b9, B:198:0x01c5, B:200:0x01d4, B:204:0x01dd, B:207:0x01e7, B:209:0x01f3, B:213:0x020a, B:215:0x0212, B:222:0x0236, B:224:0x024a, B:226:0x024f, B:225:0x024d, B:217:0x0218, B:218:0x021f, B:220:0x0225, B:199:0x01d0), top: B:259:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0225 A[Catch: IllegalStateException -> 0x0253, TryCatch #3 {IllegalStateException -> 0x0253, blocks: (B:194:0x01b3, B:196:0x01b9, B:198:0x01c5, B:200:0x01d4, B:204:0x01dd, B:207:0x01e7, B:209:0x01f3, B:213:0x020a, B:215:0x0212, B:222:0x0236, B:224:0x024a, B:226:0x024f, B:225:0x024d, B:217:0x0218, B:218:0x021f, B:220:0x0225, B:199:0x01d0), top: B:259:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0236 A[Catch: IllegalStateException -> 0x0253, TryCatch #3 {IllegalStateException -> 0x0253, blocks: (B:194:0x01b3, B:196:0x01b9, B:198:0x01c5, B:200:0x01d4, B:204:0x01dd, B:207:0x01e7, B:209:0x01f3, B:213:0x020a, B:215:0x0212, B:222:0x0236, B:224:0x024a, B:226:0x024f, B:225:0x024d, B:217:0x0218, B:218:0x021f, B:220:0x0225, B:199:0x01d0), top: B:259:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02c0  */
    @Override // com.google.android.gms.measurement.internal.f5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void v() throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.s3.v():void");
    }

    final ka w(String str) {
        d();
        String strX = x();
        String strY = y();
        r();
        String str2 = this.f11194d;
        long jB = B();
        r();
        String str3 = this.f11196f;
        r();
        d();
        if (this.f11198h == 0) {
            this.f11198h = this.a.B().t(zzm(), zzm().getPackageName());
        }
        long j2 = this.f11198h;
        boolean zK = this.a.k();
        boolean z = !h().w;
        d();
        String strE = !this.a.k() ? null : E();
        z4 z4Var = this.a;
        Long lValueOf = Long.valueOf(z4Var.s().f10931k.a());
        long jMin = lValueOf.longValue() == 0 ? z4Var.H : Math.min(z4Var.H, lValueOf.longValue());
        int iC = C();
        boolean zBooleanValue = i().B().booleanValue();
        Boolean boolZ = i().z("google_analytics_ssaid_collection_enabled");
        boolean zBooleanValue2 = Boolean.valueOf(boolZ == null || boolZ.booleanValue()).booleanValue();
        i4 i4VarH = h();
        i4VarH.d();
        boolean z2 = i4VarH.z().getBoolean("deferred_analytics_collection", false);
        String strZ = z();
        Boolean boolZ2 = i().z("google_analytics_default_allow_ad_personalization_signals");
        return new ka(strX, strY, str2, jB, str3, 33025L, j2, str, zK, z, strE, 0L, jMin, iC, zBooleanValue, zBooleanValue2, z2, strZ, boolZ2 == null ? null : Boolean.valueOf(true ^ boolZ2.booleanValue()), this.f11199i, this.f11200j, (pd.a() && i().o(t.k0)) ? A() : null, (ec.a() && i().o(t.J0)) ? h().H().e() : "");
    }

    final String x() {
        r();
        return this.f11193c;
    }

    final String y() {
        r();
        return this.f11202l;
    }

    final String z() {
        r();
        return this.f11203m;
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