package e.c.b.b.c.e;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class f5<K, V> extends s4<K, V> {

    /* renamed from: i, reason: collision with root package name */
    static final s4<Object, Object> f14511i = new f5(null, new Object[0], 0);

    /* renamed from: j, reason: collision with root package name */
    private final transient Object f14512j;

    /* renamed from: k, reason: collision with root package name */
    private final transient Object[] f14513k;

    /* renamed from: l, reason: collision with root package name */
    private final transient int f14514l;

    private f5(Object obj, Object[] objArr, int i2) {
        this.f14512j = obj;
        this.f14513k = objArr;
        this.f14514l = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
    
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <K, V> e.c.b.b.c.e.f5<K, V> d(int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.b.b.c.e.f5.d(int, java.lang.Object[]):e.c.b.b.c.e.f5");
    }

    private static IllegalArgumentException e(Object obj, Object obj2, Object[] objArr, int i2) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(objArr[i2]);
        String strValueOf4 = String.valueOf(objArr[i2 ^ 1]);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    @Override // e.c.b.b.c.e.s4
    final w4<Map.Entry<K, V>> a() {
        return new e5(this, this.f14513k, 0, this.f14514l);
    }

    @Override // e.c.b.b.c.e.s4
    final w4<K> b() {
        return new g5(this, new j5(this.f14513k, 0, this.f14514l));
    }

    @Override // e.c.b.b.c.e.s4
    final n4<V> c() {
        return new j5(this.f14513k, 1, this.f14514l);
    }

    @Override // e.c.b.b.c.e.s4, java.util.Map, j$.util.Map
    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.f14512j;
        Object[] objArr = this.f14513k;
        int i2 = this.f14514l;
        if (obj == null) {
            return null;
        }
        if (i2 == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        }
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof byte[]) {
            byte[] bArr = (byte[]) obj2;
            int length = bArr.length - 1;
            int iA = o4.a(obj.hashCode());
            while (true) {
                int i3 = iA & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return (V) objArr[i4 ^ 1];
                }
                iA = i3 + 1;
            }
        } else if (obj2 instanceof short[]) {
            short[] sArr = (short[]) obj2;
            int length2 = sArr.length - 1;
            int iA2 = o4.a(obj.hashCode());
            while (true) {
                int i5 = iA2 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (objArr[i6].equals(obj)) {
                    return (V) objArr[i6 ^ 1];
                }
                iA2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length - 1;
            int iA3 = o4.a(obj.hashCode());
            while (true) {
                int i7 = iA3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (objArr[i8].equals(obj)) {
                    return (V) objArr[i8 ^ 1];
                }
                iA3 = i7 + 1;
            }
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.f14514l;
    }
}