package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zu extends b10 {

    /* renamed from: c, reason: collision with root package name */
    static final zu f10639c = new zu();

    zu() {
    }

    @Override // com.google.android.gms.internal.ads.b10
    public final f50 b(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new h70() : "mvhd".equals(str) ? new i80() : new j90(str);
    }
}