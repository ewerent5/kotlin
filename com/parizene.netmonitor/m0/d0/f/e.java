package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* compiled from: CellIdentityNrWrapper.java */
/* loaded from: classes.dex */
public class e extends h {

    /* renamed from: c, reason: collision with root package name */
    public final int f13408c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13409d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13410e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13411f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f13412g;

    public e(String str, String str2, int i2, long j2, int i3, int i4, int[] iArr) {
        super(str, str2);
        this.f13408c = i2;
        this.f13409d = j2;
        this.f13410e = i3;
        this.f13411f = i4;
        this.f13412g = iArr;
    }

    public int a() {
        String str = this.a;
        if (str != null) {
            return Integer.parseInt(str);
        }
        return Integer.MAX_VALUE;
    }

    public int b() {
        String str = this.f13423b;
        if (str != null) {
            return Integer.parseInt(str);
        }
        return Integer.MAX_VALUE;
    }

    public String toString() {
        return "CellIdentityNrWrapper{tac=" + this.f13408c + ", nci=" + this.f13409d + ", pci=" + this.f13410e + ", nrArfcn=" + this.f13411f + ", bands=" + Arrays.toString(this.f13412g) + ", mccStr='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", mncStr='" + this.f13423b + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}