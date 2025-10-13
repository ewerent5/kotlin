package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class n8 implements r9 {
    private static final y8 a = new q8();

    /* renamed from: b, reason: collision with root package name */
    private final y8 f14728b;

    public n8() {
        this(new p8(p7.c(), b()));
    }

    private static y8 b() {
        try {
            return (y8) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return a;
        }
    }

    private static boolean c(z8 z8Var) {
        return z8Var.zza() == l9.a;
    }

    @Override // e.c.b.b.c.e.r9
    public final <T> s9<T> a(Class<T> cls) {
        u9.p(cls);
        z8 z8VarB = this.f14728b.b(cls);
        return z8VarB.zzb() ? o7.class.isAssignableFrom(cls) ? g9.g(u9.B(), e7.a(), z8VarB.zzc()) : g9.g(u9.f(), e7.b(), z8VarB.zzc()) : o7.class.isAssignableFrom(cls) ? c(z8VarB) ? e9.m(cls, z8VarB, k9.b(), k8.c(), u9.B(), e7.a(), w8.b()) : e9.m(cls, z8VarB, k9.b(), k8.c(), u9.B(), null, w8.b()) : c(z8VarB) ? e9.m(cls, z8VarB, k9.a(), k8.a(), u9.f(), e7.b(), w8.a()) : e9.m(cls, z8VarB, k9.a(), k8.a(), u9.v(), null, w8.a());
    }

    private n8(y8 y8Var) {
        this.f14728b = (y8) r7.f(y8Var, "messageInfoFactory");
    }
}