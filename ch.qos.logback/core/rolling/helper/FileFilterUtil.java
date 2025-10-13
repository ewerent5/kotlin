package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class FileFilterUtil {

    /* renamed from: ch.qos.logback.core.rolling.helper.FileFilterUtil$1, reason: invalid class name */
    static class AnonymousClass1 implements Comparator<File>, j$.util.Comparator {
        AnonymousClass1() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ Comparator reversed() {
            return Collections.reverseOrder(this);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ Comparator thenComparing(Function function) {
            return Comparator.CC.$default$thenComparing(this, function);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, function, comparator);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, comparator);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }
    }

    /* renamed from: ch.qos.logback.core.rolling.helper.FileFilterUtil$2, reason: invalid class name */
    static class AnonymousClass2 implements java.util.Comparator<File>, j$.util.Comparator {
        AnonymousClass2() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator reversed() {
            return Collections.reverseOrder(this);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function) {
            return Comparator.CC.$default$thenComparing(this, function);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, function, comparator);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, comparator);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }
    }

    public static String afterLastSlash(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    public static int extractCounter(File file, String str) {
        Pattern patternCompile = Pattern.compile(str);
        String name = file.getName();
        Matcher matcher = patternCompile.matcher(name);
        if (matcher.matches()) {
            return new Integer(matcher.group(1)).intValue();
        }
        throw new IllegalStateException("The regex [" + str + "] should match [" + name + "]");
    }

    public static File[] filesInFolderMatchingStemRegex(File file, final String str) {
        return file == null ? new File[0] : (file.exists() && file.isDirectory()) ? file.listFiles(new FilenameFilter() { // from class: ch.qos.logback.core.rolling.helper.FileFilterUtil.3
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str2) {
                return str2.matches(str);
            }
        }) : new File[0];
    }

    public static int findHighestCounter(File[] fileArr, String str) {
        int i2 = Level.ALL_INT;
        for (File file : fileArr) {
            int iExtractCounter = extractCounter(file, str);
            if (i2 < iExtractCounter) {
                i2 = iExtractCounter;
            }
        }
        return i2;
    }

    public static boolean isEmptyDirectory(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            return list == null || list.length == 0;
        }
        throw new IllegalArgumentException("[" + file + "] must be a directory");
    }

    public static void removeEmptyParentDirectories(File file, int i2) {
        if (i2 >= 3) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile.isDirectory() && isEmptyDirectory(parentFile)) {
            parentFile.delete();
            removeEmptyParentDirectories(parentFile, i2 + 1);
        }
    }

    public static void reverseSortFileArrayByName(File[] fileArr) {
        Arrays.sort(fileArr, new AnonymousClass2());
    }

    public static String slashify(String str) {
        return str.replace(CoreConstants.ESCAPE_CHAR, '/');
    }

    public static void sortFileArrayByName(File[] fileArr) {
        Arrays.sort(fileArr, new AnonymousClass1());
    }
}