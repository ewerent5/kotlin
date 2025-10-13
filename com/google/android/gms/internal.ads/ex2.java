package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.ads.AdRequest;
import j$.util.Spliterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes.dex */
public final class ex2 {

    /* renamed from: d, reason: collision with root package name */
    private static final SparseIntArray f5737d;

    /* renamed from: e, reason: collision with root package name */
    private static final SparseIntArray f5738e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map<String, Integer> f5739f;
    private static final tw2 a = tw2.a("OMX.google.raw.decoder");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f5735b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap<zw2, List<tw2>> f5736c = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static int f5740g = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5737d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f5738e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, AdRequest.MAX_CONTENT_URL_LENGTH);
        sparseIntArray2.put(32, Spliterator.IMMUTABLE);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, Spliterator.CONCURRENT);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap map = new HashMap();
        f5739f = map;
        map.put("L30", 1);
        map.put("L60", 4);
        map.put("L63", 16);
        map.put("L90", 64);
        map.put("L93", 256);
        map.put("L120", Integer.valueOf(Spliterator.IMMUTABLE));
        map.put("L123", Integer.valueOf(Spliterator.CONCURRENT));
        map.put("L150", 16384);
        map.put("L153", 65536);
        map.put("L156", 262144);
        map.put("L180", 1048576);
        map.put("L183", 4194304);
        map.put("L186", Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE));
        map.put("H30", 2);
        map.put("H60", 8);
        map.put("H63", 32);
        map.put("H90", 128);
        map.put("H93", Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH));
        map.put("H120", 2048);
        map.put("H123", 8192);
        map.put("H150", 32768);
        map.put("H153", 131072);
        map.put("H156", 524288);
        map.put("H180", 2097152);
        map.put("H183", 8388608);
        map.put("H186", 33554432);
    }

    public static tw2 a(String str, boolean z) {
        List<tw2> listB = b(str, z);
        if (listB.isEmpty()) {
            return null;
        }
        return listB.get(0);
    }

    public static synchronized List<tw2> b(String str, boolean z) {
        zw2 zw2Var = new zw2(str, z);
        HashMap<zw2, List<tw2>> map = f5736c;
        List<tw2> list = map.get(zw2Var);
        if (list != null) {
            return list;
        }
        int i2 = v03.a;
        List<tw2> listE = e(zw2Var, i2 >= 21 ? new dx2(z) : new cx2(null));
        if (z && listE.isEmpty() && i2 >= 21 && i2 <= 23) {
            listE = e(zw2Var, new cx2(null));
            if (!listE.isEmpty()) {
                String str2 = listE.get(0).a;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                sb.append("MediaCodecList API didn't list secure decoder for: ");
                sb.append(str);
                sb.append(". Assuming: ");
                sb.append(str2);
                Log.w("MediaCodecUtil", sb.toString());
            }
        }
        List<tw2> listUnmodifiableList = Collections.unmodifiableList(listE);
        map.put(zw2Var, listUnmodifiableList);
        return listUnmodifiableList;
    }

    public static int c() {
        if (f5740g == -1) {
            int iMax = 0;
            tw2 tw2VarA = a("video/avc", false);
            if (tw2VarA != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrC = tw2VarA.c();
                int length = codecProfileLevelArrC.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i2 = codecProfileLevelArrC[iMax].level;
                    int i3 = 9437184;
                    if (i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 16:
                            case 32:
                                i3 = 101376;
                                break;
                            case 64:
                                i3 = 202752;
                                break;
                            case 128:
                            case 256:
                                i3 = 414720;
                                break;
                            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                                i3 = 921600;
                                break;
                            case Spliterator.IMMUTABLE /* 1024 */:
                                i3 = 1310720;
                                break;
                            case 2048:
                            case Spliterator.CONCURRENT /* 4096 */:
                                i3 = 2097152;
                                break;
                            case 8192:
                                i3 = 2228224;
                                break;
                            case 16384:
                                i3 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i3 = -1;
                                break;
                        }
                    } else {
                        i3 = 25344;
                    }
                    iMax2 = Math.max(i3, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, v03.a >= 21 ? 345600 : 172800);
            }
            f5740g = iMax;
        }
        return f5740g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> d(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ex2.d(java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<com.google.android.gms.internal.ads.tw2> e(com.google.android.gms.internal.ads.zw2 r18, com.google.android.gms.internal.ads.bx2 r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ex2.e(com.google.android.gms.internal.ads.zw2, com.google.android.gms.internal.ads.bx2):java.util.List");
    }
}