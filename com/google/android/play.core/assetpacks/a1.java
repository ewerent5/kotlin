package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
final class a1 {
    private static final e.c.b.d.a.b.f a = new e.c.b.d.a.b.f("ExtractorSessionStoreView");

    /* renamed from: b, reason: collision with root package name */
    private final v f11935b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.d.a.b.e0<s2> f11936c;

    /* renamed from: d, reason: collision with root package name */
    private final o0 f11937d;

    /* renamed from: e, reason: collision with root package name */
    private final e.c.b.d.a.b.e0<Executor> f11938e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Integer, x0> f11939f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final ReentrantLock f11940g = new ReentrantLock();

    a1(v vVar, e.c.b.d.a.b.e0<s2> e0Var, o0 o0Var, e.c.b.d.a.b.e0<Executor> e0Var2) {
        this.f11935b = vVar;
        this.f11936c = e0Var;
        this.f11937d = o0Var;
        this.f11938e = e0Var2;
    }

    private final Map<String, x0> p(final List<String> list) {
        final byte[] bArr = null;
        return (Map) q(new z0(this, list, bArr) { // from class: com.google.android.play.core.assetpacks.t0
            private final a1 a;

            /* renamed from: b, reason: collision with root package name */
            private final List f12145b;

            /* renamed from: c, reason: collision with root package name */
            private final /* synthetic */ int f12146c = 1;

            {
                this.a = this;
                this.f12145b = list;
            }

            @Override // com.google.android.play.core.assetpacks.z0
            public final Object a() {
                return this.f12146c != 0 ? this.a.i(this.f12145b) : this.a.h(this.f12145b);
            }
        });
    }

    private final <T> T q(z0<T> z0Var) {
        try {
            a();
            return z0Var.a();
        } finally {
            b();
        }
    }

    private final x0 r(int i2) {
        Map<Integer, x0> map = this.f11939f;
        Integer numValueOf = Integer.valueOf(i2);
        x0 x0Var = map.get(numValueOf);
        if (x0Var != null) {
            return x0Var;
        }
        throw new k0(String.format("Could not find session %d while trying to get it", numValueOf), i2);
    }

