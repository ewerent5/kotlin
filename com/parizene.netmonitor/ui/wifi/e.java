package com.parizene.netmonitor.ui.wifi;

import android.net.wifi.ScanResult;

/* compiled from: WifiItem.java */
/* loaded from: classes3.dex */
class e {
    String a;

    /* renamed from: b, reason: collision with root package name */
    String f14049b;

    /* renamed from: c, reason: collision with root package name */
    String f14050c;

    /* renamed from: d, reason: collision with root package name */
    String f14051d;

    /* renamed from: e, reason: collision with root package name */
    int f14052e;

    e(ScanResult scanResult) {
        this.a = scanResult.SSID;
        this.f14049b = scanResult.BSSID;
        this.f14050c = String.valueOf(scanResult.frequency);
        this.f14051d = scanResult.capabilities;
        this.f14052e = scanResult.level;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f14052e != eVar.f14052e) {
            return false;
        }
        String str = this.a;
        if (str == null ? eVar.a != null : !str.equals(eVar.a)) {
            return false;
        }
        String str2 = this.f14049b;
        if (str2 == null ? eVar.f14049b != null : !str2.equals(eVar.f14049b)) {
            return false;
        }
        String str3 = this.f14050c;
        if (str3 == null ? eVar.f14050c != null : !str3.equals(eVar.f14050c)) {
            return false;
        }
        String str4 = this.f14051d;
        String str5 = eVar.f14051d;
        return str4 != null ? str4.equals(str5) : str5 == null;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f14049b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14050c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f14051d;
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f14052e;
    }
}