package com.bumptech.glide.load.n.b0;

import com.bumptech.glide.t.k;
import com.bumptech.glide.t.l.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: SafeKeyGenerator.java */
/* loaded from: classes.dex */
public class j {
    private final com.bumptech.glide.t.g<com.bumptech.glide.load.g, String> a = new com.bumptech.glide.t.g<>(1000);

    /* renamed from: b, reason: collision with root package name */
    private final c.h.k.e<b> f3702b = com.bumptech.glide.t.l.a.d(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    class a implements a.d<b> {
        a() {
        }

        @Override // com.bumptech.glide.t.l.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    private static final class b implements a.f {

        /* renamed from: e, reason: collision with root package name */
        final MessageDigest f3703e;

        /* renamed from: f, reason: collision with root package name */
        private final com.bumptech.glide.t.l.c f3704f = com.bumptech.glide.t.l.c.a();

        b(MessageDigest messageDigest) {
            this.f3703e = messageDigest;
        }

        @Override // com.bumptech.glide.t.l.a.f
        public com.bumptech.glide.t.l.c e() {
            return this.f3704f;
        }
    }

    private String a(com.bumptech.glide.load.g gVar) {
        b bVar = (b) com.bumptech.glide.t.j.d(this.f3702b.b());
        try {
            gVar.a(bVar.f3703e);
            return k.v(bVar.f3703e.digest());
        } finally {
            this.f3702b.a(bVar);
        }
    }

    public String b(com.bumptech.glide.load.g gVar) {
        String strG;
        synchronized (this.a) {
            strG = this.a.g(gVar);
        }
        if (strG == null) {
            strG = a(gVar);
        }
        synchronized (this.a) {
            this.a.k(gVar, strG);
        }
        return strG;
    }
}