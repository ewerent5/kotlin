package e.c.b.b.c.e;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class r2 {
    private static s2 a(File file) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String strValueOf = String.valueOf(file);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
                        sb.append("Parsed ");
                        sb.append(strValueOf);
                        Log.i("HermeticFileOverrides", sb.toString());
                        s2 s2Var = new s2(map);
                        bufferedReader.close();
                        return s2Var;
                    }
                    String[] strArrSplit = line.split(" ", 3);
                    if (strArrSplit.length != 3) {
                        Log.e("HermeticFileOverrides", line.length() != 0 ? "Invalid: ".concat(line) : new String("Invalid: "));
                    } else {
                        String str = strArrSplit[0];
                        String strDecode = Uri.decode(strArrSplit[1]);
                        String strDecode2 = Uri.decode(strArrSplit[2]);
                        if (!map.containsKey(str)) {
                            map.put(str, new HashMap());
                        }
                        ((Map) map.get(str)).put(strDecode, strDecode2);
                    }
                }
            } finally {
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static n3<s2> b(Context context) {
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        boolean z = false;
        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
            z = true;
        }
        if (!z) {
            return n3.d();
        }
        if (f2.a() && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        n3<File> n3VarC = c(context);
        return n3VarC.b() ? n3.a(a(n3VarC.c())) : n3.d();
    }

    private static n3<File> c(Context context) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? n3.a(file) : n3.d();
        } catch (RuntimeException e2) {
            Log.e("HermeticFileOverrides", "no data dir", e2);
            return n3.d();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}