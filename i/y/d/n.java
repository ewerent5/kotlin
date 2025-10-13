package i.y.d;

import i.b0.g;
import i.b0.i;

/* compiled from: MutablePropertyReference0.java */
/* loaded from: classes3.dex */
public abstract class n extends p implements i.b0.g {
    public n() {
    }

    @Override // i.y.d.c
    protected i.b0.b computeReflected() {
        return v.d(this);
    }

    @Override // i.b0.i
    public Object getDelegate() {
        return ((i.b0.g) getReflected()).getDelegate();
    }

    @Override // i.y.c.a
    public Object invoke() {
        return get();
    }

    public n(Object obj) {
        super(obj);
    }

    @Override // i.b0.i
    public i.a getGetter() {
        return ((i.b0.g) getReflected()).getGetter();
    }

    @Override // i.b0.g
    public g.a getSetter() {
        return ((i.b0.g) getReflected()).getSetter();
    }

    public n(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}