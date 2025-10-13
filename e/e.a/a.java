package e.e.a;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class a implements DataInput {

    /* renamed from: e, reason: collision with root package name */
    protected final DataInputStream f15584e;

    /* renamed from: f, reason: collision with root package name */
    protected final InputStream f15585f;

    /* renamed from: g, reason: collision with root package name */
    protected final byte[] f15586g = new byte[8];

    public a(InputStream inputStream) {
        this.f15585f = inputStream;
        this.f15584e = new DataInputStream(inputStream);
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return this.f15584e.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        return this.f15584e.readByte();
    }

    @Override // java.io.DataInput
    public final char readChar() throws IOException {
        this.f15584e.readFully(this.f15586g, 0, 2);
        byte[] bArr = this.f15586g;
        return (char) ((bArr[0] & 255) | ((bArr[1] & 255) << 8));
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f15584e.readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i2, int i3) throws IOException {
        this.f15584e.readFully(bArr, i2, i3);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f15584e.readFully(this.f15586g, 0, 4);
        byte[] bArr = this.f15586g;
        return (bArr[0] & 255) | (bArr[3] << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return this.f15584e.readLine();
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.f15584e.readFully(this.f15586g, 0, 8);
        byte[] bArr = this.f15586g;
        return (bArr[0] & 255) | (bArr[7] << 56) | ((bArr[6] & 255) << 48) | ((bArr[5] & 255) << 40) | ((bArr[4] & 255) << 32) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f15584e.readFully(this.f15586g, 0, 2);
        byte[] bArr = this.f15586g;
        return (short) ((bArr[0] & 255) | ((bArr[1] & 255) << 8));
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        return this.f15584e.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        return this.f15584e.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f15584e.readFully(this.f15586g, 0, 2);
        byte[] bArr = this.f15586g;
        return (bArr[0] & 255) | ((bArr[1] & 255) << 8);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i2) {
        return this.f15584e.skipBytes(i2);
    }
}