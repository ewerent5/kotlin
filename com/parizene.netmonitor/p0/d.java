package com.parizene.netmonitor.p0;

import e.c.d.j;
import e.c.d.k;
import e.c.d.l;
import e.c.d.p;
import java.lang.reflect.Type;

/* compiled from: AdsConfigJsonDeserializer.java */
/* loaded from: classes.dex */
public class d implements k<a> {
    @Override // e.c.d.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a a(l lVar, Type type, j jVar) {
        String strF = lVar.c().p("type").f();
        if ("gif_banner".equals(strF)) {
            return (a) jVar.a(lVar, c.class);
        }
        throw new p("Unknown type='" + strF + "'");
    }
}