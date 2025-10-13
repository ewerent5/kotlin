package kotlinx.coroutines.r2.i;

import ch.qos.logback.classic.Level;
import i.v.g;
import i.y.c.p;
import i.y.d.m;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.o1;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes3.dex */
public final class f {

    /* compiled from: SafeCollector.common.kt */
    static final class a extends m implements p<Integer, g.b, Integer> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f17095e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(2);
            this.f17095e = dVar;
        }

        public final int a(int i2, g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b bVar2 = this.f17095e.f17093l.get(key);
            if (key != o1.f17025d) {
                return bVar != bVar2 ? Level.ALL_INT : i2 + 1;
            }
            o1 o1Var = (o1) bVar2;
            o1 o1VarB = f.b((o1) bVar, o1Var);
            if (o1VarB == o1Var) {
                return o1Var == null ? i2 : i2 + 1;
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + o1VarB + ", expected child of " + o1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // i.y.c.p
        public /* bridge */ /* synthetic */ Integer i(Integer num, g.b bVar) {
            return Integer.valueOf(a(num.intValue(), bVar));
        }
    }

    public static final void a(d<?> dVar, g gVar) {
        if (((Number) gVar.fold(0, new a(dVar))).intValue() == dVar.f17089h) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + dVar.f17093l + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final o1 b(o1 o1Var, o1 o1Var2) {
        while (o1Var != null) {
            if (o1Var == o1Var2 || !(o1Var instanceof v)) {
                return o1Var;
            }
            o1Var = ((v) o1Var).H0();
        }
        return null;
    }
}