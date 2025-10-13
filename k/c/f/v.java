package k.c.f;

import ch.qos.logback.classic.turbo.ReconfigureOnChangeFilter;
import java.util.HashMap;
import java.util.Map;

/* compiled from: UrlBackoff.java */
/* loaded from: classes3.dex */
public class v {
    private static final long[] a = {5000, 15000, ReconfigureOnChangeFilter.DEFAULT_REFRESH_PERIOD, 120000, 300000};

    /* renamed from: b, reason: collision with root package name */
    private long[] f16771b = a;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, b> f16772c = new HashMap();

    public void a(String str) {
        b bVar;
        synchronized (this.f16772c) {
            bVar = this.f16772c.get(str);
        }
        if (bVar != null) {
            bVar.a();
            return;
        }
        b bVar2 = new b(this.f16771b);
        synchronized (this.f16772c) {
            this.f16772c.put(str, bVar2);
        }
    }

    public b b(String str) {
        b bVarRemove;
        synchronized (this.f16772c) {
            bVarRemove = this.f16772c.remove(str);
        }
        return bVarRemove;
    }

    public boolean c(String str) {
        b bVar;
        synchronized (this.f16772c) {
            bVar = this.f16772c.get(str);
        }
        return bVar != null && bVar.c();
    }
}