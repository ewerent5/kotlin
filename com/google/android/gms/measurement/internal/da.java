package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import ch.qos.logback.classic.turbo.ReconfigureOnChangeFilter;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import e.c.b.b.c.e.pd;
import e.c.b.b.c.e.rb;
import e.c.b.b.c.e.uf;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class da extends w5 {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f10822c = {"firebase_", "google_", "ga_"};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f10823d = {"_err"};

    /* renamed from: e, reason: collision with root package name */
    private SecureRandom f10824e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicLong f10825f;

    /* renamed from: g, reason: collision with root package name */
    private int f10826g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f10827h;

    da(z4 z4Var) {
        super(z4Var);
        this.f10827h = null;
        this.f10825f = new AtomicLong(0L);
    }

    public static boolean A0(String str) {
        for (String str2 : f10823d) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final Object B(int i2, Object obj, boolean z, boolean z2) {
        Bundle bundleX;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return D(String.valueOf(obj), i2, z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if ((parcelable instanceof Bundle) && (bundleX = x((Bundle) parcelable)) != null && !bundleX.isEmpty()) {
                arrayList.add(bundleX);
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final int B0(String str) {
        if (!c0("event param", str)) {
            return 3;
        }
        if (h0("event param", null, str)) {
            return !b0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    public static String D(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i2))).concat("...");
        }
        return null;
    }

    private final int D0(String str) {
        if (!r0("event param", str)) {
            return 3;
        }
        if (h0("event param", null, str)) {
            return !b0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    static MessageDigest E0() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    private static void F(Bundle bundle, int i2, String str, String str2, Object obj) {
        if (q0(bundle, i2)) {
            bundle.putString("_ev", D(str, 40, true));
            if (obj != null) {
                com.google.android.gms.common.internal.p.j(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    private static boolean G0(String str) {
        com.google.android.gms.common.internal.p.j(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int H0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (i().o(t.i0) && "_lgclid".equals(str)) ? 100 : 36;
    }

    private final void T(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int iB0;
        String str4;
        int iQ;
        if (bundle == null) {
            return;
        }
        int i2 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                iB0 = z ? B0(str5) : 0;
                if (iB0 == 0) {
                    iB0 = D0(str5);
                }
            } else {
                iB0 = 0;
            }
            if (iB0 != 0) {
                F(bundle, iB0, str5, str5, iB0 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (Y(bundle.get(str5))) {
                    zzq().F().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iQ = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    iQ = q(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (iQ != 0 && !"_ev".equals(str4)) {
                    F(bundle, iQ, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (Z(str4) && !g0(str4, a6.f10749d) && (i2 = i2 + 1) > 0) {
                    zzq().C().c("Item cannot contain custom parameters", f().r(str2), f().p(bundle));
                    q0(bundle, 23);
                    bundle.remove(str4);
                }
            }
        }
    }

    static boolean U(Context context, boolean z) {
        com.google.android.gms.common.internal.p.j(context);
        return Build.VERSION.SDK_INT >= 24 ? p0(context, "com.google.android.gms.measurement.AppMeasurementJobService") : p0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean V(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean W(Bundle bundle, int i2) {
        int i3 = 0;
        if (bundle.size() <= i2) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i3++;
            if (i3 > i2) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean X(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    static boolean Y(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean Z(String str) {
        com.google.android.gms.common.internal.p.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    static boolean f0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean g0(String str, String[] strArr) {
        com.google.android.gms.common.internal.p.j(strArr);
        for (String str2 : strArr) {
            if (w0(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static boolean j0(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    static byte[] k0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static Bundle n0(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        if (parcelableArr[i2] instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                        }
                        i2++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i2 < list.size()) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static ArrayList<Bundle> o0(List<wa> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (wa waVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", waVar.f11318e);
            bundle.putString("origin", waVar.f11319f);
            bundle.putLong("creation_timestamp", waVar.f11321h);
            bundle.putString(Action.NAME_ATTRIBUTE, waVar.f11320g.f10792f);
            y5.b(bundle, waVar.f11320g.c());
            bundle.putBoolean("active", waVar.f11322i);
            String str = waVar.f11323j;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            r rVar = waVar.f11324k;
            if (rVar != null) {
                bundle.putString("timed_out_event_name", rVar.f11169e);
                q qVar = waVar.f11324k.f11170f;
                if (qVar != null) {
                    bundle.putBundle("timed_out_event_params", qVar.K());
                }
            }
            bundle.putLong("trigger_timeout", waVar.f11325l);
            r rVar2 = waVar.f11326m;
            if (rVar2 != null) {
                bundle.putString("triggered_event_name", rVar2.f11169e);
                q qVar2 = waVar.f11326m.f11170f;
                if (qVar2 != null) {
                    bundle.putBundle("triggered_event_params", qVar2.K());
                }
            }
            bundle.putLong("triggered_timestamp", waVar.f11320g.f10793g);
            bundle.putLong("time_to_live", waVar.n);
            r rVar3 = waVar.o;
            if (rVar3 != null) {
                bundle.putString("expired_event_name", rVar3.f11169e);
                q qVar3 = waVar.o.f11170f;
                if (qVar3 != null) {
                    bundle.putBundle("expired_event_params", qVar3.K());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private static boolean p0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int q(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.Object r20, android.os.Bundle r21, java.util.List<java.lang.String> r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.da.q(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    private static boolean q0(Bundle bundle, int i2) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i2);
        return true;
    }

    public static long s(long j2, long j3) {
        return (j2 + (j3 * ReconfigureOnChangeFilter.DEFAULT_REFRESH_PERIOD)) / 86400000;
    }

    static Bundle[] s0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        }
        if (!(obj instanceof ArrayList)) {
            return null;
        }
        ArrayList arrayList = (ArrayList) obj;
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static long u(q qVar) {
        long length = 0;
        if (qVar == null) {
            return 0L;
        }
        Iterator<String> it = qVar.iterator();
        while (it.hasNext()) {
            if (qVar.J(it.next()) instanceof Parcelable[]) {
                length += ((Parcelable[]) r3).length;
            }
        }
        return length;
    }

    private final boolean u0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoF = com.google.android.gms.common.p.c.a(context).f(str, 64);
            if (packageInfoF == null || (signatureArr = packageInfoF.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e2) {
            zzq().A().b("Package name not found", e2);
            return true;
        } catch (CertificateException e3) {
            zzq().A().b("Error obtaining certificate", e3);
            return true;
        }
    }

    static long v(byte[] bArr) {
        com.google.android.gms.common.internal.p.j(bArr);
        int i2 = 0;
        com.google.android.gms.common.internal.p.m(bArr.length > 0);
        long j2 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j2 += (bArr[length] & 255) << i2;
            i2 += 8;
        }
        return j2;
    }

    static boolean w0(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    static boolean x0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static Bundle z(List<ca> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (ca caVar : list) {
            String str = caVar.f10796j;
            if (str != null) {
                bundle.putString(caVar.f10792f, str);
            } else {
                Long l2 = caVar.f10794h;
                if (l2 != null) {
                    bundle.putLong(caVar.f10792f, l2.longValue());
                } else {
                    Double d2 = caVar.f10798l;
                    if (d2 != null) {
                        bundle.putDouble(caVar.f10792f, d2.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    final r A(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z2, boolean z3) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (r(str2, z3) != 0) {
            zzq().A().b("Invalid conditional property event name", f().v(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleY = y(str, str2, bundle2, com.google.android.gms.common.util.g.b("_o"), false, false);
        if (z) {
            bundleY = x(bundleY);
        }
        return new r(str2, new q(bundleY), str3, j2);
    }

    final Object C(String str, Object obj) {
        if ("_ev".equals(str)) {
            return B(256, obj, true, true);
        }
        return B(x0(str) ? 256 : 100, obj, false, true);
    }

    final SecureRandom C0() {
        d();
        if (this.f10824e == null) {
            this.f10824e = new SecureRandom();
        }
        return this.f10824e;
    }

    public final URL E(long j2, String str, String str2, long j3) {
        try {
            com.google.android.gms.common.internal.p.f(str2);
            com.google.android.gms.common.internal.p.f(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j2), Integer.valueOf(F0())), str2, str, Long.valueOf(j3));
            if (str.equals(i().N())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            zzq().A().b("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            return null;
        }
    }

    public final int F0() {
        if (this.f10827h == null) {
            this.f10827h = Integer.valueOf(com.google.android.gms.common.f.f().a(zzm()) / CoreConstants.MILLIS_IN_ONE_SECOND);
        }
        return this.f10827h.intValue();
    }

    final void G(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            zzq().D().b("Params already contained engagement", Long.valueOf(j3));
        }
        bundle.putLong("_et", j2 + j3);
    }

    final void H(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                g().I(bundle, str, bundle2.get(str));
            }
        }
    }

    final void I(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            zzq().F().c("Not putting event parameter. Invalid value type. name, type", f().u(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final boolean I0() throws ClassNotFoundException {
        try {
            zzm().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void J(uf ufVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            ufVar.w(bundle);
        } catch (RemoteException e2) {
            this.a.zzq().D().b("Error returning int value to wrapper", e2);
        }
    }

    public final void K(uf ufVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            ufVar.w(bundle);
        } catch (RemoteException e2) {
            this.a.zzq().D().b("Error returning long value to wrapper", e2);
        }
    }

    public final void L(uf ufVar, Bundle bundle) {
        try {
            ufVar.w(bundle);
        } catch (RemoteException e2) {
            this.a.zzq().D().b("Error returning bundle value to wrapper", e2);
        }
    }

    public final void M(uf ufVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            ufVar.w(bundle);
        } catch (RemoteException e2) {
            this.a.zzq().D().b("Error returning string value to wrapper", e2);
        }
    }

    public final void N(uf ufVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            ufVar.w(bundle);
        } catch (RemoteException e2) {
            this.a.zzq().D().b("Error returning bundle list to wrapper", e2);
        }
    }

    public final void O(uf ufVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            ufVar.w(bundle);
        } catch (RemoteException e2) {
            this.a.zzq().D().b("Error returning boolean value to wrapper", e2);
        }
    }

    public final void P(uf ufVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            ufVar.w(bundle);
        } catch (RemoteException e2) {
            this.a.zzq().D().b("Error returning byte array to wrapper", e2);
        }
    }

    final void Q(z3 z3Var, int i2) {
        int i3 = 0;
        for (String str : new TreeSet(z3Var.f11366d.keySet())) {
            if (Z(str) && (i3 = i3 + 1) > i2) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i2);
                sb.append(" params");
                zzq().C().c(sb.toString(), f().r(z3Var.a), f().p(z3Var.f11366d));
                q0(z3Var.f11366d, 5);
                z3Var.f11366d.remove(str);
            }
        }
    }

    public final void R(ga gaVar, int i2, String str, String str2, int i3) {
        S(gaVar, null, i2, str, str2, i3);
    }

    final void S(ga gaVar, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        q0(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", i3);
        }
        if (rb.a() && i().o(t.Q0)) {
            gaVar.a(str, bundle);
        } else {
            this.a.A().R("auto", "_err", bundle);
        }
    }

    @SuppressLint({"ApplySharedPref"})
    final boolean a0(String str, double d2) {
        try {
            SharedPreferences.Editor editorEdit = zzm().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d2));
            return editorEdit.commit();
        } catch (Exception e2) {
            zzq().A().b("Failed to persist Deferred Deep Link. exception", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    final boolean b0(String str, int i2, String str2) {
        if (str2 == null) {
            zzq().C().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        }
        zzq().C().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    final boolean c0(String str, String str2) {
        if (str2 == null) {
            zzq().C().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzq().C().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            zzq().C().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzq().C().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    final boolean d0(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i2) {
                zzq().F().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ l e() {
        return super.e();
    }

    final boolean e0(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (G0(str)) {
                return true;
            }
            if (this.a.E()) {
                zzq().C().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", v3.s(str));
            }
            return false;
        }
        if (pd.a() && i().o(t.k0) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.a.E()) {
                zzq().C().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (G0(str2)) {
            return true;
        }
        zzq().C().b("Invalid admob_app_id. Analytics disabled.", v3.s(str2));
        return false;
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

    final boolean h0(String str, String[] strArr, String str2) {
        return i0(str, strArr, null, str2);
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ c i() {
        return super.i();
    }

    final boolean i0(String str, String[] strArr, String[] strArr2, String str2) {
        boolean z;
        if (str2 == null) {
            zzq().C().b("Name is required and can't be null. Type", str);
            return false;
        }
        com.google.android.gms.common.internal.p.j(str2);
        String[] strArr3 = f10822c;
        int length = strArr3.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            }
            if (str2.startsWith(strArr3[i2])) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            zzq().C().c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr == null || !g0(str2, strArr) || (strArr2 != null && g0(str2, strArr2))) {
            return true;
        }
        zzq().C().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    protected final void j() {
        d();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                zzq().D().a("Utils falling back to Random for random id");
            }
        }
        this.f10825f.set(jNextLong);
    }

    final int l0(String str) {
        if (!r0("user property", str)) {
            return 6;
        }
        if (h0("user property", d6.a, str)) {
            return !b0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    final int m0(String str, Object obj) {
        return "_ldl".equals(str) ? d0("user property referrer", str, H0(str), obj) : d0("user property", str, H0(str), obj) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.w5
    protected final boolean o() {
        return true;
    }

    public final int p(int i2) {
        return com.google.android.gms.common.f.f().h(zzm(), 12451000);
    }

    final int r(String str, boolean z) {
        if (!r0("event", str)) {
            return 2;
        }
        if (z) {
            if (!i0("event", b6.a, b6.f10767b, str)) {
                return 13;
            }
        } else if (!h0("event", b6.a, str)) {
            return 13;
        }
        return !b0("event", 40, str) ? 2 : 0;
    }

    final boolean r0(String str, String str2) {
        if (str2 == null) {
            zzq().C().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzq().C().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            zzq().C().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzq().C().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0065 -> B:17:0x0072). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final long t(android.content.Context r7, java.lang.String r8) throws java.security.NoSuchAlgorithmException {
        /*
            r6 = this;
            r6.d()
            com.google.android.gms.common.internal.p.j(r7)
            com.google.android.gms.common.internal.p.f(r8)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.security.MessageDigest r1 = E0()
            r2 = -1
            r4 = 0
            if (r1 != 0) goto L25
            com.google.android.gms.measurement.internal.v3 r7 = r6.zzq()
            com.google.android.gms.measurement.internal.x3 r7 = r7.A()
            java.lang.String r8 = "Could not get MD5 instance"
            r7.a(r8)
            goto L73
        L25:
            if (r0 == 0) goto L72
            boolean r8 = r6.u0(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            if (r8 != 0) goto L72
            com.google.android.gms.common.p.b r7 = com.google.android.gms.common.p.c.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            android.content.Context r8 = r6.zzm()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            r0 = 64
            android.content.pm.PackageInfo r7 = r7.f(r8, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            if (r7 == 0) goto L56
            int r8 = r7.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            if (r8 <= 0) goto L56
            r8 = 0
            r7 = r7[r8]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            byte[] r7 = r1.digest(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            long r2 = v(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            goto L73
        L56:
            com.google.android.gms.measurement.internal.v3 r7 = r6.zzq()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            com.google.android.gms.measurement.internal.x3 r7 = r7.D()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r8 = "Could not get signatures"
            r7.a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            goto L73
        L64:
            r7 = move-exception
            com.google.android.gms.measurement.internal.v3 r8 = r6.zzq()
            com.google.android.gms.measurement.internal.x3 r8 = r8.A()
            java.lang.String r0 = "Package name not found"
            r8.b(r0, r7)
        L72:
            r2 = r4
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.da.t(android.content.Context, java.lang.String):long");
    }

    final Object t0(String str, Object obj) {
        return "_ldl".equals(str) ? B(H0(str), obj, true, false) : B(H0(str), obj, false, false);
    }

    final boolean v0(String str) {
        d();
        if (com.google.android.gms.common.p.c.a(zzm()).a(str) == 0) {
            return true;
        }
        zzq().H().b("Permission not granted", str);
        return false;
    }

    final Bundle w(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("term", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("content", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("aclid", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("cp1", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("anid", queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            zzq().D().b("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    final Bundle x(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objC = C(str, bundle.get(str));
                if (objC == null) {
                    zzq().F().b("Param value can't be null", f().u(str));
                } else {
                    I(bundle2, str, objC);
                }
            }
        }
        return bundle2;
    }

    final Bundle y(String str, String str2, Bundle bundle, List<String> list, boolean z, boolean z2) {
        int iB0;
        int i2;
        da daVar = this;
        boolean zG0 = g0(str2, b6.f10769d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int iT = i().t();
        int i3 = 0;
        for (String str3 : i().y(str, t.a0) ? new TreeSet<>(bundle.keySet()) : bundle.keySet()) {
            if (list == null || !list.contains(str3)) {
                iB0 = z ? daVar.B0(str3) : 0;
                if (iB0 == 0) {
                    iB0 = daVar.D0(str3);
                }
            } else {
                iB0 = 0;
            }
            if (iB0 != 0) {
                F(bundle2, iB0, str3, str3, iB0 == 3 ? str3 : null);
                bundle2.remove(str3);
                i2 = iT;
            } else {
                i2 = iT;
                int iQ = q(str, str2, str3, bundle.get(str3), bundle2, list, z, zG0);
                if (iQ == 17) {
                    F(bundle2, iQ, str3, str3, Boolean.FALSE);
                } else if (iQ != 0 && !"_ev".equals(str3)) {
                    F(bundle2, iQ, iQ == 21 ? str2 : str3, str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (Z(str3)) {
                    int i4 = i3 + 1;
                    if (i4 > i2) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Event can't contain more than ");
                        sb.append(i2);
                        sb.append(" params");
                        zzq().C().c(sb.toString(), f().r(str2), f().p(bundle));
                        q0(bundle2, 5);
                        bundle2.remove(str3);
                        i3 = i4;
                    } else {
                        i3 = i4;
                    }
                }
                iT = i2;
                daVar = this;
            }
            iT = i2;
            daVar = this;
        }
        return bundle2;
    }

    final boolean y0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return i().M().equals(str);
    }

    public final long z0() {
        long andIncrement;
        long j2;
        if (this.f10825f.get() != 0) {
            synchronized (this.f10825f) {
                this.f10825f.compareAndSet(-1L, 1L);
                andIncrement = this.f10825f.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f10825f) {
            long jNextLong = new Random(System.nanoTime() ^ zzl().a()).nextLong();
            int i2 = this.f10826g + 1;
            this.f10826g = i2;
            j2 = jNextLong + i2;
        }
        return j2;
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