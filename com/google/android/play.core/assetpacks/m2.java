package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* loaded from: classes.dex */
public final class m2 implements e.c.b.d.a.b.h0<?> {
    private final e.c.b.d.a.b.h0 a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f12086b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f12087c = 0;

    public m2(e.c.b.d.a.b.h0<g2> h0Var, e.c.b.d.a.b.h0<Context> h0Var2) {
        this.a = h0Var;
        this.f12086b = h0Var2;
    }

    public m2(e.c.b.d.a.b.h0<Context> h0Var, e.c.b.d.a.b.h0<v> h0Var2, byte[] bArr) {
        this.f12086b = h0Var;
        this.a = h0Var2;
    }

    public m2(e.c.b.d.a.b.h0<Context> h0Var, e.c.b.d.a.b.h0<o0> h0Var2, char[] cArr) {
        this.a = h0Var;
        this.f12086b = h0Var2;
    }

    public m2(e.c.b.d.a.b.h0<v> h0Var, e.c.b.d.a.b.h0<s2> h0Var2, int[] iArr) {
        this.f12086b = h0Var;
        this.a = h0Var2;
    }

    public m2(e.c.b.d.a.b.h0<Context> h0Var, e.c.b.d.a.b.h0<t1> h0Var2, short[] sArr) {
        this.a = h0Var;
        this.f12086b = h0Var2;
    }

    @Override // e.c.b.d.a.b.h0
    public final /* bridge */ /* synthetic */ Object a() throws PackageManager.NameNotFoundException {
        int i2 = this.f12087c;
        if (i2 == 0) {
            Object objA = this.a.a();
            Context contextA = ((o2) this.f12086b).a();
            g2 g2Var = (g2) objA;
            e.c.b.d.a.b.s.a(contextA.getPackageManager(), new ComponentName(contextA.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
            e.c.b.d.a.b.s.a(contextA.getPackageManager(), new ComponentName(contextA.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
            PlayCoreDialogWrapperActivity.a(contextA);
            e.c.b.d.a.b.s.d(g2Var);
            return g2Var;
        }
        if (i2 == 1) {
            return new a0(((o2) this.f12086b).a(), (v) this.a.a());
        }
        if (i2 == 2) {
            return new o(((o2) this.a).a(), (o0) this.f12086b.a());
        }
        if (i2 == 3) {
            return new v(((o2) this.a).a(), (t1) this.f12086b.a());
        }
        return new v1((v) this.f12086b.a(), e.c.b.d.a.b.g0.c(this.a));
    }
}