package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    final c.e.g<String, Long> U;
    private final Handler V;
    private List<Preference> W;
    private boolean X;
    private int Y;
    private boolean Z;
    private int a0;
    private b b0;
    private final Runnable c0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.U.clear();
            }
        }
    }

    public interface b {
        void a();
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.U = new c.e.g<>();
        this.V = new Handler();
        this.X = true;
        this.Y = 0;
        this.Z = false;
        this.a0 = Integer.MAX_VALUE;
        this.b0 = null;
        this.c0 = new a();
        this.W = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.j1, i2, i3);
        int i4 = t.l1;
        this.X = androidx.core.content.c.g.b(typedArrayObtainStyledAttributes, i4, i4, true);
        int i5 = t.k1;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            P0(androidx.core.content.c.g.d(typedArrayObtainStyledAttributes, i5, i5, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean O0(Preference preference) {
        boolean zRemove;
        synchronized (this) {
            preference.Y();
            if (preference.t() == this) {
                preference.a(null);
            }
            zRemove = this.W.remove(preference);
            if (zRemove) {
                String strQ = preference.q();
                if (strQ != null) {
                    this.U.put(strQ, Long.valueOf(preference.o()));
                    this.V.removeCallbacks(this.c0);
                    this.V.post(this.c0);
                }
                if (this.Z) {
                    preference.U();
                }
            }
        }
        return zRemove;
    }

    public void E0(Preference preference) {
        F0(preference);
    }

    public boolean F0(Preference preference) {
        long jD;
        if (this.W.contains(preference)) {
            return true;
        }
        if (preference.q() != null) {
            PreferenceGroup preferenceGroupT = this;
            while (preferenceGroupT.t() != null) {
                preferenceGroupT = preferenceGroupT.t();
            }
            String strQ = preference.q();
            if (preferenceGroupT.G0(strQ) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + strQ + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.s() == Integer.MAX_VALUE) {
            if (this.X) {
                int i2 = this.Y;
                this.Y = i2 + 1;
                preference.u0(i2);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).Q0(this.X);
            }
        }
        int iBinarySearch = Collections.binarySearch(this.W, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        if (!M0(preference)) {
            return false;
        }
        synchronized (this) {
            this.W.add(iBinarySearch, preference);
        }
        j jVarZ = z();
        String strQ2 = preference.q();
        if (strQ2 == null || !this.U.containsKey(strQ2)) {
            jD = jVarZ.d();
        } else {
            jD = this.U.get(strQ2).longValue();
            this.U.remove(strQ2);
        }
        preference.Q(jVarZ, jD);
        preference.a(this);
        if (this.Z) {
            preference.O();
        }
        N();
        return true;
    }

    public <T extends Preference> T G0(CharSequence charSequence) {
        T t;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(q(), charSequence)) {
            return this;
        }
        int iK0 = K0();
        for (int i2 = 0; i2 < iK0; i2++) {
            PreferenceGroup preferenceGroup = (T) J0(i2);
            if (TextUtils.equals(preferenceGroup.q(), charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t = (T) preferenceGroup.G0(charSequence)) != null) {
                return t;
            }
        }
        return null;
    }

    public int H0() {
        return this.a0;
    }

    public b I0() {
        return this.b0;
    }

    public Preference J0(int i2) {
        return this.W.get(i2);
    }

    public int K0() {
        return this.W.size();
    }

    protected boolean L0() {
        return true;
    }

    @Override // androidx.preference.Preference
    public void M(boolean z) {
        super.M(z);
        int iK0 = K0();
        for (int i2 = 0; i2 < iK0; i2++) {
            J0(i2).X(this, z);
        }
    }

    protected boolean M0(Preference preference) {
        preference.X(this, z0());
        return true;
    }

    public boolean N0(Preference preference) {
        boolean zO0 = O0(preference);
        N();
        return zO0;
    }

    @Override // androidx.preference.Preference
    public void O() {
        super.O();
        this.Z = true;
        int iK0 = K0();
        for (int i2 = 0; i2 < iK0; i2++) {
            J0(i2).O();
        }
    }

    public void P0(int i2) {
        if (i2 != Integer.MAX_VALUE && !F()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.a0 = i2;
    }

    public void Q0(boolean z) {
        this.X = z;
    }

    void R0() {
        synchronized (this) {
            Collections.sort(this.W);
        }
    }

    @Override // androidx.preference.Preference
    public void U() {
        super.U();
        this.Z = false;
        int iK0 = K0();
        for (int i2 = 0; i2 < iK0; i2++) {
            J0(i2).U();
        }
    }

    @Override // androidx.preference.Preference
    protected void Z(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(c.class)) {
            super.Z(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        this.a0 = cVar.f1406e;
        super.Z(cVar.getSuperState());
    }

    @Override // androidx.preference.Preference
    protected Parcelable a0() {
        return new c(super.a0(), this.a0);
    }

    @Override // androidx.preference.Preference
    protected void e(Bundle bundle) {
        super.e(bundle);
        int iK0 = K0();
        for (int i2 = 0; i2 < iK0; i2++) {
            J0(i2).e(bundle);
        }
    }

    @Override // androidx.preference.Preference
    protected void f(Bundle bundle) {
        super.f(bundle);
        int iK0 = K0();
        for (int i2 = 0; i2 < iK0; i2++) {
            J0(i2).f(bundle);
        }
    }

    static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        int f1406e;

        static class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i2) {
                return new c[i2];
            }
        }

        c(Parcel parcel) {
            super(parcel);
            this.f1406e = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1406e);
        }

        c(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f1406e = i2;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}