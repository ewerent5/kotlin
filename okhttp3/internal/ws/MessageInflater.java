package okhttp3.internal.ws;

import i.y.d.l;
import j.d0;
import j.f;
import j.o;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okhttp3.internal.http2.Settings;

/* compiled from: MessageInflater.kt */
/* loaded from: classes3.dex */
public final class MessageInflater implements Closeable {
    private final f deflatedBytes;
    private final Inflater inflater;
    private final o inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        f fVar = new f();
        this.deflatedBytes = fVar;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new o((d0) fVar, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inflaterSource.close();
    }

    public final void inflate(f fVar) throws DataFormatException, IOException {
        l.d(fVar, "buffer");
        if (!(this.deflatedBytes.y0() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.m0(fVar);
        this.deflatedBytes.y(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.y0();
        do {
            this.inflaterSource.b(fVar, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < bytesRead);
    }
}