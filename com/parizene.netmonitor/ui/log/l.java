package com.parizene.netmonitor.ui.log;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.k0.b;
import com.parizene.netmonitor.k0.d;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.o1;

/* compiled from: LogItemsViewModel.kt */
/* loaded from: classes3.dex */
public final class l extends x {

    /* renamed from: c */
    private final j f13904c;

    /* renamed from: d */
    private final com.parizene.netmonitor.k0.e f13905d;

    /* renamed from: e */
    private final androidx.lifecycle.q<List<g>> f13906e;

    /* renamed from: f */
    private o1 f13907f;

    /* renamed from: g */
    private int f13908g;

    /* compiled from: LogItemsViewModel.kt */
    @i.v.j.a.f(c = "com.parizene.netmonitor.ui.log.LogItemsViewModel$handleDeleteCell$1", f = "LogItemsViewModel.kt", l = {64}, m = "invokeSuspend")
    static final class a extends i.v.j.a.k implements i.y.c.p<i0, i.v.d<? super i.s>, Object> {

        /* renamed from: i */
        int f13909i;

        /* renamed from: k */
        final /* synthetic */ g f13911k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, i.v.d<? super a> dVar) {
            super(2, dVar);
            this.f13911k = gVar;
        }

        @Override // i.v.j.a.a
        public final i.v.d<i.s> g(Object obj, i.v.d<?> dVar) {
            return l.this.new a(this.f13911k, dVar);
        }

        @Override // i.v.j.a.a
        public final Object p(Object obj) throws Throwable {
            Object objC = i.v.i.d.c();
            int i2 = this.f13909i;
            if (i2 == 0) {
                i.n.b(obj);
                j jVar = l.this.f13904c;
                g gVar = this.f13911k;
                this.f13909i = 1;
                if (jVar.b(gVar, this) == objC) {
                    return objC;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i.n.b(obj);
            }
            return i.s.a;
        }

        @Override // i.y.c.p
        /* renamed from: s */
        public final Object i(i0 i0Var, i.v.d<? super i.s> dVar) {
            return ((a) g(i0Var, dVar)).p(i.s.a);
        }
    }

    /* compiled from: LogItemsViewModel.kt */
    @i.v.j.a.f(c = "com.parizene.netmonitor.ui.log.LogItemsViewModel$handleUpdateLogItemInfo$1", f = "LogItemsViewModel.kt", l = {CoreConstants.OOS_RESET_FREQUENCY}, m = "invokeSuspend")
    static final class b extends i.v.j.a.k implements i.y.c.p<i0, i.v.d<? super i.s>, Object> {

        /* renamed from: i */
        int f13912i;

        /* renamed from: k */
        final /* synthetic */ g f13914k;

        /* renamed from: l */
        final /* synthetic */ String f13915l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, String str, i.v.d<? super b> dVar) {
            super(2, dVar);
            this.f13914k = gVar;
            this.f13915l = str;
        }

        @Override // i.v.j.a.a
        public final i.v.d<i.s> g(Object obj, i.v.d<?> dVar) {
            return l.this.new b(this.f13914k, this.f13915l, dVar);
        }

        @Override // i.v.j.a.a
        public final Object p(Object obj) throws Throwable {
            Object objC = i.v.i.d.c();
            int i2 = this.f13912i;
            if (i2 == 0) {
                i.n.b(obj);
                j jVar = l.this.f13904c;
                g gVar = this.f13914k;
                String str = this.f13915l;
                this.f13912i = 1;
                if (jVar.e(gVar, str, this) == objC) {
                    return objC;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i.n.b(obj);
            }
            return i.s.a;
        }

        @Override // i.y.c.p
        /* renamed from: s */
        public final Object i(i0 i0Var, i.v.d<? super i.s> dVar) {
            return ((b) g(i0Var, dVar)).p(i.s.a);
        }
    }

    /* compiled from: LogItemsViewModel.kt */
    @i.v.j.a.f(c = "com.parizene.netmonitor.ui.log.LogItemsViewModel$loadLogItems$1", f = "LogItemsViewModel.kt", l = {81}, m = "invokeSuspend")
    static final class c extends i.v.j.a.k implements i.y.c.p<i0, i.v.d<? super i.s>, Object> {

        /* renamed from: i */
        int f13916i;

