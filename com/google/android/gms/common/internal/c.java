package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class c {
    private final Account a;

    /* renamed from: b */
    private final Set<Scope> f4659b;

    /* renamed from: c */
    private final Set<Scope> f4660c;

    /* renamed from: d */
    private final Map<com.google.android.gms.common.api.a<?>, b> f4661d;

    /* renamed from: e */
    private final int f4662e;

    /* renamed from: f */
    private final View f4663f;

    /* renamed from: g */
    private final String f4664g;

    /* renamed from: h */
    private final String f4665h;

    /* renamed from: i */
    private final e.c.b.b.d.a f4666i;

    /* renamed from: j */
    private final boolean f4667j;

    /* renamed from: k */
    private Integer f4668k;

    public static final class a {
        private Account a;

        /* renamed from: b */
        private c.e.b<Scope> f4669b;

        /* renamed from: c */
        private Map<com.google.android.gms.common.api.a<?>, b> f4670c;

        /* renamed from: e */
        private View f4672e;

        /* renamed from: f */
        private String f4673f;

        /* renamed from: g */
        private String f4674g;

        /* renamed from: i */
        private boolean f4676i;

        /* renamed from: d */
        private int f4671d = 0;

        /* renamed from: h */
        private e.c.b.b.d.a f4675h = e.c.b.b.d.a.a;

        public final a a(Collection<Scope> collection) {
            if (this.f4669b == null) {
                this.f4669b = new c.e.b<>();
            }
            this.f4669b.addAll(collection);
            return this;
        }

        public final c b() {
            return new c(this.a, this.f4669b, this.f4670c, this.f4671d, this.f4672e, this.f4673f, this.f4674g, this.f4675h, this.f4676i);
        }

        public final a c(Account account) {
            this.a = account;
            return this;
        }

        public final a d(String str) {
            this.f4674g = str;
            return this;
        }

        public final a e(String str) {
            this.f4673f = str;
            return this;
        }
    }

    public static final class b {
        public final Set<Scope> a;
    }

    public c(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, b> map, int i2, View view, String str, String str2, e.c.b.b.d.a aVar, boolean z) {
        this.a = account;
        Set<Scope> setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f4659b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f4661d = map;
        this.f4663f = view;
        this.f4662e = i2;
        this.f4664g = str;
        this.f4665h = str2;
        this.f4666i = aVar;
        this.f4667j = z;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator<b> it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().a);
        }
        this.f4660c = Collections.unmodifiableSet(hashSet);
    }

    @Nullable
    public final Account a() {
        return this.a;
    }

    public final Account b() {
        Account account = this.a;
        return account != null ? account : new Account(com.google.android.gms.common.internal.b.DEFAULT_ACCOUNT, "com.google");
    }

    public final Set<Scope> c() {
        return this.f4660c;
    }

    @Nullable
    public final Integer d() {
        return this.f4668k;
    }

    @Nullable
    public final String e() {
        return this.f4665h;
    }

    @Nullable
    public final String f() {
        return this.f4664g;
    }

    public final Set<Scope> g() {
        return this.f4659b;
    }

    @Nullable
    public final e.c.b.b.d.a h() {
        return this.f4666i;
    }

    public final void i(Integer num) {
        this.f4668k = num;
    }
}