package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.preference.DialogPreference;
import ch.qos.logback.core.joran.action.Action;

/* compiled from: PreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public abstract class f extends androidx.fragment.app.c implements DialogInterface.OnClickListener {
    private DialogPreference p0;
    private CharSequence q0;
    private CharSequence r0;
    private CharSequence s0;
    private CharSequence t0;
    private int u0;
    private BitmapDrawable v0;
    private int w0;

    private void Z2(Dialog dialog) {
        dialog.getWindow().setSoftInputMode(5);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void H1(Bundle bundle) {
        super.H1(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.q0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.r0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.s0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.t0);
        bundle.putInt("PreferenceDialogFragment.layout", this.u0);
        BitmapDrawable bitmapDrawable = this.v0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // androidx.fragment.app.c
    public Dialog O2(Bundle bundle) {
        androidx.fragment.app.d dVarJ0 = j0();
        this.w0 = -2;
        b.a aVarL = new b.a(dVarJ0).u(this.q0).f(this.v0).p(this.r0, this).l(this.s0, this);
        View viewW2 = W2(dVarJ0);
        if (viewW2 != null) {
            V2(viewW2);
            aVarL.v(viewW2);
        } else {
            aVarL.i(this.t0);
        }
        Y2(aVarL);
        androidx.appcompat.app.b bVarA = aVarL.a();
        if (U2()) {
            Z2(bVarA);
        }
        return bVarA;
    }

    public DialogPreference T2() {
        if (this.p0 == null) {
            this.p0 = (DialogPreference) ((DialogPreference.a) O0()).t(o0().getString(Action.KEY_ATTRIBUTE));
        }
        return this.p0;
    }

    protected boolean U2() {
        return false;
    }

    protected void V2(View view) {
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.t0;
            int i2 = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i2 = 0;
            }
            if (viewFindViewById.getVisibility() != i2) {
                viewFindViewById.setVisibility(i2);
            }
        }
    }

    protected View W2(Context context) {
        int i2 = this.u0;
        if (i2 == 0) {
            return null;
        }
        return y0().inflate(i2, (ViewGroup) null);
    }

    public abstract void X2(boolean z);

    protected void Y2(b.a aVar) {
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        androidx.savedstate.b bVarO0 = O0();
        if (!(bVarO0 instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) bVarO0;
        String string = o0().getString(Action.KEY_ATTRIBUTE);
        if (bundle != null) {
            this.q0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.r0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.s0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.t0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.u0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.v0 = new BitmapDrawable(F0(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aVar.t(string);
        this.p0 = dialogPreference;
        this.q0 = dialogPreference.H0();
        this.r0 = this.p0.J0();
        this.s0 = this.p0.I0();
        this.t0 = this.p0.G0();
        this.u0 = this.p0.F0();
        Drawable drawableE0 = this.p0.E0();
        if (drawableE0 == null || (drawableE0 instanceof BitmapDrawable)) {
            this.v0 = (BitmapDrawable) drawableE0;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableE0.getIntrinsicWidth(), drawableE0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableE0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableE0.draw(canvas);
        this.v0 = new BitmapDrawable(F0(), bitmapCreateBitmap);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.w0 = i2;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        X2(this.w0 == -1);
    }
}