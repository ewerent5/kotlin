package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.lang.Iterable;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class q extends com.google.android.gms.common.internal.w.a implements Iterable<String>, Iterable {
    public static final Parcelable.Creator<q> CREATOR = new s();

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f11138e;

    q(Bundle bundle) {
        this.f11138e = bundle;
    }

    final Object J(String str) {
        return this.f11138e.get(str);
    }

    public final Bundle K() {
        return new Bundle(this.f11138e);
    }

    final Long L(String str) {
        return Long.valueOf(this.f11138e.getLong(str));
    }

    final Double M(String str) {
        return Double.valueOf(this.f11138e.getDouble(str));
    }

    final String O(String str) {
        return this.f11138e.getString(str);
    }

    public final int c() {
        return this.f11138e.size();
    }

    @Override // j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public final Iterator<String> iterator() {
        return new p(this);
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return j$.util.v.o(iterator(), 0);
    }

    public final String toString() {
        return this.f11138e.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.e(parcel, 2, K(), false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}