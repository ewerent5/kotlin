package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PendingPost.java */
/* loaded from: classes3.dex */
final class j {
    private static final List<j> a = new ArrayList();

    /* renamed from: b */
    Object f17231b;

    /* renamed from: c */
    q f17232c;

    /* renamed from: d */
    j f17233d;

    private j(Object obj, q qVar) {
        this.f17231b = obj;
        this.f17232c = qVar;
    }

    static j a(q qVar, Object obj) {
        List<j> list = a;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new j(obj, qVar);
            }
            j jVarRemove = list.remove(size - 1);
            jVarRemove.f17231b = obj;
            jVarRemove.f17232c = qVar;
            jVarRemove.f17233d = null;
            return jVarRemove;
        }
    }

    static void b(j jVar) {
        jVar.f17231b = null;
        jVar.f17232c = null;
        jVar.f17233d = null;
        List<j> list = a;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(jVar);
            }
        }
    }
}