package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class gh1 implements zg1<Bundle> {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6113b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6114c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6115d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6116e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6117f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6118g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<String> f6119h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6120i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6121j;

    /* renamed from: k, reason: collision with root package name */
    public final String f6122k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6123l;

    /* renamed from: m, reason: collision with root package name */
    public final String f6124m;
    public final long n;

    public gh1(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList<String> arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j2) {
        this.a = z;
        this.f6113b = z2;
        this.f6114c = str;
        this.f6115d = z3;
        this.f6116e = z4;
        this.f6117f = z5;
        this.f6118g = str2;
        this.f6119h = arrayList;
        this.f6120i = str3;
        this.f6121j = str4;
        this.f6122k = str5;
        this.f6123l = z6;
        this.f6124m = str6;
        this.n = j2;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("cog", this.a);
        bundle2.putBoolean("coh", this.f6113b);
        bundle2.putString("gl", this.f6114c);
        bundle2.putBoolean("simulator", this.f6115d);
        bundle2.putBoolean("is_latchsky", this.f6116e);
        bundle2.putBoolean("is_sidewinder", this.f6117f);
        bundle2.putString("hl", this.f6118g);
        if (!this.f6119h.isEmpty()) {
            bundle2.putStringArrayList("hl_list", this.f6119h);
        }
        bundle2.putString("mv", this.f6120i);
        bundle2.putString("submodel", this.f6124m);
        Bundle bundleA = cq1.a(bundle2, "device");
        bundle2.putBundle("device", bundleA);
        bundleA.putString("build", this.f6122k);
        bundleA.putLong("remaining_data_partition_space", this.n);
        Bundle bundleA2 = cq1.a(bundleA, "browser");
        bundleA.putBundle("browser", bundleA2);
        bundleA2.putBoolean("is_browser_custom_tabs_capable", this.f6123l);
        if (TextUtils.isEmpty(this.f6121j)) {
            return;
        }
        Bundle bundleA3 = cq1.a(bundleA, "play_store");
        bundleA.putBundle("play_store", bundleA3);
        bundleA3.putString("package_version", this.f6121j);
    }
}