package com.parizene.netmonitor.t0;

/* compiled from: IntegerPref.java */
/* loaded from: classes3.dex */
public class c extends a<Integer> {
    public c(String str, int i2) {
        super(str, Integer.valueOf(i2));
    }

    public void f(Integer num) {
        a.a.a().edit().putInt(c(), num.intValue()).apply();
    }

    public Integer g() {
        return Integer.valueOf(a.a.a().getInt(c(), a().intValue()));
    }
}