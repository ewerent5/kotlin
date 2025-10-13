package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pq2 extends pr2 {
    public pq2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3) {
        super(gq2Var, "p3Z3ZqZKo17onS4HiiEtpoGwRIBviLad/ZdN5J9oBr9KBduQsBv0bePYyi9xIk1Y", "iFXNP6ElZKxf5HXZJFDnSU66PfDdP3IuIwL5oCTFkB0=", eu0Var, i2, 49);
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() throws InvocationTargetException {
        this.f8256e.w(ek1.ENUM_FAILURE);
        try {
            this.f8256e.w(((Boolean) this.f8257f.invoke(null, this.f8253b.b())).booleanValue() ? ek1.ENUM_TRUE : ek1.ENUM_FALSE);
        } catch (InvocationTargetException e2) {
            if (!(e2.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e2;
            }
        }
    }
}