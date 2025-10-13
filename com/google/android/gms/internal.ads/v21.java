package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class v21 implements vs1 {
    private final x21 a;

    /* renamed from: b */
    private final z21 f9625b;

    v21(x21 x21Var, z21 z21Var) {
        this.a = x21Var;
        this.f9625b = z21Var;
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final Object zza(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        this.a.j(this.f9625b, (SQLiteDatabase) obj);
        return null;
    }
}