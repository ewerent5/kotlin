package i.d0;

import i.t.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: Indent.kt */
/* loaded from: classes3.dex */
public class i extends h {

    /* compiled from: Indent.kt */
    static final class a extends i.y.d.m implements i.y.c.l<String, String> {

        /* renamed from: e */
        public static final a f15810e = new a();

        a() {
            super(1);
        }

        @Override // i.y.c.l
        /* renamed from: a */
        public final String invoke(String str) {
            i.y.d.l.d(str, "line");
            return str;
        }
    }

    /* compiled from: Indent.kt */
    static final class b extends i.y.d.m implements i.y.c.l<String, String> {

        /* renamed from: e */
        final /* synthetic */ String f15811e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f15811e = str;
        }

        @Override // i.y.c.l
        /* renamed from: a */
        public final String invoke(String str) {
            i.y.d.l.d(str, "line");
            return this.f15811e + str;
        }
    }

    private static final i.y.c.l<String, String> b(String str) {
        return str.length() == 0 ? a.f15810e : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (!i.d0.b.c(str.charAt(i2))) {
                break;
            }
            i2++;
        }
        return i2 == -1 ? str.length() : i2;
    }

    public static final String d(String str, String str2) {
        String str3;
        String strInvoke;
        i.y.d.l.d(str, "$this$replaceIndent");
        i.y.d.l.d(str2, "newIndent");
        List<String> listZ = q.Z(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listZ) {
            if (!p.q((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i.t.m.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        Integer num = (Integer) i.t.j.C(arrayList2);
        int i2 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listZ.size());
        i.y.c.l<String, String> lVarB = b(str2);
        int iG = i.t.l.g(listZ);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listZ) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i.t.l.n();
            }
            String str4 = (String) obj2;
            if ((i2 == 0 || i2 == iG) && p.q(str4)) {
                str3 = null;
            } else {
                String strC0 = s.C0(str4, iIntValue);
                if (strC0 != null && (strInvoke = lVarB.invoke(strC0)) != null) {
                    str4 = strInvoke;
                }
                str3 = str4;
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i2 = i3;
        }
        String string = ((StringBuilder) t.x(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        i.y.d.l.c(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    public static final String e(String str, String str2, String str3) {
        int i2;
        String strInvoke;
        i.y.d.l.d(str, "$this$replaceIndentByMargin");
        i.y.d.l.d(str2, "newIndent");
        i.y.d.l.d(str3, "marginPrefix");
        if (!(!p.q(str3))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listZ = q.Z(str);
        int length = str.length() + (str2.length() * listZ.size());
        i.y.c.l<String, String> lVarB = b(str2);
        int iG = i.t.l.g(listZ);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : listZ) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                i.t.l.n();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i3 != 0 && i3 != iG) || !p.q(str4)) {
                int length2 = str4.length();
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        i2 = -1;
                        break;
                    }
                    if (!i.d0.b.c(str4.charAt(i5))) {
                        i2 = i5;
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = i2;
                    if (p.A(str4, str3, i2, false, 4, null)) {
                        int length3 = i6 + str3.length();
                        Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        i.y.d.l.c(strSubstring, "(this as java.lang.String).substring(startIndex)");
                    }
                }
                if (strSubstring != null && (strInvoke = lVarB.invoke(strSubstring)) != null) {
                    str4 = strInvoke;
                }
                strSubstring = str4;
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i3 = i4;
        }
        String string = ((StringBuilder) t.x(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        i.y.d.l.c(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    public static String f(String str) {
        i.y.d.l.d(str, "$this$trimIndent");
        return d(str, "");
    }

    public static final String g(String str, String str2) {
        i.y.d.l.d(str, "$this$trimMargin");
        i.y.d.l.d(str2, "marginPrefix");
        return e(str, "", str2);
    }

    public static /* synthetic */ String h(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "|";
        }
        return g(str, str2);
    }
}