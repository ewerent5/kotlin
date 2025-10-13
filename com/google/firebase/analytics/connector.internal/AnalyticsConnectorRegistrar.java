package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements h {
    @Override // com.google.firebase.components.h
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<com.google.firebase.components.d<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.d.a(com.google.firebase.analytics.a.a.class).b(n.g(com.google.firebase.c.class)).b(n.g(Context.class)).b(n.g(com.google.firebase.l.d.class)).e(a.a).d().c(), com.google.firebase.p.h.a("fire-analytics", "18.0.0"));
    }
}