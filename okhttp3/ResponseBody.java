package okhttp3;

import i.d0.d;
import i.y.d.g;
import i.y.d.k;
import i.y.d.l;
import j.f;
import j.h;
import j.i;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.Util;

/* compiled from: ResponseBody.kt */
/* loaded from: classes3.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    /* compiled from: ResponseBody.kt */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final h source;

        public BomAwareReader(h hVar, Charset charset) {
            l.d(hVar, "source");
            l.d(charset, "charset");
            this.source = hVar;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) throws IOException {
            l.d(cArr, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.Q0(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i2, i3);
        }
    }

    /* compiled from: ResponseBody.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            l.d(str, "$this$toResponseBody");
            Charset charset = d.a;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            f fVarD1 = new f().d1(str, charset);
            return create(fVarD1, mediaType, fVarD1.y0());
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, i iVar, MediaType mediaType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(iVar, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, h hVar, MediaType mediaType, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            if ((i2 & 2) != 0) {
                j2 = -1;
            }
            return companion.create(hVar, mediaType, j2);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            l.d(bArr, "$this$toResponseBody");
            return create(new f().A0(bArr), mediaType, bArr.length);
        }

        public final ResponseBody create(i iVar, MediaType mediaType) {
            l.d(iVar, "$this$toResponseBody");
            return create(new f().B0(iVar), mediaType, iVar.u());
        }

        public final ResponseBody create(final h hVar, final MediaType mediaType, final long j2) {
            l.d(hVar, "$this$asResponseBody");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j2;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                public h source() {
                    return hVar;
                }
            };
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            l.d(str, "content");
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            l.d(bArr, "content");
            return create(bArr, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, i iVar) {
            l.d(iVar, "content");
            return create(iVar, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j2, h hVar) {
            l.d(hVar, "content");
            return create(hVar, mediaType, j2);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType mediaTypeContentType = contentType();
        return (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(d.a)) == null) ? d.a : charset;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(i.y.c.l<? super h, ? extends T> lVar, i.y.c.l<? super T, Integer> lVar2) throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > Integer.MAX_VALUE) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        h hVarSource = source();
        try {
            T tInvoke = lVar.invoke(hVarSource);
            k.b(1);
            i.x.a.a(hVarSource, null);
            k.a(1);
            int iIntValue = lVar2.invoke(tInvoke).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return tInvoke;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } finally {
        }
    }

    public static final ResponseBody create(h hVar, MediaType mediaType, long j2) {
        return Companion.create(hVar, mediaType, j2);
    }

    public static final ResponseBody create(i iVar, MediaType mediaType) {
        return Companion.create(iVar, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j2, h hVar) {
        return Companion.create(mediaType, j2, hVar);
    }

    public static final ResponseBody create(MediaType mediaType, i iVar) {
        return Companion.create(mediaType, iVar);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public final InputStream byteStream() {
        return source().Q0();
    }

    public final i byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > Integer.MAX_VALUE) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        h hVarSource = source();
        try {
            i iVarO0 = hVarSource.o0();
            i.x.a.a(hVarSource, null);
            int iU = iVarO0.u();
            if (jContentLength == -1 || jContentLength == iU) {
                return iVarO0;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iU + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > Integer.MAX_VALUE) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        h hVarSource = source();
        try {
            byte[] bArrF = hVarSource.F();
            i.x.a.a(hVarSource, null);
            int length = bArrF.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrF;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract h source();

    public final String string() {
        h hVarSource = source();
        try {
            String strF0 = hVarSource.f0(Util.readBomAsCharset(hVarSource, charset()));
            i.x.a.a(hVarSource, null);
            return strF0;
        } finally {
        }
    }
}