        c(i.v.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // i.v.j.a.a
        public final i.v.d<i.s> g(Object obj, i.v.d<?> dVar) {
            return l.this.new c(dVar);
        }

        @Override // i.v.j.a.a
        public final Object p(Object obj) throws Throwable {
            Object objC = i.v.i.d.c();
            int i2 = this.f13916i;
            if (i2 == 0) {
                i.n.b(obj);
                l lVar = l.this;
                this.f13916i = 1;
                if (lVar.q(this) == objC) {
                    return objC;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i.n.b(obj);
            }
            return i.s.a;
        }

        @Override // i.y.c.p
        /* renamed from: s */
        public final Object i(i0 i0Var, i.v.d<? super i.s> dVar) {
            return ((c) g(i0Var, dVar)).p(i.s.a);
        }
    }

    /* compiled from: Collect.kt */
    public static final class d implements kotlinx.coroutines.r2.d<List<? extends g>> {
        public d() {
        }

        @Override // kotlinx.coroutines.r2.d
        public Object b(List<? extends g> list, i.v.d dVar) {
            l.this.f13906e.l(list);
            return i.s.a;
        }
    }

    public l(j jVar, com.parizene.netmonitor.k0.e eVar, v vVar) {
        i.y.d.l.d(jVar, "logItemsRepository");
        i.y.d.l.d(eVar, "analyticsTracker");
        i.y.d.l.d(vVar, "state");
        this.f13904c = jVar;
        this.f13905d = eVar;
        this.f13906e = new androidx.lifecycle.q<>();
        p();
    }

    private final void p() {
        o1 o1Var = this.f13907f;
        if (o1Var != null) {
            o1.a.a(o1Var, null, 1, null);
        }
        this.f13907f = kotlinx.coroutines.h.b(y.a(this), null, null, new c(null), 3, null);
    }

    public final Object q(i.v.d<? super i.s> dVar) {
        String str;
        String str2;
        String strG = com.parizene.netmonitor.t0.f.w.g();
        if (TextUtils.isEmpty(strG)) {
            str = null;
            str2 = null;
        } else {
            i.y.d.l.c(strG, "operatorsFilter");
            Object[] array = i.d0.q.n0(strG, new String[]{";"}, false, 0, 6, null).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            String str3 = strArr[0];
            str2 = strArr[1];
            str = str3;
        }
        String strG2 = com.parizene.netmonitor.t0.f.I.g();
        Boolean boolG = com.parizene.netmonitor.t0.f.f13728m.g();
        Boolean boolG2 = com.parizene.netmonitor.t0.f.n.g();
        Integer numG = com.parizene.netmonitor.t0.f.v.g();
        int i2 = (this.f13908g + 1) * 50;
        j jVar = this.f13904c;
        i.y.d.l.c(boolG, "searchWithoutLac");
        boolean zBooleanValue = boolG.booleanValue();
        i.y.d.l.c(boolG2, "markSearchWithoutLac");
        boolean zBooleanValue2 = boolG2.booleanValue();
        i.y.d.l.c(numG, "orderBy");
        Object objA = jVar.c(str, str2, strG2, zBooleanValue, zBooleanValue2, numG.intValue(), i2).a(new d(), dVar);
        return objA == i.v.i.d.c() ? objA : i.s.a;
    }

    private final void r() {
        this.f13908g = 0;
    }

    public final LiveData<List<g>> i() {
        return this.f13906e;
    }

    public final void j(g gVar) {
        i.y.d.l.d(gVar, "logItem");
        kotlinx.coroutines.h.b(y.a(this), null, null, new a(gVar, null), 3, null);
    }

    public final void k(int i2) {
        if (this.f13908g != i2) {
            this.f13908g = i2;
            p();
        }
    }

    public final void l(int i2) {
        com.parizene.netmonitor.t0.f.v.f(Integer.valueOf(i2));
        this.f13905d.a(d.C0159d.d(b.e.a(i2)));
        r();
        p();
    }

    public final void m(String str) {
        com.parizene.netmonitor.t0.f.w.f(str);
        r();
        p();
    }

    public final void n(String str) {
        if (str == null || TextUtils.isDigitsOnly(str)) {
            com.parizene.netmonitor.t0.f.I.f(str);
            r();
            p();
        }
    }

    public final void o(g gVar, String str) {
        i.y.d.l.d(gVar, "logItem");
        kotlinx.coroutines.h.b(y.a(this), null, null, new b(gVar, str, null), 3, null);
    }
}