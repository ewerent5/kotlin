package okhttp3.internal.cache2;

import i.y.d.l;
import j.f;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: FileOperator.kt */
/* loaded from: classes3.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        l.d(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j2, f fVar, long j3) throws IOException {
        l.d(fVar, "sink");
        if (j3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j3 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j2, j3, fVar);
            j2 += jTransferTo;
            j3 -= jTransferTo;
        }
    }

    public final void write(long j2, f fVar, long j3) throws IOException {
        l.d(fVar, "source");
        if (j3 < 0 || j3 > fVar.y0()) {
            throw new IndexOutOfBoundsException();
        }
        long j4 = j2;
        long j5 = j3;
        while (j5 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(fVar, j4, j5);
            j4 += jTransferFrom;
            j5 -= jTransferFrom;
        }
    }
}