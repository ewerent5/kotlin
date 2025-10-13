package i.a0;

import i.t.y;
import java.util.NoSuchElementException;

/* compiled from: ProgressionIterators.kt */
/* loaded from: classes3.dex */
public final class b extends y {

    /* renamed from: e, reason: collision with root package name */
    private final int f15772e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15773f;

    /* renamed from: g, reason: collision with root package name */
    private int f15774g;

    /* renamed from: h, reason: collision with root package name */
    private final int f15775h;

    public b(int i2, int i3, int i4) {
        this.f15775h = i4;
        this.f15772e = i3;
        boolean z = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.f15773f = z;
        this.f15774g = z ? i2 : i3;
    }

    @Override // i.t.y
    public int b() {
        int i2 = this.f15774g;
        if (i2 != this.f15772e) {
            this.f15774g = this.f15775h + i2;
        } else {
            if (!this.f15773f) {
                throw new NoSuchElementException();
            }
            this.f15773f = false;
        }
        return i2;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        return this.f15773f;
    }
}