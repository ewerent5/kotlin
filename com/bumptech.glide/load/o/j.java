package com.bumptech.glide.load.o;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders.java */
/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, List<i>> f3895c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map<String, String> f3896d;

    /* compiled from: LazyHeaders.java */
    public static final class a {
        private static final String a;

        /* renamed from: b, reason: collision with root package name */
        private static final Map<String, List<i>> f3897b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3898c = true;

        /* renamed from: d, reason: collision with root package name */
        private Map<String, List<i>> f3899d = f3897b;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3900e = true;

        static {
            String strB = b();
            a = strB;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strB)) {
                map.put("User-Agent", Collections.singletonList(new b(strB)));
            }
            f3897b = Collections.unmodifiableMap(map);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = property.charAt(i2);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public j a() {
            this.f3898c = true;
            return new j(this.f3899d);
        }
    }

    /* compiled from: LazyHeaders.java */
    static final class b implements i {
        private final String a;

        b(String str) {
            this.a = str;
        }

        @Override // com.bumptech.glide.load.o.i
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
        }
    }

    j(Map<String, List<i>> map) {
        this.f3895c = Collections.unmodifiableMap(map);
    }

    private String b(List<i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strA = list.get(i2).a();
            if (!TextUtils.isEmpty(strA)) {
                sb.append(strA);
                if (i2 != list.size() - 1) {
                    sb.append(CoreConstants.COMMA_CHAR);
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> c() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.f3895c.entrySet()) {
            String strB = b(entry.getValue());
            if (!TextUtils.isEmpty(strB)) {
                map.put(entry.getKey(), strB);
            }
        }
        return map;
    }

    @Override // com.bumptech.glide.load.o.h
    public Map<String, String> a() {
        if (this.f3896d == null) {
            synchronized (this) {
                if (this.f3896d == null) {
                    this.f3896d = Collections.unmodifiableMap(c());
                }
            }
        }
        return this.f3896d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f3895c.equals(((j) obj).f3895c);
        }
        return false;
    }

    public int hashCode() {
        return this.f3895c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f3895c + CoreConstants.CURLY_RIGHT;
    }
}