package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.internal.zzs;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class dr1 implements cr1 {

    @GuardedBy("this")
    private final ConcurrentHashMap<nr1, br1> a;

    /* renamed from: b */
    private final jr1 f5513b;

    /* renamed from: c */
    private final fr1 f5514c = new fr1();

    public dr1(jr1 jr1Var) {
        this.a = new ConcurrentHashMap<>(jr1Var.f6822j);
        this.f5513b = jr1Var;
    }

    private final void e() {
        Parcelable.Creator<jr1> creator = jr1.CREATOR;
        if (((Boolean) c.c().b(w3.u4)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5513b.f6820h);
            sb.append(" PoolCollection");
            sb.append(this.f5514c.g());
            int i2 = 0;
            for (Map.Entry entry : this.a.entrySet()) {
                i2++;
                sb.append(i2);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((nr1) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i3 = 0; i3 < ((br1) entry.getValue()).c(); i3++) {
                    sb.append("[O]");
                }
                for (int iC = ((br1) entry.getValue()).c(); iC < this.f5513b.f6822j; iC++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((br1) entry.getValue()).g());
                sb.append("\n");
            }
            while (i2 < this.f5513b.f6821i) {
                i2++;
                sb.append(i2);
                sb.append(".\n");
            }
            er.zzd(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final synchronized mr1<?> a(nr1 nr1Var) {
        mr1<?> mr1VarB;
        br1 br1Var = (br1) this.a.get(nr1Var);
        if (br1Var != null) {
            mr1VarB = br1Var.b();
            if (mr1VarB == null) {
                this.f5514c.b();
            }
            bs1 bs1VarH = br1Var.h();
            if (mr1VarB != null) {
                l53 l53VarD = u53.D();
                j53 j53VarD = k53.D();
                j53VarD.q(o53.IN_MEMORY);
                p53 p53VarD = r53.D();
                p53VarD.q(bs1VarH.f5176e);
                p53VarD.r(bs1VarH.f5177f);
                j53VarD.r(p53VarD);
                l53VarD.q(j53VarD);
                mr1VarB.a.d().I(l53VarD.n());
            }
            e();
        } else {
            this.f5514c.a();
            e();
            mr1VarB = null;
        }
        return mr1VarB;
    }

    @Override // com.google.android.gms.internal.ads.cr1
    @Deprecated
    public final nr1 b(m93 m93Var, String str, y93 y93Var) {
        return new or1(m93Var, str, new ul(this.f5513b.f6818f).a().f9733k, this.f5513b.f6824l, y93Var);
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final synchronized boolean c(nr1 nr1Var, mr1<?> mr1Var) {
        boolean zA;
        br1 br1Var = (br1) this.a.get(nr1Var);
        mr1Var.f7533d = zzs.zzj().a();
        if (br1Var == null) {
            jr1 jr1Var = this.f5513b;
            br1Var = new br1(jr1Var.f6822j, jr1Var.f6823k * CoreConstants.MILLIS_IN_ONE_SECOND);
            int size = this.a.size();
            jr1 jr1Var2 = this.f5513b;
            if (size == jr1Var2.f6821i) {
                int i2 = jr1Var2.q;
                int i3 = i2 - 1;
                nr1 nr1Var2 = null;
                if (i2 == 0) {
                    throw null;
                }
                long jD = Long.MAX_VALUE;
                if (i3 == 0) {
                    for (Map.Entry entry : this.a.entrySet()) {
                        if (((br1) entry.getValue()).d() < jD) {
                            jD = ((br1) entry.getValue()).d();
                            nr1Var2 = (nr1) entry.getKey();
                        }
                    }
                    if (nr1Var2 != null) {
                        this.a.remove(nr1Var2);
                    }
                } else if (i3 == 1) {
                    for (Map.Entry entry2 : this.a.entrySet()) {
                        if (((br1) entry2.getValue()).e() < jD) {
                            jD = ((br1) entry2.getValue()).e();
                            nr1Var2 = (nr1) entry2.getKey();
                        }
                    }
                    if (nr1Var2 != null) {
                        this.a.remove(nr1Var2);
                    }
                } else if (i3 == 2) {
                    int iF = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : this.a.entrySet()) {
                        if (((br1) entry3.getValue()).f() < iF) {
                            iF = ((br1) entry3.getValue()).f();
                            nr1Var2 = (nr1) entry3.getKey();
                        }
                    }
                    if (nr1Var2 != null) {
                        this.a.remove(nr1Var2);
                    }
                }
                this.f5514c.d();
            }
            this.a.put(nr1Var, br1Var);
            this.f5514c.c();
        }
        zA = br1Var.a(mr1Var);
        this.f5514c.e();
        er1 er1VarF = this.f5514c.f();
        bs1 bs1VarH = br1Var.h();
        l53 l53VarD = u53.D();
        j53 j53VarD = k53.D();
        j53VarD.q(o53.IN_MEMORY);
        s53 s53VarD = t53.D();
        s53VarD.q(er1VarF.f5689e);
        s53VarD.r(er1VarF.f5690f);
        s53VarD.s(bs1VarH.f5177f);
        j53VarD.s(s53VarD);
        l53VarD.q(j53VarD);
        mr1Var.a.d().D0(l53VarD.n());
        e();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final synchronized boolean d(nr1 nr1Var) {
        br1 br1Var = (br1) this.a.get(nr1Var);
        if (br1Var != null) {
            return br1Var.c() < this.f5513b.f6822j;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.cr1
    public final jr1 zze() {
        return this.f5513b;
    }
}