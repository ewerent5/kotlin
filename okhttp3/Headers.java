package okhttp3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import i.a0.f;
import i.d0.p;
import i.d0.q;
import i.l;
import i.y.d.b;
import i.y.d.g;
import i.y.d.x;
import j$.C$r8$retargetLibraryMember$virtualDispatch$Date$toInstant$dispatchHolder;
import j$.lang.Iterable;
import j$.time.Instant;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: Headers.kt */
/* loaded from: classes3.dex */
public final class Headers implements Iterable<l<? extends String, ? extends String>>, i.y.d.z.a, Iterable {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    /* compiled from: Headers.kt */
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String str) {
            i.y.d.l.d(str, "line");
            int iQ = q.Q(str, CoreConstants.COLON_CHAR, 0, false, 6, null);
            if (!(iQ != -1)) {
                throw new IllegalArgumentException(("Unexpected header: " + str).toString());
            }
            String strSubstring = str.substring(0, iQ);
            i.y.d.l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            Objects.requireNonNull(strSubstring, "null cannot be cast to non-null type kotlin.CharSequence");
            String string = q.B0(strSubstring).toString();
            String strSubstring2 = str.substring(iQ + 1);
            i.y.d.l.c(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        public final Builder addAll(Headers headers) {
            i.y.d.l.d(headers, "headers");
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                addLenient$okhttp(headers.name(i2), headers.value(i2));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String str) {
            i.y.d.l.d(str, "line");
            int iQ = q.Q(str, CoreConstants.COLON_CHAR, 1, false, 4, null);
            if (iQ != -1) {
                String strSubstring = str.substring(0, iQ);
                i.y.d.l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strSubstring2 = str.substring(iQ + 1);
                i.y.d.l.c(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
            } else if (str.charAt(0) == ':') {
                String strSubstring3 = str.substring(1);
                i.y.d.l.c(strSubstring3, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", strSubstring3);
            } else {
                addLenient$okhttp("", str);
            }
            return this;
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
            i.y.d.l.d(str, Action.NAME_ATTRIBUTE);
            i.y.d.l.d(str2, "value");
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new Headers((String[]) array, null);
        }

        public final String get(String str) {
            i.y.d.l.d(str, Action.NAME_ATTRIBUTE);
            i.a0.a aVarH = f.h(f.g(this.namesAndValues.size() - 2, 0), 2);
            int iA = aVarH.a();
            int iC = aVarH.c();
            int iE = aVarH.e();
            if (iE >= 0) {
                if (iA > iC) {
                    return null;
                }
            } else if (iA < iC) {
                return null;
            }
            while (!p.o(str, this.namesAndValues.get(iA), true)) {
                if (iA == iC) {
                    return null;
                }
                iA += iE;
            }
            return this.namesAndValues.get(iA + 1);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String str) {
            i.y.d.l.d(str, Action.NAME_ATTRIBUTE);
            int i2 = 0;
            while (i2 < this.namesAndValues.size()) {
                if (p.o(str, this.namesAndValues.get(i2), true)) {
                    this.namesAndValues.remove(i2);
                    this.namesAndValues.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        public final Builder set(String str, Date date) {
            i.y.d.l.d(str, Action.NAME_ATTRIBUTE);
            i.y.d.l.d(date, "value");
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String str, Instant instant) {
            i.y.d.l.d(str, Action.NAME_ATTRIBUTE);
            i.y.d.l.d(instant, "value");
            return set(str, new Date(instant.toEpochMilli()));
        }

        public final Builder set(String str, String str2) {
            i.y.d.l.d(str, Action.NAME_ATTRIBUTE);
            i.y.d.l.d(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder add(String str, String str2) {
            i.y.d.l.d(str, Action.NAME_ATTRIBUTE);
            i.y.d.l.d(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder addLenient$okhttp(String str, String str2) {
            i.y.d.l.d(str, Action.NAME_ATTRIBUTE);
            i.y.d.l.d(str2, "value");
            this.namesAndValues.add(str);
            this.namesAndValues.add(q.B0(str2).toString());
            return this;
        }

        public final Builder add(String str, Date date) {
            i.y.d.l.d(str, Action.NAME_ATTRIBUTE);
            i.y.d.l.d(date, "value");
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder add(String str, Instant instant) {
            i.y.d.l.d(str, Action.NAME_ATTRIBUTE);
            i.y.d.l.d(instant, "value");
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }
    }

    /* compiled from: Headers.kt */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (!('!' <= cCharAt && '~' >= cCharAt)) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (!(cCharAt == '\t' || (' ' <= cCharAt && '~' >= cCharAt))) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str2, str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            i.a0.a aVarH = f.h(f.g(strArr.length - 2, 0), 2);
            int iA = aVarH.a();
            int iC = aVarH.c();
            int iE = aVarH.e();
            if (iE >= 0) {
                if (iA > iC) {
                    return null;
                }
            } else if (iA < iC) {
                return null;
            }
            while (!p.o(str, strArr[iA], true)) {
                if (iA == iC) {
                    return null;
                }
                iA += iE;
            }
            return strArr[iA + 1];
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m63deprecated_of(String... strArr) {
            i.y.d.l.d(strArr, "namesAndValues");
            return of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final Headers of(String... strArr) throws CloneNotSupportedException {
            i.y.d.l.d(strArr, "namesAndValues");
            if (!(strArr.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object objClone = strArr.clone();
            Objects.requireNonNull(objClone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            String[] strArr2 = (String[]) objClone;
            int length = strArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!(strArr2[i2] != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                String str = strArr2[i2];
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                strArr2[i2] = q.B0(str).toString();
            }
            i.a0.a aVarH = f.h(f.i(0, strArr2.length), 2);
            int iA = aVarH.a();
            int iC = aVarH.c();
            int iE = aVarH.e();
            if (iE < 0 ? iA >= iC : iA <= iC) {
                while (true) {
                    String str2 = strArr2[iA];
                    String str3 = strArr2[iA + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (iA == iC) {
                        break;
                    }
                    iA += iE;
                }
            }
            return new Headers(strArr2, null);
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m62deprecated_of(Map<String, String> map) {
            i.y.d.l.d(map, "headers");
            return of(map);
        }

        public final Headers of(Map<String, String> map) {
            i.y.d.l.d(map, "$this$toHeaders");
            String[] strArr = new String[map.size() * 2];
            int i2 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Objects.requireNonNull(key, "null cannot be cast to non-null type kotlin.CharSequence");
                String string = q.B0(key).toString();
                Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.CharSequence");
                String string2 = q.B0(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i2] = string;
                strArr[i2 + 1] = string2;
                i2 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m61deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            length += this.namesAndValues[i2].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    @Override // j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    public final String get(String str) {
        i.y.d.l.d(str, Action.NAME_ATTRIBUTE);
        return Companion.get(this.namesAndValues, str);
    }

    public final Date getDate(String str) {
        i.y.d.l.d(str, Action.NAME_ATTRIBUTE);
        String str2 = get(str);
        if (str2 != null) {
            return DatesKt.toHttpDateOrNull(str2);
        }
        return null;
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String str) {
        i.y.d.l.d(str, Action.NAME_ATTRIBUTE);
        Date date = getDate(str);
        if (date != null) {
            return C$r8$retargetLibraryMember$virtualDispatch$Date$toInstant$dispatchHolder.toInstant(date);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public Iterator<l<String, String>> iterator() {
        int size = size();
        l[] lVarArr = new l[size];
        for (int i2 = 0; i2 < size; i2++) {
            lVarArr[i2] = i.p.a(name(i2), value(i2));
        }
        return b.a(lVarArr);
    }

    public final String name(int i2) {
        return this.namesAndValues[i2 * 2];
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(p.p(x.a));
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            treeSet.add(name(i2));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        i.y.d.l.c(setUnmodifiableSet, "Collections.unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        i.t.q.r(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return v.o(iterator(), 0);
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(p.p(x.a));
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String strName = name(i2);
            Locale locale = Locale.US;
            i.y.d.l.c(locale, "Locale.US");
            Objects.requireNonNull(strName, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strName.toLowerCase(locale);
            i.y.d.l.c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i2));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(name(i2));
            sb.append(": ");
            sb.append(value(i2));
            sb.append("\n");
        }
        String string = sb.toString();
        i.y.d.l.c(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String value(int i2) {
        return this.namesAndValues[(i2 * 2) + 1];
    }

    public final List<String> values(String str) {
        i.y.d.l.d(str, Action.NAME_ATTRIBUTE);
        int size = size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            if (p.o(str, name(i2), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i2));
            }
        }
        if (arrayList == null) {
            return i.t.l.f();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        i.y.d.l.c(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public /* synthetic */ Headers(String[] strArr, g gVar) {
        this(strArr);
    }
}