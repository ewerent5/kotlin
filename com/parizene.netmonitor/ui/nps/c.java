package com.parizene.netmonitor.ui.nps;

import android.view.View;
import android.widget.EditText;

/* compiled from: lambda */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: e */
    public final /* synthetic */ EditText f13999e;

    /* renamed from: f */
    public final /* synthetic */ NpsSendFeedbackFragment f14000f;

    public /* synthetic */ c(EditText editText, NpsSendFeedbackFragment npsSendFeedbackFragment) {
        editText = editText;
        this = npsSendFeedbackFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NpsSendFeedbackFragment.J2(editText, this, view);
    }
}