package com.parizene.netmonitor.ui.test;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.m0.x;
import com.parizene.netmonitor.ui.q0;

/* compiled from: TestFragment.java */
/* loaded from: classes3.dex */
public class d extends Fragment implements com.parizene.netmonitor.m0.f {
    private TextView b0;
    private c c0;
    Handler d0;
    com.parizene.netmonitor.m0.e e0;
    com.parizene.netmonitor.m0.e f0;
    f.a<x> g0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void J2(int i2, SparseArray sparseArray, com.parizene.netmonitor.m0.b0.a aVar) {
        M2(i2, sparseArray);
        this.c0.D(aVar, i2, sparseArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void L2(View view) {
        e.b(this);
    }

    private void M2(int i2, SparseArray<c.h.k.d<Integer, com.parizene.netmonitor.m0.b0.b>> sparseArray) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            sb.append(sparseArray.keyAt(i3));
            if (i3 < sparseArray.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        this.b0.setText(i2 + " " + sb.toString());
    }

    @Override // com.parizene.netmonitor.m0.f
    public void F(final com.parizene.netmonitor.m0.b0.a aVar, final int i2, final SparseArray<c.h.k.d<Integer, com.parizene.netmonitor.m0.b0.b>> sparseArray) {
        this.d0.post(new Runnable() { // from class: com.parizene.netmonitor.ui.test.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f14030e.J2(i2, sparseArray, aVar);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void F1(int i2, String[] strArr, int[] iArr) {
        super.F1(i2, strArr, iArr);
        e.a(this, i2, iArr);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        com.parizene.netmonitor.m0.d dVarB = com.parizene.netmonitor.m0.d.b(com.parizene.netmonitor.t0.f.a.g());
        this.f0.t(dVarB);
        this.f0.a(this);
        this.f0.j();
        this.e0.t(dVarB);
        this.e0.a(this);
        this.e0.j();
    }

    @Override // androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        this.f0.k();
        this.f0.i(this);
        this.e0.k();
        this.e0.i(this);
    }

    void N2() {
        this.g0.get().l(m2());
    }

    @Override // androidx.fragment.app.Fragment
    public void i1(Context context) {
        f.b.f.a.b(this);
        super.i1(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_test, viewGroup, false);
        ((Button) viewInflate.findViewById(R.id.send_log_file_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.test.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14034e.L2(view);
            }
        });
        TextView textView = (TextView) viewInflate.findViewById(R.id.active_subscription_ids);
        this.b0 = textView;
        textView.setTypeface(Typeface.MONOSPACE);
        this.c0 = new c(j0());
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(this.c0);
        recyclerView.h(new q0(j0(), R.drawable.bg_item_divider));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void q1() {
        super.q1();
        this.e0 = null;
        this.f0 = null;
    }
}