package com.parizene.netmonitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Handler;
import android.util.SparseArray;
import android.widget.Toast;
import java.util.concurrent.TimeUnit;

/* compiled from: NetmonitorManager.java */
/* loaded from: classes.dex */
public class x implements com.parizene.netmonitor.s0.d.d, SharedPreferences.OnSharedPreferenceChangeListener, com.parizene.netmonitor.m0.f {

    /* renamed from: e, reason: collision with root package name */
    private static final long f14080e = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: f, reason: collision with root package name */
    private static final long f14081f = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: g, reason: collision with root package name */
    private SharedPreferences f14082g;

    /* renamed from: h, reason: collision with root package name */
    private Context f14083h;

    /* renamed from: i, reason: collision with root package name */
    private Handler f14084i;

    /* renamed from: j, reason: collision with root package name */
    private org.greenrobot.eventbus.c f14085j;

    /* renamed from: k, reason: collision with root package name */
    private com.parizene.netmonitor.s0.d.c f14086k;

    /* renamed from: l, reason: collision with root package name */
    private com.parizene.netmonitor.m0.e f14087l;

    /* renamed from: m, reason: collision with root package name */
    private com.parizene.netmonitor.db.celllog.b f14088m;
    private boolean n;
    private com.parizene.netmonitor.m0.b0.a o;
    private com.parizene.netmonitor.m0.d p;
    private Location q;
    private Location r;
    private com.parizene.netmonitor.m0.d0.d s;
    private f.a<com.parizene.netmonitor.m0.e> t;
    private f.a<com.parizene.netmonitor.m0.e> u;
    private final u v;
    private final d0 w;
    private Runnable x = new a();

