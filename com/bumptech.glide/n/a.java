package com.bumptech.glide.n;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* compiled from: GifDecoder.java */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: GifDecoder.java */
    /* renamed from: com.bumptech.glide.n.a$a, reason: collision with other inner class name */
    public interface InterfaceC0099a {
        Bitmap a(int i2, int i3, Bitmap.Config config);

        int[] b(int i2);

        void c(Bitmap bitmap);

        void d(byte[] bArr);

        byte[] e(int i2);

        void f(int[] iArr);
    }

    Bitmap a();

    void b();

    int c();

    void clear();

    int d();

    void e(Bitmap.Config config);

    ByteBuffer f();

    void g();

    int h();

    int i();
}