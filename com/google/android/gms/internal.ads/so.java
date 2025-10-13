package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class so implements v13 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f8939e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f8940f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8941g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8942h;

    public so(Context context, String str) {
        this.f8939e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f8941g = str;
        this.f8942h = false;
        this.f8940f = new Object();
    }

    public final void a(boolean z) {
        if (zzs.zzA().g(this.f8939e)) {
            synchronized (this.f8940f) {
                if (this.f8942h == z) {
                    return;
                }
                this.f8942h = z;
                if (TextUtils.isEmpty(this.f8941g)) {
                    return;
                }
                if (this.f8942h) {
                    zzs.zzA().k(this.f8939e, this.f8941g);
                } else {
                    zzs.zzA().l(this.f8939e, this.f8941g);
                }
            }
        }
    }

    public final String b() {
        return this.f8941g;
    }

    @Override // com.google.android.gms.internal.ads.v13
    public final void c0(u13 u13Var) {
        a(u13Var.f9355j);
    }
}