package com.parizene.netmonitor.ui.nps;

import i.y.d.l;

/* compiled from: NpsController.kt */
/* loaded from: classes3.dex */
public final class e {
    public final void a(i iVar) {
        l.d(iVar, "npsStep");
        com.parizene.netmonitor.t0.f.K.f(Integer.valueOf(iVar.ordinal()));
    }

    public final boolean b() {
        i[] iVarArrValuesCustom = i.valuesCustom();
        Integer numG = com.parizene.netmonitor.t0.f.K.g();
        l.c(numG, "NPS_STEP.value()");
        return iVarArrValuesCustom[numG.intValue()] == i.UNKNOWN;
    }
}