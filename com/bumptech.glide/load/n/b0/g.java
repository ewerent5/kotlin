package com.bumptech.glide.load.n.b0;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.n.b0.h;
import com.bumptech.glide.load.n.v;

/* compiled from: LruResourceCache.java */
/* loaded from: classes.dex */
public class g extends com.bumptech.glide.t.g<com.bumptech.glide.load.g, v<?>> implements h {

    /* renamed from: e, reason: collision with root package name */
    private h.a f3690e;

    public g(long j2) {
        super(j2);
    }

    @Override // com.bumptech.glide.load.n.b0.h
    @SuppressLint({"InlinedApi"})
    public void a(int i2) {
        if (i2 >= 40) {
            b();
        } else if (i2 >= 20 || i2 == 15) {
            m(h() / 2);
        }
    }

    @Override // com.bumptech.glide.load.n.b0.h
    public /* bridge */ /* synthetic */ v c(com.bumptech.glide.load.g gVar, v vVar) {
        return (v) super.k(gVar, vVar);
    }

    @Override // com.bumptech.glide.load.n.b0.h
    public /* bridge */ /* synthetic */ v d(com.bumptech.glide.load.g gVar) {
        return (v) super.l(gVar);
    }

    @Override // com.bumptech.glide.load.n.b0.h
    public void e(h.a aVar) {
        this.f3690e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.t.g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(v<?> vVar) {
        return vVar == null ? super.i(null) : vVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.t.g
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(com.bumptech.glide.load.g gVar, v<?> vVar) {
        h.a aVar = this.f3690e;
        if (aVar == null || vVar == null) {
            return;
        }
        aVar.a(vVar);
    }
}