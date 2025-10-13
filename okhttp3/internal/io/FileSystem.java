package okhttp3.internal.io;

import ch.qos.logback.core.joran.action.Action;
import i.y.d.g;
import i.y.d.l;
import j.b0;
import j.d0;
import j.q;
import j.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: FileSystem.kt */
/* loaded from: classes3.dex */
public interface FileSystem {
    public static final Companion Companion = new Companion(null);
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* compiled from: FileSystem.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        /* compiled from: FileSystem.kt */
        private static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public b0 appendingSink(File file) {
                l.d(file, Action.FILE_ATTRIBUTE);
                try {
                    return q.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return q.a(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(File file) throws IOException {
                l.d(file, Action.FILE_ATTRIBUTE);
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(File file) throws IOException {
                l.d(file, "directory");
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + file);
                }
                for (File file2 : fileArrListFiles) {
                    l.c(file2, Action.FILE_ATTRIBUTE);
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                l.d(file, Action.FILE_ATTRIBUTE);
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(File file, File file2) throws IOException {
                l.d(file, "from");
                l.d(file2, "to");
                delete(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // okhttp3.internal.io.FileSystem
            public b0 sink(File file) {
                l.d(file, Action.FILE_ATTRIBUTE);
                try {
                    return r.g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return r.g(file, false, 1, null);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(File file) {
                l.d(file, Action.FILE_ATTRIBUTE);
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public d0 source(File file) {
                l.d(file, Action.FILE_ATTRIBUTE);
                return q.j(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    b0 appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    b0 sink(File file);

    long size(File file);

    d0 source(File file);
}