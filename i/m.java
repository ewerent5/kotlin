package i;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;

/* compiled from: Result.kt */
/* loaded from: classes3.dex */
public final class m<T> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f15825e = new a(null);

    /* compiled from: Result.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    /* compiled from: Result.kt */
    public static final class b implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        public final Throwable f15826e;

        public b(Throwable th) {
            i.y.d.l.d(th, "exception");
            this.f15826e = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && i.y.d.l.a(this.f15826e, ((b) obj).f15826e);
        }

        public int hashCode() {
            return this.f15826e.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f15826e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public static Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f15826e;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}