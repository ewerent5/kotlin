package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class oq2 extends pr2 {

    /* renamed from: i, reason: collision with root package name */
    private final Activity f8002i;

    /* renamed from: j, reason: collision with root package name */
    private final View f8003j;

    public oq2(gq2 gq2Var, String str, String str2, eu0 eu0Var, int i2, int i3, View view, Activity activity) {
        super(gq2Var, "d7iz/RaEjr4+F5KeSshTAEj7Q3zrU63hP4JJ9g4PP8N7gmW+Iw0VuVNSijbICL3k", "qWEJpfGQyAWr4gtX2zyFUAILvlzTpMpm09EeOcWOxm8=", eu0Var, i2, 62);
        this.f8003j = view;
        this.f8002i = activity;
    }

    @Override // com.google.android.gms.internal.ads.pr2
    protected final void a() {
        if (this.f8003j == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) c.c().b(w3.C1)).booleanValue();
        Object[] objArr = (Object[]) this.f8257f.invoke(null, this.f8003j, this.f8002i, Boolean.valueOf(zBooleanValue));
        synchronized (this.f8256e) {
            this.f8256e.I(((Long) objArr[0]).longValue());
            this.f8256e.J(((Long) objArr[1]).longValue());
            if (zBooleanValue) {
                this.f8256e.L((String) objArr[2]);
            }
        }
    }
}