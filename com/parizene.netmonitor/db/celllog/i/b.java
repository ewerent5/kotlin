package com.parizene.netmonitor.db.celllog.i;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellEntity.java */
/* loaded from: classes.dex */
public class b {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public String f13088b;

    /* renamed from: c, reason: collision with root package name */
    public String f13089c;

    /* renamed from: d, reason: collision with root package name */
    public int f13090d;

    /* renamed from: e, reason: collision with root package name */
    public long f13091e;

    /* renamed from: f, reason: collision with root package name */
    public int f13092f;

    /* renamed from: g, reason: collision with root package name */
    public int f13093g;

    /* renamed from: h, reason: collision with root package name */
    public int f13094h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13095i;

    /* renamed from: j, reason: collision with root package name */
    public long f13096j;

    /* renamed from: k, reason: collision with root package name */
    public int f13097k;

    /* renamed from: l, reason: collision with root package name */
    public int f13098l;

    /* renamed from: m, reason: collision with root package name */
    public long f13099m;

    public b(String str, String str2, int i2, long j2, int i3, int i4, int i5, boolean z, long j3, int i6, int i7, long j4) {
        this.f13088b = str;
        this.f13089c = str2;
        this.f13090d = i2;
        this.f13091e = j2;
        this.f13092f = i3;
        this.f13093g = i4;
        this.f13094h = i5;
        this.f13095i = z;
        this.f13096j = j3;
        this.f13097k = i6;
        this.f13098l = i7;
        this.f13099m = j4;
    }

    public long a() {
        return 2 == this.f13097k ? 65535 & ((int) this.f13091e) : this.f13091e;
    }

    public int b() {
        if (2 != this.f13097k) {
            return 0;
        }
        long j2 = this.f13091e;
        if (((int) j2) > 65535) {
            return ((int) j2) >> 16;
        }
        return 0;
    }

    public String toString() {
        return "CellEntity{_id=" + this.a + ", mcc='" + this.f13088b + CoreConstants.SINGLE_QUOTE_CHAR + ", mnc='" + this.f13089c + CoreConstants.SINGLE_QUOTE_CHAR + ", lac=" + this.f13090d + ", cid=" + this.f13091e + ", psc=" + this.f13092f + ", cdmaLatitude=" + this.f13093g + ", cdmaLongitude=" + this.f13094h + ", wasCurrent=" + this.f13095i + ", lastMentioned=" + this.f13096j + ", networkType=" + this.f13097k + ", channel=" + this.f13098l + ", flags=" + this.f13099m + CoreConstants.CURLY_RIGHT;
    }

    public b(g.a.a.a.d dVar) {
        this.f13088b = dVar.a(0);
        this.f13089c = dVar.a(1);
        this.f13090d = Integer.parseInt(dVar.a(2));
        this.f13091e = Long.parseLong(dVar.a(3));
        this.f13092f = Integer.parseInt(dVar.a(4));
        this.f13093g = Integer.parseInt(dVar.a(5));
        this.f13094h = Integer.parseInt(dVar.a(6));
        this.f13095i = Integer.parseInt(dVar.a(7)) > 0;
        this.f13096j = Long.parseLong(dVar.a(8));
        this.f13097k = Integer.parseInt(dVar.a(9));
        this.f13098l = Integer.parseInt(dVar.a(10));
        this.f13099m = Long.parseLong(dVar.a(11));
    }

    public b(String[] strArr) {
        this.f13088b = strArr[0];
        this.f13089c = strArr[1];
        this.f13090d = Integer.parseInt(strArr[2]);
        this.f13091e = Long.parseLong(strArr[3]);
        this.f13092f = Integer.parseInt(strArr[4]);
        this.f13093g = Integer.parseInt(strArr[5]);
        this.f13094h = Integer.parseInt(strArr[6]);
        this.f13095i = Integer.parseInt(strArr[7]) > 0;
        this.f13096j = Long.parseLong(strArr[8]);
        this.f13097k = Integer.parseInt(strArr[9]);
        this.f13098l = Integer.parseInt(strArr[10]);
        this.f13099m = Long.parseLong(strArr[11]);
    }
}