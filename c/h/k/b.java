package c.h.k;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter.java */
@Deprecated
/* loaded from: classes.dex */
public class b extends Writer {

    /* renamed from: e, reason: collision with root package name */
    private final String f3103e;

    /* renamed from: f, reason: collision with root package name */
    private StringBuilder f3104f = new StringBuilder(128);

    public b(String str) {
        this.f3103e = str;
    }

    private void b() {
        if (this.f3104f.length() > 0) {
            Log.d(this.f3103e, this.f3104f.toString());
            StringBuilder sb = this.f3104f;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                b();
            } else {
                this.f3104f.append(c2);
            }
        }
    }
}