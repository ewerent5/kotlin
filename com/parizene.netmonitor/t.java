package com.parizene.netmonitor;

/* compiled from: FlagUtils.java */
/* loaded from: classes.dex */
public class t {
    public static boolean a(long j2, int i2) {
        return (j2 & (1 << i2)) != 0;
    }

    public static long b(long j2, int i2) {
        return j2 | (1 << i2);
    }
}