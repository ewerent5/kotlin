package c.f.b.k;

import java.util.ArrayList;

/* compiled from: Chain.java */
/* loaded from: classes.dex */
public class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e A[PHI: r14 r15
  0x003e: PHI (r14v3 boolean) = (r14v1 boolean), (r14v30 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r15v3 boolean) = (r15v1 boolean), (r15v37 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040 A[PHI: r14 r15
  0x0040: PHI (r14v28 boolean) = (r14v1 boolean), (r14v30 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r15v35 boolean) = (r15v1 boolean), (r15v37 boolean) binds: [B:24:0x003c, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016a  */
    /* JADX WARN: Type inference failed for: r2v56, types: [c.f.b.k.e] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [c.f.b.k.e] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(c.f.b.k.f r37, c.f.b.d r38, int r39, int r40, c.f.b.k.c r41) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.k.b.a(c.f.b.k.f, c.f.b.d, int, int, c.f.b.k.c):void");
    }

    public static void b(f fVar, c.f.b.d dVar, ArrayList<e> arrayList, int i2) {
        c[] cVarArr;
        int i3;
        int i4;
        if (i2 == 0) {
            i3 = fVar.O0;
            cVarArr = fVar.R0;
            i4 = 0;
        } else {
            int i5 = fVar.P0;
            cVarArr = fVar.Q0;
            i3 = i5;
            i4 = 2;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            c cVar = cVarArr[i6];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.a)) {
                a(fVar, dVar, i2, i4, cVar);
            }
        }
    }
}