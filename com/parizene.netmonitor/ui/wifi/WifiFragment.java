package com.parizene.netmonitor.ui.wifi;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.EmptyRecyclerView;
import com.parizene.netmonitor.ui.FixedLinearLayoutManager;
import com.parizene.netmonitor.ui.cell.n.e;
import com.parizene.netmonitor.ui.q0;
import com.parizene.netmonitor.ui.u0;
import java.util.List;

/* loaded from: classes3.dex */
public class WifiFragment extends u0 implements j, e.a {
    private g b0;
    private c c0;
    com.parizene.netmonitor.s0.e.c d0;
    com.parizene.netmonitor.s0.d.c e0;
    Handler f0;

    @BindView
    EmptyRecyclerView mRecyclerView;

    @Override // androidx.fragment.app.Fragment
    public void H1(Bundle bundle) {
        this.b0.t(bundle);
    }

    @Override // com.parizene.netmonitor.ui.u0
    protected String I2() {
        return "WIFI";
    }

    @Override // com.parizene.netmonitor.ui.u0
    protected void J2() {
        super.J2();
        g gVar = this.b0;
        if (gVar != null) {
            gVar.a();
        }
    }

    @Override // com.parizene.netmonitor.ui.u0
    protected void K2() {
        super.K2();
        g gVar = this.b0;
        if (gVar != null) {
            gVar.b();
        }
    }

    @Override // com.parizene.netmonitor.ui.wifi.j
    public void d(List<Object> list) {
        this.c0.D(list);
    }

    @Override // com.parizene.netmonitor.ui.wifi.j
    public void h() {
        D2(com.parizene.netmonitor.s0.d.c.n());
    }

    @Override // androidx.fragment.app.Fragment
    public void i1(Context context) {
        f.b.f.a.b(this);
        super.i1(context);
        this.b0 = new h(this.d0, this.e0, this.f0);
    }

    @Override // com.parizene.netmonitor.ui.cell.n.e.a
    public void m() {
        this.b0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws NoSuchMethodException, SecurityException {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_wifi, (ViewGroup) null);
        ButterKnife.a(this, viewInflate);
        this.mRecyclerView.setLayoutManager(new FixedLinearLayoutManager(j0(), 1, false));
        this.mRecyclerView.setItemAnimator(null);
        this.mRecyclerView.h(new q0(j0(), R.drawable.bg_item_divider));
        TextView textView = (TextView) viewInflate.findViewById(R.id.emptyText);
        textView.setText(R.string.wifi_empty_text);
        this.mRecyclerView.setEmptyView(textView);
        this.b0.D(this, bundle);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        this.b0.u();
    }

    @Override // com.parizene.netmonitor.ui.wifi.j
    public void u(List<Object> list) {
        c cVar = new c(y0(), this);
        this.c0 = cVar;
        this.mRecyclerView.setAdapter(cVar);
        d(list);
    }
}