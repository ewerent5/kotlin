package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.u;
import androidx.lifecycle.g;
import java.util.ArrayList;

/* compiled from: BackStackState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    final int[] f996e;

    /* renamed from: f, reason: collision with root package name */
    final ArrayList<String> f997f;

    /* renamed from: g, reason: collision with root package name */
    final int[] f998g;

    /* renamed from: h, reason: collision with root package name */
    final int[] f999h;

    /* renamed from: i, reason: collision with root package name */
    final int f1000i;

    /* renamed from: j, reason: collision with root package name */
    final String f1001j;

    /* renamed from: k, reason: collision with root package name */
    final int f1002k;

    /* renamed from: l, reason: collision with root package name */
    final int f1003l;

    /* renamed from: m, reason: collision with root package name */
    final CharSequence f1004m;
    final int n;
    final CharSequence o;
    final ArrayList<String> p;
    final ArrayList<String> q;
    final boolean r;

    /* compiled from: BackStackState.java */
    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f1089c.size();
        this.f996e = new int[size * 5];
        if (!aVar.f1095i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f997f = new ArrayList<>(size);
        this.f998g = new int[size];
        this.f999h = new int[size];
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            u.a aVar2 = aVar.f1089c.get(i2);
            int i4 = i3 + 1;
            this.f996e[i3] = aVar2.a;
            ArrayList<String> arrayList = this.f997f;
            Fragment fragment = aVar2.f1100b;
            arrayList.add(fragment != null ? fragment.f977j : null);
            int[] iArr = this.f996e;
            int i5 = i4 + 1;
            iArr[i4] = aVar2.f1101c;
            int i6 = i5 + 1;
            iArr[i5] = aVar2.f1102d;
            int i7 = i6 + 1;
            iArr[i6] = aVar2.f1103e;
            iArr[i7] = aVar2.f1104f;
            this.f998g[i2] = aVar2.f1105g.ordinal();
            this.f999h[i2] = aVar2.f1106h.ordinal();
            i2++;
            i3 = i7 + 1;
        }
        this.f1000i = aVar.f1094h;
        this.f1001j = aVar.f1097k;
        this.f1002k = aVar.v;
        this.f1003l = aVar.f1098l;
        this.f1004m = aVar.f1099m;
        this.n = aVar.n;
        this.o = aVar.o;
        this.p = aVar.p;
        this.q = aVar.q;
        this.r = aVar.r;
    }

    public androidx.fragment.app.a a(m mVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(mVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f996e.length) {
            u.a aVar2 = new u.a();
            int i4 = i2 + 1;
            aVar2.a = this.f996e[i2];
            if (m.p0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.f996e[i4]);
            }
            String str = this.f997f.get(i3);
            if (str != null) {
                aVar2.f1100b = mVar.V(str);
            } else {
                aVar2.f1100b = null;
            }
            aVar2.f1105g = g.c.values()[this.f998g[i3]];
            aVar2.f1106h = g.c.values()[this.f999h[i3]];
            int[] iArr = this.f996e;
            int i5 = i4 + 1;
            int i6 = iArr[i4];
            aVar2.f1101c = i6;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            aVar2.f1102d = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar2.f1103e = i10;
            int i11 = iArr[i9];
            aVar2.f1104f = i11;
            aVar.f1090d = i6;
            aVar.f1091e = i8;
            aVar.f1092f = i10;
            aVar.f1093g = i11;
            aVar.f(aVar2);
            i3++;
            i2 = i9 + 1;
        }
        aVar.f1094h = this.f1000i;
        aVar.f1097k = this.f1001j;
        aVar.v = this.f1002k;
        aVar.f1095i = true;
        aVar.f1098l = this.f1003l;
        aVar.f1099m = this.f1004m;
        aVar.n = this.n;
        aVar.o = this.o;
        aVar.p = this.p;
        aVar.q = this.q;
        aVar.r = this.r;
        aVar.x(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f996e);
        parcel.writeStringList(this.f997f);
        parcel.writeIntArray(this.f998g);
        parcel.writeIntArray(this.f999h);
        parcel.writeInt(this.f1000i);
        parcel.writeString(this.f1001j);
        parcel.writeInt(this.f1002k);
        parcel.writeInt(this.f1003l);
        TextUtils.writeToParcel(this.f1004m, parcel, 0);
        parcel.writeInt(this.n);
        TextUtils.writeToParcel(this.o, parcel, 0);
        parcel.writeStringList(this.p);
        parcel.writeStringList(this.q);
        parcel.writeInt(this.r ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f996e = parcel.createIntArray();
        this.f997f = parcel.createStringArrayList();
        this.f998g = parcel.createIntArray();
        this.f999h = parcel.createIntArray();
        this.f1000i = parcel.readInt();
        this.f1001j = parcel.readString();
        this.f1002k = parcel.readInt();
        this.f1003l = parcel.readInt();
        this.f1004m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.readInt();
        this.o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.p = parcel.createStringArrayList();
        this.q = parcel.createStringArrayList();
        this.r = parcel.readInt() != 0;
    }
}