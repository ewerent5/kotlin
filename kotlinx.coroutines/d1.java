package kotlinx.coroutines;

import i.v.g;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* compiled from: Executors.kt */
/* loaded from: classes3.dex */
public abstract class d1 extends d0 implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final a f16938f = new a(null);

    /* compiled from: Executors.kt */
    public static final class a extends i.v.b<d0, d1> {

        /* compiled from: Executors.kt */
        /* renamed from: kotlinx.coroutines.d1$a$a, reason: collision with other inner class name */
        static final class C0224a extends i.y.d.m implements i.y.c.l<g.b, d1> {

            /* renamed from: e, reason: collision with root package name */
            public static final C0224a f16939e = new C0224a();

            C0224a() {
                super(1);
            }

            @Override // i.y.c.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d1 invoke(g.b bVar) {
                if (!(bVar instanceof d1)) {
                    bVar = null;
                }
                return (d1) bVar;
            }
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }

        private a() {
            super(d0.f16936e, C0224a.f16939e);
        }
    }

    public abstract Executor b0();
}