package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mr2 extends pr2 {

    /* renamed from: i, reason: collision with root package name */
    private final View f7534i;

    public mr2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3, View view) {
        super(gq2Var, "/nUAVD6E5149sZYPq78F0SxtCINb4d4P8HJ52kECSRArxECTN1q26bJ2wQ4rH1F5", "ToWTu5sR1jYEliR/iVXRogiAAmKJy3kOi4U3O1i9Y2M=", eu0Var, i2, 57);
        this.f7534i = view;
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        if (this.f7534i != null) {
            Boolean bool = (Boolean) c.c().b(w3.P1);
            kq2 kq2Var = new kq2((String) this.f8257f.invoke(null, this.f7534i, this.f8253b.b().getResources().getDisplayMetrics(), bool));
            s71 s71VarD = t81.D();
            s71VarD.q(kq2Var.f7050b.longValue());
            s71VarD.r(kq2Var.f7051c.longValue());
            s71VarD.s(kq2Var.f7052d.longValue());
            if (bool.booleanValue()) {
                s71VarD.t(kq2Var.f7053e.longValue());
            }
            this.f8256e.E(s71VarD.n());
        }
    }
}