package e.c.b.b.c.e;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class x8 implements u8 {
    x8() {
    }

    @Override // e.c.b.b.c.e.u8
    public final Object a(Object obj) {
        ((v8) obj).f();
        return obj;
    }

    @Override // e.c.b.b.c.e.u8
    public final boolean b(Object obj) {
        return !((v8) obj).g();
    }

    @Override // e.c.b.b.c.e.u8
    public final Object c(Object obj) {
        return v8.b().e();
    }

    @Override // e.c.b.b.c.e.u8
    public final Object d(Object obj, Object obj2) {
        v8 v8VarE = (v8) obj;
        v8 v8Var = (v8) obj2;
        if (!v8Var.isEmpty()) {
            if (!v8VarE.g()) {
                v8VarE = v8VarE.e();
            }
            v8VarE.d(v8Var);
        }
        return v8VarE;
    }

    @Override // e.c.b.b.c.e.u8
    public final s8<?, ?> e(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // e.c.b.b.c.e.u8
    public final int f(int i2, Object obj, Object obj2) {
        v8 v8Var = (v8) obj;
        if (v8Var.isEmpty()) {
            return 0;
        }
        Iterator it = v8Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // e.c.b.b.c.e.u8
    public final Map<?, ?> zza(Object obj) {
        return (v8) obj;
    }

    @Override // e.c.b.b.c.e.u8
    public final Map<?, ?> zzb(Object obj) {
        return (v8) obj;
    }
}