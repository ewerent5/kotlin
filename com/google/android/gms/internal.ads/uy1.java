package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class uy1 {
    public static boolean a(sr2 sr2Var) {
        sr2 sr2Var2 = sr2.UNSUPPORTED;
        int iOrdinal = sr2Var.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4;
    }

    public static final sr2 b(Context context, lx1 lx1Var) {
        sr2 sr2Var;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new b32(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (lx1Var != null) {
                    lx1Var.f(5017, "No .so");
                }
                sr2Var = sr2.UNKNOWN;
            } else {
                try {
                    fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e2) {
                    c(null, e2.toString(), context, lx1Var);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        c(bArr, null, context, lx1Var);
                        sr2Var = sr2.UNSUPPORTED;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = ByteBuffer.wrap(bArr2).getShort();
                        if (s == 3) {
                            sr2Var = sr2.X86;
                        } else if (s == 40) {
                            sr2Var = sr2.ARM7;
                        } else if (s == 62) {
                            sr2Var = sr2.X86_64;
                        } else if (s != 183) {
                            c(bArr, null, context, lx1Var);
                            sr2Var = sr2.UNSUPPORTED;
                        } else {
                            sr2Var = sr2.ARM64;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    sr2Var = sr2.UNSUPPORTED;
                }
            }
        } else {
            if (lx1Var != null) {
                lx1Var.f(5017, "No lib/");
            }
            sr2Var = sr2.UNKNOWN;
        }
        if (sr2Var == sr2.UNKNOWN) {
            String strD = d(context, lx1Var);
            if (TextUtils.isEmpty(strD)) {
                c(null, "Empty dev arch", context, lx1Var);
                sr2Var = sr2.UNSUPPORTED;
            } else if (strD.equalsIgnoreCase("i686") || strD.equalsIgnoreCase("x86")) {
                sr2Var = sr2.X86;
            } else if (strD.equalsIgnoreCase("x86_64")) {
                sr2Var = sr2.X86_64;
            } else if (strD.equalsIgnoreCase("arm64-v8a")) {
                sr2Var = sr2.ARM64;
            } else if (strD.equalsIgnoreCase("armeabi-v7a") || strD.equalsIgnoreCase("armv71")) {
                sr2Var = sr2.ARM7;
            } else {
                c(null, strD, context, lx1Var);
                sr2Var = sr2.UNSUPPORTED;
            }
        }
        if (lx1Var != null) {
            lx1Var.f(5018, sr2Var.name());
        }
        return sr2Var;
    }

    private static final void c(byte[] bArr, String str, Context context, lx1 lx1Var) {
        if (lx1Var == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(n12.OS_ARCH.a());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        lx1Var.f(4007, sb.toString());
    }

    private static final String d(Context context, lx1 lx1Var) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strA = n12.OS_ARCH.a();
        if (!TextUtils.isEmpty(strA) && hashSet.contains(strA)) {
            return strA;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e2) {
            if (lx1Var != null) {
                lx1Var.d(2024, 0L, e2);
            }
        } catch (NoSuchFieldException e3) {
            if (lx1Var != null) {
                lx1Var.d(2024, 0L, e3);
            }
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }
}