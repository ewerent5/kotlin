package com.google.android.play.core.assetpacks;

/* loaded from: classes.dex */
public class a extends e.c.b.d.a.f.q {

    /* renamed from: e, reason: collision with root package name */
    private final int f11931e;

    a(int i2) {
        super(String.format("Asset Pack Download Error(%d): %s", Integer.valueOf(i2), com.google.android.play.core.assetpacks.l2.a.a(i2)));
        if (i2 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
        this.f11931e = i2;
    }
}