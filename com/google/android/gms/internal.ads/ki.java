package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ki {
    protected static final Comparator<byte[]> a = new kh();

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f6998b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<byte[]> f6999c = new ArrayList(64);

    /* renamed from: d, reason: collision with root package name */
    private int f7000d = 0;

    public ki(int i2) {
    }

    private final synchronized void c() {
        while (this.f7000d > 4096) {
            byte[] bArrRemove = this.f6998b.remove(0);
            this.f6999c.remove(bArrRemove);
            this.f7000d -= bArrRemove.length;
        }
    }

    public final synchronized byte[] a(int i2) {
        for (int i3 = 0; i3 < this.f6999c.size(); i3++) {
            byte[] bArr = this.f6999c.get(i3);
            int length = bArr.length;
            if (length >= i2) {
                this.f7000d -= length;
                this.f6999c.remove(i3);
                this.f6998b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i2];
    }

    public final synchronized void b(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f6998b.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f6999c, bArr, a);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f6999c.add(iBinarySearch, bArr);
                this.f7000d += length;
                c();
            }
        }
    }
}