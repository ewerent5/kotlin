package e.a.a;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.os.Build;
import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import j$.util.Spliterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AmplitudeClient.java */
/* loaded from: classes.dex */
public class d {
    private static final String a = "e.a.a.d";

    /* renamed from: b, reason: collision with root package name */
    private static final e.a.a.e f14127b = e.a.a.e.d();
    private int A;
    private int B;
    private int C;
    private long D;
    private long E;
    private long F;
    private boolean G;
    private int H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private String M;
    private String N;
    private AtomicBoolean O;
    AtomicBoolean P;
    Throwable Q;
    String R;
    String S;
    n T;
    n U;

    /* renamed from: c, reason: collision with root package name */
    protected Context f14128c;

    /* renamed from: d, reason: collision with root package name */
    protected OkHttpClient f14129d;

    /* renamed from: e, reason: collision with root package name */
    protected e.a.a.h f14130e;

    /* renamed from: f, reason: collision with root package name */
    protected String f14131f;

    /* renamed from: g, reason: collision with root package name */
    protected String f14132g;

    /* renamed from: h, reason: collision with root package name */
    protected String f14133h;

    /* renamed from: i, reason: collision with root package name */
    protected String f14134i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14135j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14136k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f14137l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14138m;
    private boolean n;
    l o;
    l p;
    JSONObject q;
    private boolean r;
    protected String s;
    long t;
    long u;
    long v;
    long w;
    long x;
    long y;
    private e.a.a.j z;

    /* compiled from: AmplitudeClient.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.O.set(false);
            d.this.l0();
        }
    }

    /* compiled from: AmplitudeClient.java */
    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f14140e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f14141f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f14142g;

