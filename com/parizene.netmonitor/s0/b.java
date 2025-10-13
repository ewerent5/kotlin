package com.parizene.netmonitor.s0;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Helper.java */
/* loaded from: classes3.dex */
public abstract class b<L> {
    protected Handler a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f13666b;

    /* renamed from: c, reason: collision with root package name */
    private final List<L> f13667c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f13668d;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: Helper.java */
    public interface a<L> {
        void a(L l2);
    }

    protected b(Handler handler, Handler handler2) {
        this.a = handler;
        this.f13666b = handler2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(a aVar) {
        ArrayList arrayList;
        synchronized (this.f13667c) {
            arrayList = new ArrayList(this.f13667c);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar.a(it.next());
        }
    }

    public void a(L l2) {
        this.f13667c.add(l2);
    }

    public boolean b() {
        return this.f13668d;
    }

    protected void e(final a aVar) {
        Handler handler = this.f13666b;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.parizene.netmonitor.s0.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13664e.d(aVar);
                }
            });
        } else {
            c(aVar);
        }
    }

    protected abstract void g();

    protected abstract void h();

    public void i(L l2) {
        this.f13667c.remove(l2);
    }

    public void j() {
        if (this.f13668d) {
            return;
        }
        this.f13668d = true;
        g();
    }

    public void k() {
        if (this.f13668d) {
            h();
            this.f13668d = false;
        }
    }
}