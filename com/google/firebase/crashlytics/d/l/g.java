package com.google.firebase.crashlytics.d.l;

import com.google.firebase.crashlytics.d.h.p;
import com.google.firebase.crashlytics.d.j.v;
import com.google.firebase.crashlytics.d.j.w;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CrashlyticsReportPersistence.java */
/* loaded from: classes.dex */
public class g {
    private static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final int f12669b = 15;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.firebase.crashlytics.d.j.x.h f12670c = new com.google.firebase.crashlytics.d.j.x.h();

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator<? super File> f12671d = e.a();

    /* renamed from: e, reason: collision with root package name */
    private static final FilenameFilter f12672e = f.a();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f12673f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    private final File f12674g;

    /* renamed from: h, reason: collision with root package name */
    private final File f12675h;

    /* renamed from: i, reason: collision with root package name */
    private final File f12676i;

    /* renamed from: j, reason: collision with root package name */
    private final File f12677j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.p.e f12678k;

    public g(File file, com.google.firebase.crashlytics.d.p.e eVar) {
        File file2 = new File(file, "report-persistence");
        this.f12674g = new File(file2, "sessions");
        this.f12675h = new File(file2, "priority-reports");
        this.f12676i = new File(file2, "reports");
        this.f12677j = new File(file2, "native-reports");
        this.f12678k = eVar;
    }

    private static File C(File file) throws IOException {
        if (y(file)) {
            return file;
        }
        throw new IOException("Could not create directory " + file);
    }

