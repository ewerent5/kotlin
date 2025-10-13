package okhttp3.internal.http2;

import i.s;
import i.y.c.a;
import i.y.d.l;
import i.y.d.t;
import i.y.d.u;
import j.f;
import j.g;
import j.h;
import j.i;
import j.q;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.platform.Platform;

/* compiled from: Http2Connection.kt */
/* loaded from: classes3.dex */
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    /* compiled from: Http2Connection.kt */
    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public g sink;
        public Socket socket;
        public h source;
        private final TaskRunner taskRunner;

        public Builder(boolean z, TaskRunner taskRunner) {
            l.d(taskRunner, "taskRunner");
            this.client = z;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, h hVar, g gVar, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i2 & 4) != 0) {
                hVar = q.d(q.l(socket));
            }
            if ((i2 & 8) != 0) {
                gVar = q.c(q.h(socket));
            }
            return builder.socket(socket, str, hVar, gVar);
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str == null) {
                l.m("connectionName");
            }
            return str;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final g getSink$okhttp() {
            g gVar = this.sink;
            if (gVar == null) {
                l.m("sink");
            }
            return gVar;
        }

        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket == null) {
                l.m("socket");
            }
            return socket;
        }

        public final h getSource$okhttp() {
            h hVar = this.source;
            if (hVar == null) {
                l.m("source");
            }
            return hVar;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener) {
            l.d(listener, "listener");
            this.listener = listener;
            return this;
        }

        public final Builder pingIntervalMillis(int i2) {
            this.pingIntervalMillis = i2;
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver) {
            l.d(pushObserver, "pushObserver");
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        public final void setConnectionName$okhttp(String str) {
            l.d(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setListener$okhttp(Listener listener) {
            l.d(listener, "<set-?>");
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i2) {
            this.pingIntervalMillis = i2;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            l.d(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(g gVar) {
            l.d(gVar, "<set-?>");
            this.sink = gVar;
        }

        public final void setSocket$okhttp(Socket socket) {
            l.d(socket, "<set-?>");
            this.socket = socket;
        }

        public final void setSource$okhttp(h hVar) {
            l.d(hVar, "<set-?>");
            this.source = hVar;
        }

        public final Builder socket(Socket socket) {
            return socket$default(this, socket, null, null, null, 14, null);
        }

        public final Builder socket(Socket socket, String str) {
            return socket$default(this, socket, str, null, null, 12, null);
        }

        public final Builder socket(Socket socket, String str, h hVar) {
            return socket$default(this, socket, str, hVar, null, 8, null);
        }

        public final Builder socket(Socket socket, String str, h hVar, g gVar) {
            String str2;
            l.d(socket, "socket");
            l.d(str, "peerName");
            l.d(hVar, "source");
            l.d(gVar, "sink");
            this.socket = socket;
            if (this.client) {
                str2 = Util.okHttpName + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            this.connectionName = str2;
            this.source = hVar;
            this.sink = gVar;
            return this;
        }
    }

    /* compiled from: Http2Connection.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }

        public /* synthetic */ Companion(i.y.d.g gVar) {
            this();
        }
    }

    /* compiled from: Http2Connection.kt */
    public static abstract class Listener {
        public static final Companion Companion = new Companion(null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream http2Stream) {
                l.d(http2Stream, "stream");
                http2Stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        /* compiled from: Http2Connection.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i.y.d.g gVar) {
                this();
            }
        }

        public void onSettings(Http2Connection http2Connection, Settings settings) {
            l.d(http2Connection, "connection");
            l.d(settings, "settings");
        }

        public abstract void onStream(Http2Stream http2Stream);
    }

    /* compiled from: Http2Connection.kt */
    public final class ReaderRunnable implements Http2Reader.Handler, a<s> {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            l.d(http2Reader, "reader");
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i2, String str, i iVar, String str2, int i3, long j2) {
            l.d(str, "origin");
            l.d(iVar, "protocol");
            l.d(str2, "host");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void applyAndAckSettings(final boolean z, final Settings settings) {
            Http2Connection http2Connection;
            T t;
            T t2;
            TaskQueue taskQueue;
            final String str;
            final boolean z2;
            l.d(settings, "settings");
            final t tVar = new t();
            final u uVar = new u();
            final u uVar2 = new u();
            synchronized (this.this$0.getWriter()) {
                Http2Connection http2Connection2 = this.this$0;
                synchronized (http2Connection2) {
                    try {
                        Settings peerSettings = this.this$0.getPeerSettings();
                        if (z) {
                            t = settings;
                        } else {
                            Settings settings2 = new Settings();
                            settings2.merge(peerSettings);
                            settings2.merge(settings);
                            s sVar = s.a;
                            t = settings2;
                        }
                        uVar2.f15893e = t;
                        long initialWindowSize = ((Settings) t).getInitialWindowSize() - peerSettings.getInitialWindowSize();
                        tVar.f15892e = initialWindowSize;
                        if (initialWindowSize == 0 || this.this$0.getStreams$okhttp().isEmpty()) {
                            t2 = 0;
                        } else {
                            Object[] array = this.this$0.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                            t2 = (Http2Stream[]) array;
                        }
                        uVar.f15893e = t2;
                        this.this$0.setPeerSettings((Settings) uVar2.f15893e);
                        taskQueue = this.this$0.settingsListenerQueue;
                        str = this.this$0.getConnectionName$okhttp() + " onSettings";
                        z2 = true;
                        http2Connection = http2Connection2;
                    } catch (Throwable th) {
                        th = th;
                        http2Connection = http2Connection2;
                    }
                    try {
                        taskQueue.schedule(new Task(str, z2) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$synchronized$lambda$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // okhttp3.internal.concurrent.Task
                            public long runOnce() {
                                this.this$0.getListener$okhttp().onSettings(this.this$0, (Settings) uVar2.f15893e);
                                return -1L;
                            }
                        }, 0L);
                        s sVar2 = s.a;
                        try {
                            this.this$0.getWriter().applyAndAckSettings((Settings) uVar2.f15893e);
                        } catch (IOException e2) {
                            this.this$0.failConnection(e2);
                        }
                        s sVar3 = s.a;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
            T t3 = uVar.f15893e;
            if (((Http2Stream[]) t3) != null) {
                Http2Stream[] http2StreamArr = (Http2Stream[]) t3;
                l.b(http2StreamArr);
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(tVar.f15892e);
                        s sVar4 = s.a;
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z, int i2, h hVar, int i3) {
            l.d(hVar, "source");
            if (this.this$0.pushedStream$okhttp(i2)) {
                this.this$0.pushDataLater$okhttp(i2, hVar, i3, z);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i2);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i2, ErrorCode.PROTOCOL_ERROR);
                long j2 = i3;
                this.this$0.updateConnectionFlowControl$okhttp(j2);
                hVar.h(j2);
                return;
            }
            stream.receiveData(hVar, i3);
            if (z) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i2, ErrorCode errorCode, i iVar) {
            int i3;
            Http2Stream[] http2StreamArr;
            l.d(errorCode, "errorCode");
            l.d(iVar, "debugData");
            iVar.u();
            synchronized (this.this$0) {
                Object[] array = this.this$0.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                http2StreamArr = (Http2Stream[]) array;
                this.this$0.isShutdown = true;
                s sVar = s.a;
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.getId() > i2 && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(final boolean z, final int i2, int i3, final List<Header> list) {
            l.d(list, "headerBlock");
            if (this.this$0.pushedStream$okhttp(i2)) {
                this.this$0.pushHeadersLater$okhttp(i2, list, z);
                return;
            }
            synchronized (this.this$0) {
                final Http2Stream stream = this.this$0.getStream(i2);
                if (stream != null) {
                    s sVar = s.a;
                    stream.receiveHeaders(Util.toHeaders(list), z);
                    return;
                }
                if (this.this$0.isShutdown) {
                    return;
                }
                if (i2 <= this.this$0.getLastGoodStreamId$okhttp()) {
                    return;
                }
                if (i2 % 2 == this.this$0.getNextStreamId$okhttp() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i2, this.this$0, false, z, Util.toHeaders(list));
                this.this$0.setLastGoodStreamId$okhttp(i2);
                this.this$0.getStreams$okhttp().put(Integer.valueOf(i2), http2Stream);
                TaskQueue taskQueueNewQueue = this.this$0.taskRunner.newQueue();
                final String str = this.this$0.getConnectionName$okhttp() + '[' + i2 + "] onStream";
                final boolean z2 = true;
                taskQueueNewQueue.schedule(new Task(str, z2) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$$inlined$synchronized$lambda$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        try {
                            this.this$0.getListener$okhttp().onStream(http2Stream);
                            return -1L;
                        } catch (IOException e2) {
                            Platform.Companion.get().log("Http2Connection.Listener failure for " + this.this$0.getConnectionName$okhttp(), 4, e2);
                            try {
                                http2Stream.close(ErrorCode.PROTOCOL_ERROR, e2);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        @Override // i.y.c.a
        public /* bridge */ /* synthetic */ s invoke() throws Throwable {
            invoke2();
            return s.a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z, final int i2, final int i3) {
            if (!z) {
                TaskQueue taskQueue = this.this$0.writerQueue;
                final String str = this.this$0.getConnectionName$okhttp() + " ping";
                final boolean z2 = true;
                taskQueue.schedule(new Task(str, z2) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() throws IOException {
                        this.this$0.writePing(true, i2, i3);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            synchronized (this.this$0) {
                if (i2 == 1) {
                    this.this$0.intervalPongsReceived++;
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        this.this$0.awaitPongsReceived++;
                        Http2Connection http2Connection = this.this$0;
                        if (http2Connection == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                        }
                        http2Connection.notifyAll();
                    }
                    s sVar = s.a;
                } else {
                    this.this$0.degradedPongsReceived++;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i2, int i3, int i4, boolean z) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i2, int i3, List<Header> list) {
            l.d(list, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(i3, list);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i2, ErrorCode errorCode) {
            l.d(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(i2)) {
                this.this$0.pushResetLater$okhttp(i2, errorCode);
                return;
            }
            Http2Stream http2StreamRemoveStream$okhttp = this.this$0.removeStream$okhttp(i2);
            if (http2StreamRemoveStream$okhttp != null) {
                http2StreamRemoveStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean z, final Settings settings) {
            l.d(settings, "settings");
            TaskQueue taskQueue = this.this$0.writerQueue;
            final String str = this.this$0.getConnectionName$okhttp() + " applyAndAckSettings";
            final boolean z2 = true;
            taskQueue.schedule(new Task(str, z2) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    this.applyAndAckSettings(z, settings);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i2, long j2) {
            if (i2 != 0) {
                Http2Stream stream = this.this$0.getStream(i2);
                if (stream != null) {
                    synchronized (stream) {
                        stream.addBytesToWriteWindow(j2);
                        s sVar = s.a;
                    }
                    return;
                }
                return;
            }
            synchronized (this.this$0) {
                Http2Connection http2Connection = this.this$0;
                http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j2;
                Http2Connection http2Connection2 = this.this$0;
                if (http2Connection2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                http2Connection2.notifyAll();
                s sVar2 = s.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, okhttp3.internal.http2.Http2Reader] */
        /* renamed from: invoke */
        public void invoke2() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            IOException e2 = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                    errorCode2 = ErrorCode.NO_ERROR;
                } catch (IOException e3) {
                    e2 = e3;
                } catch (Throwable th) {
                    th = th;
                    errorCode = errorCode3;
                    this.this$0.close$okhttp(errorCode, errorCode3, e2);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
                try {
                    this.this$0.close$okhttp(errorCode2, ErrorCode.CANCEL, null);
                    errorCode = errorCode2;
                } catch (IOException e4) {
                    e2 = e4;
                    ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                    Http2Connection http2Connection = this.this$0;
                    http2Connection.close$okhttp(errorCode4, errorCode4, e2);
                    errorCode = http2Connection;
                    errorCode3 = this.reader;
                    Util.closeQuietly((Closeable) errorCode3);
                }
                errorCode3 = this.reader;
                Util.closeQuietly((Closeable) errorCode3);
            } catch (Throwable th2) {
                th = th2;
                this.this$0.close$okhttp(errorCode, errorCode3, e2);
                Util.closeQuietly(this.reader);
                throw th;
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(Builder builder) {
        l.d(builder, "builder");
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue taskQueueNewQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = taskQueueNewQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        s sVar = s.a;
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        this.writeBytesMaximum = r2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            final String str = connectionName$okhttp + " ping";
            taskQueueNewQueue.schedule(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$$special$$inlined$schedule$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() throws IOException {
                    boolean z;
                    synchronized (this) {
                        if (this.intervalPongsReceived < this.intervalPingsSent) {
                            z = true;
                        } else {
                            this.intervalPingsSent++;
                            z = false;
                        }
                    }
                    if (z) {
                        this.failConnection(null);
                        return -1L;
                    }
                    this.writePing(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    public final void failConnection(IOException iOException) throws IOException {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, TaskRunner taskRunner, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z, taskRunner);
    }

    public final synchronized void awaitPong() {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) throws IOException {
        int i2;
        l.d(errorCode, "connectionCode");
        l.d(errorCode2, "streamCode");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            l.c(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        try {
            shutdown(errorCode);
        } catch (IOException unused) {
        }
        Http2Stream[] http2StreamArr = null;
        synchronized (this) {
            if (!this.streams.isEmpty()) {
                Object[] array = this.streams.values().toArray(new Http2Stream[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                http2StreamArr = (Http2Stream[]) array;
                this.streams.clear();
            }
            s sVar = s.a;
        }
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    public final synchronized Http2Stream getStream(int i2) {
        return this.streams.get(Integer.valueOf(i2));
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j2) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (j2 >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    public final Http2Stream newStream(List<Header> list, boolean z) {
        l.d(list, "requestHeaders");
        return newStream(0, list, z);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(final int i2, h hVar, final int i3, final boolean z) {
        l.d(hVar, "source");
        final f fVar = new f();
        long j2 = i3;
        hVar.L0(j2);
        hVar.read(fVar, j2);
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i2 + "] onData";
        final boolean z2 = true;
        taskQueue.schedule(new Task(str, z2) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    boolean zOnData = this.pushObserver.onData(i2, fVar, i3, z);
                    if (zOnData) {
                        this.getWriter().rstStream(i2, ErrorCode.CANCEL);
                    }
                    if (!zOnData && !z) {
                        return -1L;
                    }
                    synchronized (this) {
                        this.currentPushRequests.remove(Integer.valueOf(i2));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void pushHeadersLater$okhttp(final int i2, final List<Header> list, final boolean z) {
        l.d(list, "requestHeaders");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i2 + "] onHeaders";
        final boolean z2 = true;
        taskQueue.schedule(new Task(str, z2) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean zOnHeaders = this.pushObserver.onHeaders(i2, list, z);
                if (zOnHeaders) {
                    try {
                        this.getWriter().rstStream(i2, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (!zOnHeaders && !z) {
                    return -1L;
                }
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(i2));
                }
                return -1L;
            }
        }, 0L);
    }

    public final void pushRequestLater$okhttp(final int i2, final List<Header> list) {
        l.d(list, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i2))) {
                writeSynResetLater$okhttp(i2, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i2));
            TaskQueue taskQueue = this.pushQueue;
            final String str = this.connectionName + '[' + i2 + "] onRequest";
            final boolean z = true;
            taskQueue.schedule(new Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    if (!this.pushObserver.onRequest(i2, list)) {
                        return -1L;
                    }
                    try {
                        this.getWriter().rstStream(i2, ErrorCode.CANCEL);
                        synchronized (this) {
                            this.currentPushRequests.remove(Integer.valueOf(i2));
                        }
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }, 0L);
        }
    }

    public final void pushResetLater$okhttp(final int i2, final ErrorCode errorCode) {
        l.d(errorCode, "errorCode");
        TaskQueue taskQueue = this.pushQueue;
        final String str = this.connectionName + '[' + i2 + "] onReset";
        final boolean z = true;
        taskQueue.schedule(new Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                this.pushObserver.onReset(i2, errorCode);
                synchronized (this) {
                    this.currentPushRequests.remove(Integer.valueOf(i2));
                    s sVar = s.a;
                }
                return -1L;
            }
        }, 0L);
    }

    public final Http2Stream pushStream(int i2, List<Header> list, boolean z) {
        l.d(list, "requestHeaders");
        if (!this.client) {
            return newStream(i2, list, z);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    public final boolean pushedStream$okhttp(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public final synchronized Http2Stream removeStream$okhttp(int i2) {
        Http2Stream http2StreamRemove;
        http2StreamRemove = this.streams.remove(Integer.valueOf(i2));
        notifyAll();
        return http2StreamRemove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j2 = this.degradedPongsReceived;
            long j3 = this.degradedPingsSent;
            if (j2 < j3) {
                return;
            }
            this.degradedPingsSent = j3 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + DEGRADED_PONG_TIMEOUT_NS;
            s sVar = s.a;
            TaskQueue taskQueue = this.writerQueue;
            final String str = this.connectionName + " ping";
            final boolean z = true;
            taskQueue.schedule(new Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$1
                @Override // okhttp3.internal.concurrent.Task
                public long runOnce() throws IOException {
                    this.writePing(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i2) {
        this.lastGoodStreamId = i2;
    }

    public final void setNextStreamId$okhttp(int i2) {
        this.nextStreamId = i2;
    }

    public final void setPeerSettings(Settings settings) {
        l.d(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void setSettings(Settings settings) {
        l.d(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
                s sVar = s.a;
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(ErrorCode errorCode) {
        l.d(errorCode, "statusCode");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i2 = this.lastGoodStreamId;
                s sVar = s.a;
                this.writer.goAway(i2, errorCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start() {
        start$default(this, false, null, 3, null);
    }

    public final void start(boolean z) {
        start$default(this, z, null, 2, null);
    }

    public final void start(boolean z, TaskRunner taskRunner) {
        l.d(taskRunner, "taskRunner");
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r9 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        TaskQueue taskQueueNewQueue = taskRunner.newQueue();
        String str = this.connectionName;
        taskQueueNewQueue.schedule(new TaskQueue.AnonymousClass1(this.readerRunnable, str, true, str, true), 0L);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j2) {
        long j3 = this.readBytesTotal + j2;
        this.readBytesTotal = j3;
        long j4 = j3 - this.readBytesAcknowledged;
        if (j4 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j4);
            this.readBytesAcknowledged += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0033, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.writer.maxDataLength());
        r6 = r3;
        r8.writeBytesTotal += r6;
        r4 = i.s.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void writeData(int r9, boolean r10, j.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r12 = r8.writer
            r12.data(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L6c
            monitor-enter(r8)
        L12:
            long r3 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            long r5 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L32
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r3 = r8.streams     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            if (r3 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
            throw r9     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L5d
        L32:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L5b
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L5b
            okhttp3.internal.http2.Http2Writer r3 = r8.writer     // Catch: java.lang.Throwable -> L5b
            int r3 = r3.maxDataLength()     // Catch: java.lang.Throwable -> L5b
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L5b
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L5b
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L5b
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L5b
            i.s r4 = i.s.a     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L56
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = 0
        L57:
            r4.data(r5, r9, r11, r3)
            goto Ld
        L5b:
            r9 = move-exception
            goto L6a
        L5d:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5b
            r9.interrupt()     // Catch: java.lang.Throwable -> L5b
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L5b
            r9.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r9     // Catch: java.lang.Throwable -> L5b
        L6a:
            monitor-exit(r8)
            throw r9
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.writeData(int, boolean, j.f, long):void");
    }

    public final void writeHeaders$okhttp(int i2, boolean z, List<Header> list) {
        l.d(list, "alternating");
        this.writer.headers(z, i2, list);
    }

    public final void writePing(boolean z, int i2, int i3) throws IOException {
        try {
            this.writer.ping(z, i2, i3);
        } catch (IOException e2) {
            failConnection(e2);
        }
    }

    public final void writePingAndAwaitPong() throws IOException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i2, ErrorCode errorCode) {
        l.d(errorCode, "statusCode");
        this.writer.rstStream(i2, errorCode);
    }

    public final void writeSynResetLater$okhttp(final int i2, final ErrorCode errorCode) {
        l.d(errorCode, "errorCode");
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + i2 + "] writeSynReset";
        final boolean z = true;
        taskQueue.schedule(new Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() throws IOException {
                try {
                    this.writeSynReset$okhttp(i2, errorCode);
                    return -1L;
                } catch (IOException e2) {
                    this.failConnection(e2);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(final int i2, final long j2) {
        TaskQueue taskQueue = this.writerQueue;
        final String str = this.connectionName + '[' + i2 + "] windowUpdate";
        final boolean z = true;
        taskQueue.schedule(new Task(str, z) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() throws IOException {
                try {
                    this.getWriter().windowUpdate(i2, j2);
                    return -1L;
                } catch (IOException e2) {
                    this.failConnection(e2);
                    return -1L;
                }
            }
        }, 0L);
    }

    private final Http2Stream newStream(int i2, List<Header> list, boolean z) {
        int i3;
        Http2Stream http2Stream;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.writer) {
            synchronized (this) {
                if (this.nextStreamId > 1073741823) {
                    shutdown(ErrorCode.REFUSED_STREAM);
                }
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                i3 = this.nextStreamId;
                this.nextStreamId = i3 + 2;
                http2Stream = new Http2Stream(i3, this, z3, false, null);
                z2 = !z || this.writeBytesTotal >= this.writeBytesMaximum || http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum();
                if (http2Stream.isOpen()) {
                    this.streams.put(Integer.valueOf(i3), http2Stream);
                }
                s sVar = s.a;
            }
            if (i2 == 0) {
                this.writer.headers(z3, i3, list);
            } else {
                if (!(true ^ this.client)) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                }
                this.writer.pushPromise(i2, i3, list);
            }
        }
        if (z2) {
            this.writer.flush();
        }
        return http2Stream;
    }

    public final void writePing() throws IOException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}