package c.f.b.k.m;

import c.f.b.k.e;
import java.util.ArrayList;

/* compiled from: Grouping.java */
/* loaded from: classes.dex */
public class i {
    public static o a(c.f.b.k.e eVar, int i2, ArrayList<o> arrayList, o oVar) {
        int iB1;
        int i3 = i2 == 0 ? eVar.B0 : eVar.C0;
        if (i3 != -1 && (oVar == null || i3 != oVar.f2932c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i4);
                if (oVar2.c() == i3) {
                    if (oVar != null) {
                        oVar.g(i2, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof c.f.b.k.i) && (iB1 = ((c.f.b.k.i) eVar).b1(i2)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i5);
                    if (oVar3.c() == iB1) {
                        oVar = oVar3;
                        break;
                    }
                    i5++;
                }
            }
            if (oVar == null) {
                oVar = new o(i2);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof c.f.b.k.g) {
                c.f.b.k.g gVar = (c.f.b.k.g) eVar;
                gVar.a1().b(gVar.b1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i2 == 0) {
                eVar.B0 = oVar.c();
                eVar.I.b(i2, arrayList, oVar);
                eVar.K.b(i2, arrayList, oVar);
            } else {
                eVar.C0 = oVar.c();
                eVar.J.b(i2, arrayList, oVar);
                eVar.M.b(i2, arrayList, oVar);
                eVar.L.b(i2, arrayList, oVar);
            }
            eVar.P.b(i2, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = arrayList.get(i3);
            if (i2 == oVar.f2932c) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(c.f.b.k.f r16, c.f.b.k.m.b.InterfaceC0049b r17) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.k.m.i.c(c.f.b.k.f, c.f.b.k.m.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}