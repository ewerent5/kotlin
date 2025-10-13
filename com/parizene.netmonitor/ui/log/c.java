package com.parizene.netmonitor.ui.log;

import java.util.Map;

/* compiled from: lambda */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ Map f13870f;

    /* renamed from: g */
    public final /* synthetic */ String f13871g;

    public /* synthetic */ c(Map map, String str) {
        linkedHashMap = map;
        strG = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13869e.G(linkedHashMap, strG);
    }
}