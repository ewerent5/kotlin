package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.internal.c;
import java.util.Collections;

/* loaded from: classes.dex */
public class e<O extends a.d> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final a<O> f4540b;

    /* renamed from: c, reason: collision with root package name */
    private final O f4541c;

    /* renamed from: d, reason: collision with root package name */
    private final c0<O> f4542d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4543e;

    protected c.a a() {
        Account accountB;
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        c.a aVar = new c.a();
        O o = this.f4541c;
        if (!(o instanceof a.d.b) || (googleSignInAccountA2 = ((a.d.b) o).a()) == null) {
            O o2 = this.f4541c;
            accountB = o2 instanceof a.d.InterfaceC0110a ? ((a.d.InterfaceC0110a) o2).b() : null;
        } else {
            accountB = googleSignInAccountA2.c();
        }
        c.a aVarC = aVar.c(accountB);
        O o3 = this.f4541c;
        return aVarC.a((!(o3 instanceof a.d.b) || (googleSignInAccountA = ((a.d.b) o3).a()) == null) ? Collections.emptySet() : googleSignInAccountA.Q()).d(this.a.getClass().getName()).e(this.a.getPackageName());
    }

    public final int b() {
        return this.f4543e;
    }

    public a.f c(Looper looper, b.a<O> aVar) {
        return this.f4540b.b().a(this.a, looper, a().b(), this.f4541c, aVar, aVar);
    }

    public u d(Context context, Handler handler) {
        return new u(context, handler, a().b());
    }

    public final c0<O> e() {
        return this.f4542d;
    }
}