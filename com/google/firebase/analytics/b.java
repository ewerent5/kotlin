package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.h7;
import e.c.b.b.c.e.h;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* loaded from: classes.dex */
final class b implements h7 {
    private final /* synthetic */ h a;

    b(h hVar) {
        this.a = hVar;
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final List<Bundle> a(String str, String str2) {
        return this.a.y(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final Map<String, Object> b(String str, String str2, boolean z) {
        return this.a.g(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final void c(String str) {
        this.a.G(str);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final int d(String str) {
        return this.a.J(str);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final void e(String str, String str2, Bundle bundle) {
        this.a.C(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final void f(String str, String str2, Bundle bundle) {
        this.a.q(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final void w(Bundle bundle) {
        this.a.j(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final String zza() {
        return this.a.O();
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final String zzb() {
        return this.a.Q();
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final String zzc() {
        return this.a.K();
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final String zzd() {
        return this.a.F();
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final long zze() {
        return this.a.L();
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final void zza(String str) {
        this.a.B(str);
    }
}