package com.parizene.netmonitor.m0.a0;

import android.os.Build;
import android.telephony.CellIdentityWcdma;

/* compiled from: CellIdentityWcdmaExtender.java */
/* loaded from: classes.dex */
public class e {
    public String a(CellIdentityWcdma cellIdentityWcdma) {
        if (Build.VERSION.SDK_INT >= 28) {
            return cellIdentityWcdma.getMccString();
        }
        return null;
    }

    public String b(CellIdentityWcdma cellIdentityWcdma) {
        if (Build.VERSION.SDK_INT >= 28) {
            return cellIdentityWcdma.getMncString();
        }
        return null;
    }

    public int c(CellIdentityWcdma cellIdentityWcdma) {
        if (Build.VERSION.SDK_INT >= 24) {
            return cellIdentityWcdma.getUarfcn();
        }
        return Integer.MAX_VALUE;
    }
}