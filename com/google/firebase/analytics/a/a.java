package com.google.firebase.analytics.a;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: com.google.firebase.analytics.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0127a {
    }

    public interface b {
        void a(int i2, Bundle bundle);
    }

    public static class c {
        public String a;

        /* renamed from: b, reason: collision with root package name */
        public String f12234b;

        /* renamed from: c, reason: collision with root package name */
        public Object f12235c;

        /* renamed from: d, reason: collision with root package name */
        public String f12236d;

        /* renamed from: e, reason: collision with root package name */
        public long f12237e;

        /* renamed from: f, reason: collision with root package name */
        public String f12238f;

        /* renamed from: g, reason: collision with root package name */
        public Bundle f12239g;

        /* renamed from: h, reason: collision with root package name */
        public String f12240h;

        /* renamed from: i, reason: collision with root package name */
        public Bundle f12241i;

        /* renamed from: j, reason: collision with root package name */
        public long f12242j;

        /* renamed from: k, reason: collision with root package name */
        public String f12243k;

        /* renamed from: l, reason: collision with root package name */
        public Bundle f12244l;

        /* renamed from: m, reason: collision with root package name */
        public long f12245m;
        public boolean n;
        public long o;
    }

    Map<String, Object> a(boolean z);

    void b(c cVar);

    void c(String str, String str2, Bundle bundle);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    int d(String str);

    List<c> e(String str, String str2);

    InterfaceC0127a f(String str, b bVar);
}