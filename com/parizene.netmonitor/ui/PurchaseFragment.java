package com.parizene.netmonitor.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.R;
import j$.time.Period;

/* compiled from: PurchaseFragment.kt */
/* loaded from: classes3.dex */
public final class PurchaseFragment extends Fragment {
    public com.parizene.netmonitor.s0.c.c b0;
    private a c0;

    /* compiled from: PurchaseFragment.kt */
    public interface a {
        void d();

        void j();

        void l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(PurchaseFragment purchaseFragment, View view) {
        i.y.d.l.d(purchaseFragment, "this$0");
        a aVar = purchaseFragment.c0;
        if (aVar != null) {
            aVar.l();
        } else {
            i.y.d.l.m("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(PurchaseFragment purchaseFragment, View view) {
        i.y.d.l.d(purchaseFragment, "this$0");
        a aVar = purchaseFragment.c0;
        if (aVar != null) {
            aVar.j();
        } else {
            i.y.d.l.m("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(PurchaseFragment purchaseFragment, View view) {
        i.y.d.l.d(purchaseFragment, "this$0");
        a aVar = purchaseFragment.c0;
        if (aVar != null) {
            aVar.d();
        } else {
            i.y.d.l.m("callback");
            throw null;
        }
    }

    public final com.parizene.netmonitor.s0.c.c I2() {
        com.parizene.netmonitor.s0.c.c cVar = this.b0;
        if (cVar != null) {
            return cVar;
        }
        i.y.d.l.m("premiumHelper");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void i1(Context context) {
        i.y.d.l.d(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        f.b.f.a.b(this);
        super.i1(context);
        if (context instanceof a) {
            this.c0 = (a) context;
            return;
        }
        throw new ClassCastException(context + " should implement PurchaseFragment.Callback");
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        Period periodA;
        i.y.d.l.d(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_intro_purchase, viewGroup, false);
        com.parizene.netmonitor.s0.c.e eVarU = I2().u();
        if (eVarU != null && (periodA = eVarU.a()) != null) {
            String quantityString = F0().getQuantityString(R.plurals.purchase_number_of_days, periodA.getDays(), Integer.valueOf(periodA.getDays()));
            i.y.d.l.c(quantityString, "resources.getQuantityString(R.plurals.purchase_number_of_days, freeTrialPeriod.days, freeTrialPeriod.days)");
            ((TextView) viewInflate.findViewById(R.id.purchaseInfo1)).setText(M0(R.string.purchase_info_1, quantityString));
            ((TextView) viewInflate.findViewById(R.id.purchaseInfo2)).setText(M0(R.string.purchase_info_2, quantityString, eVarU.b(), L0(R.string.purchase_period_year)));
        }
        ((ImageView) viewInflate.findViewById(R.id.btnClose)).setOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PurchaseFragment.M2(this.f14042e, view);
            }
        });
        ((Button) viewInflate.findViewById(R.id.btnContinue)).setOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PurchaseFragment.N2(this.f14043e, view);
            }
        });
        viewInflate.findViewById(R.id.termsAndPrivacy).setOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PurchaseFragment.O2(this.f14041e, view);
            }
        });
        return viewInflate;
    }
}