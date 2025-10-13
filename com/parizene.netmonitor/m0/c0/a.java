package com.parizene.netmonitor.m0.c0;

import java.util.Arrays;

/* compiled from: CellInfoType.kt */
/* loaded from: classes.dex */
public enum a {
    CDMA,
    GSM,
    WCDMA,
    LTE,
    TDSCDMA,
    NR;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        a[] aVarArrValuesCustom = values();
        return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
    }
}