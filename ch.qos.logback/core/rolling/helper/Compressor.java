package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.FileUtil;
import java.io.File;
import java.util.zip.ZipEntry;

/* loaded from: classes.dex */
public class Compressor extends ContextAwareBase {
    static final int BUFFER_SIZE = 8192;
    final CompressionMode compressionMode;

    /* renamed from: ch.qos.logback.core.rolling.helper.Compressor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode;

        static {
            int[] iArr = new int[CompressionMode.values().length];
            $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode = iArr;
            try {
                iArr[CompressionMode.GZ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.ZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Compressor(CompressionMode compressionMode) {
        this.compressionMode = compressionMode;
    }

    public static String computeFileNameStr_WCS(String str, CompressionMode compressionMode) {
        int i2;
        int length = str.length();
        int i3 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[compressionMode.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    return str;
                }
                throw new IllegalStateException("Execution should not reach this point");
            }
            if (!str.endsWith(".zip")) {
                return str;
            }
            i2 = length - 4;
        } else {
            if (!str.endsWith(".gz")) {
                return str;
            }
            i2 = length - 3;
        }
        return str.substring(0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void gzCompress(java.lang.String r9, java.lang.String r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.rolling.helper.Compressor.gzCompress(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.zip.ZipOutputStream] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.zip.ZipOutputStream] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.zip.ZipOutputStream] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void zipCompress(java.lang.String r8, java.lang.String r9, java.lang.String r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.rolling.helper.Compressor.zipCompress(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void compress(String str, String str2, String str3) throws Throwable {
        int i2 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[this.compressionMode.ordinal()];
        if (i2 == 1) {
            gzCompress(str, str2);
        } else if (i2 == 2) {
            zipCompress(str, str2, str3);
        } else if (i2 == 3) {
            throw new UnsupportedOperationException("compress method called in NONE compression mode");
        }
    }

    ZipEntry computeZipEntry(File file) {
        return computeZipEntry(file.getName());
    }

    ZipEntry computeZipEntry(String str) {
        return new ZipEntry(computeFileNameStr_WCS(str, this.compressionMode));
    }

    void createMissingTargetDirsIfNecessary(File file) {
        if (FileUtil.isParentDirectoryCreationRequired(file)) {
            if (FileUtil.createMissingParentDirectories(file)) {
                addInfo("Created missing parent directories for [" + file.getAbsolutePath() + "]");
                return;
            }
            addError("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
        }
    }

    public String toString() {
        return getClass().getName();
    }
}