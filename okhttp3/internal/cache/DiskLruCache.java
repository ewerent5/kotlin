package okhttp3.internal.cache;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import i.d;
import i.d0.f;
import i.d0.p;
import i.s;
import i.x.a;
import i.y.d.l;
import j$.util.Iterator;
import j$.util.function.Consumer;
import j.b0;
import j.d0;
import j.g;
import j.h;
import j.q;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes3.dex */
public final class DiskLruCache implements Closeable, Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private g journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final Companion Companion = new Companion(null);
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final f LEGAL_KEY_PATTERN = new f("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    /* compiled from: DiskLruCache.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i.y.d.g gVar) {
            this();
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            l.d(entry, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable$okhttp() ? null : new boolean[diskLruCache.getValueCount$okhttp()];
        }

        public final void abort() {
            synchronized (this.this$0) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (l.a(this.entry.getCurrentEditor$okhttp(), this)) {
                    this.this$0.completeEdit$okhttp(this, false);
                }
                this.done = true;
                s sVar = s.a;
            }
        }

        public final void commit() {
            synchronized (this.this$0) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (l.a(this.entry.getCurrentEditor$okhttp(), this)) {
                    this.this$0.completeEdit$okhttp(this, true);
                }
                this.done = true;
                s sVar = s.a;
            }
        }

        public final void detach$okhttp() {
            if (l.a(this.entry.getCurrentEditor$okhttp(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        public final b0 newSink(int i2) {
            synchronized (this.this$0) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!l.a(this.entry.getCurrentEditor$okhttp(), this)) {
                    return q.b();
                }
                if (!this.entry.getReadable$okhttp()) {
                    boolean[] zArr = this.written;
                    l.b(zArr);
                    zArr[i2] = true;
                }
                try {
                    return new FaultHidingSink(this.this$0.getFileSystem$okhttp().sink(this.entry.getDirtyFiles$okhttp().get(i2)), new DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1(this, i2));
                } catch (FileNotFoundException unused) {
                    return q.b();
                }
            }
        }

        public final d0 newSource(int i2) {
            synchronized (this.this$0) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                d0 d0VarSource = null;
                if (!this.entry.getReadable$okhttp() || (!l.a(this.entry.getCurrentEditor$okhttp(), this)) || this.entry.getZombie$okhttp()) {
                    return null;
                }
                try {
                    d0VarSource = this.this$0.getFileSystem$okhttp().source(this.entry.getCleanFiles$okhttp().get(i2));
                } catch (FileNotFoundException unused) {
                }
                return d0VarSource;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class Entry {
        private final List<File> cleanFiles;
        private Editor currentEditor;
        private final List<File> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String str) {
            l.d(str, Action.KEY_ATTRIBUTE);
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append(CoreConstants.DOT);
            int length = sb.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i2 = 0; i2 < valueCount$okhttp; i2++) {
                sb.append(i2);
                this.cleanFiles.add(new File(diskLruCache.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(diskLruCache.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final d0 newSource(int i2) {
            final d0 d0VarSource = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i2));
            if (this.this$0.civilizedFileSystem) {
                return d0VarSource;
            }
            this.lockingSourceCount++;
            return new j.l(d0VarSource) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;

                @Override // j.l, j.d0, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    synchronized (this.this$0.this$0) {
                        this.this$0.setLockingSourceCount$okhttp(r1.getLockingSourceCount$okhttp() - 1);
                        if (this.this$0.getLockingSourceCount$okhttp() == 0 && this.this$0.getZombie$okhttp()) {
                            DiskLruCache.Entry entry = this.this$0;
                            entry.this$0.removeEntry$okhttp(entry);
                        }
                        s sVar = s.a;
                    }
                }
            };
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> list) throws IOException {
            l.d(list, "strings");
            if (list.size() != this.this$0.getValueCount$okhttp()) {
                invalidLengths(list);
                throw new d();
            }
            try {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.lengths[i2] = Long.parseLong(list.get(i2));
                }
            } catch (NumberFormatException unused) {
                invalidLengths(list);
                throw new d();
            }
        }

        public final void setLockingSourceCount$okhttp(int i2) {
            this.lockingSourceCount = i2;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final void setSequenceNumber$okhttp(long j2) {
            this.sequenceNumber = j2;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        public final Snapshot snapshot$okhttp() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                l.c(threadCurrentThread, "Thread.currentThread()");
                sb.append(threadCurrentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(diskLruCache);
                throw new AssertionError(sb.toString());
            }
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                for (int i2 = 0; i2 < valueCount$okhttp; i2++) {
                    arrayList.add(newSource(i2));
                }
                return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util.closeQuietly((d0) it.next());
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(g gVar) {
            l.d(gVar, "writer");
            for (long j2 : this.lengths) {
                gVar.I(32).M0(j2);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<d0> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(DiskLruCache diskLruCache, String str, long j2, List<? extends d0> list, long[] jArr) {
            l.d(str, Action.KEY_ATTRIBUTE);
            l.d(list, "sources");
            l.d(jArr, "lengths");
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j2;
            this.sources = list;
            this.lengths = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Iterator<d0> it = this.sources.iterator();
            while (it.hasNext()) {
                Util.closeQuietly(it.next());
            }
        }

        public final Editor edit() {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i2) {
            return this.lengths[i2];
        }

        public final d0 getSource(int i2) {
            return this.sources.get(i2);
        }

        public final String key() {
            return this.key;
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<Snapshot>, j$.util.Iterator, j$.util.Iterator {
        private final Iterator<Entry> delegate;
        private Snapshot nextSnapshot;
        private Snapshot removeSnapshot;

        AnonymousClass1() {
            Iterator<Entry> it = new ArrayList(DiskLruCache.this.getLruEntries$okhttp().values()).iterator();
            l.c(it, "ArrayList(lruEntries.values).iterator()");
            this.delegate = it;
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            Snapshot snapshotSnapshot$okhttp;
            if (this.nextSnapshot != null) {
                return true;
            }
            synchronized (DiskLruCache.this) {
                if (DiskLruCache.this.getClosed$okhttp()) {
                    return false;
                }
                while (this.delegate.hasNext()) {
                    Entry next = this.delegate.next();
                    if (next != null && (snapshotSnapshot$okhttp = next.snapshot$okhttp()) != null) {
                        this.nextSnapshot = snapshotSnapshot$okhttp;
                        return true;
                    }
                }
                s sVar = s.a;
                return false;
            }
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            Snapshot snapshot = this.removeSnapshot;
            if (snapshot == null) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            try {
                DiskLruCache.this.remove(snapshot.key());
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.removeSnapshot = null;
                throw th;
            }
            this.removeSnapshot = null;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public Snapshot next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            l.b(snapshot);
            return snapshot;
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File file, int i2, int i3, long j2, TaskRunner taskRunner) {
        l.d(fileSystem, "fileSystem");
        l.d(file, "directory");
        l.d(taskRunner, "taskRunner");
        this.fileSystem = fileSystem;
        this.directory = file;
        this.appVersion = i2;
        this.valueCount = i3;
        this.maxSize = j2;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        final String str = Util.okHttpName + " Cache";
        this.cleanupTask = new Task(str) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                synchronized (this.this$0) {
                    if (!this.this$0.initialized || this.this$0.getClosed$okhttp()) {
                        return -1L;
                    }
                    try {
                        this.this$0.trimToSize();
                    } catch (IOException unused) {
                        this.this$0.mostRecentTrimFailed = true;
                    }
                    try {
                        if (this.this$0.journalRebuildRequired()) {
                            this.this$0.rebuildJournal$okhttp();
                            this.this$0.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        this.this$0.mostRecentRebuildFailed = true;
                        this.this$0.journalWriter = q.c(q.b());
                    }
                    return -1L;
                }
            }
        };
        if (!(j2 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (!(i3 > 0)) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
    }

    private final synchronized void checkNotClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i2 = this.redundantOpCount;
        return i2 >= 2000 && i2 >= this.lruEntries.size();
    }

    private final g newJournalWriter() {
        return q.c(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() {
        this.fileSystem.delete(this.journalFileTmp);
        java.util.Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            l.c(next, "i.next()");
            Entry entry = next;
            int i2 = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i3 = this.valueCount;
                while (i2 < i3) {
                    this.size += entry.getLengths$okhttp()[i2];
                    i2++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i4 = this.valueCount;
                while (i2 < i4) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i2));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    private final void readJournal() {
        h hVarD = q.d(this.fileSystem.source(this.journalFile));
        try {
            String strU0 = hVarD.u0();
            String strU02 = hVarD.u0();
            String strU03 = hVarD.u0();
            String strU04 = hVarD.u0();
            String strU05 = hVarD.u0();
            if (!(!l.a(MAGIC, strU0)) && !(!l.a(VERSION_1, strU02)) && !(!l.a(String.valueOf(this.appVersion), strU03)) && !(!l.a(String.valueOf(this.valueCount), strU04))) {
                int i2 = 0;
                if (!(strU05.length() > 0)) {
                    while (true) {
                        try {
                            readJournalLine(hVarD.u0());
                            i2++;
                        } catch (EOFException unused) {
                            this.redundantOpCount = i2 - this.lruEntries.size();
                            if (hVarD.H()) {
                                this.journalWriter = newJournalWriter();
                            } else {
                                rebuildJournal$okhttp();
                            }
                            s sVar = s.a;
                            a.a(hVarD, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + strU0 + ", " + strU02 + ", " + strU04 + ", " + strU05 + ']');
        } finally {
        }
    }

    private final void readJournalLine(String str) throws IOException {
        String strSubstring;
        int iQ = i.d0.q.Q(str, ' ', 0, false, 6, null);
        if (iQ == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i2 = iQ + 1;
        int iQ2 = i.d0.q.Q(str, ' ', i2, false, 4, null);
        if (iQ2 == -1) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            strSubstring = str.substring(i2);
            l.c(strSubstring, "(this as java.lang.String).substring(startIndex)");
            String str2 = REMOVE;
            if (iQ == str2.length() && p.B(str, str2, false, 2, null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            strSubstring = str.substring(i2, iQ2);
            l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        Entry entry = this.lruEntries.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iQ2 != -1) {
            String str3 = CLEAN;
            if (iQ == str3.length() && p.B(str, str3, false, 2, null)) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String strSubstring2 = str.substring(iQ2 + 1);
                l.c(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                List<String> listM0 = i.d0.q.m0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                entry.setReadable$okhttp(true);
                entry.setCurrentEditor$okhttp(null);
                entry.setLengths$okhttp(listM0);
                return;
            }
        }
        if (iQ2 == -1) {
            String str4 = DIRTY;
            if (iQ == str4.length() && p.B(str, str4, false, 2, null)) {
                entry.setCurrentEditor$okhttp(new Editor(this, entry));
                return;
            }
        }
        if (iQ2 == -1) {
            String str5 = READ;
            if (iQ == str5.length() && p.B(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final boolean removeOldestEntry() {
        for (Entry entry : this.lruEntries.values()) {
            if (!entry.getZombie$okhttp()) {
                l.c(entry, "toEvict");
                removeEntry$okhttp(entry);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.a(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + CoreConstants.DOUBLE_QUOTE_CHAR).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        Editor currentEditor$okhttp;
        if (this.initialized && !this.closed) {
            Collection<Entry> collectionValues = this.lruEntries.values();
            l.c(collectionValues, "lruEntries.values");
            Object[] array = collectionValues.toArray(new Entry[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            for (Entry entry : (Entry[]) array) {
                if (entry.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) != null) {
                    currentEditor$okhttp.detach$okhttp();
                }
            }
            trimToSize();
            g gVar = this.journalWriter;
            l.b(gVar);
            gVar.close();
            this.journalWriter = null;
            this.closed = true;
            return;
        }
        this.closed = true;
    }

    public final synchronized void completeEdit$okhttp(Editor editor, boolean z) {
        l.d(editor, "editor");
        Entry entry$okhttp = editor.getEntry$okhttp();
        if (!l.a(entry$okhttp.getCurrentEditor$okhttp(), editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (z && !entry$okhttp.getReadable$okhttp()) {
            int i2 = this.valueCount;
            for (int i3 = 0; i3 < i2; i3++) {
                boolean[] written$okhttp = editor.getWritten$okhttp();
                l.b(written$okhttp);
                if (!written$okhttp[i3]) {
                    editor.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i3);
                }
                if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i3))) {
                    editor.abort();
                    return;
                }
            }
        }
        int i4 = this.valueCount;
        for (int i5 = 0; i5 < i4; i5++) {
            File file = entry$okhttp.getDirtyFiles$okhttp().get(i5);
            if (!z || entry$okhttp.getZombie$okhttp()) {
                this.fileSystem.delete(file);
            } else if (this.fileSystem.exists(file)) {
                File file2 = entry$okhttp.getCleanFiles$okhttp().get(i5);
                this.fileSystem.rename(file, file2);
                long j2 = entry$okhttp.getLengths$okhttp()[i5];
                long size = this.fileSystem.size(file2);
                entry$okhttp.getLengths$okhttp()[i5] = size;
                this.size = (this.size - j2) + size;
            }
        }
        entry$okhttp.setCurrentEditor$okhttp(null);
        if (entry$okhttp.getZombie$okhttp()) {
            removeEntry$okhttp(entry$okhttp);
            return;
        }
        this.redundantOpCount++;
        g gVar = this.journalWriter;
        l.b(gVar);
        if (entry$okhttp.getReadable$okhttp() || z) {
            entry$okhttp.setReadable$okhttp(true);
            gVar.Y(CLEAN).I(32);
            gVar.Y(entry$okhttp.getKey$okhttp());
            entry$okhttp.writeLengths$okhttp(gVar);
            gVar.I(10);
            if (z) {
                long j3 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j3;
                entry$okhttp.setSequenceNumber$okhttp(j3);
            }
        } else {
            this.lruEntries.remove(entry$okhttp.getKey$okhttp());
            gVar.Y(REMOVE).I(32);
            gVar.Y(entry$okhttp.getKey$okhttp());
            gVar.I(10);
        }
        gVar.flush();
        if (this.size > this.maxSize || journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final void delete() {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final Editor edit(String str) {
        return edit$default(this, str, 0L, 2, null);
    }

    public final synchronized Editor edit(String str, long j2) {
        l.d(str, Action.KEY_ATTRIBUTE);
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (j2 != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber$okhttp() != j2)) {
            return null;
        }
        if ((entry != null ? entry.getCurrentEditor$okhttp() : null) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount$okhttp() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            g gVar = this.journalWriter;
            l.b(gVar);
            gVar.Y(DIRTY).I(32).Y(str).I(10);
            gVar.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, str);
                this.lruEntries.put(str, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.setCurrentEditor$okhttp(editor);
            return editor;
        }
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }

    public final synchronized void evictAll() {
        initialize();
        Collection<Entry> collectionValues = this.lruEntries.values();
        l.c(collectionValues, "lruEntries.values");
        Object[] array = collectionValues.toArray(new Entry[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        for (Entry entry : (Entry[]) array) {
            l.c(entry, "entry");
            removeEntry$okhttp(entry);
        }
        this.mostRecentTrimFailed = false;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            g gVar = this.journalWriter;
            l.b(gVar);
            gVar.flush();
        }
    }

    public final synchronized Snapshot get(String str) {
        l.d(str, Action.KEY_ATTRIBUTE);
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return null;
        }
        l.c(entry, "lruEntries[key] ?: return null");
        Snapshot snapshotSnapshot$okhttp = entry.snapshot$okhttp();
        if (snapshotSnapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        g gVar = this.journalWriter;
        l.b(gVar);
        gVar.Y(READ).I(32).Y(str).I(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshotSnapshot$okhttp;
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            l.c(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (this.initialized) {
            return;
        }
        if (this.fileSystem.exists(this.journalFileBackup)) {
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.delete(this.journalFileBackup);
            } else {
                this.fileSystem.rename(this.journalFileBackup, this.journalFile);
            }
        }
        this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
        if (this.fileSystem.exists(this.journalFile)) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                return;
            } catch (IOException e2) {
                Platform.Companion.get().log("DiskLruCache " + this.directory + " is corrupt: " + e2.getMessage() + ", removing", 5, e2);
                try {
                    delete();
                    this.closed = false;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
        }
        rebuildJournal$okhttp();
        this.initialized = true;
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() {
        g gVar = this.journalWriter;
        if (gVar != null) {
            gVar.close();
        }
        g gVarC = q.c(this.fileSystem.sink(this.journalFileTmp));
        try {
            gVarC.Y(MAGIC).I(10);
            gVarC.Y(VERSION_1).I(10);
            gVarC.M0(this.appVersion).I(10);
            gVarC.M0(this.valueCount).I(10);
            gVarC.I(10);
            for (Entry entry : this.lruEntries.values()) {
                if (entry.getCurrentEditor$okhttp() != null) {
                    gVarC.Y(DIRTY).I(32);
                    gVarC.Y(entry.getKey$okhttp());
                    gVarC.I(10);
                } else {
                    gVarC.Y(CLEAN).I(32);
                    gVarC.Y(entry.getKey$okhttp());
                    entry.writeLengths$okhttp(gVarC);
                    gVarC.I(10);
                }
            }
            s sVar = s.a;
            a.a(gVarC, null);
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } finally {
        }
    }

    public final synchronized boolean remove(String str) {
        l.d(str, Action.KEY_ATTRIBUTE);
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = this.lruEntries.get(str);
        if (entry == null) {
            return false;
        }
        l.c(entry, "lruEntries[key] ?: return false");
        boolean zRemoveEntry$okhttp = removeEntry$okhttp(entry);
        if (zRemoveEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return zRemoveEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(Entry entry) {
        g gVar;
        l.d(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (gVar = this.journalWriter) != null) {
                gVar.Y(DIRTY);
                gVar.I(32);
                gVar.Y(entry.getKey$okhttp());
                gVar.I(10);
                gVar.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i2 = this.valueCount;
        for (int i3 = 0; i3 < i2; i3++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i3));
            this.size -= entry.getLengths$okhttp()[i3];
            entry.getLengths$okhttp()[i3] = 0;
        }
        this.redundantOpCount++;
        g gVar2 = this.journalWriter;
        if (gVar2 != null) {
            gVar2.Y(REMOVE);
            gVar2.I(32);
            gVar2.Y(entry.getKey$okhttp());
            gVar2.I(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final synchronized void setMaxSize(long j2) {
        this.maxSize = j2;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() {
        initialize();
        return this.size;
    }

    public final synchronized java.util.Iterator<Snapshot> snapshots() {
        initialize();
        return new AnonymousClass1();
    }

    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }
}