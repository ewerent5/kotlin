package okhttp3.internal.cache2;

import ch.qos.logback.core.joran.action.Action;
import i.s;
import i.y.d.g;
import i.y.d.l;
import j.d0;
import j.e0;
import j.f;
import j.i;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import okhttp3.internal.Util;

/* compiled from: Relay.kt */
/* loaded from: classes3.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final i PREFIX_CLEAN;
    public static final i PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final f buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final i metadata;
    private int sourceCount;
    private d0 upstream;
    private final f upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* compiled from: Relay.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Relay edit(File file, d0 d0Var, i iVar, long j2) throws IOException {
            l.d(file, Action.FILE_ATTRIBUTE);
            l.d(d0Var, "upstream");
            l.d(iVar, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, d0Var, 0L, iVar, j2, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            l.d(file, Action.FILE_ATTRIBUTE);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            l.c(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            f fVar = new f();
            fileOperator.read(0L, fVar, Relay.FILE_HEADER_SIZE);
            i iVar = Relay.PREFIX_CLEAN;
            if (!l.a(fVar.o(iVar.u()), iVar)) {
                throw new IOException("unreadable cache file");
            }
            long j2 = fVar.readLong();
            long j3 = fVar.readLong();
            f fVar2 = new f();
            fileOperator.read(j2 + Relay.FILE_HEADER_SIZE, fVar2, j3);
            return new Relay(randomAccessFile, null, j2, fVar2.o0(), 0L, null);
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: Relay.kt */
    public final class RelaySource implements d0 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final e0 timeout = new e0();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            l.b(file);
            FileChannel channel = file.getChannel();
            l.c(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            synchronized (Relay.this) {
                Relay.this.setSourceCount(r2.getSourceCount() - 1);
                if (Relay.this.getSourceCount() == 0) {
                    RandomAccessFile file = Relay.this.getFile();
                    Relay.this.setFile(null);
                    randomAccessFile = file;
                }
                s sVar = s.a;
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
        
            if (r4 != 2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
        
            r10 = java.lang.Math.min(r21, r19.this$0.getUpstreamPos() - r19.sourcePos);
            r2 = r19.fileOperator;
            i.y.d.l.b(r2);
            r2.read(r19.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r20, r10);
            r19.sourcePos += r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
        
            return r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
        
            r0 = r19.this$0.getUpstream();
            i.y.d.l.b(r0);
            r14 = r0.read(r19.this$0.getUpstreamBuffer(), r19.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
        
            if (r14 != (-1)) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
        
            r0 = r19.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
        
            r19.this$0.setUpstreamReader(null);
            r0 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
        
            if (r0 == null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
        
            r0.notifyAll();
            r0 = i.s.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
        
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00f3, code lost:
        
            r11 = java.lang.Math.min(r14, r21);
            r19.this$0.getUpstreamBuffer().j(r20, 0, r11);
            r19.sourcePos += r11;
            r13 = r19.fileOperator;
            i.y.d.l.b(r13);
            r13.write(r19.this$0.getUpstreamPos() + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r19.this$0.getUpstreamBuffer().clone(), r14);
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x012a, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x012b, code lost:
        
            r19.this$0.getBuffer().write(r19.this$0.getUpstreamBuffer(), r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x014c, code lost:
        
            if (r19.this$0.getBuffer().y0() <= r19.this$0.getBufferMaxSize()) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x014e, code lost:
        
            r19.this$0.getBuffer().h(r19.this$0.getBuffer().y0() - r19.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0168, code lost:
        
            r0 = r19.this$0;
            r0.setUpstreamPos(r0.getUpstreamPos() + r14);
            r0 = i.s.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0174, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0175, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0177, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0178, code lost:
        
            r19.this$0.setUpstreamReader(null);
            r0 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x017f, code lost:
        
            if (r0 == null) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0181, code lost:
        
            r0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0184, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0185, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x018d, code lost:
        
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0194, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0197, code lost:
        
            monitor-enter(r19.this$0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0198, code lost:
        
            r19.this$0.setUpstreamReader(null);
            r3 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
        
            if (r3 == null) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x01a8, code lost:
        
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:
        
            r3.notifyAll();
            r3 = i.s.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x01af, code lost:
        
            throw r0;
         */
        @Override // j.d0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(j.f r20, long r21) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 450
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(j.f, long):long");
        }

        @Override // j.d0
        public e0 timeout() {
            return this.timeout;
        }
    }

    static {
        i.a aVar = i.f16464f;
        PREFIX_CLEAN = aVar.d("OkHttp cache v1\n");
        PREFIX_DIRTY = aVar.d("OkHttp DIRTY :(\n");
    }

    private Relay(RandomAccessFile randomAccessFile, d0 d0Var, long j2, i iVar, long j3) {
        this.file = randomAccessFile;
        this.upstream = d0Var;
        this.upstreamPos = j2;
        this.metadata = iVar;
        this.bufferMaxSize = j3;
        this.upstreamBuffer = new f();
        this.complete = this.upstream == null;
        this.buffer = new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(i iVar, long j2, long j3) throws IOException {
        f fVar = new f();
        fVar.B0(iVar);
        fVar.a1(j2);
        fVar.a1(j3);
        if (!(fVar.y0() == FILE_HEADER_SIZE)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        RandomAccessFile randomAccessFile = this.file;
        l.b(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        l.c(channel, "file!!.channel");
        new FileOperator(channel).write(0L, fVar, FILE_HEADER_SIZE);
    }

    private final void writeMetadata(long j2) throws IOException {
        f fVar = new f();
        fVar.B0(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        l.b(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        l.c(channel, "file!!.channel");
        new FileOperator(channel).write(FILE_HEADER_SIZE + j2, fVar, this.metadata.u());
    }

    public final void commit(long j2) throws IOException {
        writeMetadata(j2);
        RandomAccessFile randomAccessFile = this.file;
        l.b(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j2, this.metadata.u());
        RandomAccessFile randomAccessFile2 = this.file;
        l.b(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            s sVar = s.a;
        }
        d0 d0Var = this.upstream;
        if (d0Var != null) {
            Util.closeQuietly(d0Var);
        }
        this.upstream = null;
    }

    public final f getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final d0 getUpstream() {
        return this.upstream;
    }

    public final f getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    public final i metadata() {
        return this.metadata;
    }

    public final d0 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i2) {
        this.sourceCount = i2;
    }

    public final void setUpstream(d0 d0Var) {
        this.upstream = d0Var;
    }

    public final void setUpstreamPos(long j2) {
        this.upstreamPos = j2;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, d0 d0Var, long j2, i iVar, long j3, g gVar) {
        this(randomAccessFile, d0Var, j2, iVar, j3);
    }
}