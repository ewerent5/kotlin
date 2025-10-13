package e.c.b.b.c.e;

import e.c.b.b.c.e.j7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class h7<T extends j7<T>> {
    private static final h7 a = new h7(true);

    /* renamed from: b, reason: collision with root package name */
    final t9<T, Object> f14588b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14589c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14590d;

    private h7() {
        this.f14588b = t9.b(16);
    }

    public static int a(j7<?> j7Var, Object obj) {
        ya yaVarZzb = j7Var.zzb();
        int iZza = j7Var.zza();
        if (!j7Var.zzd()) {
            return b(yaVarZzb, iZza, obj);
        }
        int iB = 0;
        if (j7Var.zze()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iB += i(yaVarZzb, it.next());
            }
            return y6.g0(iZza) + iB + y6.D0(iB);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iB += b(yaVarZzb, iZza, it2.next());
        }
        return iB;
    }

    static int b(ya yaVar, int i2, Object obj) {
        int iG0 = y6.g0(i2);
        if (yaVar == ya.n) {
            r7.g((b9) obj);
            iG0 <<= 1;
        }
        return iG0 + i(yaVar, obj);
    }

    public static <T extends j7<T>> h7<T> c() {
        return a;
    }

    private final Object d(T t) {
        Object obj = this.f14588b.get(t);
        if (!(obj instanceof b8)) {
            return obj;
        }
        return b8.e();
    }

    private static Object e(Object obj) {
        if (obj instanceof f9) {
            return ((f9) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(e.c.b.b.c.e.ya r2, java.lang.Object r3) {
        /*
            e.c.b.b.c.e.r7.d(r3)
            int[] r0 = e.c.b.b.c.e.g7.a
            e.c.b.b.c.e.fb r2 = r2.a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L28;
                case 8: goto L1f;
                case 9: goto L16;
                default: goto L14;
            }
        L14:
            r0 = 0
            goto L42
        L16:
            boolean r2 = r3 instanceof e.c.b.b.c.e.b9
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof e.c.b.b.c.e.b8
            if (r2 == 0) goto L14
            goto L42
        L1f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof e.c.b.b.c.e.u7
            if (r2 == 0) goto L14
            goto L42
        L28:
            boolean r2 = r3 instanceof e.c.b.b.c.e.g6
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L14
            goto L42
        L31:
            boolean r0 = r3 instanceof java.lang.String
            goto L42
        L34:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r0 = r3 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L42
        L40:
            boolean r0 = r3 instanceof java.lang.Integer
        L42:
            if (r0 == 0) goto L45
            return
        L45:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.b.b.c.e.h7.g(e.c.b.b.c.e.ya, java.lang.Object):void");
    }

    private static <T extends j7<T>> boolean h(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() == fb.MESSAGE) {
            if (key.zzd()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((b9) it.next()).f()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof b9)) {
                    if (value instanceof b8) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((b9) value).f()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int i(ya yaVar, Object obj) {
        switch (g7.f14548b[yaVar.ordinal()]) {
            case 1:
                return y6.z(((Double) obj).doubleValue());
            case 2:
                return y6.A(((Float) obj).floatValue());
            case 3:
                return y6.d0(((Long) obj).longValue());
            case 4:
                return y6.i0(((Long) obj).longValue());
            case 5:
                return y6.k0(((Integer) obj).intValue());
            case 6:
                return y6.r0(((Long) obj).longValue());
            case 7:
                return y6.w0(((Integer) obj).intValue());
            case 8:
                return y6.L(((Boolean) obj).booleanValue());
            case 9:
                return y6.V((b9) obj);
            case 10:
                return obj instanceof b8 ? y6.d((b8) obj) : y6.J((b9) obj);
            case 11:
                return obj instanceof g6 ? y6.I((g6) obj) : y6.K((String) obj);
            case 12:
                return obj instanceof g6 ? y6.I((g6) obj) : y6.M((byte[]) obj);
            case 13:
                return y6.o0(((Integer) obj).intValue());
            case 14:
                return y6.z0(((Integer) obj).intValue());
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return y6.v0(((Long) obj).longValue());
            case 16:
                return y6.s0(((Integer) obj).intValue());
            case 17:
                return y6.n0(((Long) obj).longValue());
            case 18:
                return obj instanceof u7 ? y6.B0(((u7) obj).zza()) : y6.B0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private final void k(T t, Object obj) {
        if (!t.zzd()) {
            g(t.zzb(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                g(t.zzb(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof b8) {
            this.f14590d = true;
        }
        this.f14588b.put(t, obj);
    }

    private final void l(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof b8) {
            value = b8.e();
        }
        if (key.zzd()) {
            Object objD = d(key);
            if (objD == null) {
                objD = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objD).add(e(it.next()));
            }
            this.f14588b.put(key, objD);
            return;
        }
        if (key.zzc() != fb.MESSAGE) {
            this.f14588b.put(key, e(value));
            return;
        }
        Object objD2 = d(key);
        if (objD2 == null) {
            this.f14588b.put(key, e(value));
        } else {
            this.f14588b.put(key, objD2 instanceof f9 ? key.i((f9) objD2, (f9) value) : key.g(((b9) objD2).d(), (b9) value).zzy());
        }
    }

    private static int m(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        return (key.zzc() != fb.MESSAGE || key.zzd() || key.zze()) ? a(key, value) : value instanceof b8 ? y6.D(entry.getKey().zza(), (b8) value) : y6.E(entry.getKey().zza(), (b9) value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        h7 h7Var = new h7();
        for (int i2 = 0; i2 < this.f14588b.j(); i2++) {
            Map.Entry<K, Object> entryH = this.f14588b.h(i2);
            h7Var.k((j7) entryH.getKey(), entryH.getValue());
        }
        Iterator it = this.f14588b.m().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            h7Var.k((j7) entry.getKey(), entry.getValue());
        }
        h7Var.f14590d = this.f14590d;
        return h7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h7) {
            return this.f14588b.equals(((h7) obj).f14588b);
        }
        return false;
    }

    public final void f(h7<T> h7Var) {
        for (int i2 = 0; i2 < h7Var.f14588b.j(); i2++) {
            l(h7Var.f14588b.h(i2));
        }
        Iterator it = h7Var.f14588b.m().iterator();
        while (it.hasNext()) {
            l((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f14588b.hashCode();
    }

    public final void j() {
        if (this.f14589c) {
            return;
        }
        this.f14588b.e();
        this.f14589c = true;
    }

    public final boolean n() {
        return this.f14589c;
    }

    public final Iterator<Map.Entry<T, Object>> o() {
        return this.f14590d ? new g8(this.f14588b.entrySet().iterator()) : this.f14588b.entrySet().iterator();
    }

    final Iterator<Map.Entry<T, Object>> p() {
        return this.f14590d ? new g8(this.f14588b.o().iterator()) : this.f14588b.o().iterator();
    }

    public final boolean q() {
        for (int i2 = 0; i2 < this.f14588b.j(); i2++) {
            if (!h(this.f14588b.h(i2))) {
                return false;
            }
        }
        Iterator it = this.f14588b.m().iterator();
        while (it.hasNext()) {
            if (!h((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int r() {
        int iM = 0;
        for (int i2 = 0; i2 < this.f14588b.j(); i2++) {
            iM += m(this.f14588b.h(i2));
        }
        Iterator it = this.f14588b.m().iterator();
        while (it.hasNext()) {
            iM += m((Map.Entry) it.next());
        }
        return iM;
    }

    private h7(boolean z) {
        this(t9.b(0));
        j();
    }

    private h7(t9<T, Object> t9Var) {
        this.f14588b = t9Var;
        j();
    }
}