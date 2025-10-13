package i.d0;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: Strings.kt */
/* loaded from: classes3.dex */
public class q extends p {

    /* compiled from: Strings.kt */
    static final class a extends i.y.d.m implements i.y.c.p<CharSequence, Integer, i.l<? extends Integer, ? extends Integer>> {

        /* renamed from: e */
        final /* synthetic */ char[] f15812e;

        /* renamed from: f */
        final /* synthetic */ boolean f15813f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z) {
            super(2);
            this.f15812e = cArr;
            this.f15813f = z;
        }

        public final i.l<Integer, Integer> a(CharSequence charSequence, int i2) {
            i.y.d.l.d(charSequence, "$receiver");
            int iS = q.S(charSequence, this.f15812e, i2, this.f15813f);
            if (iS < 0) {
                return null;
            }
            return i.p.a(Integer.valueOf(iS), 1);
        }

        @Override // i.y.c.p
        public /* bridge */ /* synthetic */ i.l<? extends Integer, ? extends Integer> i(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    static final class b extends i.y.d.m implements i.y.c.p<CharSequence, Integer, i.l<? extends Integer, ? extends Integer>> {

        /* renamed from: e */
        final /* synthetic */ List f15814e;

        /* renamed from: f */
        final /* synthetic */ boolean f15815f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, boolean z) {
            super(2);
            this.f15814e = list;
            this.f15815f = z;
        }

        public final i.l<Integer, Integer> a(CharSequence charSequence, int i2) {
            i.y.d.l.d(charSequence, "$receiver");
            i.l lVarJ = q.J(charSequence, this.f15814e, i2, this.f15815f, false);
            if (lVarJ != null) {
                return i.p.a(lVarJ.c(), Integer.valueOf(((String) lVarJ.d()).length()));
            }
            return null;
        }

        @Override // i.y.c.p
        public /* bridge */ /* synthetic */ i.l<? extends Integer, ? extends Integer> i(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    static final class c extends i.y.d.m implements i.y.c.l<i.a0.c, String> {

        /* renamed from: e */
        final /* synthetic */ CharSequence f15816e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f15816e = charSequence;
        }

        @Override // i.y.c.l
        /* renamed from: a */
        public final String invoke(i.a0.c cVar) {
            i.y.d.l.d(cVar, "it");
            return q.s0(this.f15816e, cVar);
        }
    }

    public static /* synthetic */ String A0(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return y0(str, str2, str3);
    }

    public static CharSequence B0(CharSequence charSequence) {
        i.y.d.l.d(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean zC = i.d0.b.c(charSequence.charAt(!z ? i2 : length));
            if (z) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i2++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final boolean D(CharSequence charSequence, char c2, boolean z) {
        i.y.d.l.d(charSequence, "$this$contains");
        return Q(charSequence, c2, 0, z, 2, null) >= 0;
    }

    public static final boolean E(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        i.y.d.l.d(charSequence, "$this$contains");
        i.y.d.l.d(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (R(charSequence, (String) charSequence2, 0, z, 2, null) >= 0) {
                return true;
            }
        } else if (P(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean F(CharSequence charSequence, char c2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return D(charSequence, c2, z);
    }

    public static /* synthetic */ boolean G(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return E(charSequence, charSequence2, z);
    }

    public static final boolean H(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        i.y.d.l.d(charSequence, "$this$endsWith");
        i.y.d.l.d(charSequence2, "suffix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? p.n((String) charSequence, (String) charSequence2, false, 2, null) : e0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean I(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return H(charSequence, charSequence2, z);
    }

    public static final i.l<Integer, String> J(CharSequence charSequence, Collection<String> collection, int i2, boolean z, boolean z2) {
        Object next;
        Object next2;
        if (!z && collection.size() == 1) {
            String str = (String) i.t.j.F(collection);
            int iR = !z2 ? R(charSequence, str, i2, false, 4, null) : W(charSequence, str, i2, false, 4, null);
            if (iR < 0) {
                return null;
            }
            return i.p.a(Integer.valueOf(iR), str);
        }
        i.a0.a cVar = !z2 ? new i.a0.c(i.a0.f.b(i2, 0), charSequence.length()) : i.a0.f.g(i.a0.f.d(i2, L(charSequence)), 0);
        if (charSequence instanceof String) {
            int iA = cVar.a();
            int iC = cVar.c();
            int iE = cVar.e();
            if (iE < 0 ? iA >= iC : iA <= iC) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        if (p.r(str2, 0, (String) charSequence, iA, str2.length(), z)) {
                            break;
                        }
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (iA == iC) {
                            break;
                        }
                        iA += iE;
                    } else {
                        return i.p.a(Integer.valueOf(iA), str3);
                    }
                }
            }
        } else {
            int iA2 = cVar.a();
            int iC2 = cVar.c();
            int iE2 = cVar.e();
            if (iE2 < 0 ? iA2 >= iC2 : iA2 <= iC2) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        if (e0(str4, 0, charSequence, iA2, str4.length(), z)) {
                            break;
                        }
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (iA2 == iC2) {
                            break;
                        }
                        iA2 += iE2;
                    } else {
                        return i.p.a(Integer.valueOf(iA2), str5);
                    }
                }
            }
        }
        return null;
    }

    public static final i.a0.c K(CharSequence charSequence) {
        i.y.d.l.d(charSequence, "$this$indices");
        return new i.a0.c(0, charSequence.length() - 1);
    }

    public static final int L(CharSequence charSequence) {
        i.y.d.l.d(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    public static final int M(CharSequence charSequence, char c2, int i2, boolean z) {
        i.y.d.l.d(charSequence, "$this$indexOf");
        return (z || !(charSequence instanceof String)) ? S(charSequence, new char[]{c2}, i2, z) : ((String) charSequence).indexOf(c2, i2);
    }

    public static final int N(CharSequence charSequence, String str, int i2, boolean z) {
        i.y.d.l.d(charSequence, "$this$indexOf");
        i.y.d.l.d(str, "string");
        return (z || !(charSequence instanceof String)) ? P(charSequence, str, i2, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i2);
    }

    private static final int O(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        i.a0.a cVar = !z2 ? new i.a0.c(i.a0.f.b(i2, 0), i.a0.f.d(i3, charSequence.length())) : i.a0.f.g(i.a0.f.d(i2, L(charSequence)), i.a0.f.b(i3, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iA = cVar.a();
            int iC = cVar.c();
            int iE = cVar.e();
            if (iE >= 0) {
                if (iA > iC) {
                    return -1;
                }
            } else if (iA < iC) {
                return -1;
            }
            while (!p.r((String) charSequence2, 0, (String) charSequence, iA, charSequence2.length(), z)) {
                if (iA == iC) {
                    return -1;
                }
                iA += iE;
            }
            return iA;
        }
        int iA2 = cVar.a();
        int iC2 = cVar.c();
        int iE2 = cVar.e();
        if (iE2 >= 0) {
            if (iA2 > iC2) {
                return -1;
            }
        } else if (iA2 < iC2) {
            return -1;
        }
        while (!e0(charSequence2, 0, charSequence, iA2, charSequence2.length(), z)) {
            if (iA2 == iC2) {
                return -1;
            }
            iA2 += iE2;
        }
        return iA2;
    }

    static /* synthetic */ int P(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        return O(charSequence, charSequence2, i2, i3, z, (i4 & 16) != 0 ? false : z2);
    }

    public static /* synthetic */ int Q(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return M(charSequence, c2, i2, z);
    }

    public static /* synthetic */ int R(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return N(charSequence, str, i2, z);
    }

    public static final int S(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        boolean z2;
        i.y.d.l.d(charSequence, "$this$indexOfAny");
        i.y.d.l.d(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(i.t.h.s(cArr), i2);
        }
        int iB = i.a0.f.b(i2, 0);
        int iL = L(charSequence);
        if (iB > iL) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iB);
            int length = cArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z2 = false;
                    break;
                }
                if (i.d0.c.d(cArr[i3], cCharAt, z)) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                return iB;
            }
            if (iB == iL) {
                return -1;
            }
            iB++;
        }
    }

