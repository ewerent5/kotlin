package androidx.room;

import c.r.a.c;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* compiled from: SQLiteCopyOpenHelperFactory.java */
/* loaded from: classes.dex */
class x0 implements c.InterfaceC0068c {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final File f2009b;

    /* renamed from: c, reason: collision with root package name */
    private final Callable<InputStream> f2010c;

    /* renamed from: d, reason: collision with root package name */
    private final c.InterfaceC0068c f2011d;

    x0(String str, File file, Callable<InputStream> callable, c.InterfaceC0068c interfaceC0068c) {
        this.a = str;
        this.f2009b = file;
        this.f2010c = callable;
        this.f2011d = interfaceC0068c;
    }

    @Override // c.r.a.c.InterfaceC0068c
    public c.r.a.c a(c.b bVar) {
        return new w0(bVar.a, this.a, this.f2009b, this.f2010c, bVar.f3304c.a, this.f2011d.a(bVar));
    }
}