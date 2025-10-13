package e.c.d;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement.java */
/* loaded from: classes.dex */
public abstract class l {
    public i a() {
        if (h()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public o c() {
        if (l()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public q e() {
        if (m()) {
            return (q) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean h() {
        return this instanceof i;
    }

    public boolean k() {
        return this instanceof n;
    }

    public boolean l() {
        return this instanceof o;
    }

    public boolean m() {
        return this instanceof q;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            e.c.d.a0.c cVar = new e.c.d.a0.c(stringWriter);
            cVar.W(true);
            e.c.d.y.l.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}