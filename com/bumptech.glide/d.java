package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;

/* compiled from: GlideContext.java */
/* loaded from: classes.dex */
public class d extends ContextWrapper {
    static final l<?, ?> a = new a();

    /* renamed from: b */
    private final com.bumptech.glide.load.n.a0.b f3534b;

    /* renamed from: c */
    private final i f3535c;

    /* renamed from: d */
    private final com.bumptech.glide.r.j.f f3536d;

    /* renamed from: e */
    private final b.a f3537e;

    /* renamed from: f */
    private final List<com.bumptech.glide.r.e<Object>> f3538f;

    /* renamed from: g */
    private final Map<Class<?>, l<?, ?>> f3539g;

    /* renamed from: h */
    private final com.bumptech.glide.load.n.k f3540h;

    /* renamed from: i */
    private final e f3541i;

    /* renamed from: j */
    private final int f3542j;

    /* renamed from: k */
    private com.bumptech.glide.r.f f3543k;

    public d(Context context, com.bumptech.glide.load.n.a0.b bVar, i iVar, com.bumptech.glide.r.j.f fVar, b.a aVar, Map<Class<?>, l<?, ?>> map, List<com.bumptech.glide.r.e<Object>> list, com.bumptech.glide.load.n.k kVar, e eVar, int i2) {
        super(context.getApplicationContext());
        this.f3534b = bVar;
        this.f3535c = iVar;
        this.f3536d = fVar;
        this.f3537e = aVar;
        this.f3538f = list;
        this.f3539g = map;
        this.f3540h = kVar;
        this.f3541i = eVar;
        this.f3542j = i2;
    }

    public <X> com.bumptech.glide.r.j.i<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.f3536d.a(imageView, cls);
    }

    public com.bumptech.glide.load.n.a0.b b() {
        return this.f3534b;
    }

    public List<com.bumptech.glide.r.e<Object>> c() {
        return this.f3538f;
    }

    public synchronized com.bumptech.glide.r.f d() {
        if (this.f3543k == null) {
            this.f3543k = this.f3537e.a().L();
        }
        return this.f3543k;
    }

    public <T> l<?, T> e(Class<T> cls) {
        l<?, T> lVar = (l) this.f3539g.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, l<?, ?>> entry : this.f3539g.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (l) entry.getValue();
                }
            }
        }
        return lVar == null ? (l<?, T>) a : lVar;
    }

    public com.bumptech.glide.load.n.k f() {
        return this.f3540h;
    }

    public e g() {
        return this.f3541i;
    }

    public int h() {
        return this.f3542j;
    }

    public i i() {
        return this.f3535c;
    }
}