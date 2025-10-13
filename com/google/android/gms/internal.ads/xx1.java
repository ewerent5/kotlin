package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xx1 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final Looper f10303b;

    public xx1(Context context, Looper looper) {
        this.a = context;
        this.f10303b = looper;
    }

    public final void a(String str) {
        ny1 ny1VarD = ry1.D();
        ny1VarD.r(this.a.getPackageName());
        ny1VarD.q(qy1.BLOCKED_IMPRESSION);
        ky1 ky1VarD = ly1.D();
        ky1VarD.r(str);
        ky1VarD.q(jy1.BLOCKED_REASON_BACKGROUND);
        ny1VarD.s(ky1VarD);
        new yx1(this.a, this.f10303b, ny1VarD.n()).a();
    }
}