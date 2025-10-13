package com.parizene.netmonitor.ui.nps;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.R;
import i.y.d.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: NpsCollectFragment.kt */
/* loaded from: classes3.dex */
public final class NpsCollectFragment extends Fragment implements View.OnClickListener {
    private a b0;
    private final ArrayList<CheckedTextView> c0 = new ArrayList<>();

    /* compiled from: NpsCollectFragment.kt */
    public interface a {
        void p(int i2);
    }

    private final void I2(View view, int i2, int i3) {
        View viewFindViewById = view.findViewById(i2);
        l.c(viewFindViewById, "view.findViewById(id)");
        CheckedTextView checkedTextView = (CheckedTextView) viewFindViewById;
        checkedTextView.setTag(Integer.valueOf(i3));
        checkedTextView.setOnClickListener(this);
        this.c0.add(checkedTextView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K2(NpsCollectFragment npsCollectFragment, View view) {
        Object next;
        l.d(npsCollectFragment, "this$0");
        Iterator<T> it = npsCollectFragment.c0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((CheckedTextView) next).isChecked()) {
                    break;
                }
            }
        }
        CheckedTextView checkedTextView = (CheckedTextView) next;
        Object tag = checkedTextView == null ? null : checkedTextView.getTag();
        if (tag == null) {
            Toast.makeText(npsCollectFragment.m2(), R.string.nps_collect_toast, 0).show();
            return;
        }
        int iIntValue = ((Integer) tag).intValue();
        a aVar = npsCollectFragment.b0;
        if (aVar != null) {
            aVar.p(iIntValue);
        } else {
            l.m("callback");
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
        throw new ClassCastException(context + " should implement NpsCollectFragment.Callback");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Iterator<T> it = this.c0.iterator();
        while (it.hasNext()) {
            ((CheckedTextView) it.next()).setChecked(false);
        }
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.CheckedTextView");
        ((CheckedTextView) view).setChecked(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_nps_collect, viewGroup, false);
        this.c0.clear();
        l.c(viewInflate, "view");
        I2(viewInflate, R.id.btnScore0, 0);
        I2(viewInflate, R.id.btnScore1, 1);
        I2(viewInflate, R.id.btnScore2, 2);
        I2(viewInflate, R.id.btnScore3, 3);
        I2(viewInflate, R.id.btnScore4, 4);
        I2(viewInflate, R.id.btnScore5, 5);
        I2(viewInflate, R.id.btnScore6, 6);
        I2(viewInflate, R.id.btnScore7, 7);
        I2(viewInflate, R.id.btnScore8, 8);
        I2(viewInflate, R.id.btnScore9, 9);
        I2(viewInflate, R.id.btnScore10, 10);
        ((Button) viewInflate.findViewById(R.id.btnSubmit)).setOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.nps.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NpsCollectFragment.K2(this.f13997e, view);
            }
        });
        return viewInflate;
    }
}