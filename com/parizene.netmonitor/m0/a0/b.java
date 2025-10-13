package com.parizene.netmonitor.m0.a0;

import android.os.Build;
import android.telephony.CellIdentityLte;

/* compiled from: CellIdentityLteExtender.java */
/* loaded from: classes.dex */
public class b {
    public int[] a(CellIdentityLte cellIdentityLte) {
        return Build.VERSION.SDK_INT >= 30 ? cellIdentityLte.getBands() : new int[0];
    }

    public int b(CellIdentityLte cellIdentityLte) {
        if (Build.VERSION.SDK_INT >= 28) {
            return cellIdentityLte.getBandwidth();
        }
        return Integer.MAX_VALUE;
    }

    public int c(CellIdentityLte cellIdentityLte) {
        if (Build.VERSION.SDK_INT >= 24) {
            return cellIdentityLte.getEarfcn();
        }
        return Integer.MAX_VALUE;
    }

    public String d(CellIdentityLte cellIdentityLte) {
        if (Build.VERSION.SDK_INT >= 28) {
            return cellIdentityLte.getMccString();
        }
        return null;
    }

    public String e(CellIdentityLte cellIdentityLte) {
        if (Build.VERSION.SDK_INT >= 28) {
            return cellIdentityLte.getMncString();
        }
        return null;
    }
}