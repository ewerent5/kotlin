package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ow1 {
    private final wv1 a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f8026b;

    public ow1(wv1 wv1Var, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f8026b = arrayList;
        this.a = wv1Var;
        arrayList.add(str);
    }

    public final void a(String str) {
        this.f8026b.add(str);
    }

    public final wv1 b() {
        return this.a;
    }

    public final ArrayList<String> c() {
        return this.f8026b;
    }
}