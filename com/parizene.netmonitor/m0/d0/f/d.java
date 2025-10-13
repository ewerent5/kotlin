package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* compiled from: CellIdentityLteWrapper.java */
/* loaded from: classes.dex */
public class d extends h {

    /* renamed from: c, reason: collision with root package name */
    public final int f13400c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13401d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13402e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13403f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13404g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13405h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13406i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f13407j;

    public d(String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        super(str, str2);
        this.f13400c = i2;
        this.f13401d = i3;
        this.f13403f = i4;
        this.f13404g = i5;
        this.f13402e = i6;
        this.f13405h = i7;
        this.f13406i = i8;
        this.f13407j = iArr;
    }

    public String toString() {
        return "CellIdentityLteWrapper{mcc=" + this.f13400c + ", mnc=" + this.f13401d + ", ci=" + this.f13403f + ", pci=" + this.f13404g + ", tac=" + this.f13402e + ", earfcn=" + this.f13405h + ", bandwidth=" + this.f13406i + ", bands=" + Arrays.toString(this.f13407j) + ", mccStr='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", mncStr='" + this.f13423b + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}