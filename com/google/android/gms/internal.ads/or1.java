package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class or1 implements nr1 {
    private final Object[] a;

    public or1(m93 m93Var, String str, int i2, String str2, y93 y93Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i2));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(m93Var.f7444f));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(m93Var.f7445g));
        } else if (hashSet.contains("npa")) {
            arrayList.add(m93Var.f7445g.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(m93Var.f7446h));
        }
        if (hashSet.contains("keywords")) {
            List<String> list = m93Var.f7447i;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(m93Var.f7448j));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(m93Var.f7449k));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(m93Var.f7450l));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(m93Var.f7451m);
        }
        if (hashSet.contains("location")) {
            Location location = m93Var.o;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(m93Var.p);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(m93Var.q));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(m93Var.r));
        }
        if (hashSet.contains("categoryExclusions")) {
            List<String> list2 = m93Var.s;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(m93Var.t);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(m93Var.u);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(m93Var.v));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(m93Var.x));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(m93Var.y);
        }
        if (hashSet.contains("orientation")) {
            if (y93Var != null) {
                arrayList.add(Integer.valueOf(y93Var.f10399e));
            } else {
                arrayList.add(null);
            }
        }
        this.a = arrayList.toArray();
    }

    private static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.nr1
    public final boolean equals(Object obj) {
        if (obj instanceof or1) {
            return Arrays.equals(this.a, ((or1) obj).a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nr1
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        int iHashCode = Arrays.hashCode(this.a);
        String string = Arrays.toString(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 22);
        sb.append("[PoolKey#");
        sb.append(iHashCode);
        sb.append(" ");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}