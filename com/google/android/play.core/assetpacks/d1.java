package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class d1 {
    private static final e.c.b.d.a.b.f a = new e.c.b.d.a.b.f("ExtractorTaskFinder");

    /* renamed from: b, reason: collision with root package name */
    private final a1 f11962b;

    /* renamed from: c, reason: collision with root package name */
    private final v f11963c;

    /* renamed from: d, reason: collision with root package name */
    private final c0 f11964d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.play.core.common.c f11965e;

    d1(a1 a1Var, v vVar, c0 c0Var, com.google.android.play.core.common.c cVar) {
        this.f11962b = a1Var;
        this.f11963c = vVar;
        this.f11964d = c0Var;
        this.f11965e = cVar;
    }

    private final boolean b(x0 x0Var, y0 y0Var) {
        v vVar = this.f11963c;
        w0 w0Var = x0Var.f12189c;
        return new x1(vVar, w0Var.a, x0Var.f12188b, w0Var.f12177b, y0Var.a).l();
    }

    private static boolean c(y0 y0Var) {
        int i2 = y0Var.f12204f;
        return i2 == 1 || i2 == 2;
    }

    final c1 a() {
        c1 u1Var;
        int iK;
        try {
            this.f11962b.a();
            ArrayList arrayList = new ArrayList();
            for (x0 x0Var : this.f11962b.c().values()) {
                if (i1.f(x0Var.f12189c.f12178c)) {
                    arrayList.add(x0Var);
                }
            }
            i0 i0Var = null;
            if (!arrayList.isEmpty()) {
                if (this.f11965e.a()) {
                    Map<String, Long> mapQ = this.f11963c.q();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            u1Var = null;
                            break;
                        }
                        x0 x0Var2 = (x0) it.next();
                        Long l2 = mapQ.get(x0Var2.f12189c.a);
                        if (l2 != null && x0Var2.f12189c.f12177b == l2.longValue()) {
                            a.a("Found promote pack task for session %s with pack %s.", Integer.valueOf(x0Var2.a), x0Var2.f12189c.a);
                            int i2 = x0Var2.a;
                            String str = x0Var2.f12189c.a;
                            this.f11963c.G(str);
                            u1Var = new c1(i2, str, null);
                            break;
                        }
                    }
                    if (u1Var == null) {
                    }
                    return u1Var;
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        u1Var = null;
                        break;
                    }
                    x0 x0Var3 = (x0) it2.next();
                    try {
                        v vVar = this.f11963c;
                        w0 w0Var = x0Var3.f12189c;
                        if (vVar.y(w0Var.a, x0Var3.f12188b, w0Var.f12177b) == x0Var3.f12189c.f12180e.size()) {
                            a.a("Found final move task for session %s with pack %s.", Integer.valueOf(x0Var3.a), x0Var3.f12189c.a);
                            int i3 = x0Var3.a;
                            w0 w0Var2 = x0Var3.f12189c;
                            u1Var = new o1(i3, w0Var2.a, x0Var3.f12188b, w0Var2.f12177b);
                            break;
                        }
                    } catch (IOException e2) {
                        throw new k0(String.format("Failed to check number of completed merges for session %s, pack %s", Integer.valueOf(x0Var3.a), x0Var3.f12189c.a), e2, x0Var3.a);
                    }
                }
                if (u1Var == null) {
                    Iterator it3 = arrayList.iterator();
                    loop3: while (true) {
                        if (!it3.hasNext()) {
                            u1Var = null;
                            break;
                        }
                        x0 x0Var4 = (x0) it3.next();
                        if (i1.f(x0Var4.f12189c.f12178c)) {
                            for (y0 y0Var : x0Var4.f12189c.f12180e) {
                                v vVar2 = this.f11963c;
                                w0 w0Var3 = x0Var4.f12189c;
                                if (vVar2.w(w0Var3.a, x0Var4.f12188b, w0Var3.f12177b, y0Var.a).exists()) {
                                    a.a("Found merge task for session %s with pack %s and slice %s.", Integer.valueOf(x0Var4.a), x0Var4.f12189c.a, y0Var.a);
                                    int i4 = x0Var4.a;
                                    w0 w0Var4 = x0Var4.f12189c;
                                    u1Var = new l1(i4, w0Var4.a, x0Var4.f12188b, w0Var4.f12177b, y0Var.a);
                                    break loop3;
                                }
                            }
                        }
                    }
                    if (u1Var == null) {
                        Iterator it4 = arrayList.iterator();
                        loop5: while (true) {
                            if (!it4.hasNext()) {
                                u1Var = null;
                                break;
                            }
                            x0 x0Var5 = (x0) it4.next();
                            if (i1.f(x0Var5.f12189c.f12178c)) {
                                for (y0 y0Var2 : x0Var5.f12189c.f12180e) {
                                    if (b(x0Var5, y0Var2)) {
                                        v vVar3 = this.f11963c;
                                        w0 w0Var5 = x0Var5.f12189c;
                                        if (vVar3.v(w0Var5.a, x0Var5.f12188b, w0Var5.f12177b, y0Var2.a).exists()) {
                                            a.a("Found verify task for session %s with pack %s and slice %s.", Integer.valueOf(x0Var5.a), x0Var5.f12189c.a, y0Var2.a);
                                            int i5 = x0Var5.a;
                                            w0 w0Var6 = x0Var5.f12189c;
                                            u1Var = new a2(i5, w0Var6.a, x0Var5.f12188b, w0Var6.f12177b, y0Var2.a, y0Var2.f12200b);
                                            break loop5;
                                        }
                                    }
                                }
                            }
                        }
                        if (u1Var == null) {
                            Iterator it5 = arrayList.iterator();
                            loop7: while (true) {
                                if (!it5.hasNext()) {
                                    i0Var = null;
                                    break;
                                }
                                x0 x0Var6 = (x0) it5.next();
                                if (i1.f(x0Var6.f12189c.f12178c)) {
                                    Iterator<y0> it6 = x0Var6.f12189c.f12180e.iterator();
                                    while (it6.hasNext()) {
                                        y0 next = it6.next();
                                        if (!c(next)) {
                                            v vVar4 = this.f11963c;
                                            w0 w0Var7 = x0Var6.f12189c;
                                            Iterator<y0> it7 = it6;
                                            try {
                                                iK = new x1(vVar4, w0Var7.a, x0Var6.f12188b, w0Var7.f12177b, next.a).k();
                                            } catch (IOException e3) {
                                                a.b("Slice checkpoint corrupt, restarting extraction. %s", e3);
                                                iK = 0;
                                            }
                                            if (iK != -1 && next.f12202d.get(iK).a) {
                                                a.a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", Integer.valueOf(next.f12203e), Integer.valueOf(x0Var6.a), x0Var6.f12189c.a, next.a, Integer.valueOf(iK));
                                                InputStream inputStreamA = this.f11964d.a(x0Var6.a, x0Var6.f12189c.a, next.a, iK);
                                                int i6 = x0Var6.a;
                                                w0 w0Var8 = x0Var6.f12189c;
                                                String str2 = w0Var8.a;
                                                int i7 = x0Var6.f12188b;
                                                long j2 = w0Var8.f12177b;
                                                String str3 = next.a;
                                                int i8 = next.f12203e;
                                                int size = next.f12202d.size();
                                                w0 w0Var9 = x0Var6.f12189c;
                                                i0Var = new i0(i6, str2, i7, j2, str3, i8, iK, size, w0Var9.f12179d, w0Var9.f12178c, inputStreamA);
                                                break loop7;
                                            }
                                            it6 = it7;
                                        }
                                    }
                                }
                            }
                            if (i0Var == null) {
                                Iterator it8 = arrayList.iterator();
                                loop9: while (true) {
                                    if (!it8.hasNext()) {
                                        u1Var = null;
                                        break;
                                    }
                                    x0 x0Var7 = (x0) it8.next();
                                    if (i1.f(x0Var7.f12189c.f12178c)) {
                                        for (y0 y0Var3 : x0Var7.f12189c.f12180e) {
                                            if (c(y0Var3) && y0Var3.f12202d.get(0).a && !b(x0Var7, y0Var3)) {
                                                a.a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", Integer.valueOf(y0Var3.f12204f), Integer.valueOf(x0Var7.a), x0Var7.f12189c.a, y0Var3.a);
                                                InputStream inputStreamA2 = this.f11964d.a(x0Var7.a, x0Var7.f12189c.a, y0Var3.a, 0);
                                                int i9 = x0Var7.a;
                                                String str4 = x0Var7.f12189c.a;
                                                u1Var = new u1(i9, str4, this.f11963c.G(str4), this.f11963c.H(x0Var7.f12189c.a), x0Var7.f12188b, x0Var7.f12189c.f12177b, y0Var3.f12204f, y0Var3.a, y0Var3.f12201c, inputStreamA2);
                                                break loop9;
                                            }
                                        }
                                    }
                                }
                                if (u1Var == null) {
                                    this.f11962b.b();
                                    return null;
                                }
                            }
                        }
                    }
                }
                return u1Var;
            }
            return i0Var;
        } finally {
            this.f11962b.b();
        }
    }
}