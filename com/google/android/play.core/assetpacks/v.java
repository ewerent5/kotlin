package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class v {
    private static final e.c.b.d.a.b.f a = new e.c.b.d.a.b.f("AssetPackStorage");

    /* renamed from: b, reason: collision with root package name */
    private static final long f12166b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f12167c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f12168d;

    /* renamed from: e, reason: collision with root package name */
    private final t1 f12169e;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f12166b = timeUnit.toMillis(14L);
        f12167c = timeUnit.toMillis(28L);
    }

    v(Context context, t1 t1Var) {
        this.f12168d = context;
        this.f12169e = t1Var;
    }

    private final File d(String str, int i2) {
        return new File(e(str), String.valueOf(i2));
    }

    private final File e(String str) {
        return new File(n(), str);
    }

    private final File f(String str, int i2, long j2) {
        return new File(x(str, i2, j2), "merge.tmp");
    }

    private static void g(File file) {
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long j2 = j(file);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(j2)) && !file2.getName().equals("stale.tmp")) {
                o(file2);
            }
        }
    }

    private static long h(File file) {
        return i(file, true);
    }

    private static long i(File file, boolean z) {
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            a.e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e2) {
            a.c(e2, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    private static long j(File file) {
        return i(file, false);
    }

    private final List<File> k() {
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e2) {
            a.b("Could not process directory while scanning installed packs. %s", e2);
        }
        if (n().exists() && n().listFiles() != null) {
            for (File file : n().listFiles()) {
                if (!file.getCanonicalPath().equals(m().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    private final File l(String str, int i2, long j2) {
        return new File(new File(new File(m(), str), String.valueOf(i2)), String.valueOf(j2));
    }

    private final File m() {
        return new File(n(), "_tmp");
    }

    private final File n() {
        return new File(this.f12168d.getFilesDir(), "assetpacks");
    }

    private static boolean o(File file) {
        boolean zO;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            zO = true;
            for (File file2 : fileArrListFiles) {
                zO &= o(file2);
            }
        } else {
            zO = true;
        }
        return file.delete() && true == zO;
    }

    final File A(String str, int i2, long j2, String str2) {
        return new File(C(str, i2, j2, str2), "checkpoint.dat");
    }

    final File B(String str, int i2, long j2, String str2) {
        return new File(C(str, i2, j2, str2), "checkpoint_ext.dat");
    }

    final File C(String str, int i2, long j2, String str2) {
        return new File(D(str, i2, j2), str2);
    }

    final File D(String str, int i2, long j2) {
        return new File(new File(l(str, i2, j2), "_slices"), "_metadata");
    }

    final void E(String str, int i2, long j2) {
        File fileE = e(str);
        if (fileE.exists()) {
            for (File file : fileE.listFiles()) {
                if (!file.getName().equals(String.valueOf(i2)) && !file.getName().equals("stale.tmp")) {
                    o(file);
                } else if (file.getName().equals(String.valueOf(i2))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j2))) {
                            o(file2);
                        }
                    }
                }
            }
        }
    }

    final void F() throws IOException {
        for (File file : k()) {
            if (file.listFiles() != null) {
                g(file);
                long j2 = j(file);
                if (this.f12169e.a() != j2) {
                    try {
                        new File(new File(file, String.valueOf(j2)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        a.b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    g(file2);
                }
            }
        }
    }

    final int G(String str) {
        return (int) h(e(str));
    }

    final long H(String str) {
        return h(d(str, G(str)));
    }

    final void I() {
        for (File file : k()) {
            if (file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    File file3 = new File(file2, "stale.tmp");
                    if (file3.exists() && System.currentTimeMillis() - file3.lastModified() > f12167c) {
                        o(file2);
                    }
                }
            }
        }
    }

    final void J() {
        if (m().exists()) {
            for (File file : m().listFiles()) {
                if (System.currentTimeMillis() - file.lastModified() > f12166b) {
                    o(file);
                } else {
                    g(file);
                }
            }
        }
    }

    final void K() {
        o(n());
    }

    final void a(List<String> list) {
        int iA = this.f12169e.a();
        for (File file : k()) {
            if (!list.contains(file.getName()) && h(file) != iA) {
                o(file);
            }
        }
    }

    final void b(String str, int i2, long j2) {
        if (l(str, i2, j2).exists()) {
            o(l(str, i2, j2));
        }
    }

    final void c(String str, int i2, long j2) {
        if (t(str, i2, j2).exists()) {
            o(t(str, i2, j2));
        }
    }

    final Map<String, b> p() {
        HashMap map = new HashMap();
        try {
            for (File file : k()) {
                b bVarR = r(file.getName());
                if (bVarR != null) {
                    map.put(file.getName(), bVarR);
                }
            }
        } catch (IOException e2) {
            a.b("Could not process directory while scanning installed packs: %s", e2);
        }
        return map;
    }

    final Map<String, Long> q() {
        HashMap map = new HashMap();
        for (String str : p().keySet()) {
            map.put(str, Long.valueOf(H(str)));
        }
        return map;
    }

    final b r(String str) {
        String strS = s(str);
        if (strS == null) {
            return null;
        }
        File file = new File(strS, "assets");
        if (file.isDirectory()) {
            return b.b(strS, file.getCanonicalPath());
        }
        a.b("Failed to find assets directory: %s", file);
        return null;
    }

    final String s(String str) {
        int length;
        File file = new File(n(), str);
        if (!file.exists()) {
            a.a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f12169e.a()));
        if (!file2.exists()) {
            a.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f12169e.a()));
            return null;
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null || (length = fileArrListFiles.length) == 0) {
            a.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f12169e.a()));
            return null;
        }
        if (length <= 1) {
            return fileArrListFiles[0].getCanonicalPath();
        }
        a.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f12169e.a()));
        return null;
    }

    final File t(String str, int i2, long j2) {
        return new File(d(str, i2), String.valueOf(j2));
    }

    final File u(String str, int i2, long j2) {
        return new File(t(str, i2, j2), "_metadata");
    }

    final File v(String str, int i2, long j2, String str2) {
        return new File(new File(new File(l(str, i2, j2), "_slices"), "_unverified"), str2);
    }

    final File w(String str, int i2, long j2, String str2) {
        return new File(new File(new File(l(str, i2, j2), "_slices"), "_verified"), str2);
    }

    final File x(String str, int i2, long j2) {
        return new File(l(str, i2, j2), "_packs");
    }

    final int y(String str, int i2, long j2) throws IOException {
        File fileF = f(str, i2, j2);
        if (!fileF.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(fileF);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") == null) {
                throw new k0("Merge checkpoint file corrupt.");
            }
            try {
                return Integer.parseInt(properties.getProperty("numberOfMerges"));
            } catch (NumberFormatException e2) {
                throw new k0("Merge checkpoint file corrupt.", e2);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                e.c.b.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final void z(String str, int i2, long j2, int i3) throws IOException {
        File fileF = f(str, i2, j2);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i3));
        fileF.getParentFile().mkdirs();
        fileF.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(fileF);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }
}