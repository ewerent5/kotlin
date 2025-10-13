package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import i.s;
import i.v.g;
import i.y.d.l;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes3.dex */
public final class a extends b {
    private volatile a _immediate;

    /* renamed from: f, reason: collision with root package name */
    private final a f16928f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f16929g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16930h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f16931i;

    private a(Handler handler, String str, boolean z) {
        super(null);
        this.f16929g = handler;
        this.f16930h = str;
        this.f16931i = z;
        this._immediate = z ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
            s sVar = s.a;
        }
        this.f16928f = aVar;
    }

    @Override // kotlinx.coroutines.d0
    public void Z(g gVar, Runnable runnable) {
        this.f16929g.post(runnable);
    }

    @Override // kotlinx.coroutines.d0
    public boolean a0(g gVar) {
        return !this.f16931i || (l.a(Looper.myLooper(), this.f16929g.getLooper()) ^ true);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f16929g == this.f16929g;
    }

    public int hashCode() {
        return System.identityHashCode(this.f16929g);
    }

    @Override // kotlinx.coroutines.y1
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public a b0() {
        return this.f16928f;
    }

    @Override // kotlinx.coroutines.y1, kotlinx.coroutines.d0
    public String toString() {
        String strH0 = h0();
        if (strH0 != null) {
            return strH0;
        }
        String string = this.f16930h;
        if (string == null) {
            string = this.f16929g.toString();
        }
        if (!this.f16931i) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ a(Handler handler, String str, int i2, i.y.d.g gVar) {
        this(handler, (i2 & 2) != 0 ? null : str);
    }

    public a(Handler handler, String str) {
        this(handler, str, false);
    }
}