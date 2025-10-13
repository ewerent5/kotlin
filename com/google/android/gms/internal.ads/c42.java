package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class c42<OutputT> extends o32<OutputT> {

    /* renamed from: l, reason: collision with root package name */
    private static final z32 f5258l;

    /* renamed from: m, reason: collision with root package name */
    private static final Logger f5259m = Logger.getLogger(c42.class.getName());
    private volatile Set<Throwable> n = null;
    private volatile int o;

    static {
        Throwable th;
        z32 b42Var;
        y32 y32Var = null;
        try {
            b42Var = new a42(AtomicReferenceFieldUpdater.newUpdater(c42.class, Set.class, "n"), AtomicIntegerFieldUpdater.newUpdater(c42.class, "o"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            b42Var = new b42(y32Var);
        }
        f5258l = b42Var;
        if (th != null) {
            f5259m.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    c42(int i2) {
        this.o = i2;
    }

    static /* synthetic */ int I(c42 c42Var) {
        int i2 = c42Var.o - 1;
        c42Var.o = i2;
        return i2;
    }

    final Set<Throwable> D() {
        Set<Throwable> set = this.n;
        if (set != null) {
            return set;
        }
        Set<Throwable> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        J(setNewSetFromMap);
        f5258l.a(this, null, setNewSetFromMap);
        return this.n;
    }

    final int E() {
        return f5258l.b(this);
    }

    final void F() {
        this.n = null;
    }

    abstract void J(Set<Throwable> set);
}