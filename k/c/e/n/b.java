package k.c.e.n;

import android.util.Log;
import k.c.f.m;

/* compiled from: CloudmadeTileSource.java */
/* loaded from: classes3.dex */
public class b extends e implements c<Integer> {

    /* renamed from: m, reason: collision with root package name */
    private Integer f16687m;

    public b(String str, int i2, int i3, int i4, String str2, String[] strArr) {
        super(str, i2, i3, i4, str2, strArr);
        this.f16687m = 1;
    }

    @Override // k.c.e.n.c
    public void f(String str) {
        try {
            this.f16687m = Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            Log.e("OsmDroid", "Error setting integer style: " + str);
        }
    }

    @Override // k.c.e.n.a
    public String i() {
        Integer num = this.f16687m;
        if (num == null || num.intValue() <= 1) {
            return this.f16682e;
        }
        return this.f16682e + this.f16687m;
    }

    @Override // k.c.e.n.e
    public String m(long j2) {
        String strA = k.c.e.o.a.a();
        if (strA.length() == 0) {
            Log.e("OsmDroid", "CloudMade key is not set. You should enter it in the manifest and call CloudmadeUtil.retrieveCloudmadeKey()");
        }
        return String.format(k(), strA, this.f16687m, Integer.valueOf(a()), Integer.valueOf(m.e(j2)), Integer.valueOf(m.c(j2)), Integer.valueOf(m.d(j2)), this.f16684g, k.c.e.o.a.b());
    }
}