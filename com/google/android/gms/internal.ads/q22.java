package com.google.android.gms.internal.ads;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class q22<K, V> extends d22<K, V> {

    /* renamed from: h, reason: collision with root package name */
    static final d22<Object, Object> f8314h = new q22(null, new Object[0], 0);

    /* renamed from: i, reason: collision with root package name */
    private final transient Object f8315i;

    /* renamed from: j, reason: collision with root package name */
    final transient Object[] f8316j;

    /* renamed from: k, reason: collision with root package name */
    private final transient int f8317k;

    private q22(Object obj, Object[] objArr, int i2) {
        this.f8315i = obj;
        this.f8316j = objArr;
        this.f8317k = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
    
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
    static <K, V> com.google.android.gms.internal.ads.q22<K, V> h(int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q22.h(int, java.lang.Object[]):com.google.android.gms.internal.ads.q22");
    }

    private static IllegalArgumentException i(Object obj, Object obj2, Object[] objArr, int i2) {
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(objArr[i2]);
        String strValueOf4 = String.valueOf(objArr[i2 ^ 1]);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + strValueOf3.length() + strValueOf4.length());
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

    @Override // com.google.android.gms.internal.ads.d22
    final f22<Map.Entry<K, V>> d() {
        return new n22(this, this.f8316j, 0, this.f8317k);
    }

    @Override // com.google.android.gms.internal.ads.d22
    final f22<K> e() {
        return new o22(this, new p22(this.f8316j, 0, this.f8317k));
    }

    @Override // com.google.android.gms.internal.ads.d22
    final y12<V> g() {
        return new p22(this.f8316j, 1, this.f8317k);
    }

    @Override // com.google.android.gms.internal.ads.d22, java.util.Map, j$.util.Map
    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.f8315i;
        Object[] objArr = this.f8316j;
        int i2 = this.f8317k;
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
            int iA = u12.a(obj.hashCode());
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
            int iA2 = u12.a(obj.hashCode());
            while (true) {
                int i5 = iA2 & length2;
                char c2 = (char) sArr[i5];
                if (c2 == 65535) {
                    return null;
                }
                if (objArr[c2].equals(obj)) {
                    return (V) objArr[c2 ^ 1];
                }
                iA2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj2;
            int length3 = iArr.length - 1;
            int iA3 = u12.a(obj.hashCode());
            while (true) {
                int i6 = iA3 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    return null;
                }
                if (objArr[i7].equals(obj)) {
                    return (V) objArr[i7 ^ 1];
                }
                iA3 = i6 + 1;
            }
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.f8317k;
    }
}