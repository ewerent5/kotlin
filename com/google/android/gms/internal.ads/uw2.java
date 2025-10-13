package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class uw2 extends Exception {

    /* renamed from: e, reason: collision with root package name */
    public final String f9580e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9581f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9582g;

    public uw2(xs2 xs2Var, Throwable th, boolean z, int i2) {
        String strValueOf = String.valueOf(xs2Var);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(i2);
        sb.append("], ");
        sb.append(strValueOf);
        super(sb.toString(), th);
        this.f9580e = xs2Var.f10250j;
        this.f9581f = null;
        int iAbs = Math.abs(i2);
        StringBuilder sb2 = new StringBuilder(68);
        sb2.append("com.google.android.exoplayer.MediaCodecTrackRenderer_neg_");
        sb2.append(iAbs);
        this.f9582g = sb2.toString();
    }

    public uw2(xs2 xs2Var, Throwable th, boolean z, String str) {
        String strValueOf = String.valueOf(xs2Var);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + strValueOf.length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(strValueOf);
        super(sb.toString(), th);
        this.f9580e = xs2Var.f10250j;
        this.f9581f = str;
        String diagnosticInfo = null;
        if (v03.a >= 21 && (th instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.f9582g = diagnosticInfo;
    }
}