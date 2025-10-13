package i.y.d;

import java.io.Serializable;

/* compiled from: Lambda.kt */
/* loaded from: classes3.dex */
public abstract class m<R> implements h<R>, Serializable {
    private final int arity;

    public m(int i2) {
        this.arity = i2;
    }

    @Override // i.y.d.h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strF = v.f(this);
        l.c(strF, "Reflection.renderLambdaToString(this)");
        return strF;
    }
}