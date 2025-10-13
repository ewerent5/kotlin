package e.f;

import ch.qos.logback.core.CoreConstants;
import java.util.Locale;

/* compiled from: CSVParserBuilder.java */
/* loaded from: classes.dex */
public class e {
    private char a = CoreConstants.COMMA_CHAR;

    /* renamed from: b, reason: collision with root package name */
    private char f15607b = CoreConstants.DOUBLE_QUOTE_CHAR;

    /* renamed from: c, reason: collision with root package name */
    private char f15608c = CoreConstants.ESCAPE_CHAR;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15609d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15610e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15611f = false;

    /* renamed from: g, reason: collision with root package name */
    private e.f.k.a f15612g = e.f.k.a.NEITHER;

    /* renamed from: h, reason: collision with root package name */
    private Locale f15613h = Locale.getDefault();

    public d a() {
        return new d(this.a, this.f15607b, this.f15608c, this.f15609d, this.f15610e, this.f15611f, this.f15612g, this.f15613h);
    }

    public e b(Locale locale) {
        this.f15613h = (Locale) k.a.a.a.b.a(locale, Locale.getDefault());
        return this;
    }

    public e c(e.f.k.a aVar) {
        this.f15612g = aVar;
        return this;
    }
}