package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    int U;
    int V;
    private int W;
    private int X;
    boolean Y;
    SeekBar Z;
    private TextView a0;
    boolean b0;
    private boolean c0;
    boolean d0;
    private SeekBar.OnSeekBarChangeListener e0;
    private View.OnKeyListener f0;

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.d0 || !seekBarPreference.Y) {
                    seekBarPreference.I0(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.J0(i2 + seekBarPreference2.V);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.Y = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.Y = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.V != seekBarPreference.U) {
                seekBarPreference.I0(seekBar);
            }
        }
    }

    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.b0 && (i2 == 21 || i2 == 22)) || i2 == 23 || i2 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.Z;
            if (seekBar != null) {
                return seekBar.onKeyDown(i2, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.e0 = new a();
        this.f0 = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.t1, i2, i3);
        this.V = typedArrayObtainStyledAttributes.getInt(t.w1, 0);
        E0(typedArrayObtainStyledAttributes.getInt(t.u1, 100));
        F0(typedArrayObtainStyledAttributes.getInt(t.x1, 0));
        this.b0 = typedArrayObtainStyledAttributes.getBoolean(t.v1, true);
        this.c0 = typedArrayObtainStyledAttributes.getBoolean(t.y1, false);
        this.d0 = typedArrayObtainStyledAttributes.getBoolean(t.z1, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void H0(int i2, boolean z) {
        int i3 = this.V;
        if (i2 < i3) {
            i2 = i3;
        }
        int i4 = this.W;
        if (i2 > i4) {
            i2 = i4;
        }
        if (i2 != this.U) {
            this.U = i2;
            J0(i2);
            g0(i2);
            if (z) {
                L();
            }
        }
    }

    public final void E0(int i2) {
        int i3 = this.V;
        if (i2 < i3) {
            i2 = i3;
        }
        if (i2 != this.W) {
            this.W = i2;
            L();
        }
    }

    public final void F0(int i2) {
        if (i2 != this.X) {
            this.X = Math.min(this.W - this.V, Math.abs(i2));
            L();
        }
    }

    public void G0(int i2) {
        H0(i2, true);
    }

    void I0(SeekBar seekBar) {
        int progress = this.V + seekBar.getProgress();
        if (progress != this.U) {
            if (b(Integer.valueOf(progress))) {
                H0(progress, false);
            } else {
                seekBar.setProgress(this.U - this.V);
                J0(this.U);
            }
        }
    }

    void J0(int i2) {
        TextView textView = this.a0;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
    }

    @Override // androidx.preference.Preference
    public void R(l lVar) {
        super.R(lVar);
        lVar.f1546f.setOnKeyListener(this.f0);
        this.Z = (SeekBar) lVar.N(p.f1465c);
        TextView textView = (TextView) lVar.N(p.f1466d);
        this.a0 = textView;
        if (this.c0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.a0 = null;
        }
        SeekBar seekBar = this.Z;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.e0);
        this.Z.setMax(this.W - this.V);
        int i2 = this.X;
        if (i2 != 0) {
            this.Z.setKeyProgressIncrement(i2);
        } else {
            this.X = this.Z.getKeyProgressIncrement();
        }
        this.Z.setProgress(this.U - this.V);
        J0(this.U);
        this.Z.setEnabled(H());
    }

    @Override // androidx.preference.Preference
    protected Object V(TypedArray typedArray, int i2) {
        return Integer.valueOf(typedArray.getInt(i2, 0));
    }

    @Override // androidx.preference.Preference
    protected void Z(Parcelable parcelable) {
        if (!parcelable.getClass().equals(c.class)) {
            super.Z(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.Z(cVar.getSuperState());
        this.U = cVar.f1408e;
        this.V = cVar.f1409f;
        this.W = cVar.f1410g;
        L();
    }

    @Override // androidx.preference.Preference
    protected Parcelable a0() {
        Parcelable parcelableA0 = super.a0();
        if (I()) {
            return parcelableA0;
        }
        c cVar = new c(parcelableA0);
        cVar.f1408e = this.U;
        cVar.f1409f = this.V;
        cVar.f1410g = this.W;
        return cVar;
    }

    @Override // androidx.preference.Preference
    protected void b0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        G0(v(((Integer) obj).intValue()));
    }

    private static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        int f1408e;

        /* renamed from: f, reason: collision with root package name */
        int f1409f;

        /* renamed from: g, reason: collision with root package name */
        int f1410g;

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
            this.f1408e = parcel.readInt();
            this.f1409f = parcel.readInt();
            this.f1410g = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1408e);
            parcel.writeInt(this.f1409f);
            parcel.writeInt(this.f1410g);
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.f1461k);
    }
}