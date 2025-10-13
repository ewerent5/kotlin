package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jq {
    private final com.google.android.gms.common.util.f a;

    /* renamed from: b, reason: collision with root package name */
    private final sq f6801b;

    /* renamed from: e, reason: collision with root package name */
    private final String f6804e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6805f;

    /* renamed from: d, reason: collision with root package name */
    private final Object f6803d = new Object();

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("lock")
    private long f6806g = -1;

    /* renamed from: h, reason: collision with root package name */
    @GuardedBy("lock")
    private long f6807h = -1;

    /* renamed from: i, reason: collision with root package name */
    @GuardedBy("lock")
    private long f6808i = 0;

    /* renamed from: j, reason: collision with root package name */
    @GuardedBy("lock")
    private long f6809j = -1;

    /* renamed from: k, reason: collision with root package name */
    @GuardedBy("lock")
    private long f6810k = -1;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("lock")
    private final LinkedList<iq> f6802c = new LinkedList<>();

    jq(com.google.android.gms.common.util.f fVar, sq sqVar, String str, String str2) {
        this.a = fVar;
        this.f6801b = sqVar;
        this.f6804e = str;
        this.f6805f = str2;
    }

    public final void a(m93 m93Var) {
        synchronized (this.f6803d) {
            long jC = this.a.c();
            this.f6809j = jC;
            this.f6801b.e(m93Var, jC);
        }
    }

    public final void b() {
        synchronized (this.f6803d) {
            this.f6801b.f();
        }
    }

    public final void c(long j2) {
        synchronized (this.f6803d) {
            this.f6810k = j2;
            if (j2 != -1) {
                this.f6801b.a(this);
            }
        }
    }

    public final void d() {
        synchronized (this.f6803d) {
            if (this.f6810k != -1 && this.f6806g == -1) {
                this.f6806g = this.a.c();
                this.f6801b.a(this);
            }
            this.f6801b.d();
        }
    }

    public final void e() {
        synchronized (this.f6803d) {
            if (this.f6810k != -1) {
                iq iqVar = new iq(this);
                iqVar.c();
                this.f6802c.add(iqVar);
                this.f6808i++;
                this.f6801b.c();
                this.f6801b.a(this);
            }
        }
    }

    public final void f() {
        synchronized (this.f6803d) {
            if (this.f6810k != -1 && !this.f6802c.isEmpty()) {
                iq last = this.f6802c.getLast();
                if (last.a() == -1) {
                    last.b();
                    this.f6801b.a(this);
                }
            }
        }
    }

    public final void g(boolean z) {
        synchronized (this.f6803d) {
            if (this.f6810k != -1) {
                this.f6807h = this.a.c();
            }
        }
    }

    public final Bundle h() {
        Bundle bundle;
        synchronized (this.f6803d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f6804e);
            bundle.putString("slotid", this.f6805f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.f6809j);
            bundle.putLong("tresponse", this.f6810k);
            bundle.putLong("timp", this.f6806g);
            bundle.putLong("tload", this.f6807h);
            bundle.putLong("pcc", this.f6808i);
            bundle.putLong("tfetch", -1L);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<iq> it = this.f6802c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().d());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String i() {
        return this.f6804e;
    }
}