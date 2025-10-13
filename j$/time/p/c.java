package j$.time.p;

import ch.qos.logback.core.CoreConstants;
import j$.time.Instant;
import j$.time.f;
import j$.time.k;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class c implements Serializable {
    private static final long[] a = new long[0];

    /* renamed from: b, reason: collision with root package name */
    private static final b[] f15985b = new b[0];

    /* renamed from: c, reason: collision with root package name */
    private static final f[] f15986c = new f[0];

    /* renamed from: d, reason: collision with root package name */
    private static final a[] f15987d = new a[0];

    /* renamed from: e, reason: collision with root package name */
    private final long[] f15988e;

    /* renamed from: f, reason: collision with root package name */
    private final k[] f15989f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f15990g;

    /* renamed from: h, reason: collision with root package name */
    private final k[] f15991h;

    /* renamed from: i, reason: collision with root package name */
    private final b[] f15992i;

    /* renamed from: j, reason: collision with root package name */
    private final TimeZone f15993j;

    /* renamed from: k, reason: collision with root package name */
    private final transient ConcurrentMap f15994k = new ConcurrentHashMap();

    private c(k kVar) {
        k[] kVarArr = {kVar};
        this.f15989f = kVarArr;
        long[] jArr = a;
        this.f15988e = jArr;
        this.f15990g = jArr;
        this.f15991h = kVarArr;
        this.f15992i = f15985b;
        this.f15993j = null;
    }

    c(TimeZone timeZone) {
        k[] kVarArr = {f(timeZone.getRawOffset())};
        this.f15989f = kVarArr;
        long[] jArr = a;
        this.f15988e = jArr;
        this.f15990g = jArr;
        this.f15991h = kVarArr;
        this.f15992i = f15985b;
        this.f15993j = timeZone;
    }

    private a[] a(int i2) {
        long j2;
        long j3;
        Integer numValueOf = Integer.valueOf(i2);
        a[] aVarArr = (a[]) this.f15994k.get(numValueOf);
        if (aVarArr != null) {
            return aVarArr;
        }
        if (this.f15993j == null) {
            b[] bVarArr = this.f15992i;
            a[] aVarArr2 = new a[bVarArr.length];
            if (bVarArr.length > 0) {
                Objects.requireNonNull(bVarArr[0]);
                throw null;
            }
            if (i2 < 2100) {
                this.f15994k.putIfAbsent(numValueOf, aVarArr2);
            }
            return aVarArr2;
        }
        if (i2 < 1800) {
            return f15987d;
        }
        long j4 = j$.time.a.j(f.y(i2 - 1, 12, 31, 0, 0), this.f15989f[0]);
        long j5 = 1000;
        int offset = this.f15993j.getOffset(j4 * 1000);
        long j6 = 31968000 + j4;
        a[] aVarArr3 = f15987d;
        while (j4 < j6) {
            long j7 = 7776000 + j4;
            long j8 = j4;
            if (offset != this.f15993j.getOffset(j7 * j5)) {
                j4 = j8;
                while (j7 - j4 > 1) {
                    long j9 = j6;
                    long jD = j$.time.a.D(j7 + j4, 2L);
                    long j10 = j7;
                    if (this.f15993j.getOffset(jD * 1000) == offset) {
                        j4 = jD;
                        j7 = j10;
                    } else {
                        j7 = jD;
                    }
                    j5 = 1000;
                    j6 = j9;
                }
                j2 = j6;
                long j11 = j7;
                j3 = j5;
                if (this.f15993j.getOffset(j4 * j3) == offset) {
                    j4 = j11;
                }
                k kVarF = f(offset);
                int offset2 = this.f15993j.getOffset(j4 * j3);
                k kVarF2 = f(offset2);
                if (b(j4, kVarF2) == i2) {
                    a[] aVarArr4 = (a[]) Arrays.copyOf(aVarArr3, aVarArr3.length + 1);
                    aVarArr4[aVarArr4.length - 1] = new a(j4, kVarF, kVarF2);
                    offset = offset2;
                    aVarArr3 = aVarArr4;
                } else {
                    offset = offset2;
                }
            } else {
                j2 = j6;
                j3 = j5;
                j4 = j7;
            }
            j5 = j3;
            j6 = j2;
        }
        if (1916 <= i2 && i2 < 2100) {
            this.f15994k.putIfAbsent(numValueOf, aVarArr3);
        }
        return aVarArr3;
    }

    private int b(long j2, k kVar) {
        return j$.time.e.C(j$.time.a.D(j2 + kVar.y(), 86400)).z();
    }

    public static c e(k kVar) {
        return new c(kVar);
    }

    private static k f(int i2) {
        return k.B(i2 / CoreConstants.MILLIS_IN_ONE_SECOND);
    }

    public k c(Instant instant) {
        TimeZone timeZone = this.f15993j;
        if (timeZone != null) {
            return f(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.f15990g.length == 0) {
            return this.f15989f[0];
        }
        long jW = instant.w();
        if (this.f15992i.length > 0) {
            if (jW > this.f15990g[r8.length - 1]) {
                a[] aVarArrA = a(b(jW, this.f15991h[r8.length - 1]));
                a aVar = null;
                for (int i2 = 0; i2 < aVarArrA.length; i2++) {
                    aVar = aVarArrA[i2];
                    if (jW < aVar.u()) {
                        return aVar.l();
                    }
                }
                return aVar.j();
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f15990g, jW);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f15991h[iBinarySearch + 1];
    }

    public boolean d() {
        TimeZone timeZone = this.f15993j;
        if (timeZone == null) {
            return this.f15990g.length == 0;
        }
        if (timeZone.useDaylightTime() || this.f15993j.getDSTSavings() != 0) {
            return false;
        }
        Instant instant = Instant.a;
        k kVar = k.f15926d;
        Instant instantY = Instant.y(System.currentTimeMillis());
        a aVar = null;
        if (this.f15993j != null) {
            long jW = instantY.w();
            if (instantY.x() > 0 && jW < Long.MAX_VALUE) {
                jW++;
            }
            int iB = b(jW, c(instantY));
            a[] aVarArrA = a(iB);
            int length = aVarArrA.length - 1;
            while (true) {
                if (length >= 0) {
                    if (jW > aVarArrA[length].u()) {
                        aVar = aVarArrA[length];
                        break;
                    }
                    length--;
                } else if (iB > 1800) {
                    a[] aVarArrA2 = a(iB - 1);
                    int length2 = aVarArrA2.length - 1;
                    while (true) {
                        if (length2 < 0) {
                            long jMin = Math.min(jW - 31104000, (j$.time.b.b().a() / 1000) + 31968000);
                            int offset = this.f15993j.getOffset((jW - 1) * 1000);
                            long jM = j$.time.e.B(1800, 1, 1).m() * 86400;
                            while (true) {
                                if (jM > jMin) {
                                    break;
                                }
                                int offset2 = this.f15993j.getOffset(jMin * 1000);
                                if (offset != offset2) {
                                    int iB2 = b(jMin, f(offset2));
                                    a[] aVarArrA3 = a(iB2 + 1);
                                    int length3 = aVarArrA3.length - 1;
                                    while (true) {
                                        if (length3 < 0) {
                                            a[] aVarArrA4 = a(iB2);
                                            aVar = aVarArrA4[aVarArrA4.length - 1];
                                            break;
                                        }
                                        if (jW > aVarArrA3[length3].u()) {
                                            aVar = aVarArrA3[length3];
                                            break;
                                        }
                                        length3--;
                                    }
                                } else {
                                    jMin -= 7776000;
                                }
                            }
                        } else {
                            if (jW > aVarArrA2[length2].u()) {
                                aVar = aVarArrA2[length2];
                                break;
                            }
                            length2--;
                        }
                    }
                }
            }
        } else if (this.f15990g.length != 0) {
            long jW2 = instantY.w();
            if (instantY.x() > 0 && jW2 < Long.MAX_VALUE) {
                jW2++;
            }
            long[] jArr = this.f15990g;
            long j2 = jArr[jArr.length - 1];
            if (this.f15992i.length <= 0 || jW2 <= j2) {
                int iBinarySearch = Arrays.binarySearch(this.f15990g, jW2);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                if (iBinarySearch > 0) {
                    int i2 = iBinarySearch - 1;
                    long j3 = this.f15990g[i2];
                    k[] kVarArr = this.f15991h;
                    aVar = new a(j3, kVarArr[i2], kVarArr[iBinarySearch]);
                }
            } else {
                k[] kVarArr2 = this.f15991h;
                k kVar2 = kVarArr2[kVarArr2.length - 1];
                int iB3 = b(jW2, kVar2);
                a[] aVarArrA5 = a(iB3);
                int length4 = aVarArrA5.length - 1;
                while (true) {
                    if (length4 < 0) {
                        int i3 = iB3 - 1;
                        if (i3 > b(j2, kVar2)) {
                            a[] aVarArrA6 = a(i3);
                            aVar = aVarArrA6[aVarArrA6.length - 1];
                        }
                    } else {
                        if (jW2 > aVarArrA5[length4].u()) {
                            aVar = aVarArrA5[length4];
                            break;
                        }
                        length4--;
                    }
                }
            }
        }
        return aVar == null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return j$.time.a.v(this.f15993j, cVar.f15993j) && Arrays.equals(this.f15988e, cVar.f15988e) && Arrays.equals(this.f15989f, cVar.f15989f) && Arrays.equals(this.f15990g, cVar.f15990g) && Arrays.equals(this.f15991h, cVar.f15991h) && Arrays.equals(this.f15992i, cVar.f15992i);
    }

    public int hashCode() {
        TimeZone timeZone = this.f15993j;
        return (((((timeZone != null ? timeZone.hashCode() : 0) ^ Arrays.hashCode(this.f15988e)) ^ Arrays.hashCode(this.f15989f)) ^ Arrays.hashCode(this.f15990g)) ^ Arrays.hashCode(this.f15991h)) ^ Arrays.hashCode(this.f15992i);
    }

    public String toString() {
        StringBuilder sbA;
        if (this.f15993j != null) {
            sbA = j$.T0.a.a.a.a.a("ZoneRules[timeZone=");
            sbA.append(this.f15993j.getID());
        } else {
            sbA = j$.T0.a.a.a.a.a("ZoneRules[currentStandardOffset=");
            sbA.append(this.f15989f[r2.length - 1]);
        }
        sbA.append("]");
        return sbA.toString();
    }
}