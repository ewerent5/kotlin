package com.google.android.gms.internal.ads;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class wn2 implements Iterator<f50>, Closeable, g60, j$.util.Iterator {

    /* renamed from: e, reason: collision with root package name */
    private static final f50 f10000e = new vn2("eof ");

    /* renamed from: f, reason: collision with root package name */
    private static final eo2 f10001f = eo2.b(wn2.class);

    /* renamed from: g, reason: collision with root package name */
    protected c20 f10002g;

    /* renamed from: h, reason: collision with root package name */
    protected xn2 f10003h;

    /* renamed from: i, reason: collision with root package name */
    f50 f10004i = null;

    /* renamed from: j, reason: collision with root package name */
    long f10005j = 0;

    /* renamed from: k, reason: collision with root package name */
    long f10006k = 0;

    /* renamed from: l, reason: collision with root package name */
    private final List<f50> f10007l = new ArrayList();

    public void close() {
    }

    public final List<f50> d() {
        return (this.f10003h == null || this.f10004i == f10000e) ? this.f10007l : new do2(this.f10007l, this);
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final void g(xn2 xn2Var, long j2, c20 c20Var) {
        this.f10003h = xn2Var;
        this.f10005j = xn2Var.zzc();
        xn2Var.a(xn2Var.zzc() + j2);
        this.f10006k = xn2Var.zzc();
        this.f10002g = c20Var;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        f50 f50Var = this.f10004i;
        if (f50Var == f10000e) {
            return false;
        }
        if (f50Var != null) {
            return true;
        }
        try {
            this.f10004i = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f10004i = f10000e;
            return false;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final f50 next() {
        f50 f50VarA;
        f50 f50Var = this.f10004i;
        if (f50Var != null && f50Var != f10000e) {
            this.f10004i = null;
            return f50Var;
        }
        xn2 xn2Var = this.f10003h;
        if (xn2Var == null || this.f10005j >= this.f10006k) {
            this.f10004i = f10000e;
            throw new NoSuchElementException();
        }
        try {
            synchronized (xn2Var) {
                this.f10003h.a(this.f10005j);
                f50VarA = this.f10002g.a(this.f10003h, this);
                this.f10005j = this.f10003h.zzc();
            }
            return f50VarA;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i2 = 0; i2 < this.f10007l.size(); i2++) {
            if (i2 > 0) {
                sb.append(";");
            }
            sb.append(this.f10007l.get(i2).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}