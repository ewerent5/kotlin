package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class w43 {
    private final c53 a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    private final q63 f9892b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9893c;

    private w43() {
        this.f9892b = s63.G();
        this.f9893c = false;
        this.a = new c53();
    }

    public static w43 a() {
        return new w43();
    }

    private final synchronized void d(y43 y43Var) {
        q63 q63Var = this.f9892b;
        q63Var.t();
        List<String> listD = w3.d();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listD.iterator();
        while (it.hasNext()) {
            for (String str : it.next().split(",")) {
                try {
                    arrayList.add(Long.valueOf(str));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        q63Var.s(arrayList);
        b53 b53Var = new b53(this.a, this.f9892b.n().i(), null);
        b53Var.b(y43Var.zza());
        b53Var.a();
        String strValueOf = String.valueOf(Integer.toString(y43Var.zza(), 10));
        zze.zza(strValueOf.length() != 0 ? "Logging Event with event code : ".concat(strValueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void e(y43 y43Var) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(f(y43Var).getBytes());
                } catch (IOException unused) {
                    zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized String f(y43 y43Var) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f9892b.q(), Long.valueOf(zzs.zzj().c()), Integer.valueOf(y43Var.zza()), Base64.encodeToString(this.f9892b.n().i(), 3));
    }

    public final synchronized void b(y43 y43Var) {
        if (this.f9893c) {
            if (((Boolean) c.c().b(w3.d3)).booleanValue()) {
                e(y43Var);
            } else {
                d(y43Var);
            }
        }
    }

    public final synchronized void c(v43 v43Var) {
        if (this.f9893c) {
            try {
                v43Var.a(this.f9892b);
            } catch (NullPointerException e2) {
                zzs.zzg().g(e2, "AdMobClearcutLogger.modify");
            }
        }
    }

    public w43(c53 c53Var) {
        this.f9892b = s63.G();
        this.a = c53Var;
        this.f9893c = ((Boolean) c.c().b(w3.c3)).booleanValue();
    }
}