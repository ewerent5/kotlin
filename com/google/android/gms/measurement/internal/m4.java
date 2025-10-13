package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class m4 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11024b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11025c;

    /* renamed from: d, reason: collision with root package name */
    private long f11026d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ i4 f11027e;

    public m4(i4 i4Var, String str, long j2) {
        this.f11027e = i4Var;
        com.google.android.gms.common.internal.p.f(str);
        this.a = str;
        this.f11024b = j2;
    }

    public final long a() {
        if (!this.f11025c) {
            this.f11025c = true;
            this.f11026d = this.f11027e.z().getLong(this.a, this.f11024b);
        }
        return this.f11026d;
    }

    public final void b(long j2) {
        SharedPreferences.Editor editorEdit = this.f11027e.z().edit();
        editorEdit.putLong(this.a, j2);
        editorEdit.apply();
        this.f11026d = j2;
    }
}