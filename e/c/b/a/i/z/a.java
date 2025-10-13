package e.c.b.a.i.z;

import android.util.SparseArray;
import e.c.b.a.d;
import java.util.EnumMap;

/* compiled from: PriorityMapping.java */
/* loaded from: classes.dex */
public final class a {
    private static SparseArray<d> a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private static EnumMap<d, Integer> f14335b;

    static {
        EnumMap<d, Integer> enumMap = new EnumMap<>(d.class);
        f14335b = enumMap;
        enumMap.put((EnumMap<d, Integer>) d.DEFAULT, (d) 0);
        f14335b.put((EnumMap<d, Integer>) d.VERY_LOW, (d) 1);
        f14335b.put((EnumMap<d, Integer>) d.HIGHEST, (d) 2);
        for (K k2 : f14335b.keySet()) {
            a.append(f14335b.get(k2).intValue(), k2);
        }
    }

    public static int a(d dVar) {
        Integer num = f14335b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i2) {
        d dVar = a.get(i2);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i2);
    }
}