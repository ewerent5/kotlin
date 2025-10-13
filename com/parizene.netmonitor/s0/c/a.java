package com.parizene.netmonitor.s0.c;

import java.util.Arrays;

/* compiled from: BillingStatus.kt */
/* loaded from: classes3.dex */
public enum a {
    UNKNOWN,
    OK,
    ERROR;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        a[] aVarArrValuesCustom = values();
        return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
    }
}