package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.LiteralConverter;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.File;
import java.util.Date;

/* loaded from: classes.dex */
public abstract class DefaultArchiveRemover extends ContextAwareBase implements ArchiveRemover {
    protected static final long INACTIVITY_TOLERANCE_IN_MILLIS = 5529600000L;
    static final int MAX_VALUE_FOR_INACTIVITY_PERIODS = 336;
    protected static final long UNINITIALIZED = -1;
    final FileNamePattern fileNamePattern;
    long lastHeartBeat = UNINITIALIZED;
    final boolean parentClean;
    int periodOffsetForDeletionTarget;
    final RollingCalendar rc;

    public DefaultArchiveRemover(FileNamePattern fileNamePattern, RollingCalendar rollingCalendar) {
        this.fileNamePattern = fileNamePattern;
        this.rc = rollingCalendar;
        this.parentClean = computeParentCleaningFlag(fileNamePattern);
    }

    private void removeFolderIfEmpty(File file, int i2) {
        if (i2 < 3 && file.isDirectory() && FileFilterUtil.isEmptyDirectory(file)) {
            addInfo("deleting folder [" + file + "]");
            file.delete();
            removeFolderIfEmpty(file.getParentFile(), i2 + 1);
        }
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void clean(Date date) {
        long time = date.getTime();
        int iComputeElapsedPeriodsSinceLastClean = computeElapsedPeriodsSinceLastClean(time);
        this.lastHeartBeat = time;
        if (iComputeElapsedPeriodsSinceLastClean > 1) {
            addInfo("periodsElapsed = " + iComputeElapsedPeriodsSinceLastClean);
        }
        for (int i2 = 0; i2 < iComputeElapsedPeriodsSinceLastClean; i2++) {
            cleanByPeriodOffset(date, this.periodOffsetForDeletionTarget - i2);
        }
    }

    abstract void cleanByPeriodOffset(Date date, int i2);

    int computeElapsedPeriodsSinceLastClean(long j2) {
        long j3 = this.lastHeartBeat;
        long jPeriodsElapsed = 336;
        if (j3 == UNINITIALIZED) {
            addInfo("first clean up after appender initialization");
            long jPeriodsElapsed2 = this.rc.periodsElapsed(j2, INACTIVITY_TOLERANCE_IN_MILLIS + j2);
            if (jPeriodsElapsed2 <= 336) {
                jPeriodsElapsed = jPeriodsElapsed2;
            }
        } else {
            jPeriodsElapsed = this.rc.periodsElapsed(j3, j2);
            if (jPeriodsElapsed < 1) {
                addWarn("Unexpected periodsElapsed value " + jPeriodsElapsed);
                jPeriodsElapsed = 1L;
            }
        }
        return (int) jPeriodsElapsed;
    }

    boolean computeParentCleaningFlag(FileNamePattern fileNamePattern) {
        if (fileNamePattern.getPrimaryDateTokenConverter().getDatePattern().indexOf(47) != -1) {
            return true;
        }
        Converter<Object> next = fileNamePattern.headTokenConverter;
        while (next != null && !(next instanceof DateTokenConverter)) {
            next = next.getNext();
        }
        while (next != null) {
            if ((next instanceof LiteralConverter) && next.convert(null).indexOf(47) != -1) {
                return true;
            }
            next = next.getNext();
        }
        return false;
    }

    void removeFolderIfEmpty(File file) {
        removeFolderIfEmpty(file, 0);
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void setMaxHistory(int i2) {
        this.periodOffsetForDeletionTarget = (-i2) - 1;
    }
}