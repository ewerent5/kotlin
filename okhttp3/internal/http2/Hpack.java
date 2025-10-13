package okhttp3.internal.http2;

import ch.qos.logback.core.joran.action.Action;
import i.t.g;
import i.t.t;
import i.y.d.l;
import j.d0;
import j.f;
import j.h;
import j.i;
import j.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.Util;

/* compiled from: Hpack.kt */
/* loaded from: classes3.dex */
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<i, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        i iVar = Header.TARGET_METHOD;
        i iVar2 = Header.TARGET_PATH;
        i iVar3 = Header.TARGET_SCHEME;
        i iVar4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, ""), new Header(iVar, "GET"), new Header(iVar, "POST"), new Header(iVar2, "/"), new Header(iVar2, "/index.html"), new Header(iVar3, "http"), new Header(iVar3, "https"), new Header(iVar4, "200"), new Header(iVar4, "204"), new Header(iVar4, "206"), new Header(iVar4, "304"), new Header(iVar4, "400"), new Header(iVar4, "404"), new Header(iVar4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<i, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i2].name)) {
                linkedHashMap.put(headerArr2[i2].name, Integer.valueOf(i2));
            }
        }
        Map<i, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l.c(mapUnmodifiableMap, "Collections.unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final i checkLowercase(i iVar) throws IOException {
        l.d(iVar, Action.NAME_ATTRIBUTE);
        int iU = iVar.u();
        for (int i2 = 0; i2 < iU; i2++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte bD = iVar.d(i2);
            if (b2 <= bD && b3 >= bD) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + iVar.x());
            }
        }
        return iVar;
    }

    public final Map<i, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    /* compiled from: Hpack.kt */
    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final h source;

        public Reader(d0 d0Var, int i2) {
            this(d0Var, i2, 0, 4, null);
        }

        public Reader(d0 d0Var, int i2, int i3) {
            l.d(d0Var, "source");
            this.headerTableSizeSetting = i2;
            this.maxDynamicTableByteCount = i3;
            this.headerList = new ArrayList();
            this.source = q.d(d0Var);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        private final void adjustDynamicTableByteCount() {
            int i2 = this.maxDynamicTableByteCount;
            int i3 = this.dynamicTableByteCount;
            if (i2 < i3) {
                if (i2 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i3 - i2);
                }
            }
        }

        private final void clearDynamicTable() {
            g.k(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i2) {
            return this.nextHeaderIndex + 1 + i2;
        }

        private final int evictToRecoverBytes(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i3 = this.nextHeaderIndex;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    l.b(header);
                    int i5 = header.hpackSize;
                    i2 -= i5;
                    this.dynamicTableByteCount -= i5;
                    this.headerCount--;
                    i4++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i3 + 1, headerArr, i3 + 1 + i4, this.headerCount);
                this.nextHeaderIndex += i4;
            }
            return i4;
        }

        private final i getName(int i2) throws IOException {
            if (isStaticHeader(i2)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i2].name;
            }
            int iDynamicTableIndex = dynamicTableIndex(i2 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    Header header = headerArr[iDynamicTableIndex];
                    l.b(header);
                    return header.name;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        private final void insertIntoDynamicTable(int i2, Header header) {
            this.headerList.add(header);
            int i3 = header.hpackSize;
            if (i2 != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i2)];
                l.b(header2);
                i3 -= header2.hpackSize;
            }
            int i4 = this.maxDynamicTableByteCount;
            if (i3 > i4) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i3) - i4);
            if (i2 == -1) {
                int i5 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i5 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i6 = this.nextHeaderIndex;
                this.nextHeaderIndex = i6 - 1;
                this.dynamicTable[i6] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i2 + dynamicTableIndex(i2) + iEvictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i3;
        }

        private final boolean isStaticHeader(int i2) {
            return i2 >= 0 && i2 <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i2) throws IOException {
            if (isStaticHeader(i2)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i2]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(i2 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[iDynamicTableIndex];
                    l.b(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i2) {
            insertIntoDynamicTable(-1, new Header(getName(i2), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i2) throws IOException {
            this.headerList.add(new Header(getName(i2), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> listJ = t.J(this.headerList);
            this.headerList.clear();
            return listJ;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final i readByteString() {
            int i2 = readByte();
            boolean z = (i2 & 128) == 128;
            long j2 = readInt(i2, 127);
            if (!z) {
                return this.source.o(j2);
            }
            f fVar = new f();
            Huffman.INSTANCE.decode(this.source, j2, fVar);
            return fVar.o0();
        }

        public final void readHeaders() throws IOException {
            while (!this.source.H()) {
                int iAnd = Util.and(this.source.readByte(), 255);
                if (iAnd == 128) {
                    throw new IOException("index == 0");
                }
                if ((iAnd & 128) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, Hpack.PREFIX_6_BITS) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i2 = readInt(iAnd, Hpack.PREFIX_5_BITS);
                    this.maxDynamicTableByteCount = i2;
                    if (i2 < 0 || i2 > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        public final int readInt(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int i6 = readByte();
                if ((i6 & 128) == 0) {
                    return i3 + (i6 << i5);
                }
                i3 += (i6 & 127) << i5;
                i5 += 7;
            }
        }

        public /* synthetic */ Reader(d0 d0Var, int i2, int i3, int i4, i.y.d.g gVar) {
            this(d0Var, i2, (i4 & 4) != 0 ? i2 : i3);
        }
    }

    /* compiled from: Hpack.kt */
    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final f out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i2, f fVar) {
            this(i2, false, fVar, 2, null);
        }

        public Writer(int i2, boolean z, f fVar) {
            l.d(fVar, "out");
            this.headerTableSizeSetting = i2;
            this.useCompression = z;
            this.out = fVar;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i2;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public Writer(f fVar) {
            this(0, false, fVar, 3, null);
        }

        private final void adjustDynamicTableByteCount() {
            int i2 = this.maxDynamicTableByteCount;
            int i3 = this.dynamicTableByteCount;
            if (i2 < i3) {
                if (i2 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i3 - i2);
                }
            }
        }

        private final void clearDynamicTable() {
            g.k(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i3 = this.nextHeaderIndex;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    l.b(header);
                    i2 -= header.hpackSize;
                    int i5 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    l.b(header2);
                    this.dynamicTableByteCount = i5 - header2.hpackSize;
                    this.headerCount--;
                    i4++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i3 + 1, headerArr, i3 + 1 + i4, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i6 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i6 + 1, i6 + 1 + i4, (Object) null);
                this.nextHeaderIndex += i4;
            }
            return i4;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i2 = header.hpackSize;
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            int i4 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i4 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i5 = this.nextHeaderIndex;
            this.nextHeaderIndex = i5 - 1;
            this.dynamicTable[i5] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i2;
        }

        public final void resizeHeaderTable(int i2) {
            this.headerTableSizeSetting = i2;
            int iMin = Math.min(i2, 16384);
            int i3 = this.maxDynamicTableByteCount;
            if (i3 == iMin) {
                return;
            }
            if (iMin < i3) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(i iVar) {
            l.d(iVar, "data");
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(iVar) < iVar.u()) {
                    f fVar = new f();
                    huffman.encode(iVar, fVar);
                    i iVarO0 = fVar.o0();
                    writeInt(iVarO0.u(), 127, 128);
                    this.out.B0(iVarO0);
                    return;
                }
            }
            writeInt(iVar.u(), 127, 0);
            this.out.B0(iVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:85:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x00ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r14) {
            /*
                Method dump skipped, instructions count: 268
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.writeHeaders(java.util.List):void");
        }

        public final void writeInt(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.out.I(i2 | i4);
                return;
            }
            this.out.I(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.out.I(128 | (i5 & 127));
                i5 >>>= 7;
            }
            this.out.I(i5);
        }

        public /* synthetic */ Writer(int i2, boolean z, f fVar, int i3, i.y.d.g gVar) {
            this((i3 & 1) != 0 ? 4096 : i2, (i3 & 2) != 0 ? true : z, fVar);
        }
    }
}