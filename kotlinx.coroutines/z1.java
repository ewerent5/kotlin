package kotlinx.coroutines;

import java.util.Objects;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public final class z1 extends kotlinx.coroutines.internal.k implements j1 {
    @Override // kotlinx.coroutines.j1
    public boolean b() {
        return true;
    }

    @Override // kotlinx.coroutines.j1
    public z1 e() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.m
    public String toString() {
        return m0.c() ? z("Active") : super.toString();
    }

    public final String z(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object objP = p();
        Objects.requireNonNull(objP, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        boolean z = true;
        for (kotlinx.coroutines.internal.m mVarQ = (kotlinx.coroutines.internal.m) objP; !i.y.d.l.a(mVarQ, this); mVarQ = mVarQ.q()) {
            if (mVarQ instanceof u1) {
                u1 u1Var = (u1) mVarQ;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(u1Var);
            }
        }
        sb.append("]");
        String string = sb.toString();
        i.y.d.l.c(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}