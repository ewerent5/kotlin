package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fr2 extends pr2 {

    /* renamed from: i, reason: collision with root package name */
    private List<Long> f5938i;

    public fr2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3) {
        super(gq2Var, "01WVlVdbgqf6HoqKu0lbNygNbv+PeABTWOhn2U9poUmT5M2s6ThNH6tyerCKZPnK", "Ez0nM00ERfZLMPX0zqZ/JlTWlq6o9myQL/+TGyXV+Nc=", eu0Var, i2, 31);
        this.f5938i = null;
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        this.f8256e.j0(-1L);
        this.f8256e.k0(-1L);
        if (this.f5938i == null) {
            this.f5938i = (List) this.f8257f.invoke(null, this.f8253b.b());
        }
        List<Long> list = this.f5938i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f8256e) {
            this.f8256e.j0(this.f5938i.get(0).longValue());
            this.f8256e.k0(this.f5938i.get(1).longValue());
        }
    }
}