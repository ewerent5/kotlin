package com.parizene.netmonitor.m0;

import android.os.Build;
import android.os.Handler;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.parizene.netmonitor.f0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: NewApiCellHelper.java */
/* loaded from: classes.dex */
public class p extends e {
    private final f0 p;
    private final SparseArray<a> q;

    /* compiled from: NewApiCellHelper.java */
    private static class a {
        private final int a;

        /* renamed from: b */
        private final f0 f13508b;

        /* renamed from: c */
        private final com.parizene.netmonitor.m0.d0.e f13509c;

        /* renamed from: d */
        private final TelephonyManager.CellInfoCallback f13510d = new C0161a();

        /* compiled from: NewApiCellHelper.java */
        /* renamed from: com.parizene.netmonitor.m0.p$a$a */
        class C0161a extends TelephonyManager.CellInfoCallback {
            C0161a() {
            }

            @Override // android.telephony.TelephonyManager.CellInfoCallback
            public void onCellInfo(List<CellInfo> list) {
            }
        }

        public a(int i2, f0 f0Var, com.parizene.netmonitor.m0.d0.e eVar) {
            this.a = i2;
            this.f13508b = f0Var;
            this.f13509c = eVar;
        }

        public void a() {
            this.f13509c.l(this.f13508b.a(), this.f13510d, this.a);
        }
    }

    public p(f0 f0Var, Handler handler, Handler handler2, com.parizene.netmonitor.m0.d0.d dVar, com.parizene.netmonitor.m0.d0.e eVar, com.parizene.netmonitor.m0.d0.a aVar, i iVar, n nVar, u uVar, r rVar) {
        super(handler, handler2, dVar, eVar, aVar, iVar, nVar, uVar, rVar);
        this.q = new SparseArray<>();
        this.p = f0Var;
    }

    @Override // com.parizene.netmonitor.m0.e, com.parizene.netmonitor.s0.b
    protected void g() {
        int[] iArrB;
        if (Build.VERSION.SDK_INT >= 29 && (iArrB = this.f13485f.b()) != null) {
            for (int i2 : iArrB) {
                this.q.put(i2, new a(i2, this.p, this.f13486g));
            }
        }
        super.g();
        this.n.e(1281);
    }

    @Override // com.parizene.netmonitor.m0.e, com.parizene.netmonitor.s0.b
    protected void h() {
        this.n.e(0);
        super.h();
        if (Build.VERSION.SDK_INT >= 29) {
            this.q.clear();
        }
    }

    @Override // com.parizene.netmonitor.m0.e
    protected com.parizene.netmonitor.m0.b0.a n() {
        return com.parizene.netmonitor.m0.b0.a.NEW;
    }

    @Override // com.parizene.netmonitor.m0.e
    protected void s(t tVar) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int[] iArr = tVar.f13521c;
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = iArr[i2];
            arrayList.add(this.f13491l.a(i3, this.n.c(i3), this.n.d(i3)));
            i2++;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            for (int i4 = 0; i4 < this.q.size(); i4++) {
                this.q.valueAt(i4).a();
            }
        }
        u(tVar.a, this.f13490k.c(arrayList, this.f13489j.A(this.f13486g.a(Integer.MAX_VALUE)), this.f13488i, this.f13485f.t()));
    }
}