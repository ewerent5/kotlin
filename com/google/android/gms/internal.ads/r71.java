package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class r71 implements qg0 {
    private final FileChannel a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8609b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8610c;

    public r71(FileChannel fileChannel, long j2, long j3) {
        this.a = fileChannel;
        this.f8609b = j2;
        this.f8610c = j3;
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final void a(MessageDigest[] messageDigestArr, long j2, int i2) throws IOException {
        MappedByteBuffer map = this.a.map(FileChannel.MapMode.READ_ONLY, this.f8609b + j2, i2);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public final long zza() {
        return this.f8610c;
    }
}