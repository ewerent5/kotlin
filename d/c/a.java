package d.c;

import java.io.DataInput;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class a implements DataInput {

    /* renamed from: e, reason: collision with root package name */
    protected final DataInput f14119e;

    public a(DataInput dataInput) {
        this.f14119e = dataInput;
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        return this.f14119e.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() {
        return this.f14119e.readByte();
    }

    @Override // java.io.DataInput
    public char readChar() {
        return this.f14119e.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return this.f14119e.readDouble();
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return this.f14119e.readFloat();
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        this.f14119e.readFully(bArr);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i2, int i3) throws IOException {
        this.f14119e.readFully(bArr, i2, i3);
    }

    @Override // java.io.DataInput
    public int readInt() {
        return this.f14119e.readInt();
    }

    @Override // java.io.DataInput
    public String readLine() {
        return this.f14119e.readLine();
    }

    @Override // java.io.DataInput
    public long readLong() {
        return this.f14119e.readLong();
    }

    @Override // java.io.DataInput
    public short readShort() {
        return this.f14119e.readShort();
    }

    @Override // java.io.DataInput
    public String readUTF() {
        return this.f14119e.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        return this.f14119e.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() {
        return this.f14119e.readUnsignedShort();
    }

    @Override // java.io.DataInput
    public int skipBytes(int i2) {
        return this.f14119e.skipBytes(i2);
    }
}