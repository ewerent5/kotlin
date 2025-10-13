package androidx.recyclerview.widget;

/* compiled from: BatchingListUpdateCallback.java */
/* loaded from: classes.dex */
public class e implements n {
    final n a;

    /* renamed from: b, reason: collision with root package name */
    int f1664b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f1665c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f1666d = -1;

    /* renamed from: e, reason: collision with root package name */
    Object f1667e = null;

    public e(n nVar) {
        this.a = nVar;
    }

    @Override // androidx.recyclerview.widget.n
    public void a(int i2, int i3) {
        e();
        this.a.a(i2, i3);
    }

    @Override // androidx.recyclerview.widget.n
    public void b(int i2, int i3) {
        int i4;
        if (this.f1664b == 1 && i2 >= (i4 = this.f1665c)) {
            int i5 = this.f1666d;
            if (i2 <= i4 + i5) {
                this.f1666d = i5 + i3;
                this.f1665c = Math.min(i2, i4);
                return;
            }
        }
        e();
        this.f1665c = i2;
        this.f1666d = i3;
        this.f1664b = 1;
    }

    @Override // androidx.recyclerview.widget.n
    public void c(int i2, int i3) {
        int i4;
        if (this.f1664b == 2 && (i4 = this.f1665c) >= i2 && i4 <= i2 + i3) {
            this.f1666d += i3;
            this.f1665c = i2;
        } else {
            e();
            this.f1665c = i2;
            this.f1666d = i3;
            this.f1664b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.n
    public void d(int i2, int i3, Object obj) {
        int i4;
        if (this.f1664b == 3) {
            int i5 = this.f1665c;
            int i6 = this.f1666d;
            if (i2 <= i5 + i6 && (i4 = i2 + i3) >= i5 && this.f1667e == obj) {
                this.f1665c = Math.min(i2, i5);
                this.f1666d = Math.max(i6 + i5, i4) - this.f1665c;
                return;
            }
        }
        e();
        this.f1665c = i2;
        this.f1666d = i3;
        this.f1667e = obj;
        this.f1664b = 3;
    }

    public void e() {
        int i2 = this.f1664b;
        if (i2 == 0) {
            return;
        }
        if (i2 == 1) {
            this.a.b(this.f1665c, this.f1666d);
        } else if (i2 == 2) {
            this.a.c(this.f1665c, this.f1666d);
        } else if (i2 == 3) {
            this.a.d(this.f1665c, this.f1666d, this.f1667e);
        }
        this.f1667e = null;
        this.f1664b = 0;
    }
}