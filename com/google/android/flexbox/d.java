package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import c.h.l.g;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FlexboxHelper.java */
/* loaded from: classes.dex */
class d {
    private final com.google.android.flexbox.a a;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f4491b;

    /* renamed from: c, reason: collision with root package name */
    int[] f4492c;

    /* renamed from: d, reason: collision with root package name */
    long[] f4493d;

    /* renamed from: e, reason: collision with root package name */
    private long[] f4494e;

    /* compiled from: FlexboxHelper.java */
    static class b {
        List<com.google.android.flexbox.c> a;

        /* renamed from: b, reason: collision with root package name */
        int f4495b;

        b() {
        }

        void a() {
            this.a = null;
            this.f4495b = 0;
        }
    }

    /* compiled from: FlexboxHelper.java */
    private static class c implements Comparable<c> {

        /* renamed from: e, reason: collision with root package name */
        int f4496e;

        /* renamed from: f, reason: collision with root package name */
        int f4497f;

        private c() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i2 = this.f4497f;
            int i3 = cVar.f4497f;
            return i2 != i3 ? i2 - i3 : this.f4496e - cVar.f4496e;
        }

        public String toString() {
            return "Order{order=" + this.f4497f + ", index=" + this.f4496e + CoreConstants.CURLY_RIGHT;
        }
    }

    d(com.google.android.flexbox.a aVar) {
        this.a = aVar;
    }

    private int A(int i2, com.google.android.flexbox.b bVar, int i3) {
        com.google.android.flexbox.a aVar = this.a;
        int iE = aVar.e(i2, aVar.getPaddingLeft() + this.a.getPaddingRight() + bVar.getMarginLeft() + bVar.getMarginRight() + i3, bVar.getWidth());
        int size = View.MeasureSpec.getSize(iE);
        return size > bVar.H() ? View.MeasureSpec.makeMeasureSpec(bVar.H(), View.MeasureSpec.getMode(iE)) : size < bVar.l() ? View.MeasureSpec.makeMeasureSpec(bVar.l(), View.MeasureSpec.getMode(iE)) : iE;
    }

    private int B(com.google.android.flexbox.b bVar, boolean z) {
        return z ? bVar.getMarginBottom() : bVar.getMarginRight();
    }

    private int C(com.google.android.flexbox.b bVar, boolean z) {
        return z ? bVar.getMarginRight() : bVar.getMarginBottom();
    }

    private int D(com.google.android.flexbox.b bVar, boolean z) {
        return z ? bVar.getMarginTop() : bVar.getMarginLeft();
    }

    private int E(com.google.android.flexbox.b bVar, boolean z) {
        return z ? bVar.getMarginLeft() : bVar.getMarginTop();
    }

    private int F(com.google.android.flexbox.b bVar, boolean z) {
        return z ? bVar.getHeight() : bVar.getWidth();
    }

    private int G(com.google.android.flexbox.b bVar, boolean z) {
        return z ? bVar.getWidth() : bVar.getHeight();
    }

    private int H(boolean z) {
        return z ? this.a.getPaddingBottom() : this.a.getPaddingEnd();
    }

    private int I(boolean z) {
        return z ? this.a.getPaddingEnd() : this.a.getPaddingBottom();
    }

    private int J(boolean z) {
        return z ? this.a.getPaddingTop() : this.a.getPaddingStart();
    }

    private int K(boolean z) {
        return z ? this.a.getPaddingStart() : this.a.getPaddingTop();
    }

    private int L(View view, boolean z) {
        return z ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    private int M(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private boolean N(int i2, int i3, com.google.android.flexbox.c cVar) {
        return i2 == i3 - 1 && cVar.c() != 0;
    }

    private boolean P(View view, int i2, int i3, int i4, int i5, com.google.android.flexbox.b bVar, int i6, int i7, int i8) {
        if (this.a.getFlexWrap() == 0) {
            return false;
        }
        if (bVar.E()) {
            return true;
        }
        if (i2 == 0) {
            return false;
        }
        int maxLine = this.a.getMaxLine();
        if (maxLine != -1 && maxLine <= i8 + 1) {
            return false;
        }
        int iH = this.a.h(view, i6, i7);
        if (iH > 0) {
            i5 += iH;
        }
        return i3 < i4 + i5;
    }

    private void T(int i2, int i3, com.google.android.flexbox.c cVar, int i4, int i5, boolean z) {
        int i6;
        int i7;
        int iMax;
        int i8 = cVar.f4482e;
        float f2 = cVar.f4488k;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i4 > i8) {
            return;
        }
        float f4 = (i8 - i4) / f2;
        cVar.f4482e = i5 + cVar.f4483f;
        if (!z) {
            cVar.f4484g = Level.ALL_INT;
        }
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        float f5 = 0.0f;
        while (i9 < cVar.f4485h) {
            int i11 = cVar.o + i9;
            View viewD = this.a.d(i11);
            if (viewD == null || viewD.getVisibility() == 8) {
                i6 = i8;
                i7 = i9;
            } else {
                com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) viewD.getLayoutParams();
                int flexDirection = this.a.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i6 = i8;
                    int i12 = i9;
                    int measuredWidth = viewD.getMeasuredWidth();
                    long[] jArr = this.f4494e;
                    if (jArr != null) {
                        measuredWidth = y(jArr[i11]);
                    }
                    int measuredHeight = viewD.getMeasuredHeight();
                    long[] jArr2 = this.f4494e;
                    if (jArr2 != null) {
                        measuredHeight = x(jArr2[i11]);
                    }
                    if (this.f4491b[i11] || bVar.k() <= 0.0f) {
                        i7 = i12;
                    } else {
                        float fK = measuredWidth - (bVar.k() * f4);
                        i7 = i12;
                        if (i7 == cVar.f4485h - 1) {
                            fK += f5;
                            f5 = 0.0f;
                        }
                        int iRound = Math.round(fK);
                        if (iRound < bVar.l()) {
                            iRound = bVar.l();
                            this.f4491b[i11] = true;
                            cVar.f4488k -= bVar.k();
                            z2 = true;
                        } else {
                            f5 += fK - iRound;
                            double d2 = f5;
                            if (d2 > 1.0d) {
                                iRound++;
                                f5 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound--;
                                f5 += 1.0f;
                            }
                        }
                        int iZ = z(i3, bVar, cVar.f4490m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewD.measure(iMakeMeasureSpec, iZ);
                        int measuredWidth2 = viewD.getMeasuredWidth();
                        int measuredHeight2 = viewD.getMeasuredHeight();
                        Z(i11, iMakeMeasureSpec, iZ, viewD);
                        this.a.f(i11, viewD);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i10, measuredHeight + bVar.getMarginTop() + bVar.getMarginBottom() + this.a.k(viewD));
                    cVar.f4482e += measuredWidth + bVar.getMarginLeft() + bVar.getMarginRight();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewD.getMeasuredHeight();
                    long[] jArr3 = this.f4494e;
                    if (jArr3 != null) {
                        measuredHeight3 = x(jArr3[i11]);
                    }
                    int measuredWidth3 = viewD.getMeasuredWidth();
                    long[] jArr4 = this.f4494e;
                    if (jArr4 != null) {
                        measuredWidth3 = y(jArr4[i11]);
                    }
                    if (this.f4491b[i11] || bVar.k() <= f3) {
                        i6 = i8;
                        i7 = i9;
                    } else {
                        float fK2 = measuredHeight3 - (bVar.k() * f4);
                        if (i9 == cVar.f4485h - 1) {
                            fK2 += f5;
                            f5 = 0.0f;
                        }
                        int iRound2 = Math.round(fK2);
                        if (iRound2 < bVar.z()) {
                            iRound2 = bVar.z();
                            this.f4491b[i11] = true;
                            cVar.f4488k -= bVar.k();
                            i6 = i8;
                            i7 = i9;
                            z2 = true;
                        } else {
                            f5 += fK2 - iRound2;
                            i6 = i8;
                            i7 = i9;
                            double d3 = f5;
                            if (d3 > 1.0d) {
                                iRound2++;
                                f5 -= 1.0f;
                            } else if (d3 < -1.0d) {
                                iRound2--;
                                f5 += 1.0f;
                            }
                        }
                        int iA = A(i2, bVar, cVar.f4490m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewD.measure(iA, iMakeMeasureSpec2);
                        measuredWidth3 = viewD.getMeasuredWidth();
                        int measuredHeight4 = viewD.getMeasuredHeight();
                        Z(i11, iA, iMakeMeasureSpec2, viewD);
                        this.a.f(i11, viewD);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i10, measuredWidth3 + bVar.getMarginLeft() + bVar.getMarginRight() + this.a.k(viewD));
                    cVar.f4482e += measuredHeight3 + bVar.getMarginTop() + bVar.getMarginBottom();
                }
                cVar.f4484g = Math.max(cVar.f4484g, iMax);
                i10 = iMax;
            }
            i9 = i7 + 1;
            i8 = i6;
            f3 = 0.0f;
        }
        int i13 = i8;
        if (!z2 || i13 == cVar.f4482e) {
            return;
        }
        T(i2, i3, cVar, i4, i5, true);
    }

    private int[] U(int i2, List<c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i2];
        int i3 = 0;
        for (c cVar : list) {
            int i4 = cVar.f4496e;
            iArr[i3] = i4;
            sparseIntArray.append(i4, cVar.f4497f);
            i3++;
        }
        return iArr;
    }

    private void V(View view, int i2, int i3) {
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i2 - bVar.getMarginLeft()) - bVar.getMarginRight()) - this.a.k(view), bVar.l()), bVar.H());
        long[] jArr = this.f4494e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? x(jArr[i3]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        Z(i3, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.a.f(i3, view);
    }

    private void W(View view, int i2, int i3) {
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i2 - bVar.getMarginTop()) - bVar.getMarginBottom()) - this.a.k(view), bVar.z()), bVar.F());
        long[] jArr = this.f4494e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? y(jArr[i3]) : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        Z(i3, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.a.f(i3, view);
    }

    private void Z(int i2, int i3, int i4, View view) {
        long[] jArr = this.f4493d;
        if (jArr != null) {
            jArr[i2] = S(i3, i4);
        }
        long[] jArr2 = this.f4494e;
        if (jArr2 != null) {
            jArr2[i2] = S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private void a(List<com.google.android.flexbox.c> list, com.google.android.flexbox.c cVar, int i2, int i3) {
        cVar.f4490m = i3;
        this.a.c(cVar);
        cVar.p = i2;
        list.add(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.b r0 = (com.google.android.flexbox.b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.l()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.l()
        L19:
            r3 = 1
            goto L27
        L1b:
            int r3 = r0.H()
            if (r1 <= r3) goto L26
            int r1 = r0.H()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.z()
            if (r2 >= r5) goto L32
            int r2 = r0.z()
            goto L3e
        L32:
            int r5 = r0.F()
            if (r2 <= r5) goto L3d
            int r2 = r0.F()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.Z(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.a
            r0.f(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.d.i(android.view.View, int):void");
    }

    private List<com.google.android.flexbox.c> k(List<com.google.android.flexbox.c> list, int i2, int i3) {
        int i4 = (i2 - i3) / 2;
        ArrayList arrayList = new ArrayList();
        com.google.android.flexbox.c cVar = new com.google.android.flexbox.c();
        cVar.f4484g = i4;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 == 0) {
                arrayList.add(cVar);
            }
            arrayList.add(list.get(i5));
            if (i5 == list.size() - 1) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    private List<c> l(int i2) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) this.a.g(i3).getLayoutParams();
            c cVar = new c();
            cVar.f4497f = bVar.getOrder();
            cVar.f4496e = i3;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    private void r(int i2) {
        boolean[] zArr = this.f4491b;
        if (zArr == null) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f4491b = new boolean[i2];
        } else {
            if (zArr.length >= i2) {
                Arrays.fill(zArr, false);
                return;
            }
            int length = zArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            this.f4491b = new boolean[i2];
        }
    }

    private void v(CompoundButton compoundButton) throws NoSuchFieldException {
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) compoundButton.getLayoutParams();
        int iL = bVar.l();
        int iZ = bVar.z();
        Drawable drawableA = androidx.core.widget.c.a(compoundButton);
        int minimumWidth = drawableA == null ? 0 : drawableA.getMinimumWidth();
        int minimumHeight = drawableA != null ? drawableA.getMinimumHeight() : 0;
        if (iL == -1) {
            iL = minimumWidth;
        }
        bVar.m(iL);
        if (iZ == -1) {
            iZ = minimumHeight;
        }
        bVar.o(iZ);
    }

    private void w(int i2, int i3, com.google.android.flexbox.c cVar, int i4, int i5, boolean z) {
        int i6;
        int i7;
        int iMax;
        double d2;
        int i8;
        double d3;
        float f2 = cVar.f4487j;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i4 < (i6 = cVar.f4482e)) {
            return;
        }
        float f4 = (i4 - i6) / f2;
        cVar.f4482e = i5 + cVar.f4483f;
        if (!z) {
            cVar.f4484g = Level.ALL_INT;
        }
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        float f5 = 0.0f;
        while (i9 < cVar.f4485h) {
            int i11 = cVar.o + i9;
            View viewD = this.a.d(i11);
            if (viewD == null || viewD.getVisibility() == 8) {
                i7 = i6;
            } else {
                com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) viewD.getLayoutParams();
                int flexDirection = this.a.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int i12 = i6;
                    int measuredWidth = viewD.getMeasuredWidth();
                    long[] jArr = this.f4494e;
                    if (jArr != null) {
                        measuredWidth = y(jArr[i11]);
                    }
                    int measuredHeight = viewD.getMeasuredHeight();
                    long[] jArr2 = this.f4494e;
                    i7 = i12;
                    if (jArr2 != null) {
                        measuredHeight = x(jArr2[i11]);
                    }
                    if (!this.f4491b[i11] && bVar.p() > 0.0f) {
                        float fP = measuredWidth + (bVar.p() * f4);
                        if (i9 == cVar.f4485h - 1) {
                            fP += f5;
                            f5 = 0.0f;
                        }
                        int iRound = Math.round(fP);
                        if (iRound > bVar.H()) {
                            iRound = bVar.H();
                            this.f4491b[i11] = true;
                            cVar.f4487j -= bVar.p();
                            z2 = true;
                        } else {
                            f5 += fP - iRound;
                            double d4 = f5;
                            if (d4 > 1.0d) {
                                iRound++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                iRound--;
                                d2 = d4 + 1.0d;
                            }
                            f5 = (float) d2;
                        }
                        int iZ = z(i3, bVar, cVar.f4490m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewD.measure(iMakeMeasureSpec, iZ);
                        int measuredWidth2 = viewD.getMeasuredWidth();
                        int measuredHeight2 = viewD.getMeasuredHeight();
                        Z(i11, iMakeMeasureSpec, iZ, viewD);
                        this.a.f(i11, viewD);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i10, measuredHeight + bVar.getMarginTop() + bVar.getMarginBottom() + this.a.k(viewD));
                    cVar.f4482e += measuredWidth + bVar.getMarginLeft() + bVar.getMarginRight();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewD.getMeasuredHeight();
                    long[] jArr3 = this.f4494e;
                    if (jArr3 != null) {
                        measuredHeight3 = x(jArr3[i11]);
                    }
                    int measuredWidth3 = viewD.getMeasuredWidth();
                    long[] jArr4 = this.f4494e;
                    if (jArr4 != null) {
                        measuredWidth3 = y(jArr4[i11]);
                    }
                    if (this.f4491b[i11] || bVar.p() <= f3) {
                        i8 = i6;
                    } else {
                        float fP2 = measuredHeight3 + (bVar.p() * f4);
                        if (i9 == cVar.f4485h - 1) {
                            fP2 += f5;
                            f5 = 0.0f;
                        }
                        int iRound2 = Math.round(fP2);
                        if (iRound2 > bVar.F()) {
                            iRound2 = bVar.F();
                            this.f4491b[i11] = true;
                            cVar.f4487j -= bVar.p();
                            i8 = i6;
                            z2 = true;
                        } else {
                            f5 += fP2 - iRound2;
                            i8 = i6;
                            double d5 = f5;
                            if (d5 > 1.0d) {
                                iRound2++;
                                d3 = d5 - 1.0d;
                            } else if (d5 < -1.0d) {
                                iRound2--;
                                d3 = d5 + 1.0d;
                            }
                            f5 = (float) d3;
                        }
                        int iA = A(i2, bVar, cVar.f4490m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewD.measure(iA, iMakeMeasureSpec2);
                        measuredWidth3 = viewD.getMeasuredWidth();
                        int measuredHeight4 = viewD.getMeasuredHeight();
                        Z(i11, iA, iMakeMeasureSpec2, viewD);
                        this.a.f(i11, viewD);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i10, measuredWidth3 + bVar.getMarginLeft() + bVar.getMarginRight() + this.a.k(viewD));
                    cVar.f4482e += measuredHeight3 + bVar.getMarginTop() + bVar.getMarginBottom();
                    i7 = i8;
                }
                cVar.f4484g = Math.max(cVar.f4484g, iMax);
                i10 = iMax;
            }
            i9++;
            i6 = i7;
            f3 = 0.0f;
        }
        int i13 = i6;
        if (!z2 || i13 == cVar.f4482e) {
            return;
        }
        w(i2, i3, cVar, i4, i5, true);
    }

    private int z(int i2, com.google.android.flexbox.b bVar, int i3) {
        com.google.android.flexbox.a aVar = this.a;
        int i4 = aVar.i(i2, aVar.getPaddingTop() + this.a.getPaddingBottom() + bVar.getMarginTop() + bVar.getMarginBottom() + i3, bVar.getHeight());
        int size = View.MeasureSpec.getSize(i4);
        return size > bVar.F() ? View.MeasureSpec.makeMeasureSpec(bVar.F(), View.MeasureSpec.getMode(i4)) : size < bVar.z() ? View.MeasureSpec.makeMeasureSpec(bVar.z(), View.MeasureSpec.getMode(i4)) : i4;
    }

    boolean O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i2 = 0; i2 < flexItemCount; i2++) {
            View viewG = this.a.g(i2);
            if (viewG != null && ((com.google.android.flexbox.b) viewG.getLayoutParams()).getOrder() != sparseIntArray.get(i2)) {
                return true;
            }
        }
        return false;
    }

    void Q(View view, com.google.android.flexbox.c cVar, int i2, int i3, int i4, int i5) {
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (bVar.h() != -1) {
            alignItems = bVar.h();
        }
        int i6 = cVar.f4484g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.a.getFlexWrap() == 2) {
                    view.layout(i2, (i3 - i6) + view.getMeasuredHeight() + bVar.getMarginTop(), i4, (i5 - i6) + view.getMeasuredHeight() + bVar.getMarginTop());
                    return;
                } else {
                    int i7 = i3 + i6;
                    view.layout(i2, (i7 - view.getMeasuredHeight()) - bVar.getMarginBottom(), i4, i7 - bVar.getMarginBottom());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i6 - view.getMeasuredHeight()) + bVar.getMarginTop()) - bVar.getMarginBottom()) / 2;
                if (this.a.getFlexWrap() != 2) {
                    int i8 = i3 + measuredHeight;
                    view.layout(i2, i8, i4, view.getMeasuredHeight() + i8);
                    return;
                } else {
                    int i9 = i3 - measuredHeight;
                    view.layout(i2, i9, i4, view.getMeasuredHeight() + i9);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.a.getFlexWrap() != 2) {
                    int iMax = Math.max(cVar.f4489l - view.getBaseline(), bVar.getMarginTop());
                    view.layout(i2, i3 + iMax, i4, i5 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((cVar.f4489l - view.getMeasuredHeight()) + view.getBaseline(), bVar.getMarginBottom());
                    view.layout(i2, i3 - iMax2, i4, i5 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.a.getFlexWrap() != 2) {
            view.layout(i2, i3 + bVar.getMarginTop(), i4, i5 + bVar.getMarginTop());
        } else {
            view.layout(i2, i3 - bVar.getMarginBottom(), i4, i5 - bVar.getMarginBottom());
        }
    }

    void R(View view, com.google.android.flexbox.c cVar, boolean z, int i2, int i3, int i4, int i5) {
        com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (bVar.h() != -1) {
            alignItems = bVar.h();
        }
        int i6 = cVar.f4484g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (z) {
                    view.layout((i2 - i6) + view.getMeasuredWidth() + bVar.getMarginLeft(), i3, (i4 - i6) + view.getMeasuredWidth() + bVar.getMarginLeft(), i5);
                    return;
                } else {
                    view.layout(((i2 + i6) - view.getMeasuredWidth()) - bVar.getMarginRight(), i3, ((i4 + i6) - view.getMeasuredWidth()) - bVar.getMarginRight(), i5);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i6 - view.getMeasuredWidth()) + g.b(marginLayoutParams)) - g.a(marginLayoutParams)) / 2;
                if (z) {
                    view.layout(i2 - measuredWidth, i3, i4 - measuredWidth, i5);
                    return;
                } else {
                    view.layout(i2 + measuredWidth, i3, i4 + measuredWidth, i5);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i2 - bVar.getMarginRight(), i3, i4 - bVar.getMarginRight(), i5);
        } else {
            view.layout(i2 + bVar.getMarginLeft(), i3, i4 + bVar.getMarginLeft(), i5);
        }
    }

    long S(int i2, int i3) {
        return (i2 & 4294967295L) | (i3 << 32);
    }

    void X() {
        Y(0);
    }

    void Y(int i2) {
        View viewD;
        if (i2 >= this.a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.a.getFlexDirection();
        if (this.a.getAlignItems() != 4) {
            for (com.google.android.flexbox.c cVar : this.a.getFlexLinesInternal()) {
                for (Integer num : cVar.n) {
                    View viewD2 = this.a.d(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        W(viewD2, cVar.f4484g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                        V(viewD2, cVar.f4484g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f4492c;
        List<com.google.android.flexbox.c> flexLinesInternal = this.a.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i3 = iArr != null ? iArr[i2] : 0; i3 < size; i3++) {
            com.google.android.flexbox.c cVar2 = flexLinesInternal.get(i3);
            int i4 = cVar2.f4485h;
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = cVar2.o + i5;
                if (i5 < this.a.getFlexItemCount() && (viewD = this.a.d(i6)) != null && viewD.getVisibility() != 8) {
                    com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) viewD.getLayoutParams();
                    if (bVar.h() == -1 || bVar.h() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            W(viewD, cVar2.f4484g, i6);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            }
                            V(viewD, cVar2.f4484g, i6);
                        }
                    }
                }
            }
        }
    }

    void b(b bVar, int i2, int i3, int i4, int i5, int i6, List<com.google.android.flexbox.c> list) throws NoSuchFieldException {
        int i7;
        b bVar2;
        int i8;
        int i9;
        int i10;
        List<com.google.android.flexbox.c> list2;
        int i11;
        View view;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        com.google.android.flexbox.c cVar;
        int i18;
        int i19 = i2;
        int i20 = i3;
        int i21 = i6;
        boolean zJ = this.a.j();
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        List<com.google.android.flexbox.c> arrayList = list == null ? new ArrayList() : list;
        bVar.a = arrayList;
        boolean z = i21 == -1;
        int iK = K(zJ);
        int I = I(zJ);
        int iJ = J(zJ);
        int iH = H(zJ);
        com.google.android.flexbox.c cVar2 = new com.google.android.flexbox.c();
        int i22 = i5;
        cVar2.o = i22;
        int i23 = I + iK;
        cVar2.f4482e = i23;
        int flexItemCount = this.a.getFlexItemCount();
        boolean z2 = z;
        int i24 = 0;
        int iCombineMeasuredStates = 0;
        int i25 = 0;
        int i26 = Level.ALL_INT;
        while (true) {
            if (i22 >= flexItemCount) {
                i7 = iCombineMeasuredStates;
                bVar2 = bVar;
                break;
            }
            View viewD = this.a.d(i22);
            if (viewD == null) {
                if (N(i22, flexItemCount, cVar2)) {
                    a(arrayList, cVar2, i22, i24);
                }
            } else if (viewD.getVisibility() == 8) {
                cVar2.f4486i++;
                cVar2.f4485h++;
                if (N(i22, flexItemCount, cVar2)) {
                    a(arrayList, cVar2, i22, i24);
                }
            } else {
                if (viewD instanceof CompoundButton) {
                    v((CompoundButton) viewD);
                }
                com.google.android.flexbox.b bVar3 = (com.google.android.flexbox.b) viewD.getLayoutParams();
                int i27 = flexItemCount;
                if (bVar3.h() == 4) {
                    cVar2.n.add(Integer.valueOf(i22));
                }
                int iG = G(bVar3, zJ);
                if (bVar3.u() != -1.0f && mode == 1073741824) {
                    iG = Math.round(size * bVar3.u());
                }
                if (zJ) {
                    int iE = this.a.e(i19, i23 + E(bVar3, true) + C(bVar3, true), iG);
                    i8 = size;
                    i9 = mode;
                    int i28 = this.a.i(i20, iJ + iH + D(bVar3, true) + B(bVar3, true) + i24, F(bVar3, true));
                    viewD.measure(iE, i28);
                    Z(i22, iE, i28, viewD);
                    i10 = iE;
                } else {
                    i8 = size;
                    i9 = mode;
                    int iE2 = this.a.e(i20, iJ + iH + D(bVar3, false) + B(bVar3, false) + i24, F(bVar3, false));
                    int i29 = this.a.i(i19, E(bVar3, false) + i23 + C(bVar3, false), iG);
                    viewD.measure(iE2, i29);
                    Z(i22, iE2, i29, viewD);
                    i10 = i29;
                }
                this.a.f(i22, viewD);
                i(viewD, i22);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewD.getMeasuredState());
                int i30 = i24;
                int i31 = i23;
                com.google.android.flexbox.c cVar3 = cVar2;
                int i32 = i22;
                list2 = arrayList;
                int i33 = i10;
                if (P(viewD, i9, i8, cVar2.f4482e, C(bVar3, zJ) + M(viewD, zJ) + E(bVar3, zJ), bVar3, i32, i25, arrayList.size())) {
                    if (cVar3.c() > 0) {
                        if (i32 > 0) {
                            i18 = i32 - 1;
                            cVar = cVar3;
                        } else {
                            cVar = cVar3;
                            i18 = 0;
                        }
                        a(list2, cVar, i18, i30);
                        i24 = cVar.f4484g + i30;
                    } else {
                        i24 = i30;
                    }
                    if (!zJ) {
                        i11 = i3;
                        view = viewD;
                        i22 = i32;
                        if (bVar3.getWidth() == -1) {
                            com.google.android.flexbox.a aVar = this.a;
                            view.measure(aVar.e(i11, aVar.getPaddingLeft() + this.a.getPaddingRight() + bVar3.getMarginLeft() + bVar3.getMarginRight() + i24, bVar3.getWidth()), i33);
                            i(view, i22);
                        }
                    } else if (bVar3.getHeight() == -1) {
                        com.google.android.flexbox.a aVar2 = this.a;
                        i11 = i3;
                        i22 = i32;
                        view = viewD;
                        view.measure(i33, aVar2.i(i11, aVar2.getPaddingTop() + this.a.getPaddingBottom() + bVar3.getMarginTop() + bVar3.getMarginBottom() + i24, bVar3.getHeight()));
                        i(view, i22);
                    } else {
                        i11 = i3;
                        view = viewD;
                        i22 = i32;
                    }
                    cVar2 = new com.google.android.flexbox.c();
                    cVar2.f4485h = 1;
                    i12 = i31;
                    cVar2.f4482e = i12;
                    cVar2.o = i22;
                    i13 = 0;
                    i14 = Level.ALL_INT;
                } else {
                    i11 = i3;
                    view = viewD;
                    i22 = i32;
                    cVar2 = cVar3;
                    i12 = i31;
                    cVar2.f4485h++;
                    i13 = i25 + 1;
                    i24 = i30;
                    i14 = i26;
                }
                cVar2.q |= bVar3.p() != 0.0f;
                cVar2.r |= bVar3.k() != 0.0f;
                int[] iArr = this.f4492c;
                if (iArr != null) {
                    iArr[i22] = list2.size();
                }
                cVar2.f4482e += M(view, zJ) + E(bVar3, zJ) + C(bVar3, zJ);
                cVar2.f4487j += bVar3.p();
                cVar2.f4488k += bVar3.k();
                this.a.b(view, i22, i13, cVar2);
                int iMax = Math.max(i14, L(view, zJ) + D(bVar3, zJ) + B(bVar3, zJ) + this.a.k(view));
                cVar2.f4484g = Math.max(cVar2.f4484g, iMax);
                if (zJ) {
                    if (this.a.getFlexWrap() != 2) {
                        cVar2.f4489l = Math.max(cVar2.f4489l, view.getBaseline() + bVar3.getMarginTop());
                    } else {
                        cVar2.f4489l = Math.max(cVar2.f4489l, (view.getMeasuredHeight() - view.getBaseline()) + bVar3.getMarginBottom());
                    }
                }
                i15 = i27;
                if (N(i22, i15, cVar2)) {
                    a(list2, cVar2, i22, i24);
                    i24 += cVar2.f4484g;
                }
                i16 = i6;
                if (i16 != -1 && list2.size() > 0) {
                    if (list2.get(list2.size() - 1).p >= i16 && i22 >= i16 && !z2) {
                        i24 = -cVar2.a();
                        i17 = i4;
                        z2 = true;
                    }
                    if (i24 <= i17 && z2) {
                        bVar2 = bVar;
                        i7 = iCombineMeasuredStates;
                        break;
                    }
                    i25 = i13;
                    i26 = iMax;
                    i22++;
                    i19 = i2;
                    flexItemCount = i15;
                    i20 = i11;
                    i23 = i12;
                    arrayList = list2;
                    mode = i9;
                    i21 = i16;
                    size = i8;
                }
                i17 = i4;
                if (i24 <= i17) {
                }
                i25 = i13;
                i26 = iMax;
                i22++;
                i19 = i2;
                flexItemCount = i15;
                i20 = i11;
                i23 = i12;
                arrayList = list2;
                mode = i9;
                i21 = i16;
                size = i8;
            }
            i8 = size;
            i9 = mode;
            i11 = i20;
            i16 = i21;
            list2 = arrayList;
            i12 = i23;
            i15 = flexItemCount;
            i22++;
            i19 = i2;
            flexItemCount = i15;
            i20 = i11;
            i23 = i12;
            arrayList = list2;
            mode = i9;
            i21 = i16;
            size = i8;
        }
        bVar2.f4495b = i7;
    }

    void c(b bVar, int i2, int i3) throws NoSuchFieldException {
        b(bVar, i2, i3, Integer.MAX_VALUE, 0, -1, null);
    }

    void d(b bVar, int i2, int i3, int i4, int i5, List<com.google.android.flexbox.c> list) throws NoSuchFieldException {
        b(bVar, i2, i3, i4, i5, -1, list);
    }

    void e(b bVar, int i2, int i3, int i4, int i5, List<com.google.android.flexbox.c> list) throws NoSuchFieldException {
        b(bVar, i2, i3, i4, 0, i5, list);
    }

    void f(b bVar, int i2, int i3) throws NoSuchFieldException {
        b(bVar, i3, i2, Integer.MAX_VALUE, 0, -1, null);
    }

    void g(b bVar, int i2, int i3, int i4, int i5, List<com.google.android.flexbox.c> list) throws NoSuchFieldException {
        b(bVar, i3, i2, i4, i5, -1, list);
    }

    void h(b bVar, int i2, int i3, int i4, int i5, List<com.google.android.flexbox.c> list) throws NoSuchFieldException {
        b(bVar, i3, i2, i4, 0, i5, list);
    }

    void j(List<com.google.android.flexbox.c> list, int i2) {
        int i3 = this.f4492c[i2];
        if (i3 == -1) {
            i3 = 0;
        }
        for (int size = list.size() - 1; size >= i3; size--) {
            list.remove(size);
        }
        int[] iArr = this.f4492c;
        int length = iArr.length - 1;
        if (i2 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i2, length, -1);
        }
        long[] jArr = this.f4493d;
        int length2 = jArr.length - 1;
        if (i2 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i2, length2, 0L);
        }
    }

    int[] m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.a.getFlexItemCount();
        return U(flexItemCount, l(flexItemCount), sparseIntArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] n(View view, int i2, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.a.getFlexItemCount();
        List<c> listL = l(flexItemCount);
        c cVar = new c();
        if (view == null || !(layoutParams instanceof com.google.android.flexbox.b)) {
            cVar.f4497f = 1;
        } else {
            cVar.f4497f = ((com.google.android.flexbox.b) layoutParams).getOrder();
        }
        if (i2 == -1 || i2 == flexItemCount || i2 >= this.a.getFlexItemCount()) {
            cVar.f4496e = flexItemCount;
        } else {
            cVar.f4496e = i2;
            while (i2 < flexItemCount) {
                listL.get(i2).f4496e++;
                i2++;
            }
        }
        listL.add(cVar);
        return U(flexItemCount + 1, listL, sparseIntArray);
    }

    void o(int i2, int i3, int i4) {
        int mode;
        int size;
        int flexDirection = this.a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i3);
            mode = mode2;
            size = size2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
        }
        List<com.google.android.flexbox.c> flexLinesInternal = this.a.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.a.getSumOfCrossSize() + i4;
            int i5 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f4484g = size - i4;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.a.getAlignContent();
                if (alignContent == 1) {
                    int i6 = size - sumOfCrossSize;
                    com.google.android.flexbox.c cVar = new com.google.android.flexbox.c();
                    cVar.f4484g = i6;
                    flexLinesInternal.add(0, cVar);
                    return;
                }
                if (alignContent == 2) {
                    this.a.setFlexLines(k(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i5 < size4) {
                        arrayList.add(flexLinesInternal.get(i5));
                        if (i5 != flexLinesInternal.size() - 1) {
                            com.google.android.flexbox.c cVar2 = new com.google.android.flexbox.c();
                            if (i5 == flexLinesInternal.size() - 2) {
                                cVar2.f4484g = Math.round(f2 + size3);
                                f2 = 0.0f;
                            } else {
                                cVar2.f4484g = Math.round(size3);
                            }
                            int i7 = cVar2.f4484g;
                            f2 += size3 - i7;
                            if (f2 > 1.0f) {
                                cVar2.f4484g = i7 + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                cVar2.f4484g = i7 - 1;
                                f2 += 1.0f;
                            }
                            arrayList.add(cVar2);
                        }
                        i5++;
                    }
                    this.a.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.a.setFlexLines(k(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    com.google.android.flexbox.c cVar3 = new com.google.android.flexbox.c();
                    cVar3.f4484g = size5;
                    for (com.google.android.flexbox.c cVar4 : flexLinesInternal) {
                        arrayList2.add(cVar3);
                        arrayList2.add(cVar4);
                        arrayList2.add(cVar3);
                    }
                    this.a.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i5 < size7) {
                        com.google.android.flexbox.c cVar5 = flexLinesInternal.get(i5);
                        float f4 = cVar5.f4484g + size6;
                        if (i5 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int iRound = Math.round(f4);
                        f3 += f4 - iRound;
                        if (f3 > 1.0f) {
                            iRound++;
                            f3 -= 1.0f;
                        } else if (f3 < -1.0f) {
                            iRound--;
                            f3 += 1.0f;
                        }
                        cVar5.f4484g = iRound;
                        i5++;
                    }
                }
            }
        }
    }

    void p(int i2, int i3) {
        q(i2, i3, 0);
    }

    void q(int i2, int i3, int i4) {
        int size;
        int paddingLeft;
        int paddingRight;
        r(this.a.getFlexItemCount());
        if (i4 >= this.a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.a.getFlexDirection();
        int flexDirection2 = this.a.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            int largestMainSize = this.a.getLargestMainSize();
            if (mode != 1073741824 && largestMainSize <= size) {
                size = largestMainSize;
            }
            paddingLeft = this.a.getPaddingLeft();
            paddingRight = this.a.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            size = View.MeasureSpec.getSize(i3);
            if (mode2 != 1073741824) {
                size = this.a.getLargestMainSize();
            }
            paddingLeft = this.a.getPaddingTop();
            paddingRight = this.a.getPaddingBottom();
        }
        int i5 = paddingLeft + paddingRight;
        int[] iArr = this.f4492c;
        int i6 = iArr != null ? iArr[i4] : 0;
        List<com.google.android.flexbox.c> flexLinesInternal = this.a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i7 = i6; i7 < size2; i7++) {
            com.google.android.flexbox.c cVar = flexLinesInternal.get(i7);
            int i8 = cVar.f4482e;
            if (i8 < size && cVar.q) {
                w(i2, i3, cVar, size, i5, false);
            } else if (i8 > size && cVar.r) {
                T(i2, i3, cVar, size, i5, false);
            }
        }
    }

    void s(int i2) {
        int[] iArr = this.f4492c;
        if (iArr == null) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f4492c = new int[i2];
        } else if (iArr.length < i2) {
            int length = iArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            this.f4492c = Arrays.copyOf(iArr, i2);
        }
    }

    void t(int i2) {
        long[] jArr = this.f4493d;
        if (jArr == null) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f4493d = new long[i2];
        } else if (jArr.length < i2) {
            int length = jArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            this.f4493d = Arrays.copyOf(jArr, i2);
        }
    }

    void u(int i2) {
        long[] jArr = this.f4494e;
        if (jArr == null) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f4494e = new long[i2];
        } else if (jArr.length < i2) {
            int length = jArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            this.f4494e = Arrays.copyOf(jArr, i2);
        }
    }

    int x(long j2) {
        return (int) (j2 >> 32);
    }

    int y(long j2) {
        return (int) j2;
    }
}