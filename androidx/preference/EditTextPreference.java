package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    private String a0;
    private a b0;

    public interface a {
        void a(EditText editText);
    }

    public static final class c implements Preference.g<EditTextPreference> {
        private static c a;

        private c() {
        }

        public static c b() {
            if (a == null) {
                a = new c();
            }
            return a;
        }

        @Override // androidx.preference.Preference.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.L0()) ? editTextPreference.k().getString(r.f1473c) : editTextPreference.L0();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.R, i2, i3);
        int i4 = t.S;
        if (androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, i4, i4, false)) {
            w0(c.b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    a K0() {
        return this.b0;
    }

    public String L0() {
        return this.a0;
    }

    public void M0(a aVar) {
        this.b0 = aVar;
    }

    public void N0(String str) {
        boolean zZ0 = z0();
        this.a0 = str;
        h0(str);
        boolean zZ02 = z0();
        if (zZ02 != zZ0) {
            M(zZ02);
        }
        L();
    }

    @Override // androidx.preference.Preference
    protected Object V(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    @Override // androidx.preference.Preference
    protected void Z(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(b.class)) {
            super.Z(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.Z(bVar.getSuperState());
        N0(bVar.f1391e);
    }

    @Override // androidx.preference.Preference
    protected Parcelable a0() {
        Parcelable parcelableA0 = super.a0();
        if (I()) {
            return parcelableA0;
        }
        b bVar = new b(parcelableA0);
        bVar.f1391e = L0();
        return bVar;
    }

    @Override // androidx.preference.Preference
    protected void b0(Object obj) {
        N0(w((String) obj));
    }

    @Override // androidx.preference.Preference
    public boolean z0() {
        return TextUtils.isEmpty(this.a0) || super.z0();
    }

    private static class b extends Preference.b {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        String f1391e;

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

        b(Parcel parcel) {
            super(parcel);
            this.f1391e = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f1391e);
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.c.g.a(context, m.f1455e, R.attr.editTextPreferenceStyle));
    }
}