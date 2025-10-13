package com.parizene.netmonitor.m0;

import android.os.Handler;
import com.parizene.netmonitor.m0.d0.f.a0;
import java.util.List;

/* compiled from: OldApiCellHelper.java */
/* loaded from: classes.dex */
public class q extends e {
    public q(Handler handler, Handler handler2, com.parizene.netmonitor.m0.d0.d dVar, com.parizene.netmonitor.m0.d0.e eVar, com.parizene.netmonitor.m0.d0.a aVar, i iVar, n nVar, u uVar, r rVar) {
        super(handler, handler2, dVar, eVar, aVar, iVar, nVar, uVar, rVar);
    }

    private com.parizene.netmonitor.m0.d0.f.p v(int i2, int i3) {
        return i3 == i2 ? this.f13489j.p(this.f13486g.b(Integer.MAX_VALUE)) : this.n.b(i3);
    }

    private List<com.parizene.netmonitor.m0.d0.f.y> w(int i2, int i3) {
        if (i3 == i2) {
            return this.f13489j.B(this.f13486g.d(Integer.MAX_VALUE));
        }
        return null;
    }

    private a0 x(int i2) {
        return this.n.d(i2);
    }

    @Override // com.parizene.netmonitor.m0.e, com.parizene.netmonitor.s0.b
    protected void g() {
        super.g();
        this.n.e(273);
    }

    @Override // com.parizene.netmonitor.m0.e, com.parizene.netmonitor.s0.b
    protected void h() {
        this.n.e(0);
        super.h();
    }

    @Override // com.parizene.netmonitor.m0.e
    protected com.parizene.netmonitor.m0.b0.a n() {
        return com.parizene.netmonitor.m0.b0.a.OLD;
    }

    @Override // com.parizene.netmonitor.m0.e
    protected void s(t tVar) {
        c.e.h<com.parizene.netmonitor.m0.b0.b> hVar = new c.e.h<>(tVar.f13521c.length);
        int i2 = 0;
        while (true) {
            int[] iArr = tVar.f13521c;
            if (i2 >= iArr.length) {
                u(tVar.a, hVar);
                return;
            }
            int i3 = iArr[i2];
            com.parizene.netmonitor.m0.b0.y yVarA = this.f13491l.a(i3, this.n.c(i3), null);
            a0 a0VarX = x(i3);
            hVar.k(i3, this.f13490k.e(yVarA, v(tVar.f13520b, i3), a0VarX, w(tVar.f13520b, i3), this.f13488i));
            i2++;
        }
    }
}