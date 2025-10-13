package e.f;

/* compiled from: AbstractCSVParser.java */
/* loaded from: classes.dex */
public abstract class a implements i {
    protected final char a;

    /* renamed from: b, reason: collision with root package name */
    protected final char f15587b;

    /* renamed from: c, reason: collision with root package name */
    protected final e.f.k.a f15588c;

    /* renamed from: d, reason: collision with root package name */
    protected String f15589d;

    public a(char c2, char c3, e.f.k.a aVar) {
        this.a = c2;
        this.f15587b = c3;
        this.f15588c = aVar;
    }

    @Override // e.f.i
    public String[] a(String str) {
        return d(str, true);
    }

    @Override // e.f.i
    public String b() {
        return k.a.a.a.c.d(this.f15589d);
    }

    @Override // e.f.i
    public boolean c() {
        return this.f15589d != null;
    }

    protected abstract String[] d(String str, boolean z);
}