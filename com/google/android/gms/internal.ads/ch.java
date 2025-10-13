package com.google.android.gms.internal.ads;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class ch {
    public static int a(e.c.a.a aVar) {
        e.c.a.a aVar2 = e.c.a.a.INVALID_REQUEST;
        e.c.a.b bVar = e.c.a.b.UNKNOWN;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? 0 : 2;
        }
        return 3;
    }

    public static com.google.ads.mediation.a b(m93 m93Var, boolean z) {
        List<String> list = m93Var.f7447i;
        HashSet hashSet = list != null ? new HashSet(list) : null;
        Date date = new Date(m93Var.f7444f);
        int i2 = m93Var.f7446h;
        return new com.google.ads.mediation.a(date, i2 != 1 ? i2 != 2 ? e.c.a.b.UNKNOWN : e.c.a.b.FEMALE : e.c.a.b.MALE, hashSet, z, m93Var.o);
    }
}