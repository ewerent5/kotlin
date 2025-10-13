package com.parizene.netmonitor.ui.cell;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.EmptyRecyclerView;
import com.parizene.netmonitor.ui.FixedLinearLayoutManager;
import com.parizene.netmonitor.ui.SettingsFragmentActivity;
import com.parizene.netmonitor.ui.cell.n.e;
import com.parizene.netmonitor.ui.u0;
import java.util.List;

/* loaded from: classes3.dex */
public class CellFragment extends u0 implements m, e.a {
    private e b0;
    private i c0;
    private Menu d0;
    private View e0;
    com.parizene.netmonitor.k0.e f0;
    org.greenrobot.eventbus.c g0;
    Handler h0;
    Handler i0;
    com.parizene.netmonitor.m0.z.b j0;

    @BindView
    ViewStub mBannerStub;

    @BindView
    EmptyRecyclerView mRecyclerView;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void M2(View view) {
        this.c0.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void O2(View view) {
        this.c0.h();
    }

    @Override // com.parizene.netmonitor.ui.cell.m
    public void E(h hVar) {
        this.d0.findItem(R.id.menu_show_signal_plot).setChecked(hVar.a);
        this.d0.findItem(R.id.menu_show_neighboring_cells).setChecked(hVar.f13792b);
    }

    @Override // com.parizene.netmonitor.ui.u0
    protected String I2() {
        return "CELL";
    }

    @Override // com.parizene.netmonitor.ui.cell.m
    public void J() {
        View viewInflate = this.mBannerStub.inflate();
        this.e0 = viewInflate;
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.cell.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13780e.M2(view);
            }
        });
        ((TextView) this.e0.findViewById(R.id.text)).setText(Html.fromHtml(L0(R.string.cell_banner_text)));
        this.e0.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: com.parizene.netmonitor.ui.cell.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13781e.O2(view);
            }
        });
    }

    @Override // com.parizene.netmonitor.ui.u0
    protected void J2() {
        super.J2();
        i iVar = this.c0;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // com.parizene.netmonitor.ui.u0
    protected void K2() {
        super.K2();
        i iVar = this.c0;
        if (iVar != null) {
            iVar.b();
        }
    }

    @Override // com.parizene.netmonitor.ui.cell.m
    public void W(k kVar, boolean z) {
        this.b0.G(kVar, z);
    }

    @Override // com.parizene.netmonitor.ui.cell.m
    public void a0() {
        D2(new Intent(j0(), (Class<?>) SettingsFragmentActivity.class));
    }

    @Override // com.parizene.netmonitor.ui.cell.m
    public void c0(k kVar) {
        e eVar = new e(j0(), y0(), kVar, this.j0, this);
        this.b0 = eVar;
        this.mRecyclerView.setAdapter(eVar);
    }

    @Override // com.parizene.netmonitor.ui.cell.m
    public void d(List<Object> list) {
        this.b0.D(list);
    }

    @Override // com.parizene.netmonitor.ui.cell.m
    public void h() {
        D2(com.parizene.netmonitor.s0.d.c.n());
    }

    @Override // androidx.fragment.app.Fragment
    public void i1(Context context) {
        f.b.f.a.b(this);
        super.i1(context);
        this.c0 = new j(this.f0, this.g0, this.i0, this.h0);
    }

    @Override // androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        t2(true);
    }

    @Override // com.parizene.netmonitor.ui.cell.n.e.a
    public void m() {
        this.c0.d();
    }

    @Override // com.parizene.netmonitor.ui.cell.m
    public void n() {
        this.e0.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.cell_menu, menu);
        this.d0 = menu;
        this.c0.c();
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws NoSuchMethodException, SecurityException {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_cell, (ViewGroup) null);
        ButterKnife.a(this, viewInflate);
        FixedLinearLayoutManager fixedLinearLayoutManager = new FixedLinearLayoutManager(j0(), 1, false);
        fixedLinearLayoutManager.N2(false);
        this.mRecyclerView.setLayoutManager(fixedLinearLayoutManager);
        this.mRecyclerView.setItemAnimator(null);
        this.mRecyclerView.h(new f(j0(), R.drawable.bg_item_divider));
        TextView textView = (TextView) viewInflate.findViewById(R.id.emptyText);
        textView.setText(R.string.cell_empty_text);
        this.mRecyclerView.setEmptyView(textView);
        this.c0.D(this, bundle);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void r1() {
        super.r1();
        this.d0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        this.c0.u();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean z1(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_show_neighboring_cells) {
            this.c0.w();
            return true;
        }
        if (itemId != R.id.menu_show_signal_plot) {
            return super.z1(menuItem);
        }
        this.c0.m();
        return true;
    }
}