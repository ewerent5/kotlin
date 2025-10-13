package com.parizene.netmonitor.m0;

import android.os.Handler;
import android.util.SparseArray;
import com.parizene.netmonitor.s0.b;
import java.util.concurrent.TimeUnit;

/* compiled from: CellHelper.java */
/* loaded from: classes.dex */
public abstract class e extends com.parizene.netmonitor.s0.b<f> {

    /* renamed from: e */
    private static final long f13484e = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: f */
    protected com.parizene.netmonitor.m0.d0.d f13485f;

    /* renamed from: g */
    protected com.parizene.netmonitor.m0.d0.e f13486g;

    /* renamed from: h */
    protected SparseArray<com.parizene.netmonitor.m0.b0.b> f13487h;

    /* renamed from: i */
    protected d f13488i;

    /* renamed from: j */
    protected com.parizene.netmonitor.m0.d0.a f13489j;

    /* renamed from: k */
    protected i f13490k;

    /* renamed from: l */
    protected n f13491l;

    /* renamed from: m */
    protected u f13492m;
    protected r n;
    private Runnable o;

    /* compiled from: CellHelper.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.s(e.this.f13492m.a());
            ((com.parizene.netmonitor.s0.b) e.this).a.postDelayed(this, e.f13484e);
        }
    }

    e(Handler handler, Handler handler2, com.parizene.netmonitor.m0.d0.d dVar, com.parizene.netmonitor.m0.d0.e eVar, com.parizene.netmonitor.m0.d0.a aVar, i iVar, n nVar, u uVar, r rVar) {
        super(handler, handler2);
        this.o = new a();
        this.f13485f = dVar;
        this.f13486g = eVar;
        this.f13489j = aVar;
        this.f13490k = iVar;
        this.f13491l = nVar;
        this.f13492m = uVar;
        this.n = rVar;
        this.f13487h = new SparseArray<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int o(com.parizene.netmonitor.m0.b0.b r5, com.parizene.netmonitor.m0.b0.b r6) {
        /*
            if (r5 != 0) goto L5
            r5 = 15
            return r5
        L5:
            r0 = 0
            com.parizene.netmonitor.m0.b0.y r1 = r6.c()
            com.parizene.netmonitor.m0.b0.y r2 = r5.c()
            boolean r1 = com.parizene.netmonitor.j0.c(r1, r2)
            if (r1 != 0) goto L15
            r0 = 1
        L15:
            com.parizene.netmonitor.m0.b0.k r1 = r6.a()
            com.parizene.netmonitor.m0.b0.k r2 = r5.a()
            if (r1 != 0) goto L21
            if (r2 != 0) goto L25
        L21:
            if (r1 == 0) goto L2a
            if (r2 != 0) goto L2a
        L25:
            r0 = r0 | 2
        L27:
            r0 = r0 | 4
            goto L45
        L2a:
            if (r1 == 0) goto L45
            if (r2 == 0) goto L45
            com.parizene.netmonitor.m0.b0.d r3 = r1.f13303b
            com.parizene.netmonitor.m0.b0.d r4 = r2.f13303b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L3a
            r0 = r0 | 2
        L3a:
            com.parizene.netmonitor.m0.b0.r r1 = r1.f13304c
            com.parizene.netmonitor.m0.b0.r r2 = r2.f13304c
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L45
            goto L27
        L45:
            java.util.List r6 = r6.b()
            java.util.List r5 = r5.b()
            boolean r5 = com.parizene.netmonitor.j0.c(r6, r5)
            if (r5 != 0) goto L55
            r0 = r0 | 8
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.parizene.netmonitor.m0.e.o(com.parizene.netmonitor.m0.b0.b, com.parizene.netmonitor.m0.b0.b):int");
    }

    /* renamed from: p */
    public /* synthetic */ void q(int i2, SparseArray sparseArray, f fVar) {
        fVar.F(n(), i2, sparseArray);
    }

    @Override // com.parizene.netmonitor.s0.b
    protected void g() {
        this.a.removeCallbacks(this.o);
        this.a.post(this.o);
        this.n.a();
    }

    @Override // com.parizene.netmonitor.s0.b
    protected void h() {
        this.n.f();
        this.a.removeCallbacks(this.o);
    }

    protected abstract com.parizene.netmonitor.m0.b0.a n();

    protected void r(final int i2, final SparseArray<c.h.k.d<Integer, com.parizene.netmonitor.m0.b0.b>> sparseArray) {
        e(new b.a() { // from class: com.parizene.netmonitor.m0.a
            @Override // com.parizene.netmonitor.s0.b.a
            public final void a(Object obj) {
                this.a.q(i2, sparseArray, (f) obj);
            }
        });
    }

    protected abstract void s(t tVar);

    public void t(d dVar) {
        this.f13488i = dVar;
    }

    protected void u(int i2, c.e.h<com.parizene.netmonitor.m0.b0.b> hVar) {
        SparseArray<c.h.k.d<Integer, com.parizene.netmonitor.m0.b0.b>> sparseArray = new SparseArray<>(hVar.n());
        boolean z = false;
        for (int i3 = 0; i3 < hVar.n(); i3++) {
            int iJ = hVar.j(i3);
            com.parizene.netmonitor.m0.b0.b bVarO = hVar.o(i3);
            int iO = o(this.f13487h.get(iJ), bVarO);
            this.f13487h.put(iJ, bVarO);
            sparseArray.put(iJ, new c.h.k.d<>(Integer.valueOf(iO), bVarO));
            if (iO != 0) {
                z = true;
            }
        }
        if (z) {
            r(i2, sparseArray);
        }
    }
}