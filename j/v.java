package j;

/* compiled from: PeekSource.kt */
/* loaded from: classes3.dex */
public final class v implements d0 {

    /* renamed from: e, reason: collision with root package name */
    private final f f16487e;

    /* renamed from: f, reason: collision with root package name */
    private y f16488f;

    /* renamed from: g, reason: collision with root package name */
    private int f16489g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16490h;

    /* renamed from: i, reason: collision with root package name */
    private long f16491i;

    /* renamed from: j, reason: collision with root package name */
    private final h f16492j;

    public v(h hVar) {
        i.y.d.l.d(hVar, "upstream");
        this.f16492j = hVar;
        f fVarE = hVar.e();
        this.f16487e = fVarE;
        y yVar = fVarE.f16453e;
        this.f16488f = yVar;
        this.f16489g = yVar != null ? yVar.f16501c : -1;
    }

    @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16490h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    @Override // j.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long read(j.f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            i.y.d.l.d(r9, r0)
            r0 = 0
            r1 = 0
            r3 = 1
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 < 0) goto Lf
            r5 = 1
            goto L10
        Lf:
            r5 = 0
        L10:
            if (r5 == 0) goto L87
            boolean r5 = r8.f16490h
            r5 = r5 ^ r3
            if (r5 == 0) goto L7b
            j.y r5 = r8.f16488f
            if (r5 == 0) goto L2a
            j.f r6 = r8.f16487e
            j.y r6 = r6.f16453e
            if (r5 != r6) goto L2b
            int r5 = r8.f16489g
            i.y.d.l.b(r6)
            int r6 = r6.f16501c
            if (r5 != r6) goto L2b
        L2a:
            r0 = 1
        L2b:
            if (r0 == 0) goto L6f
            if (r4 != 0) goto L30
            return r1
        L30:
            j.h r0 = r8.f16492j
            long r1 = r8.f16491i
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.p0(r1)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            j.y r0 = r8.f16488f
            if (r0 != 0) goto L53
            j.f r0 = r8.f16487e
            j.y r0 = r0.f16453e
            if (r0 == 0) goto L53
            r8.f16488f = r0
            i.y.d.l.b(r0)
            int r0 = r0.f16501c
            r8.f16489g = r0
        L53:
            j.f r0 = r8.f16487e
            long r0 = r0.y0()
            long r2 = r8.f16491i
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            j.f r2 = r8.f16487e
            long r4 = r8.f16491i
            r3 = r9
            r6 = r10
            r2.j(r3, r4, r6)
            long r0 = r8.f16491i
            long r0 = r0 + r10
            r8.f16491i = r0
            return r10
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L87:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j.v.read(j.f, long):long");
    }

    @Override // j.d0
    public e0 timeout() {
        return this.f16492j.timeout();
    }
}