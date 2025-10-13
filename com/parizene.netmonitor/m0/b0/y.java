package com.parizene.netmonitor.m0.b0;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: NetworkInfo.java */
/* loaded from: classes.dex */
public class y {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f13313b;

    /* renamed from: c, reason: collision with root package name */
    private String f13314c;

    /* renamed from: d, reason: collision with root package name */
    private String f13315d;

    /* renamed from: e, reason: collision with root package name */
    private String f13316e;

    /* renamed from: f, reason: collision with root package name */
    private int f13317f;

    /* renamed from: g, reason: collision with root package name */
    private int f13318g;

    /* renamed from: h, reason: collision with root package name */
    private int f13319h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13320i;

    /* renamed from: j, reason: collision with root package name */
    private int f13321j;

    /* renamed from: k, reason: collision with root package name */
    private int[] f13322k;

    /* renamed from: l, reason: collision with root package name */
    private int f13323l;

    public y(int i2, int i3, String str, String str2, String str3, int i4, int i5, int i6, boolean z, int i7, int[] iArr, int i8) {
        this.a = i2;
        this.f13313b = i3;
        this.f13314c = str;
        this.f13315d = str2;
        this.f13316e = str3;
        this.f13317f = i4;
        this.f13318g = i5;
        this.f13319h = i6;
        this.f13320i = z;
        this.f13321j = i7;
        this.f13322k = iArr;
        this.f13323l = i8;
    }

    public int[] a() {
        return this.f13322k;
    }

    public int b() {
        return this.f13318g;
    }

    public int c() {
        return this.f13323l;
    }

    public String d() {
        return this.f13314c;
    }

    public int e() {
        if (TextUtils.isEmpty(this.f13314c) || !TextUtils.isDigitsOnly(this.f13314c)) {
            return Integer.MAX_VALUE;
        }
        return Integer.parseInt(this.f13314c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.a == yVar.a && this.f13313b == yVar.f13313b && this.f13317f == yVar.f13317f && this.f13318g == yVar.f13318g && this.f13319h == yVar.f13319h && this.f13320i == yVar.f13320i && this.f13321j == yVar.f13321j && this.f13323l == yVar.f13323l && Objects.equals(this.f13314c, yVar.f13314c) && Objects.equals(this.f13315d, yVar.f13315d) && Objects.equals(this.f13316e, yVar.f13316e) && Arrays.equals(this.f13322k, yVar.f13322k);
    }

    public String f() {
        return this.f13315d;
    }

    public int g() {
        if (TextUtils.isEmpty(this.f13315d) || !TextUtils.isDigitsOnly(this.f13315d)) {
            return Integer.MAX_VALUE;
        }
        return Integer.parseInt(this.f13315d);
    }

    public String h() {
        return this.f13316e;
    }

    public int hashCode() {
        return (Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.f13313b), this.f13314c, this.f13315d, this.f13316e, Integer.valueOf(this.f13317f), Integer.valueOf(this.f13318g), Integer.valueOf(this.f13319h), Boolean.valueOf(this.f13320i), Integer.valueOf(this.f13321j), Integer.valueOf(this.f13323l)) * 31) + Arrays.hashCode(this.f13322k);
    }

    public int i() {
        return !com.parizene.netmonitor.m0.w.f(this.f13317f) ? this.f13317f : !com.parizene.netmonitor.m0.w.f(this.f13318g) ? this.f13318g : this.f13319h;
    }

    public int j() {
        return this.f13313b;
    }

    public int k() {
        return this.f13321j;
    }

    public int l() {
        return this.a;
    }

    public int m() {
        return this.f13319h;
    }

    public boolean n() {
        return !TextUtils.isEmpty(this.f13314c);
    }

    public boolean o() {
        return !TextUtils.isEmpty(this.f13315d);
    }

    public boolean p() {
        return this.f13320i;
    }

    public void q(String str) {
        this.f13314c = str;
    }

    public void r(String str) {
        this.f13315d = str;
    }

    public void s(int i2) {
        this.f13317f = i2;
    }

    public String toString() {
        return "NetworkInfo{mSubscriptionId=" + this.a + ", mSlotIndex=" + this.f13313b + ", mMcc='" + this.f13314c + CoreConstants.SINGLE_QUOTE_CHAR + ", mMnc='" + this.f13315d + CoreConstants.SINGLE_QUOTE_CHAR + ", mNetworkOperatorName='" + this.f13316e + CoreConstants.SINGLE_QUOTE_CHAR + ", getNetworkType=" + i() + ", mNetworkType=" + com.parizene.netmonitor.m0.w.h(this.f13317f) + ", mDataNetworkType=" + com.parizene.netmonitor.m0.w.h(this.f13318g) + ", mVoiceNetworkType=" + com.parizene.netmonitor.m0.w.h(this.f13319h) + ", mIsNetworkRoaming=" + this.f13320i + ", mState=" + com.parizene.netmonitor.m0.w.j(this.f13321j) + ", mCellBandwidths=" + Arrays.toString(this.f13322k) + ", mDbm=" + this.f13323l + CoreConstants.CURLY_RIGHT;
    }
}