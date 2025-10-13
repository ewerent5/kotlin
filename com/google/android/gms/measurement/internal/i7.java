package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class i7 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f10948e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Uri f10949f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f10950g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ String f10951h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ e7 f10952i;

    i7(e7 e7Var, boolean z, Uri uri, String str, String str2) {
        this.f10952i = e7Var;
        this.f10948e = z;
        this.f10949f = uri;
        this.f10950g = str;
        this.f10951h = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10952i.b(this.f10948e, this.f10949f, this.f10950g, this.f10951h);
    }
}