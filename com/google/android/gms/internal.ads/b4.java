package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class b4 {

    /* renamed from: d, reason: collision with root package name */
    String f5064d;

    /* renamed from: e, reason: collision with root package name */
    Context f5065e;

    /* renamed from: f, reason: collision with root package name */
    String f5066f;

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f5068h;

    /* renamed from: i, reason: collision with root package name */
    private File f5069i;
    final BlockingQueue<m4> a = new ArrayBlockingQueue(100);

    /* renamed from: b, reason: collision with root package name */
    final LinkedHashMap<String, String> f5062b = new LinkedHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    final Map<String, i4> f5063c = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final HashSet<String> f5067g = new HashSet<>(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    private final void g(Map<String, String> map, l4 l4Var) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse(this.f5064d).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (l4Var != null) {
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(l4Var.a())) {
                sb.append("&it=");
                sb.append(l4Var.a());
            }
            if (!TextUtils.isEmpty(l4Var.b())) {
                sb.append("&blat=");
                sb.append(l4Var.b());
            }
            string = sb.toString();
        }
        if (!this.f5068h.get()) {
            zzs.zzc();
            zzr.zzL(this.f5065e, this.f5066f, string);
            return;
        }
        File file = this.f5069i;
        if (file == null) {
            er.zzi("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e2) {
                        er.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                    }
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream = fileOutputStream2;
                    er.zzj("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            er.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            er.zzj("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e6) {
            e = e6;
        }
    }

    public final void a(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f5065e = context;
        this.f5066f = str;
        this.f5064d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f5068h = atomicBoolean;
        atomicBoolean.set(g5.f6042c.e().booleanValue());
        if (this.f5068h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f5069i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f5062b.put(entry.getKey(), entry.getValue());
        }
        qr.a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.a4

            /* renamed from: e, reason: collision with root package name */
            private final b4 f4838e;

            {
                this.f4838e = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f4838e.f();
            }
        });
        Map<String, i4> map2 = this.f5063c;
        i4 i4Var = i4.f6475b;
        map2.put("action", i4Var);
        this.f5063c.put("ad_format", i4Var);
        this.f5063c.put("e", i4.f6476c);
    }

    public final boolean b(m4 m4Var) {
        return this.a.offer(m4Var);
    }

    final Map<String, String> c(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            linkedHashMap.put(key, d(key).a((String) linkedHashMap.get(key), value));
        }
        return linkedHashMap;
    }

    public final i4 d(String str) {
        i4 i4Var = this.f5063c.get(str);
        return i4Var != null ? i4Var : i4.a;
    }

    public final void e(String str) throws Throwable {
        if (this.f5067g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f5066f);
        linkedHashMap.put("ue", str);
        g(c(this.f5062b, linkedHashMap), null);
    }

    final /* bridge */ /* synthetic */ void f() throws Throwable {
        while (true) {
            try {
                m4 m4VarTake = this.a.take();
                l4 l4VarC = m4VarTake.c();
                if (!TextUtils.isEmpty(l4VarC.a())) {
                    g(c(this.f5062b, m4VarTake.e()), l4VarC);
                }
            } catch (InterruptedException e2) {
                er.zzj("CsiReporter:reporter interrupted", e2);
                return;
            }
        }
    }
}