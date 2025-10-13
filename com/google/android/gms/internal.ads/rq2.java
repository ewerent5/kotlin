package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rq2 extends pr2 {

    /* renamed from: i, reason: collision with root package name */
    private static final qr2<qw1> f8710i = new qr2<>();

    /* renamed from: j, reason: collision with root package name */
    private final Context f8711j;

    public rq2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3, Context context, vk0 vk0Var) {
        super(gq2Var, "UZTSNWb1zXgw5vjxx2ZhxjLLyqN54Pno04MXjtzCVCMzKVc+OfmNkNnAKjZ08r/h", "BTQuS/+Ue5xwms1CJL1YODGUh5Ur1d+4x5VZpgqRylk=", eu0Var, i2, 27);
        this.f8711j = context;
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        aq0 aq0Var;
        qw1 qw1Var;
        AtomicReference<qw1> atomicReferenceA = f8710i.a(this.f8711j.getPackageName());
        synchronized (atomicReferenceA) {
            qw1 qw1Var2 = atomicReferenceA.get();
            if (qw1Var2 == null || jq2.c(qw1Var2.f8512b) || qw1Var2.f8512b.equals("E") || qw1Var2.f8512b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                String strS0 = null;
                if (jq2.c(null)) {
                    aq0Var = ((!jq2.c(null) ? Boolean.FALSE : Boolean.FALSE).booleanValue() && this.f8253b.j()) ? aq0.ENUM_SIGNAL_SOURCE_GASS : aq0.ENUM_SIGNAL_SOURCE_ADSHIELD;
                } else {
                    aq0Var = aq0.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
                }
                qw1 qw1Var3 = new qw1((String) this.f8257f.invoke(null, this.f8711j, Boolean.valueOf(aq0Var == aq0.ENUM_SIGNAL_SOURCE_ADSHIELD), (Boolean) c.c().b(w3.v1), (String) c.c().b(w3.w1)));
                if (jq2.c(qw1Var3.f8512b) || qw1Var3.f8512b.equals("E")) {
                    int iOrdinal = aq0Var.ordinal();
                    if (iOrdinal == 3) {
                        try {
                            if (this.f8253b.n() != null) {
                                this.f8253b.n().get();
                            }
                            u91 u91VarM = this.f8253b.m();
                            if (u91VarM != null && u91VarM.e0()) {
                                strS0 = u91VarM.s0();
                            }
                        } catch (InterruptedException | ExecutionException unused) {
                        }
                        if (!jq2.c(strS0)) {
                            qw1Var3.f8512b = strS0;
                        }
                    } else if (iOrdinal == 4) {
                        throw null;
                    }
                }
                atomicReferenceA.set(qw1Var3);
            }
            qw1Var = atomicReferenceA.get();
        }
        synchronized (this.f8256e) {
            if (qw1Var != null) {
                this.f8256e.h0(qw1Var.f8512b);
                this.f8256e.n0(qw1Var.f8513c);
                this.f8256e.m0(qw1Var.f8514d);
                this.f8256e.t(qw1Var.f8515e);
                this.f8256e.u(qw1Var.f8516f);
            }
        }
    }
}