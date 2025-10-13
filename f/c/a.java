package f.c;

import java.util.LinkedHashMap;

/* compiled from: DaggerCollections.java */
/* loaded from: classes3.dex */
public final class a {
    private static int a(int i2) {
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> LinkedHashMap<K, V> b(int i2) {
        return new LinkedHashMap<>(a(i2));
    }
}