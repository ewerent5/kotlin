package com.google.android.gms.internal.ads;

import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class n93 {
    private Bundle a = new Bundle();

    /* renamed from: b, reason: collision with root package name */
    private List<String> f7672b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f7673c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f7674d = -1;

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f7675e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f7676f = new Bundle();

    /* renamed from: g, reason: collision with root package name */
    private final List<String> f7677g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private int f7678h = -1;

    /* renamed from: i, reason: collision with root package name */
    private String f7679i = null;

    /* renamed from: j, reason: collision with root package name */
    private final List<String> f7680j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f7681k = CoreConstants.MILLIS_IN_ONE_MINUTE;

    public final m93 a() {
        return new m93(8, -1L, this.a, -1, this.f7672b, this.f7673c, this.f7674d, false, null, null, null, null, this.f7675e, this.f7676f, this.f7677g, null, null, false, null, this.f7678h, this.f7679i, this.f7680j, this.f7681k);
    }

    public final n93 b(Bundle bundle) {
        this.a = bundle;
        return this;
    }

    public final n93 c(List<String> list) {
        this.f7672b = list;
        return this;
    }

    public final n93 d(boolean z) {
        this.f7673c = z;
        return this;
    }

    public final n93 e(int i2) {
        this.f7674d = i2;
        return this;
    }

    public final n93 f(int i2) {
        this.f7678h = i2;
        return this;
    }

    public final n93 g(String str) {
        this.f7679i = str;
        return this;
    }

    public final n93 h(int i2) {
        this.f7681k = i2;
        return this;
    }
}