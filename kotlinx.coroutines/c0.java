package kotlinx.coroutines;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes3.dex */
public final class c0 {
    private static final boolean a;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0028, code lost:
    
        if (r0.equals("on") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0031, code lost:
    
        if (r0.equals("") != false) goto L43;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.y.d(r0)
            if (r0 != 0) goto L9
            goto L33
        L9:
            int r1 = r0.hashCode()
            if (r1 == 0) goto L2b
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L22
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L37
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L37
            r0 = 0
            goto L34
        L22:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L37
            goto L33
        L2b:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L37
        L33:
            r0 = 1
        L34:
            kotlinx.coroutines.c0.a = r0
            return
        L37:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.c0.<clinit>():void");
    }

    public static final d0 a() {
        return a ? kotlinx.coroutines.t2.c.f17128m : t.f17099i;
    }

    public static final String b(i.v.g gVar) {
        g0 g0Var;
        String strZ;
        if (!m0.c() || (g0Var = (g0) gVar.get(g0.f16944e)) == null) {
            return null;
        }
        h0 h0Var = (h0) gVar.get(h0.f16946e);
        if (h0Var == null || (strZ = h0Var.Z()) == null) {
            strZ = "coroutine";
        }
        return strZ + '#' + g0Var.Z();
    }

    public static final i.v.g c(i0 i0Var, i.v.g gVar) {
        i.v.g gVarPlus = i0Var.A().plus(gVar);
        i.v.g gVarPlus2 = m0.c() ? gVarPlus.plus(new g0(m0.b().incrementAndGet())) : gVarPlus;
        return (gVarPlus == t0.a() || gVarPlus.get(i.v.e.f15850b) != null) ? gVarPlus2 : gVarPlus2.plus(t0.a());
    }
}