package ch.qos.logback.core.rolling;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.ArchiveRemover;
import ch.qos.logback.core.rolling.helper.AsynchronousCompressor;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.Compressor;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.rolling.helper.RenameUtil;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class TimeBasedRollingPolicy<E> extends RollingPolicyBase implements TriggeringPolicy<E> {
    static final String FNP_NOT_SET = "The FileNamePattern option must be set before using TimeBasedRollingPolicy. ";
    static final int INFINITE_HISTORY = 0;
    private ArchiveRemover archiveRemover;
    private Compressor compressor;
    FileNamePattern fileNamePatternWCS;
    Future<?> future;
    TimeBasedFileNamingAndTriggeringPolicy<E> timeBasedFileNamingAndTriggeringPolicy;
    private RenameUtil renameUtil = new RenameUtil();
    private int maxHistory = 0;
    boolean cleanHistoryOnStart = false;

    private String transformFileNamePattern2ZipEntry(String str) {
        return FileFilterUtil.afterLastSlash(FileFilterUtil.slashify(str));
    }

    private void waitForAsynchronousJobToStop() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        Future<?> future = this.future;
        if (future != null) {
            try {
                future.get(30L, TimeUnit.SECONDS);
            } catch (TimeoutException e2) {
                e = e2;
                str = "Timeout while waiting for compression job to finish";
                addError(str, e);
            } catch (Exception e3) {
                e = e3;
                str = "Unexpected exception while waiting for compression job to finish";
                addError(str, e);
            }
        }
    }

    Future asyncCompress(String str, String str2, String str3) {
        return new AsynchronousCompressor(this.compressor).compressAsynchronously(str, str2, str3);
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public String getActiveFileName() {
        String parentsRawFileProperty = getParentsRawFileProperty();
        return parentsRawFileProperty != null ? parentsRawFileProperty : this.timeBasedFileNamingAndTriggeringPolicy.getCurrentPeriodsFileNameWithoutCompressionSuffix();
    }

    public int getMaxHistory() {
        return this.maxHistory;
    }

    public TimeBasedFileNamingAndTriggeringPolicy<E> getTimeBasedFileNamingAndTriggeringPolicy() {
        return this.timeBasedFileNamingAndTriggeringPolicy;
    }

    public boolean isCleanHistoryOnStart() {
        return this.cleanHistoryOnStart;
    }

    @Override // ch.qos.logback.core.rolling.TriggeringPolicy
    public boolean isTriggeringEvent(File file, E e2) {
        return this.timeBasedFileNamingAndTriggeringPolicy.isTriggeringEvent(file, e2);
    }

    Future renamedRawAndAsyncCompress(String str, String str2) throws Throwable {
        String parentsRawFileProperty = getParentsRawFileProperty();
        String str3 = parentsRawFileProperty + System.nanoTime() + ".tmp";
        this.renameUtil.rename(parentsRawFileProperty, str3);
        return asyncCompress(str3, str, str2);
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicy
    public void rollover() throws Throwable {
        String elapsedPeriodsFileName = this.timeBasedFileNamingAndTriggeringPolicy.getElapsedPeriodsFileName();
        String strAfterLastSlash = FileFilterUtil.afterLastSlash(elapsedPeriodsFileName);
        if (this.compressionMode != CompressionMode.NONE) {
            this.future = getParentsRawFileProperty() == null ? asyncCompress(elapsedPeriodsFileName, elapsedPeriodsFileName, strAfterLastSlash) : renamedRawAndAsyncCompress(elapsedPeriodsFileName, strAfterLastSlash);
        } else if (getParentsRawFileProperty() != null) {
            this.renameUtil.rename(getParentsRawFileProperty(), elapsedPeriodsFileName);
        }
        ArchiveRemover archiveRemover = this.archiveRemover;
        if (archiveRemover != null) {
            archiveRemover.clean(new Date(this.timeBasedFileNamingAndTriggeringPolicy.getCurrentTime()));
        }
    }

    public void setCleanHistoryOnStart(boolean z) {
        this.cleanHistoryOnStart = z;
    }

    public void setMaxHistory(int i2) {
        this.maxHistory = i2;
    }

    public void setTimeBasedFileNamingAndTriggeringPolicy(TimeBasedFileNamingAndTriggeringPolicy<E> timeBasedFileNamingAndTriggeringPolicy) {
        this.timeBasedFileNamingAndTriggeringPolicy = timeBasedFileNamingAndTriggeringPolicy;
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.renameUtil.setContext(this.context);
        if (this.fileNamePatternStr == null) {
            addWarn(FNP_NOT_SET);
            addWarn(CoreConstants.SEE_FNP_NOT_SET);
            throw new IllegalStateException("The FileNamePattern option must be set before using TimeBasedRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
        }
        this.fileNamePattern = new FileNamePattern(this.fileNamePatternStr, this.context);
        determineCompressionMode();
        Compressor compressor = new Compressor(this.compressionMode);
        this.compressor = compressor;
        compressor.setContext(this.context);
        this.fileNamePatternWCS = new FileNamePattern(Compressor.computeFileNameStr_WCS(this.fileNamePatternStr, this.compressionMode), this.context);
        addInfo("Will use the pattern " + this.fileNamePatternWCS + " for the active file");
        if (this.compressionMode == CompressionMode.ZIP) {
            this.zipEntryFileNamePattern = new FileNamePattern(transformFileNamePattern2ZipEntry(this.fileNamePatternStr), this.context);
        }
        if (this.timeBasedFileNamingAndTriggeringPolicy == null) {
            this.timeBasedFileNamingAndTriggeringPolicy = new DefaultTimeBasedFileNamingAndTriggeringPolicy();
        }
        this.timeBasedFileNamingAndTriggeringPolicy.setContext(this.context);
        this.timeBasedFileNamingAndTriggeringPolicy.setTimeBasedRollingPolicy(this);
        this.timeBasedFileNamingAndTriggeringPolicy.start();
        if (this.maxHistory != 0) {
            ArchiveRemover archiveRemover = this.timeBasedFileNamingAndTriggeringPolicy.getArchiveRemover();
            this.archiveRemover = archiveRemover;
            archiveRemover.setMaxHistory(this.maxHistory);
            if (this.cleanHistoryOnStart) {
                addInfo("Cleaning on start up");
                this.archiveRemover.clean(new Date(this.timeBasedFileNamingAndTriggeringPolicy.getCurrentTime()));
            }
        }
        super.start();
    }

    @Override // ch.qos.logback.core.rolling.RollingPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() throws ExecutionException, InterruptedException, TimeoutException {
        if (isStarted()) {
            waitForAsynchronousJobToStop();
            super.stop();
        }
    }

    public String toString() {
        return "c.q.l.core.rolling.TimeBasedRollingPolicy";
    }
}