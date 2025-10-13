package i.v.j.a;

import i.y.d.l;
import i.y.d.v;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes3.dex */
public abstract class k extends d implements i.y.d.h<Object> {

    /* renamed from: h, reason: collision with root package name */
    private final int f15874h;

    public k(int i2, i.v.d<Object> dVar) {
        super(dVar);
        this.f15874h = i2;
    }

    @Override // i.y.d.h
    public int getArity() {
        return this.f15874h;
    }

    @Override // i.v.j.a.a
    public String toString() {
        if (o() != null) {
            return super.toString();
        }
        String strE = v.e(this);
        l.c(strE, "Reflection.renderLambdaToString(this)");
        return strE;
    }
}