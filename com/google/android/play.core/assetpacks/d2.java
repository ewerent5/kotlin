package com.google.android.play.core.assetpacks;

import java.io.IOException;

/* loaded from: classes.dex */
final /* synthetic */ class d2 implements Runnable {

    /* renamed from: e */
    private final g2 f11966e;

    /* renamed from: f */
    private final /* synthetic */ int f11967f = 1;

    d2(g2 g2Var, byte[] bArr) {
        this.f11966e = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        if (this.f11967f != 0) {
            this.f11966e.c();
        } else {
            this.f11966e.b();
        }
    }
}