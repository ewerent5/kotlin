package com.parizene.netmonitor.ui.nps;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.R;
import i.y.d.l;

/* compiled from: NpsRateAppFragment.kt */
/* loaded from: classes3.dex */
public final class NpsRateAppFragment extends Fragment {
    private a b0;
    private g c0;

    /* compiled from: NpsRateAppFragment.kt */
    public interface a {
        void h(int i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(NpsRateAppFragment npsRateAppFragment, View view) {
        l.d(npsRateAppFragment, "this$0");
        a aVar = npsRateAppFragment.b0;
        if (aVar == null) {
            l.m("callback");
            throw null;
        }
        g gVar = npsRateAppFragment.c0;
        if (gVar != null) {
            aVar.h(gVar.b());
        } else {
            l.m("args");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void i1(Context context) {
        l.d(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        super.i1(context);
        if (context instanceof a) {
            this.b0 = (a) context;
            return;
        }
        throw new ClassCastException(context + " should implement NpsRateAppFragment.Callback");
    }

    @Override // androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        g gVarA = g.a(l2());
        l.c(gVarA, "fromBundle(requireArguments())");
        this.c0 = gVarA;
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_nps_rate_app, viewGroup, false);
        ((Button) viewInflate.findViewById(R.id.btnTakeMeThere)).setOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.nps.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NpsRateAppFragment.J2(this.f13998e, view);
            }
        });
        return viewInflate;
    }
}