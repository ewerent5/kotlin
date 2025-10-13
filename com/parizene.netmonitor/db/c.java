package com.parizene.netmonitor.db;

import com.parizene.netmonitor.db.celllog.i.i;
import i.s;
import java.util.List;

/* compiled from: ClfDao.kt */
/* loaded from: classes.dex */
public interface c {

    /* compiled from: ClfDao.kt */
    public static final class a {
        public static Object a(c cVar, String str, String str2, int i2, long j2, String str3, i.v.d<? super s> dVar) {
            if (cVar.h(str, str2, i2, j2) != null) {
                Object objD = cVar.d(str, str2, i2, j2, str3, dVar);
                return objD == i.v.i.d.c() ? objD : s.a;
            }
            Object objF = cVar.f(new i(str, str2, i2, j2, 0, 0, str3), dVar);
            return objF == i.v.i.d.c() ? objF : s.a;
        }
    }

    int a();

    long[] b(List<? extends i> list);

    List<i> c(long j2, long j3);

    Object d(String str, String str2, int i2, long j2, String str3, i.v.d<? super Integer> dVar);

    List<i> e(String str, String str2, long j2, long j3);

    Object f(i iVar, i.v.d<? super Long> dVar);

    int g(String str, String str2);

    i h(String str, String str2, int i2, long j2);

    Object i(String str, String str2, int i2, long j2, String str3, i.v.d<? super s> dVar);
}