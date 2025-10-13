package com.google.android.gms.measurement.internal;

import e.c.b.b.c.e.r0;
import e.c.b.b.c.e.t0;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final /* synthetic */ class na {
    static final /* synthetic */ int[] a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f11066b;

    static {
        int[] iArr = new int[r0.a.values().length];
        f11066b = iArr;
        try {
            iArr[r0.a.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11066b[r0.a.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11066b[r0.a.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f11066b[r0.a.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[t0.b.values().length];
        a = iArr2;
        try {
            iArr2[t0.b.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[t0.b.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[t0.b.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[t0.b.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[t0.b.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[t0.b.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}