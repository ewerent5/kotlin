package com.parizene.netmonitor.t0;

/* compiled from: StringPref.java */
/* loaded from: classes3.dex */
public class h extends a<String> {
    public h(String str, String str2) {
        super(str, str2);
    }

    public void f(String str) {
        a.a.a().edit().putString(c(), str).apply();
    }

    public String g() {
        return a.a.a().getString(c(), a());
    }
}