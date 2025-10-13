package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.w3;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
@TargetApi(28)
/* loaded from: classes.dex */
public final class zzab extends zzz {
    static final /* synthetic */ WindowInsets zzs(Activity activity, View view, WindowInsets windowInsets) {
        if (com.google.android.gms.ads.internal.zzs.zzg().l().zzy() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                zzg zzgVarL = com.google.android.gms.ads.internal.zzs.zzg().l();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String str = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = String.valueOf(strConcat).concat("|");
                    }
                    String strValueOf = String.valueOf(strConcat);
                    String strValueOf2 = String.valueOf(str);
                    strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                }
                zzgVarL.zzz(strConcat);
            } else {
                com.google.android.gms.ads.internal.zzs.zzg().l().zzz("");
            }
        }
        zzv(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzv(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i2 = attributes.layoutInDisplayCutoutMode;
        int i3 = true != z ? 2 : 1;
        if (i3 != i2) {
            attributes.layoutInDisplayCutoutMode = i3;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzac
    public final void zzr(final Activity activity) {
        if (((Boolean) c.c().b(w3.M0)).booleanValue() && com.google.android.gms.ads.internal.zzs.zzg().l().zzy() == null && !activity.isInMultiWindowMode()) {
            zzv(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this, activity) { // from class: com.google.android.gms.ads.internal.util.zzaa
                private final zzab zza;
                private final Activity zzb;

                {
                    this.zza = this;
                    this.zzb = activity;
                }

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzab.zzs(this.zzb, view, windowInsets);
                }
            });
        }
    }
}