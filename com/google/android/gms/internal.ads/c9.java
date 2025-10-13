package com.google.android.gms.internal.ads;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class c9 implements ba<Object> {
    private final d9 a;

    public c9(d9 d9Var) {
        this.a = d9Var;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get(Action.NAME_ATTRIBUTE);
        if (str == null) {
            er.zzi("App event with no name parameter.");
        } else {
            this.a.G(str, map.get("info"));
        }
    }
}