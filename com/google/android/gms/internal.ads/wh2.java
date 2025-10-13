package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class wh2 implements nz1 {
    final /* synthetic */ hx1 a;

    wh2(wj2 wj2Var, hx1 hx1Var) {
        this.a = hx1Var;
    }

    @Override // com.google.android.gms.internal.ads.nz1
    public final boolean a(File file) {
        try {
            return this.a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}