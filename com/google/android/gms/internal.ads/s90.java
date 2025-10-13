package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class s90 implements dc0, jb0 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f8843e;

    /* renamed from: f, reason: collision with root package name */
    private final xo1 f8844f;

    /* renamed from: g, reason: collision with root package name */
    private final ak f8845g;

    public s90(Context context, xo1 xo1Var, ak akVar, byte[] bArr) {
        this.f8843e = context;
        this.f8844f = xo1Var;
        this.f8845g = akVar;
    }

    @Override // com.google.android.gms.internal.ads.dc0
    public final void b0() {
        bk bkVar = this.f8844f.X;
        if (bkVar == null || !bkVar.a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f8844f.X.f5122b.isEmpty()) {
            return;
        }
        arrayList.add(this.f8844f.X.f5122b);
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void c(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void u(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void x(Context context) {
    }
}