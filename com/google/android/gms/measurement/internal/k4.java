package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class k4 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10975b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10976c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10977d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ i4 f10978e;

    public k4(i4 i4Var, String str, boolean z) {
        this.f10978e = i4Var;
        com.google.android.gms.common.internal.p.f(str);
        this.a = str;
        this.f10975b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor editorEdit = this.f10978e.z().edit();
        editorEdit.putBoolean(this.a, z);
        editorEdit.apply();
        this.f10977d = z;
    }

    public final boolean b() {
        if (!this.f10976c) {
            this.f10976c = true;
            this.f10977d = this.f10978e.z().getBoolean(this.a, this.f10975b);
        }
        return this.f10977d;
    }
}