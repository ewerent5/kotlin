package com.parizene.netmonitor.db.celllog.i;

import android.content.Context;
import android.text.TextUtils;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.m0.b0.y;
import com.parizene.netmonitor.ui.p0;

/* compiled from: TdscdmaCellEntityItem.java */
/* loaded from: classes.dex */
public class p extends c<com.parizene.netmonitor.m0.b0.p> {
    public p(y yVar, com.parizene.netmonitor.m0.b0.p pVar, boolean z) {
        super(yVar.d(), yVar.f(), pVar, z);
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public boolean a() {
        return super.a() && !TextUtils.isEmpty(this.f13100b) && ((com.parizene.netmonitor.m0.b0.p) this.f13101c).a().c() && ((com.parizene.netmonitor.m0.b0.p) this.f13101c).a().a();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public boolean b() {
        return super.b() && (((com.parizene.netmonitor.m0.b0.p) this.f13101c).a().a() || ((com.parizene.netmonitor.m0.b0.p) this.f13101c).a().b());
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int e() {
        return ((com.parizene.netmonitor.m0.b0.p) this.f13101c).a().d() ? ((com.parizene.netmonitor.m0.b0.p) this.f13101c).a().f13297f : super.e();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public long f() {
        return ((com.parizene.netmonitor.m0.b0.p) this.f13101c).a().f13295d;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int h() {
        return ((com.parizene.netmonitor.m0.b0.p) this.f13101c).a().f13294c;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int k() {
        return 5;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int l() {
        return ((com.parizene.netmonitor.m0.b0.p) this.f13101c).a().b() ? ((com.parizene.netmonitor.m0.b0.p) this.f13101c).a().f13296e : super.l();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public String q(Context context, p0 p0Var, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.q(context, p0Var, z));
        sb.append(context.getString(R.string.telephony_label_lac));
        sb.append(" ");
        sb.append(((com.parizene.netmonitor.m0.b0.p) this.f13101c).a().f13294c);
        sb.append(" ");
        sb.append(context.getString(R.string.telephony_label_cid));
        sb.append(" ");
        sb.append(((com.parizene.netmonitor.m0.b0.p) this.f13101c).a().f13295d);
        if (((com.parizene.netmonitor.m0.b0.p) this.f13101c).a().b()) {
            sb.append(" ");
            sb.append(context.getString(R.string.label_cpid));
            sb.append(" ");
            sb.append(((com.parizene.netmonitor.m0.b0.p) this.f13101c).a().f13296e);
        }
        return sb.toString();
    }
}