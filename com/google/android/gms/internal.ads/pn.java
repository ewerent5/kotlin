package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pn implements hw2 {

    /* renamed from: c, reason: collision with root package name */
    private final om f8209c;
    private final Map<String, mk> a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private long f8208b = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f8210d = 5242880;

    public pn(om omVar, int i2) {
        this.f8209c = omVar;
    }

    static byte[] e(nl nlVar, long j2) throws IOException {
        long jB = nlVar.b();
        if (j2 >= 0 && j2 <= jB) {
            int i2 = (int) j2;
            if (i2 == j2) {
                byte[] bArr = new byte[i2];
                new DataInputStream(nlVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j2);
        sb.append(", maxLength=");
        sb.append(jB);
        throw new IOException(sb.toString());
    }

    static void f(OutputStream outputStream, int i2) throws IOException {
        outputStream.write(i2 & 255);
        outputStream.write((i2 >> 8) & 255);
        outputStream.write((i2 >> 16) & 255);
        outputStream.write((i2 >> 24) & 255);
    }

    static int g(InputStream inputStream) {
        return (n(inputStream) << 24) | n(inputStream) | (n(inputStream) << 8) | (n(inputStream) << 16);
    }

    static void h(OutputStream outputStream, long j2) throws IOException {
        outputStream.write((byte) j2);
        outputStream.write((byte) (j2 >>> 8));
        outputStream.write((byte) (j2 >>> 16));
        outputStream.write((byte) (j2 >>> 24));
        outputStream.write((byte) (j2 >>> 32));
        outputStream.write((byte) (j2 >>> 40));
        outputStream.write((byte) (j2 >>> 48));
        outputStream.write((byte) (j2 >>> 56));
    }

    static long i(InputStream inputStream) {
        return (n(inputStream) & 255) | ((n(inputStream) & 255) << 8) | ((n(inputStream) & 255) << 16) | ((n(inputStream) & 255) << 24) | ((n(inputStream) & 255) << 32) | ((n(inputStream) & 255) << 40) | ((n(inputStream) & 255) << 48) | ((255 & n(inputStream)) << 56);
    }

    static void j(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        h(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static String k(nl nlVar) {
        return new String(e(nlVar, i(nlVar)), "UTF-8");
    }

    private final void l(String str, mk mkVar) {
        if (this.a.containsKey(str)) {
            this.f8208b += mkVar.a - this.a.get(str).a;
        } else {
            this.f8208b += mkVar.a;
        }
        this.a.put(str, mkVar);
    }

    private final void m(String str) {
        mk mkVarRemove = this.a.remove(str);
        if (mkVarRemove != null) {
            this.f8208b -= mkVarRemove.a;
        }
    }

    private static int n(InputStream inputStream) throws IOException {
        int i2 = inputStream.read();
        if (i2 != -1) {
            return i2;
        }
        throw new EOFException();
    }

    private static final String o(String str) {
        int length = str.length() / 2;
        String strValueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String strValueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }

    @Override // com.google.android.gms.internal.ads.hw2
    public final synchronized void a(String str, boolean z) {
        gv2 gv2VarZza = zza(str);
        if (gv2VarZza != null) {
            gv2VarZza.f6209f = 0L;
            gv2VarZza.f6208e = 0L;
            b(str, gv2VarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.hw2
    public final synchronized void b(String str, gv2 gv2Var) {
        BufferedOutputStream bufferedOutputStream;
        mk mkVar;
        long j2;
        long j3 = this.f8208b;
        int length = gv2Var.a.length;
        int i2 = this.f8210d;
        if (j3 + length <= i2 || length <= i2 * 0.9f) {
            File fileD = d(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileD));
                mkVar = new mk(str, gv2Var);
            } catch (IOException unused) {
                if (!fileD.delete()) {
                    pd.b("Could not clean up file %s", fileD.getAbsolutePath());
                }
                if (!this.f8209c.zza().exists()) {
                    pd.b("Re-initializing cache after external clearing.", new Object[0]);
                    this.a.clear();
                    this.f8208b = 0L;
                    zzc();
                    return;
                }
            }
            try {
                f(bufferedOutputStream, 538247942);
                j(bufferedOutputStream, mkVar.f7495b);
                String str2 = mkVar.f7496c;
                if (str2 == null) {
                    str2 = "";
                }
                j(bufferedOutputStream, str2);
                h(bufferedOutputStream, mkVar.f7497d);
                h(bufferedOutputStream, mkVar.f7498e);
                h(bufferedOutputStream, mkVar.f7499f);
                h(bufferedOutputStream, mkVar.f7500g);
                List<p43> list = mkVar.f7501h;
                if (list != null) {
                    f(bufferedOutputStream, list.size());
                    for (p43 p43Var : list) {
                        j(bufferedOutputStream, p43Var.a());
                        j(bufferedOutputStream, p43Var.b());
                    }
                } else {
                    f(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.write(gv2Var.a);
                bufferedOutputStream.close();
                mkVar.a = fileD.length();
                l(str, mkVar);
                if (this.f8208b >= this.f8210d) {
                    if (pd.f8137b) {
                        pd.a("Pruning old cache entries.", new Object[0]);
                    }
                    long j4 = this.f8208b;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator<Map.Entry<String, mk>> it = this.a.entrySet().iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            j2 = jElapsedRealtime;
                            break;
                        }
                        mk value = it.next().getValue();
                        if (d(value.f7495b).delete()) {
                            j2 = jElapsedRealtime;
                            this.f8208b -= value.a;
                        } else {
                            j2 = jElapsedRealtime;
                            String str3 = value.f7495b;
                            pd.b("Could not delete cache entry for key=%s, filename=%s", str3, o(str3));
                        }
                        it.remove();
                        i3++;
                        if (this.f8208b < this.f8210d * 0.9f) {
                            break;
                        } else {
                            jElapsedRealtime = j2;
                        }
                    }
                    if (pd.f8137b) {
                        pd.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.f8208b - j4), Long.valueOf(SystemClock.elapsedRealtime() - j2));
                    }
                }
            } catch (IOException e2) {
                pd.b("%s", e2.toString());
                bufferedOutputStream.close();
                pd.b("Failed to write header for %s", fileD.getAbsolutePath());
                throw new IOException();
            }
        }
    }

    public final synchronized void c(String str) {
        boolean zDelete = d(str).delete();
        m(str);
        if (zDelete) {
            return;
        }
        pd.b("Could not delete cache entry for key=%s, filename=%s", str, o(str));
    }

    public final File d(String str) {
        return new File(this.f8209c.zza(), o(str));
    }

    @Override // com.google.android.gms.internal.ads.hw2
    public final synchronized gv2 zza(String str) {
        mk mkVar = this.a.get(str);
        if (mkVar == null) {
            return null;
        }
        File fileD = d(str);
        try {
            nl nlVar = new nl(new BufferedInputStream(new FileInputStream(fileD)), fileD.length());
            try {
                mk mkVarA = mk.a(nlVar);
                if (!TextUtils.equals(str, mkVarA.f7495b)) {
                    pd.b("%s: key=%s, found=%s", fileD.getAbsolutePath(), str, mkVarA.f7495b);
                    m(str);
                    return null;
                }
                byte[] bArrE = e(nlVar, nlVar.b());
                gv2 gv2Var = new gv2();
                gv2Var.a = bArrE;
                gv2Var.f6205b = mkVar.f7496c;
                gv2Var.f6206c = mkVar.f7497d;
                gv2Var.f6207d = mkVar.f7498e;
                gv2Var.f6208e = mkVar.f7499f;
                gv2Var.f6209f = mkVar.f7500g;
                List<p43> list = mkVar.f7501h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (p43 p43Var : list) {
                    treeMap.put(p43Var.a(), p43Var.b());
                }
                gv2Var.f6210g = treeMap;
                gv2Var.f6211h = Collections.unmodifiableList(mkVar.f7501h);
                return gv2Var;
            } finally {
                nlVar.close();
            }
        } catch (IOException e2) {
            pd.b("%s: %s", fileD.getAbsolutePath(), e2.toString());
            c(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.hw2
    public final synchronized void zzc() {
        File fileZza = this.f8209c.zza();
        if (!fileZza.exists()) {
            if (fileZza.mkdirs()) {
                return;
            }
            pd.c("Unable to create cache dir %s", fileZza.getAbsolutePath());
            return;
        }
        File[] fileArrListFiles = fileZza.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                long length = file.length();
                nl nlVar = new nl(new BufferedInputStream(new FileInputStream(file)), length);
                try {
                    mk mkVarA = mk.a(nlVar);
                    mkVarA.a = length;
                    l(mkVarA.f7495b, mkVarA);
                    nlVar.close();
                } catch (Throwable th) {
                    nlVar.close();
                    throw th;
                }
            } catch (IOException unused) {
                file.delete();
            }
        }
    }

    public pn(File file, int i2) {
        this.f8209c = new lj(this, file);
    }
}