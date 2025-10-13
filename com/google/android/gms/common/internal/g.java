package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.k;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class g extends com.google.android.gms.common.internal.w.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<g> CREATOR = new u0();

    /* renamed from: e, reason: collision with root package name */
    final int f4690e;

    /* renamed from: f, reason: collision with root package name */
    final int f4691f;

    /* renamed from: g, reason: collision with root package name */
    int f4692g;

    /* renamed from: h, reason: collision with root package name */
    String f4693h;

    /* renamed from: i, reason: collision with root package name */
    IBinder f4694i;

    /* renamed from: j, reason: collision with root package name */
    Scope[] f4695j;

    /* renamed from: k, reason: collision with root package name */
    Bundle f4696k;

    /* renamed from: l, reason: collision with root package name */
    Account f4697l;

    /* renamed from: m, reason: collision with root package name */
    com.google.android.gms.common.d[] f4698m;
    com.google.android.gms.common.d[] n;
    boolean o;
    int p;
    boolean q;
    private final String r;

    g(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, com.google.android.gms.common.d[] dVarArr, com.google.android.gms.common.d[] dVarArr2, boolean z, int i5, boolean z2, String str2) {
        this.f4690e = i2;
        this.f4691f = i3;
        this.f4692g = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f4693h = "com.google.android.gms";
        } else {
            this.f4693h = str;
        }
        if (i2 < 2) {
            this.f4697l = iBinder != null ? a.Y(k.a.U(iBinder)) : null;
        } else {
            this.f4694i = iBinder;
            this.f4697l = account;
        }
        this.f4695j = scopeArr;
        this.f4696k = bundle;
        this.f4698m = dVarArr;
        this.n = dVarArr2;
        this.o = z;
        this.p = i5;
        this.q = z2;
        this.r = str2;
    }

    @RecentlyNullable
    public final String c() {
        return this.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        u0.a(this, parcel, i2);
    }

    public g(int i2, String str) {
        this.f4690e = 6;
        this.f4692g = com.google.android.gms.common.f.a;
        this.f4691f = i2;
        this.o = true;
        this.r = str;
    }
}