    private static String s(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new k0("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    private static <T> List<T> t(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    final void a() {
        this.f11940g.lock();
    }

    final void b() {
        this.f11940g.unlock();
    }

    final Map<Integer, x0> c() {
        return this.f11939f;
    }

    final boolean d(Bundle bundle) {
        return ((Boolean) q(new q0(this, bundle, null))).booleanValue();
    }

    final boolean e(Bundle bundle) {
        return ((Boolean) q(new q0(this, bundle))).booleanValue();
    }

    final void f(final String str, final int i2, final long j2) {
        q(new z0(this, str, i2, j2) { // from class: com.google.android.play.core.assetpacks.r0
            private final a1 a;

            /* renamed from: b, reason: collision with root package name */
            private final String f12122b;

            /* renamed from: c, reason: collision with root package name */
            private final int f12123c;

            /* renamed from: d, reason: collision with root package name */
            private final long f12124d;

            {
                this.a = this;
                this.f12122b = str;
                this.f12123c = i2;
                this.f12124d = j2;
            }

            @Override // com.google.android.play.core.assetpacks.z0
            public final Object a() {
                this.a.l(this.f12122b, this.f12123c, this.f12124d);
                return null;
            }
        });
    }

    final void g(int i2) {
        q(new s0(this, i2));
    }

    final /* synthetic */ Map h(List list) {
        int i2;
        Map<String, x0> mapP = p(list);
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            final x0 x0Var = mapP.get(str);
            if (x0Var == null) {
                i2 = 8;
            } else {
                if (i1.d(x0Var.f12189c.f12178c)) {
                    try {
                        x0Var.f12189c.f12178c = 6;
                        this.f11938e.a().execute(new Runnable(this, x0Var) { // from class: com.google.android.play.core.assetpacks.u0

                            /* renamed from: e, reason: collision with root package name */
                            private final a1 f12153e;

                            /* renamed from: f, reason: collision with root package name */
                            private final x0 f12154f;

                            {
                                this.f12153e = this;
                                this.f12154f = x0Var;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f12153e.g(this.f12154f.a);
                            }
                        });
                        this.f11937d.a(str);
                    } catch (k0 unused) {
                        a.d("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(x0Var.a), str);
                    }
                }
                i2 = x0Var.f12189c.f12178c;
            }
            map.put(str, Integer.valueOf(i2));
        }
        return map;
    }

    final /* synthetic */ Map i(List list) {
        HashMap map = new HashMap();
        for (x0 x0Var : this.f11939f.values()) {
            String str = x0Var.f12189c.a;
            if (list.contains(str)) {
                x0 x0Var2 = (x0) map.get(str);
                if ((x0Var2 == null ? -1 : x0Var2.a) < x0Var.a) {
                    map.put(str, x0Var);
                }
            }
        }
        return map;
    }

    final /* synthetic */ Boolean j(Bundle bundle) {
        int i2 = bundle.getInt("session_id");
        if (i2 == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, x0> map = this.f11939f;
        Integer numValueOf = Integer.valueOf(i2);
        if (!map.containsKey(numValueOf)) {
            return Boolean.TRUE;
        }
        if (this.f11939f.get(numValueOf).f12189c.f12178c == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!i1.g(r0.f12189c.f12178c, bundle.getInt(e.c.b.d.a.b.i0.a("status", s(bundle)))));
    }

    final /* synthetic */ Boolean k(Bundle bundle) {
        int i2 = bundle.getInt("session_id");
        if (i2 == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, x0> map = this.f11939f;
        Integer numValueOf = Integer.valueOf(i2);
        boolean z = true;
        if (map.containsKey(numValueOf)) {
            x0 x0VarR = r(i2);
            int i3 = bundle.getInt(e.c.b.d.a.b.i0.a("status", x0VarR.f12189c.a));
            if (i1.g(x0VarR.f12189c.f12178c, i3)) {
                a.a("Found stale update for session %s with status %d.", numValueOf, Integer.valueOf(x0VarR.f12189c.f12178c));
                w0 w0Var = x0VarR.f12189c;
                String str = w0Var.a;
                int i4 = w0Var.f12178c;
                if (i4 == 4) {
                    this.f11936c.a().d(i2, str);
                } else if (i4 == 5) {
                    this.f11936c.a().b(i2);
                } else if (i4 == 6) {
                    this.f11936c.a().g(Arrays.asList(str));
                }
            } else {
                x0VarR.f12189c.f12178c = i3;
                if (i1.e(i3)) {
                    g(i2);
                    this.f11937d.a(x0VarR.f12189c.a);
                } else {
                    for (y0 y0Var : x0VarR.f12189c.f12180e) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(e.c.b.d.a.b.i0.b("chunk_intents", x0VarR.f12189c.a, y0Var.a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (parcelableArrayList.get(i5) != null && ((Intent) parcelableArrayList.get(i5)).getData() != null) {
                                    y0Var.f12202d.get(i5).a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String strS = s(bundle);
            long j2 = bundle.getLong(e.c.b.d.a.b.i0.a("pack_version", strS));
            int i6 = bundle.getInt(e.c.b.d.a.b.i0.a("status", strS));
            long j3 = bundle.getLong(e.c.b.d.a.b.i0.a("total_bytes_to_download", strS));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(e.c.b.d.a.b.i0.a("slice_ids", strS));
            ArrayList arrayList = new ArrayList();
            for (String str2 : t(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(e.c.b.d.a.b.i0.b("chunk_intents", strS, str2));
                ArrayList arrayList2 = new ArrayList();
                Iterator it = t(parcelableArrayList2).iterator();
                while (it.hasNext()) {
                    if (((Intent) it.next()) == null) {
                        z = false;
                    }
                    arrayList2.add(new v0(z));
                    z = true;
                }
                String string = bundle.getString(e.c.b.d.a.b.i0.b("uncompressed_hash_sha256", strS, str2));
                long j4 = bundle.getLong(e.c.b.d.a.b.i0.b("uncompressed_size", strS, str2));
                int i7 = bundle.getInt(e.c.b.d.a.b.i0.b("patch_format", strS, str2), 0);
                arrayList.add(i7 != 0 ? new y0(str2, string, j4, arrayList2, 0, i7) : new y0(str2, string, j4, arrayList2, bundle.getInt(e.c.b.d.a.b.i0.b("compression_format", strS, str2), 0), 0));
                z = true;
            }
            this.f11939f.put(Integer.valueOf(i2), new x0(i2, bundle.getInt("app_version_code"), new w0(strS, j2, i6, j3, arrayList)));
        }
        return Boolean.TRUE;
    }

    final /* synthetic */ void l(String str, int i2, long j2) {
        x0 x0Var = p(Arrays.asList(str)).get(str);
        if (x0Var == null || i1.e(x0Var.f12189c.f12178c)) {
            a.b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.f11935b.b(str, i2, j2);
        x0Var.f12189c.f12178c = 4;
    }

    final /* synthetic */ void m(int i2) {
        r(i2).f12189c.f12178c = 5;
    }

    final /* synthetic */ void n(int i2) {
        x0 x0VarR = r(i2);
        if (!i1.e(x0VarR.f12189c.f12178c)) {
            throw new k0(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i2)), i2);
        }
        v vVar = this.f11935b;
        w0 w0Var = x0VarR.f12189c;
        vVar.b(w0Var.a, x0VarR.f12188b, w0Var.f12177b);
        w0 w0Var2 = x0VarR.f12189c;
        int i3 = w0Var2.f12178c;
        if (i3 == 5 || i3 == 6) {
            this.f11935b.c(w0Var2.a, x0VarR.f12188b, w0Var2.f12177b);
        }
    }

    final void o(int i2) {
        q(new s0(this, i2, null));
    }
}