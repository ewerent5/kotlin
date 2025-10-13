package com.bumptech.glide.m;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import ch.qos.logback.core.CoreConstants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    private final File f4069e;

    /* renamed from: f, reason: collision with root package name */
    private final File f4070f;

    /* renamed from: g, reason: collision with root package name */
    private final File f4071g;

    /* renamed from: h, reason: collision with root package name */
    private final File f4072h;

    /* renamed from: i, reason: collision with root package name */
    private final int f4073i;

    /* renamed from: j, reason: collision with root package name */
    private long f4074j;

    /* renamed from: k, reason: collision with root package name */
    private final int f4075k;

    /* renamed from: m, reason: collision with root package name */
    private Writer f4077m;
    private int o;

    /* renamed from: l, reason: collision with root package name */
    private long f4076l = 0;
    private final LinkedHashMap<String, d> n = new LinkedHashMap<>(0, 0.75f, true);
    private long p = 0;
    final ThreadPoolExecutor q = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    private final Callable<Void> r = new CallableC0098a();

    /* compiled from: DiskLruCache.java */
    /* renamed from: com.bumptech.glide.m.a$a, reason: collision with other inner class name */
    class CallableC0098a implements Callable<Void> {
        CallableC0098a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                if (a.this.f4077m == null) {
                    return null;
                }
                a.this.r0();
                if (a.this.Z()) {
                    a.this.k0();
                    a.this.o = 0;
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(CallableC0098a callableC0098a) {
            this();
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class c {
        private final d a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f4078b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4079c;

        /* synthetic */ c(a aVar, d dVar, CallableC0098a callableC0098a) {
            this(dVar);
        }

        public void a() {
            a.this.B(this, false);
        }

        public void b() {
            if (this.f4079c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            a.this.B(this, true);
            this.f4079c = true;
        }

        public File f(int i2) {
            File fileK;
            synchronized (a.this) {
                if (this.a.f4085f != this) {
                    throw new IllegalStateException();
                }
                if (!this.a.f4084e) {
                    this.f4078b[i2] = true;
                }
                fileK = this.a.k(i2);
                a.this.f4069e.mkdirs();
            }
            return fileK;
        }

        private c(d dVar) {
            this.a = dVar;
            this.f4078b = dVar.f4084e ? null : new boolean[a.this.f4075k];
        }
    }

    /* compiled from: DiskLruCache.java */
    private final class d {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f4081b;

        /* renamed from: c, reason: collision with root package name */
        File[] f4082c;

        /* renamed from: d, reason: collision with root package name */
        File[] f4083d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f4084e;

        /* renamed from: f, reason: collision with root package name */
        private c f4085f;

        /* renamed from: g, reason: collision with root package name */
        private long f4086g;

        /* synthetic */ d(a aVar, String str, CallableC0098a callableC0098a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f4075k) {
                throw m(strArr);
            }
            for (int i2 = 0; i2 < strArr.length; i2++) {
                try {
                    this.f4081b[i2] = Long.parseLong(strArr[i2]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i2) {
            return this.f4082c[i2];
        }

        public File k(int i2) {
            return this.f4083d[i2];
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.f4081b) {
                sb.append(' ');
                sb.append(j2);
            }
            return sb.toString();
        }

        private d(String str) {
            this.a = str;
            this.f4081b = new long[a.this.f4075k];
            this.f4082c = new File[a.this.f4075k];
            this.f4083d = new File[a.this.f4075k];
            StringBuilder sb = new StringBuilder(str);
            sb.append(CoreConstants.DOT);
            int length = sb.length();
            for (int i2 = 0; i2 < a.this.f4075k; i2++) {
                sb.append(i2);
                this.f4082c[i2] = new File(a.this.f4069e, sb.toString());
                sb.append(".tmp");
                this.f4083d[i2] = new File(a.this.f4069e, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class e {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final long f4088b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f4089c;

        /* renamed from: d, reason: collision with root package name */
        private final File[] f4090d;

        /* synthetic */ e(a aVar, String str, long j2, File[] fileArr, long[] jArr, CallableC0098a callableC0098a) {
            this(str, j2, fileArr, jArr);
        }

        public File a(int i2) {
            return this.f4090d[i2];
        }

        private e(String str, long j2, File[] fileArr, long[] jArr) {
            this.a = str;
            this.f4088b = j2;
            this.f4090d = fileArr;
            this.f4089c = jArr;
        }
    }

    private a(File file, int i2, int i3, long j2) {
        this.f4069e = file;
        this.f4073i = i2;
        this.f4070f = new File(file, "journal");
        this.f4071g = new File(file, "journal.tmp");
        this.f4072h = new File(file, "journal.bkp");
        this.f4075k = i3;
        this.f4074j = j2;
    }

    @TargetApi(26)
    private static void A(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void B(c cVar, boolean z) {
        d dVar = cVar.a;
        if (dVar.f4085f != cVar) {
            throw new IllegalStateException();
        }
        if (z && !dVar.f4084e) {
            for (int i2 = 0; i2 < this.f4075k; i2++) {
                if (!cVar.f4078b[i2]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!dVar.k(i2).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i3 = 0; i3 < this.f4075k; i3++) {
            File fileK = dVar.k(i3);
            if (!z) {
                D(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i3);
                fileK.renameTo(fileJ);
                long j2 = dVar.f4081b[i3];
                long length = fileJ.length();
                dVar.f4081b[i3] = length;
                this.f4076l = (this.f4076l - j2) + length;
            }
        }
        this.o++;
        dVar.f4085f = null;
        if (dVar.f4084e || z) {
            dVar.f4084e = true;
            this.f4077m.append((CharSequence) "CLEAN");
            this.f4077m.append(' ');
            this.f4077m.append((CharSequence) dVar.a);
            this.f4077m.append((CharSequence) dVar.l());
            this.f4077m.append('\n');
            if (z) {
                long j3 = this.p;
                this.p = 1 + j3;
                dVar.f4086g = j3;
            }
        } else {
            this.n.remove(dVar.a);
            this.f4077m.append((CharSequence) "REMOVE");
            this.f4077m.append(' ');
            this.f4077m.append((CharSequence) dVar.a);
            this.f4077m.append('\n');
        }
        T(this.f4077m);
        if (this.f4076l > this.f4074j || Z()) {
            this.q.submit(this.r);
        }
    }

    private static void D(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c N(String str, long j2) {
        v();
        d dVar = this.n.get(str);
        CallableC0098a callableC0098a = null;
        if (j2 != -1 && (dVar == null || dVar.f4086g != j2)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0098a);
            this.n.put(str, dVar);
        } else if (dVar.f4085f != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0098a);
        dVar.f4085f = cVar;
        this.f4077m.append((CharSequence) "DIRTY");
        this.f4077m.append(' ');
        this.f4077m.append((CharSequence) str);
        this.f4077m.append('\n');
        T(this.f4077m);
        return cVar;
    }

    @TargetApi(26)
    private static void T(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Z() {
        int i2 = this.o;
        return i2 >= 2000 && i2 >= this.n.size();
    }

    public static a a0(File file, int i2, int i3, long j2) throws IOException {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                q0(file2, file3, false);
            }
        }
        a aVar = new a(file, i2, i3, j2);
        if (aVar.f4070f.exists()) {
            try {
                aVar.h0();
                aVar.b0();
                return aVar;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                aVar.C();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i2, i3, j2);
        aVar2.k0();
        return aVar2;
    }

    private void b0() throws IOException {
        D(this.f4071g);
        Iterator<d> it = this.n.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i2 = 0;
            if (next.f4085f == null) {
                while (i2 < this.f4075k) {
                    this.f4076l += next.f4081b[i2];
                    i2++;
                }
            } else {
                next.f4085f = null;
                while (i2 < this.f4075k) {
                    D(next.j(i2));
                    D(next.k(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    private void h0() throws IOException {
        com.bumptech.glide.m.b bVar = new com.bumptech.glide.m.b(new FileInputStream(this.f4070f), com.bumptech.glide.m.c.a);
        try {
            String strG = bVar.g();
            String strG2 = bVar.g();
            String strG3 = bVar.g();
            String strG4 = bVar.g();
            String strG5 = bVar.g();
            if (!"libcore.io.DiskLruCache".equals(strG) || !"1".equals(strG2) || !Integer.toString(this.f4073i).equals(strG3) || !Integer.toString(this.f4075k).equals(strG4) || !"".equals(strG5)) {
                throw new IOException("unexpected journal header: [" + strG + ", " + strG2 + ", " + strG4 + ", " + strG5 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    j0(bVar.g());
                    i2++;
                } catch (EOFException unused) {
                    this.o = i2 - this.n.size();
                    if (bVar.d()) {
                        k0();
                    } else {
                        this.f4077m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4070f, true), com.bumptech.glide.m.c.a));
                    }
                    com.bumptech.glide.m.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th) {
            com.bumptech.glide.m.c.a(bVar);
            throw th;
        }
    }

    private void j0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i2 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i2);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i2);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.n.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i2, iIndexOf2);
        }
        d dVar = this.n.get(strSubstring);
        CallableC0098a callableC0098a = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, callableC0098a);
            this.n.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f4084e = true;
            dVar.f4085f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f4085f = new c(this, dVar, callableC0098a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k0() {
        Writer writer = this.f4077m;
        if (writer != null) {
            A(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4071g), com.bumptech.glide.m.c.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f4073i));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f4075k));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.n.values()) {
                if (dVar.f4085f != null) {
                    bufferedWriter.write("DIRTY " + dVar.a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.a + dVar.l() + '\n');
                }
            }
            A(bufferedWriter);
            if (this.f4070f.exists()) {
                q0(this.f4070f, this.f4072h, true);
            }
            q0(this.f4071g, this.f4070f, false);
            this.f4072h.delete();
            this.f4077m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4070f, true), com.bumptech.glide.m.c.a));
        } catch (Throwable th) {
            A(bufferedWriter);
            throw th;
        }
    }

    private static void q0(File file, File file2, boolean z) throws IOException {
        if (z) {
            D(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        while (this.f4076l > this.f4074j) {
            l0(this.n.entrySet().iterator().next().getKey());
        }
    }

    private void v() {
        if (this.f4077m == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public void C() throws IOException {
        close();
        com.bumptech.glide.m.c.b(this.f4069e);
    }

    public c K(String str) {
        return N(str, -1L);
    }

    public synchronized e W(String str) {
        v();
        d dVar = this.n.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f4084e) {
            return null;
        }
        for (File file : dVar.f4082c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.o++;
        this.f4077m.append((CharSequence) "READ");
        this.f4077m.append(' ');
        this.f4077m.append((CharSequence) str);
        this.f4077m.append('\n');
        if (Z()) {
            this.q.submit(this.r);
        }
        return new e(this, str, dVar.f4086g, dVar.f4082c, dVar.f4081b, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f4077m == null) {
            return;
        }
        Iterator it = new ArrayList(this.n.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f4085f != null) {
                dVar.f4085f.a();
            }
        }
        r0();
        A(this.f4077m);
        this.f4077m = null;
    }

    public synchronized boolean l0(String str) {
        v();
        d dVar = this.n.get(str);
        if (dVar != null && dVar.f4085f == null) {
            for (int i2 = 0; i2 < this.f4075k; i2++) {
                File fileJ = dVar.j(i2);
                if (fileJ.exists() && !fileJ.delete()) {
                    throw new IOException("failed to delete " + fileJ);
                }
                this.f4076l -= dVar.f4081b[i2];
                dVar.f4081b[i2] = 0;
            }
            this.o++;
            this.f4077m.append((CharSequence) "REMOVE");
            this.f4077m.append(' ');
            this.f4077m.append((CharSequence) str);
            this.f4077m.append('\n');
            this.n.remove(str);
            if (Z()) {
                this.q.submit(this.r);
            }
            return true;
        }
        return false;
    }
}