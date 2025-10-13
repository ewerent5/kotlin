package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* loaded from: classes.dex */
final class x1 {
    private static final e.c.b.d.a.b.f a = new e.c.b.d.a.b.f("SliceMetadataManager");

    /* renamed from: c, reason: collision with root package name */
    private final v f12191c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12192d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12193e;

    /* renamed from: f, reason: collision with root package name */
    private final long f12194f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12195g;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12190b = new byte[8192];

    /* renamed from: h, reason: collision with root package name */
    private int f12196h = -1;

    x1(v vVar, String str, int i2, long j2, String str2) {
        this.f12191c = vVar;
        this.f12192d = str;
        this.f12193e = i2;
        this.f12194f = j2;
        this.f12195g = str2;
    }

    private final File n() {
        File fileC = this.f12191c.C(this.f12192d, this.f12193e, this.f12194f, this.f12195g);
        if (!fileC.exists()) {
            fileC.mkdirs();
        }
        return fileC;
    }

    private final File o() throws IOException {
        File fileA = this.f12191c.A(this.f12192d, this.f12193e, this.f12194f, this.f12195g);
        fileA.getParentFile().mkdirs();
        fileA.createNewFile();
        return fileA;
    }

    final void a(String str, long j2, long j3, int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j2));
        properties.put("remainingBytes", String.valueOf(j3));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f12196h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                e.c.b.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final void b(byte[] bArr, int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f12196h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File fileB = this.f12191c.B(this.f12192d, this.f12193e, this.f12194f, this.f12195g);
            if (fileB.exists()) {
                fileB.delete();
            }
            fileOutputStream = new FileOutputStream(fileB);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable th) {
                    e.c.b.d.a.b.d0.a(th, th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final void c(int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(j().length()));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f12196h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                e.c.b.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final void d(int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f12196h));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                e.c.b.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final w1 e() throws IOException, NumberFormatException {
        File fileA = this.f12191c.A(this.f12192d, this.f12193e, this.f12194f, this.f12195g);
        if (!fileA.exists()) {
            throw new k0("Slice checkpoint file does not exist.");
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(fileA);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                throw new k0("Slice checkpoint file corrupt.");
            }
            try {
                int i2 = Integer.parseInt(properties.getProperty("fileStatus"));
                String property = properties.getProperty("fileName");
                long j2 = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                long j3 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                int i3 = Integer.parseInt(properties.getProperty("previousChunk"));
                this.f12196h = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                return new w1(i2, property, j2, j3, i3);
            } catch (NumberFormatException e2) {
                throw new k0("Slice checkpoint file corrupt.", e2);
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

    final void f(InputStream inputStream, long j2) throws IOException {
        int i2;
        RandomAccessFile randomAccessFile = new RandomAccessFile(j(), "rw");
        try {
            randomAccessFile.seek(j2);
            do {
                i2 = inputStream.read(this.f12190b);
                if (i2 > 0) {
                    randomAccessFile.write(this.f12190b, 0, i2);
                }
            } while (i2 == 8192);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                e.c.b.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final void g(byte[] bArr) throws IOException {
        this.f12196h++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(n(), String.format("%s-LFH.dat", Integer.valueOf(this.f12196h))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e2) {
            throw new k0("Could not write metadata file.", e2);
        }
    }

    final void h(byte[] bArr, InputStream inputStream) throws IOException {
        this.f12196h++;
        FileOutputStream fileOutputStream = new FileOutputStream(j());
        try {
            fileOutputStream.write(bArr);
            int i2 = inputStream.read(this.f12190b);
            while (i2 > 0) {
                fileOutputStream.write(this.f12190b, 0, i2);
                i2 = inputStream.read(this.f12190b);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                e.c.b.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final void i(long j2, byte[] bArr, int i2, int i3) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(j(), "rw");
        try {
            randomAccessFile.seek(j2);
            randomAccessFile.write(bArr, i2, i3);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                e.c.b.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final File j() {
        return new File(n(), String.format("%s-NAM.dat", Integer.valueOf(this.f12196h)));
    }

    final int k() throws IOException {
        File fileA = this.f12191c.A(this.f12192d, this.f12193e, this.f12194f, this.f12195g);
        if (!fileA.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(fileA);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new k0("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                e.c.b.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }

    final boolean l() throws IOException {
        File fileA = this.f12191c.A(this.f12192d, this.f12193e, this.f12194f, this.f12195g);
        if (!fileA.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(fileA);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                a.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } finally {
            }
        } catch (IOException e2) {
            a.b("Could not read checkpoint while checking if extraction finished. %s", e2);
            return false;
        }
    }

    final void m(byte[] bArr, int i2) throws IOException {
        this.f12196h++;
        FileOutputStream fileOutputStream = new FileOutputStream(j());
        try {
            fileOutputStream.write(bArr, 0, i2);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                e.c.b.d.a.b.d0.a(th, th2);
            }
            throw th;
        }
    }
}