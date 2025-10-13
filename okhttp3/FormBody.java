package okhttp3;

import ch.qos.logback.core.joran.action.Action;
import i.y.d.g;
import i.y.d.l;
import j.f;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* compiled from: FormBody.kt */
/* loaded from: classes3.dex */
public final class FormBody extends RequestBody {
    private final List<String> encodedNames;
    private final List<String> encodedValues;
    public static final Companion Companion = new Companion(null);
    private static final MediaType CONTENT_TYPE = MediaType.Companion.get("application/x-www-form-urlencoded");

    /* compiled from: FormBody.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public FormBody(List<String> list, List<String> list2) {
        l.d(list, "encodedNames");
        l.d(list2, "encodedValues");
        this.encodedNames = Util.toImmutableList(list);
        this.encodedValues = Util.toImmutableList(list2);
    }

    private final long writeOrCountBytes(j.g gVar, boolean z) {
        f fVarE;
        if (z) {
            fVarE = new f();
        } else {
            l.b(gVar);
            fVarE = gVar.e();
        }
        int size = this.encodedNames.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                fVarE.I(38);
            }
            fVarE.Y(this.encodedNames.get(i2));
            fVarE.I(61);
            fVarE.Y(this.encodedValues.get(i2));
        }
        if (!z) {
            return 0L;
        }
        long jY0 = fVarE.y0();
        fVarE.b();
        return jY0;
    }

    /* renamed from: -deprecated_size */
    public final int m53deprecated_size() {
        return size();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public final String encodedName(int i2) {
        return this.encodedNames.get(i2);
    }

    public final String encodedValue(int i2) {
        return this.encodedValues.get(i2);
    }

    public final String name(int i2) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedName(i2), 0, 0, true, 3, null);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String value(int i2) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedValue(i2), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(j.g gVar) {
        l.d(gVar, "sink");
        writeOrCountBytes(gVar, false);
    }

    /* compiled from: FormBody.kt */
    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this(null, 1, null);
        }

        public Builder(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public final Builder add(String str, String str2) {
            l.d(str, Action.NAME_ATTRIBUTE);
            l.d(str2, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            return this;
        }

        public final Builder addEncoded(String str, String str2) {
            l.d(str, Action.NAME_ATTRIBUTE);
            l.d(str2, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }

        public /* synthetic */ Builder(Charset charset, int i2, g gVar) {
            this((i2 & 1) != 0 ? null : charset);
        }
    }
}