package e.c.b.b.c.e;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import e.c.b.b.c.e.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
final class k extends h.a {

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ String f14652i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ String f14653j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ Context f14654k;

    /* renamed from: l, reason: collision with root package name */
    private final /* synthetic */ Bundle f14655l;

    /* renamed from: m, reason: collision with root package name */
    private final /* synthetic */ h f14656m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(h hVar, String str, String str2, Context context, Bundle bundle) {
        super(hVar);
        this.f14656m = hVar;
        this.f14652i = str;
        this.f14653j = str2;
        this.f14654k = context;
        this.f14655l = bundle;
    }

    @Override // e.c.b.b.c.e.h.a
    public final void a() {
        String str;
        String str2;
        String str3;
        boolean z;
        int iMax;
        try {
            h hVar = this.f14656m;
            if (h.H(this.f14652i, this.f14653j)) {
                String str4 = this.f14653j;
                str2 = this.f14652i;
                str3 = str4;
                str = this.f14656m.f14562e;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            h.R(this.f14654k);
            boolean z2 = h.f14559b.booleanValue() || str2 != null;
            h hVar2 = this.f14656m;
            hVar2.f14570m = hVar2.d(this.f14654k, z2);
            if (this.f14656m.f14570m == null) {
                Log.w(this.f14656m.f14562e, "Failed to connect to measurement client.");
                return;
            }
            int iP = h.P(this.f14654k);
            int iN = h.N(this.f14654k);
            if (z2) {
                iMax = Math.max(iP, iN);
                z = iN < iP;
            } else {
                if (iP > 0) {
                    iN = iP;
                }
                z = iP > 0;
                iMax = iN;
            }
            this.f14656m.f14570m.initialize(e.c.b.b.b.d.m4(this.f14654k), new f(33025L, iMax, z, str, str2, str3, this.f14655l), this.f14571e);
        } catch (Exception e2) {
            this.f14656m.p(e2, true, false);
        }
    }
}