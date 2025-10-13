package com.google.firebase.crashlytics.d.o;

import com.google.firebase.crashlytics.d.j.v;
import e.c.b.a.e;
import java.nio.charset.Charset;

/* compiled from: DataTransportCrashlyticsReportSender.java */
/* loaded from: classes.dex */
final /* synthetic */ class b implements e {
    private static final b a = new b();

    private b() {
    }

    public static e a() {
        return a;
    }

    @Override // e.c.b.a.e
    public Object apply(Object obj) {
        return c.a.E((v) obj).getBytes(Charset.forName("UTF-8"));
    }
}