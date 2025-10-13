package com.parizene.netmonitor.db.celllog.i;

import android.location.Location;
import android.text.TextUtils;

/* compiled from: CellJoinGeolocationJoinClfEntity.java */
/* loaded from: classes.dex */
public class e extends b {
    public int n;
    public int o;
    public int p;
    public String q;
    public int r;
    public int s;
    public String t;

    public e(String str, String str2, int i2, long j2, int i3, int i4, int i5, boolean z, long j3, int i6, int i7) {
        super(str, str2, i2, j2, i3, i4, i5, z, j3, i6, i7, 0L);
    }

    public int c() {
        if (3 == g()) {
            return this.p;
        }
        return 0;
    }

    public String d() {
        if (!TextUtils.isEmpty(this.t)) {
            return this.t;
        }
        if (TextUtils.isEmpty(this.q)) {
            return "-";
        }
        if (this.p == 0) {
            return this.q;
        }
        return "±" + this.p + " (m), " + this.q;
    }

    public int e() {
        if (TextUtils.isEmpty(this.t)) {
            return !TextUtils.isEmpty(this.q) ? 3 : 0;
        }
        return 1;
    }

    public Location f() {
        int i2;
        int i3 = this.r;
        int i4 = 0;
        if ((i3 == 0 || (i2 = this.s) == 0) && (((i3 = this.f13093g) == 0 || (i2 = this.f13094h) == 0) && ((i3 = this.n) == 0 || (i2 = this.o) == 0))) {
            i3 = 0;
        } else {
            i4 = i2;
        }
        if (i3 == 0 || i4 == 0) {
            return null;
        }
        Location location = new Location((String) null);
        location.setLatitude(i3 / 1000000.0d);
        location.setLongitude(i4 / 1000000.0d);
        return location;
    }

    public int g() {
        if (this.r != 0 && this.s != 0) {
            return 1;
        }
        if (this.f13093g == 0 || this.f13094h == 0) {
            return (this.n == 0 || this.o == 0) ? 0 : 3;
        }
        return 2;
    }
}