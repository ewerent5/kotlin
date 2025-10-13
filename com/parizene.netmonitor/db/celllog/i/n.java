package com.parizene.netmonitor.db.celllog.i;

import android.content.Context;
import android.text.TextUtils;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.m0.b0.y;
import com.parizene.netmonitor.ui.p0;

/* compiled from: NrCellEntityItem.java */
/* loaded from: classes.dex */
public class n extends c<com.parizene.netmonitor.m0.b0.o> {
    public n(y yVar, com.parizene.netmonitor.m0.b0.o oVar, boolean z) {
        super(yVar.d(), yVar.f(), oVar, z);
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public boolean a() {
        return super.a() && !TextUtils.isEmpty(this.f13100b) && ((com.parizene.netmonitor.m0.b0.o) this.f13101c).a().d() && ((com.parizene.netmonitor.m0.b0.o) this.f13101c).a().a();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public boolean b() {
        return super.b() && (((com.parizene.netmonitor.m0.b0.o) this.f13101c).a().a() || ((com.parizene.netmonitor.m0.b0.o) this.f13101c).a().c());
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int e() {
        return ((com.parizene.netmonitor.m0.b0.o) this.f13101c).a().b() ? ((com.parizene.netmonitor.m0.b0.o) this.f13101c).a().f13292f : super.e();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public long f() {
        return ((com.parizene.netmonitor.m0.b0.o) this.f13101c).a().f13290d;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int h() {
        return ((com.parizene.netmonitor.m0.b0.o) this.f13101c).a().f13289c;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int k() {
        return 6;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int l() {
        return ((com.parizene.netmonitor.m0.b0.o) this.f13101c).a().c() ? ((com.parizene.netmonitor.m0.b0.o) this.f13101c).a().f13291e : super.l();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public String q(Context context, p0 p0Var, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.q(context, p0Var, z));
        sb.append(context.getString(R.string.telephony_label_tac));
        sb.append(" ");
        sb.append(((com.parizene.netmonitor.m0.b0.o) this.f13101c).a().f13289c);
        sb.append(" ");
        sb.append(context.getString(R.string.label_nci));
        sb.append(" ");
        sb.append(((com.parizene.netmonitor.m0.b0.o) this.f13101c).a().f13290d);
        if (((com.parizene.netmonitor.m0.b0.o) this.f13101c).a().c()) {
            sb.append(" ");
            sb.append(context.getString(R.string.telephony_label_pci));
            sb.append(" ");
            sb.append(((com.parizene.netmonitor.m0.b0.o) this.f13101c).a().f13291e);
        }
        return sb.toString();
    }
}