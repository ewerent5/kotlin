package e.f;

import java.io.Reader;
import java.util.Locale;
import java.util.ResourceBundle;

/* compiled from: CSVReaderBuilder.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private final Reader f15623b;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15626e;
    private final e a = new e();

    /* renamed from: c, reason: collision with root package name */
    private int f15624c = 0;

    /* renamed from: d, reason: collision with root package name */
    private i f15625d = null;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15627f = true;

    /* renamed from: g, reason: collision with root package name */
    private e.f.k.a f15628g = e.f.k.a.NEITHER;

    /* renamed from: h, reason: collision with root package name */
    private int f15629h = 0;

    /* renamed from: i, reason: collision with root package name */
    private Locale f15630i = Locale.getDefault();

    /* renamed from: j, reason: collision with root package name */
    private e.f.o.b f15631j = new e.f.o.b();

    /* renamed from: k, reason: collision with root package name */
    private e.f.o.d f15632k = new e.f.o.d();

    /* renamed from: l, reason: collision with root package name */
    private e.f.m.a f15633l = null;

    public g(Reader reader) {
        if (reader == null) {
            throw new IllegalArgumentException(ResourceBundle.getBundle("opencsv").getString("reader.null"));
        }
        this.f15623b = reader;
    }

    public f a() {
        return new f(this.f15623b, this.f15624c, b(), this.f15626e, this.f15627f, this.f15629h, this.f15630i, this.f15631j, this.f15632k, this.f15633l);
    }

    protected i b() {
        return (i) k.a.a.a.b.a(this.f15625d, this.a.c(this.f15628g).b(this.f15630i).a());
    }
}