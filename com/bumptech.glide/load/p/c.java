package com.bumptech.glide.load.p;

import android.content.Context;
import com.bumptech.glide.load.m;
import com.bumptech.glide.load.n.v;
import java.security.MessageDigest;

/* compiled from: UnitTransformation.java */
/* loaded from: classes.dex */
public final class c<T> implements m<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final m<?> f3951b = new c();

    private c() {
    }

    public static <T> c<T> c() {
        return (c) f3951b;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
    }

    @Override // com.bumptech.glide.load.m
    public v<T> b(Context context, v<T> vVar, int i2, int i3) {
        return vVar;
    }
}