package e.c.b.b.c.e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class m8 extends k8 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f14713c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private m8() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> e(Object obj, long j2, int i2) {
        i8 i8Var;
        List<L> listF = f(obj, j2);
        if (listF.isEmpty()) {
            List<L> i8Var2 = listF instanceof h8 ? new i8(i2) : ((listF instanceof m9) && (listF instanceof x7)) ? ((x7) listF).b(i2) : new ArrayList<>(i2);
            qa.j(obj, j2, i8Var2);
            return i8Var2;
        }
        if (f14713c.isAssignableFrom(listF.getClass())) {
            ArrayList arrayList = new ArrayList(listF.size() + i2);
            arrayList.addAll(listF);
            qa.j(obj, j2, arrayList);
            i8Var = arrayList;
        } else {
            if (!(listF instanceof la)) {
                if (!(listF instanceof m9) || !(listF instanceof x7)) {
                    return listF;
                }
                x7 x7Var = (x7) listF;
                if (x7Var.zza()) {
                    return listF;
                }
                x7 x7VarB = x7Var.b(listF.size() + i2);
                qa.j(obj, j2, x7VarB);
                return x7VarB;
            }
            i8 i8Var3 = new i8(listF.size() + i2);
            i8Var3.addAll((la) listF);
            qa.j(obj, j2, i8Var3);
            i8Var = i8Var3;
        }
        return i8Var;
    }

    private static <E> List<E> f(Object obj, long j2) {
        return (List) qa.F(obj, j2);
    }

    @Override // e.c.b.b.c.e.k8
    final <E> void b(Object obj, Object obj2, long j2) {
        List listF = f(obj2, j2);
        List listE = e(obj, j2, listF.size());
        int size = listE.size();
        int size2 = listF.size();
        if (size > 0 && size2 > 0) {
            listE.addAll(listF);
        }
        if (size > 0) {
            listF = listE;
        }
        qa.j(obj, j2, listF);
    }

    @Override // e.c.b.b.c.e.k8
    final void d(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) qa.F(obj, j2);
        if (list instanceof h8) {
            objUnmodifiableList = ((h8) list).A();
        } else {
            if (f14713c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof m9) && (list instanceof x7)) {
                x7 x7Var = (x7) list;
                if (x7Var.zza()) {
                    x7Var.C0();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        qa.j(obj, j2, objUnmodifiableList);
    }
}