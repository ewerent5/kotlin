package k.c.e.o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: StorageUtils.java */
/* loaded from: classes3.dex */
public class e {

    /* compiled from: StorageUtils.java */
    public static class a {
        public final String a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16714b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16715c;

        /* renamed from: d, reason: collision with root package name */
        public final int f16716d;

        /* renamed from: e, reason: collision with root package name */
        public long f16717e;

        /* renamed from: f, reason: collision with root package name */
        public String f16718f;

        public a(String str, boolean z, boolean z2, int i2) {
            this.f16717e = 0L;
            this.a = str;
            this.f16714b = z;
            this.f16716d = i2;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 18) {
                this.f16717e = new StatFs(str).getAvailableBytes();
            } else if (i3 >= 9) {
                this.f16717e = new File(str).getFreeSpace();
            }
            if (!z2) {
                this.f16715c = !e.h(new File(str));
            }
            StringBuilder sb = new StringBuilder();
            if (z) {
                sb.append("Internal SD card");
            } else if (i2 > 1) {
                sb.append("SD card ");
                sb.append(i2);
            } else {
                sb.append("SD card");
            }
            if (z2) {
                sb.append(" (Read only)");
            }
            this.f16718f = sb.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f16714b != aVar.f16714b || this.f16715c != aVar.f16715c || this.f16716d != aVar.f16716d || this.f16717e != aVar.f16717e) {
                return false;
            }
            String str = this.a;
            if (str == null ? aVar.a != null : !str.equals(aVar.a)) {
                return false;
            }
            String str2 = this.f16718f;
            String str3 = aVar.f16718f;
            return str2 != null ? str2.equals(str3) : str3 == null;
        }

        public int hashCode() {
            String str = this.a;
            int iHashCode = (((((((str != null ? str.hashCode() : 0) * 31) + (this.f16714b ? 1 : 0)) * 31) + (this.f16715c ? 1 : 0)) * 31) + this.f16716d) * 31;
            long j2 = this.f16717e;
            int i2 = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            String str2 = this.f16718f;
            return i2 + (str2 != null ? str2.hashCode() : 0);
        }
    }

    private static Set<File> a() {
        HashSet hashSet = new HashSet();
        for (File file : k()) {
            if (h(file)) {
                hashSet.add(file);
            }
        }
        if (Environment.getExternalStorageDirectory() != null) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (h(externalStorageDirectory)) {
                hashSet.add(externalStorageDirectory);
            }
        }
        for (File file2 : j().values()) {
            if (h(file2)) {
                hashSet.add(file2);
            }
        }
        return hashSet;
    }

    public static a b(Context context) {
        List<a> listD = d(context);
        a aVar = null;
        for (int i2 = 0; i2 < listD.size(); i2++) {
            a aVar2 = listD.get(i2);
            if (!aVar2.f16715c && h(new File(aVar2.a)) && (aVar == null || aVar.f16717e < aVar2.f16717e)) {
                aVar = aVar2;
            }
        }
        return aVar;
    }

    private static a c() {
        String path = "";
        try {
            if (Environment.getExternalStorageDirectory() != null) {
                path = Environment.getExternalStorageDirectory().getPath();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        boolean zEquals = true;
        boolean zG = false;
        try {
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        boolean z = Build.VERSION.SDK_INT >= 9 ? !Environment.isExternalStorageRemovable() : false;
        try {
            zG = g();
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            zEquals = Environment.getExternalStorageState().equals("mounted_ro");
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        if (zG) {
            return new a(path, z, zEquals, -1);
        }
        return null;
    }

    public static List<a> d(Context context) {
        List<a> list;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            return context != null ? e(context) : f();
        }
        if (i2 >= 19) {
            List<a> listF = f();
            list = listF;
            if (context != null) {
                List<a> listE = e(context);
                listE.removeAll(listF);
                listF.addAll(listE);
                list = listF;
            }
        } else {
            List<a> listF2 = f();
            int size = listF2.size();
            list = listF2;
            list = listF2;
            if (size == 0 && context != null) {
                String strReplace = context.getDatabasePath("temp.sqlite").getAbsolutePath().replace("temp.sqlite", "");
                list = listF2;
                if (h(new File(strReplace))) {
                    listF2.add(new a(strReplace, true, false, -1));
                    list = listF2;
                }
            }
        }
        return list;
    }

    @SuppressLint({"NewApi"})
    private static List<a> e(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(context.getFilesDir().getAbsolutePath(), true, false, -1));
        ArrayList arrayList2 = new ArrayList();
        for (File file : context.getExternalFilesDirs(null)) {
            if (file != null && "mounted".equals(Environment.getStorageState(file))) {
                arrayList2.add(file);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(((File) it.next()).getAbsolutePath(), false, false, -1));
        }
        return arrayList;
    }

    private static List<a> f() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        a aVarC = c();
        if (aVarC != null) {
            arrayList.add(aVarC);
        }
        arrayList.addAll(i(aVarC != null ? aVarC.a : ""));
        for (File file : a()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((a) it.next()).a.equals(file.getAbsolutePath())) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                arrayList.add(new a(file.getAbsolutePath(), false, false, -1));
            }
        }
        return arrayList;
    }

    private static boolean g() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    public static boolean h(File file) {
        try {
            File file2 = new File(file.getAbsolutePath() + File.separator + UUID.randomUUID().toString());
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write("hi".getBytes());
            fileOutputStream.close();
            file2.delete();
            Log.i("StorageUtils", file.getAbsolutePath() + " is writable");
            return true;
        } catch (Throwable unused) {
            Log.i("StorageUtils", file.getAbsolutePath() + " is NOT writable");
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dc, code lost:
    
        if (r3 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00de, code lost:
    
        r3.close();
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
    
        if (r3 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<k.c.e.o.e.a> i(java.lang.String r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.c.e.o.e.i(java.lang.String):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0187: MOVE (r7 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:91:0x0187 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0058 A[EXC_TOP_SPLITTER, PHI: r10
  0x0058: PHI (r10v3 java.util.Scanner) = (r10v2 java.util.Scanner), (r10v17 java.util.Scanner) binds: [B:25:0x0064, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00b6 A[EXC_TOP_SPLITTER, PHI: r7
  0x00b6: PHI (r7v5 java.util.Scanner) = (r7v12 java.util.Scanner), (r7v13 java.util.Scanner) binds: [B:54:0x00c1, B:47:0x00b4] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: all -> 0x00ba, Exception -> 0x00bd, TRY_LEAVE, TryCatch #2 {Exception -> 0x00bd, blocks: (B:28:0x0068, B:30:0x0075), top: B:101:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.Map<java.lang.String, java.io.File> j() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.c.e.o.e.j():java.util.Map");
    }

    private static Set<File> k() {
        HashSet hashSet = new HashSet();
        String str = System.getenv("EXTERNAL_STORAGE");
        if (str != null) {
            hashSet.add(new File(str + File.separator));
        }
        String str2 = System.getenv("SECONDARY_STORAGE");
        if (str2 != null) {
            for (String str3 : str2.split(File.pathSeparator)) {
                hashSet.add(new File(str3 + File.separator));
            }
        }
        return hashSet;
    }
}