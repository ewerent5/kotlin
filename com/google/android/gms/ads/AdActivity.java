package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.ta3;
import com.google.android.gms.internal.ads.xj;
import e.c.b.b.b.d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    @RecentlyNonNull
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private xj zza;

    private final void zza() {
        xj xjVar = this.zza;
        if (xjVar != null) {
            try {
                xjVar.zzs();
            } catch (RemoteException e2) {
                er.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i2, int i3, @RecentlyNonNull Intent intent) {
        try {
            xj xjVar = this.zza;
            if (xjVar != null) {
                xjVar.zzm(i2, i3, intent);
            }
        } catch (Exception e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            xj xjVar = this.zza;
            if (xjVar != null) {
                if (!xjVar.zzg()) {
                    return;
                }
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
        super.onBackPressed();
        try {
            xj xjVar2 = this.zza;
            if (xjVar2 != null) {
                xjVar2.zze();
            }
        } catch (RemoteException e3) {
            er.zzl("#007 Could not call remote method.", e3);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            xj xjVar = this.zza;
            if (xjVar != null) {
                xjVar.zzn(d.m4(configuration));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xj xjVarG = ta3.b().g(this);
        this.zza = xjVarG;
        if (xjVarG == null) {
            er.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            xjVarG.zzh(bundle);
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            xj xjVar = this.zza;
            if (xjVar != null) {
                xjVar.zzq();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            xj xjVar = this.zza;
            if (xjVar != null) {
                xjVar.zzl();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            xj xjVar = this.zza;
            if (xjVar != null) {
                xjVar.zzi();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            xj xjVar = this.zza;
            if (xjVar != null) {
                xjVar.zzk();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        try {
            xj xjVar = this.zza;
            if (xjVar != null) {
                xjVar.zzo(bundle);
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            xj xjVar = this.zza;
            if (xjVar != null) {
                xjVar.zzj();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            xj xjVar = this.zza;
            if (xjVar != null) {
                xjVar.zzp();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            xj xjVar = this.zza;
            if (xjVar != null) {
                xjVar.zzf();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i2) {
        super.setContentView(i2);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(@RecentlyNonNull View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(@RecentlyNonNull View view, @RecentlyNonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}