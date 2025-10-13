package com.bumptech.glide.s;

import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.g;
import com.bumptech.glide.t.j;
import java.security.MessageDigest;

/* compiled from: ObjectKey.java */
/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: b, reason: collision with root package name */
    private final Object f4233b;

    public b(Object obj) {
        this.f4233b = j.d(obj);
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f4233b.toString().getBytes(g.a));
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f4233b.equals(((b) obj).f4233b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f4233b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f4233b + CoreConstants.CURLY_RIGHT;
    }
}