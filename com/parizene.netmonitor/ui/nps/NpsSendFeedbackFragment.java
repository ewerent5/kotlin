package com.parizene.netmonitor.ui.nps;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.R;
import i.y.d.l;

/* compiled from: NpsSendFeedbackFragment.kt */
/* loaded from: classes3.dex */
public final class NpsSendFeedbackFragment extends Fragment {
    private a b0;
    private h c0;

    /* compiled from: NpsSendFeedbackFragment.kt */
    public interface a {
        void n(int i2, String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(EditText editText, NpsSendFeedbackFragment npsSendFeedbackFragment, View view) {
        l.d(npsSendFeedbackFragment, "this$0");
        String string = editText.getText().toString();
        if (TextUtils.isEmpty(string)) {
            Toast.makeText(npsSendFeedbackFragment.m2(), R.string.nps_send_feedback_toast, 0).show();
            return;
        }
        a aVar = npsSendFeedbackFragment.b0;
        if (aVar == null) {
            l.m("callback");
            throw null;
        }
        h hVar = npsSendFeedbackFragment.c0;
        if (hVar != null) {
            aVar.n(hVar.b(), string);
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
        throw new ClassCastException(context + " should implement NpsSendFeedbackFragment.Callback");
    }

    @Override // androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        h hVarA = h.a(l2());
        l.c(hVarA, "fromBundle(requireArguments())");
        this.c0 = hVarA;
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_nps_send_feedback, viewGroup, false);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.input);
        ((Button) viewInflate.findViewById(R.id.btnTakeMeThere)).setOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.nps.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NpsSendFeedbackFragment.J2(editText, this, view);
            }
        });
        return viewInflate;
    }
}