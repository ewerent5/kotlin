package k.c.g;

import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: MapViewRepository.java */
/* loaded from: classes3.dex */
public class e {
    private d a;

    /* renamed from: b, reason: collision with root package name */
    private Drawable f16849b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<k.c.g.g.i.a> f16850c = new HashSet();

    public e(d dVar) {
        this.a = dVar;
    }

    public void a() {
        synchronized (this.f16850c) {
            Iterator<k.c.g.g.i.a> it = this.f16850c.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f16850c.clear();
        }
        this.a = null;
        this.f16849b = null;
    }
}