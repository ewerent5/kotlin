package com.parizene.netmonitor.t0;

/* compiled from: BooleanPref.java */
/* loaded from: classes3.dex */
public class b extends a<Boolean> {
    public b(int i2, boolean z) {
        super(a.a.getContext().getString(i2), Boolean.valueOf(z));
    }

    public void f(Boolean bool) {
        a.a.a().edit().putBoolean(c(), bool.booleanValue()).apply();
    }

    public Boolean g() {
        return Boolean.valueOf(a.a.a().getBoolean(c(), a().booleanValue()));
    }

    public b(String str, boolean z) {
        super(str, Boolean.valueOf(z));
    }
}