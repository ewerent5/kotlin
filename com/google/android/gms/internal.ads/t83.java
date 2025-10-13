package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class t83 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9090b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f9091c;

    /* renamed from: d, reason: collision with root package name */
    public final List<p43> f9092d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9093e;

    private t83(int i2, byte[] bArr, Map<String, String> map, List<p43> list, boolean z, long j2) {
        this.a = i2;
        this.f9090b = bArr;
        this.f9091c = map;
        if (list == null) {
            this.f9092d = null;
        } else {
            this.f9092d = Collections.unmodifiableList(list);
        }
        this.f9093e = z;
    }

    private static List<p43> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new p43(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public t83(int i2, byte[] bArr, Map<String, String> map, boolean z, long j2) {
        this(i2, bArr, map, a(map), z, j2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t83(int i2, byte[] bArr, boolean z, long j2, List<p43> list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (p43 p43Var : list) {
                treeMap.put(p43Var.a(), p43Var.b());
            }
        }
        this(i2, bArr, treeMap, list, z, j2);
    }

    @Deprecated
    public t83(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, a(map), false, 0L);
    }
}