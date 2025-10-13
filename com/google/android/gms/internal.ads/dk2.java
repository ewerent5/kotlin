package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class dk2 implements el2 {
    private static final jk2 a = new bk2();

    /* renamed from: b, reason: collision with root package name */
    private final jk2 f5484b;

    public dk2() {
        jk2 jk2Var;
        jk2[] jk2VarArr = new jk2[2];
        jk2VarArr[0] = aj2.a();
        try {
            jk2Var = (jk2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            jk2Var = a;
        }
        jk2VarArr[1] = jk2Var;
        ck2 ck2Var = new ck2(jk2VarArr);
        oj2.b(ck2Var, "messageInfoFactory");
        this.f5484b = ck2Var;
    }

    private static boolean b(ik2 ik2Var) {
        return ik2Var.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.ads.el2
    public final <T> dl2<T> a(Class<T> cls) {
        fl2.A(cls);
        ik2 ik2VarC = this.f5484b.c(cls);
        return ik2VarC.zza() ? ej2.class.isAssignableFrom(cls) ? pk2.a(fl2.c(), ti2.a(), ik2VarC.zzb()) : pk2.a(fl2.a(), ti2.b(), ik2VarC.zzb()) : ej2.class.isAssignableFrom(cls) ? b(ik2VarC) ? ok2.J(cls, ik2VarC, rk2.b(), zj2.e(), fl2.c(), ti2.a(), hk2.b()) : ok2.J(cls, ik2VarC, rk2.b(), zj2.e(), fl2.c(), null, hk2.b()) : b(ik2VarC) ? ok2.J(cls, ik2VarC, rk2.a(), zj2.d(), fl2.a(), ti2.b(), hk2.a()) : ok2.J(cls, ik2VarC, rk2.a(), zj2.d(), fl2.b(), null, hk2.a());
    }
}