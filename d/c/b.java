package d.c;

import java.io.DataInput;
import java.io.IOException;

/* loaded from: classes.dex */
public class b extends a {
    public b(DataInput dataInput) {
        super(dataInput);
    }

    public int[] a(int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = readInt();
        }
        return iArr;
    }

    public void b(int i2) throws IOException {
        int i3 = readInt();
        if (i3 != i2) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public void c() {
        skipBytes(4);
    }
}