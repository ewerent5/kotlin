package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bo2 extends eo2 {
    final Logger a;

    public bo2(String str) {
        this.a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(String str) {
        this.a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}