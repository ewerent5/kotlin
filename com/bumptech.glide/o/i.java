package com.bumptech.glide.o;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: FirstFrameAndAfterTrimMemoryWaiter.java */
/* loaded from: classes.dex */
final class i implements k, ComponentCallbacks2 {
    i() {
    }

    @Override // com.bumptech.glide.o.k
    public void a(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(20);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
    }
}