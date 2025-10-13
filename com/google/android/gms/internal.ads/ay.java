package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ay implements om {
    private File a = null;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f5023b;

    ay(Context context) {
        this.f5023b = context;
    }

    @Override // com.google.android.gms.internal.ads.om
    public final File zza() {
        if (this.a == null) {
            this.a = new File(this.f5023b.getCacheDir(), "volley");
        }
        return this.a;
    }
}