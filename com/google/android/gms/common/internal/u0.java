package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class u0 implements Parcelable.Creator<g> {
    static void a(g gVar, Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, gVar.f4690e);
        com.google.android.gms.common.internal.w.c.m(parcel, 2, gVar.f4691f);
        com.google.android.gms.common.internal.w.c.m(parcel, 3, gVar.f4692g);
        com.google.android.gms.common.internal.w.c.s(parcel, 4, gVar.f4693h, false);
        com.google.android.gms.common.internal.w.c.l(parcel, 5, gVar.f4694i, false);
        com.google.android.gms.common.internal.w.c.v(parcel, 6, gVar.f4695j, i2, false);
        com.google.android.gms.common.internal.w.c.e(parcel, 7, gVar.f4696k, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 8, gVar.f4697l, i2, false);
        com.google.android.gms.common.internal.w.c.v(parcel, 10, gVar.f4698m, i2, false);
        com.google.android.gms.common.internal.w.c.v(parcel, 11, gVar.n, i2, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 12, gVar.o);
        com.google.android.gms.common.internal.w.c.m(parcel, 13, gVar.p);
        com.google.android.gms.common.internal.w.c.c(parcel, 14, gVar.q);
        com.google.android.gms.common.internal.w.c.s(parcel, 15, gVar.c(), false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        IBinder iBinderU = null;
        Scope[] scopeArr = null;
        Bundle bundleA = null;
        Account account = null;
        com.google.android.gms.common.d[] dVarArr = null;
        com.google.android.gms.common.d[] dVarArr2 = null;
        String strF2 = null;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        boolean zM = false;
        int iV4 = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 1:
                    iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 2:
                    iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 3:
                    iV3 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 4:
                    strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 5:
                    iBinderU = com.google.android.gms.common.internal.w.b.u(parcel, iT);
                    break;
                case 6:
                    scopeArr = (Scope[]) com.google.android.gms.common.internal.w.b.i(parcel, iT, Scope.CREATOR);
                    break;
                case 7:
                    bundleA = com.google.android.gms.common.internal.w.b.a(parcel, iT);
                    break;
                case 8:
                    account = (Account) com.google.android.gms.common.internal.w.b.e(parcel, iT, Account.CREATOR);
                    break;
                case 9:
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
                case 10:
                    dVarArr = (com.google.android.gms.common.d[]) com.google.android.gms.common.internal.w.b.i(parcel, iT, com.google.android.gms.common.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (com.google.android.gms.common.d[]) com.google.android.gms.common.internal.w.b.i(parcel, iT, com.google.android.gms.common.d.CREATOR);
                    break;
                case 12:
                    zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 13:
                    iV4 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 14:
                    zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new g(iV, iV2, iV3, strF, iBinderU, scopeArr, bundleA, account, dVarArr, dVarArr2, zM, iV4, zM2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g[] newArray(int i2) {
        return new g[i2];
    }
}