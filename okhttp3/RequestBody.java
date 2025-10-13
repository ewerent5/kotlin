package okhttp3;

import ch.qos.logback.core.joran.action.Action;
import i.d0.d;
import i.y.d.g;
import i.y.d.l;
import j.d0;
import j.i;
import j.q;
import java.io.File;
import java.nio.charset.Charset;
import okhttp3.internal.Util;

/* compiled from: RequestBody.kt */
/* loaded from: classes3.dex */
public abstract class RequestBody {
    public static final Companion Companion = new Companion(null);

    /* compiled from: RequestBody.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final RequestBody create(String str, MediaType mediaType) {
            l.d(str, "$this$toRequestBody");
            Charset charset = d.a;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            byte[] bytes = str.getBytes(charset);
            l.c(bytes, "(this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        public final RequestBody create(MediaType mediaType, byte[] bArr) {
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        public final RequestBody create(MediaType mediaType, byte[] bArr, int i2) {
            return create$default(this, mediaType, bArr, i2, 0, 8, (Object) null);
        }

        public final RequestBody create(byte[] bArr) {
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i2) {
            return create$default(this, bArr, mediaType, i2, 0, 4, (Object) null);
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, i iVar, MediaType mediaType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(iVar, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                mediaType = null;
            }
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = bArr.length;
            }
            return companion.create(bArr, mediaType, i2, i3);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                i2 = 0;
            }
            if ((i4 & 8) != 0) {
                i3 = bArr.length;
            }
            return companion.create(mediaType, bArr, i2, i3);
        }

        public final RequestBody create(final i iVar, final MediaType mediaType) {
            l.d(iVar, "$this$toRequestBody");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return iVar.u();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(j.g gVar) {
                    l.d(gVar, "sink");
                    gVar.B0(iVar);
                }
            };
        }

        public final RequestBody create(final byte[] bArr, final MediaType mediaType, final int i2, final int i3) {
            l.d(bArr, "$this$toRequestBody");
            Util.checkOffsetAndCount(bArr.length, i2, i3);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i3;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(j.g gVar) {
                    l.d(gVar, "sink");
                    gVar.g0(bArr, i2, i3);
                }
            };
        }

        public final RequestBody create(final File file, final MediaType mediaType) {
            l.d(file, "$this$asRequestBody");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(j.g gVar) {
                    l.d(gVar, "sink");
                    d0 d0VarJ = q.j(file);
                    try {
                        gVar.m0(d0VarJ);
                        i.x.a.a(d0VarJ, null);
                    } finally {
                    }
                }
            };
        }

        public final RequestBody create(MediaType mediaType, String str) {
            l.d(str, "content");
            return create(str, mediaType);
        }

        public final RequestBody create(MediaType mediaType, i iVar) {
            l.d(iVar, "content");
            return create(iVar, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] bArr, int i2, int i3) {
            l.d(bArr, "content");
            return create(bArr, mediaType, i2, i3);
        }

        public final RequestBody create(MediaType mediaType, File file) {
            l.d(file, Action.FILE_ATTRIBUTE);
            return create(file, mediaType);
        }
    }

    public static final RequestBody create(i iVar, MediaType mediaType) {
        return Companion.create(iVar, mediaType);
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final RequestBody create(MediaType mediaType, i iVar) {
        return Companion.create(mediaType, iVar);
    }

    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.create(mediaType, file);
    }

    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create$default(Companion, mediaType, bArr, 0, 0, 12, (Object) null);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i2) {
        return Companion.create$default(Companion, mediaType, bArr, i2, 0, 8, (Object) null);
    }

    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i2, int i3) {
        return Companion.create(mediaType, bArr, i2, i3);
    }

    public static final RequestBody create(byte[] bArr) {
        return Companion.create$default(Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create$default(Companion, bArr, mediaType, 0, 0, 6, (Object) null);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i2) {
        return Companion.create$default(Companion, bArr, mediaType, i2, 0, 4, (Object) null);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i2, int i3) {
        return Companion.create(bArr, mediaType, i2, i3);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(j.g gVar);
}