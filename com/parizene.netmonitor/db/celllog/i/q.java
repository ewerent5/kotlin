package com.parizene.netmonitor.db.celllog.i;

import android.content.Context;
import android.text.TextUtils;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.m0.b0.y;
import com.parizene.netmonitor.ui.p0;

/* compiled from: WcdmaCellEntityItem.java */
/* loaded from: classes.dex */
public class q extends c<com.parizene.netmonitor.m0.b0.q> {
    public q(y yVar, com.parizene.netmonitor.m0.b0.q qVar, boolean z) {
        super(yVar.d(), yVar.f(), qVar, z);
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public boolean a() {
        return super.a() && !TextUtils.isEmpty(this.f13100b) && ((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().d() && ((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().c();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public boolean b() {
        return super.b() && (((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().c() || ((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().e());
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int e() {
        return ((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().g() ? ((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().f13302f : super.e();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public long f() {
        return ((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().f13300d;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int h() {
        return ((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().f13299c;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int k() {
        return 2;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int l() {
        return ((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().e() ? ((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().f13301e : super.l();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public String q(Context context, p0 p0Var, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.q(context, p0Var, z));
        sb.append(context.getString(R.string.telephony_label_lac));
        sb.append(" ");
        if (((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().d()) {
            sb.append(((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().f13299c);
        } else {
            sb.append("-");
        }
        sb.append(" ");
        sb.append(context.getString(R.string.telephony_label_cid));
        sb.append(" ");
        sb.append(p0.e(((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().f13300d, ((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().b(), p0Var));
        if (((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().f()) {
            sb.append(" ");
            sb.append(context.getString(R.string.telephony_label_rnc));
            sb.append(" ");
            sb.append(((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().a());
        }
        if (((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().e()) {
            sb.append(" ");
            sb.append(context.getString(R.string.telephony_label_psc));
            sb.append(" ");
            sb.append(((com.parizene.netmonitor.m0.b0.q) this.f13101c).a().f13301e);
        }
        return sb.toString();
    }
}