package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xq2 extends pr2 {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f10229i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f10230j = new Object();

    public xq2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3) {
        super(gq2Var, "fkf51aLEFXfiNurGHbx1BSH7msQozHZOJXYpsm8ziDxIsSol9uz7PMVXAs+R19N8", "cKfFcdJiOvmUtUL2Y5P/s8OlQJiCVurBpl7VcHQsb0I=", eu0Var, i2, 22);
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        if (f10229i == null) {
            synchronized (f10230j) {
                if (f10229i == null) {
                    f10229i = (Long) this.f8257f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f8256e) {
            this.f8256e.f0(f10229i.longValue());
        }
    }
}