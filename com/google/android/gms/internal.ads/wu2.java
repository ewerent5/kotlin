package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wu2 implements Comparator<vu2>, Parcelable, j$.util.Comparator {
    public static final Parcelable.Creator<wu2> CREATOR = new tu2();

    /* renamed from: e, reason: collision with root package name */
    private final vu2[] f10043e;

    /* renamed from: f, reason: collision with root package name */
    private int f10044f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10045g;

    wu2(Parcel parcel) {
        vu2[] vu2VarArr = (vu2[]) parcel.createTypedArray(vu2.CREATOR);
        this.f10043e = vu2VarArr;
        this.f10045g = vu2VarArr.length;
    }

    public final vu2 a(int i2) {
        return this.f10043e[i2];
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        vu2 vu2Var = (vu2) obj;
        vu2 vu2Var2 = (vu2) obj2;
        UUID uuid = is2.f6585b;
        return uuid.equals(vu2Var.f9785f) ? !uuid.equals(vu2Var2.f9785f) ? 1 : 0 : vu2Var.f9785f.compareTo(vu2Var2.f9785f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wu2.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10043e, ((wu2) obj).f10043e);
    }

    public final int hashCode() {
        int i2 = this.f10044f;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f10043e);
        this.f10044f = iHashCode;
        return iHashCode;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ Comparator reversed() {
        return Collections.reverseOrder(this);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ Comparator thenComparing(Function function) {
        return Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedArray(this.f10043e, 0);
    }

    public wu2(List<vu2> list) {
        this(false, (vu2[]) list.toArray(new vu2[list.size()]));
    }

    private wu2(boolean z, vu2... vu2VarArr) {
        vu2VarArr = z ? (vu2[]) vu2VarArr.clone() : vu2VarArr;
        Arrays.sort(vu2VarArr, this);
        int i2 = 1;
        while (true) {
            int length = vu2VarArr.length;
            if (i2 >= length) {
                this.f10043e = vu2VarArr;
                this.f10045g = length;
                return;
            } else {
                if (vu2VarArr[i2 - 1].f9785f.equals(vu2VarArr[i2].f9785f)) {
                    String strValueOf = String.valueOf(vu2VarArr[i2].f9785f);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
                    sb.append("Duplicate data for uuid: ");
                    sb.append(strValueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                i2++;
            }
        }
    }

    public wu2(vu2... vu2VarArr) {
        this(true, vu2VarArr);
    }
}