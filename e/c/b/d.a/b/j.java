package e.c.b.d.a.b;

/* loaded from: classes.dex */
final class j extends g {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ p f15342f;

    j(p pVar) {
        this.f15342f = pVar;
    }

    @Override // e.c.b.d.a.b.g
    public final void a() {
        if (this.f15342f.f15358l != null) {
            this.f15342f.f15349c.d("Unbind from service.", new Object[0]);
            this.f15342f.f15348b.unbindService(this.f15342f.f15357k);
            this.f15342f.f15352f = false;
            this.f15342f.f15358l = null;
            this.f15342f.f15357k = null;
        }
    }
}