package i.d0;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: Regex.kt */
/* loaded from: classes3.dex */
public final class f implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f15808e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private final Pattern f15809f;

    /* compiled from: Regex.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    public f(Pattern pattern) {
        i.y.d.l.d(pattern, "nativePattern");
        this.f15809f = pattern;
    }

    public final boolean a(CharSequence charSequence) {
        i.y.d.l.d(charSequence, "input");
        return this.f15809f.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        i.y.d.l.d(charSequence, "input");
        i.y.d.l.d(str, "replacement");
        String strReplaceAll = this.f15809f.matcher(charSequence).replaceAll(str);
        i.y.d.l.c(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return strReplaceAll;
    }

    public String toString() {
        String string = this.f15809f.toString();
        i.y.d.l.c(string, "nativePattern.toString()");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(String str) {
        i.y.d.l.d(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        i.y.d.l.c(patternCompile, "Pattern.compile(pattern)");
        this(patternCompile);
    }
}