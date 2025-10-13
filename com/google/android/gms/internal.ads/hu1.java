package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class hu1 {
    private final com.google.android.gms.common.util.f a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, List<String>> f6395b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Long> f6396c = new HashMap();

    public hu1(com.google.android.gms.common.util.f fVar) {
        this.a = fVar;
    }

    private final void d(String str, String str2) {
        if (!this.f6395b.containsKey(str)) {
            this.f6395b.put(str, new ArrayList());
        }
        this.f6395b.get(str).add(str2);
    }

    public final void a(String str) {
        if (!this.f6396c.containsKey(str)) {
            this.f6396c.put(str, Long.valueOf(this.a.c()));
            return;
        }
        long jC = this.a.c();
        long jLongValue = this.f6396c.remove(str).longValue();
        StringBuilder sb = new StringBuilder(20);
        sb.append(jC - jLongValue);
        d(str, sb.toString());
    }

    public final void b(String str, String str2) {
        if (!this.f6396c.containsKey(str)) {
            this.f6396c.put(str, Long.valueOf(this.a.c()));
            return;
        }
        long jC = this.a.c();
        long jLongValue = this.f6396c.remove(str).longValue();
        StringBuilder sb = new StringBuilder(str2.length() + 20);
        sb.append(str2);
        sb.append(jC - jLongValue);
        d(str, sb.toString());
    }

    public final List<gu1> c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.f6395b.entrySet()) {
            int i2 = 0;
            if (entry.getValue().size() > 1) {
                for (String str : entry.getValue()) {
                    String key = entry.getKey();
                    i2++;
                    StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 12);
                    sb.append(key);
                    sb.append(".");
                    sb.append(i2);
                    arrayList.add(new gu1(sb.toString(), str));
                }
            } else {
                arrayList.add(new gu1(entry.getKey(), entry.getValue().get(0)));
            }
        }
        return arrayList;
    }
}