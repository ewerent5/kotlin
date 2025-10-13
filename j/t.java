package j;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: Options.kt */
/* loaded from: classes3.dex */
public final class t extends i.t.b<i> implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    public static final a f16482f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private final i[] f16483g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f16484h;

    /* compiled from: Options.kt */
    public static final class a {
        private a() {
        }

        private final void a(long j2, f fVar, int i2, List<? extends i> list, int i3, int i4, List<Integer> list2) {
            int i5;
            int i6;
            int i7;
            int i8;
            f fVar2;
            int i9 = i2;
            if (!(i3 < i4)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i10 = i3; i10 < i4; i10++) {
                if (!(list.get(i10).u() >= i9)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            i iVar = list.get(i3);
            i iVar2 = list.get(i4 - 1);
            if (i9 == iVar.u()) {
                int iIntValue = list2.get(i3).intValue();
                int i11 = i3 + 1;
                i iVar3 = list.get(i11);
                i5 = i11;
                i6 = iIntValue;
                iVar = iVar3;
            } else {
                i5 = i3;
                i6 = -1;
            }
            if (iVar.d(i9) == iVar2.d(i9)) {
                int iMin = Math.min(iVar.u(), iVar2.u());
                int i12 = 0;
                for (int i13 = i9; i13 < iMin && iVar.d(i13) == iVar2.d(i13); i13++) {
                    i12++;
                }
                long jC = j2 + c(fVar) + 2 + i12 + 1;
                fVar.y(-i12);
                fVar.y(i6);
                int i14 = i9 + i12;
                while (i9 < i14) {
                    fVar.y(iVar.d(i9) & 255);
                    i9++;
                }
                if (i5 + 1 == i4) {
                    if (!(i14 == list.get(i5).u())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    fVar.y(list2.get(i5).intValue());
                    return;
                } else {
                    f fVar3 = new f();
                    fVar.y(((int) (c(fVar3) + jC)) * (-1));
                    a(jC, fVar3, i14, list, i5, i4, list2);
                    fVar.m0(fVar3);
                    return;
                }
            }
            int i15 = 1;
            for (int i16 = i5 + 1; i16 < i4; i16++) {
                if (list.get(i16 - 1).d(i9) != list.get(i16).d(i9)) {
                    i15++;
                }
            }
            long jC2 = j2 + c(fVar) + 2 + (i15 * 2);
            fVar.y(i15);
            fVar.y(i6);
            for (int i17 = i5; i17 < i4; i17++) {
                byte bD = list.get(i17).d(i9);
                if (i17 == i5 || bD != list.get(i17 - 1).d(i9)) {
                    fVar.y(bD & 255);
                }
            }
            f fVar4 = new f();
            while (i5 < i4) {
                byte bD2 = list.get(i5).d(i9);
                int i18 = i5 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i4) {
                        i7 = i4;
                        break;
                    } else {
                        if (bD2 != list.get(i19).d(i9)) {
                            i7 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 == i7 && i9 + 1 == list.get(i5).u()) {
                    fVar.y(list2.get(i5).intValue());
                    i8 = i7;
                    fVar2 = fVar4;
                } else {
                    fVar.y(((int) (jC2 + c(fVar4))) * (-1));
                    i8 = i7;
                    fVar2 = fVar4;
                    a(jC2, fVar4, i9 + 1, list, i5, i7, list2);
                }
                fVar4 = fVar2;
                i5 = i8;
            }
            fVar.m0(fVar4);
        }

        static /* synthetic */ void b(a aVar, long j2, f fVar, int i2, List list, int i3, int i4, List list2, int i5, Object obj) {
            aVar.a((i5 & 1) != 0 ? 0L : j2, fVar, (i5 & 4) != 0 ? 0 : i2, list, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? list.size() : i4, list2);
        }

        private final long c(f fVar) {
            return fVar.y0() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final j.t d(j.i... r17) {
            /*
                Method dump skipped, instructions count: 328
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j.t.a.d(j.i[]):j.t");
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    public /* synthetic */ t(i[] iVarArr, int[] iArr, i.y.d.g gVar) {
        this(iVarArr, iArr);
    }

    @Override // i.t.a
    public int a() {
        return this.f16483g.length;
    }

    public /* bridge */ boolean c(i iVar) {
        return super.contains(iVar);
    }

    @Override // i.t.a, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return c((i) obj);
        }
        return false;
    }

    @Override // i.t.b, java.util.List, j$.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public i get(int i2) {
        return this.f16483g[i2];
    }

    public final i[] f() {
        return this.f16483g;
    }

    public final int[] h() {
        return this.f16484h;
    }

    @Override // i.t.b, java.util.List, j$.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return k((i) obj);
        }
        return -1;
    }

    public /* bridge */ int k(i iVar) {
        return super.indexOf(iVar);
    }

    public /* bridge */ int l(i iVar) {
        return super.lastIndexOf(iVar);
    }

    @Override // i.t.b, java.util.List, j$.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return l((i) obj);
        }
        return -1;
    }

    private t(i[] iVarArr, int[] iArr) {
        this.f16483g = iVarArr;
        this.f16484h = iArr;
    }
}