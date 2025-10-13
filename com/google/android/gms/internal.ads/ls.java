package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ls implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f7297e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f7298f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ rs f7299g;

    ls(rs rsVar, String str, String str2) {
        this.f7299g = rsVar;
        this.f7297e = str;
        this.f7298f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7299g.w != null) {
            this.f7299g.w.c(this.f7297e, this.f7298f);
        }
    }
}