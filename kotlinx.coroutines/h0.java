package kotlinx.coroutines;

import ch.qos.logback.core.CoreConstants;
import i.v.g;

/* compiled from: CoroutineName.kt */
/* loaded from: classes3.dex */
public final class h0 extends i.v.a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f16946e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private final String f16947f;

    /* compiled from: CoroutineName.kt */
    public static final class a implements g.c<h0> {
        private a() {
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    public final String Z() {
        return this.f16947f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof h0) && i.y.d.l.a(this.f16947f, ((h0) obj).f16947f);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f16947f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "CoroutineName(" + this.f16947f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}