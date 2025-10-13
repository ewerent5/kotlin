package e.c.b.d.a.b;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.AdRequest;
import j$.util.Spliterator;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s {
    public static void a(PackageManager packageManager, ComponentName componentName, int i2) throws PackageManager.NameNotFoundException {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i2 | AdRequest.MAX_CONTENT_URL_LENGTH);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i3 = 0;
                    loop0: while (true) {
                        if (i3 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i3];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i4 = 0; i4 < length; i4++) {
                                componentInfo = componentInfoArr2[i4];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                        }
                        i3++;
                    }
                    if (componentInfo != null) {
                        if (componentInfo.isEnabled()) {
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    public static <T> void b(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static <T> void c(T t) {
        Objects.requireNonNull(t);
    }

    public static <T> void d(T t) {
        Objects.requireNonNull(t, "Cannot return null from a non-@Nullable @Provides method");
    }

    public static void e(v vVar, InputStream inputStream, OutputStream outputStream, long j2) throws IOException {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, Spliterator.CONCURRENT));
        int i2 = dataInputStream.readInt();
        if (i2 != -771763713) {
            String strValueOf = String.valueOf(String.format("%x", Integer.valueOf(i2)));
            throw new u(strValueOf.length() != 0 ? "Unexpected magic=".concat(strValueOf) : new String("Unexpected magic="));
        }
        int i3 = dataInputStream.read();
        if (i3 != 4) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unexpected version=");
            sb.append(i3);
            throw new u(sb.toString());
        }
        long j3 = 0;
        while (true) {
            long j4 = j2 - j3;
            try {
                int unsignedShort = dataInputStream.read();
                if (unsignedShort == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (unsignedShort == 0) {
                    return;
                }
                switch (unsignedShort) {
                    case 247:
                        unsignedShort = dataInputStream.readUnsignedShort();
                        f(bArr, dataInputStream, outputStream, unsignedShort, j4);
                        break;
                    case 248:
                        unsignedShort = dataInputStream.readInt();
                        f(bArr, dataInputStream, outputStream, unsignedShort, j4);
                        break;
                    case 249:
                        long unsignedShort2 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        g(bArr, vVar, outputStream, unsignedShort2, unsignedShort, j4);
                        break;
                    case 250:
                        long unsignedShort3 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        g(bArr, vVar, outputStream, unsignedShort3, unsignedShort, j4);
                        break;
                    case 251:
                        long unsignedShort4 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readInt();
                        g(bArr, vVar, outputStream, unsignedShort4, unsignedShort, j4);
                        break;
                    case 252:
                        long j5 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        g(bArr, vVar, outputStream, j5, unsignedShort, j4);
                        break;
                    case 253:
                        long j6 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        g(bArr, vVar, outputStream, j6, unsignedShort, j4);
                        break;
                    case 254:
                        long j7 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readInt();
                        g(bArr, vVar, outputStream, j7, unsignedShort, j4);
                        break;
                    case 255:
                        long j8 = dataInputStream.readLong();
                        unsignedShort = dataInputStream.readInt();
                        g(bArr, vVar, outputStream, j8, unsignedShort, j4);
                        break;
                    default:
                        f(bArr, dataInputStream, outputStream, unsignedShort, j4);
                        break;
                }
                j3 += unsignedShort;
            } finally {
                outputStream.flush();
            }
        }
    }

    private static void f(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i2, long j2) throws IOException {
        if (i2 < 0) {
            throw new IOException("copyLength negative");
        }
        if (i2 > j2) {
            throw new IOException("Output length overrun");
        }
        while (i2 > 0) {
            try {
                int iMin = Math.min(i2, 16384);
                dataInputStream.readFully(bArr, 0, iMin);
                outputStream.write(bArr, 0, iMin);
                i2 -= iMin;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }

    private static void g(byte[] bArr, v vVar, OutputStream outputStream, long j2, int i2, long j3) throws IOException {
        int i3 = i2;
        if (i3 < 0) {
            throw new IOException("copyLength negative");
        }
        if (j2 < 0) {
            throw new IOException("inputOffset negative");
        }
        long j4 = i3;
        if (j4 > j3) {
            throw new IOException("Output length overrun");
        }
        try {
            InputStream inputStreamD = new w(vVar, j2, j4).d();
            while (i3 > 0) {
                try {
                    int iMin = Math.min(i3, 16384);
                    int i4 = 0;
                    while (i4 < iMin) {
                        int i5 = inputStreamD.read(bArr, i4, iMin - i4);
                        if (i5 == -1) {
                            throw new IOException("truncated input stream");
                        }
                        i4 += i5;
                    }
                    outputStream.write(bArr, 0, iMin);
                    i3 -= iMin;
                } finally {
                }
            }
            inputStreamD.close();
        } catch (EOFException e2) {
            throw new IOException("patch underrun", e2);
        }
    }
}