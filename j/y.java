package j;

import java.util.Arrays;

/* compiled from: Segment.kt */
/* loaded from: classes3.dex */
public final class y {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16500b;

    /* renamed from: c, reason: collision with root package name */
    public int f16501c;

    /* renamed from: d, reason: collision with root package name */
    public int f16502d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16503e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16504f;

    /* renamed from: g, reason: collision with root package name */
    public y f16505g;

    /* renamed from: h, reason: collision with root package name */
    public y f16506h;

    /* compiled from: Segment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    public y() {
        this.f16500b = new byte[8192];
        this.f16504f = true;
        this.f16503e = false;
    }

    public final void a() {
        y yVar = this.f16506h;
        int i2 = 0;
        if (!(yVar != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        i.y.d.l.b(yVar);
        if (yVar.f16504f) {
            int i3 = this.f16502d - this.f16501c;
            y yVar2 = this.f16506h;
            i.y.d.l.b(yVar2);
            int i4 = 8192 - yVar2.f16502d;
            y yVar3 = this.f16506h;
            i.y.d.l.b(yVar3);
            if (!yVar3.f16503e) {
                y yVar4 = this.f16506h;
                i.y.d.l.b(yVar4);
                i2 = yVar4.f16501c;
            }
            if (i3 > i4 + i2) {
                return;
            }
            y yVar5 = this.f16506h;
            i.y.d.l.b(yVar5);
            g(yVar5, i3);
            b();
            z.b(this);
        }
    }

    public final y b() {
        y yVar = this.f16505g;
        if (yVar == this) {
            yVar = null;
        }
        y yVar2 = this.f16506h;
        i.y.d.l.b(yVar2);
        yVar2.f16505g = this.f16505g;
        y yVar3 = this.f16505g;
        i.y.d.l.b(yVar3);
        yVar3.f16506h = this.f16506h;
        this.f16505g = null;
        this.f16506h = null;
        return yVar;
    }

    public final y c(y yVar) {
        i.y.d.l.d(yVar, "segment");
        yVar.f16506h = this;
        yVar.f16505g = this.f16505g;
        y yVar2 = this.f16505g;
        i.y.d.l.b(yVar2);
        yVar2.f16506h = yVar;
        this.f16505g = yVar;
        return yVar;
    }

    public final y d() {
        this.f16503e = true;
        return new y(this.f16500b, this.f16501c, this.f16502d, true, false);
    }

    public final y e(int i2) {
        y yVarC;
        if (!(i2 > 0 && i2 <= this.f16502d - this.f16501c)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i2 >= 1024) {
            yVarC = d();
        } else {
            yVarC = z.c();
            byte[] bArr = this.f16500b;
            byte[] bArr2 = yVarC.f16500b;
            int i3 = this.f16501c;
            i.t.g.e(bArr, bArr2, 0, i3, i3 + i2, 2, null);
        }
        yVarC.f16502d = yVarC.f16501c + i2;
        this.f16501c += i2;
        y yVar = this.f16506h;
        i.y.d.l.b(yVar);
        yVar.c(yVarC);
        return yVarC;
    }

    public final y f() {
        byte[] bArr = this.f16500b;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        i.y.d.l.c(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return new y(bArrCopyOf, this.f16501c, this.f16502d, false, true);
    }

    public final void g(y yVar, int i2) {
        i.y.d.l.d(yVar, "sink");
        if (!yVar.f16504f) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i3 = yVar.f16502d;
        if (i3 + i2 > 8192) {
            if (yVar.f16503e) {
                throw new IllegalArgumentException();
            }
            int i4 = yVar.f16501c;
            if ((i3 + i2) - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = yVar.f16500b;
            i.t.g.e(bArr, bArr, 0, i4, i3, 2, null);
            yVar.f16502d -= yVar.f16501c;
            yVar.f16501c = 0;
        }
        byte[] bArr2 = this.f16500b;
        byte[] bArr3 = yVar.f16500b;
        int i5 = yVar.f16502d;
        int i6 = this.f16501c;
        i.t.g.c(bArr2, bArr3, i5, i6, i6 + i2);
        yVar.f16502d += i2;
        this.f16501c += i2;
    }

    public y(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        i.y.d.l.d(bArr, "data");
        this.f16500b = bArr;
        this.f16501c = i2;
        this.f16502d = i3;
        this.f16503e = z;
        this.f16504f = z2;
    }
}