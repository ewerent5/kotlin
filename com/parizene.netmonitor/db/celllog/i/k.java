package com.parizene.netmonitor.db.celllog.i;

import android.content.Context;
import android.text.TextUtils;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.m0.b0.y;
import com.parizene.netmonitor.ui.p0;

/* compiled from: GsmCellEntityItem.java */
/* loaded from: classes.dex */
public class k extends c<com.parizene.netmonitor.m0.b0.m> {
    public k(y yVar, com.parizene.netmonitor.m0.b0.m mVar, boolean z) {
        super(yVar.d(), yVar.f(), mVar, z);
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public boolean a() {
        return super.a() && !TextUtils.isEmpty(this.f13100b) && ((com.parizene.netmonitor.m0.b0.m) this.f13101c).a().d() && ((com.parizene.netmonitor.m0.b0.m) this.f13101c).a().c();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public boolean b() {
        return super.b() && ((com.parizene.netmonitor.m0.b0.m) this.f13101c).a().c();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int e() {
        return ((com.parizene.netmonitor.m0.b0.m) this.f13101c).a().a() ? ((com.parizene.netmonitor.m0.b0.m) this.f13101c).a().f13280e : super.e();
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public long f() {
        return ((com.parizene.netmonitor.m0.b0.m) this.f13101c).a().f13279d;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int h() {
        return ((com.parizene.netmonitor.m0.b0.m) this.f13101c).a().f13278c;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public int k() {
        return 3;
    }

    @Override // com.parizene.netmonitor.db.celllog.i.c
    public String q(Context context, p0 p0Var, boolean z) {
        return super.q(context, p0Var, z) + context.getString(R.string.telephony_label_lac) + " " + ((com.parizene.netmonitor.m0.b0.m) this.f13101c).a().f13278c + " " + context.getString(R.string.telephony_label_cid) + " " + p0.b(((com.parizene.netmonitor.m0.b0.m) this.f13101c).a().f13279d, p0Var);
    }
}