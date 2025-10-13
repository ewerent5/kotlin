package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class o4 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11079b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11080c;

    /* renamed from: d, reason: collision with root package name */
    private String f11081d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ i4 f11082e;

    public o4(i4 i4Var, String str, String str2) {
        this.f11082e = i4Var;
        com.google.android.gms.common.internal.p.f(str);
        this.a = str;
        this.f11079b = null;
    }

    public final String a() {
        if (!this.f11080c) {
            this.f11080c = true;
            this.f11081d = this.f11082e.z().getString(this.a, null);
        }
        return this.f11081d;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f11082e.z().edit();
        editorEdit.putString(this.a, str);
        editorEdit.apply();
        this.f11081d = str;
    }
}