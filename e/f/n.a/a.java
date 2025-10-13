package e.f.n.a;

import j$.util.Spliterator;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: LineReader.java */
/* loaded from: classes.dex */
public class a {
    private final BufferedReader a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15649b;

    public a(BufferedReader bufferedReader, boolean z) {
        this.a = bufferedReader;
        this.f15649b = z;
    }

    private String b() throws IOException {
        StringBuilder sb = new StringBuilder(Spliterator.IMMUTABLE);
        while (true) {
            int i2 = this.a.read();
            if (i2 <= -1 || i2 == 10) {
                break;
            }
            sb.append((char) i2);
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public String a() {
        return this.f15649b ? b() : this.a.readLine();
    }
}