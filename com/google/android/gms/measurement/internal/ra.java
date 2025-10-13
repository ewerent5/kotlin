package com.google.android.gms.measurement.internal;

import e.c.b.b.c.e.r0;
import e.c.b.b.c.e.t0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
abstract class ra {
    String a;

    /* renamed from: b, reason: collision with root package name */
    int f11188b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f11189c;

    /* renamed from: d, reason: collision with root package name */
    Boolean f11190d;

    /* renamed from: e, reason: collision with root package name */
    Long f11191e;

    /* renamed from: f, reason: collision with root package name */
    Long f11192f;

    ra(String str, int i2) {
        this.a = str;
        this.f11188b = i2;
    }

    static Boolean b(double d2, e.c.b.b.c.e.r0 r0Var) {
        try {
            return h(new BigDecimal(d2), r0Var, Math.ulp(d2));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j2, e.c.b.b.c.e.r0 r0Var) {
        try {
            return h(new BigDecimal(j2), r0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    static Boolean e(String str, e.c.b.b.c.e.r0 r0Var) {
        if (!z9.Q(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), r0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, t0.b bVar, boolean z, String str2, List<String> list, String str3, v3 v3Var) {
        if (str == null) {
            return null;
        }
        if (bVar == t0.b.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && bVar != t0.b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (na.a[bVar.ordinal()]) {
            case 1:
                try {
                    break;
                } catch (PatternSyntaxException unused) {
                    if (v3Var != null) {
                        v3Var.D().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
        }
        return null;
    }

    static Boolean g(String str, e.c.b.b.c.e.t0 t0Var, v3 v3Var) {
        List<String> list;
        com.google.android.gms.common.internal.p.j(t0Var);
        if (str == null || !t0Var.y() || t0Var.z() == t0.b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        t0.b bVarZ = t0Var.z();
        t0.b bVar = t0.b.IN_LIST;
        if (bVarZ == bVar) {
            if (t0Var.F() == 0) {
                return null;
            }
        } else if (!t0Var.A()) {
            return null;
        }
        t0.b bVarZ2 = t0Var.z();
        boolean zD = t0Var.D();
        String strB = (zD || bVarZ2 == t0.b.REGEXP || bVarZ2 == bVar) ? t0Var.B() : t0Var.B().toUpperCase(Locale.ENGLISH);
        if (t0Var.F() == 0) {
            list = null;
        } else {
            List<String> listE = t0Var.E();
            if (!zD) {
                ArrayList arrayList = new ArrayList(listE.size());
                Iterator<String> it = listE.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                listE = Collections.unmodifiableList(arrayList);
            }
            list = listE;
        }
        return f(str, bVarZ2, zD, strB, list, bVarZ2 == t0.b.REGEXP ? strB : null, v3Var);
    }

    private static Boolean h(BigDecimal bigDecimal, e.c.b.b.c.e.r0 r0Var, double d2) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        com.google.android.gms.common.internal.p.j(r0Var);
        if (r0Var.y() && r0Var.z() != r0.a.UNKNOWN_COMPARISON_TYPE) {
            r0.a aVarZ = r0Var.z();
            r0.a aVar = r0.a.BETWEEN;
            if (aVarZ == aVar) {
                if (!r0Var.E() || !r0Var.G()) {
                    return null;
                }
            } else if (!r0Var.C()) {
                return null;
            }
            r0.a aVarZ2 = r0Var.z();
            if (r0Var.z() == aVar) {
                if (z9.Q(r0Var.F()) && z9.Q(r0Var.H())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(r0Var.F());
                        bigDecimal4 = new BigDecimal(r0Var.H());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!z9.Q(r0Var.D())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(r0Var.D());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (aVarZ2 == aVar) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int i2 = na.f11066b[aVarZ2.ordinal()];
            if (i2 == 1) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == -1);
            }
            if (i2 == 2) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 1);
            }
            if (i2 == 3) {
                if (d2 == 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                }
                if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d2).multiply(new BigDecimal(2)))) == 1 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d2).multiply(new BigDecimal(2)))) == -1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if (i2 == 4) {
                if (bigDecimal.compareTo(bigDecimal3) != -1 && bigDecimal.compareTo(bigDecimal4) != 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    abstract int a();

    abstract boolean i();

    abstract boolean j();
}