package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.RecentlyNullable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class p {

    @Nullable
    private static String a;

    /* renamed from: b, reason: collision with root package name */
    private static int f4779b;

    @RecentlyNullable
    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (a == null) {
            if (f4779b == 0) {
                f4779b = Process.myPid();
            }
            int i2 = f4779b;
            String strTrim = null;
            strTrim = null;
            strTrim = null;
            BufferedReader bufferedReader2 = null;
            if (i2 > 0) {
                try {
                    StringBuilder sb = new StringBuilder(25);
                    sb.append("/proc/");
                    sb.append(i2);
                    sb.append("/cmdline");
                    String string = sb.toString();
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(string));
                        try {
                            String line = bufferedReader.readLine();
                            com.google.android.gms.common.internal.p.j(line);
                            strTrim = line.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            l.a(bufferedReader2);
                            throw th;
                        }
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                } catch (IOException unused2) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                l.a(bufferedReader);
            }
            a = strTrim;
        }
        return a;
    }
}