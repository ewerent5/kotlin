package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class qk {

    @Nonnull
    private View a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, WeakReference<View>> f8400b = new HashMap();

    public final qk a(View view) {
        this.a = view;
        return this;
    }

    public final qk b(Map<String, View> map) {
        this.f8400b.clear();
        for (Map.Entry<String, View> entry : map.entrySet()) {
            View value = entry.getValue();
            if (value != null) {
                this.f8400b.put(entry.getKey(), new WeakReference<>(value));
            }
        }
        return this;
    }
}