    public static final int T(CharSequence charSequence, char c2, int i2, boolean z) {
        i.y.d.l.d(charSequence, "$this$lastIndexOf");
        return (z || !(charSequence instanceof String)) ? X(charSequence, new char[]{c2}, i2, z) : ((String) charSequence).lastIndexOf(c2, i2);
    }

    public static final int U(CharSequence charSequence, String str, int i2, boolean z) {
        i.y.d.l.d(charSequence, "$this$lastIndexOf");
        i.y.d.l.d(str, "string");
        return (z || !(charSequence instanceof String)) ? O(charSequence, str, i2, 0, z, true) : ((String) charSequence).lastIndexOf(str, i2);
    }

    public static /* synthetic */ int V(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = L(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return T(charSequence, c2, i2, z);
    }

    public static /* synthetic */ int W(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = L(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return U(charSequence, str, i2, z);
    }

    public static final int X(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        i.y.d.l.d(charSequence, "$this$lastIndexOfAny");
        i.y.d.l.d(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(i.t.h.s(cArr), i2);
        }
        for (int iD = i.a0.f.d(i2, L(charSequence)); iD >= 0; iD--) {
            char cCharAt = charSequence.charAt(iD);
            int length = cArr.length;
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (i.d0.c.d(cArr[i3], cCharAt, z)) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                return iD;
            }
        }
        return -1;
    }

    public static final i.c0.d<String> Y(CharSequence charSequence) {
        i.y.d.l.d(charSequence, "$this$lineSequence");
        return p0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> Z(CharSequence charSequence) {
        i.y.d.l.d(charSequence, "$this$lines");
        return i.c0.j.j(Y(charSequence));
    }

    private static final i.c0.d<i.a0.c> a0(CharSequence charSequence, char[] cArr, int i2, boolean z, int i3) {
        if (i3 >= 0) {
            return new e(charSequence, i2, i3, new a(cArr, z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i3 + CoreConstants.DOT).toString());
    }

    private static final i.c0.d<i.a0.c> b0(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3) {
        if (i3 >= 0) {
            return new e(charSequence, i2, i3, new b(i.t.g.b(strArr), z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i3 + CoreConstants.DOT).toString());
    }

    static /* synthetic */ i.c0.d c0(CharSequence charSequence, char[] cArr, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return a0(charSequence, cArr, i2, z, i3);
    }

    static /* synthetic */ i.c0.d d0(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return b0(charSequence, strArr, i2, z, i3);
    }

    public static final boolean e0(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z) {
        i.y.d.l.d(charSequence, "$this$regionMatchesImpl");
        i.y.d.l.d(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!i.d0.c.d(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z)) {
                return false;
            }
        }
        return true;
    }

    public static String f0(String str, CharSequence charSequence) {
        i.y.d.l.d(str, "$this$removePrefix");
        i.y.d.l.d(charSequence, "prefix");
        if (!r0(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        i.y.d.l.c(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static String g0(String str, CharSequence charSequence) {
        i.y.d.l.d(str, "$this$removeSuffix");
        i.y.d.l.d(charSequence, "suffix");
        if (!I(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        i.y.d.l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String h0(String str, CharSequence charSequence) {
        i.y.d.l.d(str, "$this$removeSurrounding");
        i.y.d.l.d(charSequence, "delimiter");
        return i0(str, charSequence, charSequence);
    }

    public static final String i0(String str, CharSequence charSequence, CharSequence charSequence2) {
        i.y.d.l.d(str, "$this$removeSurrounding");
        i.y.d.l.d(charSequence, "prefix");
        i.y.d.l.d(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !r0(str, charSequence, false, 2, null) || !I(str, charSequence2, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        i.y.d.l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final List<String> j0(CharSequence charSequence, char[] cArr, boolean z, int i2) {
        i.y.d.l.d(charSequence, "$this$split");
        i.y.d.l.d(cArr, "delimiters");
        if (cArr.length == 1) {
            return l0(charSequence, String.valueOf(cArr[0]), z, i2);
        }
        Iterable iterableC = i.c0.j.c(c0(charSequence, cArr, 0, z, i2, 2, null));
        ArrayList arrayList = new ArrayList(i.t.m.o(iterableC, 10));
        Iterator it = iterableC.iterator();
        while (it.hasNext()) {
            arrayList.add(s0(charSequence, (i.a0.c) it.next()));
        }
        return arrayList;
    }

    public static final List<String> k0(CharSequence charSequence, String[] strArr, boolean z, int i2) {
        i.y.d.l.d(charSequence, "$this$split");
        i.y.d.l.d(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return l0(charSequence, str, z, i2);
            }
        }
        Iterable iterableC = i.c0.j.c(d0(charSequence, strArr, 0, z, i2, 2, null));
        ArrayList arrayList = new ArrayList(i.t.m.o(iterableC, 10));
        Iterator it = iterableC.iterator();
        while (it.hasNext()) {
            arrayList.add(s0(charSequence, (i.a0.c) it.next()));
        }
        return arrayList;
    }

    private static final List<String> l0(CharSequence charSequence, String str, boolean z, int i2) {
        int length = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + CoreConstants.DOT).toString());
        }
        int iN = N(charSequence, str, 0, z);
        if (iN == -1 || i2 == 1) {
            return i.t.k.b(charSequence.toString());
        }
        boolean z2 = i2 > 0;
        ArrayList arrayList = new ArrayList(z2 ? i.a0.f.d(i2, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iN).toString());
            length = str.length() + iN;
            if (z2 && arrayList.size() == i2 - 1) {
                break;
            }
            iN = N(charSequence, str, length, z);
        } while (iN != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List m0(CharSequence charSequence, char[] cArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return j0(charSequence, cArr, z, i2);
    }

    public static /* synthetic */ List n0(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return k0(charSequence, strArr, z, i2);
    }

    public static final i.c0.d<String> o0(CharSequence charSequence, String[] strArr, boolean z, int i2) {
        i.y.d.l.d(charSequence, "$this$splitToSequence");
        i.y.d.l.d(strArr, "delimiters");
        return i.c0.j.h(d0(charSequence, strArr, 0, z, i2, 2, null), new c(charSequence));
    }

    public static /* synthetic */ i.c0.d p0(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return o0(charSequence, strArr, z, i2);
    }

    public static final boolean q0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        i.y.d.l.d(charSequence, "$this$startsWith");
        i.y.d.l.d(charSequence2, "prefix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? p.B((String) charSequence, (String) charSequence2, false, 2, null) : e0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean r0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return q0(charSequence, charSequence2, z);
    }

    public static final String s0(CharSequence charSequence, i.a0.c cVar) {
        i.y.d.l.d(charSequence, "$this$substring");
        i.y.d.l.d(cVar, "range");
        return charSequence.subSequence(cVar.m().intValue(), cVar.l().intValue() + 1).toString();
    }

    public static final String t0(String str, String str2, String str3) {
        i.y.d.l.d(str, "$this$substringAfter");
        i.y.d.l.d(str2, "delimiter");
        i.y.d.l.d(str3, "missingDelimiterValue");
        int iR = R(str, str2, 0, false, 6, null);
        if (iR == -1) {
            return str3;
        }
        String strSubstring = str.substring(iR + str2.length(), str.length());
        i.y.d.l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String u0(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return t0(str, str2, str3);
    }

    public static final String v0(String str, char c2, String str2) {
        i.y.d.l.d(str, "$this$substringAfterLast");
        i.y.d.l.d(str2, "missingDelimiterValue");
        int iV = V(str, c2, 0, false, 6, null);
        if (iV == -1) {
            return str2;
        }
        String strSubstring = str.substring(iV + 1, str.length());
        i.y.d.l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String w0(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return v0(str, c2, str2);
    }

    public static final String x0(String str, char c2, String str2) {
        i.y.d.l.d(str, "$this$substringBefore");
        i.y.d.l.d(str2, "missingDelimiterValue");
        int iQ = Q(str, c2, 0, false, 6, null);
        if (iQ == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iQ);
        i.y.d.l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final String y0(String str, String str2, String str3) {
        i.y.d.l.d(str, "$this$substringBefore");
        i.y.d.l.d(str2, "delimiter");
        i.y.d.l.d(str3, "missingDelimiterValue");
        int iR = R(str, str2, 0, false, 6, null);
        if (iR == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iR);
        i.y.d.l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String z0(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return x0(str, c2, str2);
    }
}