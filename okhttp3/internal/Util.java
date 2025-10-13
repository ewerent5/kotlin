package okhttp3.internal;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import i.a0.c;
import i.b;
import i.d0.d;
import i.d0.f;
import i.d0.q;
import i.s;
import i.t.c0;
import i.t.h;
import i.t.m;
import i.y.c.a;
import i.y.d.k;
import i.y.d.l;
import i.y.d.x;
import i.y.d.y;
import j$.util.DesugarTimeZone;
import j.b0;
import j.d0;
import j.g;
import j.i;
import j.t;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;

/* compiled from: Util.kt */
/* loaded from: classes3.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final t UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final f VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.9.1";

    /* compiled from: Util.kt */
    /* renamed from: okhttp3.internal.Util$asFactory$1 */
    static final class AnonymousClass1 implements EventListener.Factory {
        AnonymousClass1() {
        }

        @Override // okhttp3.EventListener.Factory
        public final EventListener create(Call call) {
            l.d(call, "it");
            return eventListener;
        }
    }

    /* compiled from: Util.kt */
    /* renamed from: okhttp3.internal.Util$threadFactory$1 */
    static final class ThreadFactoryC03911 implements ThreadFactory {
        final /* synthetic */ boolean $daemon;
        final /* synthetic */ String $name;

        ThreadFactoryC03911(String str, boolean z) {
            str = str;
            z = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, str);
            thread.setDaemon(z);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        t.a aVar = t.f16482f;
        i.a aVar2 = i.f16464f;
        UNICODE_BOMS = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        l.b(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        l.c(name, "OkHttpClient::class.java.name");
        okHttpName = q.g0(q.f0(name, "okhttp3."), "Client");
    }

    public static final <E> void addIfAbsent(List<E> list, E e2) {
        l.d(list, "$this$addIfAbsent");
        if (list.contains(e2)) {
            return;
        }
        list.add(e2);
    }

    public static final int and(byte b2, int i2) {
        return b2 & i2;
    }

    public static final int and(short s, int i2) {
        return s & i2;
    }

    public static final long and(int i2, long j2) {
        return i2 & j2;
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        l.d(eventListener, "$this$asFactory");
        return new EventListener.Factory() { // from class: okhttp3.internal.Util.asFactory.1
            AnonymousClass1() {
            }

            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                l.d(call, "it");
                return eventListener;
            }
        };
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        l.d(obj, "$this$assertThreadDoesntHoldLock");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            l.c(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(obj);
            throw new AssertionError(sb.toString());
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        l.d(obj, "$this$assertThreadHoldsLock");
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        l.c(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(obj);
        throw new AssertionError(sb.toString());
    }

    public static final boolean canParseAsIpAddress(String str) {
        l.d(str, "$this$canParseAsIpAddress");
        return VERIFY_AS_IP_ADDRESS.a(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        l.d(httpUrl, "$this$canReuseConnectionFor");
        l.d(httpUrl2, "other");
        return l.a(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && l.a(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final int checkDuration(String str, long j2, TimeUnit timeUnit) {
        l.d(str, Action.NAME_ATTRIBUTE);
        boolean z = true;
        if (!(j2 >= 0)) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j2);
        if (!(millis <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException((str + " too large.").toString());
        }
        if (millis == 0 && j2 > 0) {
            z = false;
        }
        if (z) {
            return (int) millis;
        }
        throw new IllegalArgumentException((str + " too small.").toString());
    }

    public static final void checkOffsetAndCount(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) throws IOException {
        l.d(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        l.d(strArr, "$this$concat");
        l.d(str, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        l.c(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[h.q(strArr2)] = str;
        return strArr2;
    }

    public static final int delimiterOffset(String str, String str2, int i2, int i3) {
        l.d(str, "$this$delimiterOffset");
        l.d(str2, "delimiters");
        while (i2 < i3) {
            if (q.F(str2, str.charAt(i2), false, 2, null)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return delimiterOffset(str, str2, i2, i3);
    }

    public static final boolean discard(d0 d0Var, int i2, TimeUnit timeUnit) {
        l.d(d0Var, "$this$discard");
        l.d(timeUnit, "timeUnit");
        try {
            return skipAll(d0Var, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, i.y.c.l<? super T, Boolean> lVar) {
        l.d(iterable, "$this$filterList");
        l.d(lVar, "predicate");
        List<T> listF = i.t.l.f();
        for (T t : iterable) {
            if (lVar.invoke(t).booleanValue()) {
                if (listF.isEmpty()) {
                    listF = new ArrayList<>();
                }
                y.a(listF).add(t);
            }
        }
        return listF;
    }

    public static final String format(String str, Object... objArr) {
        l.d(str, "format");
        l.d(objArr, "args");
        x xVar = x.a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        l.c(str2, "java.lang.String.format(locale, format, *args)");
        return str2;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        l.d(strArr, "$this$hasIntersection");
        l.d(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        l.d(response, "$this$headersContentLength");
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(a<s> aVar) {
        l.d(aVar, "block");
        try {
            aVar.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        l.d(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(i.t.l.h(Arrays.copyOf(objArr, objArr.length)));
        l.c(listUnmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        l.d(strArr, "$this$indexOf");
        l.d(str, "value");
        l.d(comparator, "comparator");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        l.d(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (l.e(cCharAt, 31) <= 0 || l.e(cCharAt, 127) >= 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i2, int i3) {
        l.d(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i2, i3);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i2, int i3) {
        l.d(str, "$this$indexOfLastNonAsciiWhitespace");
        int i4 = i3 - 1;
        if (i4 >= i2) {
            while (true) {
                char cCharAt = str.charAt(i4);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4--;
            }
        }
        return i2;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i2, i3);
    }

    public static final int indexOfNonWhitespace(String str, int i2) {
        l.d(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return indexOfNonWhitespace(str, i2);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        l.d(strArr, "$this$intersect");
        l.d(strArr2, "other");
        l.d(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) {
        l.d(fileSystem, "$this$isCivilized");
        l.d(file, Action.FILE_ATTRIBUTE);
        b0 b0VarSink = fileSystem.sink(file);
        try {
            try {
                fileSystem.delete(file);
                i.x.a.a(b0VarSink, null);
                return true;
            } finally {
            }
        } catch (IOException unused) {
            s sVar = s.a;
            i.x.a.a(b0VarSink, null);
            fileSystem.delete(file);
            return false;
        }
    }

    public static final boolean isHealthy(Socket socket, j.h hVar) throws SocketException {
        l.d(socket, "$this$isHealthy");
        l.d(hVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !hVar.H();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final void notify(Object obj) {
        l.d(obj, "$this$notify");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        l.d(obj, "$this$notifyAll");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' > c2 || 'f' < c2) {
            c3 = 'A';
            if ('A' > c2 || 'F' < c2) {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public static final String peerName(Socket socket) {
        l.d(socket, "$this$peerName");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        l.c(hostName, "address.hostName");
        return hostName;
    }

    public static final Charset readBomAsCharset(j.h hVar, Charset charset) {
        l.d(hVar, "$this$readBomAsCharset");
        l.d(charset, "default");
        int iR0 = hVar.R0(UNICODE_BOMS);
        if (iR0 == -1) {
            return charset;
        }
        if (iR0 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            l.c(charset2, "UTF_8");
            return charset2;
        }
        if (iR0 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            l.c(charset3, "UTF_16BE");
            return charset3;
        }
        if (iR0 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            l.c(charset4, "UTF_16LE");
            return charset4;
        }
        if (iR0 == 3) {
            return d.f15798i.a();
        }
        if (iR0 == 4) {
            return d.f15798i.b();
        }
        throw new AssertionError();
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        T tCast;
        Object fieldOrNull;
        l.d(obj, "instance");
        l.d(cls, "fieldType");
        l.d(str, "fieldName");
        Class<?> superclass = obj.getClass();
        while (true) {
            tCast = null;
            if (!(!l.a(superclass, Object.class))) {
                if (!(!l.a(str, "delegate")) || (fieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, cls, str);
            }
            try {
                Field declaredField = superclass.getDeclaredField(str);
                l.c(declaredField, "field");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    break;
                }
                tCast = cls.cast(obj2);
                break;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                l.c(superclass, "c.superclass");
            }
        }
        return tCast;
    }

    public static final int readMedium(j.h hVar) {
        l.d(hVar, "$this$readMedium");
        return and(hVar.readByte(), 255) | (and(hVar.readByte(), 255) << 16) | (and(hVar.readByte(), 255) << 8);
    }

    public static final boolean skipAll(d0 d0Var, int i2, TimeUnit timeUnit) {
        boolean z;
        l.d(d0Var, "$this$skipAll");
        l.d(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = d0Var.timeout().hasDeadline() ? d0Var.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        d0Var.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i2)) + jNanoTime);
        try {
            j.f fVar = new j.f();
            while (d0Var.read(fVar, 8192L) != -1) {
                fVar.b();
            }
            z = true;
        } catch (InterruptedIOException unused) {
            z = false;
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
            }
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                d0Var.timeout().clearDeadline();
            } else {
                d0Var.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
        if (jDeadlineNanoTime == Long.MAX_VALUE) {
            d0Var.timeout().clearDeadline();
        } else {
            d0Var.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
        }
        return z;
    }

    public static final ThreadFactory threadFactory(String str, boolean z) {
        l.d(str, Action.NAME_ATTRIBUTE);
        return new ThreadFactory() { // from class: okhttp3.internal.Util.threadFactory.1
            final /* synthetic */ boolean $daemon;
            final /* synthetic */ String $name;

            ThreadFactoryC03911(String str2, boolean z2) {
                str = str2;
                z = z2;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static final void threadName(String str, a<s> aVar) {
        l.d(str, Action.NAME_ATTRIBUTE);
        l.d(aVar, "block");
        Thread threadCurrentThread = Thread.currentThread();
        l.c(threadCurrentThread, "currentThread");
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            aVar.invoke();
        } finally {
            k.b(1);
            threadCurrentThread.setName(name);
            k.a(1);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        l.d(headers, "$this$toHeaderList");
        c cVarI = i.a0.f.i(0, headers.size());
        ArrayList arrayList = new ArrayList(m.o(cVarI, 10));
        Iterator<Integer> it = cVarI.iterator();
        while (it.hasNext()) {
            int iB = ((i.t.y) it).b();
            arrayList.add(new Header(headers.name(iB), headers.value(iB)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        l.d(list, "$this$toHeaders");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().x(), header.component2().x());
        }
        return builder.build();
    }

    public static final String toHexString(long j2) {
        String hexString = Long.toHexString(j2);
        l.c(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        String strHost;
        l.d(httpUrl, "$this$toHostHeader");
        if (q.G(httpUrl.host(), ":", false, 2, null)) {
            strHost = '[' + httpUrl.host() + ']';
        } else {
            strHost = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return strHost;
        }
        return strHost + CoreConstants.COLON_CHAR + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        l.d(list, "$this$toImmutableList");
        List<T> listUnmodifiableList = Collections.unmodifiableList(i.t.t.L(list));
        l.c(listUnmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        l.d(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return c0.d();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        l.c(mapUnmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return mapUnmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j2) {
        l.d(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j2;
        }
    }

    public static final int toNonNegativeInt(String str, int i2) throws NumberFormatException {
        if (str != null) {
            try {
                long j2 = Long.parseLong(str);
                if (j2 > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (j2 < 0) {
                    return 0;
                }
                return (int) j2;
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    public static final String trimSubstring(String str, int i2, int i3) {
        l.d(str, "$this$trimSubstring");
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i2, i3);
        String strSubstring = str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i3));
        l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return trimSubstring(str, i2, i3);
    }

    public static final void wait(Object obj) throws InterruptedException {
        l.d(obj, "$this$wait");
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        l.d(exc, "$this$withSuppressed");
        l.d(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            b.a(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(g gVar, int i2) {
        l.d(gVar, "$this$writeMedium");
        gVar.I((i2 >>> 16) & 255);
        gVar.I((i2 >>> 8) & 255);
        gVar.I(i2 & 255);
    }

    public static final int delimiterOffset(String str, char c2, int i2, int i3) {
        l.d(str, "$this$delimiterOffset");
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return delimiterOffset(str, c2, i2, i3);
    }

    public static final String toHexString(int i2) {
        String hexString = Integer.toHexString(i2);
        l.c(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    public static final void closeQuietly(Socket socket) throws IOException {
        l.d(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!l.a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) throws IOException {
        l.d(serverSocket, "$this$closeQuietly");
        try {
            serverSocket.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(j.f fVar, byte b2) {
        l.d(fVar, "$this$skipAll");
        int i2 = 0;
        while (!fVar.H() && fVar.v(0L) == b2) {
            i2++;
            fVar.readByte();
        }
        return i2;
    }
}