package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: NavDeepLink.java */
/* loaded from: classes.dex */
public final class h {
    private static final Pattern a = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f1303b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, c> f1304c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private Pattern f1305d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1306e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1307f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1308g;

    /* renamed from: h, reason: collision with root package name */
    private final String f1309h;

    /* renamed from: i, reason: collision with root package name */
    private Pattern f1310i;

    /* renamed from: j, reason: collision with root package name */
    private final String f1311j;

    /* compiled from: NavDeepLink.java */
    public static final class a {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f1312b;

        /* renamed from: c, reason: collision with root package name */
        private String f1313c;

        a() {
        }

        public h a() {
            return new h(this.a, this.f1312b, this.f1313c);
        }

        public a b(String str) {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.f1312b = str;
            return this;
        }

        public a c(String str) {
            this.f1313c = str;
            return this;
        }

        public a d(String str) {
            this.a = str;
            return this;
        }
    }

    /* compiled from: NavDeepLink.java */
    private static class b implements Comparable<b> {

        /* renamed from: e, reason: collision with root package name */
        String f1314e;

        /* renamed from: f, reason: collision with root package name */
        String f1315f;

        b(String str) {
            String[] strArrSplit = str.split("/", -1);
            this.f1314e = strArrSplit[0];
            this.f1315f = strArrSplit[1];
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int i2 = this.f1314e.equals(bVar.f1314e) ? 2 : 0;
            return this.f1315f.equals(bVar.f1315f) ? i2 + 1 : i2;
        }
    }

    /* compiled from: NavDeepLink.java */
    private static class c {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<String> f1316b = new ArrayList<>();

        c() {
        }

        void a(String str) {
            this.f1316b.add(str);
        }

        String b(int i2) {
            return this.f1316b.get(i2);
        }

        String c() {
            return this.a;
        }

        void d(String str) {
            this.a = str;
        }

        public int e() {
            return this.f1316b.size();
        }
    }

    h(String str, String str2, String str3) {
        this.f1305d = null;
        this.f1306e = false;
        this.f1307f = false;
        this.f1310i = null;
        this.f1308g = str;
        this.f1309h = str2;
        this.f1311j = str3;
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.f1307f = uri.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!a.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern patternCompile = Pattern.compile("\\{(.+?)\\}");
            if (this.f1307f) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    a(str.substring(0, matcher.start()), sb, patternCompile);
                }
                this.f1306e = false;
                for (String str4 : uri.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = uri.getQueryParameter(str4);
                    Matcher matcher2 = patternCompile.matcher(queryParameter);
                    c cVar = new c();
                    int iEnd = 0;
                    while (matcher2.find()) {
                        cVar.a(matcher2.group(1));
                        sb2.append(Pattern.quote(queryParameter.substring(iEnd, matcher2.start())));
                        sb2.append("(.+?)?");
                        iEnd = matcher2.end();
                    }
                    if (iEnd < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(iEnd)));
                    }
                    cVar.d(sb2.toString().replace(".*", "\\E.*\\Q"));
                    this.f1304c.put(str4, cVar);
                }
            } else {
                this.f1306e = a(str, sb, patternCompile);
            }
            this.f1305d = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"), 2);
        }
        if (str3 != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
                throw new IllegalArgumentException("The given mimeType " + str3 + " does not match to required \"type/subtype\" format");
            }
            b bVar = new b(str3);
            this.f1310i = Pattern.compile(("^(" + bVar.f1314e + "|[*]+)/(" + bVar.f1315f + "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
        }
    }

    private boolean a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(".*");
        int iEnd = 0;
        while (matcher.find()) {
            this.f1303b.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(iEnd, matcher.start())));
            sb.append("(.+?)");
            iEnd = matcher.end();
            z = false;
        }
        if (iEnd < str.length()) {
            sb.append(Pattern.quote(str.substring(iEnd)));
        }
        sb.append("($|(\\?(.)*))");
        return z;
    }

    private boolean f(Bundle bundle, String str, String str2, d dVar) {
        if (dVar == null) {
            bundle.putString(str, str2);
            return false;
        }
        try {
            dVar.a().g(bundle, str, str2);
            return false;
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    public String b() {
        return this.f1309h;
    }

    Bundle c(Uri uri, Map<String, d> map) {
        Matcher matcher;
        Matcher matcher2 = this.f1305d.matcher(uri.toString());
        if (!matcher2.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.f1303b.size();
        int i2 = 0;
        while (i2 < size) {
            String str = this.f1303b.get(i2);
            i2++;
            if (f(bundle, str, Uri.decode(matcher2.group(i2)), map.get(str))) {
                return null;
            }
        }
        if (this.f1307f) {
            for (String str2 : this.f1304c.keySet()) {
                c cVar = this.f1304c.get(str2);
                String queryParameter = uri.getQueryParameter(str2);
                if (queryParameter != null) {
                    matcher = Pattern.compile(cVar.c()).matcher(queryParameter);
                    if (!matcher.matches()) {
                        return null;
                    }
                } else {
                    matcher = null;
                }
                for (int i3 = 0; i3 < cVar.e(); i3++) {
                    String strDecode = matcher != null ? Uri.decode(matcher.group(i3 + 1)) : null;
                    String strB = cVar.b(i3);
                    d dVar = map.get(strB);
                    if (strDecode != null && !strDecode.replaceAll("[{}]", "").equals(strB) && f(bundle, strB, strDecode, dVar)) {
                        return null;
                    }
                }
            }
        }
        return bundle;
    }

    int d(String str) {
        if (this.f1311j == null || !this.f1310i.matcher(str).matches()) {
            return -1;
        }
        return new b(this.f1311j).compareTo(new b(str));
    }

    boolean e() {
        return this.f1306e;
    }
}