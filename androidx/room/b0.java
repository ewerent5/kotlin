package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.room.q0;
import c.r.a.c;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: DatabaseConfiguration.java */
/* loaded from: classes.dex */
public class b0 {
    public final c.InterfaceC0068c a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1797b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1798c;

    /* renamed from: d, reason: collision with root package name */
    public final q0.d f1799d;

    /* renamed from: e, reason: collision with root package name */
    public final List<q0.b> f1800e;

    /* renamed from: f, reason: collision with root package name */
    public final q0.e f1801f;

    /* renamed from: g, reason: collision with root package name */
    public final List<Object> f1802g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1803h;

    /* renamed from: i, reason: collision with root package name */
    public final q0.c f1804i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f1805j;

    /* renamed from: k, reason: collision with root package name */
    public final Executor f1806k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1807l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1808m;
    public final boolean n;
    private final Set<Integer> o;
    public final String p;
    public final File q;
    public final Callable<InputStream> r;

    @SuppressLint({"LambdaLast"})
    public b0(Context context, String str, c.InterfaceC0068c interfaceC0068c, q0.d dVar, List<q0.b> list, boolean z, q0.c cVar, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file, Callable<InputStream> callable, q0.e eVar, List<Object> list2) {
        this.a = interfaceC0068c;
        this.f1797b = context;
        this.f1798c = str;
        this.f1799d = dVar;
        this.f1800e = list;
        this.f1803h = z;
        this.f1804i = cVar;
        this.f1805j = executor;
        this.f1806k = executor2;
        this.f1807l = z2;
        this.f1808m = z3;
        this.n = z4;
        this.o = set;
        this.p = str2;
        this.q = file;
        this.r = callable;
        this.f1802g = list2 == null ? Collections.emptyList() : list2;
    }

    public boolean a(int i2, int i3) {
        Set<Integer> set;
        return !((i2 > i3) && this.n) && this.f1808m && ((set = this.o) == null || !set.contains(Integer.valueOf(i2)));
    }
}