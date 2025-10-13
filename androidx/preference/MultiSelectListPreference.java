package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    private CharSequence[] a0;
    private CharSequence[] b0;
    private Set<String> c0;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.c0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.l0, i2, i3);
        this.a0 = androidx.core.content.c.g.q(typedArrayObtainStyledAttributes, t.o0, t.m0);
        this.b0 = androidx.core.content.c.g.q(typedArrayObtainStyledAttributes, t.p0, t.n0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public CharSequence[] K0() {
        return this.a0;
    }

    public CharSequence[] L0() {
        return this.b0;
    }

    public Set<String> M0() {
        return this.c0;
    }

    public void N0(Set<String> set) {
        this.c0.clear();
        this.c0.addAll(set);
        i0(set);
        L();
    }

    @Override // androidx.preference.Preference
    protected Object V(TypedArray typedArray, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected void Z(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.Z(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.Z(aVar.getSuperState());
        N0(aVar.f1393e);
    }

    @Override // androidx.preference.Preference
    protected Parcelable a0() {
        Parcelable parcelableA0 = super.a0();
        if (I()) {
            return parcelableA0;
        }
        a aVar = new a(parcelableA0);
        aVar.f1393e = M0();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void b0(Object obj) {
        N0(x((Set) obj));
    }

    private static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0020a();

        /* renamed from: e, reason: collision with root package name */
        Set<String> f1393e;

        /* renamed from: androidx.preference.MultiSelectListPreference$a$a, reason: collision with other inner class name */
        static class C0020a implements Parcelable.Creator<a> {
            C0020a() {
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
            int i2 = parcel.readInt();
            this.f1393e = new HashSet();
            String[] strArr = new String[i2];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f1393e, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1393e.size());
            Set<String> set = this.f1393e;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.c.g.a(context, m.f1453c, R.attr.dialogPreferenceStyle));
    }
}