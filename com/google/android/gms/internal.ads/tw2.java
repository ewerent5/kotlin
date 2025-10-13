package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(16)
/* loaded from: classes.dex */
public final class tw2 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9283b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9284c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9285d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9286e;

    /* renamed from: f, reason: collision with root package name */
    private final MediaCodecInfo.CodecCapabilities f9287f;

    private tw2(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        Objects.requireNonNull(str);
        this.a = str;
        this.f9286e = str2;
        this.f9287f = codecCapabilities;
        boolean z3 = true;
        this.f9283b = !z && codecCapabilities != null && v03.a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.f9284c = codecCapabilities != null && v03.a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (!z2 && (codecCapabilities == null || v03.a < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z3 = false;
        }
        this.f9285d = z3;
    }

    public static tw2 a(String str) {
        return new tw2("OMX.google.raw.decoder", null, null, false, false);
    }

    public static tw2 b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new tw2(str, str2, codecCapabilities, z, z2);
    }

    private final void i(String str) {
        String str2 = this.a;
        String str3 = this.f9286e;
        String str4 = v03.f9616e;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 20 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    @TargetApi(21)
    private static boolean j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        return (d2 == -1.0d || d2 <= 0.0d) ? videoCapabilities.isSizeSupported(i2, i3) : videoCapabilities.areSizeAndRateSupported(i2, i3, d2);
    }

    public final MediaCodecInfo.CodecProfileLevel[] c() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9287f;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean d(String str) {
        if (str == null || this.f9286e == null) {
            return true;
        }
        String strTrim = str.trim();
        String str2 = (strTrim.startsWith("avc1") || strTrim.startsWith("avc3")) ? "video/avc" : (strTrim.startsWith("hev1") || strTrim.startsWith("hvc1")) ? "video/hevc" : strTrim.startsWith("vp9") ? "video/x-vnd.on2.vp9" : strTrim.startsWith("vp8") ? "video/x-vnd.on2.vp8" : strTrim.startsWith("mp4a") ? "audio/mp4a-latm" : (strTrim.startsWith("ac-3") || strTrim.startsWith("dac3")) ? "audio/ac3" : (strTrim.startsWith("ec-3") || strTrim.startsWith("dec3")) ? "audio/eac3" : (strTrim.startsWith("dtsc") || strTrim.startsWith("dtse")) ? "audio/vnd.dts" : (strTrim.startsWith("dtsh") || strTrim.startsWith("dtsl")) ? "audio/vnd.dts.hd" : strTrim.startsWith("opus") ? "audio/opus" : strTrim.startsWith("vorbis") ? "audio/vorbis" : null;
        if (str2 == null) {
            return true;
        }
        if (!this.f9286e.equals(str2)) {
            StringBuilder sb = new StringBuilder(str.length() + 13 + str2.length());
            sb.append("codec.mime ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            i(sb.toString());
            return false;
        }
        Pair<Integer, Integer> pairD = ex2.d(str);
        if (pairD == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : c()) {
            if (codecProfileLevel.profile == ((Integer) pairD.first).intValue() && codecProfileLevel.level >= ((Integer) pairD.second).intValue()) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 22 + str2.length());
        sb2.append("codec.profileLevel, ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        i(sb2.toString());
        return false;
    }

    @TargetApi(21)
    public final boolean e(int i2, int i3, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9287f;
        if (codecCapabilities == null) {
            i("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            i("sizeAndRate.vCaps");
            return false;
        }
        if (j(videoCapabilities, i2, i3, d2)) {
            return true;
        }
        if (i2 >= i3 || !j(videoCapabilities, i3, i2, d2)) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("sizeAndRate.support, ");
            sb.append(i2);
            sb.append("x");
            sb.append(i3);
            sb.append("x");
            sb.append(d2);
            i(sb.toString());
            return false;
        }
        StringBuilder sb2 = new StringBuilder(69);
        sb2.append("sizeAndRate.rotated, ");
        sb2.append(i2);
        sb2.append("x");
        sb2.append(i3);
        sb2.append("x");
        sb2.append(d2);
        String string = sb2.toString();
        String str = this.a;
        String str2 = this.f9286e;
        String str3 = v03.f9616e;
        int length = String.valueOf(string).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb3 = new StringBuilder(length + 25 + length2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb3.append("AssumedSupport [");
        sb3.append(string);
        sb3.append("] [");
        sb3.append(str);
        sb3.append(", ");
        sb3.append(str2);
        sb3.append("] [");
        sb3.append(str3);
        sb3.append("]");
        Log.d("MediaCodecInfo", sb3.toString());
        return true;
    }

    @TargetApi(21)
    public final Point f(int i2, int i3) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9287f;
        if (codecCapabilities == null) {
            i("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            i("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(v03.e(i2, widthAlignment) * widthAlignment, v03.e(i3, heightAlignment) * heightAlignment);
    }

    @TargetApi(21)
    public final boolean g(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9287f;
        if (codecCapabilities == null) {
            i("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            i("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("sampleRate.support, ");
        sb.append(i2);
        i(sb.toString());
        return false;
    }

    @TargetApi(21)
    public final boolean h(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9287f;
        if (codecCapabilities == null) {
            i("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            i("channelCount.aCaps");
            return false;
        }
        if (audioCapabilities.getMaxInputChannelCount() >= i2) {
            return true;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("channelCount.support, ");
        sb.append(i2);
        i(sb.toString());
        return false;
    }
}