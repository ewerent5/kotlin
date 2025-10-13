package com.parizene.netmonitor.m0.a0;

import android.os.Build;
import android.telephony.CellIdentityGsm;

/* compiled from: CellIdentityGsmExtender.java */
/* loaded from: classes.dex */
public class a {
    public int a(CellIdentityGsm cellIdentityGsm) {
        if (Build.VERSION.SDK_INT >= 24) {
            return cellIdentityGsm.getArfcn();
        }
        return Integer.MAX_VALUE;
    }

    public int b(CellIdentityGsm cellIdentityGsm) {
        if (Build.VERSION.SDK_INT >= 24) {
            return cellIdentityGsm.getBsic();
        }
        return Integer.MAX_VALUE;
    }

    public String c(CellIdentityGsm cellIdentityGsm) {
        if (Build.VERSION.SDK_INT >= 28) {
            return cellIdentityGsm.getMccString();
        }
        return null;
    }

    public String d(CellIdentityGsm cellIdentityGsm) {
        if (Build.VERSION.SDK_INT >= 28) {
            return cellIdentityGsm.getMncString();
        }
        return null;
    }
}