package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class iz extends th1 {
    private final bj1 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Integer> f6638b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<qh1> f6639c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<String> f6640d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<zh1> f6641e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<gi1> f6642f;

    /* renamed from: g, reason: collision with root package name */
    private final wo2<ki1> f6643g;

    /* renamed from: h, reason: collision with root package name */
    private final wo2<ri1> f6644h;

    /* renamed from: i, reason: collision with root package name */
    private final wo2<yi1> f6645i;

    /* renamed from: j, reason: collision with root package name */
    private final wo2<lj1> f6646j;

    /* renamed from: k, reason: collision with root package name */
    private final wo2<String> f6647k;

    /* renamed from: l, reason: collision with root package name */
    private final wo2<vt0> f6648l;

    /* renamed from: m, reason: collision with root package name */
    private final wo2<vt0> f6649m;
    private final wo2<vt0> n;
    private final wo2<vt0> o;
    private final wo2<Map<lt1, vt0>> p;
    private final wo2<Set<nh0<tt1>>> q;
    private final wo2<Set<nh0<tt1>>> r;
    private final wo2 s;
    private final wo2<st1> t;
    final /* synthetic */ p00 u;

    /* synthetic */ iz(p00 p00Var, bj1 bj1Var, dz dzVar) {
        this.u = p00Var;
        this.a = bj1Var;
        ej1 ej1Var = new ej1(bj1Var);
        this.f6638b = ej1Var;
        this.f6639c = new sh1(n10.a, p00Var.f8052g, p00Var.f8058m, ns1.a(), ej1Var);
        cj1 cj1Var = new cj1(bj1Var);
        this.f6640d = cj1Var;
        this.f6641e = new bi1(sy.a, p00Var.f8052g, cj1Var, ns1.a());
        this.f6642f = new ii1(n10.a, ej1Var, p00Var.f8052g, p00Var.X, p00Var.f8058m, ns1.a());
        this.f6643g = new mi1(h10.a, ns1.a(), p00Var.f8052g);
        this.f6644h = new ti1(j10.a, ns1.a(), cj1Var);
        this.f6645i = new aj1(l10.a, p00Var.f8058m, p00Var.f8052g);
        this.f6646j = new nj1(ns1.a());
        fj1 fj1Var = new fj1(bj1Var);
        this.f6647k = fj1Var;
        wo2<vt0> wo2VarA = lo2.a(ot0.a());
        this.f6648l = wo2VarA;
        wo2<vt0> wo2VarA2 = lo2.a(mt0.a());
        this.f6649m = wo2VarA2;
        wo2<vt0> wo2VarA3 = lo2.a(qt0.a());
        this.n = wo2VarA3;
        wo2<vt0> wo2VarA4 = lo2.a(st0.a());
        this.o = wo2VarA4;
        po2 po2VarB = qo2.b(4);
        po2VarB.a(lt1.GMS_SIGNALS, wo2VarA);
        po2VarB.a(lt1.BUILD_URL, wo2VarA2);
        po2VarB.a(lt1.HTTP, wo2VarA3);
        po2VarB.a(lt1.PRE_PROCESS, wo2VarA4);
        qo2 qo2VarB = po2VarB.b();
        this.p = qo2VarB;
        wo2<Set<nh0<tt1>>> wo2VarA5 = lo2.a(new tt0(fj1Var, p00Var.f8052g, ns1.a(), qo2VarB));
        this.q = wo2VarA5;
        to2 to2VarA = uo2.a(0, 1);
        to2VarA.b(wo2VarA5);
        uo2 uo2VarC = to2VarA.c();
        this.r = uo2VarC;
        vt1 vt1Var = new vt1(uo2VarC);
        this.s = vt1Var;
        this.t = lo2.a(new ut1(ns1.a(), p00Var.f8058m, vt1Var));
    }

    private final vi1 d() {
        i3 i3Var = new i3();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        List<String> listD = this.a.d();
        ro2.b(listD);
        return new vi1(i3Var, h52Var, listD, null);
    }

    private final wh1 e() {
        hq hqVar = new hq();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        String strB = this.a.b();
        ro2.b(strB);
        return new wh1(hqVar, h52Var, strB, this.a.c(), this.a.f(), null);
    }

    @Override // com.google.android.gms.internal.ads.th1
    public final eh1<JSONObject> a() {
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        fq fqVar = new fq();
        ro2.b(h52Var);
        String strA = this.a.a();
        ro2.b(strA);
        sf1 sf1Var = new sf1(new ri1(fqVar, h52Var, strA, null), 0L, (ScheduledExecutorService) this.u.f8058m.zzb());
        zj zjVar = new zj();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.u.f8058m.zzb();
        Context contextA = this.u.f8047b.a();
        ro2.b(contextA);
        sf1 sf1Var2 = new sf1(new yi1(zjVar, scheduledExecutorService, contextA, null), ((Long) c.c().b(w3.n2)).longValue(), (ScheduledExecutorService) this.u.f8058m.zzb());
        hq hqVar = new hq();
        Context contextA2 = this.u.f8047b.a();
        ro2.b(contextA2);
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.u.f8058m.zzb();
        ro2.b(h52Var);
        sf1 sf1Var3 = new sf1(new qh1(hqVar, contextA2, scheduledExecutorService2, h52Var, this.a.f(), null), 0L, (ScheduledExecutorService) this.u.f8058m.zzb());
        ro2.b(h52Var);
        sf1 sf1Var4 = new sf1(new lj1(h52Var), 0L, (ScheduledExecutorService) this.u.f8058m.zzb());
        ah1<? extends zg1<JSONObject>> ah1VarA = ij1.a();
        Context contextA3 = this.u.f8047b.a();
        ro2.b(contextA3);
        String strA2 = this.a.a();
        ro2.b(strA2);
        ro2.b(h52Var);
        zh1 zh1Var = new zh1(null, contextA3, strA2, h52Var);
        k43 k43Var = new k43();
        ro2.b(h52Var);
        Context contextA4 = this.u.f8047b.a();
        ro2.b(contextA4);
        hq hqVar2 = new hq();
        int iF = this.a.f();
        Context contextA5 = this.u.f8047b.a();
        ro2.b(contextA5);
        oq oqVar = (oq) this.u.X.zzb();
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.u.f8058m.zzb();
        ro2.b(h52Var);
        return new eh1<>(h52Var, f22.n(sf1Var, sf1Var2, sf1Var3, sf1Var4, ah1VarA, zh1Var, new ki1(k43Var, h52Var, contextA4, null), d(), e(), new gi1(hqVar2, iF, contextA5, oqVar, scheduledExecutorService3, h52Var, null), (ah1) this.u.v0.zzb()));
    }

    @Override // com.google.android.gms.internal.ads.th1
    public final eh1<JSONObject> b() {
        fq fqVar = new fq();
        Object objZzb = this.u.v0.zzb();
        wh1 wh1VarE = e();
        vi1 vi1VarD = d();
        go2 go2VarB = lo2.b(this.f6639c);
        go2 go2VarB2 = lo2.b(this.f6641e);
        go2 go2VarB3 = lo2.b(this.f6642f);
        go2 go2VarB4 = lo2.b(this.f6643g);
        go2 go2VarB5 = lo2.b(this.f6644h);
        go2 go2VarB6 = lo2.b(this.f6645i);
        go2 go2VarB7 = lo2.b(this.f6646j);
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return jj1.a(fqVar, objZzb, wh1VarE, vi1VarD, go2VarB, go2VarB2, go2VarB3, go2VarB4, go2VarB5, go2VarB6, go2VarB7, h52Var, (ScheduledExecutorService) this.u.f8058m.zzb());
    }

    @Override // com.google.android.gms.internal.ads.th1
    public final st1 c() {
        return this.t.zzb();
    }
}