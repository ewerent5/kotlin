package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    private CharSequence U;
    private CharSequence V;
    private Drawable W;
    private CharSequence X;
    private CharSequence Y;
    private int Z;

    public interface a {
        <T extends Preference> T t(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.D, i2, i3);
        String strO = androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.N, t.E);
        this.U = strO;
        if (strO == null) {
            this.U = D();
        }
        this.V = androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.M, t.F);
        this.W = androidx.core.content.c.g.c(typedArrayObtainStyledAttributes, t.K, t.G);
        this.X = androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.P, t.H);
        this.Y = androidx.core.content.c.g.o(typedArrayObtainStyledAttributes, t.O, t.I);
        this.Z = androidx.core.content.c.g.n(typedArrayObtainStyledAttributes, t.L, t.J, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public Drawable E0() {
        return this.W;
    }

    public int F0() {
        return this.Z;
    }

    public CharSequence G0() {
        return this.V;
    }

    public CharSequence H0() {
        return this.U;
    }

    public CharSequence I0() {
        return this.Y;
    }

    public CharSequence J0() {
        return this.X;
    }

    @Override // androidx.preference.Preference
    protected void S() {
        z().s(this);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.c.g.a(context, m.f1453c, R.attr.dialogPreferenceStyle));
    }
}