    /* compiled from: NetmonitorManager.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (x.this.q != null) {
                long jAbs = Math.abs(System.currentTimeMillis() - x.this.q.getTime());
                m.a.a.a("gpsDiff=" + jAbs, new Object[0]);
                if (jAbs > x.f14081f) {
                    x.this.q = null;
                }
            }
            x.this.f14084i.postDelayed(this, x.f14080e);
        }
    }

    /* compiled from: NetmonitorManager.java */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.parizene.netmonitor.m0.b0.a.values().length];
            a = iArr;
            try {
                iArr[com.parizene.netmonitor.m0.b0.a.OLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.parizene.netmonitor.m0.b0.a.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public x(Context context, org.greenrobot.eventbus.c cVar, SharedPreferences sharedPreferences, com.parizene.netmonitor.db.celllog.b bVar, com.parizene.netmonitor.m0.d0.d dVar, com.parizene.netmonitor.s0.d.c cVar2, Handler handler, f.a<com.parizene.netmonitor.m0.e> aVar, f.a<com.parizene.netmonitor.m0.e> aVar2, u uVar, d0 d0Var) {
        this.f14083h = context;
        this.f14084i = handler;
        this.f14086k = cVar2;
        cVar2.v(com.parizene.netmonitor.t0.f.F.f().longValue() * 1000, com.parizene.netmonitor.t0.f.G.f().longValue());
        this.f14082g = sharedPreferences;
        this.f14088m = bVar;
        this.f14085j = cVar;
        this.s = dVar;
        this.t = aVar;
        this.u = aVar2;
        this.v = uVar;
        this.w = d0Var;
        this.p = com.parizene.netmonitor.m0.d.b(com.parizene.netmonitor.t0.f.a.g());
        j();
    }

    private static com.parizene.netmonitor.db.celllog.i.c g(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.b0.k kVar, boolean z) {
        if (kVar instanceof com.parizene.netmonitor.m0.b0.l) {
            return new com.parizene.netmonitor.db.celllog.i.a(yVar, (com.parizene.netmonitor.m0.b0.l) kVar, z);
        }
        if (kVar instanceof com.parizene.netmonitor.m0.b0.m) {
            return new com.parizene.netmonitor.db.celllog.i.k(yVar, (com.parizene.netmonitor.m0.b0.m) kVar, z);
        }
        if (kVar instanceof com.parizene.netmonitor.m0.b0.q) {
            return new com.parizene.netmonitor.db.celllog.i.q(yVar, (com.parizene.netmonitor.m0.b0.q) kVar, z);
        }
        if (kVar instanceof com.parizene.netmonitor.m0.b0.n) {
            return new com.parizene.netmonitor.db.celllog.i.m(yVar, (com.parizene.netmonitor.m0.b0.n) kVar, z);
        }
        if (kVar instanceof com.parizene.netmonitor.m0.b0.p) {
            return new com.parizene.netmonitor.db.celllog.i.p(yVar, (com.parizene.netmonitor.m0.b0.p) kVar, z);
        }
        if (kVar instanceof com.parizene.netmonitor.m0.b0.o) {
            return new com.parizene.netmonitor.db.celllog.i.n(yVar, (com.parizene.netmonitor.m0.b0.o) kVar, z);
        }
        return null;
    }

    private void j() {
        com.parizene.netmonitor.m0.b0.a aVar = com.parizene.netmonitor.t0.f.f13723h.g().booleanValue() ? com.parizene.netmonitor.m0.b0.a.NEW : com.parizene.netmonitor.m0.b0.a.OLD;
        if (this.o != aVar) {
            this.o = aVar;
            if (this.n) {
                this.f14087l.k();
                this.f14087l.i(this);
            }
            int i2 = b.a[this.o.ordinal()];
            if (i2 == 1) {
                this.f14087l = this.u.get();
            } else if (i2 == 2) {
                this.f14087l = this.t.get();
            }
            this.f14087l.t(this.p);
            if (this.n) {
                this.f14087l.a(this);
                this.f14087l.j();
            }
        }
    }

    private void n(com.parizene.netmonitor.db.celllog.i.c cVar, long j2) {
        com.parizene.netmonitor.db.celllog.i.e eVarJ = this.f14088m.j(cVar, j2, com.parizene.netmonitor.t0.f.f13728m.g().booleanValue(), com.parizene.netmonitor.t0.f.n.g().booleanValue());
        if (eVarJ != null) {
            cVar.t(eVarJ.a);
            cVar.u(eVarJ.d());
            cVar.v(eVarJ.f());
        }
    }

    private void o(long j2, int i2, com.parizene.netmonitor.db.celllog.i.g gVar, long j3) {
        int i3;
        int i4;
        int accuracy;
        if (j2 == -1 || !com.parizene.netmonitor.t0.f.A.g().booleanValue()) {
            return;
        }
        Location location = this.q;
        if (location != null) {
            int latitude = (int) (location.getLatitude() * 1000000.0d);
            int longitude = (int) (this.q.getLongitude() * 1000000.0d);
            if (this.q.hasAccuracy()) {
                i3 = latitude;
                accuracy = (int) this.q.getAccuracy();
                i4 = longitude;
                this.f14088m.f(new com.parizene.netmonitor.db.celllog.i.l(j2, gVar, i2, i3, i4, accuracy, j3));
            }
            i3 = latitude;
            i4 = longitude;
        } else {
            i3 = 0;
            i4 = 0;
        }
        accuracy = 0;
        this.f14088m.f(new com.parizene.netmonitor.db.celllog.i.l(j2, gVar, i2, i3, i4, accuracy, j3));
    }

    private void q() {
        this.f14084i.removeCallbacks(this.x);
        this.f14084i.post(this.x);
    }

    private void s() {
        this.f14084i.removeCallbacks(this.x);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0167  */
    @Override // com.parizene.netmonitor.m0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void F(com.parizene.netmonitor.m0.b0.a r30, int r31, android.util.SparseArray<c.h.k.d<java.lang.Integer, com.parizene.netmonitor.m0.b0.b>> r32) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.parizene.netmonitor.x.F(com.parizene.netmonitor.m0.b0.a, int, android.util.SparseArray):void");
    }

    @Override // com.parizene.netmonitor.s0.d.d
    public void a(String str, boolean z) {
    }

    public com.parizene.netmonitor.s0.d.f h() {
        return this.f14086k.o();
    }

    public Location i() {
        return this.r;
    }

    public boolean k() {
        return this.s.u() == 2;
    }

    public boolean l() {
        return this.s.u() == 1;
    }

    public boolean m(String str) {
        return this.f14086k.q(str);
    }

    @Override // com.parizene.netmonitor.s0.d.d
    public void onLocationChanged(Location location) {
        this.f14085j.p(new com.parizene.netmonitor.l0.e(location));
        if (location == null || !"gps".equals(location.getProvider())) {
            return;
        }
        this.q = location;
        com.parizene.netmonitor.l0.a aVar = (com.parizene.netmonitor.l0.a) this.f14085j.f(com.parizene.netmonitor.l0.a.class);
        if (aVar != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            SparseArray<c.h.k.d<Integer, com.parizene.netmonitor.db.celllog.i.d>> sparseArrayA = aVar.a();
            for (int i2 = 0; i2 < sparseArrayA.size(); i2++) {
                com.parizene.netmonitor.db.celllog.i.c cVarA = sparseArrayA.valueAt(i2).f3105b.a();
                int iG = -1;
                if (cVarA != null) {
                    jN = cVarA.n() > 0 ? cVarA.n() : 1L;
                    iG = cVarA.g();
                }
                o(jN, iG, com.parizene.netmonitor.db.celllog.i.g.GPS, jCurrentTimeMillis);
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        long jLongValue;
        long jLongValue2;
        if (str.equals(this.f14083h.getString(R.string.pref_location_min_time_key))) {
            try {
                jLongValue = com.parizene.netmonitor.t0.f.F.f().longValue() * 1000;
            } catch (NumberFormatException unused) {
                jLongValue = 5000;
                com.parizene.netmonitor.t0.f.F.d();
                Context context = this.f14083h;
                Toast.makeText(context, context.getString(R.string.not_saved), 0).show();
            }
            if (com.parizene.netmonitor.t0.f.F.f().longValue() * 1000 != jLongValue) {
                this.f14086k.v(jLongValue, com.parizene.netmonitor.t0.f.G.f().longValue());
                return;
            }
            return;
        }
        if (str.equals(this.f14083h.getString(R.string.pref_location_min_distance_key))) {
            try {
                jLongValue2 = com.parizene.netmonitor.t0.f.G.f().longValue();
            } catch (NumberFormatException unused2) {
                jLongValue2 = 5;
                com.parizene.netmonitor.t0.f.G.d();
                Context context2 = this.f14083h;
                Toast.makeText(context2, context2.getString(R.string.not_saved), 0).show();
            }
            if (com.parizene.netmonitor.t0.f.G.f().longValue() != jLongValue2) {
                this.f14086k.v(com.parizene.netmonitor.t0.f.F.f().longValue() * 1000, jLongValue2);
                return;
            }
            return;
        }
        if (str.equals(com.parizene.netmonitor.t0.f.f13723h.c())) {
            j();
            return;
        }
        com.parizene.netmonitor.t0.h hVar = com.parizene.netmonitor.t0.f.a;
        if (str.equals(hVar.c())) {
            com.parizene.netmonitor.m0.d dVarB = com.parizene.netmonitor.m0.d.b(hVar.g());
            this.p = dVarB;
            this.f14087l.t(dVarB);
            return;
        }
        com.parizene.netmonitor.t0.b bVar = com.parizene.netmonitor.t0.f.f13718c;
        if (str.equals(bVar.c())) {
            if (bVar.g().booleanValue()) {
                this.f14086k.a(this);
                this.f14086k.j();
                if (this.f14086k.b() && this.f14086k.p("gps")) {
                    q();
                    return;
                }
                return;
            }
            this.f14086k.k();
            this.f14086k.i(this);
            if (this.f14086k.b() || !this.f14086k.p("gps")) {
                return;
            }
            s();
        }
    }

    public void p() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.w.c();
        this.v.q();
        this.f14087l.a(this);
        this.f14087l.j();
        this.f14082g.registerOnSharedPreferenceChangeListener(this);
        if (com.parizene.netmonitor.t0.f.f13718c.g().booleanValue()) {
            this.f14086k.a(this);
            this.f14086k.j();
            if (this.f14086k.b() && this.f14086k.p("gps")) {
                q();
            }
        }
    }

    public void r() {
        if (this.n) {
            this.w.e();
            this.f14087l.k();
            this.f14087l.i(this);
            this.v.u();
            if (com.parizene.netmonitor.t0.f.f13718c.g().booleanValue()) {
                this.f14086k.k();
                this.f14086k.i(this);
                if (!this.f14086k.b() && this.f14086k.p("gps")) {
                    s();
                }
            }
            this.f14082g.unregisterOnSharedPreferenceChangeListener(this);
            this.n = false;
        }
    }
}