    private static String D(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), a);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
    }

    private static void E(File file) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                E(file2);
            }
        }
        file.delete();
    }

    private static List<File> F(List<File>... listArr) {
        for (List<File> list : listArr) {
            Collections.sort(list, f12671d);
        }
        return f(listArr);
    }

    private static void G(File file, File file2, v.c cVar, String str) {
        try {
            com.google.firebase.crashlytics.d.j.x.h hVar = f12670c;
            K(new File(C(file2), str), hVar.E(hVar.D(D(file)).n(cVar)));
        } catch (IOException e2) {
            com.google.firebase.crashlytics.d.b.f().c("Could not synthesize final native report file for " + file, e2);
        }
    }

    private void H(File file, long j2) {
        boolean z;
        List<File> listP = p(file, f12672e);
        if (listP.isEmpty()) {
            com.google.firebase.crashlytics.d.b.f().b("Session " + file.getName() + " has no events.");
            return;
        }
        Collections.sort(listP);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file2 : listP) {
                try {
                    arrayList.add(f12670c.h(D(file2)));
                } catch (IOException e2) {
                    com.google.firebase.crashlytics.d.b.f().c("Could not add event to report for " + file2, e2);
                }
                if (z || r(file2.getName())) {
                    z = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            com.google.firebase.crashlytics.d.b.f().b("Could not parse event files for session " + file.getName());
            return;
        }
        String strD = null;
        File file3 = new File(file, "user");
        if (file3.isFile()) {
            try {
                strD = D(file3);
            } catch (IOException e3) {
                com.google.firebase.crashlytics.d.b.f().c("Could not read user ID file in " + file.getName(), e3);
            }
        }
        I(new File(file, "report"), z ? this.f12675h : this.f12676i, arrayList, j2, z, strD);
    }

    private static void I(File file, File file2, List<v.d.AbstractC0137d> list, long j2, boolean z, String str) {
        try {
            com.google.firebase.crashlytics.d.j.x.h hVar = f12670c;
            v vVarM = hVar.D(D(file)).o(j2, z, str).m(w.a(list));
            v.d dVarJ = vVarM.j();
            if (dVarJ == null) {
                return;
            }
            K(new File(C(file2), dVarJ.h()), hVar.E(vVarM));
        } catch (IOException e2) {
            com.google.firebase.crashlytics.d.b.f().c("Could not synthesize final report file for " + file, e2);
        }
    }

    private static int J(File file, int i2) {
        List<File> listP = p(file, c.a());
        Collections.sort(listP, d.a());
        return d(listP, i2);
    }

    private static void K(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), a);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    private List<File> c(String str) {
        List<File> listO = o(this.f12674g, b.a(str));
        Collections.sort(listO, f12671d);
        if (listO.size() <= 8) {
            return listO;
        }
        Iterator<File> it = listO.subList(8, listO.size()).iterator();
        while (it.hasNext()) {
            E(it.next());
        }
        return listO.subList(0, 8);
    }

    private static int d(List<File> list, int i2) {
        int size = list.size();
        for (File file : list) {
            if (size <= i2) {
                return size;
            }
            E(file);
            size--;
        }
        return size;
    }

    private void e() {
        int i2 = this.f12678k.b().b().f12750b;
        List<File> listM = m();
        int size = listM.size();
        if (size <= i2) {
            return;
        }
        Iterator<File> it = listM.subList(i2, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static List<File> f(List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int size = 0;
        for (List<File> list : listArr) {
            size += list.size();
        }
        arrayList.ensureCapacity(size);
        for (List<File> list2 : listArr) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    private static String k(int i2, boolean z) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i2)) + (z ? "_" : "");
    }

    private static List<File> l(File file) {
        return o(file, null);
    }

    private List<File> m() {
        return F(f(l(this.f12675h), l(this.f12677j)), l(this.f12676i));
    }

    private static String n(String str) {
        return str.substring(0, f12669b);
    }

    private static List<File> o(File file, FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] fileArrListFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return fileArrListFiles != null ? Arrays.asList(fileArrListFiles) : Collections.emptyList();
    }

    private static List<File> p(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] fileArrListFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return fileArrListFiles != null ? Arrays.asList(fileArrListFiles) : Collections.emptyList();
    }

    private File q(String str) {
        return new File(this.f12674g, str);
    }

    private static boolean r(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean s(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    static /* synthetic */ boolean t(String str, File file) {
        return file.isDirectory() && !file.getName().equals(str);
    }

    private static boolean y(File file) {
        return file.exists() || file.mkdirs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int z(File file, File file2) {
        return n(file.getName()).compareTo(n(file2.getName()));
    }

    public void A(v.d.AbstractC0137d abstractC0137d, String str, boolean z) {
        int i2 = this.f12678k.b().b().a;
        File fileQ = q(str);
        try {
            K(new File(fileQ, k(this.f12673f.getAndIncrement(), z)), f12670c.i(abstractC0137d));
        } catch (IOException e2) {
            com.google.firebase.crashlytics.d.b.f().c("Could not persist event for session " + str, e2);
        }
        J(fileQ, i2);
    }

    public void B(v vVar) {
        v.d dVarJ = vVar.j();
        if (dVarJ == null) {
            com.google.firebase.crashlytics.d.b.f().b("Could not get session for report");
            return;
        }
        String strH = dVarJ.h();
        try {
            K(new File(C(q(strH)), "report"), f12670c.E(vVar));
        } catch (IOException e2) {
            com.google.firebase.crashlytics.d.b.f().c("Could not persist report for session " + strH, e2);
        }
    }

    public void g() {
        Iterator<File> it = m().iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    public void h(String str) {
        FilenameFilter filenameFilterA = a.a(str);
        Iterator<File> it = f(p(this.f12675h, filenameFilterA), p(this.f12677j, filenameFilterA), p(this.f12676i, filenameFilterA)).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    public void i(String str, long j2) {
        for (File file : c(str)) {
            com.google.firebase.crashlytics.d.b.f().b("Finalizing report for session " + file.getName());
            H(file, j2);
            E(file);
        }
        e();
    }

    public void j(String str, v.c cVar) {
        G(new File(q(str), "report"), this.f12677j, cVar, str);
    }

    public List<p> x() {
        List<File> listM = m();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(listM.size());
        for (File file : m()) {
            try {
                arrayList.add(p.a(f12670c.D(D(file)), file.getName()));
            } catch (IOException e2) {
                com.google.firebase.crashlytics.d.b.f().c("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        return arrayList;
    }
}