package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import e.c.b.b.c.e.ec;
import e.c.b.b.c.e.g1;
import e.c.b.b.c.e.gb;
import e.c.b.b.c.e.j1;
import e.c.b.b.c.e.k1;
import e.c.b.b.c.e.pd;
import e.c.b.b.c.e.qd;
import e.c.b.b.c.e.yc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public class t9 implements z5 {
    private static volatile t9 a;
    private final ga A;

    /* renamed from: b */
    private u4 f11245b;

    /* renamed from: c */
    private c4 f11246c;

    /* renamed from: d */
    private g f11247d;

    /* renamed from: e */
    private g4 f11248e;

    /* renamed from: f */
    private p9 f11249f;

    /* renamed from: g */
    private oa f11250g;

    /* renamed from: h */
    private final z9 f11251h;

    /* renamed from: i */
    private o7 f11252i;

    /* renamed from: j */
    private y8 f11253j;

    /* renamed from: k */
    private final z4 f11254k;

    /* renamed from: l */
    private boolean f11255l;

    /* renamed from: m */
    private boolean f11256m;
    private long n;
    private List<Runnable> o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private FileLock u;
    private FileChannel v;
    private List<Long> w;
    private List<Long> x;
    private long y;
    private final Map<String, d> z;

    /* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
    private class a implements i {
        e.c.b.b.c.e.k1 a;

        /* renamed from: b */
        List<Long> f11257b;

        /* renamed from: c */
        List<e.c.b.b.c.e.g1> f11258c;

        /* renamed from: d */
        private long f11259d;

        private a() {
        }

        private static long c(e.c.b.b.c.e.g1 g1Var) {
            return ((g1Var.T() / 1000) / 60) / 60;
        }

        @Override // com.google.android.gms.measurement.internal.i
        public final boolean a(long j2, e.c.b.b.c.e.g1 g1Var) {
            com.google.android.gms.common.internal.p.j(g1Var);
            if (this.f11258c == null) {
                this.f11258c = new ArrayList();
            }
            if (this.f11257b == null) {
                this.f11257b = new ArrayList();
            }
            if (this.f11258c.size() > 0 && c(this.f11258c.get(0)) != c(g1Var)) {
                return false;
            }
            long jB = this.f11259d + g1Var.b();
            if (jB >= Math.max(0, t.f11226j.a(null).intValue())) {
                return false;
            }
            this.f11259d = jB;
            this.f11258c.add(g1Var);
            this.f11257b.add(Long.valueOf(j2));
            return this.f11258c.size() < Math.max(1, t.f11227k.a(null).intValue());
        }

        @Override // com.google.android.gms.measurement.internal.i
        public final void b(e.c.b.b.c.e.k1 k1Var) {
            com.google.android.gms.common.internal.p.j(k1Var);
            this.a = k1Var;
        }

        /* synthetic */ a(t9 t9Var, s9 s9Var) {
            this();
        }
    }

    private t9(aa aaVar) {
        this(aaVar, null);
    }

    private final boolean A(g1.a aVar, g1.a aVar2) {
        com.google.android.gms.common.internal.p.a("_e".equals(aVar.D()));
        Z();
        e.c.b.b.c.e.i1 i1VarW = z9.w((e.c.b.b.c.e.g1) ((e.c.b.b.c.e.o7) aVar.zzy()), "_sc");
        String strP = i1VarW == null ? null : i1VarW.P();
        Z();
        e.c.b.b.c.e.i1 i1VarW2 = z9.w((e.c.b.b.c.e.g1) ((e.c.b.b.c.e.o7) aVar2.zzy()), "_pc");
        String strP2 = i1VarW2 != null ? i1VarW2.P() : null;
        if (strP2 == null || !strP2.equals(strP)) {
            return false;
        }
        J(aVar, aVar2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:1107:0x0c64 A[Catch: all -> 0x1009, TryCatch #3 {all -> 0x1009, blocks: (B:655:0x000f, B:669:0x007f, B:760:0x026a, B:762:0x026e, B:768:0x027a, B:769:0x02a1, B:772:0x02b9, B:775:0x02df, B:777:0x0316, B:783:0x032c, B:785:0x0336, B:985:0x0932, B:787:0x0360, B:789:0x0366, B:791:0x037c, B:793:0x038a, B:796:0x03aa, B:798:0x03b0, B:800:0x03c0, B:802:0x03ce, B:804:0x03de, B:805:0x03ed, B:807:0x03f2, B:810:0x0408, B:840:0x046c, B:843:0x0476, B:845:0x0484, B:850:0x04d2, B:846:0x04a3, B:848:0x04b1, B:854:0x04df, B:857:0x0514, B:858:0x0542, B:860:0x0576, B:862:0x057c, B:884:0x064c, B:885:0x0658, B:888:0x0662, B:894:0x0685, B:891:0x0674, B:897:0x068b, B:899:0x0697, B:901:0x06a3, B:917:0x06f2, B:920:0x070f, B:922:0x0723, B:924:0x072d, B:927:0x0740, B:929:0x0754, B:931:0x0762, B:975:0x08b9, B:977:0x08c3, B:979:0x08c9, B:980:0x08e3, B:982:0x08f6, B:983:0x0910, B:984:0x0918, B:936:0x0780, B:938:0x078e, B:941:0x07a3, B:943:0x07b7, B:945:0x07c5, B:948:0x07d7, B:950:0x07ef, B:952:0x07fb, B:955:0x080e, B:957:0x0822, B:959:0x086d, B:961:0x0874, B:963:0x087a, B:965:0x0884, B:967:0x088b, B:969:0x0891, B:971:0x089b, B:972:0x08ab, B:905:0x06c4, B:909:0x06d8, B:911:0x06de, B:914:0x06e9, B:865:0x0588, B:867:0x05bd, B:868:0x05da, B:870:0x05e0, B:872:0x05ee, B:876:0x0602, B:873:0x05f7, B:879:0x0609, B:881:0x0610, B:882:0x062f, B:817:0x042a, B:820:0x0434, B:823:0x043e, B:990:0x094e, B:992:0x095c, B:994:0x0965, B:1005:0x0997, B:995:0x096d, B:997:0x0976, B:999:0x097c, B:1002:0x0988, B:1004:0x0992, B:1008:0x099e, B:1009:0x09aa, B:1011:0x09b0, B:1017:0x09c9, B:1018:0x09d4, B:1023:0x09e1, B:1027:0x0a08, B:1029:0x0a27, B:1031:0x0a35, B:1033:0x0a3b, B:1035:0x0a45, B:1036:0x0a77, B:1038:0x0a7d, B:1040:0x0a8b, B:1044:0x0a96, B:1041:0x0a90, B:1045:0x0a99, B:1046:0x0aa8, B:1048:0x0aae, B:1050:0x0abe, B:1051:0x0ac5, B:1053:0x0ad1, B:1054:0x0ad8, B:1055:0x0adb, B:1057:0x0ae1, B:1059:0x0af3, B:1060:0x0af6, B:1068:0x0b66, B:1070:0x0b81, B:1071:0x0b92, B:1073:0x0b96, B:1075:0x0ba2, B:1076:0x0baa, B:1078:0x0bae, B:1080:0x0bb4, B:1081:0x0bc2, B:1082:0x0bcd, B:1088:0x0c0e, B:1089:0x0c16, B:1091:0x0c1c, B:1093:0x0c2e, B:1095:0x0c3c, B:1097:0x0c40, B:1099:0x0c4a, B:1101:0x0c4e, B:1107:0x0c64, B:1110:0x0c7a, B:1024:0x09e6, B:1026:0x09ec, B:701:0x0125, B:719:0x01c0, B:727:0x01f8, B:734:0x0216, B:759:0x0267, B:743:0x0237, B:694:0x00dd, B:704:0x012d), top: B:1237:0x000f, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:1108:0x0c77  */
    /* JADX WARN: Removed duplicated region for block: B:1110:0x0c7a A[Catch: all -> 0x1009, TRY_LEAVE, TryCatch #3 {all -> 0x1009, blocks: (B:655:0x000f, B:669:0x007f, B:760:0x026a, B:762:0x026e, B:768:0x027a, B:769:0x02a1, B:772:0x02b9, B:775:0x02df, B:777:0x0316, B:783:0x032c, B:785:0x0336, B:985:0x0932, B:787:0x0360, B:789:0x0366, B:791:0x037c, B:793:0x038a, B:796:0x03aa, B:798:0x03b0, B:800:0x03c0, B:802:0x03ce, B:804:0x03de, B:805:0x03ed, B:807:0x03f2, B:810:0x0408, B:840:0x046c, B:843:0x0476, B:845:0x0484, B:850:0x04d2, B:846:0x04a3, B:848:0x04b1, B:854:0x04df, B:857:0x0514, B:858:0x0542, B:860:0x0576, B:862:0x057c, B:884:0x064c, B:885:0x0658, B:888:0x0662, B:894:0x0685, B:891:0x0674, B:897:0x068b, B:899:0x0697, B:901:0x06a3, B:917:0x06f2, B:920:0x070f, B:922:0x0723, B:924:0x072d, B:927:0x0740, B:929:0x0754, B:931:0x0762, B:975:0x08b9, B:977:0x08c3, B:979:0x08c9, B:980:0x08e3, B:982:0x08f6, B:983:0x0910, B:984:0x0918, B:936:0x0780, B:938:0x078e, B:941:0x07a3, B:943:0x07b7, B:945:0x07c5, B:948:0x07d7, B:950:0x07ef, B:952:0x07fb, B:955:0x080e, B:957:0x0822, B:959:0x086d, B:961:0x0874, B:963:0x087a, B:965:0x0884, B:967:0x088b, B:969:0x0891, B:971:0x089b, B:972:0x08ab, B:905:0x06c4, B:909:0x06d8, B:911:0x06de, B:914:0x06e9, B:865:0x0588, B:867:0x05bd, B:868:0x05da, B:870:0x05e0, B:872:0x05ee, B:876:0x0602, B:873:0x05f7, B:879:0x0609, B:881:0x0610, B:882:0x062f, B:817:0x042a, B:820:0x0434, B:823:0x043e, B:990:0x094e, B:992:0x095c, B:994:0x0965, B:1005:0x0997, B:995:0x096d, B:997:0x0976, B:999:0x097c, B:1002:0x0988, B:1004:0x0992, B:1008:0x099e, B:1009:0x09aa, B:1011:0x09b0, B:1017:0x09c9, B:1018:0x09d4, B:1023:0x09e1, B:1027:0x0a08, B:1029:0x0a27, B:1031:0x0a35, B:1033:0x0a3b, B:1035:0x0a45, B:1036:0x0a77, B:1038:0x0a7d, B:1040:0x0a8b, B:1044:0x0a96, B:1041:0x0a90, B:1045:0x0a99, B:1046:0x0aa8, B:1048:0x0aae, B:1050:0x0abe, B:1051:0x0ac5, B:1053:0x0ad1, B:1054:0x0ad8, B:1055:0x0adb, B:1057:0x0ae1, B:1059:0x0af3, B:1060:0x0af6, B:1068:0x0b66, B:1070:0x0b81, B:1071:0x0b92, B:1073:0x0b96, B:1075:0x0ba2, B:1076:0x0baa, B:1078:0x0bae, B:1080:0x0bb4, B:1081:0x0bc2, B:1082:0x0bcd, B:1088:0x0c0e, B:1089:0x0c16, B:1091:0x0c1c, B:1093:0x0c2e, B:1095:0x0c3c, B:1097:0x0c40, B:1099:0x0c4a, B:1101:0x0c4e, B:1107:0x0c64, B:1110:0x0c7a, B:1024:0x09e6, B:1026:0x09ec, B:701:0x0125, B:719:0x01c0, B:727:0x01f8, B:734:0x0216, B:759:0x0267, B:743:0x0237, B:694:0x00dd, B:704:0x012d), top: B:1237:0x000f, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:1112:0x0ca1 A[Catch: all -> 0x0fe8, TRY_ENTER, TryCatch #1 {all -> 0x0fe8, blocks: (B:1062:0x0b33, B:1063:0x0b48, B:1065:0x0b4e, B:1153:0x0e19, B:1084:0x0bd8, B:1112:0x0ca1, B:1114:0x0cad, B:1116:0x0cc1, B:1117:0x0cff, B:1121:0x0d17, B:1123:0x0d1e, B:1125:0x0d2f, B:1127:0x0d33, B:1129:0x0d37, B:1131:0x0d3b, B:1132:0x0d47, B:1133:0x0d4c, B:1135:0x0d52, B:1137:0x0d71, B:1138:0x0d7a, B:1152:0x0e16, B:1139:0x0d8e, B:1141:0x0d95, B:1145:0x0db7, B:1147:0x0de1, B:1148:0x0dec, B:1149:0x0dfe, B:1151:0x0e08, B:1142:0x0d9e, B:1154:0x0e23, B:1156:0x0e30, B:1157:0x0e37, B:1158:0x0e3f, B:1160:0x0e45, B:1163:0x0e5d), top: B:1235:0x0b33 }] */
    /* JADX WARN: Removed duplicated region for block: B:1219:0x0fec  */
    /* JADX WARN: Removed duplicated region for block: B:1239:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:700:0x0114 A[Catch: SQLiteException -> 0x023e, all -> 0x0ffd, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x023e, blocks: (B:672:0x0087, B:698:0x00ec, B:700:0x0114, B:703:0x0129, B:704:0x012d, B:705:0x013f, B:707:0x0145), top: B:1240:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:759:0x0267 A[Catch: all -> 0x1009, TRY_ENTER, TryCatch #3 {all -> 0x1009, blocks: (B:655:0x000f, B:669:0x007f, B:760:0x026a, B:762:0x026e, B:768:0x027a, B:769:0x02a1, B:772:0x02b9, B:775:0x02df, B:777:0x0316, B:783:0x032c, B:785:0x0336, B:985:0x0932, B:787:0x0360, B:789:0x0366, B:791:0x037c, B:793:0x038a, B:796:0x03aa, B:798:0x03b0, B:800:0x03c0, B:802:0x03ce, B:804:0x03de, B:805:0x03ed, B:807:0x03f2, B:810:0x0408, B:840:0x046c, B:843:0x0476, B:845:0x0484, B:850:0x04d2, B:846:0x04a3, B:848:0x04b1, B:854:0x04df, B:857:0x0514, B:858:0x0542, B:860:0x0576, B:862:0x057c, B:884:0x064c, B:885:0x0658, B:888:0x0662, B:894:0x0685, B:891:0x0674, B:897:0x068b, B:899:0x0697, B:901:0x06a3, B:917:0x06f2, B:920:0x070f, B:922:0x0723, B:924:0x072d, B:927:0x0740, B:929:0x0754, B:931:0x0762, B:975:0x08b9, B:977:0x08c3, B:979:0x08c9, B:980:0x08e3, B:982:0x08f6, B:983:0x0910, B:984:0x0918, B:936:0x0780, B:938:0x078e, B:941:0x07a3, B:943:0x07b7, B:945:0x07c5, B:948:0x07d7, B:950:0x07ef, B:952:0x07fb, B:955:0x080e, B:957:0x0822, B:959:0x086d, B:961:0x0874, B:963:0x087a, B:965:0x0884, B:967:0x088b, B:969:0x0891, B:971:0x089b, B:972:0x08ab, B:905:0x06c4, B:909:0x06d8, B:911:0x06de, B:914:0x06e9, B:865:0x0588, B:867:0x05bd, B:868:0x05da, B:870:0x05e0, B:872:0x05ee, B:876:0x0602, B:873:0x05f7, B:879:0x0609, B:881:0x0610, B:882:0x062f, B:817:0x042a, B:820:0x0434, B:823:0x043e, B:990:0x094e, B:992:0x095c, B:994:0x0965, B:1005:0x0997, B:995:0x096d, B:997:0x0976, B:999:0x097c, B:1002:0x0988, B:1004:0x0992, B:1008:0x099e, B:1009:0x09aa, B:1011:0x09b0, B:1017:0x09c9, B:1018:0x09d4, B:1023:0x09e1, B:1027:0x0a08, B:1029:0x0a27, B:1031:0x0a35, B:1033:0x0a3b, B:1035:0x0a45, B:1036:0x0a77, B:1038:0x0a7d, B:1040:0x0a8b, B:1044:0x0a96, B:1041:0x0a90, B:1045:0x0a99, B:1046:0x0aa8, B:1048:0x0aae, B:1050:0x0abe, B:1051:0x0ac5, B:1053:0x0ad1, B:1054:0x0ad8, B:1055:0x0adb, B:1057:0x0ae1, B:1059:0x0af3, B:1060:0x0af6, B:1068:0x0b66, B:1070:0x0b81, B:1071:0x0b92, B:1073:0x0b96, B:1075:0x0ba2, B:1076:0x0baa, B:1078:0x0bae, B:1080:0x0bb4, B:1081:0x0bc2, B:1082:0x0bcd, B:1088:0x0c0e, B:1089:0x0c16, B:1091:0x0c1c, B:1093:0x0c2e, B:1095:0x0c3c, B:1097:0x0c40, B:1099:0x0c4a, B:1101:0x0c4e, B:1107:0x0c64, B:1110:0x0c7a, B:1024:0x09e6, B:1026:0x09ec, B:701:0x0125, B:719:0x01c0, B:727:0x01f8, B:734:0x0216, B:759:0x0267, B:743:0x0237, B:694:0x00dd, B:704:0x012d), top: B:1237:0x000f, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:762:0x026e A[Catch: all -> 0x1009, TryCatch #3 {all -> 0x1009, blocks: (B:655:0x000f, B:669:0x007f, B:760:0x026a, B:762:0x026e, B:768:0x027a, B:769:0x02a1, B:772:0x02b9, B:775:0x02df, B:777:0x0316, B:783:0x032c, B:785:0x0336, B:985:0x0932, B:787:0x0360, B:789:0x0366, B:791:0x037c, B:793:0x038a, B:796:0x03aa, B:798:0x03b0, B:800:0x03c0, B:802:0x03ce, B:804:0x03de, B:805:0x03ed, B:807:0x03f2, B:810:0x0408, B:840:0x046c, B:843:0x0476, B:845:0x0484, B:850:0x04d2, B:846:0x04a3, B:848:0x04b1, B:854:0x04df, B:857:0x0514, B:858:0x0542, B:860:0x0576, B:862:0x057c, B:884:0x064c, B:885:0x0658, B:888:0x0662, B:894:0x0685, B:891:0x0674, B:897:0x068b, B:899:0x0697, B:901:0x06a3, B:917:0x06f2, B:920:0x070f, B:922:0x0723, B:924:0x072d, B:927:0x0740, B:929:0x0754, B:931:0x0762, B:975:0x08b9, B:977:0x08c3, B:979:0x08c9, B:980:0x08e3, B:982:0x08f6, B:983:0x0910, B:984:0x0918, B:936:0x0780, B:938:0x078e, B:941:0x07a3, B:943:0x07b7, B:945:0x07c5, B:948:0x07d7, B:950:0x07ef, B:952:0x07fb, B:955:0x080e, B:957:0x0822, B:959:0x086d, B:961:0x0874, B:963:0x087a, B:965:0x0884, B:967:0x088b, B:969:0x0891, B:971:0x089b, B:972:0x08ab, B:905:0x06c4, B:909:0x06d8, B:911:0x06de, B:914:0x06e9, B:865:0x0588, B:867:0x05bd, B:868:0x05da, B:870:0x05e0, B:872:0x05ee, B:876:0x0602, B:873:0x05f7, B:879:0x0609, B:881:0x0610, B:882:0x062f, B:817:0x042a, B:820:0x0434, B:823:0x043e, B:990:0x094e, B:992:0x095c, B:994:0x0965, B:1005:0x0997, B:995:0x096d, B:997:0x0976, B:999:0x097c, B:1002:0x0988, B:1004:0x0992, B:1008:0x099e, B:1009:0x09aa, B:1011:0x09b0, B:1017:0x09c9, B:1018:0x09d4, B:1023:0x09e1, B:1027:0x0a08, B:1029:0x0a27, B:1031:0x0a35, B:1033:0x0a3b, B:1035:0x0a45, B:1036:0x0a77, B:1038:0x0a7d, B:1040:0x0a8b, B:1044:0x0a96, B:1041:0x0a90, B:1045:0x0a99, B:1046:0x0aa8, B:1048:0x0aae, B:1050:0x0abe, B:1051:0x0ac5, B:1053:0x0ad1, B:1054:0x0ad8, B:1055:0x0adb, B:1057:0x0ae1, B:1059:0x0af3, B:1060:0x0af6, B:1068:0x0b66, B:1070:0x0b81, B:1071:0x0b92, B:1073:0x0b96, B:1075:0x0ba2, B:1076:0x0baa, B:1078:0x0bae, B:1080:0x0bb4, B:1081:0x0bc2, B:1082:0x0bcd, B:1088:0x0c0e, B:1089:0x0c16, B:1091:0x0c1c, B:1093:0x0c2e, B:1095:0x0c3c, B:1097:0x0c40, B:1099:0x0c4a, B:1101:0x0c4e, B:1107:0x0c64, B:1110:0x0c7a, B:1024:0x09e6, B:1026:0x09ec, B:701:0x0125, B:719:0x01c0, B:727:0x01f8, B:734:0x0216, B:759:0x0267, B:743:0x0237, B:694:0x00dd, B:704:0x012d), top: B:1237:0x000f, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:766:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:768:0x027a A[Catch: all -> 0x1009, TryCatch #3 {all -> 0x1009, blocks: (B:655:0x000f, B:669:0x007f, B:760:0x026a, B:762:0x026e, B:768:0x027a, B:769:0x02a1, B:772:0x02b9, B:775:0x02df, B:777:0x0316, B:783:0x032c, B:785:0x0336, B:985:0x0932, B:787:0x0360, B:789:0x0366, B:791:0x037c, B:793:0x038a, B:796:0x03aa, B:798:0x03b0, B:800:0x03c0, B:802:0x03ce, B:804:0x03de, B:805:0x03ed, B:807:0x03f2, B:810:0x0408, B:840:0x046c, B:843:0x0476, B:845:0x0484, B:850:0x04d2, B:846:0x04a3, B:848:0x04b1, B:854:0x04df, B:857:0x0514, B:858:0x0542, B:860:0x0576, B:862:0x057c, B:884:0x064c, B:885:0x0658, B:888:0x0662, B:894:0x0685, B:891:0x0674, B:897:0x068b, B:899:0x0697, B:901:0x06a3, B:917:0x06f2, B:920:0x070f, B:922:0x0723, B:924:0x072d, B:927:0x0740, B:929:0x0754, B:931:0x0762, B:975:0x08b9, B:977:0x08c3, B:979:0x08c9, B:980:0x08e3, B:982:0x08f6, B:983:0x0910, B:984:0x0918, B:936:0x0780, B:938:0x078e, B:941:0x07a3, B:943:0x07b7, B:945:0x07c5, B:948:0x07d7, B:950:0x07ef, B:952:0x07fb, B:955:0x080e, B:957:0x0822, B:959:0x086d, B:961:0x0874, B:963:0x087a, B:965:0x0884, B:967:0x088b, B:969:0x0891, B:971:0x089b, B:972:0x08ab, B:905:0x06c4, B:909:0x06d8, B:911:0x06de, B:914:0x06e9, B:865:0x0588, B:867:0x05bd, B:868:0x05da, B:870:0x05e0, B:872:0x05ee, B:876:0x0602, B:873:0x05f7, B:879:0x0609, B:881:0x0610, B:882:0x062f, B:817:0x042a, B:820:0x0434, B:823:0x043e, B:990:0x094e, B:992:0x095c, B:994:0x0965, B:1005:0x0997, B:995:0x096d, B:997:0x0976, B:999:0x097c, B:1002:0x0988, B:1004:0x0992, B:1008:0x099e, B:1009:0x09aa, B:1011:0x09b0, B:1017:0x09c9, B:1018:0x09d4, B:1023:0x09e1, B:1027:0x0a08, B:1029:0x0a27, B:1031:0x0a35, B:1033:0x0a3b, B:1035:0x0a45, B:1036:0x0a77, B:1038:0x0a7d, B:1040:0x0a8b, B:1044:0x0a96, B:1041:0x0a90, B:1045:0x0a99, B:1046:0x0aa8, B:1048:0x0aae, B:1050:0x0abe, B:1051:0x0ac5, B:1053:0x0ad1, B:1054:0x0ad8, B:1055:0x0adb, B:1057:0x0ae1, B:1059:0x0af3, B:1060:0x0af6, B:1068:0x0b66, B:1070:0x0b81, B:1071:0x0b92, B:1073:0x0b96, B:1075:0x0ba2, B:1076:0x0baa, B:1078:0x0bae, B:1080:0x0bb4, B:1081:0x0bc2, B:1082:0x0bcd, B:1088:0x0c0e, B:1089:0x0c16, B:1091:0x0c1c, B:1093:0x0c2e, B:1095:0x0c3c, B:1097:0x0c40, B:1099:0x0c4a, B:1101:0x0c4e, B:1107:0x0c64, B:1110:0x0c7a, B:1024:0x09e6, B:1026:0x09ec, B:701:0x0125, B:719:0x01c0, B:727:0x01f8, B:734:0x0216, B:759:0x0267, B:743:0x0237, B:694:0x00dd, B:704:0x012d), top: B:1237:0x000f, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:826:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:828:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:835:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:884:0x064c A[Catch: all -> 0x1009, TryCatch #3 {all -> 0x1009, blocks: (B:655:0x000f, B:669:0x007f, B:760:0x026a, B:762:0x026e, B:768:0x027a, B:769:0x02a1, B:772:0x02b9, B:775:0x02df, B:777:0x0316, B:783:0x032c, B:785:0x0336, B:985:0x0932, B:787:0x0360, B:789:0x0366, B:791:0x037c, B:793:0x038a, B:796:0x03aa, B:798:0x03b0, B:800:0x03c0, B:802:0x03ce, B:804:0x03de, B:805:0x03ed, B:807:0x03f2, B:810:0x0408, B:840:0x046c, B:843:0x0476, B:845:0x0484, B:850:0x04d2, B:846:0x04a3, B:848:0x04b1, B:854:0x04df, B:857:0x0514, B:858:0x0542, B:860:0x0576, B:862:0x057c, B:884:0x064c, B:885:0x0658, B:888:0x0662, B:894:0x0685, B:891:0x0674, B:897:0x068b, B:899:0x0697, B:901:0x06a3, B:917:0x06f2, B:920:0x070f, B:922:0x0723, B:924:0x072d, B:927:0x0740, B:929:0x0754, B:931:0x0762, B:975:0x08b9, B:977:0x08c3, B:979:0x08c9, B:980:0x08e3, B:982:0x08f6, B:983:0x0910, B:984:0x0918, B:936:0x0780, B:938:0x078e, B:941:0x07a3, B:943:0x07b7, B:945:0x07c5, B:948:0x07d7, B:950:0x07ef, B:952:0x07fb, B:955:0x080e, B:957:0x0822, B:959:0x086d, B:961:0x0874, B:963:0x087a, B:965:0x0884, B:967:0x088b, B:969:0x0891, B:971:0x089b, B:972:0x08ab, B:905:0x06c4, B:909:0x06d8, B:911:0x06de, B:914:0x06e9, B:865:0x0588, B:867:0x05bd, B:868:0x05da, B:870:0x05e0, B:872:0x05ee, B:876:0x0602, B:873:0x05f7, B:879:0x0609, B:881:0x0610, B:882:0x062f, B:817:0x042a, B:820:0x0434, B:823:0x043e, B:990:0x094e, B:992:0x095c, B:994:0x0965, B:1005:0x0997, B:995:0x096d, B:997:0x0976, B:999:0x097c, B:1002:0x0988, B:1004:0x0992, B:1008:0x099e, B:1009:0x09aa, B:1011:0x09b0, B:1017:0x09c9, B:1018:0x09d4, B:1023:0x09e1, B:1027:0x0a08, B:1029:0x0a27, B:1031:0x0a35, B:1033:0x0a3b, B:1035:0x0a45, B:1036:0x0a77, B:1038:0x0a7d, B:1040:0x0a8b, B:1044:0x0a96, B:1041:0x0a90, B:1045:0x0a99, B:1046:0x0aa8, B:1048:0x0aae, B:1050:0x0abe, B:1051:0x0ac5, B:1053:0x0ad1, B:1054:0x0ad8, B:1055:0x0adb, B:1057:0x0ae1, B:1059:0x0af3, B:1060:0x0af6, B:1068:0x0b66, B:1070:0x0b81, B:1071:0x0b92, B:1073:0x0b96, B:1075:0x0ba2, B:1076:0x0baa, B:1078:0x0bae, B:1080:0x0bb4, B:1081:0x0bc2, B:1082:0x0bcd, B:1088:0x0c0e, B:1089:0x0c16, B:1091:0x0c1c, B:1093:0x0c2e, B:1095:0x0c3c, B:1097:0x0c40, B:1099:0x0c4a, B:1101:0x0c4e, B:1107:0x0c64, B:1110:0x0c7a, B:1024:0x09e6, B:1026:0x09ec, B:701:0x0125, B:719:0x01c0, B:727:0x01f8, B:734:0x0216, B:759:0x0267, B:743:0x0237, B:694:0x00dd, B:704:0x012d), top: B:1237:0x000f, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:918:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:922:0x0723 A[Catch: all -> 0x1009, TryCatch #3 {all -> 0x1009, blocks: (B:655:0x000f, B:669:0x007f, B:760:0x026a, B:762:0x026e, B:768:0x027a, B:769:0x02a1, B:772:0x02b9, B:775:0x02df, B:777:0x0316, B:783:0x032c, B:785:0x0336, B:985:0x0932, B:787:0x0360, B:789:0x0366, B:791:0x037c, B:793:0x038a, B:796:0x03aa, B:798:0x03b0, B:800:0x03c0, B:802:0x03ce, B:804:0x03de, B:805:0x03ed, B:807:0x03f2, B:810:0x0408, B:840:0x046c, B:843:0x0476, B:845:0x0484, B:850:0x04d2, B:846:0x04a3, B:848:0x04b1, B:854:0x04df, B:857:0x0514, B:858:0x0542, B:860:0x0576, B:862:0x057c, B:884:0x064c, B:885:0x0658, B:888:0x0662, B:894:0x0685, B:891:0x0674, B:897:0x068b, B:899:0x0697, B:901:0x06a3, B:917:0x06f2, B:920:0x070f, B:922:0x0723, B:924:0x072d, B:927:0x0740, B:929:0x0754, B:931:0x0762, B:975:0x08b9, B:977:0x08c3, B:979:0x08c9, B:980:0x08e3, B:982:0x08f6, B:983:0x0910, B:984:0x0918, B:936:0x0780, B:938:0x078e, B:941:0x07a3, B:943:0x07b7, B:945:0x07c5, B:948:0x07d7, B:950:0x07ef, B:952:0x07fb, B:955:0x080e, B:957:0x0822, B:959:0x086d, B:961:0x0874, B:963:0x087a, B:965:0x0884, B:967:0x088b, B:969:0x0891, B:971:0x089b, B:972:0x08ab, B:905:0x06c4, B:909:0x06d8, B:911:0x06de, B:914:0x06e9, B:865:0x0588, B:867:0x05bd, B:868:0x05da, B:870:0x05e0, B:872:0x05ee, B:876:0x0602, B:873:0x05f7, B:879:0x0609, B:881:0x0610, B:882:0x062f, B:817:0x042a, B:820:0x0434, B:823:0x043e, B:990:0x094e, B:992:0x095c, B:994:0x0965, B:1005:0x0997, B:995:0x096d, B:997:0x0976, B:999:0x097c, B:1002:0x0988, B:1004:0x0992, B:1008:0x099e, B:1009:0x09aa, B:1011:0x09b0, B:1017:0x09c9, B:1018:0x09d4, B:1023:0x09e1, B:1027:0x0a08, B:1029:0x0a27, B:1031:0x0a35, B:1033:0x0a3b, B:1035:0x0a45, B:1036:0x0a77, B:1038:0x0a7d, B:1040:0x0a8b, B:1044:0x0a96, B:1041:0x0a90, B:1045:0x0a99, B:1046:0x0aa8, B:1048:0x0aae, B:1050:0x0abe, B:1051:0x0ac5, B:1053:0x0ad1, B:1054:0x0ad8, B:1055:0x0adb, B:1057:0x0ae1, B:1059:0x0af3, B:1060:0x0af6, B:1068:0x0b66, B:1070:0x0b81, B:1071:0x0b92, B:1073:0x0b96, B:1075:0x0ba2, B:1076:0x0baa, B:1078:0x0bae, B:1080:0x0bb4, B:1081:0x0bc2, B:1082:0x0bcd, B:1088:0x0c0e, B:1089:0x0c16, B:1091:0x0c1c, B:1093:0x0c2e, B:1095:0x0c3c, B:1097:0x0c40, B:1099:0x0c4a, B:1101:0x0c4e, B:1107:0x0c64, B:1110:0x0c7a, B:1024:0x09e6, B:1026:0x09ec, B:701:0x0125, B:719:0x01c0, B:727:0x01f8, B:734:0x0216, B:759:0x0267, B:743:0x0237, B:694:0x00dd, B:704:0x012d), top: B:1237:0x000f, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:973:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:979:0x08c9 A[Catch: all -> 0x1009, TryCatch #3 {all -> 0x1009, blocks: (B:655:0x000f, B:669:0x007f, B:760:0x026a, B:762:0x026e, B:768:0x027a, B:769:0x02a1, B:772:0x02b9, B:775:0x02df, B:777:0x0316, B:783:0x032c, B:785:0x0336, B:985:0x0932, B:787:0x0360, B:789:0x0366, B:791:0x037c, B:793:0x038a, B:796:0x03aa, B:798:0x03b0, B:800:0x03c0, B:802:0x03ce, B:804:0x03de, B:805:0x03ed, B:807:0x03f2, B:810:0x0408, B:840:0x046c, B:843:0x0476, B:845:0x0484, B:850:0x04d2, B:846:0x04a3, B:848:0x04b1, B:854:0x04df, B:857:0x0514, B:858:0x0542, B:860:0x0576, B:862:0x057c, B:884:0x064c, B:885:0x0658, B:888:0x0662, B:894:0x0685, B:891:0x0674, B:897:0x068b, B:899:0x0697, B:901:0x06a3, B:917:0x06f2, B:920:0x070f, B:922:0x0723, B:924:0x072d, B:927:0x0740, B:929:0x0754, B:931:0x0762, B:975:0x08b9, B:977:0x08c3, B:979:0x08c9, B:980:0x08e3, B:982:0x08f6, B:983:0x0910, B:984:0x0918, B:936:0x0780, B:938:0x078e, B:941:0x07a3, B:943:0x07b7, B:945:0x07c5, B:948:0x07d7, B:950:0x07ef, B:952:0x07fb, B:955:0x080e, B:957:0x0822, B:959:0x086d, B:961:0x0874, B:963:0x087a, B:965:0x0884, B:967:0x088b, B:969:0x0891, B:971:0x089b, B:972:0x08ab, B:905:0x06c4, B:909:0x06d8, B:911:0x06de, B:914:0x06e9, B:865:0x0588, B:867:0x05bd, B:868:0x05da, B:870:0x05e0, B:872:0x05ee, B:876:0x0602, B:873:0x05f7, B:879:0x0609, B:881:0x0610, B:882:0x062f, B:817:0x042a, B:820:0x0434, B:823:0x043e, B:990:0x094e, B:992:0x095c, B:994:0x0965, B:1005:0x0997, B:995:0x096d, B:997:0x0976, B:999:0x097c, B:1002:0x0988, B:1004:0x0992, B:1008:0x099e, B:1009:0x09aa, B:1011:0x09b0, B:1017:0x09c9, B:1018:0x09d4, B:1023:0x09e1, B:1027:0x0a08, B:1029:0x0a27, B:1031:0x0a35, B:1033:0x0a3b, B:1035:0x0a45, B:1036:0x0a77, B:1038:0x0a7d, B:1040:0x0a8b, B:1044:0x0a96, B:1041:0x0a90, B:1045:0x0a99, B:1046:0x0aa8, B:1048:0x0aae, B:1050:0x0abe, B:1051:0x0ac5, B:1053:0x0ad1, B:1054:0x0ad8, B:1055:0x0adb, B:1057:0x0ae1, B:1059:0x0af3, B:1060:0x0af6, B:1068:0x0b66, B:1070:0x0b81, B:1071:0x0b92, B:1073:0x0b96, B:1075:0x0ba2, B:1076:0x0baa, B:1078:0x0bae, B:1080:0x0bb4, B:1081:0x0bc2, B:1082:0x0bcd, B:1088:0x0c0e, B:1089:0x0c16, B:1091:0x0c1c, B:1093:0x0c2e, B:1095:0x0c3c, B:1097:0x0c40, B:1099:0x0c4a, B:1101:0x0c4e, B:1107:0x0c64, B:1110:0x0c7a, B:1024:0x09e6, B:1026:0x09ec, B:701:0x0125, B:719:0x01c0, B:727:0x01f8, B:734:0x0216, B:759:0x0267, B:743:0x0237, B:694:0x00dd, B:704:0x012d), top: B:1237:0x000f, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:980:0x08e3 A[Catch: all -> 0x1009, TryCatch #3 {all -> 0x1009, blocks: (B:655:0x000f, B:669:0x007f, B:760:0x026a, B:762:0x026e, B:768:0x027a, B:769:0x02a1, B:772:0x02b9, B:775:0x02df, B:777:0x0316, B:783:0x032c, B:785:0x0336, B:985:0x0932, B:787:0x0360, B:789:0x0366, B:791:0x037c, B:793:0x038a, B:796:0x03aa, B:798:0x03b0, B:800:0x03c0, B:802:0x03ce, B:804:0x03de, B:805:0x03ed, B:807:0x03f2, B:810:0x0408, B:840:0x046c, B:843:0x0476, B:845:0x0484, B:850:0x04d2, B:846:0x04a3, B:848:0x04b1, B:854:0x04df, B:857:0x0514, B:858:0x0542, B:860:0x0576, B:862:0x057c, B:884:0x064c, B:885:0x0658, B:888:0x0662, B:894:0x0685, B:891:0x0674, B:897:0x068b, B:899:0x0697, B:901:0x06a3, B:917:0x06f2, B:920:0x070f, B:922:0x0723, B:924:0x072d, B:927:0x0740, B:929:0x0754, B:931:0x0762, B:975:0x08b9, B:977:0x08c3, B:979:0x08c9, B:980:0x08e3, B:982:0x08f6, B:983:0x0910, B:984:0x0918, B:936:0x0780, B:938:0x078e, B:941:0x07a3, B:943:0x07b7, B:945:0x07c5, B:948:0x07d7, B:950:0x07ef, B:952:0x07fb, B:955:0x080e, B:957:0x0822, B:959:0x086d, B:961:0x0874, B:963:0x087a, B:965:0x0884, B:967:0x088b, B:969:0x0891, B:971:0x089b, B:972:0x08ab, B:905:0x06c4, B:909:0x06d8, B:911:0x06de, B:914:0x06e9, B:865:0x0588, B:867:0x05bd, B:868:0x05da, B:870:0x05e0, B:872:0x05ee, B:876:0x0602, B:873:0x05f7, B:879:0x0609, B:881:0x0610, B:882:0x062f, B:817:0x042a, B:820:0x0434, B:823:0x043e, B:990:0x094e, B:992:0x095c, B:994:0x0965, B:1005:0x0997, B:995:0x096d, B:997:0x0976, B:999:0x097c, B:1002:0x0988, B:1004:0x0992, B:1008:0x099e, B:1009:0x09aa, B:1011:0x09b0, B:1017:0x09c9, B:1018:0x09d4, B:1023:0x09e1, B:1027:0x0a08, B:1029:0x0a27, B:1031:0x0a35, B:1033:0x0a3b, B:1035:0x0a45, B:1036:0x0a77, B:1038:0x0a7d, B:1040:0x0a8b, B:1044:0x0a96, B:1041:0x0a90, B:1045:0x0a99, B:1046:0x0aa8, B:1048:0x0aae, B:1050:0x0abe, B:1051:0x0ac5, B:1053:0x0ad1, B:1054:0x0ad8, B:1055:0x0adb, B:1057:0x0ae1, B:1059:0x0af3, B:1060:0x0af6, B:1068:0x0b66, B:1070:0x0b81, B:1071:0x0b92, B:1073:0x0b96, B:1075:0x0ba2, B:1076:0x0baa, B:1078:0x0bae, B:1080:0x0bb4, B:1081:0x0bc2, B:1082:0x0bcd, B:1088:0x0c0e, B:1089:0x0c16, B:1091:0x0c1c, B:1093:0x0c2e, B:1095:0x0c3c, B:1097:0x0c40, B:1099:0x0c4a, B:1101:0x0c4e, B:1107:0x0c64, B:1110:0x0c7a, B:1024:0x09e6, B:1026:0x09ec, B:701:0x0125, B:719:0x01c0, B:727:0x01f8, B:734:0x0216, B:759:0x0267, B:743:0x0237, B:694:0x00dd, B:704:0x012d), top: B:1237:0x000f, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:995:0x096d A[Catch: all -> 0x1009, TryCatch #3 {all -> 0x1009, blocks: (B:655:0x000f, B:669:0x007f, B:760:0x026a, B:762:0x026e, B:768:0x027a, B:769:0x02a1, B:772:0x02b9, B:775:0x02df, B:777:0x0316, B:783:0x032c, B:785:0x0336, B:985:0x0932, B:787:0x0360, B:789:0x0366, B:791:0x037c, B:793:0x038a, B:796:0x03aa, B:798:0x03b0, B:800:0x03c0, B:802:0x03ce, B:804:0x03de, B:805:0x03ed, B:807:0x03f2, B:810:0x0408, B:840:0x046c, B:843:0x0476, B:845:0x0484, B:850:0x04d2, B:846:0x04a3, B:848:0x04b1, B:854:0x04df, B:857:0x0514, B:858:0x0542, B:860:0x0576, B:862:0x057c, B:884:0x064c, B:885:0x0658, B:888:0x0662, B:894:0x0685, B:891:0x0674, B:897:0x068b, B:899:0x0697, B:901:0x06a3, B:917:0x06f2, B:920:0x070f, B:922:0x0723, B:924:0x072d, B:927:0x0740, B:929:0x0754, B:931:0x0762, B:975:0x08b9, B:977:0x08c3, B:979:0x08c9, B:980:0x08e3, B:982:0x08f6, B:983:0x0910, B:984:0x0918, B:936:0x0780, B:938:0x078e, B:941:0x07a3, B:943:0x07b7, B:945:0x07c5, B:948:0x07d7, B:950:0x07ef, B:952:0x07fb, B:955:0x080e, B:957:0x0822, B:959:0x086d, B:961:0x0874, B:963:0x087a, B:965:0x0884, B:967:0x088b, B:969:0x0891, B:971:0x089b, B:972:0x08ab, B:905:0x06c4, B:909:0x06d8, B:911:0x06de, B:914:0x06e9, B:865:0x0588, B:867:0x05bd, B:868:0x05da, B:870:0x05e0, B:872:0x05ee, B:876:0x0602, B:873:0x05f7, B:879:0x0609, B:881:0x0610, B:882:0x062f, B:817:0x042a, B:820:0x0434, B:823:0x043e, B:990:0x094e, B:992:0x095c, B:994:0x0965, B:1005:0x0997, B:995:0x096d, B:997:0x0976, B:999:0x097c, B:1002:0x0988, B:1004:0x0992, B:1008:0x099e, B:1009:0x09aa, B:1011:0x09b0, B:1017:0x09c9, B:1018:0x09d4, B:1023:0x09e1, B:1027:0x0a08, B:1029:0x0a27, B:1031:0x0a35, B:1033:0x0a3b, B:1035:0x0a45, B:1036:0x0a77, B:1038:0x0a7d, B:1040:0x0a8b, B:1044:0x0a96, B:1041:0x0a90, B:1045:0x0a99, B:1046:0x0aa8, B:1048:0x0aae, B:1050:0x0abe, B:1051:0x0ac5, B:1053:0x0ad1, B:1054:0x0ad8, B:1055:0x0adb, B:1057:0x0ae1, B:1059:0x0af3, B:1060:0x0af6, B:1068:0x0b66, B:1070:0x0b81, B:1071:0x0b92, B:1073:0x0b96, B:1075:0x0ba2, B:1076:0x0baa, B:1078:0x0bae, B:1080:0x0bb4, B:1081:0x0bc2, B:1082:0x0bcd, B:1088:0x0c0e, B:1089:0x0c16, B:1091:0x0c1c, B:1093:0x0c2e, B:1095:0x0c3c, B:1097:0x0c40, B:1099:0x0c4a, B:1101:0x0c4e, B:1107:0x0c64, B:1110:0x0c7a, B:1024:0x09e6, B:1026:0x09ec, B:701:0x0125, B:719:0x01c0, B:727:0x01f8, B:734:0x0216, B:759:0x0267, B:743:0x0237, B:694:0x00dd, B:704:0x012d), top: B:1237:0x000f, inners: #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean B(java.lang.String r43, long r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 4116
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t9.B(java.lang.String, long):boolean");
    }

    private final boolean C() {
        k0();
        d0();
        return V().E0() || !TextUtils.isEmpty(V().u());
    }

    private final void D() {
        long jMax;
        long jMax2;
        k0();
        d0();
        if (this.n > 0) {
            long jAbs = 3600000 - Math.abs(this.f11254k.zzl().c() - this.n);
            if (jAbs > 0) {
                this.f11254k.zzq().I().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                i0().c();
                j0().t();
                return;
            }
            this.n = 0L;
        }
        if (!this.f11254k.p() || !C()) {
            this.f11254k.zzq().I().a("Nothing to upload or uploading impossible");
            i0().c();
            j0().t();
            return;
        }
        long jA = this.f11254k.zzl().a();
        long jMax3 = Math.max(0L, t.B.a(null).longValue());
        boolean z = V().F0() || V().v();
        if (z) {
            String strM = this.f11254k.a().M();
            jMax = (TextUtils.isEmpty(strM) || ".none.".equals(strM)) ? Math.max(0L, t.v.a(null).longValue()) : Math.max(0L, t.w.a(null).longValue());
        } else {
            jMax = Math.max(0L, t.u.a(null).longValue());
        }
        long jA2 = this.f11254k.s().f10926f.a();
        long jA3 = this.f11254k.s().f10927g.a();
        long j2 = jMax;
        long jMax4 = Math.max(V().C0(), V().D0());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jA - Math.abs(jMax4 - jA);
            long jAbs3 = jA - Math.abs(jA2 - jA);
            long jAbs4 = jA - Math.abs(jA3 - jA);
            long jMax5 = Math.max(jAbs3, jAbs4);
            jMax2 = jAbs2 + jMax3;
            if (z && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + j2;
            }
            if (!Z().O(jMax5, j2)) {
                jMax2 = jMax5 + j2;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                for (int i2 = 0; i2 < Math.min(20, Math.max(0, t.D.a(null).intValue())); i2++) {
                    jMax2 += Math.max(0L, t.C.a(null).longValue()) * (1 << i2);
                    if (jMax2 > jAbs4) {
                        break;
                    }
                }
                jMax2 = 0;
            }
        }
        if (jMax2 == 0) {
            this.f11254k.zzq().I().a("Next upload time is 0");
            i0().c();
            j0().t();
            return;
        }
        if (!T().v()) {
            this.f11254k.zzq().I().a("No network");
            i0().b();
            j0().t();
            return;
        }
        long jA4 = this.f11254k.s().f10928h.a();
        long jMax6 = Math.max(0L, t.s.a(null).longValue());
        if (!Z().O(jA4, jMax6)) {
            jMax2 = Math.max(jMax2, jA4 + jMax6);
        }
        i0().c();
        long jA5 = jMax2 - this.f11254k.zzl().a();
        if (jA5 <= 0) {
            jA5 = Math.max(0L, t.x.a(null).longValue());
            this.f11254k.s().f10926f.b(this.f11254k.zzl().a());
        }
        this.f11254k.zzq().I().b("Upload scheduled in approximately ms", Long.valueOf(jA5));
        j0().s(jA5);
    }

    private final void E() {
        k0();
        if (this.r || this.s || this.t) {
            this.f11254k.zzq().I().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.r), Boolean.valueOf(this.s), Boolean.valueOf(this.t));
            return;
        }
        this.f11254k.zzq().I().a("Stopping uploading service(s)");
        List<Runnable> list = this.o;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.o.clear();
    }

    private final boolean F() throws IOException {
        FileLock fileLock;
        k0();
        if (this.f11254k.a().o(t.j0) && (fileLock = this.u) != null && fileLock.isValid()) {
            this.f11254k.zzq().I().a("Storage concurrent access okay");
            return true;
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(this.f11254k.zzm().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.v = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.u = fileLockTryLock;
            if (fileLockTryLock != null) {
                this.f11254k.zzq().I().a("Storage concurrent access okay");
                return true;
            }
            this.f11254k.zzq().A().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e2) {
            this.f11254k.zzq().A().b("Failed to acquire storage lock", e2);
            return false;
        } catch (IOException e3) {
            this.f11254k.zzq().A().b("Failed to access storage lock file", e3);
            return false;
        } catch (OverlappingFileLockException e4) {
            this.f11254k.zzq().D().b("Storage lock already acquired", e4);
            return false;
        }
    }

    private final ka H(String str) {
        f4 f4VarH0 = V().h0(str);
        if (f4VarH0 == null || TextUtils.isEmpty(f4VarH0.T())) {
            this.f11254k.zzq().H().b("No app data available; dropping", str);
            return null;
        }
        Boolean boolI = I(f4VarH0);
        if (boolI != null && !boolI.booleanValue()) {
            this.f11254k.zzq().A().b("App version does not match; dropping. appId", v3.s(str));
            return null;
        }
        return new ka(str, f4VarH0.A(), f4VarH0.T(), f4VarH0.V(), f4VarH0.X(), f4VarH0.Z(), f4VarH0.b0(), (String) null, f4VarH0.e0(), false, f4VarH0.M(), f4VarH0.k(), 0L, 0, f4VarH0.l(), f4VarH0.m(), false, f4VarH0.D(), f4VarH0.n(), f4VarH0.d0(), f4VarH0.o(), (pd.a() && this.f11254k.a().y(str, t.k0)) ? f4VarH0.G() : null, (ec.a() && this.f11254k.a().o(t.L0)) ? b(str).e() : "");
    }

    private final Boolean I(f4 f4Var) {
        try {
            if (f4Var.V() != -2147483648L) {
                if (f4Var.V() == com.google.android.gms.common.p.c.a(this.f11254k.zzm()).f(f4Var.t(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = com.google.android.gms.common.p.c.a(this.f11254k.zzm()).f(f4Var.t(), 0).versionName;
                if (f4Var.T() != null && f4Var.T().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void J(g1.a aVar, g1.a aVar2) {
        com.google.android.gms.common.internal.p.a("_e".equals(aVar.D()));
        Z();
        e.c.b.b.c.e.i1 i1VarW = z9.w((e.c.b.b.c.e.g1) ((e.c.b.b.c.e.o7) aVar.zzy()), "_et");
        if (!i1VarW.T() || i1VarW.U() <= 0) {
            return;
        }
        long jU = i1VarW.U();
        Z();
        e.c.b.b.c.e.i1 i1VarW2 = z9.w((e.c.b.b.c.e.g1) ((e.c.b.b.c.e.o7) aVar2.zzy()), "_et");
        if (i1VarW2 != null && i1VarW2.U() > 0) {
            jU += i1VarW2.U();
        }
        Z();
        z9.F(aVar2, "_et", Long.valueOf(jU));
        Z();
        z9.F(aVar, "_fr", 1L);
    }

    private final void K(r rVar, ka kaVar) {
        if (qd.a() && this.f11254k.a().o(t.C0)) {
            z3 z3VarB = z3.b(rVar);
            this.f11254k.B().H(z3VarB.f11366d, V().z0(kaVar.f10989e));
            this.f11254k.B().Q(z3VarB, this.f11254k.a().j(kaVar.f10989e));
            rVar = z3VarB.a();
        }
        if (this.f11254k.a().o(t.f0) && "_cmp".equals(rVar.f11169e) && "referrer API v2".equals(rVar.f11170f.O("_cis"))) {
            String strO = rVar.f11170f.O("gclid");
            if (!TextUtils.isEmpty(strO)) {
                r(new ca("_lgclid", rVar.f11172h, strO, "auto"), kaVar);
            }
        }
        l(rVar, kaVar);
    }

    private static void L(q9 q9Var) {
        if (q9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (q9Var.o()) {
            return;
        }
        String strValueOf = String.valueOf(q9Var.getClass());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:412:0x02b4 A[Catch: all -> 0x09b1, TryCatch #0 {all -> 0x09b1, blocks: (B:356:0x013b, B:359:0x014a, B:361:0x0154, B:366:0x0160, B:373:0x0172, B:376:0x017e, B:378:0x0195, B:383:0x01ae, B:388:0x01e3, B:390:0x01e9, B:392:0x01f7, B:394:0x01ff, B:396:0x0209, B:398:0x0214, B:401:0x021b, B:410:0x02aa, B:412:0x02b4, B:416:0x02ed, B:420:0x02ff, B:422:0x034c, B:424:0x0351, B:425:0x036a, B:429:0x037b, B:431:0x038f, B:433:0x0394, B:434:0x03ad, B:438:0x03d2, B:442:0x03f7, B:443:0x0410, B:446:0x041f, B:449:0x0442, B:450:0x045e, B:452:0x0468, B:454:0x0474, B:456:0x047a, B:457:0x0485, B:459:0x0491, B:460:0x04a8, B:462:0x04cf, B:465:0x04e8, B:468:0x052e, B:470:0x0556, B:472:0x0590, B:473:0x0595, B:475:0x059d, B:476:0x05a2, B:478:0x05aa, B:479:0x05af, B:481:0x05b8, B:482:0x05bc, B:484:0x05c9, B:485:0x05ce, B:487:0x05d4, B:489:0x05e2, B:490:0x05f9, B:492:0x05ff, B:494:0x060f, B:496:0x0619, B:498:0x0621, B:499:0x0626, B:501:0x0630, B:503:0x063a, B:505:0x0642, B:511:0x065f, B:513:0x0667, B:514:0x066a, B:516:0x0679, B:517:0x067c, B:519:0x0692, B:521:0x06a0, B:547:0x074c, B:549:0x0794, B:550:0x0799, B:552:0x07a1, B:554:0x07a7, B:556:0x07b5, B:558:0x07bc, B:560:0x07c2, B:557:0x07b9, B:561:0x07c7, B:563:0x07d3, B:565:0x07e2, B:567:0x07f0, B:569:0x07ff, B:571:0x080f, B:573:0x081d, B:576:0x082e, B:578:0x0863, B:579:0x0868, B:575:0x0823, B:568:0x07f8, B:580:0x0874, B:582:0x087a, B:584:0x0888, B:589:0x089f, B:591:0x08a9, B:592:0x08b0, B:593:0x08bb, B:595:0x08c1, B:597:0x08f2, B:598:0x0902, B:600:0x090a, B:601:0x090e, B:603:0x0914, B:612:0x095c, B:614:0x0962, B:617:0x097e, B:606:0x0922, B:608:0x0947, B:616:0x0966, B:586:0x088e, B:588:0x0898, B:523:0x06a6, B:525:0x06b0, B:527:0x06ba, B:529:0x06be, B:531:0x06c9, B:532:0x06d4, B:534:0x06e6, B:536:0x06ea, B:538:0x06f0, B:540:0x0700, B:542:0x0712, B:546:0x0749, B:543:0x072c, B:545:0x0732, B:506:0x0648, B:508:0x0652, B:510:0x065a, B:469:0x0548, B:403:0x0243, B:404:0x0261, B:409:0x028f, B:408:0x027e, B:395:0x0204, B:386:0x01bc, B:387:0x01d9), top: B:623:0x013b, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x02ed A[Catch: all -> 0x09b1, TRY_LEAVE, TryCatch #0 {all -> 0x09b1, blocks: (B:356:0x013b, B:359:0x014a, B:361:0x0154, B:366:0x0160, B:373:0x0172, B:376:0x017e, B:378:0x0195, B:383:0x01ae, B:388:0x01e3, B:390:0x01e9, B:392:0x01f7, B:394:0x01ff, B:396:0x0209, B:398:0x0214, B:401:0x021b, B:410:0x02aa, B:412:0x02b4, B:416:0x02ed, B:420:0x02ff, B:422:0x034c, B:424:0x0351, B:425:0x036a, B:429:0x037b, B:431:0x038f, B:433:0x0394, B:434:0x03ad, B:438:0x03d2, B:442:0x03f7, B:443:0x0410, B:446:0x041f, B:449:0x0442, B:450:0x045e, B:452:0x0468, B:454:0x0474, B:456:0x047a, B:457:0x0485, B:459:0x0491, B:460:0x04a8, B:462:0x04cf, B:465:0x04e8, B:468:0x052e, B:470:0x0556, B:472:0x0590, B:473:0x0595, B:475:0x059d, B:476:0x05a2, B:478:0x05aa, B:479:0x05af, B:481:0x05b8, B:482:0x05bc, B:484:0x05c9, B:485:0x05ce, B:487:0x05d4, B:489:0x05e2, B:490:0x05f9, B:492:0x05ff, B:494:0x060f, B:496:0x0619, B:498:0x0621, B:499:0x0626, B:501:0x0630, B:503:0x063a, B:505:0x0642, B:511:0x065f, B:513:0x0667, B:514:0x066a, B:516:0x0679, B:517:0x067c, B:519:0x0692, B:521:0x06a0, B:547:0x074c, B:549:0x0794, B:550:0x0799, B:552:0x07a1, B:554:0x07a7, B:556:0x07b5, B:558:0x07bc, B:560:0x07c2, B:557:0x07b9, B:561:0x07c7, B:563:0x07d3, B:565:0x07e2, B:567:0x07f0, B:569:0x07ff, B:571:0x080f, B:573:0x081d, B:576:0x082e, B:578:0x0863, B:579:0x0868, B:575:0x0823, B:568:0x07f8, B:580:0x0874, B:582:0x087a, B:584:0x0888, B:589:0x089f, B:591:0x08a9, B:592:0x08b0, B:593:0x08bb, B:595:0x08c1, B:597:0x08f2, B:598:0x0902, B:600:0x090a, B:601:0x090e, B:603:0x0914, B:612:0x095c, B:614:0x0962, B:617:0x097e, B:606:0x0922, B:608:0x0947, B:616:0x0966, B:586:0x088e, B:588:0x0898, B:523:0x06a6, B:525:0x06b0, B:527:0x06ba, B:529:0x06be, B:531:0x06c9, B:532:0x06d4, B:534:0x06e6, B:536:0x06ea, B:538:0x06f0, B:540:0x0700, B:542:0x0712, B:546:0x0749, B:543:0x072c, B:545:0x0732, B:506:0x0648, B:508:0x0652, B:510:0x065a, B:469:0x0548, B:403:0x0243, B:404:0x0261, B:409:0x028f, B:408:0x027e, B:395:0x0204, B:386:0x01bc, B:387:0x01d9), top: B:623:0x013b, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0962 A[Catch: all -> 0x09b1, TryCatch #0 {all -> 0x09b1, blocks: (B:356:0x013b, B:359:0x014a, B:361:0x0154, B:366:0x0160, B:373:0x0172, B:376:0x017e, B:378:0x0195, B:383:0x01ae, B:388:0x01e3, B:390:0x01e9, B:392:0x01f7, B:394:0x01ff, B:396:0x0209, B:398:0x0214, B:401:0x021b, B:410:0x02aa, B:412:0x02b4, B:416:0x02ed, B:420:0x02ff, B:422:0x034c, B:424:0x0351, B:425:0x036a, B:429:0x037b, B:431:0x038f, B:433:0x0394, B:434:0x03ad, B:438:0x03d2, B:442:0x03f7, B:443:0x0410, B:446:0x041f, B:449:0x0442, B:450:0x045e, B:452:0x0468, B:454:0x0474, B:456:0x047a, B:457:0x0485, B:459:0x0491, B:460:0x04a8, B:462:0x04cf, B:465:0x04e8, B:468:0x052e, B:470:0x0556, B:472:0x0590, B:473:0x0595, B:475:0x059d, B:476:0x05a2, B:478:0x05aa, B:479:0x05af, B:481:0x05b8, B:482:0x05bc, B:484:0x05c9, B:485:0x05ce, B:487:0x05d4, B:489:0x05e2, B:490:0x05f9, B:492:0x05ff, B:494:0x060f, B:496:0x0619, B:498:0x0621, B:499:0x0626, B:501:0x0630, B:503:0x063a, B:505:0x0642, B:511:0x065f, B:513:0x0667, B:514:0x066a, B:516:0x0679, B:517:0x067c, B:519:0x0692, B:521:0x06a0, B:547:0x074c, B:549:0x0794, B:550:0x0799, B:552:0x07a1, B:554:0x07a7, B:556:0x07b5, B:558:0x07bc, B:560:0x07c2, B:557:0x07b9, B:561:0x07c7, B:563:0x07d3, B:565:0x07e2, B:567:0x07f0, B:569:0x07ff, B:571:0x080f, B:573:0x081d, B:576:0x082e, B:578:0x0863, B:579:0x0868, B:575:0x0823, B:568:0x07f8, B:580:0x0874, B:582:0x087a, B:584:0x0888, B:589:0x089f, B:591:0x08a9, B:592:0x08b0, B:593:0x08bb, B:595:0x08c1, B:597:0x08f2, B:598:0x0902, B:600:0x090a, B:601:0x090e, B:603:0x0914, B:612:0x095c, B:614:0x0962, B:617:0x097e, B:606:0x0922, B:608:0x0947, B:616:0x0966, B:586:0x088e, B:588:0x0898, B:523:0x06a6, B:525:0x06b0, B:527:0x06ba, B:529:0x06be, B:531:0x06c9, B:532:0x06d4, B:534:0x06e6, B:536:0x06ea, B:538:0x06f0, B:540:0x0700, B:542:0x0712, B:546:0x0749, B:543:0x072c, B:545:0x0732, B:506:0x0648, B:508:0x0652, B:510:0x065a, B:469:0x0548, B:403:0x0243, B:404:0x0261, B:409:0x028f, B:408:0x027e, B:395:0x0204, B:386:0x01bc, B:387:0x01d9), top: B:623:0x013b, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void S(com.google.android.gms.measurement.internal.r r27, com.google.android.gms.measurement.internal.ka r28) {
        /*
            Method dump skipped, instructions count: 2491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t9.S(com.google.android.gms.measurement.internal.r, com.google.android.gms.measurement.internal.ka):void");
    }

    private final boolean W(ka kaVar) {
        return (pd.a() && this.f11254k.a().y(kaVar.f10989e, t.k0)) ? (TextUtils.isEmpty(kaVar.f10990f) && TextUtils.isEmpty(kaVar.z) && TextUtils.isEmpty(kaVar.v)) ? false : true : (TextUtils.isEmpty(kaVar.f10990f) && TextUtils.isEmpty(kaVar.v)) ? false : true;
    }

    private final int a(FileChannel fileChannel) throws IOException {
        k0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f11254k.zzq().A().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int i2 = fileChannel.read(byteBufferAllocate);
            if (i2 == 4) {
                byteBufferAllocate.flip();
                return byteBufferAllocate.getInt();
            }
            if (i2 != -1) {
                this.f11254k.zzq().D().b("Unexpected data length. Bytes read", Integer.valueOf(i2));
            }
            return 0;
        } catch (IOException e2) {
            this.f11254k.zzq().A().b("Failed to read from channel", e2);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.measurement.internal.f4 c(com.google.android.gms.measurement.internal.ka r9, com.google.android.gms.measurement.internal.f4 r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t9.c(com.google.android.gms.measurement.internal.ka, com.google.android.gms.measurement.internal.f4, java.lang.String):com.google.android.gms.measurement.internal.f4");
    }

    public static t9 e(Context context) {
        com.google.android.gms.common.internal.p.j(context);
        com.google.android.gms.common.internal.p.j(context.getApplicationContext());
        if (a == null) {
            synchronized (t9.class) {
                if (a == null) {
                    a = new t9(new aa(context));
                }
            }
        }
        return a;
    }

    private final String f(d dVar) {
        if (ec.a() && this.f11254k.a().o(t.L0) && !dVar.q()) {
            return null;
        }
        return m0();
    }

    private static void i(g1.a aVar, int i2, String str) {
        List<e.c.b.b.c.e.i1> listY = aVar.y();
        for (int i3 = 0; i3 < listY.size(); i3++) {
            if ("_err".equals(listY.get(i3).J())) {
                return;
            }
        }
        aVar.u((e.c.b.b.c.e.i1) ((e.c.b.b.c.e.o7) e.c.b.b.c.e.i1.c0().v("_err").s(Long.valueOf(i2).longValue()).zzy())).u((e.c.b.b.c.e.i1) ((e.c.b.b.c.e.o7) e.c.b.b.c.e.i1.c0().v("_ev").x(str).zzy()));
    }

    private final g4 i0() {
        g4 g4Var = this.f11248e;
        if (g4Var != null) {
            return g4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private static void j(g1.a aVar, String str) {
        List<e.c.b.b.c.e.i1> listY = aVar.y();
        for (int i2 = 0; i2 < listY.size(); i2++) {
            if (str.equals(listY.get(i2).J())) {
                aVar.A(i2);
                return;
            }
        }
    }

    private final p9 j0() {
        L(this.f11249f);
        return this.f11249f;
    }

    private final void k(k1.a aVar, long j2, boolean z) {
        String str = z ? "_se" : "_lte";
        ea eaVarM0 = V().m0(aVar.r0(), str);
        ea eaVar = (eaVarM0 == null || eaVarM0.f10851e == null) ? new ea(aVar.r0(), "auto", str, this.f11254k.zzl().a(), Long.valueOf(j2)) : new ea(aVar.r0(), "auto", str, this.f11254k.zzl().a(), Long.valueOf(((Long) eaVarM0.f10851e).longValue() + j2));
        e.c.b.b.c.e.o1 o1Var = (e.c.b.b.c.e.o1) ((e.c.b.b.c.e.o7) e.c.b.b.c.e.o1.V().t(str).s(this.f11254k.zzl().a()).v(((Long) eaVar.f10851e).longValue()).zzy());
        boolean z2 = false;
        int iS = z9.s(aVar, str);
        if (iS >= 0) {
            aVar.s(iS, o1Var);
            z2 = true;
        }
        if (!z2) {
            aVar.x(o1Var);
        }
        if (j2 > 0) {
            V().R(eaVar);
            this.f11254k.zzq().I().c("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", eaVar.f10851e);
        }
    }

    private final void k0() {
        this.f11254k.zzp().d();
    }

    private final long l0() {
        long jA = this.f11254k.zzl().a();
        i4 i4VarS = this.f11254k.s();
        i4VarS.l();
        i4VarS.d();
        long jA2 = i4VarS.f10930j.a();
        if (jA2 == 0) {
            jA2 = 1 + i4VarS.g().C0().nextInt(CoreConstants.MILLIS_IN_ONE_DAY);
            i4VarS.f10930j.b(jA2);
        }
        return ((((jA + jA2) / 1000) / 60) / 60) / 24;
    }

    @Deprecated
    private final String m0() {
        byte[] bArr = new byte[16];
        this.f11254k.B().C0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    private final void n(f4 f4Var) {
        c.e.a aVar;
        k0();
        if (pd.a() && this.f11254k.a().y(f4Var.t(), t.k0)) {
            if (TextUtils.isEmpty(f4Var.A()) && TextUtils.isEmpty(f4Var.G()) && TextUtils.isEmpty(f4Var.D())) {
                w(f4Var.t(), 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(f4Var.A()) && TextUtils.isEmpty(f4Var.D())) {
            w(f4Var.t(), 204, null, null, null);
            return;
        }
        String strM = this.f11254k.a().m(f4Var);
        try {
            URL url = new URL(strM);
            this.f11254k.zzq().I().b("Fetching remote configuration", f4Var.t());
            e.c.b.b.c.e.a1 a1VarS = R().s(f4Var.t());
            String strX = R().x(f4Var.t());
            if (a1VarS == null || TextUtils.isEmpty(strX)) {
                aVar = null;
            } else {
                c.e.a aVar2 = new c.e.a();
                aVar2.put("If-Modified-Since", strX);
                aVar = aVar2;
            }
            this.r = true;
            c4 c4VarT = T();
            String strT = f4Var.t();
            u9 u9Var = new u9(this);
            c4VarT.d();
            c4VarT.p();
            com.google.android.gms.common.internal.p.j(url);
            com.google.android.gms.common.internal.p.j(u9Var);
            c4VarT.zzp().A(new h4(c4VarT, strT, url, null, aVar, u9Var));
        } catch (MalformedURLException unused) {
            this.f11254k.zzq().A().c("Failed to parse config URL. Not fetching. appId", v3.s(f4Var.t()), strM);
        }
    }

    public final void q(aa aaVar) {
        this.f11254k.zzp().d();
        g gVar = new g(this);
        gVar.q();
        this.f11247d = gVar;
        this.f11254k.a().n(this.f11245b);
        y8 y8Var = new y8(this);
        y8Var.q();
        this.f11253j = y8Var;
        oa oaVar = new oa(this);
        oaVar.q();
        this.f11250g = oaVar;
        o7 o7Var = new o7(this);
        o7Var.q();
        this.f11252i = o7Var;
        p9 p9Var = new p9(this);
        p9Var.q();
        this.f11249f = p9Var;
        this.f11248e = new g4(this);
        if (this.p != this.q) {
            this.f11254k.zzq().A().c("Not all upload components initialized", Integer.valueOf(this.p), Integer.valueOf(this.q));
        }
        this.f11255l = true;
    }

    private final boolean z(int i2, FileChannel fileChannel) throws IOException {
        k0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f11254k.zzq().A().a("Bad channel to read from");
            return false;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.flip();
        try {
            fileChannel.truncate(0L);
            if (this.f11254k.a().o(t.t0) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0L);
            }
            fileChannel.write(byteBufferAllocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f11254k.zzq().A().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e2) {
            this.f11254k.zzq().A().b("Failed to write to channel", e2);
            return false;
        }
    }

    public final c G() {
        return this.f11254k.a();
    }

    final void M(ca caVar, ka kaVar) {
        k0();
        d0();
        if (W(kaVar)) {
            if (!kaVar.f10996l) {
                Q(kaVar);
                return;
            }
            if ("_npa".equals(caVar.f10792f) && kaVar.w != null) {
                this.f11254k.zzq().H().a("Falling back to manifest metadata value for ad personalization");
                r(new ca("_npa", this.f11254k.zzl().a(), Long.valueOf(kaVar.w.booleanValue() ? 1L : 0L), "auto"), kaVar);
                return;
            }
            this.f11254k.zzq().H().b("Removing user property", this.f11254k.C().v(caVar.f10792f));
            V().r0();
            try {
                Q(kaVar);
                V().j0(kaVar.f10989e, caVar.f10792f);
                V().s();
                this.f11254k.zzq().H().b("User property removed", this.f11254k.C().v(caVar.f10792f));
            } finally {
                V().w0();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x020c A[Catch: all -> 0x04ad, TryCatch #2 {all -> 0x04ad, blocks: (B:194:0x009f, B:196:0x00ad, B:214:0x010f, B:216:0x011b, B:218:0x0132, B:219:0x015a, B:221:0x01ab, B:224:0x01be, B:227:0x01d2, B:229:0x01dd, B:234:0x01ec, B:236:0x01f4, B:238:0x01fa, B:242:0x0209, B:244:0x020c, B:246:0x0230, B:248:0x0235, B:254:0x0255, B:257:0x0269, B:259:0x02bd, B:261:0x02c5, B:263:0x02c9, B:264:0x02cc, B:266:0x02ed, B:305:0x03c7, B:306:0x03ca, B:317:0x043b, B:319:0x044b, B:321:0x0465, B:322:0x046c, B:326:0x049e, B:268:0x0306, B:273:0x0331, B:275:0x0339, B:277:0x0341, B:281:0x0355, B:285:0x0363, B:289:0x036e, B:292:0x0380, B:297:0x03ab, B:299:0x03b1, B:300:0x03b6, B:302:0x03bc, B:295:0x0393, B:282:0x035b, B:271:0x0319, B:309:0x03e2, B:311:0x0418, B:313:0x0420, B:315:0x0424, B:316:0x0427, B:323:0x0481, B:325:0x0485, B:251:0x0245, B:200:0x00bc, B:202:0x00c0, B:206:0x00d1, B:208:0x00eb, B:210:0x00f5, B:213:0x00ff), top: B:336:0x009f, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x037f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void N(com.google.android.gms.measurement.internal.ka r22) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t9.N(com.google.android.gms.measurement.internal.ka):void");
    }

    final void O(wa waVar) {
        ka kaVarH = H(waVar.f11318e);
        if (kaVarH != null) {
            P(waVar, kaVarH);
        }
    }

    final void P(wa waVar, ka kaVar) {
        com.google.android.gms.common.internal.p.j(waVar);
        com.google.android.gms.common.internal.p.f(waVar.f11318e);
        com.google.android.gms.common.internal.p.j(waVar.f11320g);
        com.google.android.gms.common.internal.p.f(waVar.f11320g.f10792f);
        k0();
        d0();
        if (W(kaVar)) {
            if (!kaVar.f10996l) {
                Q(kaVar);
                return;
            }
            V().r0();
            try {
                Q(kaVar);
                wa waVarN0 = V().n0(waVar.f11318e, waVar.f11320g.f10792f);
                if (waVarN0 != null) {
                    this.f11254k.zzq().H().c("Removing conditional user property", waVar.f11318e, this.f11254k.C().v(waVar.f11320g.f10792f));
                    V().p0(waVar.f11318e, waVar.f11320g.f10792f);
                    if (waVarN0.f11322i) {
                        V().j0(waVar.f11318e, waVar.f11320g.f10792f);
                    }
                    r rVar = waVar.o;
                    if (rVar != null) {
                        q qVar = rVar.f11170f;
                        Bundle bundleK = qVar != null ? qVar.K() : null;
                        da daVarB = this.f11254k.B();
                        String str = waVar.f11318e;
                        r rVar2 = waVar.o;
                        S(daVarB.A(str, rVar2.f11169e, bundleK, waVarN0.f11319f, rVar2.f11172h, true, false, gb.a() && this.f11254k.a().o(t.O0)), kaVar);
                    }
                } else {
                    this.f11254k.zzq().D().c("Conditional user property doesn't exist", v3.s(waVar.f11318e), this.f11254k.C().v(waVar.f11320g.f10792f));
                }
                V().s();
            } finally {
                V().w0();
            }
        }
    }

    final f4 Q(ka kaVar) {
        k0();
        d0();
        com.google.android.gms.common.internal.p.j(kaVar);
        com.google.android.gms.common.internal.p.f(kaVar.f10989e);
        f4 f4VarH0 = V().h0(kaVar.f10989e);
        d dVarK = d.a;
        if (ec.a() && this.f11254k.a().o(t.L0)) {
            dVarK = b(kaVar.f10989e).k(d.b(kaVar.A));
        }
        String strT = (ec.a() && this.f11254k.a().o(t.L0) && !dVarK.o()) ? "" : this.f11253j.t(kaVar.f10989e);
        if (!yc.a() || !this.f11254k.a().o(t.p0)) {
            return c(kaVar, f4VarH0, strT);
        }
        if (f4VarH0 == null) {
            f4VarH0 = new f4(this.f11254k, kaVar.f10989e);
            if (ec.a() && this.f11254k.a().o(t.L0)) {
                if (dVarK.q()) {
                    f4VarH0.c(f(dVarK));
                }
                if (dVarK.o()) {
                    f4VarH0.C(strT);
                }
            } else {
                f4VarH0.c(m0());
                f4VarH0.C(strT);
            }
        } else if ((!ec.a() || !this.f11254k.a().o(t.L0) || dVarK.o()) && !strT.equals(f4VarH0.J())) {
            f4VarH0.C(strT);
            if (ec.a() && this.f11254k.a().o(t.L0)) {
                f4VarH0.c(f(dVarK));
            } else {
                f4VarH0.c(m0());
            }
        } else if (ec.a() && this.f11254k.a().o(t.L0) && TextUtils.isEmpty(f4VarH0.x()) && dVarK.q()) {
            f4VarH0.c(f(dVarK));
        }
        f4VarH0.r(kaVar.f10990f);
        f4VarH0.v(kaVar.v);
        if (pd.a() && this.f11254k.a().y(f4VarH0.t(), t.k0)) {
            f4VarH0.z(kaVar.z);
        }
        if (!TextUtils.isEmpty(kaVar.o)) {
            f4VarH0.F(kaVar.o);
        }
        long j2 = kaVar.f10993i;
        if (j2 != 0) {
            f4VarH0.y(j2);
        }
        if (!TextUtils.isEmpty(kaVar.f10991g)) {
            f4VarH0.I(kaVar.f10991g);
        }
        f4VarH0.u(kaVar.n);
        String str = kaVar.f10992h;
        if (str != null) {
            f4VarH0.L(str);
        }
        f4VarH0.B(kaVar.f10994j);
        f4VarH0.e(kaVar.f10996l);
        if (!TextUtils.isEmpty(kaVar.f10995k)) {
            f4VarH0.O(kaVar.f10995k);
        }
        if (!this.f11254k.a().o(t.A0)) {
            f4VarH0.c0(kaVar.p);
        }
        f4VarH0.s(kaVar.s);
        f4VarH0.w(kaVar.t);
        f4VarH0.b(kaVar.w);
        f4VarH0.E(kaVar.x);
        if (f4VarH0.f()) {
            V().M(f4VarH0);
        }
        return f4VarH0;
    }

    public final u4 R() {
        L(this.f11245b);
        return this.f11245b;
    }

    public final c4 T() {
        L(this.f11246c);
        return this.f11246c;
    }

    final String U(ka kaVar) {
        try {
            return (String) this.f11254k.zzp().r(new x9(this, kaVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.f11254k.zzq().A().c("Failed to get app instance id. appId", v3.s(kaVar.f10989e), e2);
            return null;
        }
    }

    public final g V() {
        L(this.f11247d);
        return this.f11247d;
    }

    public final oa X() {
        L(this.f11250g);
        return this.f11250g;
    }

    public final o7 Y() {
        L(this.f11252i);
        return this.f11252i;
    }

    public final z9 Z() {
        L(this.f11251h);
        return this.f11251h;
    }

    public final y8 a0() {
        return this.f11253j;
    }

    final d b(String str) {
        d dVar = d.a;
        if (!ec.a() || !this.f11254k.a().o(t.L0)) {
            return dVar;
        }
        k0();
        d0();
        d dVar2 = this.z.get(str);
        if (dVar2 != null) {
            return dVar2;
        }
        d dVarA0 = V().A0(str);
        if (dVarA0 != null) {
            dVar = dVarA0;
        }
        x(str, dVar);
        return dVar;
    }

    public final t3 b0() {
        return this.f11254k.C();
    }

    public final da c0() {
        return this.f11254k.B();
    }

    final void d0() {
        if (!this.f11255l) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void e0() {
        f4 f4VarH0;
        String strY;
        k0();
        d0();
        this.t = true;
        try {
            Boolean boolV = this.f11254k.K().V();
            if (boolV == null) {
                this.f11254k.zzq().D().a("Upload data called on the client side before use of service was decided");
                return;
            }
            if (boolV.booleanValue()) {
                this.f11254k.zzq().A().a("Upload called in the client side when service should be used");
                return;
            }
            if (this.n > 0) {
                D();
                return;
            }
            k0();
            if (this.w != null) {
                this.f11254k.zzq().I().a("Uploading requested multiple times");
                return;
            }
            if (!T().v()) {
                this.f11254k.zzq().I().a("Network not connected, ignoring upload request");
                D();
                return;
            }
            long jA = this.f11254k.zzl().a();
            int iQ = this.f11254k.a().q(null, t.R);
            long jL = jA - c.L();
            for (int i2 = 0; i2 < iQ && B(null, jL); i2++) {
            }
            long jA2 = this.f11254k.s().f10926f.a();
            if (jA2 != 0) {
                this.f11254k.zzq().H().b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jA - jA2)));
            }
            String strU = V().u();
            if (TextUtils.isEmpty(strU)) {
                this.y = -1L;
                String strE = V().E(jA - c.L());
                if (!TextUtils.isEmpty(strE) && (f4VarH0 = V().h0(strE)) != null) {
                    n(f4VarH0);
                }
            } else {
                if (this.y == -1) {
                    this.y = V().G0();
                }
                List<Pair<e.c.b.b.c.e.k1, Long>> listH = V().H(strU, this.f11254k.a().q(strU, t.f11224h), Math.max(0, this.f11254k.a().q(strU, t.f11225i)));
                if (!listH.isEmpty()) {
                    if (!ec.a() || !this.f11254k.a().o(t.L0) || b(strU).o()) {
                        Iterator<Pair<e.c.b.b.c.e.k1, Long>> it = listH.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                strY = null;
                                break;
                            }
                            e.c.b.b.c.e.k1 k1Var = (e.c.b.b.c.e.k1) it.next().first;
                            if (!TextUtils.isEmpty(k1Var.Y())) {
                                strY = k1Var.Y();
                                break;
                            }
                        }
                        if (strY != null) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= listH.size()) {
                                    break;
                                }
                                e.c.b.b.c.e.k1 k1Var2 = (e.c.b.b.c.e.k1) listH.get(i3).first;
                                if (!TextUtils.isEmpty(k1Var2.Y()) && !k1Var2.Y().equals(strY)) {
                                    listH = listH.subList(0, i3);
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                    j1.a aVarC = e.c.b.b.c.e.j1.C();
                    int size = listH.size();
                    ArrayList arrayList = new ArrayList(listH.size());
                    boolean z = this.f11254k.a().E(strU) && !(ec.a() && this.f11254k.a().o(t.L0) && !b(strU).o());
                    boolean z2 = (ec.a() && this.f11254k.a().o(t.L0) && !b(strU).o()) ? false : true;
                    boolean z3 = (ec.a() && this.f11254k.a().o(t.L0) && !b(strU).q()) ? false : true;
                    int i4 = 0;
                    while (i4 < size) {
                        k1.a aVarU = ((e.c.b.b.c.e.k1) listH.get(i4).first).u();
                        arrayList.add((Long) listH.get(i4).second);
                        ArrayList arrayList2 = arrayList;
                        aVarU.f0(33025L).t(jA).H(false);
                        if (!z) {
                            aVarU.K0();
                        }
                        if (ec.a() && this.f11254k.a().o(t.L0)) {
                            if (!z2) {
                                aVarU.s0();
                                aVarU.v0();
                            }
                            if (!z3) {
                                aVarU.y0();
                            }
                        }
                        if (this.f11254k.a().y(strU, t.Y)) {
                            aVarU.w0(Z().t(((e.c.b.b.c.e.k1) ((e.c.b.b.c.e.o7) aVarU.zzy())).i()));
                        }
                        aVarC.q(aVarU);
                        i4++;
                        arrayList = arrayList2;
                    }
                    ArrayList arrayList3 = arrayList;
                    String strA = this.f11254k.zzq().x(2) ? Z().A((e.c.b.b.c.e.j1) ((e.c.b.b.c.e.o7) aVarC.zzy())) : null;
                    Z();
                    byte[] bArrI = ((e.c.b.b.c.e.j1) ((e.c.b.b.c.e.o7) aVarC.zzy())).i();
                    String strA2 = t.r.a(null);
                    try {
                        URL url = new URL(strA2);
                        com.google.android.gms.common.internal.p.a(!arrayList3.isEmpty());
                        if (this.w != null) {
                            this.f11254k.zzq().A().a("Set uploading progress before finishing the previous upload");
                        } else {
                            this.w = new ArrayList(arrayList3);
                        }
                        this.f11254k.s().f10927g.b(jA);
                        String strV2 = CallerData.NA;
                        if (size > 0) {
                            strV2 = aVarC.r(0).V2();
                        }
                        this.f11254k.zzq().I().d("Uploading data. app, uncompressed size, data", strV2, Integer.valueOf(bArrI.length), strA);
                        this.s = true;
                        c4 c4VarT = T();
                        v9 v9Var = new v9(this, strU);
                        c4VarT.d();
                        c4VarT.p();
                        com.google.android.gms.common.internal.p.j(url);
                        com.google.android.gms.common.internal.p.j(bArrI);
                        com.google.android.gms.common.internal.p.j(v9Var);
                        c4VarT.zzp().A(new h4(c4VarT, strU, url, bArrI, null, v9Var));
                    } catch (MalformedURLException unused) {
                        this.f11254k.zzq().A().c("Failed to parse upload URL. Not uploading. appId", v3.s(strU), strA2);
                    }
                }
            }
        } finally {
            this.t = false;
            E();
        }
    }

    final void f0() {
        k0();
        d0();
        if (this.f11256m) {
            return;
        }
        this.f11256m = true;
        if (F()) {
            int iA = a(this.v);
            int iB = this.f11254k.M().B();
            k0();
            if (iA > iB) {
                this.f11254k.zzq().A().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(iA), Integer.valueOf(iB));
            } else if (iA < iB) {
                if (z(iB, this.v)) {
                    this.f11254k.zzq().I().c("Storage version upgraded. Previous, current version", Integer.valueOf(iA), Integer.valueOf(iB));
                } else {
                    this.f11254k.zzq().A().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(iA), Integer.valueOf(iB));
                }
            }
        }
    }

    protected final void g() {
        this.f11254k.zzp().d();
        V().B0();
        if (this.f11254k.s().f10926f.a() == 0) {
            this.f11254k.s().f10926f.b(this.f11254k.zzl().a());
        }
        D();
    }

    final void g0() {
        this.q++;
    }

    final void h(int i2, Throwable th, byte[] bArr, String str) {
        g gVarV;
        long jLongValue;
        k0();
        d0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.s = false;
                E();
            }
        }
        List<Long> list = this.w;
        this.w = null;
        boolean z = true;
        if ((i2 == 200 || i2 == 204) && th == null) {
            try {
                this.f11254k.s().f10926f.b(this.f11254k.zzl().a());
                this.f11254k.s().f10927g.b(0L);
                D();
                this.f11254k.zzq().I().c("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                V().r0();
                try {
                    for (Long l2 : list) {
                        try {
                            gVarV = V();
                            jLongValue = l2.longValue();
                            gVarV.d();
                            gVarV.p();
                        } catch (SQLiteException e2) {
                            List<Long> list2 = this.x;
                            if (list2 == null || !list2.contains(l2)) {
                                throw e2;
                            }
                        }
                        try {
                            if (gVarV.t().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e3) {
                            gVarV.zzq().A().b("Failed to delete a bundle in a queue table", e3);
                            throw e3;
                        }
                    }
                    V().s();
                    V().w0();
                    this.x = null;
                    if (T().v() && C()) {
                        e0();
                    } else {
                        this.y = -1L;
                        D();
                    }
                    this.n = 0L;
                } catch (Throwable th2) {
                    V().w0();
                    throw th2;
                }
            } catch (SQLiteException e4) {
                this.f11254k.zzq().A().b("Database error while trying to delete uploaded bundles", e4);
                this.n = this.f11254k.zzl().c();
                this.f11254k.zzq().I().b("Disable upload, time", Long.valueOf(this.n));
            }
        } else {
            this.f11254k.zzq().I().c("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            this.f11254k.s().f10927g.b(this.f11254k.zzl().a());
            if (i2 != 503 && i2 != 429) {
                z = false;
            }
            if (z) {
                this.f11254k.s().f10928h.b(this.f11254k.zzl().a());
            }
            V().O(list);
            D();
        }
    }

    final z4 h0() {
        return this.f11254k;
    }

    final void l(r rVar, ka kaVar) {
        List<wa> listJ;
        List<wa> listJ2;
        List<wa> listJ3;
        r rVar2 = rVar;
        com.google.android.gms.common.internal.p.j(kaVar);
        com.google.android.gms.common.internal.p.f(kaVar.f10989e);
        k0();
        d0();
        String str = kaVar.f10989e;
        long j2 = rVar2.f11172h;
        Z();
        if (z9.P(rVar, kaVar)) {
            if (!kaVar.f10996l) {
                Q(kaVar);
                return;
            }
            List<String> list = kaVar.y;
            if (list != null) {
                if (!list.contains(rVar2.f11169e)) {
                    this.f11254k.zzq().H().d("Dropping non-safelisted event. appId, event name, origin", str, rVar2.f11169e, rVar2.f11171g);
                    return;
                } else {
                    Bundle bundleK = rVar2.f11170f.K();
                    bundleK.putLong("ga_safelisted", 1L);
                    rVar2 = new r(rVar2.f11169e, new q(bundleK), rVar2.f11171g, rVar2.f11172h);
                }
            }
            V().r0();
            try {
                g gVarV = V();
                com.google.android.gms.common.internal.p.f(str);
                gVarV.d();
                gVarV.p();
                if (j2 < 0) {
                    gVarV.zzq().D().c("Invalid time querying timed out conditional properties", v3.s(str), Long.valueOf(j2));
                    listJ = Collections.emptyList();
                } else {
                    listJ = gVarV.J("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j2)});
                }
                for (wa waVar : listJ) {
                    if (waVar != null) {
                        this.f11254k.zzq().I().d("User property timed out", waVar.f11318e, this.f11254k.C().v(waVar.f11320g.f10792f), waVar.f11320g.c());
                        if (waVar.f11324k != null) {
                            S(new r(waVar.f11324k, j2), kaVar);
                        }
                        V().p0(str, waVar.f11320g.f10792f);
                    }
                }
                g gVarV2 = V();
                com.google.android.gms.common.internal.p.f(str);
                gVarV2.d();
                gVarV2.p();
                if (j2 < 0) {
                    gVarV2.zzq().D().c("Invalid time querying expired conditional properties", v3.s(str), Long.valueOf(j2));
                    listJ2 = Collections.emptyList();
                } else {
                    listJ2 = gVarV2.J("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(listJ2.size());
                for (wa waVar2 : listJ2) {
                    if (waVar2 != null) {
                        this.f11254k.zzq().I().d("User property expired", waVar2.f11318e, this.f11254k.C().v(waVar2.f11320g.f10792f), waVar2.f11320g.c());
                        V().j0(str, waVar2.f11320g.f10792f);
                        r rVar3 = waVar2.o;
                        if (rVar3 != null) {
                            arrayList.add(rVar3);
                        }
                        V().p0(str, waVar2.f11320g.f10792f);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    S(new r((r) obj, j2), kaVar);
                }
                g gVarV3 = V();
                String str2 = rVar2.f11169e;
                com.google.android.gms.common.internal.p.f(str);
                com.google.android.gms.common.internal.p.f(str2);
                gVarV3.d();
                gVarV3.p();
                if (j2 < 0) {
                    gVarV3.zzq().D().d("Invalid time querying triggered conditional properties", v3.s(str), gVarV3.f().r(str2), Long.valueOf(j2));
                    listJ3 = Collections.emptyList();
                } else {
                    listJ3 = gVarV3.J("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(listJ3.size());
                for (wa waVar3 : listJ3) {
                    if (waVar3 != null) {
                        ca caVar = waVar3.f11320g;
                        ea eaVar = new ea(waVar3.f11318e, waVar3.f11319f, caVar.f10792f, j2, caVar.c());
                        if (V().R(eaVar)) {
                            this.f11254k.zzq().I().d("User property triggered", waVar3.f11318e, this.f11254k.C().v(eaVar.f10849c), eaVar.f10851e);
                        } else {
                            this.f11254k.zzq().A().d("Too many active user properties, ignoring", v3.s(waVar3.f11318e), this.f11254k.C().v(eaVar.f10849c), eaVar.f10851e);
                        }
                        r rVar4 = waVar3.f11326m;
                        if (rVar4 != null) {
                            arrayList2.add(rVar4);
                        }
                        waVar3.f11320g = new ca(eaVar);
                        waVar3.f11322i = true;
                        V().S(waVar3);
                    }
                }
                S(rVar2, kaVar);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    S(new r((r) obj2, j2), kaVar);
                }
                V().s();
            } finally {
                V().w0();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void m(com.google.android.gms.measurement.internal.r r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t9.m(com.google.android.gms.measurement.internal.r, java.lang.String):void");
    }

    final void o(q9 q9Var) {
        this.p++;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void r(com.google.android.gms.measurement.internal.ca r14, com.google.android.gms.measurement.internal.ka r15) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t9.r(com.google.android.gms.measurement.internal.ca, com.google.android.gms.measurement.internal.ka):void");
    }

    final void s(ka kaVar) {
        if (this.w != null) {
            ArrayList arrayList = new ArrayList();
            this.x = arrayList;
            arrayList.addAll(this.w);
        }
        g gVarV = V();
        String str = kaVar.f10989e;
        com.google.android.gms.common.internal.p.f(str);
        gVarV.d();
        gVarV.p();
        try {
            SQLiteDatabase sQLiteDatabaseT = gVarV.t();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseT.delete("apps", "app_id=?", strArr) + 0 + sQLiteDatabaseT.delete("events", "app_id=?", strArr) + sQLiteDatabaseT.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseT.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseT.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseT.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseT.delete("queue", "app_id=?", strArr) + sQLiteDatabaseT.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseT.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseT.delete("default_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                gVarV.zzq().I().c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e2) {
            gVarV.zzq().A().c("Error resetting analytics data. appId, error", v3.s(str), e2);
        }
        if (kaVar.f10996l) {
            N(kaVar);
        }
    }

    final void t(wa waVar) {
        ka kaVarH = H(waVar.f11318e);
        if (kaVarH != null) {
            u(waVar, kaVarH);
        }
    }

    final void u(wa waVar, ka kaVar) {
        boolean z;
        com.google.android.gms.common.internal.p.j(waVar);
        com.google.android.gms.common.internal.p.f(waVar.f11318e);
        com.google.android.gms.common.internal.p.j(waVar.f11319f);
        com.google.android.gms.common.internal.p.j(waVar.f11320g);
        com.google.android.gms.common.internal.p.f(waVar.f11320g.f10792f);
        k0();
        d0();
        if (W(kaVar)) {
            if (!kaVar.f10996l) {
                Q(kaVar);
                return;
            }
            wa waVar2 = new wa(waVar);
            boolean z2 = false;
            waVar2.f11322i = false;
            V().r0();
            try {
                wa waVarN0 = V().n0(waVar2.f11318e, waVar2.f11320g.f10792f);
                if (waVarN0 != null && !waVarN0.f11319f.equals(waVar2.f11319f)) {
                    this.f11254k.zzq().D().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f11254k.C().v(waVar2.f11320g.f10792f), waVar2.f11319f, waVarN0.f11319f);
                }
                if (waVarN0 != null && (z = waVarN0.f11322i)) {
                    waVar2.f11319f = waVarN0.f11319f;
                    waVar2.f11321h = waVarN0.f11321h;
                    waVar2.f11325l = waVarN0.f11325l;
                    waVar2.f11323j = waVarN0.f11323j;
                    waVar2.f11326m = waVarN0.f11326m;
                    waVar2.f11322i = z;
                    ca caVar = waVar2.f11320g;
                    waVar2.f11320g = new ca(caVar.f10792f, waVarN0.f11320g.f10793g, caVar.c(), waVarN0.f11320g.f10797k);
                } else if (TextUtils.isEmpty(waVar2.f11323j)) {
                    ca caVar2 = waVar2.f11320g;
                    waVar2.f11320g = new ca(caVar2.f10792f, waVar2.f11321h, caVar2.c(), waVar2.f11320g.f10797k);
                    waVar2.f11322i = true;
                    z2 = true;
                }
                if (waVar2.f11322i) {
                    ca caVar3 = waVar2.f11320g;
                    ea eaVar = new ea(waVar2.f11318e, waVar2.f11319f, caVar3.f10792f, caVar3.f10793g, caVar3.c());
                    if (V().R(eaVar)) {
                        this.f11254k.zzq().H().d("User property updated immediately", waVar2.f11318e, this.f11254k.C().v(eaVar.f10849c), eaVar.f10851e);
                    } else {
                        this.f11254k.zzq().A().d("(2)Too many active user properties, ignoring", v3.s(waVar2.f11318e), this.f11254k.C().v(eaVar.f10849c), eaVar.f10851e);
                    }
                    if (z2 && waVar2.f11326m != null) {
                        S(new r(waVar2.f11326m, waVar2.f11321h), kaVar);
                    }
                }
                if (V().S(waVar2)) {
                    this.f11254k.zzq().H().d("Conditional property added", waVar2.f11318e, this.f11254k.C().v(waVar2.f11320g.f10792f), waVar2.f11320g.c());
                } else {
                    this.f11254k.zzq().A().d("Too many conditional properties, ignoring", v3.s(waVar2.f11318e), this.f11254k.C().v(waVar2.f11320g.f10792f), waVar2.f11320g.c());
                }
                V().s();
            } finally {
                V().w0();
            }
        }
    }

    final void v(Runnable runnable) {
        k0();
        if (this.o == null) {
            this.o = new ArrayList();
        }
        this.o.add(runnable);
    }

    final void w(String str, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        k0();
        d0();
        com.google.android.gms.common.internal.p.f(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.r = false;
                E();
            }
        }
        this.f11254k.zzq().I().b("onConfigFetched. Response size", Integer.valueOf(bArr.length));
        V().r0();
        try {
            f4 f4VarH0 = V().h0(str);
            boolean z = true;
            boolean z2 = (i2 == 200 || i2 == 204 || i2 == 304) && th == null;
            if (f4VarH0 == null) {
                this.f11254k.zzq().D().b("App does not exist in onConfigFetched. appId", v3.s(str));
            } else if (z2 || i2 == 404) {
                List<String> list = map != null ? map.get("Last-Modified") : null;
                String str2 = (list == null || list.size() <= 0) ? null : list.get(0);
                if (i2 == 404 || i2 == 304) {
                    if (R().s(str) == null && !R().w(str, null, null)) {
                        return;
                    }
                } else if (!R().w(str, bArr, str2)) {
                    return;
                }
                f4VarH0.K(this.f11254k.zzl().a());
                V().M(f4VarH0);
                if (i2 == 404) {
                    this.f11254k.zzq().F().b("Config not found. Using empty config. appId", str);
                } else {
                    this.f11254k.zzq().I().c("Successfully fetched config. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                }
                if (T().v() && C()) {
                    e0();
                } else {
                    D();
                }
            } else {
                f4VarH0.N(this.f11254k.zzl().a());
                V().M(f4VarH0);
                this.f11254k.zzq().I().c("Fetching config failed. code, error", Integer.valueOf(i2), th);
                R().z(str);
                this.f11254k.s().f10927g.b(this.f11254k.zzl().a());
                if (i2 != 503 && i2 != 429) {
                    z = false;
                }
                if (z) {
                    this.f11254k.s().f10928h.b(this.f11254k.zzl().a());
                }
                D();
            }
            V().s();
        } finally {
            V().w0();
        }
    }

    final void x(String str, d dVar) {
        if (ec.a() && this.f11254k.a().o(t.L0)) {
            k0();
            d0();
            this.z.put(str, dVar);
            g gVarV = V();
            if (ec.a() && gVarV.i().o(t.L0)) {
                com.google.android.gms.common.internal.p.j(str);
                com.google.android.gms.common.internal.p.j(dVar);
                gVarV.d();
                gVarV.p();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("consent_state", dVar.e());
                try {
                    if (gVarV.t().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                        gVarV.zzq().A().b("Failed to insert/update consent setting (got -1). appId", v3.s(str));
                    }
                } catch (SQLiteException e2) {
                    gVarV.zzq().A().c("Error storing consent setting. appId, error", v3.s(str), e2);
                }
            }
        }
    }

    final void y(boolean z) {
        D();
    }

    @Override // com.google.android.gms.measurement.internal.z5
    public final com.google.android.gms.common.util.f zzl() {
        return this.f11254k.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.z5
    public final Context zzm() {
        return this.f11254k.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.z5
    public final w4 zzp() {
        return this.f11254k.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.z5
    public final v3 zzq() {
        return this.f11254k.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.z5
    public final ta zzt() {
        return this.f11254k.zzt();
    }

    private t9(aa aaVar, z4 z4Var) {
        this.f11255l = false;
        this.A = new w9(this);
        com.google.android.gms.common.internal.p.j(aaVar);
        z4 z4VarB = z4.b(aaVar.a, null, null);
        this.f11254k = z4VarB;
        this.y = -1L;
        z9 z9Var = new z9(this);
        z9Var.q();
        this.f11251h = z9Var;
        c4 c4Var = new c4(this);
        c4Var.q();
        this.f11246c = c4Var;
        u4 u4Var = new u4(this);
        u4Var.q();
        this.f11245b = u4Var;
        this.z = new HashMap();
        z4VarB.zzp().u(new s9(this, aaVar));
    }
}