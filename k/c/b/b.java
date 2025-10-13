package k.c.b;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.net.Proxy;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import k.c.e.o.e;

/* compiled from: DefaultConfigurationProvider.java */
/* loaded from: classes3.dex */
public class b implements c {
    private String E;
    protected File r;
    protected File s;
    protected long a = 20000;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f16555b = false;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f16556c = false;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f16557d = false;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f16558e = false;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f16559f = true;

    /* renamed from: g, reason: collision with root package name */
    protected String f16560g = "osmdroid";

    /* renamed from: h, reason: collision with root package name */
    protected String f16561h = "User-Agent";

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f16562i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    protected short f16563j = 9;

    /* renamed from: k, reason: collision with root package name */
    protected short f16564k = 2;

    /* renamed from: l, reason: collision with root package name */
    protected short f16565l = 8;

    /* renamed from: m, reason: collision with root package name */
    protected short f16566m = 40;
    protected short n = 40;
    protected long o = 629145600;
    protected long p = 524288000;
    protected SimpleDateFormat q = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
    protected long t = 0;
    protected Long u = null;
    protected Proxy v = null;
    protected int w = CoreConstants.MILLIS_IN_ONE_SECOND;
    protected int x = 500;
    protected boolean y = true;
    protected short z = 0;
    protected long A = 300000;
    protected int B = 20;
    protected long C = 500;
    protected boolean D = true;

    @Override // k.c.b.c
    public short A() {
        return this.f16563j;
    }

    @Override // k.c.b.c
    public long B() {
        return this.t;
    }

    @Override // k.c.b.c
    public short C() {
        return this.f16565l;
    }

    @Override // k.c.b.c
    public Long D() {
        return this.u;
    }

    @Override // k.c.b.c
    public Proxy E() {
        return this.v;
    }

    @Override // k.c.b.c
    public boolean F() {
        return this.f16558e;
    }

    @Override // k.c.b.c
    public File G(Context context) {
        if (this.s == null) {
            this.s = new File(I(context), "tiles");
        }
        try {
            this.s.mkdirs();
        } catch (Exception e2) {
            Log.d("OsmDroid", "Unable to create tile cache path at " + this.s, e2);
        }
        return this.s;
    }

    @Override // k.c.b.c
    public long H() {
        return this.p;
    }

    public File I(Context context) {
        try {
            if (this.r == null) {
                e.a aVarB = e.b(context);
                if (aVarB != null) {
                    File file = new File(aVarB.a, "osmdroid");
                    this.r = file;
                    file.mkdirs();
                } else if (!new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), "osmdroid").mkdirs()) {
                    Log.e("OsmDroid", "Directory not created");
                }
            }
        } catch (Exception e2) {
            Log.d("OsmDroid", "Unable to create base path at " + this.r, e2);
        }
        return this.r;
    }

    @Override // k.c.b.c
    public boolean a() {
        return this.y;
    }

    @Override // k.c.b.c
    public short b() {
        return this.f16564k;
    }

    @Override // k.c.b.c
    public boolean c() {
        return this.f16555b;
    }

    @Override // k.c.b.c
    public int d() {
        return this.w;
    }

    @Override // k.c.b.c
    public short e() {
        return this.f16566m;
    }

    @Override // k.c.b.c
    public long f() {
        return this.A;
    }

    @Override // k.c.b.c
    public short g() {
        return this.n;
    }

    @Override // k.c.b.c
    public File h() {
        return G(null);
    }

    @Override // k.c.b.c
    public long i() {
        return this.C;
    }

    @Override // k.c.b.c
    public long j() {
        return this.o;
    }

    @Override // k.c.b.c
    public int k() {
        return this.B;
    }

    @Override // k.c.b.c
    public boolean l() {
        return this.f16557d;
    }

    @Override // k.c.b.c
    public void m(String str) {
        this.f16560g = str;
    }

    @Override // k.c.b.c
    public Map<String, String> n() {
        return this.f16562i;
    }

    @Override // k.c.b.c
    public void o(File file) {
        this.r = file;
    }

    @Override // k.c.b.c
    public SimpleDateFormat p() {
        return this.q;
    }

    @Override // k.c.b.c
    public long q() {
        return this.a;
    }

    @Override // k.c.b.c
    public String r() {
        return this.f16561h;
    }

    @Override // k.c.b.c
    public String s() {
        return this.E;
    }

    @Override // k.c.b.c
    public boolean t() {
        return this.D;
    }

    @Override // k.c.b.c
    public boolean u() {
        return this.f16556c;
    }

    @Override // k.c.b.c
    public short v() {
        return this.z;
    }

    @Override // k.c.b.c
    public File w() {
        return I(null);
    }

    @Override // k.c.b.c
    public String x() {
        return this.f16560g;
    }

    @Override // k.c.b.c
    public int y() {
        return this.x;
    }

    @Override // k.c.b.c
    public boolean z() {
        return this.f16559f;
    }
}