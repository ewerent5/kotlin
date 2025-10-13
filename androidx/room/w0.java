package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.room.q0;
import c.r.a.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;

/* compiled from: SQLiteCopyOpenHelper.java */
/* loaded from: classes.dex */
class w0 implements c.r.a.c, c0 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f1991e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1992f;

    /* renamed from: g, reason: collision with root package name */
    private final File f1993g;

    /* renamed from: h, reason: collision with root package name */
    private final Callable<InputStream> f1994h;

    /* renamed from: i, reason: collision with root package name */
    private final int f1995i;

    /* renamed from: j, reason: collision with root package name */
    private final c.r.a.c f1996j;

    /* renamed from: k, reason: collision with root package name */
    private b0 f1997k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1998l;

    /* compiled from: SQLiteCopyOpenHelper.java */
    class a extends c.a {
        a(int i2) {
            super(i2);
        }

        @Override // c.r.a.c.a
        public void d(c.r.a.b bVar) {
        }

        @Override // c.r.a.c.a
        public void g(c.r.a.b bVar, int i2, int i3) {
        }
    }

    w0(Context context, String str, File file, Callable<InputStream> callable, int i2, c.r.a.c cVar) {
        this.f1991e = context;
        this.f1992f = str;
        this.f1993g = file;
        this.f1994h = callable;
        this.f1995i = i2;
        this.f1996j = cVar;
    }

    private void b(File file, boolean z) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f1992f != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f1991e.getAssets().open(this.f1992f));
        } else if (this.f1993g != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f1993g).getChannel();
        } else {
            Callable<InputStream> callable = this.f1994h;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
            } catch (Exception e2) {
                throw new IOException("inputStreamCallable exception on call", e2);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f1991e.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        androidx.room.c1.d.a(readableByteChannelNewChannel, new FileOutputStream(fileCreateTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        d(fileCreateTempFile, z);
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private c.r.a.c c(File file) {
        try {
            return new c.r.a.g.c().a(c.b.a(this.f1991e).c(file.getName()).b(new a(androidx.room.c1.c.d(file))).a());
        } catch (IOException e2) {
            throw new RuntimeException("Malformed database file, unable to read version.", e2);
        }
    }

    private void d(File file, boolean z) {
        b0 b0Var = this.f1997k;
        if (b0Var == null || b0Var.f1801f == null) {
            return;
        }
        c.r.a.c cVarC = c(file);
        try {
            if (z) {
                cVarC.c0();
            } else {
                cVarC.V();
            }
            q0.e eVar = this.f1997k.f1801f;
            throw null;
        } catch (Throwable th) {
            cVarC.close();
            throw th;
        }
    }

    private void i(boolean z) {
        String databaseName = getDatabaseName();
        File databasePath = this.f1991e.getDatabasePath(databaseName);
        b0 b0Var = this.f1997k;
        androidx.room.c1.a aVar = new androidx.room.c1.a(databaseName, this.f1991e.getFilesDir(), b0Var == null || b0Var.f1807l);
        try {
            aVar.b();
            if (!databasePath.exists()) {
                try {
                    b(databasePath, z);
                    aVar.c();
                    return;
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to copy database file.", e2);
                }
            }
            if (this.f1997k == null) {
                aVar.c();
                return;
            }
            try {
                int iD = androidx.room.c1.c.d(databasePath);
                int i2 = this.f1995i;
                if (iD == i2) {
                    aVar.c();
                    return;
                }
                if (this.f1997k.a(iD, i2)) {
                    aVar.c();
                    return;
                }
                if (this.f1991e.deleteDatabase(databaseName)) {
                    try {
                        b(databasePath, z);
                    } catch (IOException e3) {
                        Log.w("ROOM", "Unable to copy database file.", e3);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.c();
                return;
            } catch (IOException e4) {
                Log.w("ROOM", "Unable to read database version.", e4);
                aVar.c();
                return;
            }
        } catch (Throwable th) {
            aVar.c();
            throw th;
        }
        aVar.c();
        throw th;
    }

    @Override // c.r.a.c
    public synchronized c.r.a.b V() {
        if (!this.f1998l) {
            i(false);
            this.f1998l = true;
        }
        return this.f1996j.V();
    }

    @Override // c.r.a.c
    public synchronized c.r.a.b c0() {
        if (!this.f1998l) {
            i(true);
            this.f1998l = true;
        }
        return this.f1996j.c0();
    }

    @Override // c.r.a.c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f1996j.close();
        this.f1998l = false;
    }

    void g(b0 b0Var) {
        this.f1997k = b0Var;
    }

    @Override // c.r.a.c
    public String getDatabaseName() {
        return this.f1996j.getDatabaseName();
    }

    @Override // androidx.room.c0
    public c.r.a.c getDelegate() {
        return this.f1996j;
    }

    @Override // c.r.a.c
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f1996j.setWriteAheadLoggingEnabled(z);
    }
}