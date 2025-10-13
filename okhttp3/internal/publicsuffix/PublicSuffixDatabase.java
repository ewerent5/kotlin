package okhttp3.internal.publicsuffix;

import ch.qos.logback.core.CoreConstants;
import i.d0.q;
import i.s;
import i.t.j;
import i.t.k;
import i.t.t;
import i.x.a;
import i.y.d.g;
import i.y.d.l;
import i.y.d.o;
import j.h;
import j.n;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.slf4j.Marker;

/* compiled from: PublicSuffixDatabase.kt */
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {(byte) 42};
    private static final List<String> PREVAILING_RULE = k.b(Marker.ANY_MARKER);
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* compiled from: PublicSuffixDatabase.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i2) {
            int i3;
            boolean z;
            int iAnd;
            int iAnd2;
            int length = bArr.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr[i5] != ((byte) 10)) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i3 = i6 + i7;
                    if (bArr[i3] == ((byte) 10)) {
                        break;
                    }
                    i7++;
                }
                int i8 = i3 - i6;
                int i9 = i2;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        iAnd = 46;
                        z = false;
                    } else {
                        z = z2;
                        iAnd = Util.and(bArr2[i9][i10], 255);
                    }
                    iAnd2 = iAnd - Util.and(bArr[i6 + i11], 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    }
                    if (bArr2[i9].length != i10) {
                        z2 = z;
                    } else {
                        if (i9 == bArr2.length - 1) {
                            break;
                        }
                        i9++;
                        z2 = true;
                        i10 = -1;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr2[i9].length - i10;
                        int length3 = bArr2.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr2[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                l.c(charset, "UTF_8");
                                return new String(bArr, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i3 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: PublicSuffixDatabase.kt */
    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$findMatchingRule$1 */
    final /* synthetic */ class AnonymousClass1 extends o {
        AnonymousClass1(PublicSuffixDatabase publicSuffixDatabase) {
            super(publicSuffixDatabase, PublicSuffixDatabase.class, "publicSuffixListBytes", "getPublicSuffixListBytes()[B", 0);
        }

        @Override // i.y.d.o, i.b0.i
        public Object get() {
            return PublicSuffixDatabase.access$getPublicSuffixListBytes$p((PublicSuffixDatabase) this.receiver);
        }

        @Override // i.y.d.o
        public void set(Object obj) {
            ((PublicSuffixDatabase) this.receiver).publicSuffixListBytes = (byte[]) obj;
        }
    }

    public static final /* synthetic */ byte[] access$getPublicSuffixListBytes$p(PublicSuffixDatabase publicSuffixDatabase) {
        byte[] bArr = publicSuffixDatabase.publicSuffixListBytes;
        if (bArr == null) {
            l.m("publicSuffixListBytes");
        }
        return bArr;
    }

    private final List<String> findMatchingRule(List<String> list) throws InterruptedException {
        String str;
        String strBinarySearch;
        String str2;
        List<String> listF;
        List<String> listF2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (!(this.publicSuffixListBytes != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i2 = 0; i2 < size; i2++) {
            String str3 = list.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            l.c(charset, "UTF_8");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = str3.getBytes(charset);
            l.c(bytes, "(this as java.lang.String).getBytes(charset)");
            bArr[i2] = bytes;
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= size) {
                strBinarySearch = null;
                break;
            }
            Companion companion = Companion;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                l.m("publicSuffixListBytes");
            }
            strBinarySearch = companion.binarySearch(bArr2, bArr, i3);
            if (strBinarySearch != null) {
                break;
            }
            i3++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i4 = 0; i4 < length; i4++) {
                bArr3[i4] = WILDCARD_LABEL;
                Companion companion2 = Companion;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    l.m("publicSuffixListBytes");
                }
                String strBinarySearch2 = companion2.binarySearch(bArr4, bArr3, i4);
                if (strBinarySearch2 != null) {
                    str2 = strBinarySearch2;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i5 = size - 1;
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                Companion companion3 = Companion;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    l.m("publicSuffixExceptionListBytes");
                }
                String strBinarySearch3 = companion3.binarySearch(bArr5, bArr, i6);
                if (strBinarySearch3 != null) {
                    str = strBinarySearch3;
                    break;
                }
                i6++;
            }
        }
        if (str != null) {
            return q.m0(EXCEPTION_MARKER + str, new char[]{CoreConstants.DOT}, false, 0, 6, null);
        }
        if (strBinarySearch == null && str2 == null) {
            return PREVAILING_RULE;
        }
        if (strBinarySearch == null || (listF = q.m0(strBinarySearch, new char[]{CoreConstants.DOT}, false, 0, 6, null)) == null) {
            listF = i.t.l.f();
        }
        if (str2 == null || (listF2 = q.m0(str2, new char[]{CoreConstants.DOT}, false, 0, 6, null)) == null) {
            listF2 = i.t.l.f();
        }
        return listF.size() > listF2.size() ? listF : listF2;
    }

    private final void readTheList() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        h hVarD = j.q.d(new n(j.q.k(resourceAsStream)));
        try {
            byte[] bArrW0 = hVarD.w0(hVarD.readInt());
            byte[] bArrW02 = hVarD.w0(hVarD.readInt());
            s sVar = s.a;
            a.a(hVarD, null);
            synchronized (this) {
                l.b(bArrW0);
                this.publicSuffixListBytes = bArrW0;
                l.b(bArrW02);
                this.publicSuffixExceptionListBytes = bArrW02;
            }
            this.readCompleteLatch.countDown();
        } finally {
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e2) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e2);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> splitDomain(String str) {
        List<String> listM0 = q.m0(str, new char[]{CoreConstants.DOT}, false, 0, 6, null);
        return l.a((String) j.B(listM0), "") ? t.t(listM0, 1) : listM0;
    }

    public final String getEffectiveTldPlusOne(String str) throws InterruptedException {
        int size;
        int size2;
        l.d(str, "domain");
        String unicode = IDN.toUnicode(str);
        l.c(unicode, "unicodeDomain");
        List<String> listSplitDomain = splitDomain(unicode);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        return i.c0.j.g(i.c0.j.d(t.s(splitDomain(str)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        l.d(bArr, "publicSuffixListBytes");
        l.d(bArr2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}