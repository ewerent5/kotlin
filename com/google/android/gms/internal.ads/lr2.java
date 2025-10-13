package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class lr2 extends pr2 {
    public lr2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3) {
        super(gq2Var, "wxqoL0Ntglf/xfXLeHxTqKHQFZETSKw9Sjjan4AxX5JFG223VwKhlfBIQokmMH5F", "Qt5tltWJjiKcHVLLbGsBdffUrcF61Y4NeRTZLQPykHE=", eu0Var, i2, 48);
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        this.f8256e.v(ek1.ENUM_FAILURE);
        boolean zBooleanValue = ((Boolean) this.f8257f.invoke(null, this.f8253b.b())).booleanValue();
        synchronized (this.f8256e) {
            if (zBooleanValue) {
                this.f8256e.v(ek1.ENUM_TRUE);
            } else {
                this.f8256e.v(ek1.ENUM_FALSE);
            }
        }
    }
}