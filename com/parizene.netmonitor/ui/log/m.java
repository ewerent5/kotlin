package com.parizene.netmonitor.ui.log;

import android.os.Bundle;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import ch.qos.logback.core.joran.action.Action;

/* compiled from: LogItemsViewModelFactoryByInjection.kt */
/* loaded from: classes3.dex */
public final class m extends androidx.lifecycle.a {

    /* renamed from: d */
    private final j f13919d;

    /* renamed from: e */
    private final com.parizene.netmonitor.k0.e f13920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j jVar, com.parizene.netmonitor.k0.e eVar, androidx.savedstate.b bVar, Bundle bundle) {
        super(bVar, bundle);
        i.y.d.l.d(jVar, "logItemsRepository");
        i.y.d.l.d(eVar, "analyticsTracker");
        i.y.d.l.d(bVar, "owner");
        this.f13919d = jVar;
        this.f13920e = eVar;
    }

    @Override // androidx.lifecycle.a
    protected <T extends x> T d(String str, Class<T> cls, v vVar) {
        i.y.d.l.d(str, Action.KEY_ATTRIBUTE);
        i.y.d.l.d(cls, "modelClass");
        i.y.d.l.d(vVar, "handle");
        return new l(this.f13919d, this.f13920e, vVar);
    }
}