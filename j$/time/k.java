package j$.time;

import j$.time.o.m;
import j$.time.o.n;
import j$.time.o.p;
import j$.time.o.q;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.Marker;

/* loaded from: classes2.dex */
public final class k extends j implements j$.time.o.k, Comparable<k>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap f15924b = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap f15925c = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: d, reason: collision with root package name */
    public static final k f15926d = B(0);

    /* renamed from: e, reason: collision with root package name */
    public static final k f15927e = B(-64800);

    /* renamed from: f, reason: collision with root package name */
    public static final k f15928f = B(64800);

    /* renamed from: g, reason: collision with root package name */
    private final int f15929g;

    /* renamed from: h, reason: collision with root package name */
    private final transient String f15930h;

    private k(int i2) {
        String string;
        this.f15929g = i2;
        if (i2 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i2);
            StringBuilder sb = new StringBuilder();
            int i3 = iAbs / 3600;
            int i4 = (iAbs / 60) % 60;
            sb.append(i2 < 0 ? "-" : Marker.ANY_NON_NULL_MARKER);
            sb.append(i3 < 10 ? "0" : "");
            sb.append(i3);
            sb.append(i4 < 10 ? ":0" : ":");
            sb.append(i4);
            int i5 = iAbs % 60;
            if (i5 != 0) {
                sb.append(i5 >= 10 ? ":" : ":0");
                sb.append(i5);
            }
            string = sb.toString();
        }
        this.f15930h = string;
    }

    public static k A(int i2, int i3, int i4) {
        if (i2 < -18 || i2 > 18) {
            throw new c("Zone offset hours not in valid range: value " + i2 + " is not in the range -18 to 18");
        }
        if (i2 > 0) {
            if (i3 < 0 || i4 < 0) {
                throw new c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i2 < 0) {
            if (i3 > 0 || i4 > 0) {
                throw new c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i3 > 0 && i4 < 0) || (i3 < 0 && i4 > 0)) {
            throw new c("Zone offset minutes and seconds must have the same sign");
        }
        if (i3 < -59 || i3 > 59) {
            throw new c("Zone offset minutes not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (i4 < -59 || i4 > 59) {
            throw new c("Zone offset seconds not in valid range: value " + i4 + " is not in the range -59 to 59");
        }
        if (Math.abs(i2) == 18 && (i3 | i4) != 0) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        return B((i3 * 60) + (i2 * 3600) + i4);
    }

    public static k B(int i2) {
        if (i2 < -64800 || i2 > 64800) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i2 % 900 != 0) {
            return new k(i2);
        }
        Integer numValueOf = Integer.valueOf(i2);
        ConcurrentMap concurrentMap = f15924b;
        k kVar = (k) concurrentMap.get(numValueOf);
        if (kVar != null) {
            return kVar;
        }
        concurrentMap.putIfAbsent(numValueOf, new k(i2));
        k kVar2 = (k) concurrentMap.get(numValueOf);
        f15925c.putIfAbsent(kVar2.f15930h, kVar2);
        return kVar2;
    }

    private static int C(CharSequence charSequence, int i2, boolean z) {
        if (z && charSequence.charAt(i2 - 1) != ':') {
            throw new c("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char cCharAt = charSequence.charAt(i2);
        char cCharAt2 = charSequence.charAt(i2 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new c("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.k z(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap r0 = j$.time.k.f15925c
            java.lang.Object r0 = r0.get(r7)
            j$.time.k r0 = (j$.time.k) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L6d
            r1 = 3
            if (r0 == r1) goto L89
            r4 = 5
            if (r0 == r4) goto L64
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L5b
            r5 = 7
            if (r0 == r5) goto L4e
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = C(r7, r2, r3)
            int r1 = C(r7, r6, r2)
            int r2 = C(r7, r5, r2)
            goto L8f
        L37:
            j$.time.c r0 = new j$.time.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, invalid format: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L4e:
            int r0 = C(r7, r2, r3)
            int r1 = C(r7, r1, r3)
            int r2 = C(r7, r4, r3)
            goto L8f
        L5b:
            int r0 = C(r7, r2, r3)
            int r1 = C(r7, r6, r2)
            goto L8e
        L64:
            int r0 = C(r7, r2, r3)
            int r1 = C(r7, r1, r3)
            goto L8e
        L6d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L89:
            int r0 = C(r7, r2, r3)
            r1 = 0
        L8e:
            r2 = 0
        L8f:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto Lb3
            if (r3 != r5) goto L9c
            goto Lb3
        L9c:
            j$.time.c r0 = new j$.time.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        Lb3:
            if (r3 != r5) goto Lbd
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.k r7 = A(r7, r0, r1)
            return r7
        Lbd:
            j$.time.k r7 = A(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.k.z(java.lang.String):j$.time.k");
    }

    @Override // java.lang.Comparable
    public int compareTo(k kVar) {
        return kVar.f15929g - this.f15929g;
    }

    @Override // j$.time.o.k
    public boolean d(j$.time.o.l lVar) {
        return lVar instanceof j$.time.o.h ? lVar == j$.time.o.h.OFFSET_SECONDS : lVar != null && lVar.n(this);
    }

    @Override // j$.time.j
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f15929g == ((k) obj).f15929g;
    }

    @Override // j$.time.j
    public String g() {
        return this.f15930h;
    }

    @Override // j$.time.o.k
    public int h(j$.time.o.l lVar) {
        if (lVar == j$.time.o.h.OFFSET_SECONDS) {
            return this.f15929g;
        }
        if (!(lVar instanceof j$.time.o.h)) {
            return a.i(this, lVar).a(l(lVar), lVar);
        }
        throw new p("Unsupported field: " + lVar);
    }

    @Override // j$.time.j
    public int hashCode() {
        return this.f15929g;
    }

    @Override // j$.time.o.k
    public q j(j$.time.o.l lVar) {
        return a.i(this, lVar);
    }

    @Override // j$.time.o.k
    public long l(j$.time.o.l lVar) {
        if (lVar == j$.time.o.h.OFFSET_SECONDS) {
            return this.f15929g;
        }
        if (!(lVar instanceof j$.time.o.h)) {
            return lVar.l(this);
        }
        throw new p("Unsupported field: " + lVar);
    }

    @Override // j$.time.o.k
    public Object n(n nVar) {
        int i2 = m.a;
        return (nVar == j$.time.o.c.a || nVar == j$.time.o.g.a) ? this : a.h(this, nVar);
    }

    @Override // j$.time.j
    public j$.time.p.c t() {
        return j$.time.p.c.e(this);
    }

    @Override // j$.time.j
    public String toString() {
        return this.f15930h;
    }

    public int y() {
        return this.f15929g;
    }
}