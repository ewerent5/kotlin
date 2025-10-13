package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
final class j0 {
    private static final e.c.b.d.a.b.f a = new e.c.b.d.a.b.f("ExtractChunkTaskHandler");

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12046b = new byte[8192];

    /* renamed from: c, reason: collision with root package name */
    private final v f12047c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.b.d.a.b.e0<s2> f12048d;

    /* renamed from: e, reason: collision with root package name */
    private final e.c.b.d.a.b.e0<s> f12049e;

    /* renamed from: f, reason: collision with root package name */
    private final o0 f12050f;

    j0(v vVar, e.c.b.d.a.b.e0<s2> e0Var, e.c.b.d.a.b.e0<s> e0Var2, o0 o0Var) {
        this.f12047c = vVar;
        this.f12048d = e0Var;
        this.f12049e = e0Var2;
        this.f12050f = o0Var;
    }

    private final File b(i0 i0Var) {
        File fileV = this.f12047c.v(i0Var.f11951b, i0Var.f12033c, i0Var.f12034d, i0Var.f12035e);
        if (!fileV.exists()) {
            fileV.mkdirs();
        }
        return fileV;
    }

    public final void a(i0 i0Var) throws IOException {
        InputStream sequenceInputStream;
        c2 c2VarB;
        File fileJ;
        long length;
        int iMin;
        int iMax;
        long j2;
        x1 x1Var = new x1(this.f12047c, i0Var.f11951b, i0Var.f12033c, i0Var.f12034d, i0Var.f12035e);
        File fileC = this.f12047c.C(i0Var.f11951b, i0Var.f12033c, i0Var.f12034d, i0Var.f12035e);
        if (!fileC.exists()) {
            fileC.mkdirs();
        }
        try {
            InputStream inputStream = i0Var.f12041k;
            InputStream gZIPInputStream = i0Var.f12036f != 1 ? inputStream : new GZIPInputStream(inputStream, 8192);
            try {
                if (i0Var.f12037g > 0) {
                    w1 w1VarE = x1Var.e();
                    int iE = w1VarE.e();
                    int i2 = i0Var.f12037g;
                    if (iE != i2 - 1) {
                        throw new k0(String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", Integer.valueOf(i2), Integer.valueOf(w1VarE.e())), i0Var.a);
                    }
                    int iA = w1VarE.a();
                    if (iA == 1) {
                        a.a("Resuming zip entry from last chunk during file %s.", w1VarE.b());
                        File file = new File(w1VarE.b());
                        if (!file.exists()) {
                            throw new k0("Partial file specified in checkpoint does not exist. Corrupt directory.", i0Var.a);
                        }
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                        randomAccessFile.seek(w1VarE.c());
                        long jD = w1VarE.d();
                        while (true) {
                            iMin = (int) Math.min(jD, 8192L);
                            iMax = Math.max(gZIPInputStream.read(this.f12046b, 0, iMin), 0);
                            if (iMax > 0) {
                                randomAccessFile.write(this.f12046b, 0, iMax);
                            }
                            j2 = jD - iMax;
                            if (j2 <= 0 || iMax <= 0) {
                                break;
                            } else {
                                jD = j2;
                            }
                        }
                        long length2 = randomAccessFile.length();
                        randomAccessFile.close();
                        if (iMax != iMin) {
                            a.a("Chunk has ended while resuming the previous chunks file content.", new Object[0]);
                            x1Var.a(file.getCanonicalPath(), length2, j2, i0Var.f12037g);
                        }
                        sequenceInputStream = gZIPInputStream;
                    } else if (iA == 2) {
                        a.a("Resuming zip entry from last chunk during local file header.", new Object[0]);
                        File fileB = this.f12047c.B(i0Var.f11951b, i0Var.f12033c, i0Var.f12034d, i0Var.f12035e);
                        if (!fileB.exists()) {
                            throw new k0("Checkpoint extension file not found.", i0Var.a);
                        }
                        sequenceInputStream = new SequenceInputStream(new FileInputStream(fileB), gZIPInputStream);
                    } else {
                        if (iA != 3) {
                            throw new k0(String.format("Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s.", Integer.valueOf(w1VarE.a())), i0Var.a);
                        }
                        a.a("Resuming central directory from last chunk.", new Object[0]);
                        x1Var.f(gZIPInputStream, w1VarE.c());
                        if (!i0Var.a()) {
                            throw new k0("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", i0Var.a);
                        }
                    }
                    sequenceInputStream = null;
                } else {
                    sequenceInputStream = gZIPInputStream;
                }
                if (sequenceInputStream != null) {
                    d0 d0Var = new d0(sequenceInputStream);
                    File fileB2 = b(i0Var);
                    do {
                        c2VarB = d0Var.b();
                        if (!c2VarB.g() && !d0Var.d()) {
                            if (!c2VarB.c() || c2VarB.b()) {
                                x1Var.h(c2VarB.i(), d0Var);
                            } else {
                                x1Var.g(c2VarB.i());
                                File file2 = new File(fileB2, c2VarB.d());
                                file2.getParentFile().mkdirs();
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                int i3 = d0Var.read(this.f12046b);
                                while (i3 > 0) {
                                    fileOutputStream.write(this.f12046b, 0, i3);
                                    i3 = d0Var.read(this.f12046b);
                                }
                                fileOutputStream.close();
                            }
                        }
                        if (d0Var.c()) {
                            break;
                        }
                    } while (!d0Var.d());
                    if (d0Var.d()) {
                        a.a("Writing central directory metadata.", new Object[0]);
                        x1Var.h(c2VarB.i(), sequenceInputStream);
                    }
                    if (!i0Var.a()) {
                        if (c2VarB.g()) {
                            a.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                            x1Var.b(c2VarB.i(), i0Var.f12037g);
                        } else if (d0Var.d()) {
                            a.a("Writing slice checkpoint for central directory.", new Object[0]);
                            x1Var.c(i0Var.f12037g);
                        } else {
                            if (c2VarB.f() == 0) {
                                a.a("Writing slice checkpoint for partial file.", new Object[0]);
                                fileJ = new File(b(i0Var), c2VarB.d());
                                length = c2VarB.e() - d0Var.g();
                                if (fileJ.length() != length) {
                                    throw new k0("Partial file is of unexpected size.");
                                }
                            } else {
                                a.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                fileJ = x1Var.j();
                                length = fileJ.length();
                            }
                            x1Var.a(fileJ.getCanonicalPath(), length, d0Var.g(), i0Var.f12037g);
                        }
                    }
                }
                gZIPInputStream.close();
                if (i0Var.a()) {
                    try {
                        x1Var.d(i0Var.f12037g);
                    } catch (IOException e2) {
                        a.b("Writing extraction finished checkpoint failed with %s.", e2.getMessage());
                        throw new k0("Writing extraction finished checkpoint failed.", e2, i0Var.a);
                    }
                }
                a.d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(i0Var.f12037g), i0Var.f12035e, i0Var.f11951b, Integer.valueOf(i0Var.a));
                this.f12048d.a().c(i0Var.a, i0Var.f11951b, i0Var.f12035e, i0Var.f12037g);
                try {
                    i0Var.f12041k.close();
                } catch (IOException unused) {
                    a.e("Could not close file for chunk %s of slice %s of pack %s.", Integer.valueOf(i0Var.f12037g), i0Var.f12035e, i0Var.f11951b);
                }
                if (i0Var.f12040j == 3) {
                    s sVarA = this.f12049e.a();
                    String str = i0Var.f11951b;
                    long j3 = i0Var.f12039i;
                    sVarA.f(AssetPackState.d(str, 3, 0, j3, j3, this.f12050f.c(str, i0Var), 1, ""));
                }
            } finally {
            }
        } catch (IOException e3) {
            a.b("IOException during extraction %s.", e3.getMessage());
            throw new k0(String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(i0Var.f12037g), i0Var.f12035e, i0Var.f11951b, Integer.valueOf(i0Var.a)), e3, i0Var.a);
        }
    }
}