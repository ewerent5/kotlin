package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class AssetPackExtractionService extends Service {

    /* renamed from: e, reason: collision with root package name */
    a0 f11926e;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f11926e;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        i1.h(getApplicationContext()).b(this);
    }
}