package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.w.b;
import e.c.b.b.c.e.g1;
import e.c.b.b.c.e.i1;
import e.c.b.b.c.e.k1;
import e.c.b.b.c.e.o1;
import j$.util.Spliterator;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class z9 extends q9 {
    z9(t9 t9Var) {
        super(t9Var);
    }

    private static String B(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static List<Long> C(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            long j2 = 0;
            for (int i3 = 0; i3 < 64; i3++) {
                int i4 = (i2 << 6) + i3;
                if (i4 < bitSet.length()) {
                    if (bitSet.get(i4)) {
                        j2 |= 1 << i3;
                    }
                }
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    private static List<e.c.b.b.c.e.i1> E(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                i1.a aVarC0 = e.c.b.b.c.e.i1.c0();
                for (String str : bundle.keySet()) {
                    i1.a aVarV = e.c.b.b.c.e.i1.c0().v(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        aVarV.s(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        aVarV.x((String) obj);
                    } else if (obj instanceof Double) {
                        aVarV.r(((Double) obj).doubleValue());
                    }
                    aVarC0.t(aVarV);
                }
                if (aVarC0.z() > 0) {
                    arrayList.add((e.c.b.b.c.e.i1) ((e.c.b.b.c.e.o7) aVarC0.zzy()));
                }
            }
        }
        return arrayList;
    }

    static void F(g1.a aVar, String str, Object obj) {
        List<e.c.b.b.c.e.i1> listY = aVar.y();
        int i2 = 0;
        while (true) {
            if (i2 >= listY.size()) {
                i2 = -1;
                break;
            } else if (str.equals(listY.get(i2).J())) {
                break;
            } else {
                i2++;
            }
        }
        i1.a aVarV = e.c.b.b.c.e.i1.c0().v(str);
        if (obj instanceof Long) {
            aVarV.s(((Long) obj).longValue());
        } else if (obj instanceof String) {
            aVarV.x((String) obj);
        } else if (obj instanceof Double) {
            aVarV.r(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            aVarV.u(E((Bundle[]) obj));
        }
        if (i2 >= 0) {
            aVar.q(i2, aVarV);
        } else {
            aVar.t(aVarV);
        }
    }

    private static void I(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
    }

    private final void J(StringBuilder sb, int i2, e.c.b.b.c.e.q0 q0Var) {
        if (q0Var == null) {
            return;
        }
        I(sb, i2);
        sb.append("filter {\n");
        if (q0Var.E()) {
            M(sb, i2, "complement", Boolean.valueOf(q0Var.F()));
        }
        if (q0Var.G()) {
            M(sb, i2, "param_name", f().u(q0Var.H()));
        }
        if (q0Var.A()) {
            int i3 = i2 + 1;
            e.c.b.b.c.e.t0 t0VarB = q0Var.B();
            if (t0VarB != null) {
                I(sb, i3);
                sb.append("string_filter");
                sb.append(" {\n");
                if (t0VarB.y()) {
                    M(sb, i3, "match_type", t0VarB.z().name());
                }
                if (t0VarB.A()) {
                    M(sb, i3, "expression", t0VarB.B());
                }
                if (t0VarB.C()) {
                    M(sb, i3, "case_sensitive", Boolean.valueOf(t0VarB.D()));
                }
                if (t0VarB.F() > 0) {
                    I(sb, i3 + 1);
                    sb.append("expression_list {\n");
                    for (String str : t0VarB.E()) {
                        I(sb, i3 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                I(sb, i3);
                sb.append("}\n");
            }
        }
        if (q0Var.C()) {
            K(sb, i2 + 1, "number_filter", q0Var.D());
        }
        I(sb, i2);
        sb.append("}\n");
    }

    private static void K(StringBuilder sb, int i2, String str, e.c.b.b.c.e.r0 r0Var) {
        if (r0Var == null) {
            return;
        }
        I(sb, i2);
        sb.append(str);
        sb.append(" {\n");
        if (r0Var.y()) {
            M(sb, i2, "comparison_type", r0Var.z().name());
        }
        if (r0Var.A()) {
            M(sb, i2, "match_as_float", Boolean.valueOf(r0Var.B()));
        }
        if (r0Var.C()) {
            M(sb, i2, "comparison_value", r0Var.D());
        }
        if (r0Var.E()) {
            M(sb, i2, "min_comparison_value", r0Var.F());
        }
        if (r0Var.G()) {
            M(sb, i2, "max_comparison_value", r0Var.H());
        }
        I(sb, i2);
        sb.append("}\n");
    }

    private static void L(StringBuilder sb, int i2, String str, e.c.b.b.c.e.m1 m1Var, String str2) {
        if (m1Var == null) {
            return;
        }
        I(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (m1Var.N() != 0) {
            I(sb, 4);
            sb.append("results: ");
            int i3 = 0;
            for (Long l2 : m1Var.K()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (m1Var.E() != 0) {
            I(sb, 4);
            sb.append("status: ");
            int i5 = 0;
            for (Long l3 : m1Var.z()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(l3);
                i5 = i6;
            }
            sb.append('\n');
        }
        if (m1Var.U() != 0) {
            I(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i7 = 0;
            for (e.c.b.b.c.e.f1 f1Var : m1Var.S()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(f1Var.C() ? Integer.valueOf(f1Var.D()) : null);
                sb.append(":");
                sb.append(f1Var.E() ? Long.valueOf(f1Var.F()) : null);
                i7 = i8;
            }
            sb.append("}\n");
        }
        if (m1Var.W() != 0) {
            I(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i9 = 0;
            for (e.c.b.b.c.e.n1 n1Var : m1Var.V()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(n1Var.C() ? Integer.valueOf(n1Var.D()) : null);
                sb.append(": [");
                Iterator<Long> it = n1Var.F().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i11 = i12;
                }
                sb.append("]");
                i9 = i10;
            }
            sb.append("}\n");
        }
        I(sb, 3);
        sb.append("}\n");
    }

    private static void M(StringBuilder sb, int i2, String str, Object obj) {
        if (obj == null) {
            return;
        }
        I(sb, i2 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private final void N(StringBuilder sb, int i2, List<e.c.b.b.c.e.i1> list) {
        if (list == null) {
            return;
        }
        int i3 = i2 + 1;
        for (e.c.b.b.c.e.i1 i1Var : list) {
            if (i1Var != null) {
                I(sb, i3);
                sb.append("param {\n");
                M(sb, i3, Action.NAME_ATTRIBUTE, i1Var.I() ? f().u(i1Var.J()) : null);
                M(sb, i3, "string_value", i1Var.O() ? i1Var.P() : null);
                M(sb, i3, "int_value", i1Var.T() ? Long.valueOf(i1Var.U()) : null);
                M(sb, i3, "double_value", i1Var.X() ? Double.valueOf(i1Var.Y()) : null);
                if (i1Var.a0() > 0) {
                    N(sb, i3, i1Var.Z());
                }
                I(sb, i3);
                sb.append("}\n");
            }
        }
    }

    static boolean P(r rVar, ka kaVar) {
        com.google.android.gms.common.internal.p.j(rVar);
        com.google.android.gms.common.internal.p.j(kaVar);
        return (TextUtils.isEmpty(kaVar.f10990f) && TextUtils.isEmpty(kaVar.v)) ? false : true;
    }

    static boolean Q(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean R(List<Long> list, int i2) {
        if (i2 < (list.size() << 6)) {
            return ((1 << (i2 % 64)) & list.get(i2 / 64).longValue()) != 0;
        }
        return false;
    }

    static Object S(e.c.b.b.c.e.g1 g1Var, String str) {
        e.c.b.b.c.e.i1 i1VarW = w(g1Var, str);
        if (i1VarW == null) {
            return null;
        }
        if (i1VarW.O()) {
            return i1VarW.P();
        }
        if (i1VarW.T()) {
            return Long.valueOf(i1VarW.U());
        }
        if (i1VarW.X()) {
            return Double.valueOf(i1VarW.Y());
        }
        if (i1VarW.a0() <= 0) {
            return null;
        }
        List<e.c.b.b.c.e.i1> listZ = i1VarW.Z();
        ArrayList arrayList = new ArrayList();
        for (e.c.b.b.c.e.i1 i1Var : listZ) {
            if (i1Var != null) {
                Bundle bundle = new Bundle();
                for (e.c.b.b.c.e.i1 i1Var2 : i1Var.Z()) {
                    if (i1Var2.O()) {
                        bundle.putString(i1Var2.J(), i1Var2.P());
                    } else if (i1Var2.T()) {
                        bundle.putLong(i1Var2.J(), i1Var2.U());
                    } else if (i1Var2.X()) {
                        bundle.putDouble(i1Var2.J(), i1Var2.Y());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static int s(k1.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i2 = 0; i2 < aVar.U(); i2++) {
            if (str.equals(aVar.S(i2).M())) {
                return i2;
            }
        }
        return -1;
    }

    static e.c.b.b.c.e.i1 w(e.c.b.b.c.e.g1 g1Var, String str) {
        for (e.c.b.b.c.e.i1 i1Var : g1Var.z()) {
            if (i1Var.J().equals(str)) {
                return i1Var;
            }
        }
        return null;
    }

    static <Builder extends e.c.b.b.c.e.a9> Builder x(Builder builder, byte[] bArr) {
        e.c.b.b.c.e.b7 b7VarC = e.c.b.b.c.e.b7.c();
        return b7VarC != null ? (Builder) builder.I0(bArr, b7VarC) : (Builder) builder.c(bArr);
    }

    final String A(e.c.b.b.c.e.j1 j1Var) {
        if (j1Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (e.c.b.b.c.e.k1 k1Var : j1Var.z()) {
            if (k1Var != null) {
                I(sb, 1);
                sb.append("bundle {\n");
                if (k1Var.U()) {
                    M(sb, 1, "protocol_version", Integer.valueOf(k1Var.w0()));
                }
                M(sb, 1, "platform", k1Var.M2());
                if (k1Var.X2()) {
                    M(sb, 1, "gmp_version", Long.valueOf(k1Var.V()));
                }
                if (k1Var.W()) {
                    M(sb, 1, "uploading_gmp_version", Long.valueOf(k1Var.X()));
                }
                if (k1Var.L0()) {
                    M(sb, 1, "dynamite_version", Long.valueOf(k1Var.M0()));
                }
                if (k1Var.q0()) {
                    M(sb, 1, "config_version", Long.valueOf(k1Var.r0()));
                }
                M(sb, 1, "gmp_app_id", k1Var.i0());
                M(sb, 1, "admob_app_id", k1Var.K0());
                M(sb, 1, "app_id", k1Var.V2());
                M(sb, 1, "app_version", k1Var.W2());
                if (k1Var.n0()) {
                    M(sb, 1, "app_version_major", Integer.valueOf(k1Var.o0()));
                }
                M(sb, 1, "firebase_instance_id", k1Var.m0());
                if (k1Var.d0()) {
                    M(sb, 1, "dev_cert_hash", Long.valueOf(k1Var.e0()));
                }
                M(sb, 1, "app_store", k1Var.U2());
                if (k1Var.U1()) {
                    M(sb, 1, "upload_timestamp_millis", Long.valueOf(k1Var.V1()));
                }
                if (k1Var.i2()) {
                    M(sb, 1, "start_timestamp_millis", Long.valueOf(k1Var.j2()));
                }
                if (k1Var.u2()) {
                    M(sb, 1, "end_timestamp_millis", Long.valueOf(k1Var.v2()));
                }
                if (k1Var.C2()) {
                    M(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(k1Var.D2()));
                }
                if (k1Var.I2()) {
                    M(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(k1Var.J2()));
                }
                M(sb, 1, "app_instance_id", k1Var.c0());
                M(sb, 1, "resettable_device_id", k1Var.Y());
                M(sb, 1, "device_id", k1Var.p0());
                M(sb, 1, "ds_id", k1Var.u0());
                if (k1Var.Z()) {
                    M(sb, 1, "limited_ad_tracking", Boolean.valueOf(k1Var.a0()));
                }
                M(sb, 1, "os_version", k1Var.P2());
                M(sb, 1, "device_model", k1Var.Q2());
                M(sb, 1, "user_default_language", k1Var.R2());
                if (k1Var.S2()) {
                    M(sb, 1, "time_zone_offset_minutes", Integer.valueOf(k1Var.T2()));
                }
                if (k1Var.f0()) {
                    M(sb, 1, "bundle_sequential_index", Integer.valueOf(k1Var.g0()));
                }
                if (k1Var.j0()) {
                    M(sb, 1, "service_upload", Boolean.valueOf(k1Var.k0()));
                }
                M(sb, 1, "health_monitor", k1Var.h0());
                if (!i().o(t.A0) && k1Var.s0() && k1Var.t0() != 0) {
                    M(sb, 1, "android_id", Long.valueOf(k1Var.t0()));
                }
                if (k1Var.v0()) {
                    M(sb, 1, "retry_counter", Integer.valueOf(k1Var.J0()));
                }
                if (k1Var.O0()) {
                    M(sb, 1, "consent_signals", k1Var.P0());
                }
                List<e.c.b.b.c.e.o1> listX1 = k1Var.x1();
                if (listX1 != null) {
                    for (e.c.b.b.c.e.o1 o1Var : listX1) {
                        if (o1Var != null) {
                            I(sb, 2);
                            sb.append("user_property {\n");
                            M(sb, 2, "set_timestamp_millis", o1Var.F() ? Long.valueOf(o1Var.G()) : null);
                            M(sb, 2, Action.NAME_ATTRIBUTE, f().v(o1Var.M()));
                            M(sb, 2, "string_value", o1Var.P());
                            M(sb, 2, "int_value", o1Var.Q() ? Long.valueOf(o1Var.S()) : null);
                            M(sb, 2, "double_value", o1Var.T() ? Double.valueOf(o1Var.U()) : null);
                            I(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<e.c.b.b.c.e.e1> listL0 = k1Var.l0();
                String strV2 = k1Var.V2();
                if (listL0 != null) {
                    for (e.c.b.b.c.e.e1 e1Var : listL0) {
                        if (e1Var != null) {
                            I(sb, 2);
                            sb.append("audience_membership {\n");
                            if (e1Var.E()) {
                                M(sb, 2, "audience_id", Integer.valueOf(e1Var.F()));
                            }
                            if (e1Var.L()) {
                                M(sb, 2, "new_audience", Boolean.valueOf(e1Var.M()));
                            }
                            L(sb, 2, "current_data", e1Var.I(), strV2);
                            if (e1Var.J()) {
                                L(sb, 2, "previous_data", e1Var.K(), strV2);
                            }
                            I(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<e.c.b.b.c.e.g1> listW0 = k1Var.W0();
                if (listW0 != null) {
                    for (e.c.b.b.c.e.g1 g1Var : listW0) {
                        if (g1Var != null) {
                            I(sb, 2);
                            sb.append("event {\n");
                            M(sb, 2, Action.NAME_ATTRIBUTE, f().r(g1Var.Q()));
                            if (g1Var.S()) {
                                M(sb, 2, "timestamp_millis", Long.valueOf(g1Var.T()));
                            }
                            if (g1Var.U()) {
                                M(sb, 2, "previous_timestamp_millis", Long.valueOf(g1Var.V()));
                            }
                            if (g1Var.W()) {
                                M(sb, 2, "count", Integer.valueOf(g1Var.X()));
                            }
                            if (g1Var.M() != 0) {
                                N(sb, 2, g1Var.z());
                            }
                            I(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                I(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    final List<Long> D(List<Long> list, List<Integer> list2) {
        int i2;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                zzq().D().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    zzq().D().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i3 = size2;
            i2 = size;
            size = i3;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i2);
    }

    final void G(i1.a aVar, Object obj) {
        com.google.android.gms.common.internal.p.j(obj);
        aVar.q().w().y().A();
        if (obj instanceof String) {
            aVar.x((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.s(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.r(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            aVar.u(E((Bundle[]) obj));
        } else {
            zzq().A().b("Ignoring invalid (type) event param value", obj);
        }
    }

    final void H(o1.a aVar, Object obj) {
        com.google.android.gms.common.internal.p.j(obj);
        aVar.q().u().x();
        if (obj instanceof String) {
            aVar.w((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.v(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.r(((Double) obj).doubleValue());
        } else {
            zzq().A().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final boolean O(long j2, long j3) {
        return j2 == 0 || j3 <= 0 || Math.abs(zzl().a() - j2) > j3;
    }

    final byte[] T(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[Spliterator.IMMUTABLE];
            while (true) {
                int i2 = gZIPInputStream.read(bArr2);
                if (i2 <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i2);
            }
        } catch (IOException e2) {
            zzq().A().b("Failed to ungzip content", e2);
            throw e2;
        }
    }

    final byte[] U(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            zzq().A().b("Failed to gzip content", e2);
            throw e2;
        }
    }

    final List<Integer> V() throws NumberFormatException {
        Map<String, String> mapC = t.c(this.f11187b.zzm());
        if (mapC == null || mapC.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = t.Q.a(null).intValue();
        for (Map.Entry<String, String> entry : mapC.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int i2 = Integer.parseInt(entry.getValue());
                    if (i2 != 0) {
                        arrayList.add(Integer.valueOf(i2));
                        if (arrayList.size() >= iIntValue) {
                            zzq().D().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e2) {
                    zzq().D().b("Experiment ID NumberFormatException", e2);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ l e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ t3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ da g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ i4 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ c i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ z9 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ y8 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ oa l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ g m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ u4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.q9
    protected final boolean r() {
        return false;
    }

    final long t(byte[] bArr) {
        com.google.android.gms.common.internal.p.j(bArr);
        g().d();
        MessageDigest messageDigestE0 = da.E0();
        if (messageDigestE0 != null) {
            return da.v(messageDigestE0.digest(bArr));
        }
        zzq().A().a("Failed to get MD5");
        return 0L;
    }

    final <T extends Parcelable> T u(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (b.a unused) {
            zzq().A().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    final e.c.b.b.c.e.g1 v(o oVar) {
        g1.a aVarB = e.c.b.b.c.e.g1.Y().B(oVar.f11070e);
        Iterator<String> it = oVar.f11071f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            i1.a aVarV = e.c.b.b.c.e.i1.c0().v(next);
            G(aVarV, oVar.f11071f.J(next));
            aVarB.t(aVarV);
        }
        return (e.c.b.b.c.e.g1) ((e.c.b.b.c.e.o7) aVarB.zzy());
    }

    final String y(e.c.b.b.c.e.p0 p0Var) {
        if (p0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (p0Var.D()) {
            M(sb, 0, "filter_id", Integer.valueOf(p0Var.E()));
        }
        M(sb, 0, "event_name", f().r(p0Var.F()));
        String strB = B(p0Var.K(), p0Var.L(), p0Var.N());
        if (!strB.isEmpty()) {
            M(sb, 0, "filter_type", strB);
        }
        if (p0Var.I()) {
            K(sb, 1, "event_count_filter", p0Var.J());
        }
        if (p0Var.H() > 0) {
            sb.append("  filters {\n");
            Iterator<e.c.b.b.c.e.q0> it = p0Var.G().iterator();
            while (it.hasNext()) {
                J(sb, 2, it.next());
            }
        }
        I(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    final String z(e.c.b.b.c.e.s0 s0Var) {
        if (s0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (s0Var.A()) {
            M(sb, 0, "filter_id", Integer.valueOf(s0Var.B()));
        }
        M(sb, 0, "property_name", f().v(s0Var.C()));
        String strB = B(s0Var.E(), s0Var.F(), s0Var.H());
        if (!strB.isEmpty()) {
            M(sb, 0, "filter_type", strB);
        }
        J(sb, 1, s0Var.D());
        sb.append("}\n");
        return sb.toString();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.f zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ Context zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ w4 zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ v3 zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ ta zzt() {
        return super.zzt();
    }
}