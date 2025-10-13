package kotlinx.coroutines.t2;

import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.o0;

/* compiled from: Dispatcher.kt */
/* loaded from: classes3.dex */
public class d extends d1 {

    /* renamed from: g, reason: collision with root package name */
    private a f17129g;

    /* renamed from: h, reason: collision with root package name */
    private final int f17130h;

    /* renamed from: i, reason: collision with root package name */
    private final int f17131i;

    /* renamed from: j, reason: collision with root package name */
    private final long f17132j;

    /* renamed from: k, reason: collision with root package name */
    private final String f17133k;

    public d(int i2, int i3, long j2, String str) {
        this.f17130h = i2;
        this.f17131i = i3;
        this.f17132j = j2;
        this.f17133k = str;
        this.f17129g = h0();
    }

    private final a h0() {
        return new a(this.f17130h, this.f17131i, this.f17132j, this.f17133k);
    }

    @Override // kotlinx.coroutines.d0
    public void Z(i.v.g gVar, Runnable runnable) {
        try {
            a.s(this.f17129g, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            o0.f17024l.Z(gVar, runnable);
        }
    }

    public final void j0(Runnable runnable, j jVar, boolean z) {
        try {
            this.f17129g.q(runnable, jVar, z);
        } catch (RejectedExecutionException unused) {
            o0.f17024l.W0(this.f17129g.i(runnable, jVar));
        }
    }

    public /* synthetic */ d(int i2, int i3, String str, int i4, i.y.d.g gVar) {
        this((i4 & 1) != 0 ? l.f17146c : i2, (i4 & 2) != 0 ? l.f17147d : i3, (i4 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    public d(int i2, int i3, String str) {
        this(i2, i3, l.f17148e, str);
    }
}