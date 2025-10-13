package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* compiled from: Exceptions.kt */
/* loaded from: classes3.dex */
public final class p1 extends CancellationException implements b0<p1> {

    /* renamed from: e, reason: collision with root package name */
    public final o1 f17030e;

    public p1(String str, Throwable th, o1 o1Var) {
        super(str);
        this.f17030e = o1Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // kotlinx.coroutines.b0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public p1 a() {
        if (!m0.c()) {
            return null;
        }
        String message = getMessage();
        i.y.d.l.b(message);
        return new p1(message, this, this.f17030e);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof p1) {
                p1 p1Var = (p1) obj;
                if (!i.y.d.l.a(p1Var.getMessage(), getMessage()) || !i.y.d.l.a(p1Var.f17030e, this.f17030e) || !i.y.d.l.a(p1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (m0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        i.y.d.l.b(message);
        int iHashCode = ((message.hashCode() * 31) + this.f17030e.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f17030e;
    }
}