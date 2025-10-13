package com.parizene.netmonitor.l0;

import android.util.SparseArray;

/* compiled from: CellInfoStateChangedEvent.java */
/* loaded from: classes.dex */
public class a {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private SparseArray<c.h.k.d<Integer, com.parizene.netmonitor.db.celllog.i.d>> f13212b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13213c;

    public a(int i2, SparseArray<c.h.k.d<Integer, com.parizene.netmonitor.db.celllog.i.d>> sparseArray, boolean z) {
        this.a = i2;
        this.f13212b = sparseArray;
        this.f13213c = z;
    }

    public SparseArray<c.h.k.d<Integer, com.parizene.netmonitor.db.celllog.i.d>> a() {
        return this.f13212b;
    }

    public int b() {
        return this.a;
    }

    public boolean c() {
        return this.f13213c;
    }
}