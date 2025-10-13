package com.parizene.netmonitor.ui.log;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.j0;
import com.parizene.netmonitor.ui.EmptyRecyclerView;
import com.parizene.netmonitor.ui.FixedLinearLayoutManager;
import com.parizene.netmonitor.ui.q0;
import com.parizene.netmonitor.ui.r0;
import com.parizene.netmonitor.ui.u0;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class LogFragment extends u0 implements s, i {
    private com.parizene.netmonitor.ui.log.e b0;
    private o c0;
    private Menu d0;
    private l e0;
    private r0 f0;
    com.parizene.netmonitor.k0.e g0;
    com.parizene.netmonitor.db.celllog.b h0;
    org.greenrobot.eventbus.c i0;
    Handler j0;
    Handler k0;
    f.a<com.parizene.netmonitor.m0.z.b> l0;
    j m0;

    @BindView
    EmptyRecyclerView mRecyclerView;
    private final androidx.lifecycle.r<List<g>> n0 = new b();

    class a extends r0 {
        a(LinearLayoutManager linearLayoutManager) {
            super(linearLayoutManager);
        }

        @Override // com.parizene.netmonitor.ui.r0
        public void d(int i2, int i3, RecyclerView recyclerView) {
            m.a.a.a("onLoadMore: page=%d, totalItemsCount=%d", Integer.valueOf(i2), Integer.valueOf(i3));
            LogFragment.this.e0.k(i2);
        }
    }

    class b implements androidx.lifecycle.r<List<g>> {
        b() {
        }

        @Override // androidx.lifecycle.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List<g> list) {
            LogFragment.this.b0.D(list);
        }
    }

    class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            LogFragment.this.e0.l(i2);
            LogFragment.this.f0.e();
            LogFragment.this.mRecyclerView.i1(0);
        }
    }

    class d implements DialogInterface.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String[] f13858e;

        d(String[] strArr) {
            this.f13858e = strArr;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            LogFragment.this.e0.m(this.f13858e[i2]);
            LogFragment.this.f0.e();
            LogFragment.this.mRecyclerView.i1(0);
        }
    }

    class e implements DialogInterface.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f13860e;

        e(g gVar) {
            this.f13860e = gVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            if (i2 == 0) {
                LogFragment.this.c0.e(this.f13860e);
            } else {
                LogFragment.this.e0.j(this.f13860e);
            }
        }
    }

    private static View P2(Context context, String str) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int iA = (int) j0.a(context, 8.0f);
        linearLayout.setPadding(iA, iA, iA, iA);
        EditText editText = new EditText(context);
        editText.setId(R.id.editText);
        editText.setMinimumWidth((int) j0.a(context, 400.0f));
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        editText.setText(str);
        linearLayout.addView(editText);
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void R2(EditText editText, g gVar, DialogInterface dialogInterface, int i2) {
        String string = editText.getText().toString();
        if (TextUtils.isEmpty(string)) {
            string = null;
        }
        this.e0.o(gVar, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void T2(EditText editText, DialogInterface dialogInterface, int i2) {
        String string = editText.getText().toString();
        if (TextUtils.isEmpty(string)) {
            string = null;
        }
        this.e0.n(string);
        this.f0.e();
        this.mRecyclerView.i1(0);
    }

    @Override // com.parizene.netmonitor.ui.log.s
    public void G(g gVar) {
        new b.a(j0()).g(new CharSequence[]{P0(R.string.log_context_menu_edit), P0(R.string.log_context_menu_delete)}, new e(gVar)).a().show();
    }

    @Override // com.parizene.netmonitor.ui.log.s
    public void H(n nVar) {
        this.d0.findItem(R.id.menu_show_operator).setChecked(nVar.b());
        this.d0.findItem(R.id.menu_show_date).setChecked(nVar.a());
    }

    @Override // androidx.fragment.app.Fragment
    public void H1(Bundle bundle) {
        super.H1(bundle);
        this.f0.g(bundle);
    }

    @Override // com.parizene.netmonitor.ui.u0
    protected String I2() {
        return "LOG";
    }

    @Override // com.parizene.netmonitor.ui.u0
    protected void J2() {
        super.J2();
        this.e0.i().f(R0(), this.n0);
        o oVar = this.c0;
        if (oVar != null) {
            oVar.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void K1(View view, Bundle bundle) {
        super.K1(view, bundle);
        this.e0 = (l) new z(this, new m(this.m0, this.g0, this, null)).a(l.class);
    }

    @Override // com.parizene.netmonitor.ui.u0
    protected void K2() {
        super.K2();
        this.e0.i().k(this.n0);
        o oVar = this.c0;
        if (oVar != null) {
            oVar.b();
        }
    }

    @Override // com.parizene.netmonitor.ui.log.s
    public void L(final g gVar, String str) {
        b.a aVar = new b.a(j0());
        aVar.u(str);
        View viewP2 = P2(j0(), gVar.d());
        final EditText editText = (EditText) viewP2.findViewById(R.id.editText);
        aVar.v(viewP2);
        aVar.o(R.string.btn_save, new DialogInterface.OnClickListener() { // from class: com.parizene.netmonitor.ui.log.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f13864e.R2(editText, gVar, dialogInterface, i2);
            }
        });
        aVar.k(android.R.string.cancel, null);
        aVar.a().show();
    }

    @Override // com.parizene.netmonitor.ui.log.s
    public void Z(q qVar) {
        com.parizene.netmonitor.ui.log.e eVar = new com.parizene.netmonitor.ui.log.e(j0(), y0(), this, qVar, this.l0);
        this.b0 = eVar;
        this.mRecyclerView.setAdapter(eVar);
    }

    @Override // com.parizene.netmonitor.ui.log.i
    public void b0(g gVar) {
        this.c0.p(gVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void i1(Context context) {
        f.b.f.a.b(this);
        super.i1(context);
        this.c0 = new p(this.h0, this.g0, this.k0, this.j0);
    }

    @Override // androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        t2(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void o1(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.log_menu, menu);
        this.d0 = menu;
        this.c0.c();
    }

    @Override // androidx.fragment.app.Fragment
    public View p1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws NoSuchMethodException, SecurityException {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_log, viewGroup, false);
        ButterKnife.a(this, viewInflate);
        FixedLinearLayoutManager fixedLinearLayoutManager = new FixedLinearLayoutManager(j0(), 1, false);
        this.mRecyclerView.setLayoutManager(fixedLinearLayoutManager);
        this.mRecyclerView.setItemAnimator(null);
        this.mRecyclerView.h(new q0(j0(), R.drawable.bg_item_divider));
        a aVar = new a(fixedLinearLayoutManager);
        this.f0 = aVar;
        if (bundle != null) {
            aVar.f(bundle);
        }
        this.mRecyclerView.k(this.f0);
        TextView textView = (TextView) viewInflate.findViewById(R.id.emptyText);
        textView.setText(R.string.log_empty_text);
        this.mRecyclerView.setEmptyView(textView);
        this.c0.D(this, bundle);
        return viewInflate;
    }

    @Override // com.parizene.netmonitor.ui.log.s
    public void q(String str) {
        b.a aVar = new b.a(j0());
        aVar.t(R.string.menu_psc_filter);
        View viewP2 = P2(j0(), str);
        final EditText editText = (EditText) viewP2.findViewById(R.id.editText);
        editText.setInputType(2);
        aVar.v(viewP2);
        aVar.o(R.string.btn_save, new DialogInterface.OnClickListener() { // from class: com.parizene.netmonitor.ui.log.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f13867e.T2(editText, dialogInterface, i2);
            }
        });
        aVar.k(android.R.string.cancel, null);
        aVar.a().show();
    }

    @Override // com.parizene.netmonitor.ui.log.s
    public void r(Map<String, String> map, String str) {
        String[] strArr = new String[map.size()];
        String[] strArr2 = new String[map.size()];
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            strArr[i3] = key;
            if (j0.c(key, str)) {
                i2 = i3;
            }
            strArr2[i3] = TextUtils.isEmpty(key) ? L0(R.string.no_filter) : entry.getValue();
            i3++;
        }
        b.a aVar = new b.a(j0());
        aVar.t(R.string.menu_operators_filter);
        aVar.s(strArr2, i2, new d(strArr));
        aVar.a().show();
    }

    @Override // androidx.fragment.app.Fragment
    public void r1() {
        super.r1();
        this.d0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        this.mRecyclerView.Z0(this.f0);
        this.c0.u();
    }

    @Override // com.parizene.netmonitor.ui.log.s
    public void x(int i2) {
        b.a aVar = new b.a(j0());
        aVar.t(R.string.menu_log_sort_order);
        aVar.q(R.array.pref_log_sort_order_entries, i2, new c());
        aVar.o(android.R.string.ok, null);
        aVar.a().show();
    }

    @Override // com.parizene.netmonitor.ui.log.s
    public void z(q qVar) {
        this.b0.F(qVar);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean z1(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.menu_log_sort_order /* 2131296613 */:
                this.c0.l();
                return true;
            case R.id.menu_operators_filter /* 2131296617 */:
                this.c0.B();
                return true;
            case R.id.menu_psc_filter /* 2131296620 */:
                this.c0.A();
                return true;
            case R.id.menu_show_date /* 2131296622 */:
                this.c0.E();
                return true;
            case R.id.menu_show_operator /* 2131296624 */:
                this.c0.v();
                return true;
            default:
                return super.z1(menuItem);
        }
    }
}