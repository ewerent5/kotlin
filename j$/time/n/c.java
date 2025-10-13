package j$.time.n;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import j$.time.n.g;
import j$.time.o.m;
import j$.time.o.n;
import j$.time.o.q;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.connection.RealConnection;
import org.slf4j.Marker;

/* loaded from: classes2.dex */
public final class c {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private c f15940b;

    /* renamed from: c, reason: collision with root package name */
    private final c f15941c;

    /* renamed from: d, reason: collision with root package name */
    private final List f15942d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15943e;

    /* renamed from: f, reason: collision with root package name */
    private int f15944f;

    class a extends j$.time.n.g {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g.b f15945c;

        a(c cVar, g.b bVar) {
            this.f15945c = bVar;
        }
    }

    static final class b implements d {
        private final char a;

        b(char c2) {
            this.a = c2;
        }

        @Override // j$.time.n.c.d
        public boolean h(j$.time.n.f fVar, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public String toString() {
            if (this.a == '\'') {
                return "''";
            }
            StringBuilder sbA = j$.T0.a.a.a.a.a("'");
            sbA.append(this.a);
            sbA.append("'");
            return sbA.toString();
        }
    }

    /* renamed from: j$.time.n.c$c, reason: collision with other inner class name */
    static final class C0202c implements d {
        private final d[] a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f15946b;

        C0202c(List list, boolean z) {
            this.a = (d[]) list.toArray(new d[list.size()]);
            this.f15946b = z;
        }

        C0202c(d[] dVarArr, boolean z) {
            this.a = dVarArr;
            this.f15946b = z;
        }

        public C0202c a(boolean z) {
            return z == this.f15946b ? this : new C0202c(this.a, z);
        }

        @Override // j$.time.n.c.d
        public boolean h(j$.time.n.f fVar, StringBuilder sb) {
            int length = sb.length();
            if (this.f15946b) {
                fVar.g();
            }
            try {
                for (d dVar : this.a) {
                    if (!dVar.h(fVar, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.f15946b) {
                    fVar.a();
                }
                return true;
            } finally {
                if (this.f15946b) {
                    fVar.a();
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.a != null) {
                sb.append(this.f15946b ? "[" : "(");
                for (d dVar : this.a) {
                    sb.append(dVar);
                }
                sb.append(this.f15946b ? "]" : ")");
            }
            return sb.toString();
        }
    }

    interface d {
        boolean h(j$.time.n.f fVar, StringBuilder sb);
    }

    static final class e implements d {
        private final j$.time.o.l a;

        /* renamed from: b, reason: collision with root package name */
        private final int f15947b;

        /* renamed from: c, reason: collision with root package name */
        private final int f15948c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f15949d;

        e(j$.time.o.l lVar, int i2, int i3, boolean z) {
            Objects.requireNonNull(lVar, "field");
            if (!lVar.h().f()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + lVar);
            }
            if (i2 < 0 || i2 > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i2);
            }
            if (i3 < 1 || i3 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i3);
            }
            if (i3 >= i2) {
                this.a = lVar;
                this.f15947b = i2;
                this.f15948c = i3;
                this.f15949d = z;
                return;
            }
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
        }

