package com.google.android.gms.common.util;

import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class g {
    @RecentlyNonNull
    @Deprecated
    public static <T> List<T> a() {
        return Collections.emptyList();
    }

    @RecentlyNonNull
    @Deprecated
    public static <T> List<T> b(@RecentlyNonNull T t) {
        return Collections.singletonList(t);
    }

    @RecentlyNonNull
    @Deprecated
    public static <T> List<T> c(@RecentlyNonNull T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : b(tArr[0]) : a();
    }

    @RecentlyNonNull
    public static <K, V> Map<K, V> d(@RecentlyNonNull K k2, @RecentlyNonNull V v, @RecentlyNonNull K k3, @RecentlyNonNull V v2, @RecentlyNonNull K k4, @RecentlyNonNull V v3) {
        Map mapI = i(3, false);
        mapI.put(k2, v);
        mapI.put(k3, v2);
        mapI.put(k4, v3);
        return Collections.unmodifiableMap(mapI);
    }

    @RecentlyNonNull
    public static <K, V> Map<K, V> e(@RecentlyNonNull K[] kArr, @RecentlyNonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            StringBuilder sb = new StringBuilder(66);
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapI = i(length, false);
        for (int i2 = 0; i2 < kArr.length; i2++) {
            mapI.put(kArr[i2], vArr[i2]);
        }
        return Collections.unmodifiableMap(mapI);
    }

    @RecentlyNonNull
    @Deprecated
    public static <T> Set<T> f(@RecentlyNonNull T t, @RecentlyNonNull T t2, @RecentlyNonNull T t3) {
        Set setH = h(3, false);
        setH.add(t);
        setH.add(t2);
        setH.add(t3);
        return Collections.unmodifiableSet(setH);
    }

    @RecentlyNonNull
    @Deprecated
    public static <T> Set<T> g(@RecentlyNonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set setH = h(2, false);
            setH.add(t);
            setH.add(t2);
            return Collections.unmodifiableSet(setH);
        }
        if (length == 3) {
            return f(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setH2 = h(length, false);
            Collections.addAll(setH2, tArr);
            return Collections.unmodifiableSet(setH2);
        }
        T t3 = tArr[0];
        T t4 = tArr[1];
        T t5 = tArr[2];
        T t6 = tArr[3];
        Set setH3 = h(4, false);
        setH3.add(t3);
        setH3.add(t4);
        setH3.add(t5);
        setH3.add(t6);
        return Collections.unmodifiableSet(setH3);
    }

    private static <T> Set<T> h(int i2, boolean z) {
        return i2 <= (true != z ? 256 : 128) ? new c.e.b(i2) : new HashSet(i2, true != z ? 1.0f : 0.75f);
    }

    private static <K, V> Map<K, V> i(int i2, boolean z) {
        return i2 <= 256 ? new c.e.a(i2) : new HashMap(i2, 1.0f);
    }
}