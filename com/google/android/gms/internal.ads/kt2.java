package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kt2 {
    private static final int[] a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f7075b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f7076c = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f7077d = 0;

    public static xs2 a(o03 o03Var, String str, String str2, wu2 wu2Var) {
        int i2 = f7075b[(o03Var.l() & 192) >> 6];
        int iL = o03Var.l();
        int i3 = f7076c[(iL & 56) >> 3];
        if ((iL & 4) != 0) {
            i3++;
        }
        return xs2.b(str, "audio/ac3", null, -1, -1, i3, i2, null, wu2Var, 0, str2);
    }

    public static xs2 b(o03 o03Var, String str, String str2, wu2 wu2Var) {
        o03Var.j(2);
        int i2 = f7075b[(o03Var.l() & 192) >> 6];
        int iL = o03Var.l();
        int i3 = f7076c[(iL & 14) >> 1];
        if ((iL & 1) != 0) {
            i3++;
        }
        return xs2.b(str, "audio/eac3", null, -1, -1, i3, i2, null, wu2Var, 0, str2);
    }

    public static int c(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }
}