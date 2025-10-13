package okhttp3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import i.y.d.g;
import i.y.d.l;
import j.f;
import j.i;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;

/* compiled from: MultipartBody.kt */
/* loaded from: classes3.dex */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;
    public static final Companion Companion = new Companion(null);
    private static final byte[] DASHDASH;
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;
    private final i boundaryByteString;
    private long contentLength;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    /* compiled from: MultipartBody.kt */
    public static final class Builder {
        private final i boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(null, 1, null);
        }

        public Builder(String str) {
            l.d(str, "boundary");
            this.boundary = i.f16464f.d(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        public final Builder addFormDataPart(String str, String str2) {
            l.d(str, Action.NAME_ATTRIBUTE);
            l.d(str2, "value");
            addPart(Part.Companion.createFormData(str, str2));
            return this;
        }

        public final Builder addPart(RequestBody requestBody) {
            l.d(requestBody, "body");
            addPart(Part.Companion.create(requestBody));
            return this;
        }

        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final Builder setType(MediaType mediaType) {
            l.d(mediaType, "type");
            if (l.a(mediaType.type(), "multipart")) {
                this.type = mediaType;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + mediaType).toString());
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            l.d(str, Action.NAME_ATTRIBUTE);
            l.d(requestBody, "body");
            addPart(Part.Companion.createFormData(str, str2, requestBody));
            return this;
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            l.d(requestBody, "body");
            addPart(Part.Companion.create(headers, requestBody));
            return this;
        }

        public final Builder addPart(Part part) {
            l.d(part, "part");
            this.parts.add(part);
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Builder(String str, int i2, g gVar) {
            if ((i2 & 1) != 0) {
                str = UUID.randomUUID().toString();
                l.c(str, "UUID.randomUUID().toString()");
            }
            this(str);
        }
    }

    /* compiled from: MultipartBody.kt */
    public static final class Companion {
        private Companion() {
        }

        public final void appendQuotedString$okhttp(StringBuilder sb, String str) {
            l.d(sb, "$this$appendQuotedString");
            l.d(str, Action.KEY_ATTRIBUTE);
            sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt != '\"') {
                    sb.append(cCharAt);
                } else {
                    sb.append("%22");
                }
            }
            sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: MultipartBody.kt */
    public static final class Part {
        public static final Companion Companion = new Companion(null);
        private final RequestBody body;
        private final Headers headers;

        /* compiled from: MultipartBody.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Part create(RequestBody requestBody) {
                l.d(requestBody, "body");
                return create(null, requestBody);
            }

            public final Part createFormData(String str, String str2) {
                l.d(str, Action.NAME_ATTRIBUTE);
                l.d(str2, "value");
                return createFormData(str, null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final Part create(Headers headers, RequestBody requestBody) {
                l.d(requestBody, "body");
                if (!((headers != null ? headers.get("Content-Type") : null) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((headers != null ? headers.get("Content-Length") : null) == null) {
                    return new Part(headers, requestBody, null);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            public final Part createFormData(String str, String str2, RequestBody requestBody) {
                l.d(str, Action.NAME_ATTRIBUTE);
                l.d(requestBody, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    companion.appendQuotedString$okhttp(sb, str2);
                }
                String string = sb.toString();
                l.c(string, "StringBuilder().apply(builderAction).toString()");
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", string).build(), requestBody);
            }
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public static final Part create(Headers headers, RequestBody requestBody) {
            return Companion.create(headers, requestBody);
        }

        public static final Part create(RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        public static final Part createFormData(String str, String str2) {
            return Companion.createFormData(str, str2);
        }

        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }

        /* renamed from: -deprecated_body */
        public final RequestBody m95deprecated_body() {
            return this.body;
        }

        /* renamed from: -deprecated_headers */
        public final Headers m96deprecated_headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, g gVar) {
            this(headers, requestBody);
        }
    }

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        COLONSPACE = new byte[]{(byte) 58, (byte) 32};
        CRLF = new byte[]{(byte) 13, (byte) 10};
        byte b2 = (byte) 45;
        DASHDASH = new byte[]{b2, b2};
    }

    public MultipartBody(i iVar, MediaType mediaType, List<Part> list) {
        l.d(iVar, "boundaryByteString");
        l.d(mediaType, "type");
        l.d(list, "parts");
        this.boundaryByteString = iVar;
        this.type = mediaType;
        this.parts = list;
        this.contentType = MediaType.Companion.get(mediaType + "; boundary=" + boundary());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(j.g gVar, boolean z) {
        f fVar;
        if (z) {
            gVar = new f();
            fVar = gVar;
        } else {
            fVar = 0;
        }
        int size = this.parts.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Part part = this.parts.get(i2);
            Headers headers = part.headers();
            RequestBody requestBodyBody = part.body();
            l.b(gVar);
            gVar.A0(DASHDASH);
            gVar.B0(this.boundaryByteString);
            gVar.A0(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    gVar.Y(headers.name(i3)).A0(COLONSPACE).Y(headers.value(i3)).A0(CRLF);
                }
            }
            MediaType mediaTypeContentType = requestBodyBody.contentType();
            if (mediaTypeContentType != null) {
                gVar.Y("Content-Type: ").Y(mediaTypeContentType.toString()).A0(CRLF);
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                gVar.Y("Content-Length: ").M0(jContentLength).A0(CRLF);
            } else if (z) {
                l.b(fVar);
                fVar.b();
                return -1L;
            }
            byte[] bArr = CRLF;
            gVar.A0(bArr);
            if (z) {
                j2 += jContentLength;
            } else {
                requestBodyBody.writeTo(gVar);
            }
            gVar.A0(bArr);
        }
        l.b(gVar);
        byte[] bArr2 = DASHDASH;
        gVar.A0(bArr2);
        gVar.B0(this.boundaryByteString);
        gVar.A0(bArr2);
        gVar.A0(CRLF);
        if (!z) {
            return j2;
        }
        l.b(fVar);
        long jY0 = j2 + fVar.y0();
        fVar.b();
        return jY0;
    }

    /* renamed from: -deprecated_boundary */
    public final String m91deprecated_boundary() {
        return boundary();
    }

    /* renamed from: -deprecated_parts */
    public final List<Part> m92deprecated_parts() {
        return this.parts;
    }

    /* renamed from: -deprecated_size */
    public final int m93deprecated_size() {
        return size();
    }

    /* renamed from: -deprecated_type */
    public final MediaType m94deprecated_type() {
        return this.type;
    }

    public final String boundary() {
        return this.boundaryByteString.x();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        long j2 = this.contentLength;
        if (j2 != -1) {
            return j2;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    public final Part part(int i2) {
        return this.parts.get(i2);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(j.g gVar) {
        l.d(gVar, "sink");
        writeOrCountBytes(gVar, false);
    }
}