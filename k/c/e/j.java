package k.c.e;

import java.util.List;
import k.c.e.m.p;

/* compiled from: MapTileRequestState.java */
/* loaded from: classes3.dex */
public class j {
    private final List<p> a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16613b;

    /* renamed from: c, reason: collision with root package name */
    private final c f16614c;

    /* renamed from: d, reason: collision with root package name */
    private int f16615d;

    /* renamed from: e, reason: collision with root package name */
    private p f16616e;

    public j(long j2, List<p> list, c cVar) {
        this.a = list;
        this.f16613b = j2;
        this.f16614c = cVar;
    }

    public c a() {
        return this.f16614c;
    }

    public long b() {
        return this.f16613b;
    }

    public p c() {
        p pVar;
        if (d()) {
            pVar = null;
        } else {
            List<p> list = this.a;
            int i2 = this.f16615d;
            this.f16615d = i2 + 1;
            pVar = list.get(i2);
        }
        this.f16616e = pVar;
        return pVar;
    }

    public boolean d() {
        List<p> list = this.a;
        return list == null || this.f16615d >= list.size();
    }
}