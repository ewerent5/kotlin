package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class qv {
    private final ArrayList<tz2> a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private long f8482b;

    qv() {
    }

    final long a() throws NumberFormatException {
        Iterator<tz2> it = this.a.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> mapZze = it.next().zze();
            if (mapZze != null) {
                for (Map.Entry<String, List<String>> entry : mapZze.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase(entry.getKey())) {
                            this.f8482b = Math.max(this.f8482b, Long.parseLong(entry.getValue().get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f8482b;
    }

    final void b(tz2 tz2Var) {
        this.a.add(tz2Var);
    }
}