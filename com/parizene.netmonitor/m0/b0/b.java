package com.parizene.netmonitor.m0.b0;

import com.parizene.netmonitor.j0;
import java.util.List;

/* compiled from: CellState.java */
/* loaded from: classes.dex */
public class b {
    private y a;

    /* renamed from: b, reason: collision with root package name */
    private k f13263b;

    /* renamed from: c, reason: collision with root package name */
    private List<k> f13264c;

    public b(y yVar, k kVar, List<k> list) {
        this.a = yVar;
        this.f13263b = kVar;
        this.f13264c = list;
    }

    public k a() {
        return this.f13263b;
    }

    public List<k> b() {
        return this.f13264c;
    }

    public y c() {
        return this.a;
    }

    public String toString() {
        return "CellState{\nmNetworkInfo=" + this.a + "\nmCurrentCell=" + this.f13263b + "\nmNeighboringCells=" + j0.h(this.f13264c) + "}";
    }
}