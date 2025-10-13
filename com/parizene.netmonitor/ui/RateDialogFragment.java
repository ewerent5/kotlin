package com.parizene.netmonitor.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.b;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.e1;

/* compiled from: RateDialogFragment.kt */
/* loaded from: classes3.dex */
public final class RateDialogFragment extends androidx.fragment.app.c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(RateDialogFragment rateDialogFragment, DialogInterface dialogInterface, int i2) {
        i.y.d.l.d(rateDialogFragment, "this$0");
        com.parizene.netmonitor.t0.f.p.f(-1);
        e1.a aVar = e1.a;
        androidx.fragment.app.d dVarK2 = rateDialogFragment.k2();
        i.y.d.l.c(dVarK2, "requireActivity()");
        aVar.d(dVarK2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(DialogInterface dialogInterface, int i2) {
        com.parizene.netmonitor.t0.f.p.f(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y2(DialogInterface dialogInterface, int i2) {
        com.parizene.netmonitor.t0.f.p.f(-1);
    }

    @Override // androidx.fragment.app.c
    public Dialog O2(Bundle bundle) {
        b.a aVar = new b.a(m2());
        aVar.h(R.string.rate_msg);
        aVar.o(R.string.rate, new DialogInterface.OnClickListener() { // from class: com.parizene.netmonitor.ui.z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                RateDialogFragment.W2(this.f14068e, dialogInterface, i2);
            }
        });
        aVar.m(R.string.later, new DialogInterface.OnClickListener() { // from class: com.parizene.netmonitor.ui.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                RateDialogFragment.X2(dialogInterface, i2);
            }
        });
        aVar.k(R.string.no_thanks, new DialogInterface.OnClickListener() { // from class: com.parizene.netmonitor.ui.y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                RateDialogFragment.Y2(dialogInterface, i2);
            }
        });
        androidx.appcompat.app.b bVarA = aVar.a();
        i.y.d.l.c(bVarA, "builder.create()");
        return bVarA;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        i.y.d.l.d(dialogInterface, "dialog");
        com.parizene.netmonitor.t0.f.p.f(0);
    }
}