package com.bumptech.glide.load.n.a0;

import android.graphics.Bitmap;

/* compiled from: LruPoolStrategy.java */
/* loaded from: classes.dex */
interface l {
    String a(int i2, int i3, Bitmap.Config config);

    int b(Bitmap bitmap);

    void c(Bitmap bitmap);

    Bitmap d(int i2, int i3, Bitmap.Config config);

    String e(Bitmap bitmap);

    Bitmap removeLast();
}