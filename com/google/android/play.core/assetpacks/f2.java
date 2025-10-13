package com.google.android.play.core.assetpacks;

/* loaded from: classes.dex */
final /* synthetic */ class f2 implements e.c.b.d.a.f.b {
    static final e.c.b.d.a.f.b a = new f2();

    private f2() {
    }

    @Override // e.c.b.d.a.f.b
    public final void a(Exception exc) {
        g2.a.e(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
    }
}