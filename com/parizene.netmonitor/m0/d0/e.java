package com.parizene.netmonitor.m0.d0;

import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: TelephonyManagerWrapperProxy.java */
/* loaded from: classes.dex */
public class e {
    private final d a;

    public e(d dVar) {
        this.a = dVar;
    }

    public List<CellInfo> a(int i2) {
        return Integer.MAX_VALUE == i2 ? this.a.d() : this.a.e(i2);
    }

    public CellLocation b(int i2) {
        return Integer.MAX_VALUE == i2 ? this.a.f() : this.a.g(i2);
    }

    public int c(int i2) {
        return Integer.MAX_VALUE == i2 ? this.a.h() : Build.VERSION.SDK_INT >= 29 ? this.a.a(i2).h() : this.a.i(i2);
    }

    public List<NeighboringCellInfo> d(int i2) {
        return Integer.MAX_VALUE == i2 ? this.a.l() : this.a.m(i2);
    }

    public String e(int i2) {
        return Integer.MAX_VALUE == i2 ? this.a.n() : Build.VERSION.SDK_INT >= 29 ? this.a.a(i2).n() : this.a.o(i2);
    }

    public String f(int i2) {
        return Integer.MAX_VALUE == i2 ? this.a.p() : Build.VERSION.SDK_INT >= 29 ? this.a.a(i2).p() : this.a.q(i2);
    }

    public int g(int i2) {
        return Integer.MAX_VALUE == i2 ? this.a.r() : Build.VERSION.SDK_INT >= 29 ? this.a.a(i2).r() : this.a.s(i2);
    }

    public int h(int i2) {
        return Integer.MAX_VALUE == i2 ? this.a.v() : this.a.w(i2);
    }

    public int i(int i2) {
        return Integer.MAX_VALUE == i2 ? this.a.y() : Build.VERSION.SDK_INT >= 29 ? this.a.a(i2).y() : this.a.z(i2);
    }

    public boolean j(int i2) {
        return Integer.MAX_VALUE == i2 ? this.a.C() : this.a.D(i2);
    }

    public void k(PhoneStateListener phoneStateListener, int i2, int i3) throws IllegalAccessException, IllegalArgumentException {
        if (Integer.MAX_VALUE == i3) {
            this.a.E(phoneStateListener, i2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.a.a(i3).E(phoneStateListener, i2);
        } else {
            this.a.F(phoneStateListener, i2, i3);
        }
    }

    public void l(Executor executor, TelephonyManager.CellInfoCallback cellInfoCallback, int i2) {
        if (Integer.MAX_VALUE == i2) {
            this.a.G(executor, cellInfoCallback);
        } else {
            this.a.a(i2).G(executor, cellInfoCallback);
        }
    }
}