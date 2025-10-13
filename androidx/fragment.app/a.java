package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.u;
import androidx.lifecycle.g;
import ch.qos.logback.core.joran.action.ActionConst;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: BackStackRecord.java */
/* loaded from: classes.dex */
final class a extends u implements m.h {
    final m t;
    boolean u;
    int v;

    /* JADX WARN: Illegal instructions before constructor call */
    a(m mVar) {
        i iVarE0 = mVar.e0();
        j<?> jVar = mVar.p;
        super(iVarE0, jVar != null ? jVar.e().getClassLoader() : null);
        this.v = -1;
        this.t = mVar;
    }

    private static boolean H(u.a aVar) {
        Fragment fragment = aVar.f1100b;
        return (fragment == null || !fragment.p || fragment.L == null || fragment.E || fragment.D || !fragment.Z0()) ? false : true;
    }

    public void A(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1097k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.f1094h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1094h));
            }
            if (this.f1090d != 0 || this.f1091e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1090d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1091e));
            }
            if (this.f1092f != 0 || this.f1093g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1092f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1093g));
            }
            if (this.f1098l != 0 || this.f1099m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1098l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1099m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        if (this.f1089c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f1089c.size();
        for (int i2 = 0; i2 < size; i2++) {
            u.a aVar = this.f1089c.get(i2);
            switch (aVar.a) {
                case 0:
                    str2 = ActionConst.NULL;
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f1100b);
            if (z) {
                if (aVar.f1101c != 0 || aVar.f1102d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1101c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1102d));
                }
                if (aVar.f1103e != 0 || aVar.f1104f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1103e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1104f));
                }
            }
        }
    }

    void B() {
        int size = this.f1089c.size();
        for (int i2 = 0; i2 < size; i2++) {
            u.a aVar = this.f1089c.get(i2);
            Fragment fragment = aVar.f1100b;
            if (fragment != null) {
                fragment.x2(this.f1094h);
            }
            switch (aVar.a) {
                case 1:
                    fragment.w2(aVar.f1101c);
                    this.t.S0(fragment, false);
                    this.t.d(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.w2(aVar.f1102d);
                    this.t.K0(fragment);
                    break;
                case 4:
                    fragment.w2(aVar.f1102d);
                    this.t.n0(fragment);
                    break;
                case 5:
                    fragment.w2(aVar.f1101c);
                    this.t.S0(fragment, false);
                    this.t.W0(fragment);
                    break;
                case 6:
                    fragment.w2(aVar.f1102d);
                    this.t.q(fragment);
                    break;
                case 7:
                    fragment.w2(aVar.f1101c);
                    this.t.S0(fragment, false);
                    this.t.h(fragment);
                    break;
                case 8:
                    this.t.U0(fragment);
                    break;
                case 9:
                    this.t.U0(null);
                    break;
                case 10:
                    this.t.T0(fragment, aVar.f1106h);
                    break;
            }
            if (!this.r && aVar.a != 1 && fragment != null) {
                this.t.x0(fragment);
            }
        }
        if (this.r) {
            return;
        }
        m mVar = this.t;
        mVar.y0(mVar.o, true);
    }

    void C(boolean z) {
        for (int size = this.f1089c.size() - 1; size >= 0; size--) {
            u.a aVar = this.f1089c.get(size);
            Fragment fragment = aVar.f1100b;
            if (fragment != null) {
                fragment.x2(m.P0(this.f1094h));
            }
            switch (aVar.a) {
                case 1:
                    fragment.w2(aVar.f1104f);
                    this.t.S0(fragment, true);
                    this.t.K0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case 3:
                    fragment.w2(aVar.f1103e);
                    this.t.d(fragment);
                    break;
                case 4:
                    fragment.w2(aVar.f1103e);
                    this.t.W0(fragment);
                    break;
                case 5:
                    fragment.w2(aVar.f1104f);
                    this.t.S0(fragment, true);
                    this.t.n0(fragment);
                    break;
                case 6:
                    fragment.w2(aVar.f1103e);
                    this.t.h(fragment);
                    break;
                case 7:
                    fragment.w2(aVar.f1104f);
                    this.t.S0(fragment, true);
                    this.t.q(fragment);
                    break;
                case 8:
                    this.t.U0(null);
                    break;
                case 9:
                    this.t.U0(fragment);
                    break;
                case 10:
                    this.t.T0(fragment, aVar.f1105g);
                    break;
            }
            if (!this.r && aVar.a != 3 && fragment != null) {
                this.t.x0(fragment);
            }
        }
        if (this.r || !z) {
            return;
        }
        m mVar = this.t;
        mVar.y0(mVar.o, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment D(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<androidx.fragment.app.u$a> r5 = r0.f1089c
            int r5 = r5.size()
            if (r4 >= r5) goto Lba
            java.util.ArrayList<androidx.fragment.app.u$a> r5 = r0.f1089c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.u$a r5 = (androidx.fragment.app.u.a) r5
            int r6 = r5.a
            r7 = 0
            r8 = 1
            if (r6 == r8) goto Lb2
            r9 = 2
            r10 = 3
            r11 = 9
            if (r6 == r9) goto L58
            if (r6 == r10) goto L41
            r9 = 6
            if (r6 == r9) goto L41
            r7 = 7
            if (r6 == r7) goto Lb2
            r7 = 8
            if (r6 == r7) goto L31
            goto Lb7
        L31:
            java.util.ArrayList<androidx.fragment.app.u$a> r6 = r0.f1089c
            androidx.fragment.app.u$a r7 = new androidx.fragment.app.u$a
            r7.<init>(r11, r3)
            r6.add(r4, r7)
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f1100b
            goto Lb7
        L41:
            androidx.fragment.app.Fragment r6 = r5.f1100b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f1100b
            if (r5 != r3) goto Lb7
            java.util.ArrayList<androidx.fragment.app.u$a> r3 = r0.f1089c
            androidx.fragment.app.u$a r6 = new androidx.fragment.app.u$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r7
            goto Lb7
        L58:
            androidx.fragment.app.Fragment r6 = r5.f1100b
            int r9 = r6.B
            int r12 = r17.size()
            int r12 = r12 - r8
            r13 = 0
        L62:
            if (r12 < 0) goto La2
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.B
            if (r15 != r9) goto L9f
            if (r14 != r6) goto L72
            r13 = 1
            goto L9f
        L72:
            if (r14 != r3) goto L81
            java.util.ArrayList<androidx.fragment.app.u$a> r3 = r0.f1089c
            androidx.fragment.app.u$a r15 = new androidx.fragment.app.u$a
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r7
        L81:
            androidx.fragment.app.u$a r15 = new androidx.fragment.app.u$a
            r15.<init>(r10, r14)
            int r2 = r5.f1101c
            r15.f1101c = r2
            int r2 = r5.f1103e
            r15.f1103e = r2
            int r2 = r5.f1102d
            r15.f1102d = r2
            int r2 = r5.f1104f
            r15.f1104f = r2
            java.util.ArrayList<androidx.fragment.app.u$a> r2 = r0.f1089c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r8
        L9f:
            int r12 = r12 + (-1)
            goto L62
        La2:
            if (r13 == 0) goto Lac
            java.util.ArrayList<androidx.fragment.app.u$a> r2 = r0.f1089c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb7
        Lac:
            r5.a = r8
            r1.add(r6)
            goto Lb7
        Lb2:
            androidx.fragment.app.Fragment r2 = r5.f1100b
            r1.add(r2)
        Lb7:
            int r4 = r4 + r8
            goto L7
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.D(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public String E() {
        return this.f1097k;
    }

    boolean F(int i2) {
        int size = this.f1089c.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.f1089c.get(i3).f1100b;
            int i4 = fragment != null ? fragment.B : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    boolean G(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.f1089c.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.f1089c.get(i5).f1100b;
            int i6 = fragment != null ? fragment.B : 0;
            if (i6 != 0 && i6 != i4) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.f1089c.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.f1089c.get(i8).f1100b;
                        if ((fragment2 != null ? fragment2.B : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    boolean I() {
        for (int i2 = 0; i2 < this.f1089c.size(); i2++) {
            if (H(this.f1089c.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public void J() {
        if (this.s != null) {
            for (int i2 = 0; i2 < this.s.size(); i2++) {
                this.s.get(i2).run();
            }
            this.s = null;
        }
    }

    void K(Fragment.f fVar) {
        for (int i2 = 0; i2 < this.f1089c.size(); i2++) {
            u.a aVar = this.f1089c.get(i2);
            if (H(aVar)) {
                aVar.f1100b.y2(fVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment L(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.u$a> r0 = r5.f1089c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.u$a> r2 = r5.f1089c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.u$a r2 = (androidx.fragment.app.u.a) r2
            int r3 = r2.a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.g$c r3 = r2.f1105g
            r2.f1106h = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f1100b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f1100b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f1100b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.L(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    @Override // androidx.fragment.app.m.h
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (m.p0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1095i) {
            return true;
        }
        this.t.b(this);
        return true;
    }

    @Override // androidx.fragment.app.u
    public int j() {
        return y(false);
    }

    @Override // androidx.fragment.app.u
    public int k() {
        return y(true);
    }

    @Override // androidx.fragment.app.u
    public void l() {
        o();
        this.t.R(this, false);
    }

    @Override // androidx.fragment.app.u
    public void m() {
        o();
        this.t.R(this, true);
    }

    @Override // androidx.fragment.app.u
    public u n(Fragment fragment) {
        m mVar = fragment.w;
        if (mVar == null || mVar == this.t) {
            return super.n(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.u
    void p(int i2, Fragment fragment, String str, int i3) {
        super.p(i2, fragment, str, i3);
        fragment.w = this.t;
    }

    @Override // androidx.fragment.app.u
    public u q(Fragment fragment) {
        m mVar = fragment.w;
        if (mVar == null || mVar == this.t) {
            return super.q(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.f1097k != null) {
            sb.append(" ");
            sb.append(this.f1097k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.u
    public u u(Fragment fragment, g.c cVar) {
        if (fragment.w != this.t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.t);
        }
        g.c cVar2 = g.c.CREATED;
        if (cVar.a(cVar2)) {
            return super.u(fragment, cVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + cVar2);
    }

    @Override // androidx.fragment.app.u
    public u v(Fragment fragment) {
        m mVar;
        if (fragment == null || (mVar = fragment.w) == null || mVar == this.t) {
            return super.v(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void x(int i2) {
        if (this.f1095i) {
            if (m.p0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f1089c.size();
            for (int i3 = 0; i3 < size; i3++) {
                u.a aVar = this.f1089c.get(i3);
                Fragment fragment = aVar.f1100b;
                if (fragment != null) {
                    fragment.v += i2;
                    if (m.p0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1100b + " to " + aVar.f1100b.v);
                    }
                }
            }
        }
    }

    int y(boolean z) {
        if (this.u) {
            throw new IllegalStateException("commit already called");
        }
        if (m.p0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new c.h.k.b("FragmentManager"));
            z("  ", printWriter);
            printWriter.close();
        }
        this.u = true;
        if (this.f1095i) {
            this.v = this.t.f();
        } else {
            this.v = -1;
        }
        this.t.O(this, z);
        return this.v;
    }

    public void z(String str, PrintWriter printWriter) {
        A(str, printWriter, true);
    }
}