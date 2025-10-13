package com.parizene.netmonitor.m0.a0;

import android.os.Build;
import android.telephony.CellInfo;

/* compiled from: CellInfoExtender.java */
/* loaded from: classes.dex */
public class f {
    public int a(CellInfo cellInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return cellInfo.getCellConnectionStatus();
        }
        return 0;
    }

    public long b(CellInfo cellInfo) {
        if (Build.VERSION.SDK_INT >= 30) {
            return cellInfo.getTimestampMillis();
        }
        long timeStamp = cellInfo.getTimeStamp();
        if (timeStamp == 2147483647L) {
            return 2147483647L;
        }
        return timeStamp / 1000000;
    }
}