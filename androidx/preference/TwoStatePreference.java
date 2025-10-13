package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    protected boolean U;
    private CharSequence V;
    private CharSequence W;
    private boolean X;
    private boolean Y;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public boolean E0() {
        return this.U;
    }

    public void F0(boolean z) {
        boolean z2 = this.U != z;
        if (z2 || !this.X) {
            this.U = z;
            this.X = true;
            f0(z);
            if (z2) {
                M(z0());
                L();
            }
        }
    }

    public void G0(boolean z) {
        this.Y = z;
    }

    public void H0(CharSequence charSequence) {
        this.W = charSequence;
        if (E0()) {
            return;
        }
        L();
    }

    public void I0(CharSequence charSequence) {
        this.V = charSequence;
        if (E0()) {
            L();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void J0(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.U
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.CharSequence r1 = r4.V
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1c
            java.lang.CharSequence r0 = r4.V
            r5.setText(r0)
        L1a:
            r0 = 0
            goto L2e
        L1c:
            boolean r1 = r4.U
            if (r1 != 0) goto L2e
            java.lang.CharSequence r1 = r4.W
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2e
            java.lang.CharSequence r0 = r4.W
            r5.setText(r0)
            goto L1a
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r1 = r4.B()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L3e
            r5.setText(r1)
            r0 = 0
        L3e:
            r1 = 8
            if (r0 != 0) goto L43
            goto L45
        L43:
            r2 = 8
        L45:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L4e
            r5.setVisibility(r2)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.J0(android.view.View):void");
    }

    protected void K0(l lVar) {
        J0(lVar.N(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected void S() {
        super.S();
        boolean z = !E0();
        if (b(Boolean.valueOf(z))) {
            F0(z);
        }
    }

    @Override // androidx.preference.Preference
    protected Object V(TypedArray typedArray, int i2) {
        return Boolean.valueOf(typedArray.getBoolean(i2, false));
    }

    @Override // androidx.preference.Preference
    protected void Z(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(a.class)) {
            super.Z(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.Z(aVar.getSuperState());
        F0(aVar.f1411e);
    }

    @Override // androidx.preference.Preference
    protected Parcelable a0() {
        Parcelable parcelableA0 = super.a0();
        if (I()) {
            return parcelableA0;
        }
        a aVar = new a(parcelableA0);
        aVar.f1411e = E0();
        return aVar;
    }

    @Override // androidx.preference.Preference
    protected void b0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        F0(u(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    public boolean z0() {
        return (this.Y ? this.U : !this.U) || super.z0();
    }

    static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0021a();

        /* renamed from: e, reason: collision with root package name */
        boolean f1411e;

        /* renamed from: androidx.preference.TwoStatePreference$a$a, reason: collision with other inner class name */
        static class C0021a implements Parcelable.Creator<a> {
            C0021a() {
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
            this.f1411e = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1411e ? 1 : 0);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}