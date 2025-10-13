package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ba0 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final qp1 f5094b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f5095c;

    /* renamed from: d, reason: collision with root package name */
    private final lp1 f5096d;

    /* synthetic */ ba0(aa0 aa0Var, z90 z90Var) {
        this.a = aa0Var.a;
        this.f5094b = aa0Var.f4881b;
        this.f5095c = aa0Var.f4882c;
        this.f5096d = aa0Var.f4883d;
    }

    final aa0 a() {
        aa0 aa0Var = new aa0();
        aa0Var.a(this.a);
        aa0Var.b(this.f5094b);
        aa0Var.c(this.f5095c);
        return aa0Var;
    }

    final qp1 b() {
        return this.f5094b;
    }

    final lp1 c() {
        return this.f5096d;
    }

    final Bundle d() {
        return this.f5095c;
    }

    final Context e(Context context) {
        return this.a;
    }
}