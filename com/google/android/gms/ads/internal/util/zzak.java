package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.qr;
import com.google.android.gms.internal.ads.w3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzak {
    private final Context zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private PointF zzh;
    private PointF zzi;
    private Handler zzj;
    private Runnable zzk;

    public zzak(Context context) {
        this.zzf = 0;
        this.zzk = new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzae
            private final zzak zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk();
            }
        };
        this.zza = context;
        this.zzg = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzs.zzq().zza();
        this.zzj = com.google.android.gms.ads.internal.zzs.zzq().zzb();
    }

    private final boolean zzl(float f2, float f3, float f4, float f5) {
        return Math.abs(this.zzh.x - f2) < ((float) this.zzg) && Math.abs(this.zzh.y - f3) < ((float) this.zzg) && Math.abs(this.zzi.x - f4) < ((float) this.zzg) && Math.abs(this.zzi.y - f5) < ((float) this.zzg);
    }

    private static final int zzm(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzb);
        sb.append(",DebugSignal: ");
        sb.append(this.zze);
        sb.append(",AFMA Version: ");
        sb.append(this.zzd);
        sb.append(",Ad Unit ID: ");
        sb.append(this.zzc);
        sb.append("}");
        return sb.toString();
    }

    public final void zza(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzf = 0;
            this.zzh = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i2 = this.zzf;
        if (i2 == -1) {
            return;
        }
        if (i2 == 0) {
            if (actionMasked == 5) {
                this.zzf = 5;
                this.zzi = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.zzj.postDelayed(this.zzk, ((Long) c.c().b(w3.Q2)).longValue());
                return;
            }
            return;
        }
        if (i2 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i3 = 0; i3 < historySize; i3++) {
                    z |= !zzl(motionEvent.getHistoricalX(0, i3), motionEvent.getHistoricalY(0, i3), motionEvent.getHistoricalX(1, i3), motionEvent.getHistoricalY(1, i3));
                }
                if (zzl(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.zzf = -1;
            this.zzj.removeCallbacks(this.zzk);
        }
    }

    public final void zzb() {
        try {
            if (!(this.zza instanceof Activity)) {
                er.zzh("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative Preview (Enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzs.zzm().zze())) {
                str = "Creative Preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzs.zzm().zzf() ? "Troubleshooting" : "Troubleshooting (Enabled)";
            ArrayList arrayList = new ArrayList();
            final int iZzm = zzm(arrayList, "Ad Information", true);
            final int iZzm2 = zzm(arrayList, str, true);
            final int iZzm3 = zzm(arrayList, str2, true);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.zza, com.google.android.gms.ads.internal.zzs.zze().zzm());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener(this, iZzm, iZzm2, iZzm3) { // from class: com.google.android.gms.ads.internal.util.zzaf
                private final zzak zza;
                private final int zzb;
                private final int zzc;
                private final int zzd;

                {
                    this.zza = this;
                    this.zzb = iZzm;
                    this.zzc = iZzm2;
                    this.zzd = iZzm3;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.zza.zzj(this.zzb, this.zzc, this.zzd, dialogInterface, i2);
                }
            });
            builder.create().show();
        } catch (WindowManager.BadTokenException e2) {
            zze.zzb("", e2);
        }
    }

    public final void zzc(String str) {
        this.zzc = str;
    }

    public final void zzd(String str) {
        this.zzd = str;
    }

    public final void zze(String str) {
        this.zzb = str;
    }

    public final void zzf(String str) {
        this.zze = str;
    }

    final /* synthetic */ void zzg() {
        com.google.android.gms.ads.internal.zzs.zzm().zzb(this.zza, this.zzc, this.zzd, this.zze);
    }

    final /* synthetic */ void zzh() {
        com.google.android.gms.ads.internal.zzs.zzm().zza(this.zza, this.zzc, this.zzd);
    }

    final /* synthetic */ void zzi(String str, DialogInterface dialogInterface, int i2) {
        com.google.android.gms.ads.internal.zzs.zzc();
        zzr.zzN(this.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void zzj(int i2, int i3, int i4, DialogInterface dialogInterface, int i5) {
        if (i5 != i2) {
            if (i5 == i3) {
                er.zzd("Debug mode [Creative Preview] selected.");
                qr.a.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzai
                    private final zzak zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzh();
                    }
                });
                return;
            } else {
                if (i5 == i4) {
                    er.zzd("Debug mode [Troubleshooting] selected.");
                    qr.a.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzaj
                        private final zzak zza;

                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzg();
                        }
                    });
                    return;
                }
                return;
            }
        }
        if (!(this.zza instanceof Activity)) {
            er.zzh("Can not create dialog without Activity Context");
            return;
        }
        String str = this.zzb;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            com.google.android.gms.ads.internal.zzs.zzc();
            Map<String, String> mapZzP = zzr.zzP(uriBuild);
            for (String str3 : mapZzP.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append(mapZzP.get(str3));
                sb.append("\n\n");
            }
            String strTrim = sb.toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.zza);
        builder.setMessage(str2);
        builder.setTitle("Ad Information");
        builder.setPositiveButton("Share", new DialogInterface.OnClickListener(this, str2) { // from class: com.google.android.gms.ads.internal.util.zzag
            private final zzak zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = str2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i6) {
                this.zza.zzi(this.zzb, dialogInterface2, i6);
            }
        });
        builder.setNegativeButton("Close", zzah.zza);
        builder.create().show();
    }

    final /* synthetic */ void zzk() {
        this.zzf = 4;
        zzb();
    }

    public zzak(Context context, String str) {
        this(context);
        this.zzb = str;
    }
}