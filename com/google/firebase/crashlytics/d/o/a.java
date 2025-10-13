package com.google.firebase.crashlytics.d.o;

import com.google.firebase.crashlytics.d.h.p;
import e.c.b.a.h;
import e.c.b.b.e.i;

/* compiled from: DataTransportCrashlyticsReportSender.java */
/* loaded from: classes.dex */
final /* synthetic */ class a implements h {
    private final i a;

    /* renamed from: b, reason: collision with root package name */
    private final p f12715b;

    private a(i iVar, p pVar) {
        this.a = iVar;
        this.f12715b = pVar;
    }

    public static h b(i iVar, p pVar) {
        return new a(iVar, pVar);
    }

    @Override // e.c.b.a.h
    public void a(Exception exc) {
        c.b(this.a, this.f12715b, exc);
    }
}