package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

/* compiled from: DialogFragment.java */
/* loaded from: classes.dex */
public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler b0;
    private Runnable c0 = new a();
    private DialogInterface.OnCancelListener d0 = new b();
    private DialogInterface.OnDismissListener e0 = new DialogInterfaceOnDismissListenerC0013c();
    private int f0 = 0;
    private int g0 = 0;
    private boolean h0 = true;
    private boolean i0 = true;
    private int j0 = -1;
    private boolean k0;
    private Dialog l0;
    private boolean m0;
    private boolean n0;
    private boolean o0;

    /* compiled from: DialogFragment.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            c.this.e0.onDismiss(c.this.l0);
        }
    }

    /* compiled from: DialogFragment.java */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (c.this.l0 != null) {
                c cVar = c.this;
                cVar.onCancel(cVar.l0);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    /* renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    class DialogInterfaceOnDismissListenerC0013c implements DialogInterface.OnDismissListener {
        DialogInterfaceOnDismissListenerC0013c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (c.this.l0 != null) {
                c cVar = c.this;
                cVar.onDismiss(cVar.l0);
            }
        }
    }

    private void L2(boolean z, boolean z2) {
        if (this.n0) {
            return;
        }
        this.n0 = true;
        this.o0 = false;
        Dialog dialog = this.l0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.l0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.b0.getLooper()) {
                    onDismiss(this.l0);
                } else {
                    this.b0.post(this.c0);
                }
            }
        }
        this.m0 = true;
        if (this.j0 >= 0) {
            D0().D0(this.j0, 1);
            this.j0 = -1;
            return;
        }
        u uVarI = D0().i();
        uVarI.q(this);
        if (z) {
            uVarI.k();
        } else {
            uVarI.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void H1(Bundle bundle) {
        super.H1(bundle);
        Dialog dialog = this.l0;
        if (dialog != null) {
            bundle.putBundle("android:savedDialogState", dialog.onSaveInstanceState());
        }
        int i2 = this.f0;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.g0;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z = this.h0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.i0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i4 = this.j0;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        Dialog dialog = this.l0;
        if (dialog != null) {
            this.m0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        Dialog dialog = this.l0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void K2() {
        L2(false, false);
    }

    public Dialog M2() {
        return this.l0;
    }

    public int N2() {
        return this.g0;
    }

    public Dialog O2(Bundle bundle) {
        return new Dialog(m2(), N2());
    }

    public final Dialog P2() {
        Dialog dialogM2 = M2();
        if (dialogM2 != null) {
            return dialogM2;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void Q2(boolean z) {
        this.i0 = z;
    }

    public void R2(Dialog dialog, int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void S2(m mVar, String str) {
        this.n0 = false;
        this.o0 = true;
        u uVarI = mVar.i();
        uVarI.e(this, str);
        uVarI.j();
    }

    @Override // androidx.fragment.app.Fragment
    public void f1(Bundle bundle) {
        Bundle bundle2;
        super.f1(bundle);
        if (this.i0) {
            View viewQ0 = Q0();
            if (this.l0 != null) {
                if (viewQ0 != null) {
                    if (viewQ0.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    this.l0.setContentView(viewQ0);
                }
                d dVarJ0 = j0();
                if (dVarJ0 != null) {
                    this.l0.setOwnerActivity(dVarJ0);
                }
                this.l0.setCancelable(this.h0);
                this.l0.setOnCancelListener(this.d0);
                this.l0.setOnDismissListener(this.e0);
                if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                    return;
                }
                this.l0.onRestoreInstanceState(bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void i1(Context context) {
        super.i1(context);
        if (this.o0) {
            return;
        }
        this.n0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        this.b0 = new Handler();
        this.i0 = this.B == 0;
        if (bundle != null) {
            this.f0 = bundle.getInt("android:style", 0);
            this.g0 = bundle.getInt("android:theme", 0);
            this.h0 = bundle.getBoolean("android:cancelable", true);
            this.i0 = bundle.getBoolean("android:showsDialog", this.i0);
            this.j0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.m0) {
            return;
        }
        L2(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        Dialog dialog = this.l0;
        if (dialog != null) {
            this.m0 = true;
            dialog.setOnDismissListener(null);
            this.l0.dismiss();
            if (!this.n0) {
                onDismiss(this.l0);
            }
            this.l0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void t1() {
        super.t1();
        if (this.o0 || this.n0) {
            return;
        }
        this.n0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater u1(Bundle bundle) {
        LayoutInflater layoutInflaterU1 = super.u1(bundle);
        if (!this.i0 || this.k0) {
            return layoutInflaterU1;
        }
        try {
            this.k0 = true;
            Dialog dialogO2 = O2(bundle);
            this.l0 = dialogO2;
            R2(dialogO2, this.f0);
            this.k0 = false;
            return layoutInflaterU1.cloneInContext(P2().getContext());
        } catch (Throwable th) {
            this.k0 = false;
            throw th;
        }
    }
}