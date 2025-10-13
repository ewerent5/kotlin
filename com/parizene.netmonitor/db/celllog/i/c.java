package com.parizene.netmonitor.db.celllog.i;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.parizene.netmonitor.m0.b0.k;
import com.parizene.netmonitor.ui.p0;

/* compiled from: CellEntityItem.java */
/* loaded from: classes.dex */
public abstract class c<CELL_INFO extends com.parizene.netmonitor.m0.b0.k> {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    protected String f13100b;

    /* renamed from: c, reason: collision with root package name */
    public final CELL_INFO f13101c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13102d;

    /* renamed from: e, reason: collision with root package name */
    private long f13103e;

    /* renamed from: f, reason: collision with root package name */
    private String f13104f;

    /* renamed from: g, reason: collision with root package name */
    private Location f13105g;

    public c(String str, String str2, CELL_INFO cell_info, boolean z) {
        this.a = str;
        this.f13100b = str2;
        this.f13101c = cell_info;
        this.f13102d = z;
    }

    public boolean a() {
        return !TextUtils.isEmpty(this.a);
    }

    public boolean b() {
        return true;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public int e() {
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f13102d != cVar.f13102d || this.f13103e != cVar.f13103e) {
            return false;
        }
        String str = this.a;
        if (str == null ? cVar.a != null : !str.equals(cVar.a)) {
            return false;
        }
        String str2 = this.f13100b;
        if (str2 == null ? cVar.f13100b != null : !str2.equals(cVar.f13100b)) {
            return false;
        }
        if (!this.f13101c.equals(cVar.f13101c)) {
            return false;
        }
        String str3 = this.f13104f;
        if (str3 == null ? cVar.f13104f != null : !str3.equals(cVar.f13104f)) {
            return false;
        }
        Location location = this.f13105g;
        Location location2 = cVar.f13105g;
        return location != null ? location.equals(location2) : location2 == null;
    }

    public abstract long f();

    public int g() {
        if (this.f13101c.f13304c.a()) {
            return this.f13101c.f13304c.a;
        }
        return -1;
    }

    public abstract int h();

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f13100b;
        int iHashCode2 = (((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f13101c.hashCode()) * 31) + (this.f13102d ? 1 : 0)) * 31;
        long j2 = this.f13103e;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str3 = this.f13104f;
        int iHashCode3 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Location location = this.f13105g;
        return iHashCode3 + (location != null ? location.hashCode() : 0);
    }

    public String i() {
        return this.a;
    }

    public String j() {
        return this.f13100b;
    }

    public abstract int k();

    public int l() {
        return -1;
    }

    public boolean m() {
        return this.f13102d;
    }

    public long n() {
        return this.f13103e;
    }

    public String o() {
        return this.f13104f;
    }

    public Location p() {
        return this.f13105g;
    }

    public String q(Context context, p0 p0Var, boolean z) {
        if (!this.f13101c.f13304c.a()) {
            return "";
        }
        return this.f13101c.f13304c.a + " | ";
    }

    public boolean r() {
        return !TextUtils.isEmpty(this.f13104f);
    }

    public boolean s() {
        return this.f13102d;
    }

    public void t(long j2) {
        this.f13103e = j2;
    }

    public c u(String str) {
        this.f13104f = str;
        return this;
    }

    public void v(Location location) {
        this.f13105g = location;
    }
}