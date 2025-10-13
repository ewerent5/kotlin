package com.parizene.netmonitor.m0.a0;

import android.os.Build;
import android.telephony.CellIdentityNr;

/* compiled from: CellIdentityNrExtender.java */
/* loaded from: classes.dex */
public class c {
    public int[] a(CellIdentityNr cellIdentityNr) {
        if (Build.VERSION.SDK_INT >= 30) {
            return cellIdentityNr.getBands();
        }
        return null;
    }
}