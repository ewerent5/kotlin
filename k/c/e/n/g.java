package k.c.e.n;

import android.util.Log;
import java.net.HttpURLConnection;

/* compiled from: TileSourcePolicy.java */
/* loaded from: classes3.dex */
public class g {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16703b;

    public g() {
        this(0, 0);
    }

    private boolean a() {
        return (this.f16703b & 4) == 0;
    }

    public boolean b() {
        return (this.f16703b & 2) == 0;
    }

    public boolean c(String str) {
        if (a()) {
            return true;
        }
        return (str == null || str.trim().length() <= 0 || str.equals("osmdroid")) ? false : true;
    }

    public long d(String str, String str2, long j2) {
        Long lD = k.c.b.a.a().D();
        if (lD != null) {
            return j2 + lD.longValue();
        }
        long jB = k.c.b.a.a().B();
        Long lF = f(str2);
        if (lF != null) {
            return j2 + (lF.longValue() * 1000) + jB;
        }
        Long lG = g(str);
        return lG != null ? lG.longValue() + jB : j2 + 604800000 + jB;
    }

    public long e(HttpURLConnection httpURLConnection, long j2) {
        String headerField = httpURLConnection.getHeaderField("Expires");
        String headerField2 = httpURLConnection.getHeaderField("Cache-Control");
        long jD = d(headerField, headerField2, j2);
        if (k.c.b.a.a().F()) {
            Log.d("OsmDroid", "computeExpirationTime('" + headerField + "','" + headerField2 + "'," + j2 + "=" + jD);
        }
        return jD;
    }

    public Long f(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            for (String str2 : str.split(", ")) {
                if (str2.indexOf("max-age=") == 0) {
                    return Long.valueOf(str2.substring(8));
                }
            }
            return null;
        } catch (Exception e2) {
            if (!k.c.b.a.a().F()) {
                return null;
            }
            Log.d("OsmDroid", "Unable to parse cache control tag for tile, server returned " + str, e2);
            return null;
        }
    }

    public Long g(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            return Long.valueOf(k.c.b.a.a().p().parse(str).getTime());
        } catch (Exception e2) {
            if (!k.c.b.a.a().F()) {
                return null;
            }
            Log.d("OsmDroid", "Unable to parse expiration tag for tile, server returned " + str, e2);
            return null;
        }
    }

    public int h() {
        return this.a;
    }

    public boolean i() {
        return (this.f16703b & 8) != 0;
    }

    public g(int i2, int i3) {
        this.a = i2;
        this.f16703b = i3;
    }
}