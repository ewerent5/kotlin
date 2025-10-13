package ch.qos.logback.classic.android;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import ch.qos.logback.classic.db.SQLBuilder;
import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.db.names.DefaultDBNameResolver;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import ch.qos.logback.core.android.CommonPathUtil;
import ch.qos.logback.core.util.Duration;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SQLiteAppender extends UnsynchronizedAppenderBase<ILoggingEvent> {
    private static final int ARG0_INDEX = 7;
    private static final int CALLER_CLASS_INDEX = 12;
    private static final int CALLER_FILENAME_INDEX = 11;
    private static final int CALLER_LINE_INDEX = 14;
    private static final int CALLER_METHOD_INDEX = 13;
    private static final short EXCEPTION_EXISTS = 2;
    private static final int FORMATTED_MESSAGE_INDEX = 2;
    private static final int LEVEL_STRING_INDEX = 4;
    private static final int LOGGER_NAME_INDEX = 3;
    private static final short PROPERTIES_EXIST = 1;
    private static final int REFERENCE_FLAG_INDEX = 6;
    private static final int THREAD_NAME_INDEX = 5;
    private static final int TIMESTMP_INDEX = 1;
    private SQLiteDatabase db;
    private DBNameResolver dbNameResolver;
    private String filename;
    private String insertExceptionSQL;
    private String insertPropertiesSQL;
    private String insertSQL;
    private long lastCleanupTime = 0;
    private SQLiteLogCleaner logCleaner;
    private Duration maxHistory;

    private String asStringTruncatedTo254(Object obj) {
        String string = obj != null ? obj.toString() : null;
        if (string != null && string.length() > 254) {
            string = string.substring(0, 254);
        }
        return string == null ? "" : string;
    }

    private void bindCallerData(SQLiteStatement sQLiteStatement, StackTraceElement[] stackTraceElementArr) {
        StackTraceElement stackTraceElement;
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0 || (stackTraceElement = stackTraceElementArr[0]) == null) {
            return;
        }
        sQLiteStatement.bindString(CALLER_FILENAME_INDEX, stackTraceElement.getFileName());
        sQLiteStatement.bindString(CALLER_CLASS_INDEX, stackTraceElement.getClassName());
        sQLiteStatement.bindString(CALLER_METHOD_INDEX, stackTraceElement.getMethodName());
        sQLiteStatement.bindString(CALLER_LINE_INDEX, Integer.toString(stackTraceElement.getLineNumber()));
    }

    private void bindLoggingEvent(SQLiteStatement sQLiteStatement, ILoggingEvent iLoggingEvent) {
        sQLiteStatement.bindLong(1, iLoggingEvent.getTimeStamp());
        sQLiteStatement.bindString(2, iLoggingEvent.getFormattedMessage());
        sQLiteStatement.bindString(3, iLoggingEvent.getLoggerName());
        sQLiteStatement.bindString(4, iLoggingEvent.getLevel().toString());
        sQLiteStatement.bindString(5, iLoggingEvent.getThreadName());
        sQLiteStatement.bindLong(6, computeReferenceMask(iLoggingEvent));
    }

    private void bindLoggingEventArguments(SQLiteStatement sQLiteStatement, Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        for (int i2 = 0; i2 < length && i2 < 4; i2++) {
            sQLiteStatement.bindString(i2 + 7, asStringTruncatedTo254(objArr[i2]));
        }
    }

    private void clearExpiredLogs(SQLiteDatabase sQLiteDatabase) {
        if (lastCheckExpired(this.maxHistory, this.lastCleanupTime)) {
            this.lastCleanupTime = System.currentTimeMillis();
            getLogCleaner().performLogCleanup(sQLiteDatabase, this.maxHistory);
        }
    }

    private static short computeReferenceMask(ILoggingEvent iLoggingEvent) {
        short s = ((iLoggingEvent.getMDCPropertyMap() != null ? iLoggingEvent.getMDCPropertyMap().keySet().size() : 0) > 0 || (iLoggingEvent.getLoggerContextVO().getPropertyMap() != null ? iLoggingEvent.getLoggerContextVO().getPropertyMap().size() : 0) > 0) ? PROPERTIES_EXIST : (short) 0;
        return iLoggingEvent.getThrowableProxy() != null ? (short) (s | EXCEPTION_EXISTS) : s;
    }

    private void insertException(SQLiteStatement sQLiteStatement, String str, short s, long j2) {
        sQLiteStatement.bindLong(1, j2);
        sQLiteStatement.bindLong(2, s);
        sQLiteStatement.bindString(3, str);
        sQLiteStatement.executeInsert();
    }

    private void insertProperties(Map<String, String> map, long j2) throws SQLException {
        if (map.size() > 0) {
            SQLiteStatement sQLiteStatementCompileStatement = this.db.compileStatement(this.insertPropertiesSQL);
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sQLiteStatementCompileStatement.bindLong(1, j2);
                    sQLiteStatementCompileStatement.bindString(2, entry.getKey());
                    sQLiteStatementCompileStatement.bindString(3, entry.getValue());
                    sQLiteStatementCompileStatement.executeInsert();
                }
            } finally {
                sQLiteStatementCompileStatement.close();
            }
        }
    }

    private void insertThrowable(IThrowableProxy iThrowableProxy, long j2) throws SQLException {
        SQLiteStatement sQLiteStatementCompileStatement = this.db.compileStatement(this.insertExceptionSQL);
        short s = 0;
        while (iThrowableProxy != null) {
            try {
                StringBuilder sb = new StringBuilder();
                ThrowableProxyUtil.subjoinFirstLine(sb, iThrowableProxy);
                String string = sb.toString();
                short s2 = (short) (s + PROPERTIES_EXIST);
                insertException(sQLiteStatementCompileStatement, string, s, j2);
                int commonFrames = iThrowableProxy.getCommonFrames();
                StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
                s = s2;
                int i2 = 0;
                while (i2 < stackTraceElementProxyArray.length - commonFrames) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('\t');
                    ThrowableProxyUtil.subjoinSTEP(sb2, stackTraceElementProxyArray[i2]);
                    String string2 = sb2.toString();
                    short s3 = (short) (s + PROPERTIES_EXIST);
                    insertException(sQLiteStatementCompileStatement, string2, s, j2);
                    i2++;
                    s = s3;
                }
                if (commonFrames > 0) {
                    short s4 = (short) (s + PROPERTIES_EXIST);
                    insertException(sQLiteStatementCompileStatement, "\t... " + commonFrames + " common frames omitted", s, j2);
                    s = s4;
                }
                iThrowableProxy = iThrowableProxy.getCause();
            } finally {
                sQLiteStatementCompileStatement.close();
            }
        }
    }

    private boolean lastCheckExpired(Duration duration, long j2) {
        if (duration == null || duration.getMilliseconds() <= 0) {
            return false;
        }
        return j2 <= 0 || System.currentTimeMillis() - j2 >= duration.getMilliseconds();
    }

    private Map<String, String> mergePropertyMaps(ILoggingEvent iLoggingEvent) {
        HashMap map = new HashMap();
        Map<String, String> propertyMap = iLoggingEvent.getLoggerContextVO().getPropertyMap();
        if (propertyMap != null) {
            map.putAll(propertyMap);
        }
        Map<String, String> mDCPropertyMap = iLoggingEvent.getMDCPropertyMap();
        if (mDCPropertyMap != null) {
            map.putAll(mDCPropertyMap);
        }
        return map;
    }

    private void secondarySubAppend(ILoggingEvent iLoggingEvent, long j2) throws SQLException {
        insertProperties(mergePropertyMaps(iLoggingEvent), j2);
        if (iLoggingEvent.getThrowableProxy() != null) {
            insertThrowable(iLoggingEvent.getThrowableProxy(), j2);
        }
    }

    private long subAppend(ILoggingEvent iLoggingEvent, SQLiteStatement sQLiteStatement) {
        bindLoggingEvent(sQLiteStatement, iLoggingEvent);
        bindLoggingEventArguments(sQLiteStatement, iLoggingEvent.getArgumentArray());
        bindCallerData(sQLiteStatement, iLoggingEvent.getCallerData());
        try {
            return sQLiteStatement.executeInsert();
        } catch (SQLiteException e2) {
            addWarn("Failed to insert loggingEvent", e2);
            return -1L;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(ILoggingEvent iLoggingEvent) {
        if (isStarted()) {
            try {
                clearExpiredLogs(this.db);
                SQLiteStatement sQLiteStatementCompileStatement = this.db.compileStatement(this.insertSQL);
                try {
                    this.db.beginTransaction();
                    long jSubAppend = subAppend(iLoggingEvent, sQLiteStatementCompileStatement);
                    if (jSubAppend != -1) {
                        secondarySubAppend(iLoggingEvent, jSubAppend);
                        this.db.setTransactionSuccessful();
                    }
                    if (this.db.inTransaction()) {
                        this.db.endTransaction();
                    }
                    sQLiteStatementCompileStatement.close();
                } catch (Throwable th) {
                    if (this.db.inTransaction()) {
                        this.db.endTransaction();
                    }
                    sQLiteStatementCompileStatement.close();
                    throw th;
                }
            } catch (Throwable th2) {
                addError("Cannot append event", th2);
            }
        }
    }

    protected void finalize() {
        this.db.close();
    }

    public File getDatabaseFile(String str) {
        File file = (str == null || str.trim().length() <= 0) ? null : new File(str);
        if (file == null || file.isDirectory()) {
            if (getContext() == null) {
                return null;
            }
            String property = getContext().getProperty(CoreConstants.PACKAGE_NAME_KEY);
            if (property != null && property.trim().length() > 0) {
                return new File(CommonPathUtil.getDatabaseDirectoryPath(property), "logback.db");
            }
        }
        return file;
    }

    public String getFilename() {
        return this.filename;
    }

    public SQLiteLogCleaner getLogCleaner() {
        if (this.logCleaner == null) {
            this.logCleaner = new SQLiteLogCleaner() { // from class: ch.qos.logback.classic.android.SQLiteAppender.1
                @Override // ch.qos.logback.classic.android.SQLiteLogCleaner
                public void performLogCleanup(SQLiteDatabase sQLiteDatabase, Duration duration) throws SQLException {
                    sQLiteDatabase.execSQL(SQLBuilder.buildDeleteExpiredLogsSQL(SQLiteAppender.this.dbNameResolver, System.currentTimeMillis() - duration.getMilliseconds()));
                }
            };
        }
        return this.logCleaner;
    }

    public String getMaxHistory() {
        Duration duration = this.maxHistory;
        return duration != null ? duration.toString() : "";
    }

    public long getMaxHistoryMs() {
        Duration duration = this.maxHistory;
        if (duration != null) {
            return duration.getMilliseconds();
        }
        return 0L;
    }

    public void setDbNameResolver(DBNameResolver dBNameResolver) {
        this.dbNameResolver = dBNameResolver;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setLogCleaner(SQLiteLogCleaner sQLiteLogCleaner) {
        this.logCleaner = sQLiteLogCleaner;
    }

    public void setMaxHistory(String str) {
        this.maxHistory = Duration.valueOf(str);
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() throws SQLException {
        boolean z = false;
        this.started = false;
        File databaseFile = getDatabaseFile(this.filename);
        if (databaseFile == null) {
            addError("Cannot determine database filename");
            return;
        }
        try {
            databaseFile.getParentFile().mkdirs();
            addInfo("db path: " + databaseFile.getAbsolutePath());
            this.db = SQLiteDatabase.openOrCreateDatabase(databaseFile.getPath(), (SQLiteDatabase.CursorFactory) null);
            z = true;
        } catch (SQLiteException e2) {
            addError("Cannot open database", e2);
        }
        if (z) {
            if (this.dbNameResolver == null) {
                this.dbNameResolver = new DefaultDBNameResolver();
            }
            this.insertExceptionSQL = SQLBuilder.buildInsertExceptionSQL(this.dbNameResolver);
            this.insertPropertiesSQL = SQLBuilder.buildInsertPropertiesSQL(this.dbNameResolver);
            this.insertSQL = SQLBuilder.buildInsertSQL(this.dbNameResolver);
            try {
                this.db.execSQL(SQLBuilder.buildCreateLoggingEventTableSQL(this.dbNameResolver));
                this.db.execSQL(SQLBuilder.buildCreatePropertyTableSQL(this.dbNameResolver));
                this.db.execSQL(SQLBuilder.buildCreateExceptionTableSQL(this.dbNameResolver));
                clearExpiredLogs(this.db);
                super.start();
                this.started = true;
            } catch (SQLiteException e3) {
                addError("Cannot create database tables", e3);
            }
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.db.close();
        this.lastCleanupTime = 0L;
    }
}