package okhttp3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import i.a0.f;
import i.d0.p;
import i.t.h;
import i.y.d.g;
import i.y.d.l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MediaType.kt */
/* loaded from: classes3.dex */
public final class MediaType {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;
    public static final Companion Companion = new Companion(null);
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* compiled from: MediaType.kt */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: -deprecated_get */
        public final MediaType m89deprecated_get(String str) {
            l.d(str, "mediaType");
            return get(str);
        }

        /* renamed from: -deprecated_parse */
        public final MediaType m90deprecated_parse(String str) {
            l.d(str, "mediaType");
            return parse(str);
        }

        public final MediaType get(String str) {
            l.d(str, "$this$toMediaType");
            Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + CoreConstants.DOUBLE_QUOTE_CHAR).toString());
            }
            String strGroup = matcher.group(1);
            l.c(strGroup, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            l.c(locale, "Locale.US");
            Objects.requireNonNull(strGroup, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strGroup.toLowerCase(locale);
            l.c(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            l.c(strGroup2, "typeSubtype.group(2)");
            l.c(locale, "Locale.US");
            Objects.requireNonNull(strGroup2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = strGroup2.toLowerCase(locale);
            l.c(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.PARAMETER.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    l.c(strSubstring, "(this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (p.B(strGroup4, "'", false, 2, null) && p.n(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        l.c(strGroup4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new MediaType(str, lowerCase, lowerCase2, (String[]) array, null);
        }

        public final MediaType parse(String str) {
            l.d(str, "$this$toMediaTypeOrNull");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    public static final MediaType get(String str) {
        return Companion.get(str);
    }

    public static final MediaType parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_subtype */
    public final String m87deprecated_subtype() {
        return this.subtype;
    }

    /* renamed from: -deprecated_type */
    public final String m88deprecated_type() {
        return this.type;
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    public final Charset charset(Charset charset) {
        String strParameter = parameter("charset");
        if (strParameter == null) {
            return charset;
        }
        try {
            return Charset.forName(strParameter);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && l.a(((MediaType) obj).mediaType, this.mediaType);
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String parameter(String str) {
        l.d(str, Action.NAME_ATTRIBUTE);
        i.a0.a aVarH = f.h(h.p(this.parameterNamesAndValues), 2);
        int iA = aVarH.a();
        int iC = aVarH.c();
        int iE = aVarH.e();
        if (iE >= 0) {
            if (iA > iC) {
                return null;
            }
        } else if (iA < iC) {
            return null;
        }
        while (!p.o(this.parameterNamesAndValues[iA], str, true)) {
            if (iA == iC) {
                return null;
            }
            iA += iE;
        }
        return this.parameterNamesAndValues[iA + 1];
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, g gVar) {
        this(str, str2, str3, strArr);
    }
}