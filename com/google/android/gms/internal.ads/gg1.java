package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class gg1 implements Callable {
    private final List a;

    gg1(List list) {
        this.a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<g52> list = this.a;
        JSONArray jSONArray = new JSONArray();
        for (g52 g52Var : list) {
            if (((JSONObject) g52Var.get()) != null) {
                jSONArray.put(g52Var.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new ig1(jSONArray.toString());
    }
}