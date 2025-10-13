package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: FragmentState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    final String f1076e;

    /* renamed from: f, reason: collision with root package name */
    final String f1077f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f1078g;

    /* renamed from: h, reason: collision with root package name */
    final int f1079h;

    /* renamed from: i, reason: collision with root package name */
    final int f1080i;

    /* renamed from: j, reason: collision with root package name */
    final String f1081j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f1082k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f1083l;

    /* renamed from: m, reason: collision with root package name */
    final boolean f1084m;
    final Bundle n;
    final boolean o;
    final int p;
    Bundle q;

    /* compiled from: FragmentState.java */
    static class a implements Parcelable.Creator<r> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r createFromParcel(Parcel parcel) {
            return new r(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r[] newArray(int i2) {
            return new r[i2];
        }
    }

    r(Fragment fragment) {
        this.f1076e = fragment.getClass().getName();
        this.f1077f = fragment.f977j;
        this.f1078g = fragment.r;
        this.f1079h = fragment.A;
        this.f1080i = fragment.B;
        this.f1081j = fragment.C;
        this.f1082k = fragment.F;
        this.f1083l = fragment.q;
        this.f1084m = fragment.E;
        this.n = fragment.f978k;
        this.o = fragment.D;
        this.p = fragment.V.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1076e);
        sb.append(" (");
        sb.append(this.f1077f);
        sb.append(")}:");
        if (this.f1078g) {
            sb.append(" fromLayout");
        }
        if (this.f1080i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1080i));
        }
        String str = this.f1081j;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1081j);
        }
        if (this.f1082k) {
            sb.append(" retainInstance");
        }
        if (this.f1083l) {
            sb.append(" removing");
        }
        if (this.f1084m) {
            sb.append(" detached");
        }
        if (this.o) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1076e);
        parcel.writeString(this.f1077f);
        parcel.writeInt(this.f1078g ? 1 : 0);
        parcel.writeInt(this.f1079h);
        parcel.writeInt(this.f1080i);
        parcel.writeString(this.f1081j);
        parcel.writeInt(this.f1082k ? 1 : 0);
        parcel.writeInt(this.f1083l ? 1 : 0);
        parcel.writeInt(this.f1084m ? 1 : 0);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeBundle(this.q);
        parcel.writeInt(this.p);
    }

    r(Parcel parcel) {
        this.f1076e = parcel.readString();
        this.f1077f = parcel.readString();
        this.f1078g = parcel.readInt() != 0;
        this.f1079h = parcel.readInt();
        this.f1080i = parcel.readInt();
        this.f1081j = parcel.readString();
        this.f1082k = parcel.readInt() != 0;
        this.f1083l = parcel.readInt() != 0;
        this.f1084m = parcel.readInt() != 0;
        this.n = parcel.readBundle();
        this.o = parcel.readInt() != 0;
        this.q = parcel.readBundle();
        this.p = parcel.readInt();
    }
}