        @Override // j$.time.n.c.d
        public boolean h(j$.time.n.f fVar, StringBuilder sb) {
            Long lE = fVar.e(this.a);
            if (lE == null) {
                return false;
            }
            j$.time.n.h hVarB = fVar.b();
            long jLongValue = lE.longValue();
            q qVarH = this.a.h();
            qVarH.b(jLongValue, this.a);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(qVarH.e());
            BigDecimal bigDecimalDivide = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf).divide(BigDecimal.valueOf(qVarH.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            BigDecimal bigDecimalStripTrailingZeros = bigDecimalDivide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : bigDecimalDivide.stripTrailingZeros();
            if (bigDecimalStripTrailingZeros.scale() != 0) {
                String strA = hVarB.a(bigDecimalStripTrailingZeros.setScale(Math.min(Math.max(bigDecimalStripTrailingZeros.scale(), this.f15947b), this.f15948c), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.f15949d) {
                    sb.append(hVarB.b());
                }
                sb.append(strA);
                return true;
            }
            if (this.f15947b <= 0) {
                return true;
            }
            if (this.f15949d) {
                sb.append(hVarB.b());
            }
            for (int i2 = 0; i2 < this.f15947b; i2++) {
                sb.append(hVarB.e());
            }
            return true;
        }

        public String toString() {
            String str = this.f15949d ? ",DecimalPoint" : "";
            StringBuilder sbA = j$.T0.a.a.a.a.a("Fraction(");
            sbA.append(this.a);
            sbA.append(",");
            sbA.append(this.f15947b);
            sbA.append(",");
            sbA.append(this.f15948c);
            sbA.append(str);
            sbA.append(")");
            return sbA.toString();
        }
    }

    static final class f implements d {
        f(int i2) {
        }

        @Override // j$.time.n.c.d
        public boolean h(j$.time.n.f fVar, StringBuilder sb) {
            Long lE = fVar.e(j$.time.o.h.INSTANT_SECONDS);
            j$.time.o.k kVarD = fVar.d();
            j$.time.o.h hVar = j$.time.o.h.NANO_OF_SECOND;
            Long lValueOf = kVarD.d(hVar) ? Long.valueOf(fVar.d().l(hVar)) : null;
            int i2 = 0;
            if (lE == null) {
                return false;
            }
            long jLongValue = lE.longValue();
            int iW = hVar.w(lValueOf != null ? lValueOf.longValue() : 0L);
            if (jLongValue >= -62167219200L) {
                long j2 = (jLongValue - 315569520000L) + 62167219200L;
                long jD = j$.time.a.D(j2, 315569520000L) + 1;
                j$.time.f fVarA = j$.time.f.A(j$.time.a.B(j2, 315569520000L) - 62167219200L, 0, j$.time.k.f15926d);
                if (jD > 0) {
                    sb.append('+');
                    sb.append(jD);
                }
                sb.append(fVarA);
                if (fVarA.w() == 0) {
                    sb.append(":00");
                }
            } else {
                long j3 = jLongValue + 62167219200L;
                long j4 = j3 / 315569520000L;
                long j5 = j3 % 315569520000L;
                j$.time.f fVarA2 = j$.time.f.A(j5 - 62167219200L, 0, j$.time.k.f15926d);
                int length = sb.length();
                sb.append(fVarA2);
                if (fVarA2.w() == 0) {
                    sb.append(":00");
                }
                if (j4 < 0) {
                    if (fVarA2.x() == -10000) {
                        sb.replace(length, length + 2, Long.toString(j4 - 1));
                    } else if (j5 == 0) {
                        sb.insert(length, j4);
                    } else {
                        sb.insert(length + 1, Math.abs(j4));
                    }
                }
            }
            if (iW > 0) {
                sb.append(CoreConstants.DOT);
                int i3 = 100000000;
                while (true) {
                    if (iW <= 0 && i2 % 3 == 0 && i2 >= -2) {
                        break;
                    }
                    int i4 = iW / i3;
                    sb.append((char) (i4 + 48));
                    iW -= i4 * i3;
                    i3 /= 10;
                    i2++;
                }
            }
            sb.append('Z');
            return true;
        }

        public String toString() {
            return "Instant()";
        }
    }

    static class g implements d {
        static final long[] a = {0, 10, 100, 1000, AbstractComponentTracker.LINGERING_TIMEOUT, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS};

        /* renamed from: b, reason: collision with root package name */
        final j$.time.o.l f15950b;

        /* renamed from: c, reason: collision with root package name */
        final int f15951c;

        /* renamed from: d, reason: collision with root package name */
        final int f15952d;

        /* renamed from: e, reason: collision with root package name */
        private final j$.time.n.j f15953e;

        /* renamed from: f, reason: collision with root package name */
        final int f15954f;

        g(j$.time.o.l lVar, int i2, int i3, j$.time.n.j jVar) {
            this.f15950b = lVar;
            this.f15951c = i2;
            this.f15952d = i3;
            this.f15953e = jVar;
            this.f15954f = 0;
        }

        protected g(j$.time.o.l lVar, int i2, int i3, j$.time.n.j jVar, int i4) {
            this.f15950b = lVar;
            this.f15951c = i2;
            this.f15952d = i3;
            this.f15953e = jVar;
            this.f15954f = i4;
        }

        g b() {
            return this.f15954f == -1 ? this : new g(this.f15950b, this.f15951c, this.f15952d, this.f15953e, -1);
        }

        g c(int i2) {
            return new g(this.f15950b, this.f15951c, this.f15952d, this.f15953e, this.f15954f + i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
        
            if (r4 != 4) goto L39;
         */
        @Override // j$.time.n.c.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean h(j$.time.n.f r12, java.lang.StringBuilder r13) {
            /*
                r11 = this;
                j$.time.o.l r0 = r11.f15950b
                java.lang.Long r0 = r12.e(r0)
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                long r2 = r0.longValue()
                j$.time.n.h r12 = r12.b()
                r4 = -9223372036854775808
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L1b
                java.lang.String r0 = "9223372036854775808"
                goto L23
            L1b:
                long r4 = java.lang.Math.abs(r2)
                java.lang.String r0 = java.lang.Long.toString(r4)
            L23:
                int r4 = r0.length()
                int r5 = r11.f15952d
                java.lang.String r6 = " cannot be printed as the value "
                java.lang.String r7 = "Field "
                if (r4 > r5) goto L9f
                java.lang.String r0 = r12.a(r0)
                r4 = 0
                r8 = 4
                r9 = 1
                int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                j$.time.n.j r4 = r11.f15953e
                int r4 = r4.ordinal()
                if (r10 < 0) goto L59
                if (r4 == r9) goto L54
                if (r4 == r8) goto L46
                goto L88
            L46:
                int r4 = r11.f15951c
                r5 = 19
                if (r4 >= r5) goto L88
                long[] r5 = j$.time.n.c.g.a
                r4 = r5[r4]
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L88
            L54:
                char r2 = r12.d()
                goto L85
            L59:
                if (r4 == 0) goto L81
                if (r4 == r9) goto L81
                r5 = 3
                if (r4 == r5) goto L63
                if (r4 == r8) goto L81
                goto L88
            L63:
                j$.time.c r12 = new j$.time.c
                java.lang.StringBuilder r13 = j$.T0.a.a.a.a.a(r7)
                j$.time.o.l r0 = r11.f15950b
                r13.append(r0)
                r13.append(r6)
                r13.append(r2)
                java.lang.String r0 = " cannot be negative according to the SignStyle"
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            L81:
                char r2 = r12.c()
            L85:
                r13.append(r2)
            L88:
                int r2 = r11.f15951c
                int r3 = r0.length()
                int r2 = r2 - r3
                if (r1 >= r2) goto L9b
                char r2 = r12.e()
                r13.append(r2)
                int r1 = r1 + 1
                goto L88
            L9b:
                r13.append(r0)
                return r9
            L9f:
                j$.time.c r12 = new j$.time.c
                java.lang.StringBuilder r13 = j$.T0.a.a.a.a.a(r7)
                j$.time.o.l r0 = r11.f15950b
                r13.append(r0)
                r13.append(r6)
                r13.append(r2)
                java.lang.String r0 = " exceeds the maximum print width of "
                r13.append(r0)
                int r0 = r11.f15952d
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.time.n.c.g.h(j$.time.n.f, java.lang.StringBuilder):boolean");
        }

        public String toString() {
            StringBuilder sbA;
            Object obj;
            int i2 = this.f15951c;
            if (i2 == 1 && this.f15952d == 19 && this.f15953e == j$.time.n.j.NORMAL) {
                sbA = j$.T0.a.a.a.a.a("Value(");
                obj = this.f15950b;
            } else {
                if (i2 == this.f15952d && this.f15953e == j$.time.n.j.NOT_NEGATIVE) {
                    sbA = j$.T0.a.a.a.a.a("Value(");
                    sbA.append(this.f15950b);
                    sbA.append(",");
                    sbA.append(this.f15951c);
                    sbA.append(")");
                    return sbA.toString();
                }
                sbA = j$.T0.a.a.a.a.a("Value(");
                sbA.append(this.f15950b);
                sbA.append(",");
                sbA.append(this.f15951c);
                sbA.append(",");
                sbA.append(this.f15952d);
                sbA.append(",");
                obj = this.f15953e;
            }
            sbA.append(obj);
            sbA.append(")");
            return sbA.toString();
        }
    }

    static final class h implements d {
        static final String[] a = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* renamed from: b, reason: collision with root package name */
        static final h f15955b = new h("+HH:MM:ss", "Z");

        /* renamed from: c, reason: collision with root package name */
        private final String f15956c;

        /* renamed from: d, reason: collision with root package name */
        private final int f15957d;

        static {
            new h("+HH:MM:ss", "0");
        }

        h(String str, String str2) {
            Objects.requireNonNull(str, "pattern");
            Objects.requireNonNull(str2, "noOffsetText");
            int i2 = 0;
            while (true) {
                String[] strArr = a;
                if (i2 >= strArr.length) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                }
                if (strArr[i2].equals(str)) {
                    this.f15957d = i2;
                    this.f15956c = str2;
                    return;
                }
                i2++;
            }
        }

        @Override // j$.time.n.c.d
        public boolean h(j$.time.n.f fVar, StringBuilder sb) {
            Long lE = fVar.e(j$.time.o.h.OFFSET_SECONDS);
            if (lE == null) {
                return false;
            }
            long jLongValue = lE.longValue();
            int i2 = (int) jLongValue;
            if (jLongValue != i2) {
                throw new ArithmeticException();
            }
            if (i2 == 0) {
                sb.append(this.f15956c);
            } else {
                int iAbs = Math.abs((i2 / 3600) % 100);
                int iAbs2 = Math.abs((i2 / 60) % 60);
                int iAbs3 = Math.abs(i2 % 60);
                int length = sb.length();
                sb.append(i2 < 0 ? "-" : Marker.ANY_NON_NULL_MARKER);
                sb.append((char) ((iAbs / 10) + 48));
                sb.append((char) ((iAbs % 10) + 48));
                int i3 = this.f15957d;
                if (i3 >= 3 || (i3 >= 1 && iAbs2 > 0)) {
                    sb.append(i3 % 2 == 0 ? ":" : "");
                    sb.append((char) ((iAbs2 / 10) + 48));
                    sb.append((char) ((iAbs2 % 10) + 48));
                    iAbs += iAbs2;
                    int i4 = this.f15957d;
                    if (i4 >= 7 || (i4 >= 5 && iAbs3 > 0)) {
                        sb.append(i4 % 2 != 0 ? "" : ":");
                        sb.append((char) ((iAbs3 / 10) + 48));
                        sb.append((char) ((iAbs3 % 10) + 48));
                        iAbs += iAbs3;
                    }
                }
                if (iAbs == 0) {
                    sb.setLength(length);
                    sb.append(this.f15956c);
                }
            }
            return true;
        }

        public String toString() {
            String strReplace = this.f15956c.replace("'", "''");
            StringBuilder sbA = j$.T0.a.a.a.a.a("Offset(");
            sbA.append(a[this.f15957d]);
            sbA.append(",'");
            sbA.append(strReplace);
            sbA.append("')");
            return sbA.toString();
        }
    }

    enum i implements d {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        @Override // j$.time.n.c.d
        public boolean h(j$.time.n.f fVar, StringBuilder sb) {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (iOrdinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (iOrdinal == 2) {
                return "ParseStrict(true)";
            }
            if (iOrdinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    static final class j implements d {
        private final String a;

        j(String str) {
            this.a = str;
        }

        @Override // j$.time.n.c.d
        public boolean h(j$.time.n.f fVar, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public String toString() {
            return "'" + this.a.replace("'", "''") + "'";
        }
    }

    static final class k implements d {
        private final j$.time.o.l a;

        /* renamed from: b, reason: collision with root package name */
        private final j$.time.n.k f15958b;

        /* renamed from: c, reason: collision with root package name */
        private final j$.time.n.g f15959c;

        /* renamed from: d, reason: collision with root package name */
        private volatile g f15960d;

        k(j$.time.o.l lVar, j$.time.n.k kVar, j$.time.n.g gVar) {
            this.a = lVar;
            this.f15958b = kVar;
            this.f15959c = gVar;
        }

        @Override // j$.time.n.c.d
        public boolean h(j$.time.n.f fVar, StringBuilder sb) {
            String strA;
            j$.time.m.i iVar;
            Long lE = fVar.e(this.a);
            if (lE == null) {
                return false;
            }
            j$.time.o.k kVarD = fVar.d();
            int i2 = m.a;
            j$.time.m.h hVar = (j$.time.m.h) kVarD.n(j$.time.o.b.a);
            if (hVar == null || hVar == (iVar = j$.time.m.i.a)) {
                j$.time.n.g gVar = this.f15959c;
                long jLongValue = lE.longValue();
                j$.time.n.k kVar = this.f15958b;
                fVar.c();
                strA = ((a) gVar).f15945c.a(jLongValue, kVar);
            } else {
                j$.time.n.g gVar2 = this.f15959c;
                j$.time.o.l lVar = this.a;
                long jLongValue2 = lE.longValue();
                j$.time.n.k kVar2 = this.f15958b;
                fVar.c();
                Objects.requireNonNull(gVar2);
                strA = (hVar == iVar || !(lVar instanceof j$.time.o.h)) ? ((a) gVar2).f15945c.a(jLongValue2, kVar2) : null;
            }
            if (strA != null) {
                sb.append(strA);
                return true;
            }
            if (this.f15960d == null) {
                this.f15960d = new g(this.a, 1, 19, j$.time.n.j.NORMAL);
            }
            return this.f15960d.h(fVar, sb);
        }

        public String toString() {
            StringBuilder sbA;
            Object obj;
            if (this.f15958b == j$.time.n.k.FULL) {
                sbA = j$.T0.a.a.a.a.a("Text(");
                obj = this.a;
            } else {
                sbA = j$.T0.a.a.a.a.a("Text(");
                sbA.append(this.a);
                sbA.append(",");
                obj = this.f15958b;
            }
            sbA.append(obj);
            sbA.append(")");
            return sbA.toString();
        }
    }

    static class l implements d {
        l(n nVar, String str) {
        }

        @Override // j$.time.n.c.d
        public boolean h(j$.time.n.f fVar, StringBuilder sb) {
            j$.time.j jVar = (j$.time.j) fVar.f(j$.time.n.a.a);
            if (jVar == null) {
                return false;
            }
            sb.append(jVar.g());
            return true;
        }

        public String toString() {
            return "ZoneRegionId()";
        }
    }

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.o.h.ERA);
        map.put('y', j$.time.o.h.YEAR_OF_ERA);
        map.put('u', j$.time.o.h.YEAR);
        j$.time.o.l lVar = j$.time.o.j.a;
        map.put('Q', lVar);
        map.put('q', lVar);
        j$.time.o.h hVar = j$.time.o.h.MONTH_OF_YEAR;
        map.put('M', hVar);
        map.put('L', hVar);
        map.put('D', j$.time.o.h.DAY_OF_YEAR);
        map.put('d', j$.time.o.h.DAY_OF_MONTH);
        map.put('F', j$.time.o.h.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.o.h hVar2 = j$.time.o.h.DAY_OF_WEEK;
        map.put('E', hVar2);
        map.put('c', hVar2);
        map.put('e', hVar2);
        map.put('a', j$.time.o.h.AMPM_OF_DAY);
        map.put('H', j$.time.o.h.HOUR_OF_DAY);
        map.put('k', j$.time.o.h.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.o.h.HOUR_OF_AMPM);
        map.put('h', j$.time.o.h.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.o.h.MINUTE_OF_HOUR);
        map.put('s', j$.time.o.h.SECOND_OF_MINUTE);
        j$.time.o.h hVar3 = j$.time.o.h.NANO_OF_SECOND;
        map.put('S', hVar3);
        map.put('A', j$.time.o.h.MILLI_OF_DAY);
        map.put('n', hVar3);
        map.put('N', j$.time.o.h.NANO_OF_DAY);
    }

    public c() {
        this.f15940b = this;
        this.f15942d = new ArrayList();
        this.f15944f = -1;
        this.f15941c = null;
        this.f15943e = false;
    }

    private c(c cVar, boolean z) {
        this.f15940b = this;
        this.f15942d = new ArrayList();
        this.f15944f = -1;
        this.f15941c = cVar;
        this.f15943e = z;
    }

    private int d(d dVar) {
        Objects.requireNonNull(dVar, "pp");
        c cVar = this.f15940b;
        Objects.requireNonNull(cVar);
        cVar.f15942d.add(dVar);
        this.f15940b.f15944f = -1;
        return r2.f15942d.size() - 1;
    }

    private c j(g gVar) {
        g gVarB;
        c cVar = this.f15940b;
        int i2 = cVar.f15944f;
        if (i2 >= 0) {
            g gVar2 = (g) cVar.f15942d.get(i2);
            if (gVar.f15951c == gVar.f15952d && gVar.f15953e == j$.time.n.j.NOT_NEGATIVE) {
                gVarB = gVar2.c(gVar.f15952d);
                d(gVar.b());
                this.f15940b.f15944f = i2;
            } else {
                gVarB = gVar2.b();
                this.f15940b.f15944f = d(gVar);
            }
            this.f15940b.f15942d.set(i2, gVarB);
        } else {
            cVar.f15944f = d(gVar);
        }
        return this;
    }

    public c a(j$.time.n.b bVar) {
        d(bVar.f(false));
        return this;
    }

    public c b(j$.time.o.l lVar, int i2, int i3, boolean z) {
        d(new e(lVar, i2, i3, z));
        return this;
    }

    public c c() {
        d(new f(-2));
        return this;
    }

    public c e(char c2) {
        d(new b(c2));
        return this;
    }

    public c f(String str) {
        if (str.length() > 0) {
            d(str.length() == 1 ? new b(str.charAt(0)) : new j(str));
        }
        return this;
    }

    public c g(String str, String str2) {
        d(new h(str, str2));
        return this;
    }

    public c h() {
        d(h.f15955b);
        return this;
    }

    public c i(j$.time.o.l lVar, Map map) {
        Objects.requireNonNull(lVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        j$.time.n.k kVar = j$.time.n.k.FULL;
        d(new k(lVar, kVar, new a(this, new g.b(Collections.singletonMap(kVar, linkedHashMap)))));
        return this;
    }

    public c k(j$.time.o.l lVar, int i2) {
        Objects.requireNonNull(lVar, "field");
        if (i2 >= 1 && i2 <= 19) {
            j(new g(lVar, i2, i2, j$.time.n.j.NOT_NEGATIVE));
            return this;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
    }

    public c l(j$.time.o.l lVar, int i2, int i3, j$.time.n.j jVar) {
        if (i2 == i3 && jVar == j$.time.n.j.NOT_NEGATIVE) {
            k(lVar, i3);
            return this;
        }
        Objects.requireNonNull(lVar, "field");
        Objects.requireNonNull(jVar, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 >= i2) {
            j(new g(lVar, i2, i3, jVar));
            return this;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public c m() {
        d(new l(j$.time.n.a.a, "ZoneRegionId()"));
        return this;
    }

    public c n() {
        c cVar = this.f15940b;
        if (cVar.f15941c == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (cVar.f15942d.size() > 0) {
            c cVar2 = this.f15940b;
            C0202c c0202c = new C0202c(cVar2.f15942d, cVar2.f15943e);
            this.f15940b = this.f15940b.f15941c;
            d(c0202c);
        } else {
            this.f15940b = this.f15940b.f15941c;
        }
        return this;
    }

    public c o() {
        c cVar = this.f15940b;
        cVar.f15944f = -1;
        this.f15940b = new c(cVar, true);
        return this;
    }

    public c p() {
        d(i.INSENSITIVE);
        return this;
    }

    public c q() {
        d(i.SENSITIVE);
        return this;
    }

    public c r() {
        d(i.LENIENT);
        return this;
    }

    j$.time.n.b s(j$.time.n.i iVar, j$.time.m.h hVar) {
        Locale locale = Locale.getDefault();
        Objects.requireNonNull(locale, "locale");
        while (this.f15940b.f15941c != null) {
            n();
        }
        return new j$.time.n.b(new C0202c(this.f15942d, false), locale, j$.time.n.h.a, iVar, null, hVar, null);
    }
}