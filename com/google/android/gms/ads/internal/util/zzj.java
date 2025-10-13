package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.common.util.n;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.e5;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.g52;
import com.google.android.gms.internal.ads.kq;
import com.google.android.gms.internal.ads.qr;
import com.google.android.gms.internal.ads.v23;
import com.google.android.gms.internal.ads.w3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzj implements zzg {
    private boolean zzb;
    private g52<?> zzd;

    @GuardedBy("lock")
    private SharedPreferences zzf;

    @GuardedBy("lock")
    private SharedPreferences.Editor zzg;

    @GuardedBy("lock")
    private String zzi;

    @GuardedBy("lock")
    private String zzj;
    private final Object zza = new Object();
    private final List<Runnable> zzc = new ArrayList();

    @GuardedBy("lock")
    private v23 zze = null;

    @GuardedBy("lock")
    private boolean zzh = true;

    @GuardedBy("lock")
    private boolean zzk = true;

    @GuardedBy("lock")
    private kq zzl = new kq("", 0);

    @GuardedBy("lock")
    private long zzm = 0;

    @GuardedBy("lock")
    private long zzn = 0;

    @GuardedBy("lock")
    private int zzo = -1;

    @GuardedBy("lock")
    private int zzp = 0;

    @GuardedBy("lock")
    private Set<String> zzq = Collections.emptySet();

    @GuardedBy("lock")
    private JSONObject zzr = new JSONObject();

    @GuardedBy("lock")
    private boolean zzs = true;

    @GuardedBy("lock")
    private boolean zzt = true;

    @GuardedBy("lock")
    private String zzu = null;

    @GuardedBy("lock")
    private String zzv = "";

    @GuardedBy("lock")
    private int zzw = -1;

    @GuardedBy("lock")
    private int zzx = -1;

    @GuardedBy("lock")
    private long zzy = 0;

    private final void zzI() throws ExecutionException, InterruptedException, TimeoutException {
        g52<?> g52Var = this.zzd;
        if (g52Var == null || g52Var.isDone()) {
            return;
        }
        try {
            this.zzd.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            er.zzj("Interrupted while waiting for preferences loaded.", e2);
        } catch (CancellationException e3) {
            e = e3;
            er.zzg("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e4) {
            e = e4;
            er.zzg("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e5) {
            e = e5;
            er.zzg("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void zzJ() {
        qr.a.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzi
            private final zzj zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        zzI();
        synchronized (this.zza) {
            if (z == this.zzk) {
                return;
            }
            this.zzk = z;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("gad_idless", z);
                this.zzg.apply();
            }
            zzJ();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzB() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        if (!((Boolean) c.c().b(w3.o0)).booleanValue()) {
            return false;
        }
        zzI();
        synchronized (this.zza) {
            z = this.zzk;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(int i2) throws ExecutionException, InterruptedException, TimeoutException {
        zzI();
        synchronized (this.zza) {
            if (this.zzx == i2) {
                return;
            }
            this.zzx = i2;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i2);
                this.zzg.apply();
            }
            zzJ();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzD() throws ExecutionException, InterruptedException, TimeoutException {
        long j2;
        zzI();
        synchronized (this.zza) {
            j2 = this.zzy;
        }
        return j2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(long j2) throws ExecutionException, InterruptedException, TimeoutException {
        zzI();
        synchronized (this.zza) {
            if (this.zzy == j2) {
                return;
            }
            this.zzy = j2;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j2);
                this.zzg.apply();
            }
            zzJ();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzF() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        zzI();
        synchronized (this.zza) {
            str = this.zzv;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) c.c().b(w3.P5)).booleanValue()) {
            zzI();
            synchronized (this.zza) {
                if (this.zzv.equals(str)) {
                    return;
                }
                this.zzv = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.zzg.apply();
                }
                zzJ();
            }
        }
    }

    final /* synthetic */ void zzH(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        synchronized (this.zza) {
            this.zzf = sharedPreferences;
            this.zzg = editorEdit;
            if (n.i()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.zzh = this.zzf.getBoolean("use_https", this.zzh);
            this.zzs = this.zzf.getBoolean("content_url_opted_out", this.zzs);
            this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
            this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
            this.zzt = this.zzf.getBoolean("content_vertical_opted_out", this.zzt);
            this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
            this.zzp = this.zzf.getInt("version_code", this.zzp);
            this.zzl = new kq(this.zzf.getString("app_settings_json", this.zzl.d()), this.zzf.getLong("app_settings_last_update_ms", this.zzl.b()));
            this.zzm = this.zzf.getLong("app_last_background_time_ms", this.zzm);
            this.zzo = this.zzf.getInt("request_in_session_count", this.zzo);
            this.zzn = this.zzf.getLong("first_ad_req_time_ms", this.zzn);
            this.zzq = this.zzf.getStringSet("never_pool_slots", this.zzq);
            this.zzu = this.zzf.getString("display_cutout", this.zzu);
            this.zzw = this.zzf.getInt("app_measurement_npa", this.zzw);
            this.zzx = this.zzf.getInt("sd_app_measure_npa", this.zzx);
            this.zzy = this.zzf.getLong("sd_app_measure_npa_ts", this.zzy);
            this.zzv = this.zzf.getString("inspector_info", this.zzv);
            try {
                this.zzr = new JSONObject(this.zzf.getString("native_advanced_settings", "{}"));
            } catch (JSONException e2) {
                er.zzj("Could not convert native advanced settings to json object", e2);
            }
            zzJ();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zza(final Context context) {
        synchronized (this.zza) {
            if (this.zzf != null) {
                return;
            }
            final String str = "admob";
            this.zzd = qr.a.c(new Runnable(this, context, str) { // from class: com.google.android.gms.ads.internal.util.zzh
                private final zzj zza;
                private final Context zzb;
                private final String zzc = "admob";

                {
                    this.zza = this;
                    this.zzb = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzH(this.zzb, this.zzc);
                }
            });
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final v23 zzb() {
        if (!this.zzb) {
            return null;
        }
        if ((zzd() && zzh()) || !e5.f5582b.e().booleanValue()) {
            return null;
        }
        synchronized (this.zza) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.zze == null) {
                this.zze = new v23();
            }
            this.zze.a();
            er.zzh("start fetching content...");
            return this.zze;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzc(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        zzI();
        synchronized (this.zza) {
            if (this.zzs == z) {
                return;
            }
            this.zzs = z;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z);
                this.zzg.apply();
            }
            zzJ();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzd() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        zzI();
        synchronized (this.zza) {
            z = this.zzs;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zze(String str) throws ExecutionException, InterruptedException, TimeoutException {
        zzI();
        synchronized (this.zza) {
            if (str.equals(this.zzi)) {
                return;
            }
            this.zzi = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.zzg.apply();
            }
            zzJ();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzf() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        zzI();
        synchronized (this.zza) {
            str = this.zzi;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzg(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        zzI();
        synchronized (this.zza) {
            if (this.zzt == z) {
                return;
            }
            this.zzt = z;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z);
                this.zzg.apply();
            }
            zzJ();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzh() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        zzI();
        synchronized (this.zza) {
            z = this.zzt;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzi(String str) throws ExecutionException, InterruptedException, TimeoutException {
        zzI();
        synchronized (this.zza) {
            if (str.equals(this.zzj)) {
                return;
            }
            this.zzj = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.zzg.apply();
            }
            zzJ();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        zzI();
        synchronized (this.zza) {
            str = this.zzj;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzk(int i2) throws ExecutionException, InterruptedException, TimeoutException {
        zzI();
        synchronized (this.zza) {
            if (this.zzp == i2) {
                return;
            }
            this.zzp = i2;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("version_code", i2);
                this.zzg.apply();
            }
            zzJ();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzl() throws ExecutionException, InterruptedException, TimeoutException {
        int i2;
        zzI();
        synchronized (this.zza) {
            i2 = this.zzp;
        }
        return i2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzm(String str) throws ExecutionException, InterruptedException, TimeoutException {
        zzI();
        synchronized (this.zza) {
            long jA = com.google.android.gms.ads.internal.zzs.zzj().a();
            if (str != null && !str.equals(this.zzl.d())) {
                this.zzl = new kq(str, jA);
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.zzg.putLong("app_settings_last_update_ms", jA);
                    this.zzg.apply();
                }
                zzJ();
                Iterator<Runnable> it = this.zzc.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                return;
            }
            this.zzl.a(jA);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final kq zzn() throws ExecutionException, InterruptedException, TimeoutException {
        kq kqVar;
        zzI();
        synchronized (this.zza) {
            kqVar = this.zzl;
        }
        return kqVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzo(Runnable runnable) {
        this.zzc.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzp(long j2) throws ExecutionException, InterruptedException, TimeoutException {
        zzI();
        synchronized (this.zza) {
            if (this.zzm == j2) {
                return;
            }
            this.zzm = j2;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j2);
                this.zzg.apply();
            }
            zzJ();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzq() throws ExecutionException, InterruptedException, TimeoutException {
        long j2;
        zzI();
        synchronized (this.zza) {
            j2 = this.zzm;
        }
        return j2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(int i2) throws ExecutionException, InterruptedException, TimeoutException {
        zzI();
        synchronized (this.zza) {
            if (this.zzo == i2) {
                return;
            }
            this.zzo = i2;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("request_in_session_count", i2);
                this.zzg.apply();
            }
            zzJ();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzs() throws ExecutionException, InterruptedException, TimeoutException {
        int i2;
        zzI();
        synchronized (this.zza) {
            i2 = this.zzo;
        }
        return i2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(long j2) throws ExecutionException, InterruptedException, TimeoutException {
        zzI();
        synchronized (this.zza) {
            if (this.zzn == j2) {
                return;
            }
            this.zzn = j2;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j2);
                this.zzg.apply();
            }
            zzJ();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzu() throws ExecutionException, InterruptedException, TimeoutException {
        long j2;
        zzI();
        synchronized (this.zza) {
            j2 = this.zzn;
        }
        return j2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(String str, String str2, boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        zzI();
        synchronized (this.zza) {
            JSONArray jSONArrayOptJSONArray = this.zzr.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            int i2 = 0;
            while (true) {
                if (i2 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject == null) {
                        return;
                    }
                    if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                        if (z && jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        }
                        length = i2;
                    } else {
                        i2++;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzs.zzj().a());
                jSONArrayOptJSONArray.put(length, jSONObject);
                this.zzr.put(str, jSONArrayOptJSONArray);
            } catch (JSONException e2) {
                er.zzj("Could not update native advanced settings", e2);
            }
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.zzr.toString());
                this.zzg.apply();
            }
            zzJ();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzw() throws ExecutionException, InterruptedException, TimeoutException {
        JSONObject jSONObject;
        zzI();
        synchronized (this.zza) {
            jSONObject = this.zzr;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx() throws ExecutionException, InterruptedException, TimeoutException {
        zzI();
        synchronized (this.zza) {
            this.zzr = new JSONObject();
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.zzg.apply();
            }
            zzJ();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzy() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        zzI();
        synchronized (this.zza) {
            str = this.zzu;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(String str) throws ExecutionException, InterruptedException, TimeoutException {
        zzI();
        synchronized (this.zza) {
            if (TextUtils.equals(this.zzu, str)) {
                return;
            }
            this.zzu = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.zzg.apply();
            }
            zzJ();
        }
    }
}