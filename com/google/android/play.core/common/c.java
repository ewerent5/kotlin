package com.google.android.play.core.common;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c {
    private final Map<String, Object> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f12216b = new AtomicBoolean(false);

    private final synchronized void b() {
        this.a.put("assetOnlyUpdates", Boolean.FALSE);
    }

    public final synchronized boolean a() {
        if (!this.f12216b.get()) {
            b();
        }
        Object obj = this.a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}