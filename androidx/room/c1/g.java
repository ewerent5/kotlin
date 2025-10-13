package androidx.room.c1;

import android.database.Cursor;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TableInfo.java */
/* loaded from: classes.dex */
public final class g {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, a> f1814b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<b> f1815c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<d> f1816d;

    /* compiled from: TableInfo.java */
    public static final class a {
        public final String a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1817b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1818c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f1819d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1820e;

        /* renamed from: f, reason: collision with root package name */
        public final String f1821f;

        /* renamed from: g, reason: collision with root package name */
        private final int f1822g;

        @Deprecated
        public a(String str, String str2, boolean z, int i2) {
            this(str, str2, z, i2, null, 0);
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean b() {
            return this.f1820e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f1820e != aVar.f1820e) {
                    return false;
                }
            } else if (b() != aVar.b()) {
                return false;
            }
            if (!this.a.equals(aVar.a) || this.f1819d != aVar.f1819d) {
                return false;
            }
            if (this.f1822g == 1 && aVar.f1822g == 2 && (str3 = this.f1821f) != null && !str3.equals(aVar.f1821f)) {
                return false;
            }
            if (this.f1822g == 2 && aVar.f1822g == 1 && (str2 = aVar.f1821f) != null && !str2.equals(this.f1821f)) {
                return false;
            }
            int i2 = this.f1822g;
            return (i2 == 0 || i2 != aVar.f1822g || ((str = this.f1821f) == null ? aVar.f1821f == null : str.equals(aVar.f1821f))) && this.f1818c == aVar.f1818c;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.f1818c) * 31) + (this.f1819d ? 1231 : 1237)) * 31) + this.f1820e;
        }

        public String toString() {
            return "Column{name='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", type='" + this.f1817b + CoreConstants.SINGLE_QUOTE_CHAR + ", affinity='" + this.f1818c + CoreConstants.SINGLE_QUOTE_CHAR + ", notNull=" + this.f1819d + ", primaryKeyPosition=" + this.f1820e + ", defaultValue='" + this.f1821f + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
        }

        public a(String str, String str2, boolean z, int i2, String str3, int i3) {
            this.a = str;
            this.f1817b = str2;
            this.f1819d = z;
            this.f1820e = i2;
            this.f1818c = a(str2);
            this.f1821f = str3;
            this.f1822g = i3;
        }
    }

    /* compiled from: TableInfo.java */
    public static final class b {
        public final String a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1823b;

        /* renamed from: c, reason: collision with root package name */
        public final String f1824c;

        /* renamed from: d, reason: collision with root package name */
        public final List<String> f1825d;

        /* renamed from: e, reason: collision with root package name */
        public final List<String> f1826e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.f1823b = str2;
            this.f1824c = str3;
            this.f1825d = Collections.unmodifiableList(list);
            this.f1826e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.f1823b.equals(bVar.f1823b) && this.f1824c.equals(bVar.f1824c) && this.f1825d.equals(bVar.f1825d)) {
                return this.f1826e.equals(bVar.f1826e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.f1823b.hashCode()) * 31) + this.f1824c.hashCode()) * 31) + this.f1825d.hashCode()) * 31) + this.f1826e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", onDelete='" + this.f1823b + CoreConstants.SINGLE_QUOTE_CHAR + ", onUpdate='" + this.f1824c + CoreConstants.SINGLE_QUOTE_CHAR + ", columnNames=" + this.f1825d + ", referenceColumnNames=" + this.f1826e + CoreConstants.CURLY_RIGHT;
        }
    }

    /* compiled from: TableInfo.java */
    static class c implements Comparable<c> {

        /* renamed from: e, reason: collision with root package name */
        final int f1827e;

        /* renamed from: f, reason: collision with root package name */
        final int f1828f;

        /* renamed from: g, reason: collision with root package name */
        final String f1829g;

        /* renamed from: h, reason: collision with root package name */
        final String f1830h;

        c(int i2, int i3, String str, String str2) {
            this.f1827e = i2;
            this.f1828f = i3;
            this.f1829g = str;
            this.f1830h = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i2 = this.f1827e - cVar.f1827e;
            return i2 == 0 ? this.f1828f - cVar.f1828f : i2;
        }
    }

    /* compiled from: TableInfo.java */
    public static final class d {
        public final String a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1831b;

        /* renamed from: c, reason: collision with root package name */
        public final List<String> f1832c;

        public d(String str, boolean z, List<String> list) {
            this.a = str;
            this.f1831b = z;
            this.f1832c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f1831b == dVar.f1831b && this.f1832c.equals(dVar.f1832c)) {
                return this.a.startsWith("index_") ? dVar.a.startsWith("index_") : this.a.equals(dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.a.startsWith("index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.f1831b ? 1 : 0)) * 31) + this.f1832c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", unique=" + this.f1831b + ", columns=" + this.f1832c + CoreConstants.CURLY_RIGHT;
        }
    }

    public g(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.a = str;
        this.f1814b = Collections.unmodifiableMap(map);
        this.f1815c = Collections.unmodifiableSet(set);
        this.f1816d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static g a(c.r.a.b bVar, String str) {
        return new g(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    private static Map<String, a> b(c.r.a.b bVar, String str) {
        Cursor cursorD0 = bVar.d0("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorD0.getColumnCount() > 0) {
                int columnIndex = cursorD0.getColumnIndex(Action.NAME_ATTRIBUTE);
                int columnIndex2 = cursorD0.getColumnIndex("type");
                int columnIndex3 = cursorD0.getColumnIndex("notnull");
                int columnIndex4 = cursorD0.getColumnIndex("pk");
                int columnIndex5 = cursorD0.getColumnIndex("dflt_value");
                while (cursorD0.moveToNext()) {
                    String string = cursorD0.getString(columnIndex);
                    map.put(string, new a(string, cursorD0.getString(columnIndex2), cursorD0.getInt(columnIndex3) != 0, cursorD0.getInt(columnIndex4), cursorD0.getString(columnIndex5), 2));
                }
            }
            return map;
        } finally {
            cursorD0.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < count; i2++) {
            cursor.moveToPosition(i2);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(c.r.a.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorD0 = bVar.d0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorD0.getColumnIndex("id");
            int columnIndex2 = cursorD0.getColumnIndex("seq");
            int columnIndex3 = cursorD0.getColumnIndex("table");
            int columnIndex4 = cursorD0.getColumnIndex("on_delete");
            int columnIndex5 = cursorD0.getColumnIndex("on_update");
            List<c> listC = c(cursorD0);
            int count = cursorD0.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                cursorD0.moveToPosition(i2);
                if (cursorD0.getInt(columnIndex2) == 0) {
                    int i3 = cursorD0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : listC) {
                        if (cVar.f1827e == i3) {
                            arrayList.add(cVar.f1829g);
                            arrayList2.add(cVar.f1830h);
                        }
                    }
                    hashSet.add(new b(cursorD0.getString(columnIndex3), cursorD0.getString(columnIndex4), cursorD0.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            cursorD0.close();
        }
    }

    private static d e(c.r.a.b bVar, String str, boolean z) {
        Cursor cursorD0 = bVar.d0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorD0.getColumnIndex("seqno");
            int columnIndex2 = cursorD0.getColumnIndex("cid");
            int columnIndex3 = cursorD0.getColumnIndex(Action.NAME_ATTRIBUTE);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorD0.moveToNext()) {
                    if (cursorD0.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorD0.getInt(columnIndex)), cursorD0.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z, arrayList);
            }
            return null;
        } finally {
            cursorD0.close();
        }
    }

    private static Set<d> f(c.r.a.b bVar, String str) {
        Cursor cursorD0 = bVar.d0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorD0.getColumnIndex(Action.NAME_ATTRIBUTE);
            int columnIndex2 = cursorD0.getColumnIndex("origin");
            int columnIndex3 = cursorD0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (cursorD0.moveToNext()) {
                    if ("c".equals(cursorD0.getString(columnIndex2))) {
                        String string = cursorD0.getString(columnIndex);
                        boolean z = true;
                        if (cursorD0.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        d dVarE = e(bVar, string, z);
                        if (dVarE == null) {
                            return null;
                        }
                        hashSet.add(dVarE);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            cursorD0.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = this.a;
        if (str == null ? gVar.a != null : !str.equals(gVar.a)) {
            return false;
        }
        Map<String, a> map = this.f1814b;
        if (map == null ? gVar.f1814b != null : !map.equals(gVar.f1814b)) {
            return false;
        }
        Set<b> set2 = this.f1815c;
        if (set2 == null ? gVar.f1815c != null : !set2.equals(gVar.f1815c)) {
            return false;
        }
        Set<d> set3 = this.f1816d;
        if (set3 == null || (set = gVar.f1816d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f1814b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f1815c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", columns=" + this.f1814b + ", foreignKeys=" + this.f1815c + ", indices=" + this.f1816d + CoreConstants.CURLY_RIGHT;
    }
}