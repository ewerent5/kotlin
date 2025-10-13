package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzs;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class lv implements com.google.android.gms.common.api.i {

    /* renamed from: e, reason: collision with root package name */
    protected final Context f7326e;

    /* renamed from: f, reason: collision with root package name */
    protected final String f7327f;

    /* renamed from: g, reason: collision with root package name */
    protected final WeakReference<lt> f7328g;

    public lv(lt ltVar) {
        Context context = ltVar.getContext();
        this.f7326e = context;
        this.f7327f = zzs.zzc().zze(context, ltVar.zzt().f7054e);
        this.f7328g = new WeakReference<>(ltVar);
    }

    static /* synthetic */ void u(lv lvVar, String str, Map map) {
        lt ltVar = lvVar.f7328g.get();
        if (ltVar != null) {
            ltVar.e0("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.i
    public void a() {
    }

    public abstract boolean h(String str);

    public boolean i(String str, String[] strArr) {
        return h(str);
    }

    protected void j(int i2) {
    }

    protected void l(int i2) {
    }

    protected void m(int i2) {
    }

    protected void n(int i2) {
    }

    public abstract void o();

    public final void p(String str, String str2, long j2, long j3, boolean z, long j4, long j5, long j6, int i2, int i3) {
        xq.a.post(new gv(this, str, str2, j2, j3, j4, j5, j6, z, i2, i3));
    }

    public final void q(String str, String str2, int i2, int i3, long j2, long j3, boolean z, int i4, int i5) {
        xq.a.post(new hv(this, str, str2, i2, i3, j2, j3, z, i4, i5));
    }

    protected final void r(String str, String str2, int i2) {
        xq.a.post(new iv(this, str, str2, i2));
    }

    public final void s(String str, String str2, long j2) {
        xq.a.post(new jv(this, str, str2, j2));
    }

    public final void t(String str, String str2, String str3, String str4) {
        xq.a.post(new kv(this, str, str2, str3, str4));
    }
}