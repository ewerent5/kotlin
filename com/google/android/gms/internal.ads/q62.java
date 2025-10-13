package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class q62 {
    private static final CopyOnWriteArrayList<p62> a = new CopyOnWriteArrayList<>();

    public static p62 a(String str) throws GeneralSecurityException {
        Iterator<p62> it = a.iterator();
        while (it.hasNext()) {
            p62 next = it.next();
            if (next.zza()) {
                return next;
            }
        }
        String strValueOf = String.valueOf(str);
        throw new GeneralSecurityException(strValueOf.length() != 0 ? "No KMS client does support: ".concat(strValueOf) : new String("No KMS client does support: "));
    }
}