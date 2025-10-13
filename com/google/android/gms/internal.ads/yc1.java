package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yc1 implements zg1<Bundle> {
    private final y93 a;

    /* renamed from: b, reason: collision with root package name */
    private final kr f10405b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10406c;

    public yc1(y93 y93Var, kr krVar, boolean z) {
        this.a = y93Var;
        this.f10405b = krVar;
        this.f10406c = z;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.f10405b.f7056g >= ((Integer) c.c().b(w3.u3)).intValue()) {
            bundle2.putString("app_open_version", "2");
        }
        if (((Boolean) c.c().b(w3.v3)).booleanValue()) {
            bundle2.putBoolean("app_switched", this.f10406c);
        }
        y93 y93Var = this.a;
        if (y93Var != null) {
            int i2 = y93Var.f10399e;
            if (i2 == 1) {
                bundle2.putString("avo", "p");
            } else if (i2 == 2) {
                bundle2.putString("avo", "l");
            }
        }
    }
}