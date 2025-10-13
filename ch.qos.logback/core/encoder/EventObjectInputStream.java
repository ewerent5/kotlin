package ch.qos.logback.core.encoder;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class EventObjectInputStream<E> extends InputStream {
    List<E> buffer = new ArrayList();
    int index = 0;
    NonClosableInputStream ncis;

    EventObjectInputStream(InputStream inputStream) {
        this.ncis = new NonClosableInputStream(inputStream);
    }

    private void internalReset() {
        this.index = 0;
        this.buffer.clear();
    }

    @Override // java.io.InputStream
    public int available() {
        return this.ncis.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.ncis.realClose();
    }

    E getFromBuffer() {
        if (this.index >= this.buffer.size()) {
            return null;
        }
        List<E> list = this.buffer;
        int i2 = this.index;
        this.index = i2 + 1;
        return list.get(i2);
    }

    @Override // java.io.InputStream
    public int read() {
        throw new UnsupportedOperationException("Only the readEvent method is supported.");
    }

    public E readEvent() throws IOException {
        E fromBuffer = getFromBuffer();
        if (fromBuffer != null) {
            return fromBuffer;
        }
        internalReset();
        int header = readHeader();
        if (header == -1) {
            return null;
        }
        readPayload(header);
        readFooter(header);
        return getFromBuffer();
    }

    E readEvents(ObjectInputStream objectInputStream) {
        E e2;
        try {
            e2 = (E) objectInputStream.readObject();
        } catch (ClassNotFoundException e3) {
            e = e3;
            e2 = null;
        }
        try {
            this.buffer.add(e2);
        } catch (ClassNotFoundException e4) {
            e = e4;
            e.printStackTrace();
            return e2;
        }
        return e2;
    }

    void readFooter(int i2) {
        byte[] bArr = new byte[8];
        if (this.ncis.read(bArr) == -1) {
            throw new IllegalStateException("Looks like a corrupt stream");
        }
        if (ByteArrayUtil.readInt(bArr, 0) != 640373619) {
            throw new IllegalStateException("Looks like a corrupt stream");
        }
        if (ByteArrayUtil.readInt(bArr, 4) != (i2 ^ ObjectStreamEncoder.STOP_PEBBLE)) {
            throw new IllegalStateException("Invalid checksum");
        }
    }

    int readHeader() {
        byte[] bArr = new byte[16];
        if (this.ncis.read(bArr) == -1) {
            return -1;
        }
        if (ByteArrayUtil.readInt(bArr, 0) != 1853421169) {
            throw new IllegalStateException("Does not look like data created by ObjectStreamEncoder");
        }
        int i2 = ByteArrayUtil.readInt(bArr, 4);
        if (ByteArrayUtil.readInt(bArr, 12) == (1853421169 ^ i2)) {
            return i2;
        }
        throw new IllegalStateException("Invalid checksum");
    }

    void readPayload(int i2) throws IOException {
        ArrayList arrayList = new ArrayList(i2);
        ObjectInputStream objectInputStream = new ObjectInputStream(this.ncis);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(readEvents(objectInputStream));
        }
        objectInputStream.close();
    }
}