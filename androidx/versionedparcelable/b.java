package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel.java */
/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f2046d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f2047e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2048f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2049g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2050h;

    /* renamed from: i, reason: collision with root package name */
    private int f2051i;

    /* renamed from: j, reason: collision with root package name */
    private int f2052j;

    /* renamed from: k, reason: collision with root package name */
    private int f2053k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new c.e.a(), new c.e.a(), new c.e.a());
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f2047e.writeInt(-1);
        } else {
            this.f2047e.writeInt(bArr.length);
            this.f2047e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2047e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i2) {
        this.f2047e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f2047e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f2047e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i2 = this.f2051i;
        if (i2 >= 0) {
            int i3 = this.f2046d.get(i2);
            int iDataPosition = this.f2047e.dataPosition();
            this.f2047e.setDataPosition(i3);
            this.f2047e.writeInt(iDataPosition - i3);
            this.f2047e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f2047e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f2052j;
        if (i2 == this.f2048f) {
            i2 = this.f2049g;
        }
        return new b(parcel, iDataPosition, i2, this.f2050h + "  ", this.a, this.f2044b, this.f2045c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f2047e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int i2 = this.f2047e.readInt();
        if (i2 < 0) {
            return null;
        }
        byte[] bArr = new byte[i2];
        this.f2047e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2047e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i2) {
        while (this.f2052j < this.f2049g) {
            int i3 = this.f2053k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f2047e.setDataPosition(this.f2052j);
            int i4 = this.f2047e.readInt();
            this.f2053k = this.f2047e.readInt();
            this.f2052j += i4;
        }
        return this.f2053k == i2;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f2047e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f2047e.readParcelable(b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f2047e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i2) {
        a();
        this.f2051i = i2;
        this.f2046d.put(i2, this.f2047e.dataPosition());
        E(0);
        E(i2);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z) {
        this.f2047e.writeInt(z ? 1 : 0);
    }

    private b(Parcel parcel, int i2, int i3, String str, c.e.a<String, Method> aVar, c.e.a<String, Method> aVar2, c.e.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f2046d = new SparseIntArray();
        this.f2051i = -1;
        this.f2052j = 0;
        this.f2053k = -1;
        this.f2047e = parcel;
        this.f2048f = i2;
        this.f2049g = i3;
        this.f2052j = i2;
        this.f2050h = str;
    }
}