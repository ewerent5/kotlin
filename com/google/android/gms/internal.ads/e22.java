package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class e22<E> extends v12<E> {

    /* renamed from: d, reason: collision with root package name */
    @NullableDecl
    Object[] f5565d;

    /* renamed from: e, reason: collision with root package name */
    private int f5566e;

    e22(int i2) {
        super(i2);
        this.f5565d = new Object[f22.o(i2)];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.x12
    public final /* bridge */ /* synthetic */ x12 a(Object obj) {
        f(obj);
        return this;
    }

    public final e22<E> f(E e2) {
        Objects.requireNonNull(e2);
        if (this.f5565d != null) {
            int iO = f22.o(this.f9621b);
            int length = this.f5565d.length;
            if (iO <= length) {
                int i2 = length - 1;
                int iHashCode = e2.hashCode();
                int iA = u12.a(iHashCode);
                while (true) {
                    int i3 = iA & i2;
                    Object[] objArr = this.f5565d;
                    Object obj = objArr[i3];
                    if (obj != null) {
                        if (obj.equals(e2)) {
                            break;
                        }
                        iA = i3 + 1;
                    } else {
                        objArr[i3] = e2;
                        this.f5566e += iHashCode;
                        super.c(e2);
                        break;
                    }
                }
                return this;
            }
        }
        this.f5565d = null;
        super.c(e2);
        return this;
    }

    public final e22<E> g(Iterable<? extends E> iterable) {
        if (this.f5565d != null) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
        } else {
            super.d(iterable);
        }
        return this;
    }

    public final f22<E> h() {
        f22<E> f22VarX;
        int i2 = this.f9621b;
        if (i2 == 0) {
            return r22.f8565g;
        }
        if (i2 == 1) {
            return new t22(this.a[0]);
        }
        if (this.f5565d == null || f22.o(i2) != this.f5565d.length) {
            f22VarX = f22.x(this.f9621b, this.a);
            this.f9621b = f22VarX.size();
        } else {
            Object[] objArrCopyOf = f22.y(this.f9621b, this.a.length) ? Arrays.copyOf(this.a, this.f9621b) : this.a;
            f22VarX = new r22<>(objArrCopyOf, this.f5566e, this.f5565d, r5.length - 1, this.f9621b);
        }
        this.f9622c = true;
        this.f5565d = null;
        return f22VarX;
    }
}