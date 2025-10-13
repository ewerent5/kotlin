package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;
import com.google.android.gms.ads.internal.zzs;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class l23 {

    /* renamed from: b */
    int f7171b;
    private final Object a = new Object();

    /* renamed from: c */
    private final List<k23> f7172c = new LinkedList();

    public final k23 a(boolean z) {
        synchronized (this.a) {
            k23 k23Var = null;
            if (this.f7172c.size() == 0) {
                er.zzd("Queue empty");
                return null;
            }
            int i2 = 0;
            if (this.f7172c.size() < 2) {
                k23 k23Var2 = this.f7172c.get(0);
                if (z) {
                    this.f7172c.remove(0);
                } else {
                    k23Var2.e();
                }
                return k23Var2;
            }
            int i3 = Level.ALL_INT;
            int i4 = 0;
            for (k23 k23Var3 : this.f7172c) {
                int iM = k23Var3.m();
                if (iM > i3) {
                    i2 = i4;
                }
                int i5 = iM > i3 ? iM : i3;
                if (iM > i3) {
                    k23Var = k23Var3;
                }
                i4++;
                i3 = i5;
            }
            this.f7172c.remove(i2);
            return k23Var;
        }
    }

    public final boolean b(k23 k23Var) {
        synchronized (this.a) {
            return this.f7172c.contains(k23Var);
        }
    }

    public final boolean c(k23 k23Var) {
        synchronized (this.a) {
            Iterator<k23> it = this.f7172c.iterator();
            while (it.hasNext()) {
                k23 next = it.next();
                if (zzs.zzg().l().zzd()) {
                    if (!zzs.zzg().l().zzh() && k23Var != next && next.d().equals(k23Var.d())) {
                        it.remove();
                        return true;
                    }
                } else if (k23Var != next && next.b().equals(k23Var.b())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void d(k23 k23Var) {
        synchronized (this.a) {
            if (this.f7172c.size() >= 10) {
                int size = this.f7172c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                er.zzd(sb.toString());
                this.f7172c.remove(0);
            }
            int i2 = this.f7171b;
            this.f7171b = i2 + 1;
            k23Var.n(i2);
            k23Var.j();
            this.f7172c.add(k23Var);
        }
    }
}