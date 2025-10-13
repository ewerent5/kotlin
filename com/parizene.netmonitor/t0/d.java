package com.parizene.netmonitor.t0;

/* compiled from: IntegerStringPref.java */
/* loaded from: classes3.dex */
public class d extends a<Integer> {
    public d(int i2, int i3) {
        super(a.a.getContext().getString(i2), Integer.valueOf(a.a.getContext().getString(i3)));
    }

    public Integer f() {
        try {
            return Integer.valueOf(a.a.a().getString(c(), Integer.toString(a().intValue())));
        } catch (NumberFormatException unused) {
            return a();
        }
    }
}