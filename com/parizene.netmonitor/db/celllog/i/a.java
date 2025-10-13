package com.parizene.netmonitor.db.celllog.i;

import android.content.Context;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.m0.b0.y;
import com.parizene.netmonitor.ui.p0;

/* compiled from: CdmaCellEntityItem.java */
/* loaded from: classes.dex */
public class a extends c<com.parizene.netmonitor.m0.b0.l> {
    public a(y yVar, com.parizene.netmonitor.m0.b0.l lVar, boolean z) {
        super(yVar.d(), yVar.f(), lVar, z);
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public boolean a() {
        return super.a() && ((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().f() && ((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().e() && ((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().c();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public boolean b() {
        return super.b() && ((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().f() && ((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().e() && ((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().c();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int c() {
        return ((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().d() ? ((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().f13275e : super.c();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int d() {
        return ((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().d() ? ((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().f13276f : super.d();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public long f() {
        return ((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().f13274d;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int h() {
        return ((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().f13273c;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public String j() {
        return String.format("%05d", Integer.valueOf(((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().f13272b));
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int k() {
        return 4;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public String q(Context context, p0 p0Var, boolean z) {
        return super.q(context, p0Var, z) + context.getString(R.string.telephony_label_sid) + " " + ((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().f13272b + " " + context.getString(R.string.telephony_label_nid) + " " + ((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().f13273c + " " + context.getString(R.string.telephony_label_bid) + " " + ((com.parizene.netmonitor.m0.b0.l) this.f13101c).a().f13274d;
    }
}