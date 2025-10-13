package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzs;
import java.util.ArrayList;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class h21 {
    private static final SparseArray<p73> a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f6272b;

    /* renamed from: c, reason: collision with root package name */
    private final v90 f6273c;

    /* renamed from: d, reason: collision with root package name */
    private final TelephonyManager f6274d;

    /* renamed from: e, reason: collision with root package name */
    private final a21 f6275e;

    /* renamed from: f, reason: collision with root package name */
    private final w11 f6276f;

    /* renamed from: g, reason: collision with root package name */
    private final zzg f6277g;

    /* renamed from: h, reason: collision with root package name */
    private p63 f6278h;

    static {
        SparseArray<p73> sparseArray = new SparseArray<>();
        a = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), p73.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        p73 p73Var = p73.CONNECTING;
        sparseArray.put(iOrdinal, p73Var);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), p73Var);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), p73Var);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), p73.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        p73 p73Var2 = p73.DISCONNECTED;
        sparseArray.put(iOrdinal2, p73Var2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), p73Var2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), p73Var2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), p73Var2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), p73Var2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), p73.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), p73Var);
        }
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), p73Var);
    }

    h21(Context context, v90 v90Var, a21 a21Var, w11 w11Var, zzg zzgVar) {
        this.f6272b = context;
        this.f6273c = v90Var;
        this.f6275e = a21Var;
        this.f6276f = w11Var;
        this.f6274d = (TelephonyManager) context.getSystemService("phone");
        this.f6277g = zzgVar;
    }

    static /* synthetic */ g73 d(h21 h21Var, Bundle bundle) {
        c73 c73Var;
        z63 z63VarH = g73.H();
        int i2 = bundle.getInt("cnt", -2);
        int i3 = bundle.getInt("gnt", 0);
        if (i2 == -1) {
            h21Var.f6278h = p63.ENUM_TRUE;
        } else {
            h21Var.f6278h = p63.ENUM_FALSE;
            if (i2 == 0) {
                z63VarH.q(f73.CELL);
            } else if (i2 != 1) {
                z63VarH.q(f73.NETWORKTYPE_UNSPECIFIED);
            } else {
                z63VarH.q(f73.WIFI);
            }
            switch (i3) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    c73Var = c73.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                case 17:
                    c73Var = c73.THREE_G;
                    break;
                case 13:
                    c73Var = c73.LTE;
                    break;
                default:
                    c73Var = c73.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            z63VarH.r(c73Var);
        }
        return z63VarH.n();
    }

    static /* synthetic */ byte[] f(h21 h21Var, boolean z, ArrayList arrayList, g73 g73Var, p73 p73Var) {
        k73 k73VarT = l73.T();
        k73VarT.u(arrayList);
        k73VarT.x(g(zzs.zze().zzf(h21Var.f6272b.getContentResolver()) != 0));
        k73VarT.y(zzs.zze().zzq(h21Var.f6272b, h21Var.f6274d));
        k73VarT.s(h21Var.f6275e.d());
        k73VarT.t(h21Var.f6275e.h());
        k73VarT.z(h21Var.f6275e.b());
        k73VarT.B(p73Var);
        k73VarT.v(g73Var);
        k73VarT.A(h21Var.f6278h);
        k73VarT.r(g(z));
        k73VarT.q(zzs.zzj().a());
        k73VarT.w(g(zzs.zze().zze(h21Var.f6272b.getContentResolver()) != 0));
        return k73VarT.n().i();
    }

    private static final p63 g(boolean z) {
        return z ? p63.ENUM_TRUE : p63.ENUM_FALSE;
    }

    public final void a(boolean z) {
        y42.o(this.f6273c.a(), new g21(this, z), qr.f8451f);
    }
}