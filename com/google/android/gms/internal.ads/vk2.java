package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class vk2 implements ik2 {
    private final lk2 a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9721b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f9722c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9723d;

    vk2(lk2 lk2Var, String str, Object[] objArr) {
        char cCharAt;
        this.a = lk2Var;
        this.f9721b = str;
        this.f9722c = objArr;
        int i2 = 1;
        try {
            cCharAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str2 = new String(charArray);
            try {
                try {
                    cCharAt = str2.charAt(0);
                    str = str2;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    e = e2;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                } catch (StringIndexOutOfBoundsException e3) {
                    e = e3;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                }
            } catch (StringIndexOutOfBoundsException unused2) {
                char[] cArr = new char[str2.length()];
                str2.getChars(0, str2.length(), cArr, 0);
                String str3 = new String(cArr);
                try {
                    cCharAt = str3.charAt(0);
                    str = str3;
                } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e4) {
                    e = e4;
                    str2 = str3;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                }
            }
        }
        if (cCharAt < 55296) {
            this.f9723d = cCharAt;
            return;
        }
        int i3 = cCharAt & 8191;
        int i4 = 13;
        while (true) {
            int i5 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f9723d = (cCharAt2 << i4) | i3;
                return;
            } else {
                i3 |= (cCharAt2 & 8191) << i4;
                i4 += 13;
                i2 = i5;
            }
        }
    }

    final String a() {
        return this.f9721b;
    }

    final Object[] b() {
        return this.f9722c;
    }

    @Override // com.google.android.gms.internal.ads.ik2
    public final boolean zza() {
        return (this.f9723d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.ik2
    public final lk2 zzb() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.ik2
    public final int zzc() {
        return (this.f9723d & 1) == 1 ? 1 : 2;
    }
}