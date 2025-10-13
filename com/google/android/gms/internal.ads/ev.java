package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import j$.lang.Iterable;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ev implements Iterable<dv>, Iterable {

    /* renamed from: e, reason: collision with root package name */
    private final List<dv> f5719e = new ArrayList();

    static final dv e(lt ltVar) {
        Iterator<dv> it = zzs.zzy().iterator();
        while (it.hasNext()) {
            dv next = it.next();
            if (next.a == ltVar) {
                return next;
            }
        }
        return null;
    }

    public static final boolean f(lt ltVar) {
        dv dvVarE = e(ltVar);
        if (dvVarE == null) {
            return false;
        }
        dvVarE.f5521b.o();
        return true;
    }

    public final void a(dv dvVar) {
        this.f5719e.add(dvVar);
    }

    public final void c(dv dvVar) {
        this.f5719e.remove(dvVar);
    }

    @Override // j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public final Iterator<dv> iterator() {
        return this.f5719e.iterator();
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return j$.util.v.o(iterator(), 0);
    }
}