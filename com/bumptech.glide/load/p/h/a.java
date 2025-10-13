package com.bumptech.glide.load.p.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.k;
import com.bumptech.glide.n.a;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: classes.dex */
public class a implements k<ByteBuffer, c> {
    private static final C0097a a = new C0097a();

    /* renamed from: b, reason: collision with root package name */
    private static final b f4027b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final Context f4028c;

    /* renamed from: d, reason: collision with root package name */
    private final List<ImageHeaderParser> f4029d;

    /* renamed from: e, reason: collision with root package name */
    private final b f4030e;

    /* renamed from: f, reason: collision with root package name */
    private final C0097a f4031f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.p.h.b f4032g;

    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: com.bumptech.glide.load.p.h.a$a, reason: collision with other inner class name */
    static class C0097a {
        C0097a() {
        }

        com.bumptech.glide.n.a a(a.InterfaceC0099a interfaceC0099a, com.bumptech.glide.n.c cVar, ByteBuffer byteBuffer, int i2) {
            return new com.bumptech.glide.n.e(interfaceC0099a, cVar, byteBuffer, i2);
        }
    }

    /* compiled from: ByteBufferGifDecoder.java */
    static class b {
        private final Queue<com.bumptech.glide.n.d> a = com.bumptech.glide.t.k.e(0);

        b() {
        }

        synchronized com.bumptech.glide.n.d a(ByteBuffer byteBuffer) {
            com.bumptech.glide.n.d dVarPoll;
            dVarPoll = this.a.poll();
            if (dVarPoll == null) {
                dVarPoll = new com.bumptech.glide.n.d();
            }
            return dVarPoll.p(byteBuffer);
        }

        synchronized void b(com.bumptech.glide.n.d dVar) {
            dVar.a();
            this.a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.n.a0.e eVar, com.bumptech.glide.load.n.a0.b bVar) {
        this(context, list, eVar, bVar, f4027b, a);
    }

    private e c(ByteBuffer byteBuffer, int i2, int i3, com.bumptech.glide.n.d dVar, com.bumptech.glide.load.i iVar) {
        long jB = com.bumptech.glide.t.f.b();
        try {
            com.bumptech.glide.n.c cVarC = dVar.c();
            if (cVarC.b() > 0 && cVarC.c() == 0) {
                Bitmap.Config config = iVar.c(i.a) == com.bumptech.glide.load.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                com.bumptech.glide.n.a aVarA = this.f4031f.a(this.f4032g, cVarC, byteBuffer, e(cVarC, i2, i3));
                aVarA.e(config);
                aVarA.b();
                Bitmap bitmapA = aVarA.a();
                if (bitmapA == null) {
                    return null;
                }
                e eVar = new e(new c(this.f4028c, aVarA, com.bumptech.glide.load.p.c.c(), i2, i3, bitmapA));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + com.bumptech.glide.t.f.a(jB));
                }
                return eVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + com.bumptech.glide.t.f.a(jB));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + com.bumptech.glide.t.f.a(jB));
            }
        }
    }

    private static int e(com.bumptech.glide.n.c cVar, int i2, int i3) {
        int iMin = Math.min(cVar.a() / i3, cVar.d() / i2);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i2 + "x" + i3 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return iMax;
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e b(ByteBuffer byteBuffer, int i2, int i3, com.bumptech.glide.load.i iVar) {
        com.bumptech.glide.n.d dVarA = this.f4030e.a(byteBuffer);
        try {
            return c(byteBuffer, i2, i3, dVarA, iVar);
        } finally {
            this.f4030e.b(dVarA);
        }
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, com.bumptech.glide.load.i iVar) {
        return !((Boolean) iVar.c(i.f4061b)).booleanValue() && com.bumptech.glide.load.f.f(this.f4029d, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.n.a0.e eVar, com.bumptech.glide.load.n.a0.b bVar, b bVar2, C0097a c0097a) {
        this.f4028c = context.getApplicationContext();
        this.f4029d = list;
        this.f4031f = c0097a;
        this.f4032g = new com.bumptech.glide.load.p.h.b(eVar, bVar);
        this.f4030e = bVar2;
    }
}