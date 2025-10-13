package com.parizene.netmonitor.ui.nps;

import java.util.Arrays;

/* compiled from: NpsStep.kt */
/* loaded from: classes3.dex */
public enum i {
    UNKNOWN,
    OPENED,
    SUBMIT_SCORE_CLICKED,
    SEND_EMAIL_CLICKED,
    OPEN_PLAY_STORE_CLICKED;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static i[] valuesCustom() {
        i[] iVarArrValuesCustom = values();
        return (i[]) Arrays.copyOf(iVarArrValuesCustom, iVarArrValuesCustom.length);
    }
}