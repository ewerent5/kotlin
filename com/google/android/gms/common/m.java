package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.p;

/* loaded from: classes.dex */
public class m extends androidx.fragment.app.c {
    private Dialog p0 = null;
    private DialogInterface.OnCancelListener q0 = null;

    public static m T2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        m mVar = new m();
        Dialog dialog2 = (Dialog) p.k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        mVar.p0 = dialog2;
        if (onCancelListener != null) {
            mVar.q0 = onCancelListener;
        }
        return mVar;
    }

    @Override // androidx.fragment.app.c
    public Dialog O2(Bundle bundle) {
        if (this.p0 == null) {
            Q2(false);
        }
        return this.p0;
    }

    @Override // androidx.fragment.app.c
    public void S2(androidx.fragment.app.m mVar, String str) {
        super.S2(mVar, str);
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.q0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}