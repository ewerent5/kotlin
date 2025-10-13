package k.c.e.m;

import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import k.c.e.m.p;

/* compiled from: MapTileFileArchiveProvider.java */
/* loaded from: classes3.dex */
public class m extends n {

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<f> f16642g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<k.c.e.n.d> f16643h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f16644i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f16645j;

    /* compiled from: MapTileFileArchiveProvider.java */
    protected class a extends p.b {
        protected a() {
            super();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[DONT_GENERATE, PHI: r2 r3
  0x0067: PHI (r2v3 android.graphics.drawable.Drawable) = (r2v0 android.graphics.drawable.Drawable), (r2v6 android.graphics.drawable.Drawable) binds: [B:22:0x0072, B:17:0x0065] A[DONT_GENERATE, DONT_INLINE]
  0x0067: PHI (r3v2 java.io.InputStream) = (r3v1 java.io.InputStream), (r3v6 java.io.InputStream) binds: [B:22:0x0072, B:17:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // k.c.e.m.p.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.graphics.drawable.Drawable a(long r7) throws java.io.IOException {
            /*
                r6 = this;
                java.lang.String r0 = "OsmDroid"
                k.c.e.m.m r1 = k.c.e.m.m.this
                java.util.concurrent.atomic.AtomicReference r1 = k.c.e.m.m.p(r1)
                java.lang.Object r1 = r1.get()
                k.c.e.n.d r1 = (k.c.e.n.d) r1
                r2 = 0
                if (r1 != 0) goto L12
                return r2
            L12:
                k.c.b.c r3 = k.c.b.a.a()     // Catch: java.lang.Throwable -> L6b
                boolean r3 = r3.c()     // Catch: java.lang.Throwable -> L6b
                if (r3 == 0) goto L34
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
                r3.<init>()     // Catch: java.lang.Throwable -> L6b
                java.lang.String r4 = "Archives - Tile doesn't exist: "
                r3.append(r4)     // Catch: java.lang.Throwable -> L6b
                java.lang.String r4 = k.c.f.m.h(r7)     // Catch: java.lang.Throwable -> L6b
                r3.append(r4)     // Catch: java.lang.Throwable -> L6b
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L6b
                android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L6b
            L34:
                k.c.e.m.m r3 = k.c.e.m.m.this     // Catch: java.lang.Throwable -> L6b
                java.io.InputStream r3 = k.c.e.m.m.q(r3, r7, r1)     // Catch: java.lang.Throwable -> L6b
                if (r3 == 0) goto L65
                k.c.b.c r4 = k.c.b.a.a()     // Catch: java.lang.Throwable -> L63
                boolean r4 = r4.c()     // Catch: java.lang.Throwable -> L63
                if (r4 == 0) goto L5e
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
                r4.<init>()     // Catch: java.lang.Throwable -> L63
                java.lang.String r5 = "Use tile from archive: "
                r4.append(r5)     // Catch: java.lang.Throwable -> L63
                java.lang.String r7 = k.c.f.m.h(r7)     // Catch: java.lang.Throwable -> L63
                r4.append(r7)     // Catch: java.lang.Throwable -> L63
                java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L63
                android.util.Log.d(r0, r7)     // Catch: java.lang.Throwable -> L63
            L5e:
                android.graphics.drawable.Drawable r2 = r1.e(r3)     // Catch: java.lang.Throwable -> L63
                goto L65
            L63:
                r7 = move-exception
                goto L6d
            L65:
                if (r3 == 0) goto L75
            L67:
                k.c.e.o.f.a(r3)
                goto L75
            L6b:
                r7 = move-exception
                r3 = r2
            L6d:
                java.lang.String r8 = "Error loading tile"
                android.util.Log.e(r0, r8, r7)     // Catch: java.lang.Throwable -> L76
                if (r3 == 0) goto L75
                goto L67
            L75:
                return r2
            L76:
                r7 = move-exception
                if (r3 == 0) goto L7c
                k.c.e.o.f.a(r3)
            L7c:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: k.c.e.m.m.a.a(long):android.graphics.drawable.Drawable");
        }
    }

    public m(k.c.e.d dVar, k.c.e.n.d dVar2, f[] fVarArr) {
        this(dVar, dVar2, fVarArr, false);
    }

    private void r() {
        while (!this.f16642g.isEmpty()) {
            f fVar = this.f16642g.get(0);
            if (fVar != null) {
                fVar.close();
            }
            this.f16642g.remove(0);
        }
    }

    private void s() throws IllegalAccessException, InstantiationException {
        File[] fileArrListFiles;
        r();
        File fileW = k.c.b.a.a().w();
        if (fileW == null || (fileArrListFiles = fileW.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            f fVarA = k.c.e.m.a.a(file);
            if (fVarA != null) {
                fVarA.b(this.f16645j);
                this.f16642g.add(fVarA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized InputStream t(long j2, k.c.e.n.d dVar) {
        InputStream inputStreamC;
        Iterator<f> it = this.f16642g.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (next != null && (inputStreamC = next.c(dVar, j2)) != null) {
                if (k.c.b.a.a().c()) {
                    Log.d("OsmDroid", "Found tile " + k.c.f.m.h(j2) + " in " + next);
                }
                return inputStreamC;
            }
        }
        return null;
    }

    @Override // k.c.e.m.n, k.c.e.m.p
    public void c() {
        r();
        super.c();
    }

    @Override // k.c.e.m.p
    public int d() {
        k.c.e.n.d dVar = this.f16643h.get();
        return dVar != null ? dVar.d() : k.c.f.t.r();
    }

    @Override // k.c.e.m.p
    public int e() {
        k.c.e.n.d dVar = this.f16643h.get();
        if (dVar != null) {
            return dVar.c();
        }
        return 0;
    }

    @Override // k.c.e.m.p
    protected String f() {
        return "File Archive Provider";
    }

    @Override // k.c.e.m.p
    protected String g() {
        return "filearchive";
    }

    @Override // k.c.e.m.p
    public boolean i() {
        return false;
    }

    @Override // k.c.e.m.p
    public void m(k.c.e.n.d dVar) {
        this.f16643h.set(dVar);
    }

    @Override // k.c.e.m.n
    protected void n() throws IllegalAccessException, InstantiationException {
        if (this.f16644i) {
            return;
        }
        s();
    }

    @Override // k.c.e.m.n
    protected void o() throws IllegalAccessException, InstantiationException {
        if (this.f16644i) {
            return;
        }
        s();
    }

    @Override // k.c.e.m.p
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public a h() {
        return new a();
    }

    public m(k.c.e.d dVar, k.c.e.n.d dVar2, f[] fVarArr, boolean z) throws IllegalAccessException, InstantiationException {
        super(dVar, k.c.b.a.a().C(), k.c.b.a.a().g());
        this.f16642g = new ArrayList<>();
        this.f16643h = new AtomicReference<>();
        this.f16645j = z;
        m(dVar2);
        if (fVarArr == null) {
            this.f16644i = false;
            s();
            return;
        }
        this.f16644i = true;
        for (int length = fVarArr.length - 1; length >= 0; length--) {
            this.f16642g.add(fVarArr[length]);
        }
    }

    public m(k.c.e.d dVar, k.c.e.n.d dVar2) {
        this(dVar, dVar2, null);
    }
}