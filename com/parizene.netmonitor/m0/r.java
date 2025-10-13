package com.parizene.netmonitor.m0;

import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.util.SparseArray;
import com.parizene.netmonitor.m0.d0.f.a0;
import com.parizene.netmonitor.m0.d0.f.z;
import java.util.List;

/* compiled from: PhoneStateListenerManager.java */
/* loaded from: classes.dex */
public class r {
    private final com.parizene.netmonitor.m0.d0.d a;

    /* renamed from: b, reason: collision with root package name */
    private final com.parizene.netmonitor.m0.d0.e f13511b;

    /* renamed from: c, reason: collision with root package name */
    private final com.parizene.netmonitor.m0.d0.a f13512c;

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<a> f13513d = new SparseArray<>();

    /* compiled from: PhoneStateListenerManager.java */
    private static class a extends com.parizene.netmonitor.m0.d0.b {

        /* renamed from: b, reason: collision with root package name */
        private final com.parizene.netmonitor.m0.d0.a f13514b;

        /* renamed from: c, reason: collision with root package name */
        private z f13515c;

        /* renamed from: d, reason: collision with root package name */
        private a0 f13516d;

        /* renamed from: e, reason: collision with root package name */
        private com.parizene.netmonitor.m0.d0.f.p f13517e;

        a(int i2, com.parizene.netmonitor.m0.d0.a aVar) {
            super(i2);
            this.f13514b = aVar;
        }

        public com.parizene.netmonitor.m0.d0.f.p b() {
            return this.f13517e;
        }

        public z c() {
            return this.f13515c;
        }

        public a0 d() {
            return this.f13516d;
        }

        @Override // android.telephony.PhoneStateListener
        public void onCellInfoChanged(List<CellInfo> list) {
            m.a.a.a("{%d} cellInfos=%s", Integer.valueOf(this.a), this.f13514b.A(list));
        }

        @Override // android.telephony.PhoneStateListener
        public void onCellLocationChanged(CellLocation cellLocation) {
            this.f13517e = this.f13514b.p(cellLocation);
            m.a.a.a("{%d} cellLocation=%s", Integer.valueOf(this.a), this.f13517e);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            this.f13515c = this.f13514b.y(serviceState);
            m.a.a.a("{%d} serviceState=%s", Integer.valueOf(this.a), this.f13515c);
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            this.f13516d = this.f13514b.z(signalStrength);
            m.a.a.a("{%d} signalStrength=%s", Integer.valueOf(this.a), this.f13516d);
        }
    }

    public r(com.parizene.netmonitor.m0.d0.d dVar, com.parizene.netmonitor.m0.d0.e eVar, com.parizene.netmonitor.m0.d0.a aVar) {
        this.a = dVar;
        this.f13511b = eVar;
        this.f13512c = aVar;
    }

    void a() {
        a aVar = new a(Integer.MAX_VALUE, this.f13512c);
        this.f13513d.put(aVar.a(), aVar);
        int[] iArrB = this.a.b();
        if (iArrB != null) {
            for (int i2 : iArrB) {
                a aVar2 = new a(i2, this.f13512c);
                this.f13513d.put(aVar2.a(), aVar2);
            }
        }
    }

    com.parizene.netmonitor.m0.d0.f.p b(int i2) {
        a aVar = this.f13513d.get(i2);
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    z c(int i2) {
        a aVar = this.f13513d.get(i2);
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    a0 d(int i2) {
        a aVar = this.f13513d.get(i2);
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }

    void e(int i2) {
        for (int i3 = 0; i3 < this.f13513d.size(); i3++) {
            a aVarValueAt = this.f13513d.valueAt(i3);
            this.f13511b.k(aVarValueAt, i2, aVarValueAt.a());
        }
    }

    void f() {
        this.f13513d.clear();
    }
}