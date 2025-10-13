package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzs;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class p21 {
    private final w43 a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f8066b;

    /* renamed from: c, reason: collision with root package name */
    private final w11 f8067c;

    /* renamed from: d, reason: collision with root package name */
    private final kr f8068d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8069e;

    /* renamed from: f, reason: collision with root package name */
    private final cu1 f8070f;

    /* renamed from: g, reason: collision with root package name */
    private final zzg f8071g = zzs.zzg().l();

    public p21(Context context, kr krVar, w43 w43Var, w11 w11Var, String str, cu1 cu1Var) {
        this.f8066b = context;
        this.f8068d = krVar;
        this.a = w43Var;
        this.f8067c = w11Var;
        this.f8069e = str;
        this.f8070f = cu1Var;
    }

    private static final void c(SQLiteDatabase sQLiteDatabase, ArrayList<l73> arrayList) {
        int size = arrayList.size();
        long jF = 0;
        for (int i2 = 0; i2 < size; i2++) {
            l73 l73Var = arrayList.get(i2);
            if (l73Var.G() == p63.ENUM_TRUE && l73Var.F() > jF) {
                jF = l73Var.F();
            }
        }
        if (jF != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jF));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final void a(final boolean z) {
        try {
            this.f8067c.a(new vs1(this, z) { // from class: com.google.android.gms.internal.ads.k21
                private final p21 a;

                /* renamed from: b, reason: collision with root package name */
                private final boolean f6929b;

                {
                    this.a = this;
                    this.f6929b = z;
                }

                @Override // com.google.android.gms.internal.ads.vs1
                public final Object zza(Object obj) {
                    this.a.b(this.f6929b, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            er.zzf(strValueOf.length() != 0 ? "Error in offline signals database startup: ".concat(strValueOf) : new String("Error in offline signals database startup: "));
        }
    }

    final /* synthetic */ Void b(boolean z, SQLiteDatabase sQLiteDatabase) {
        if (z) {
            this.f8066b.deleteDatabase("OfflineUpload.db");
        } else {
            if (((Boolean) c.c().b(w3.I5)).booleanValue()) {
                bu1 bu1VarA = bu1.a("oa_upload");
                bu1VarA.c("oa_failed_reqs", String.valueOf(j21.b(sQLiteDatabase, 0)));
                bu1VarA.c("oa_total_reqs", String.valueOf(j21.b(sQLiteDatabase, 1)));
                bu1VarA.c("oa_upload_time", String.valueOf(zzs.zzj().a()));
                bu1VarA.c("oa_last_successful_time", String.valueOf(j21.c(sQLiteDatabase, 2)));
                bu1VarA.c("oa_session_id", this.f8071g.zzB() ? "" : this.f8069e);
                this.f8070f.b(bu1VarA);
                ArrayList<l73> arrayListA = j21.a(sQLiteDatabase);
                c(sQLiteDatabase, arrayListA);
                int size = arrayListA.size();
                for (int i2 = 0; i2 < size; i2++) {
                    l73 l73Var = arrayListA.get(i2);
                    bu1 bu1VarA2 = bu1.a("oa_signals");
                    bu1VarA2.c("oa_session_id", this.f8071g.zzB() ? "" : this.f8069e);
                    g73 g73VarL = l73Var.L();
                    String strValueOf = g73VarL.D() ? String.valueOf(g73VarL.E().zza()) : "-1";
                    String string = j22.b(l73Var.J(), o21.a).toString();
                    bu1VarA2.c("oa_sig_ts", String.valueOf(l73Var.F()));
                    bu1VarA2.c("oa_sig_status", String.valueOf(l73Var.G().zza()));
                    bu1VarA2.c("oa_sig_resp_lat", String.valueOf(l73Var.H()));
                    bu1VarA2.c("oa_sig_render_lat", String.valueOf(l73Var.I()));
                    bu1VarA2.c("oa_sig_formats", string);
                    bu1VarA2.c("oa_sig_nw_type", strValueOf);
                    bu1VarA2.c("oa_sig_wifi", String.valueOf(l73Var.M().zza()));
                    bu1VarA2.c("oa_sig_airplane", String.valueOf(l73Var.N().zza()));
                    bu1VarA2.c("oa_sig_data", String.valueOf(l73Var.O().zza()));
                    bu1VarA2.c("oa_sig_nw_resp", String.valueOf(l73Var.P()));
                    bu1VarA2.c("oa_sig_offline", String.valueOf(l73Var.Q().zza()));
                    bu1VarA2.c("oa_sig_nw_state", String.valueOf(l73Var.R().zza()));
                    if (g73VarL.F() && g73VarL.D() && g73VarL.E().equals(f73.CELL)) {
                        bu1VarA2.c("oa_sig_cell_type", String.valueOf(g73VarL.G().zza()));
                    }
                    this.f8070f.b(bu1VarA2);
                }
            } else {
                ArrayList<l73> arrayListA2 = j21.a(sQLiteDatabase);
                m73 m73VarD = q73.D();
                m73VarD.u(this.f8066b.getPackageName());
                m73VarD.v(Build.MODEL);
                m73VarD.r(j21.b(sQLiteDatabase, 0));
                m73VarD.q(arrayListA2);
                m73VarD.s(j21.b(sQLiteDatabase, 1));
                m73VarD.t(zzs.zzj().a());
                m73VarD.w(j21.c(sQLiteDatabase, 2));
                final q73 q73VarN = m73VarD.n();
                c(sQLiteDatabase, arrayListA2);
                this.a.c(new v43(q73VarN) { // from class: com.google.android.gms.internal.ads.l21
                    private final q73 a;

                    {
                        this.a = q73VarN;
                    }

                    @Override // com.google.android.gms.internal.ads.v43
                    public final void a(q63 q63Var) {
                        q63Var.y(this.a);
                    }
                });
                c83 c83VarD = d83.D();
                c83VarD.q(this.f8068d.f7055f);
                c83VarD.r(this.f8068d.f7056g);
                c83VarD.s(true == this.f8068d.f7057h ? 0 : 2);
                final d83 d83VarN = c83VarD.n();
                this.a.c(new v43(d83VarN) { // from class: com.google.android.gms.internal.ads.n21
                    private final d83 a;

                    {
                        this.a = d83VarN;
                    }

                    @Override // com.google.android.gms.internal.ads.v43
                    public final void a(q63 q63Var) {
                        d83 d83Var = this.a;
                        g63 g63VarY = q63Var.u().y();
                        g63VarY.r(d83Var);
                        q63Var.v(g63VarY);
                    }
                });
                this.a.b(y43.OFFLINE_UPLOAD);
            }
            sQLiteDatabase.delete("offline_signal_contents", null, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", (Integer) 0);
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("value", (Integer) 0);
            sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
        }
        return null;
    }
}