package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ic1 implements zg1<Bundle> {
    public final r93 a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6517b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6518c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6519d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6520e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6521f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6522g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6523h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6524i;

    public ic1(r93 r93Var, String str, boolean z, String str2, float f2, int i2, int i3, String str3, boolean z2) {
        com.google.android.gms.common.internal.p.k(r93Var, "the adSize must not be null");
        this.a = r93Var;
        this.f6517b = str;
        this.f6518c = z;
        this.f6519d = str2;
        this.f6520e = f2;
        this.f6521f = i2;
        this.f6522g = i3;
        this.f6523h = str3;
        this.f6524i = z2;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        cq1.b(bundle2, "smart_w", "full", this.a.f8619i == -1);
        cq1.b(bundle2, "smart_h", "auto", this.a.f8616f == -2);
        Boolean bool = Boolean.TRUE;
        cq1.d(bundle2, "ene", bool, this.a.n);
        cq1.b(bundle2, "rafmt", "102", this.a.q);
        cq1.b(bundle2, "rafmt", "103", this.a.r);
        cq1.b(bundle2, "rafmt", "105", this.a.s);
        cq1.d(bundle2, "inline_adaptive_slot", bool, this.f6524i);
        cq1.d(bundle2, "interscroller_slot", bool, this.a.s);
        cq1.e(bundle2, "format", this.f6517b);
        cq1.b(bundle2, "fluid", "height", this.f6518c);
        cq1.b(bundle2, "sz", this.f6519d, !TextUtils.isEmpty(r0));
        bundle2.putFloat("u_sd", this.f6520e);
        bundle2.putInt("sw", this.f6521f);
        bundle2.putInt("sh", this.f6522g);
        String str = this.f6523h;
        cq1.b(bundle2, "sc", str, true ^ TextUtils.isEmpty(str));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        r93[] r93VarArr = this.a.f8621k;
        if (r93VarArr == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("height", this.a.f8616f);
            bundle3.putInt("width", this.a.f8619i);
            bundle3.putBoolean("is_fluid_height", this.a.f8623m);
            arrayList.add(bundle3);
        } else {
            for (r93 r93Var : r93VarArr) {
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("is_fluid_height", r93Var.f8623m);
                bundle4.putInt("height", r93Var.f8616f);
                bundle4.putInt("width", r93Var.f8619i);
                arrayList.add(bundle4);
            }
        }
        bundle2.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}