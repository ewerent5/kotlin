package e.c.b.b.c.e;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class g9<T> implements s9<T> {
    private final b9 a;

    /* renamed from: b, reason: collision with root package name */
    private final ka<?, ?> f14550b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14551c;

    /* renamed from: d, reason: collision with root package name */
    private final d7<?> f14552d;

    private g9(ka<?, ?> kaVar, d7<?> d7Var, b9 b9Var) {
        this.f14550b = kaVar;
        this.f14551c = d7Var.e(b9Var);
        this.f14552d = d7Var;
        this.a = b9Var;
    }

    static <T> g9<T> g(ka<?, ?> kaVar, d7<?> d7Var, b9 b9Var) {
        return new g9<>(kaVar, d7Var, b9Var);
    }

    @Override // e.c.b.b.c.e.s9
    public final boolean a(T t) {
        return this.f14552d.b(t).q();
    }

    @Override // e.c.b.b.c.e.s9
    public final void b(T t) {
        this.f14550b.j(t);
        this.f14552d.g(t);
    }

    @Override // e.c.b.b.c.e.s9
    public final void c(T t, eb ebVar) {
        Iterator itO = this.f14552d.b(t).o();
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            j7 j7Var = (j7) entry.getKey();
            if (j7Var.zzc() != fb.MESSAGE || j7Var.zzd() || j7Var.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof d8) {
                ebVar.l(j7Var.zza(), ((d8) entry).a().d());
            } else {
                ebVar.l(j7Var.zza(), entry.getValue());
            }
        }
        ka<?, ?> kaVar = this.f14550b;
        kaVar.g(kaVar.f(t), ebVar);
    }

    @Override // e.c.b.b.c.e.s9
    public final boolean d(T t, T t2) {
        if (!this.f14550b.f(t).equals(this.f14550b.f(t2))) {
            return false;
        }
        if (this.f14551c) {
            return this.f14552d.b(t).equals(this.f14552d.b(t2));
        }
        return true;
    }

    @Override // e.c.b.b.c.e.s9
    public final void e(T t, T t2) {
        u9.o(this.f14550b, t, t2);
        if (this.f14551c) {
            u9.m(this.f14552d, t, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099 A[EDGE_INSN: B:56:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:61:0x0053], SYNTHETIC] */
    @Override // e.c.b.b.c.e.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(T r10, byte[] r11, int r12, int r13, e.c.b.b.c.e.f6 r14) throws e.c.b.b.c.e.a8 {
        /*
            r9 = this;
            r0 = r10
            e.c.b.b.c.e.o7 r0 = (e.c.b.b.c.e.o7) r0
            e.c.b.b.c.e.ja r1 = r0.zzb
            e.c.b.b.c.e.ja r2 = e.c.b.b.c.e.ja.a()
            if (r1 != r2) goto L11
            e.c.b.b.c.e.ja r1 = e.c.b.b.c.e.ja.g()
            r0.zzb = r1
        L11:
            e.c.b.b.c.e.o7$d r10 = (e.c.b.b.c.e.o7.d) r10
            r10.y()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = e.c.b.b.c.e.c6.i(r11, r12, r14)
            int r2 = r14.a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            e.c.b.b.c.e.d7<?> r12 = r9.f14552d
            e.c.b.b.c.e.b7 r0 = r14.f14517d
            e.c.b.b.c.e.b9 r3 = r9.a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.c(r0, r3, r5)
            r0 = r12
            e.c.b.b.c.e.o7$f r0 = (e.c.b.b.c.e.o7.f) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = e.c.b.b.c.e.c6.c(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            e.c.b.b.c.e.o9.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = e.c.b.b.c.e.c6.a(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = e.c.b.b.c.e.c6.i(r11, r4, r14)
            int r5 = r14.a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = e.c.b.b.c.e.c6.q(r11, r4, r14)
            java.lang.Object r2 = r14.f14516c
            e.c.b.b.c.e.g6 r2 = (e.c.b.b.c.e.g6) r2
            goto L53
        L72:
            e.c.b.b.c.e.o9.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = e.c.b.b.c.e.c6.i(r11, r4, r14)
            int r12 = r14.a
            e.c.b.b.c.e.d7<?> r0 = r9.f14552d
            e.c.b.b.c.e.b7 r5 = r14.f14517d
            e.c.b.b.c.e.b9 r6 = r9.a
            java.lang.Object r0 = r0.c(r5, r6, r12)
            e.c.b.b.c.e.o7$f r0 = (e.c.b.b.c.e.o7.f) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = e.c.b.b.c.e.c6.a(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.c(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            e.c.b.b.c.e.a8 r10 = e.c.b.b.c.e.a8.e()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.b.b.c.e.g9.f(java.lang.Object, byte[], int, int, e.c.b.b.c.e.f6):void");
    }

    @Override // e.c.b.b.c.e.s9
    public final T zza() {
        return (T) this.a.R().zzx();
    }

    @Override // e.c.b.b.c.e.s9
    public final int zzb(T t) {
        ka<?, ?> kaVar = this.f14550b;
        int iK = kaVar.k(kaVar.f(t)) + 0;
        return this.f14551c ? iK + this.f14552d.b(t).r() : iK;
    }

    @Override // e.c.b.b.c.e.s9
    public final int zza(T t) {
        int iHashCode = this.f14550b.f(t).hashCode();
        return this.f14551c ? (iHashCode * 53) + this.f14552d.b(t).hashCode() : iHashCode;
    }
}