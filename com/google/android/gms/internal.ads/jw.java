package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class jw implements u42<Map<String, String>> {
    final /* synthetic */ List a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f6862b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f6863c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ lw f6864d;

    jw(lw lwVar, List list, String str, Uri uri) {
        this.f6864d = lwVar;
        this.a = list;
        this.f6862b = str;
        this.f6863c = uri;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        String strValueOf = String.valueOf(this.f6863c);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 33);
        sb.append("Failed to parse gmsg params for: ");
        sb.append(strValueOf);
        er.zzi(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(Map<String, String> map) {
        this.f6864d.z(map, this.a, this.f6862b);
    }
}