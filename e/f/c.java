package e.f;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.ResourceBundle;

/* compiled from: CSVIterator.java */
/* loaded from: classes.dex */
public class c implements Iterator<String[]>, j$.util.Iterator {

    /* renamed from: e, reason: collision with root package name */
    private final f f15593e;

    /* renamed from: f, reason: collision with root package name */
    private String[] f15594f;

    /* renamed from: g, reason: collision with root package name */
    private Locale f15595g = Locale.getDefault();

    public c(f fVar) {
        this.f15593e = fVar;
        this.f15594f = fVar.I0();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String[] next() {
        String[] strArr = this.f15594f;
        try {
            this.f15594f = this.f15593e.I0();
            return strArr;
        } catch (e.f.l.e | IOException e2) {
            NoSuchElementException noSuchElementException = new NoSuchElementException(e2.getLocalizedMessage());
            noSuchElementException.initCause(e2);
            throw noSuchElementException;
        }
    }

    public void b(Locale locale) {
        this.f15595g = (Locale) k.a.a.a.b.a(locale, Locale.getDefault());
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        return this.f15594f != null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ResourceBundle.getBundle("opencsv", this.f15595g).getString("read.only.iterator"));
    }
}