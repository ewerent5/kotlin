package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
final class x extends f {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Intent f4743e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Activity f4744f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f4745g;

    x(Intent intent, Activity activity, int i2) {
        this.f4743e = intent;
        this.f4744f = activity;
        this.f4745g = i2;
    }

    @Override // com.google.android.gms.common.internal.f
    public final void b() {
        Intent intent = this.f4743e;
        if (intent != null) {
            this.f4744f.startActivityForResult(intent, this.f4745g);
        }
    }
}