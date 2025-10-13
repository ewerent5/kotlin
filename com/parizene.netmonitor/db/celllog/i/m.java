package com.parizene.netmonitor.db.celllog.i;

import android.content.Context;
import android.text.TextUtils;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.m0.b0.y;
import com.parizene.netmonitor.ui.p0;

/* compiled from: LteCellEntityItem.java */
/* loaded from: classes.dex */
public class m extends c<com.parizene.netmonitor.m0.b0.n> {
    public m(y yVar, com.parizene.netmonitor.m0.b0.n nVar, boolean z) {
        super(yVar.d(), yVar.f(), nVar, z);
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public boolean a() {
        return super.a() && !TextUtils.isEmpty(this.f13100b) && ((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().g() && ((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().d();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public boolean b() {
        return super.b() && (((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().d() || ((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().f());
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int e() {
        return ((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().e() ? ((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().f13286f : super.e();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public long f() {
        return ((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().f13284d;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int h() {
        return ((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().f13283c;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int k() {
        return 1;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int l() {
        return ((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().f() ? ((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().f13285e : super.l();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public String q(Context context, p0 p0Var, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.q(context, p0Var, z));
        sb.append(context.getString(R.string.telephony_label_tac));
        sb.append(" ");
        sb.append(((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().f13283c);
        sb.append(" ");
        sb.append(context.getString(R.string.telephony_label_ci));
        sb.append(" ");
        sb.append(p0.c(((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().f13284d, ((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().a(), ((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().b(), p0Var, z));
        if (((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().f()) {
            sb.append(" ");
            sb.append(context.getString(R.string.telephony_label_pci));
            sb.append(" ");
            sb.append(((com.parizene.netmonitor.m0.b0.n) this.f13101c).a().f13285e);
        }
        return sb.toString();
    }
}