package com.parizene.netmonitor.t0;

/* compiled from: LongStringPref.java */
/* loaded from: classes3.dex */
public class e extends a<Long> {
    public e(int i2, String str) {
        super(a.a.getContext().getString(i2), Long.valueOf(str));
    }

    public Long f() {
        try {
            return Long.valueOf(a.a.a().getString(c(), Long.toString(a().longValue())));
        } catch (NumberFormatException unused) {
            return a();
        }
    }
}