        b(String str, long j2, long j3) {
            this.f14140e = str;
            this.f14141f = j2;
            this.f14142g = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.K(dVar.f14129d, this.f14140e, this.f14141f, this.f14142g);
        }
    }

    /* compiled from: AmplitudeClient.java */
    class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f14144e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f14145f;

        /* compiled from: AmplitudeClient.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                dVar.m0(dVar.G);
            }
        }

        c(long j2, long j3) {
            this.f14144e = j2;
            this.f14145f = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j2 = this.f14144e;
            if (j2 >= 0) {
                d.this.f14130e.O0(j2);
            }
            long j3 = this.f14145f;
            if (j3 >= 0) {
                d.this.f14130e.U0(j3);
            }
            d.this.P.set(false);
            if (d.this.f14130e.b0() > d.this.A) {
                d.this.T.a(new a());
                return;
            }
            d.this.G = false;
            d dVar = d.this;
            dVar.H = dVar.B;
        }
    }

    /* compiled from: AmplitudeClient.java */
    /* renamed from: e.a.a.d$d, reason: collision with other inner class name */
    class RunnableC0170d implements Runnable {
        RunnableC0170d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.P.set(false);
            d.this.m0(true);
        }
    }

    /* compiled from: AmplitudeClient.java */
    class e implements e.a.a.i {
        final /* synthetic */ d a;

        e(d dVar) {
            this.a = dVar;
        }

        @Override // e.a.a.i
        public void a(SQLiteDatabase sQLiteDatabase) {
            d.this.f14130e.y0(sQLiteDatabase, "store", "device_id", this.a.f14134i);
            d.this.f14130e.y0(sQLiteDatabase, "store", "user_id", this.a.f14133h);
            d.this.f14130e.y0(sQLiteDatabase, "long_store", "opt_out", Long.valueOf(this.a.f14138m ? 1L : 0L));
            d.this.f14130e.y0(sQLiteDatabase, "long_store", "previous_session_id", Long.valueOf(this.a.t));
            d.this.f14130e.y0(sQLiteDatabase, "long_store", "last_event_time", Long.valueOf(this.a.x));
        }
    }

    /* compiled from: AmplitudeClient.java */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.z == null) {
                throw new IllegalStateException("Must initialize before acting on location listening.");
            }
            d.this.z.u(false);
        }
    }

    /* compiled from: AmplitudeClient.java */
    class g implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f14151e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f14152f;

        g(d dVar, boolean z) {
            this.f14151e = dVar;
            this.f14152f = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m.d(d.this.f14131f)) {
                return;
            }
            this.f14151e.f14138m = this.f14152f;
            d.this.f14130e.r0("opt_out", Long.valueOf(this.f14152f ? 1L : 0L));
        }
    }

    /* compiled from: AmplitudeClient.java */
    class h implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f14154e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ JSONObject f14155f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ JSONObject f14156g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ JSONObject f14157h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ JSONObject f14158i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ JSONObject f14159j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f14160k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f14161l;

        h(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j2, boolean z) {
            this.f14154e = str;
            this.f14155f = jSONObject;
            this.f14156g = jSONObject2;
            this.f14157h = jSONObject3;
            this.f14158i = jSONObject4;
            this.f14159j = jSONObject5;
            this.f14160k = j2;
            this.f14161l = z;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (m.d(d.this.f14131f)) {
                return;
            }
            d.this.E(this.f14154e, this.f14155f, this.f14156g, this.f14157h, this.f14158i, this.f14159j, this.f14160k, this.f14161l);
        }
    }

    /* compiled from: AmplitudeClient.java */
    class i implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f14163e;

        i(long j2) {
            this.f14163e = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m.d(d.this.f14131f)) {
                return;
            }
            d.this.R(this.f14163e);
            d.this.K = false;
            if (d.this.L) {
                d.this.l0();
            }
            d dVar = d.this;
            dVar.f14130e.v0("device_id", dVar.f14134i);
            d dVar2 = d.this;
            dVar2.f14130e.v0("user_id", dVar2.f14133h);
            d dVar3 = d.this;
            dVar3.f14130e.r0("opt_out", Long.valueOf(dVar3.f14138m ? 1L : 0L));
            d dVar4 = d.this;
            dVar4.f14130e.r0("previous_session_id", Long.valueOf(dVar4.t));
            d dVar5 = d.this;
            dVar5.f14130e.r0("last_event_time", Long.valueOf(dVar5.x));
        }
    }

    /* compiled from: AmplitudeClient.java */
    class j implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f14165e;

        j(long j2) {
            this.f14165e = j2;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (m.d(d.this.f14131f)) {
                return;
            }
            d.this.g0(this.f14165e);
            d.this.K = true;
        }
    }

    public d() {
        this(null);
    }

    private String A() {
        Set<String> setR = r();
        String strH0 = this.f14130e.h0("device_id");
        String strC = m.c(this.f14128c, this.f14132g, "device_id");
        if (!m.d(strH0) && !setR.contains(strH0)) {
            if (!strH0.equals(strC)) {
                U(strH0);
            }
            return strH0;
        }
        if (!m.d(strC) && !setR.contains(strC)) {
            U(strC);
            return strC;
        }
        if (!this.f14135j && this.f14136k && !this.z.r()) {
            String strD = this.z.d();
            if (!m.d(strD) && !setR.contains(strD)) {
                U(strD);
                return strD;
            }
        }
        String str = e.a.a.j.c() + "R";
        U(str);
        return str;
    }

    private boolean B(long j2) {
        return j2 - this.x < (this.I ? this.E : this.F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void D(Context context, String str, d dVar) {
        if (this.f14137l) {
            return;
        }
        try {
            if (this.f14132g.equals("$default_instance")) {
                o0(context);
                q0(context);
            }
            this.f14129d = new OkHttpClient();
            this.z = new e.a.a.j(context);
            this.f14134i = A();
            this.z.t();
            if (str != null) {
                dVar.f14133h = str;
                this.f14130e.v0("user_id", str);
            } else {
                dVar.f14133h = this.f14130e.h0("user_id");
            }
            Long lT = this.f14130e.T("opt_out");
            this.f14138m = lT != null && lT.longValue() == 1;
            long jS = s("previous_session_id", -1L);
            this.y = jS;
            if (jS >= 0) {
                this.t = jS;
            }
            this.u = s("sequence_number", 0L);
            this.v = s("last_event_id", -1L);
            this.w = s("last_identify_id", -1L);
            this.x = s("last_event_time", -1L);
            this.f14130e.W0(new e(dVar));
            this.f14137l = true;
        } catch (e.a.a.g e2) {
            f14127b.b(a, String.format("Failed to initialize Amplitude SDK due to: %s", e2.getMessage()));
            dVar.f14131f = null;
        }
    }

    private static void M(SharedPreferences sharedPreferences, String str, boolean z, e.a.a.h hVar, String str2) {
        if (hVar.T(str2) != null) {
            return;
        }
        hVar.r0(str2, Long.valueOf(sharedPreferences.getBoolean(str, z) ? 1L : 0L));
        sharedPreferences.edit().remove(str).apply();
    }

    private static void N(SharedPreferences sharedPreferences, String str, long j2, e.a.a.h hVar, String str2) {
        if (hVar.T(str2) != null) {
            return;
        }
        hVar.r0(str2, Long.valueOf(sharedPreferences.getLong(str, j2)));
        sharedPreferences.edit().remove(str).apply();
    }

    private static void O(SharedPreferences sharedPreferences, String str, String str2, e.a.a.h hVar, String str3) {
        if (m.d(hVar.h0(str3))) {
            String string = sharedPreferences.getString(str, str2);
            if (m.d(string)) {
                return;
            }
            hVar.v0(str3, string);
            sharedPreferences.edit().remove(str).apply();
        }
    }

    private void U(String str) {
        this.f14130e.v0("device_id", str);
        m.f(this.f14128c, this.f14132g, "device_id", str);
    }

    private void W(String str) throws JSONException {
        if (m(String.format("sendSessionEvent('%s')", str)) && w()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("special", str);
                E(str, null, jSONObject, null, null, null, this.x, false);
            } catch (JSONException unused) {
            }
        }
    }

    private void d0(long j2) {
        this.t = j2;
        c0(j2);
    }

    private void f0(long j2) throws JSONException {
        if (this.J) {
            W("session_end");
        }
        d0(j2);
        R(j2);
        if (this.J) {
            W("session_start");
        }
    }

    public static String i0(String str) {
        return str.length() <= 1024 ? str : str.substring(0, Spliterator.IMMUTABLE);
    }

    private void n0(long j2) {
        if (this.O.getAndSet(true)) {
            return;
        }
        this.T.b(new a(), j2);
    }

    static boolean o0(Context context) {
        return p0(context, null, null);
    }

    static boolean p0(Context context, String str, String str2) {
        if (str == null) {
            try {
                str = e.a.a.f.class.getPackage().getName();
            } catch (Exception unused) {
                str = "com.amplitude.api";
            }
        }
        if (str2 == null) {
            str2 = "com.amplitude.api";
        }
        try {
            if (str2.equals(str)) {
                return false;
            }
            String str3 = str + "." + context.getPackageName();
            SharedPreferences sharedPreferences = context.getSharedPreferences(str3, 0);
            if (sharedPreferences.getAll().size() == 0) {
                return false;
            }
            String str4 = str2 + "." + context.getPackageName();
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str4, 0).edit();
            if (sharedPreferences.contains(str + ".previousSessionId")) {
                editorEdit.putLong("com.amplitude.api.previousSessionId", sharedPreferences.getLong(str + ".previousSessionId", -1L));
            }
            if (sharedPreferences.contains(str + ".deviceId")) {
                editorEdit.putString("com.amplitude.api.deviceId", sharedPreferences.getString(str + ".deviceId", null));
            }
            if (sharedPreferences.contains(str + ".userId")) {
                editorEdit.putString("com.amplitude.api.userId", sharedPreferences.getString(str + ".userId", null));
            }
            if (sharedPreferences.contains(str + ".optOut")) {
                editorEdit.putBoolean("com.amplitude.api.optOut", sharedPreferences.getBoolean(str + ".optOut", false));
            }
            editorEdit.apply();
            sharedPreferences.edit().clear().apply();
            f14127b.e(a, "Upgraded shared preferences from " + str3 + " to " + str4);
            return true;
        } catch (Exception e2) {
            f14127b.c(a, "Error upgrading shared preferences", e2);
            return false;
        }
    }

    static boolean q0(Context context) {
        return r0(context, null);
    }

    private Set<String> r() {
        HashSet hashSet = new HashSet();
        hashSet.add("");
        hashSet.add("9774d56d682e549c");
        hashSet.add("unknown");
        hashSet.add("000000000000000");
        hashSet.add("Android");
        hashSet.add("DEFACE");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        return hashSet;
    }

    static boolean r0(Context context, String str) {
        if (str == null) {
            str = "com.amplitude.api";
        }
        e.a.a.h hVarQ = e.a.a.h.q(context);
        String strH0 = hVarQ.h0("device_id");
        Long lT = hVarQ.T("previous_session_id");
        Long lT2 = hVarQ.T("last_event_time");
        if (!m.d(strH0) && lT != null && lT2 != null) {
            return true;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str + "." + context.getPackageName(), 0);
        O(sharedPreferences, "com.amplitude.api.deviceId", null, hVarQ, "device_id");
        N(sharedPreferences, "com.amplitude.api.lastEventTime", -1L, hVarQ, "last_event_time");
        N(sharedPreferences, "com.amplitude.api.lastEventId", -1L, hVarQ, "last_event_id");
        N(sharedPreferences, "com.amplitude.api.lastIdentifyId", -1L, hVarQ, "last_identify_id");
        N(sharedPreferences, "com.amplitude.api.previousSessionId", -1L, hVarQ, "previous_session_id");
        O(sharedPreferences, "com.amplitude.api.userId", null, hVarQ, "user_id");
        M(sharedPreferences, "com.amplitude.api.optOut", false, hVarQ, "opt_out");
        return true;
    }

    private long s(String str, long j2) {
        Long lT = this.f14130e.T(str);
        return lT == null ? j2 : lT.longValue();
    }

    private boolean w() {
        return this.t >= 0;
    }

    protected long E(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j2, boolean z) throws JSONException {
        Location locationM;
        f14127b.a(a, "Logged event to Amplitude: " + str);
        if (this.f14138m) {
            return -1L;
        }
        if (!(this.J && (str.equals("session_start") || str.equals("session_end"))) && !z) {
            if (this.K) {
                R(j2);
            } else {
                g0(j2);
            }
        }
        JSONObject jSONObject6 = new JSONObject();
        try {
            jSONObject6.put("event_type", S(str));
            jSONObject6.put("timestamp", j2);
            jSONObject6.put("user_id", S(this.f14133h));
            jSONObject6.put("device_id", S(this.f14134i));
            jSONObject6.put("session_id", z ? -1L : this.t);
            jSONObject6.put("uuid", UUID.randomUUID().toString());
            jSONObject6.put("sequence_number", t());
            if (this.p.u()) {
                jSONObject6.put("version_name", S(this.z.p()));
            }
            if (this.p.r()) {
                jSONObject6.put("os_name", S(this.z.n()));
            }
            if (this.p.s()) {
                jSONObject6.put("os_version", S(this.z.o()));
            }
            if (this.p.i()) {
                jSONObject6.put("api_level", S(Integer.valueOf(Build.VERSION.SDK_INT)));
            }
            if (this.p.l()) {
                jSONObject6.put("device_brand", S(this.z.e()));
            }
            if (this.p.m()) {
                jSONObject6.put("device_manufacturer", S(this.z.k()));
            }
            if (this.p.n()) {
                jSONObject6.put("device_model", S(this.z.l()));
            }
            if (this.p.j()) {
                jSONObject6.put("carrier", S(this.z.g()));
            }
            if (this.p.k()) {
                jSONObject6.put("country", S(this.z.h()));
            }
            if (this.p.p()) {
                jSONObject6.put("language", S(this.z.j()));
            }
            if (this.p.t()) {
                jSONObject6.put("platform", this.s);
            }
            JSONObject jSONObject7 = new JSONObject();
            String str2 = this.M;
            if (str2 == null) {
                str2 = "unknown-library";
            }
            jSONObject7.put(Action.NAME_ATTRIBUTE, str2);
            String str3 = this.N;
            if (str3 == null) {
                str3 = "unknown-version";
            }
            jSONObject7.put("version", str3);
            jSONObject6.put("library", jSONObject7);
            JSONObject jSONObject8 = jSONObject2 == null ? new JSONObject() : jSONObject2;
            JSONObject jSONObject9 = this.q;
            if (jSONObject9 != null && jSONObject9.length() > 0) {
                jSONObject8.put("tracking_options", this.q);
            }
            if (this.p.q() && (locationM = this.z.m()) != null) {
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put("lat", locationM.getLatitude());
                jSONObject10.put("lng", locationM.getLongitude());
                jSONObject8.put("location", jSONObject10);
            }
            if (this.p.h() && this.z.d() != null) {
                jSONObject8.put("androidADID", this.z.d());
            }
            jSONObject8.put("limit_ad_tracking", this.z.r());
            jSONObject8.put("gps_enabled", this.z.q());
            jSONObject6.put("api_properties", jSONObject8);
            jSONObject6.put("event_properties", jSONObject == null ? new JSONObject() : k0(jSONObject));
            jSONObject6.put("user_properties", jSONObject3 == null ? new JSONObject() : k0(jSONObject3));
            jSONObject6.put("groups", jSONObject4 == null ? new JSONObject() : k0(jSONObject4));
            jSONObject6.put("group_properties", jSONObject5 == null ? new JSONObject() : k0(jSONObject5));
            return V(str, jSONObject6);
        } catch (JSONException e2) {
            f14127b.b(a, String.format("JSON Serialization of event type %s failed, skipping: %s", str, e2.toString()));
            return -1L;
        }
    }

    public void F(String str, JSONObject jSONObject) {
        I(str, jSONObject, false);
    }

    public void G(String str, JSONObject jSONObject, JSONObject jSONObject2, long j2, boolean z) {
        if (u0(str)) {
            J(str, jSONObject, null, null, jSONObject2, null, j2, z);
        }
    }

    public void H(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        G(str, jSONObject, jSONObject2, q(), z);
    }

    public void I(String str, JSONObject jSONObject, boolean z) {
        H(str, jSONObject, null, z);
    }

    protected void J(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j2, boolean z) {
        T(new h(str, jSONObject != null ? m.a(jSONObject) : jSONObject, jSONObject2 != null ? m.a(jSONObject2) : jSONObject2, jSONObject3 != null ? m.a(jSONObject3) : jSONObject3, jSONObject4 != null ? m.a(jSONObject4) : jSONObject4, jSONObject5 != null ? m.a(jSONObject5) : jSONObject5, j2, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void K(okhttp3.OkHttpClient r10, java.lang.String r11, long r12, long r14) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.d.K(okhttp3.OkHttpClient, java.lang.String, long, long):void");
    }

    protected Pair<Pair<Long, Long>, JSONArray> L(List<JSONObject> list, List<JSONObject> list2, long j2) throws JSONException {
        long j3;
        long j4;
        JSONArray jSONArray = new JSONArray();
        long j5 = -1;
        long j6 = -1;
        while (true) {
            if (jSONArray.length() >= j2) {
                break;
            }
            boolean zIsEmpty = list.isEmpty();
            boolean zIsEmpty2 = list2.isEmpty();
            if (zIsEmpty && zIsEmpty2) {
                f14127b.h(a, String.format("mergeEventsAndIdentifys: number of events and identifys less than expected by %d", Long.valueOf(j2 - jSONArray.length())));
                break;
            }
            if (zIsEmpty2) {
                JSONObject jSONObjectRemove = list.remove(0);
                j3 = jSONObjectRemove.getLong("event_id");
                jSONArray.put(jSONObjectRemove);
            } else {
                if (zIsEmpty) {
                    JSONObject jSONObjectRemove2 = list2.remove(0);
                    j4 = jSONObjectRemove2.getLong("event_id");
                    jSONArray.put(jSONObjectRemove2);
                } else if (!list.get(0).has("sequence_number") || list.get(0).getLong("sequence_number") < list2.get(0).getLong("sequence_number")) {
                    JSONObject jSONObjectRemove3 = list.remove(0);
                    j3 = jSONObjectRemove3.getLong("event_id");
                    jSONArray.put(jSONObjectRemove3);
                } else {
                    JSONObject jSONObjectRemove4 = list2.remove(0);
                    j4 = jSONObjectRemove4.getLong("event_id");
                    jSONArray.put(jSONObjectRemove4);
                }
                j6 = j4;
            }
            j5 = j3;
        }
        return new Pair<>(new Pair(Long.valueOf(j5), Long.valueOf(j6)), jSONArray);
    }

    void P(long j2) {
        T(new j(j2));
    }

    void Q(long j2) {
        T(new i(j2));
    }

    void R(long j2) {
        if (w()) {
            Y(j2);
        }
    }

    protected Object S(Object obj) {
        return obj == null ? JSONObject.NULL : obj;
    }

    protected void T(Runnable runnable) {
        Thread threadCurrentThread = Thread.currentThread();
        n nVar = this.T;
        if (threadCurrentThread != nVar) {
            nVar.a(runnable);
        } else {
            runnable.run();
        }
    }

    protected long V(String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        if (m.d(string)) {
            f14127b.b(a, String.format("Detected empty event string for event type %s, skipping", str));
            return -1L;
        }
        if (str.equals("$identify") || str.equals("$groupidentify")) {
            long jD = this.f14130e.d(string);
            this.w = jD;
            Z(jD);
        } else {
            long jB = this.f14130e.b(string);
            this.v = jB;
            X(jB);
        }
        int iMin = Math.min(Math.max(1, this.C / 10), 20);
        if (this.f14130e.A() > this.C) {
            e.a.a.h hVar = this.f14130e;
            hVar.O0(hVar.W(iMin));
        }
        if (this.f14130e.K() > this.C) {
            e.a.a.h hVar2 = this.f14130e;
            hVar2.U0(hVar2.a0(iMin));
        }
        long jB0 = this.f14130e.b0();
        int i2 = this.A;
        if (jB0 % i2 != 0 || jB0 < i2) {
            n0(this.D);
        } else {
            l0();
        }
        return (str.equals("$identify") || str.equals("$groupidentify")) ? this.w : this.v;
    }

    void X(long j2) {
        this.v = j2;
        this.f14130e.r0("last_event_id", Long.valueOf(j2));
    }

    void Y(long j2) {
        this.x = j2;
        this.f14130e.r0("last_event_time", Long.valueOf(j2));
    }

    void Z(long j2) {
        this.w = j2;
        this.f14130e.r0("last_identify_id", Long.valueOf(j2));
    }

    public d a0(int i2) {
        f14127b.g(i2);
        return this;
    }

    public d b0(boolean z) {
        if (!m("setOptOut()")) {
            return this;
        }
        T(new g(this, z));
        return this;
    }

    void c0(long j2) {
        this.y = j2;
        this.f14130e.r0("previous_session_id", Long.valueOf(j2));
    }

    public d e0(l lVar) {
        this.o = lVar;
        l lVarA = l.a(lVar);
        this.p = lVarA;
        if (this.r) {
            lVarA.g(l.e());
        }
        this.q = this.p.f();
        return this;
    }

    public boolean g0(long j2) throws JSONException {
        if (w()) {
            if (B(j2)) {
                R(j2);
                return false;
            }
            f0(j2);
            return true;
        }
        if (!B(j2)) {
            f0(j2);
            return true;
        }
        long j3 = this.y;
        if (j3 == -1) {
            f0(j2);
            return true;
        }
        d0(j3);
        R(j2);
        return false;
    }

    public d h0(boolean z) {
        this.J = z;
        return this;
    }

    public JSONArray j0(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return new JSONArray();
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj.getClass().equals(String.class)) {
                jSONArray.put(i2, i0((String) obj));
            } else if (obj.getClass().equals(JSONObject.class)) {
                jSONArray.put(i2, k0((JSONObject) obj));
            } else if (obj.getClass().equals(JSONArray.class)) {
                jSONArray.put(i2, j0((JSONArray) obj));
            }
        }
        return jSONArray;
    }

    public JSONObject k0(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1000) {
            f14127b.h(a, "Warning: too many properties (more than 1000), ignoring");
            return new JSONObject();
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (next.equals("$receipt") || next.equals("$receiptSig")) {
                    jSONObject.put(next, obj);
                } else if (obj.getClass().equals(String.class)) {
                    jSONObject.put(next, i0((String) obj));
                } else if (obj.getClass().equals(JSONObject.class)) {
                    jSONObject.put(next, k0((JSONObject) obj));
                } else if (obj.getClass().equals(JSONArray.class)) {
                    jSONObject.put(next, j0((JSONArray) obj));
                }
            } catch (JSONException e2) {
                f14127b.b(a, e2.toString());
            }
        }
        return jSONObject;
    }

    protected String l(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            cArr2[i4] = cArr[i3 >>> 4];
            cArr2[i4 + 1] = cArr[i3 & 15];
        }
        return new String(cArr2);
    }

    protected void l0() {
        m0(false);
    }

    protected synchronized boolean m(String str) {
        if (this.f14128c == null) {
            f14127b.b(a, "context cannot be null, set context with initialize() before calling " + str);
            return false;
        }
        if (!m.d(this.f14131f)) {
            return true;
        }
        f14127b.b(a, "apiKey cannot be null or empty, set apiKey with initialize() before calling " + str);
        return false;
    }

    protected void m0(boolean z) {
        if (this.f14138m || this.n || this.P.getAndSet(true)) {
            return;
        }
        long jMin = Math.min(z ? this.H : this.B, this.f14130e.b0());
        if (jMin <= 0) {
            this.P.set(false);
            return;
        }
        try {
            Pair<Pair<Long, Long>, JSONArray> pairL = L(this.f14130e.C(this.v, jMin), this.f14130e.N(this.w, jMin), jMin);
            if (((JSONArray) pairL.second).length() == 0) {
                this.P.set(false);
            } else {
                this.U.a(new b(((JSONArray) pairL.second).toString(), ((Long) ((Pair) pairL.first).first).longValue(), ((Long) ((Pair) pairL.first).second).longValue()));
            }
        } catch (e.a.a.g e2) {
            this.P.set(false);
            f14127b.b(a, String.format("Caught Cursor window exception during event upload, deferring upload: %s", e2.getMessage()));
        } catch (JSONException e3) {
            this.P.set(false);
            f14127b.b(a, e3.toString());
        }
    }

    public d n() {
        T(new f());
        return this;
    }

    public d o(Application application) {
        if (!this.I && m("enableForegroundTracking()") && Build.VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(new e.a.a.c(this));
        }
        return this;
    }

    public d p(boolean z) {
        f14127b.f(z);
        return this;
    }

    protected long q() {
        return System.currentTimeMillis();
    }

    public d s0() {
        this.f14136k = true;
        return this;
    }

    long t() {
        long j2 = this.u + 1;
        this.u = j2;
        this.f14130e.r0("sequence_number", Long.valueOf(j2));
        return this.u;
    }

    void t0() {
        this.I = true;
    }

    public void u(k kVar) {
        v(kVar, false);
    }

    protected boolean u0(String str) {
        if (!m.d(str)) {
            return m("logEvent()");
        }
        f14127b.b(a, "Argument eventType cannot be null or blank in logEvent()");
        return false;
    }

    public void v(k kVar, boolean z) {
        if (kVar == null || kVar.f14191b.length() == 0 || !m("identify()")) {
            return;
        }
        J("$identify", null, null, kVar.f14191b, null, null, q(), z);
    }

    public d x(Context context, String str) {
        return y(context, str, null);
    }

    public d y(Context context, String str, String str2) {
        return z(context, str, str2, null, false);
    }

    public synchronized d z(final Context context, String str, final String str2, String str3, boolean z) {
        if (context == null) {
            f14127b.b(a, "Argument context cannot be null in initialize()");
            return this;
        }
        if (m.d(str)) {
            f14127b.b(a, "Argument apiKey cannot be null or blank in initialize()");
            return this;
        }
        Context applicationContext = context.getApplicationContext();
        this.f14128c = applicationContext;
        this.f14131f = str;
        this.f14130e = e.a.a.h.s(applicationContext, this.f14132g);
        if (m.d(str3)) {
            str3 = "Android";
        }
        this.s = str3;
        T(new Runnable() { // from class: e.a.a.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f14120e.D(context, str2, this);
            }
        });
        return this;
    }

    public d(String str) {
        this.f14135j = false;
        this.f14136k = false;
        this.f14137l = false;
        this.f14138m = false;
        this.n = false;
        l lVar = new l();
        this.o = lVar;
        l lVarA = l.a(lVar);
        this.p = lVarA;
        this.q = lVarA.f();
        this.r = false;
        this.t = -1L;
        this.u = 0L;
        this.v = -1L;
        this.w = -1L;
        this.x = -1L;
        this.y = -1L;
        this.A = 30;
        this.B = 50;
        this.C = CoreConstants.MILLIS_IN_ONE_SECOND;
        this.D = 30000L;
        this.E = 300000L;
        this.F = 1800000L;
        this.G = false;
        this.H = 50;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = true;
        this.M = "amplitude-android";
        this.N = "2.25.0";
        this.O = new AtomicBoolean(false);
        this.P = new AtomicBoolean(false);
        this.R = "https://api.amplitude.com/";
        this.S = null;
        this.T = new n("logThread");
        this.U = new n("httpThread");
        this.f14132g = m.e(str);
        this.T.start();
        this.U.start();
    }
}