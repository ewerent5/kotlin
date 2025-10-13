package com.parizene.netmonitor.m0;

import android.os.Build;
import android.telephony.SubscriptionInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: SubscriptionIdsInfoCreator.java */
/* loaded from: classes.dex */
public class u {
    private final com.parizene.netmonitor.m0.d0.d a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a<com.google.firebase.crashlytics.c> f13522b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13523c;

    public u(com.parizene.netmonitor.m0.d0.d dVar, f.a<com.google.firebase.crashlytics.c> aVar) {
        this.a = dVar;
        this.f13522b = aVar;
    }

    private boolean b(int i2) {
        return -1 == i2 || 2147483643 == i2 || -2 == i2 || -1000 == i2 || -3 == i2;
    }

    private void c(int i2, int i3, int i4, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i5 = 0; i5 < i2; i5++) {
            if (i5 != 0) {
                sb.append(", ");
            }
            sb.append(i5);
            sb.append(": ");
            SubscriptionInfo subscriptionInfoC = this.a.c(i5);
            if (subscriptionInfoC == null) {
                sb.append("<none>");
            } else {
                sb.append("subscriptionId=");
                sb.append(subscriptionInfoC.getSubscriptionId());
            }
        }
        sb.append("]");
        this.f13522b.get().c(new IllegalStateException("phoneCount=" + i2 + ", SDK_INT=" + Build.VERSION.SDK_INT + ", MANUFACTURER=" + Build.MANUFACTURER + ", MODEL=" + Build.MODEL + ", DEVICE=" + Build.DEVICE + ", defaultSubscriptionId=" + i3 + "{" + this.a.x(i3) + "}, defaultDataSubscriptionId=" + i4 + "{" + this.a.x(i4) + "}, subscriptionIds=" + Arrays.toString(iArr) + ", slots=" + sb.toString()));
    }

    public t a() {
        int iT = this.a.t();
        int iK = this.a.k();
        int iJ = this.a.j();
        int[] iArrB = this.a.b();
        int i2 = (b(iK) || Integer.MAX_VALUE == iK) ? (b(iJ) || Integer.MAX_VALUE == iJ) ? Integer.MAX_VALUE : iJ : iK;
        int i3 = (b(iJ) || Integer.MAX_VALUE == iJ) ? i2 : iJ;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i4 = 0;
        if (iArrB != null) {
            for (int i5 : iArrB) {
                linkedHashSet.add(Integer.valueOf(i5));
            }
        }
        linkedHashSet.add(Integer.valueOf(i2));
        linkedHashSet.add(Integer.valueOf(i3));
        int[] iArr = new int[linkedHashSet.size()];
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            iArr[i4] = ((Integer) it.next()).intValue();
            i4++;
        }
        if (!this.f13523c && (iT < linkedHashSet.size() || iT > 2 || i2 < 0 || i3 < 0 || (linkedHashSet.size() > 1 && linkedHashSet.contains(Integer.MAX_VALUE)))) {
            this.f13523c = true;
            c(iT, iK, iJ, iArrB);
        }
        return new t(i2, i3, iArr);
    }
}