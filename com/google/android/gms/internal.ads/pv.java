package com.google.android.gms.internal.ads;

import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pv extends lv {
    public pv(lt ltVar) {
        super(ltVar);
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final boolean h(String str) throws NoSuchAlgorithmException {
        String strD = xq.d(str);
        lt ltVar = this.f7328g.get();
        if (ltVar != null && strD != null) {
            ltVar.l(strD, this);
        }
        er.zzi("VideoStreamNoopCache is doing nothing.");
        t(str, strD, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.lv
    public final void o() {
    }
}