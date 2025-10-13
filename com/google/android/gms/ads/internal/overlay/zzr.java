package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.ta3;
import com.google.android.gms.internal.ads.xq;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzr extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzaa zzb;

    public zzr(Context context, zzq zzqVar, zzaa zzaaVar) {
        super(context);
        this.zzb = zzaaVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        imageButton.setImageResource(R.drawable.btn_dialog);
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        ta3.a();
        int iS = xq.s(context, zzqVar.zza);
        ta3.a();
        int iS2 = xq.s(context, 0);
        ta3.a();
        int iS3 = xq.s(context, zzqVar.zzb);
        ta3.a();
        imageButton.setPadding(iS, iS2, iS3, xq.s(context, zzqVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        ta3.a();
        int iS4 = xq.s(context, zzqVar.zzd + zzqVar.zza + zzqVar.zzb);
        ta3.a();
        addView(imageButton, new FrameLayout.LayoutParams(iS4, xq.s(context, zzqVar.zzd + zzqVar.zzc), 17));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzaa zzaaVar = this.zzb;
        if (zzaaVar != null) {
            zzaaVar.zzd();
        }
    }

    public final void zza(boolean z) {
        if (z) {
            this.zza.setVisibility(8);
        } else {
            this.zza.setVisibility(0);
        }
    }
}