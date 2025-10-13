package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private CharSequence[] a0;
    private CharSequence[] b0;
    private String c0;
    private String d0;
    private boolean e0;

    public static final class b implements Preference.g<ListPreference> {
        private static b a;

        private b() {
        }

        public static b b() {
            if (a == null) {
                a = new b();
            }
            return a;
        }

        @Override // androidx.preference.Preference.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.M0()) ? listPreference.k().getString(r.f1473c) : listPreference.M0();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.c0, i2, i3);
        this.a0 = androidx.core.content.c.g.q(typedArrayObtainStyledAttributes, t.f0, t.d0);
        this.b0 = androidx.core.content.c.g.q(typedArrayObtainStyledAttributes, t.g0, t.e0);
        int i4 = t.h0;
        if (androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, i4, i4, false)) {
            w0(b.b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, t.s0, i2, i3);
        this.d0 = androidx.core.content.c.g.o(typedArrayObtainStyledAttributes2, t.a1, t.A0);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private int P0() {
        return K0(this.c0);
    }

    @Override // androidx.preference.Preference
    public CharSequence B() {
        if (C() != null) {
            return C().a(this);
        }
        CharSequence charSequenceM0 = M0();
        CharSequence charSequenceB = super.B();
        String str = this.d0;
        if (str == null) {
            return charSequenceB;
        }
        Object[] objArr = new Object[1];
        if (charSequenceM0 == null) {
            charSequenceM0 = "";
        }
        objArr[0] = charSequenceM0;
        String str2 = String.format(str, objArr);
        if (TextUtils.equals(str2, charSequenceB)) {
            return charSequenceB;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }

    public int K0(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.b0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.b0[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] L0() {
        return this.a0;
    }

    public CharSequence M0() {
        CharSequence[] charSequenceArr;
        int iP0 = P0();
        if (iP0 < 0 || (charSequenceArr = this.a0) == null) {
            return null;
        }
        return charSequenceArr[iP0];
    }

    public CharSequence[] N0() {
        return this.b0;
    }

    public String O0() {
        return this.c0;
    }

    public void Q0(String str) {
        boolean z = !TextUtils.equals(this.c0, str);
        if (z || !this.e0) {
            this.c0 = str;
            this.e0 = true;
            h0(str);
            if (z) {
                L();
            }
        }
    }

    @Override // androidx.preference.Preference
    protected Object V(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    @Override // androidx.preference.Preference
    protected void Z(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.Z(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.Z(aVar.getSuperState());
        Q0(aVar.f1392e);
    }

    @Override // androidx.preference.Preference
    protected Parcelable a0() {
        Parcelable parcelableA0 = super.a0();
        if (I()) {
            return parcelableA0;
        }
        a aVar = new a(parcelableA0);
        aVar.f1392e = O0();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void b0(Object obj) {
        Q0(w((String) obj));
    }

    private static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0019a();

        /* renamed from: e, reason: collision with root package name */
        String f1392e;

        /* renamed from: androidx.preference.ListPreference$a$a, reason: collision with other inner class name */
        static class C0019a implements Parcelable.Creator<a> {
            C0019a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i2) {
                return new a[i2];
            }
        }

        a(Parcel parcel) {
            super(parcel);
            this.f1392e = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f1392e);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.c.g.a(context, m.f1453c, R.attr.dialogPreferenceStyle));
    }
}