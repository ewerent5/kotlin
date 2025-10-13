package com.parizene.netmonitor.q0;

/* compiled from: AppModule_ProvideBackupLibraryFactory.java */
/* loaded from: classes3.dex */
public final class w implements f.c.c<com.parizene.netmonitor.db.i.d> {

    /* compiled from: AppModule_ProvideBackupLibraryFactory.java */
    private static final class a {
        private static final w a = new w();
    }

    public static w a() {
        return a.a;
    }

    public static com.parizene.netmonitor.db.i.d c() {
        return (com.parizene.netmonitor.db.i.d) f.c.f.c(t.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.db.i.d get() {
        return c();
    }
}