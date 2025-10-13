package com.parizene.netmonitor.m0.d0;

import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.SubscriptionInfo;
import android.telephony.TelephonyManager;
import com.parizene.netmonitor.m0.a0.j;
import com.parizene.netmonitor.m0.a0.n;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: TelephonyManagerWrapper.java */
/* loaded from: classes.dex */
public class d {
    private final TelephonyManager a;

    /* renamed from: b, reason: collision with root package name */
    private final n f13369b;

    /* renamed from: c, reason: collision with root package name */
    private final j f13370c;

    /* renamed from: d, reason: collision with root package name */
    private final c f13371d;

    public d(TelephonyManager telephonyManager, n nVar, j jVar, c cVar) {
        this.a = telephonyManager;
        this.f13369b = nVar;
        this.f13370c = jVar;
        this.f13371d = cVar;
    }

    public boolean A() {
        return this.f13369b.n();
    }

    public boolean B() {
        return this.f13369b.o();
    }

    public boolean C() {
        return this.a.isNetworkRoaming();
    }

    public boolean D(int i2) {
        return this.f13369b.p(this.a, i2);
    }

    public void E(PhoneStateListener phoneStateListener, int i2) {
        this.a.listen(phoneStateListener, i2);
    }

    public void F(PhoneStateListener phoneStateListener, int i2, int i3) throws IllegalAccessException, IllegalArgumentException {
        this.f13370c.a(phoneStateListener, i3);
        this.a.listen(phoneStateListener, i2);
    }

    public void G(Executor executor, TelephonyManager.CellInfoCallback cellInfoCallback) {
        this.f13369b.q(this.a, executor, cellInfoCallback);
    }

    public d a(int i2) {
        return new d(this.f13369b.a(this.a, i2), this.f13369b, this.f13370c, this.f13371d);
    }

    public int[] b() {
        return this.f13371d.a();
    }

    public SubscriptionInfo c(int i2) {
        return this.f13371d.b(i2);
    }

    public List<CellInfo> d() {
        return this.a.getAllCellInfo();
    }

    public List<CellInfo> e(int i2) {
        return this.f13369b.b(this.a, i2);
    }

    public CellLocation f() {
        return this.a.getCellLocation();
    }

    public CellLocation g(int i2) {
        return this.f13369b.c(this.a, i2);
    }

    public int h() {
        return this.f13369b.d(this.a);
    }

    public int i(int i2) {
        return this.f13369b.e(this.a, i2);
    }

    public int j() {
        return c.c();
    }

    public int k() {
        return c.d();
    }

    public List<NeighboringCellInfo> l() {
        return this.f13369b.f(this.a);
    }

    public List<NeighboringCellInfo> m(int i2) {
        return null;
    }

    public String n() {
        return this.a.getNetworkOperator();
    }

    public String o(int i2) {
        return this.f13369b.g(this.a, i2);
    }

    public String p() {
        return this.a.getNetworkOperatorName();
    }

    public String q(int i2) {
        return this.f13369b.h(this.a, i2);
    }

    public int r() {
        return this.a.getNetworkType();
    }

    public int s(int i2) {
        return this.f13369b.i(this.a, i2);
    }

    public int t() {
        return this.f13369b.j(this.a);
    }

    public int u() {
        return this.a.getPhoneType();
    }

    public int v() {
        return this.a.getSimState();
    }

    public int w(int i2) {
        return this.f13369b.k(this.a, i2);
    }

    public int x(int i2) {
        return c.e(i2);
    }

    public int y() {
        return this.f13369b.l(this.a);
    }

    public int z(int i2) {
        return this.f13369b.m(this.a, i2);
    }
}