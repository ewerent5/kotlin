package ch.qos.logback.core.status;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class StatusUtil {
    StatusManager sm;

    public StatusUtil(Context context) {
        this.sm = context.getStatusManager();
    }

    public StatusUtil(StatusManager statusManager) {
        this.sm = statusManager;
    }

    public static boolean contextHasStatusListener(Context context) {
        List<StatusListener> copyOfStatusListenerList;
        StatusManager statusManager = context.getStatusManager();
        return (statusManager == null || (copyOfStatusListenerList = statusManager.getCopyOfStatusListenerList()) == null || copyOfStatusListenerList.size() == 0) ? false : true;
    }

    public static List<Status> filterStatusListByTimeThreshold(List<Status> list, long j2) {
        ArrayList arrayList = new ArrayList();
        for (Status status : list) {
            if (status.getDate().longValue() >= j2) {
                arrayList.add(status);
            }
        }
        return arrayList;
    }

    public void addError(Object obj, String str, Throwable th) {
        addStatus(new ErrorStatus(str, obj, th));
    }

    public void addInfo(Object obj, String str) {
        addStatus(new InfoStatus(str, obj));
    }

    public void addStatus(Status status) {
        StatusManager statusManager = this.sm;
        if (statusManager != null) {
            statusManager.add(status);
        }
    }

    public void addWarn(Object obj, String str) {
        addStatus(new WarnStatus(str, obj));
    }

    public boolean containsException(Class<?> cls) {
        Iterator<Status> it = this.sm.getCopyOfStatusList().iterator();
        while (it.hasNext()) {
            Throwable throwable = it.next().getThrowable();
            if (throwable != null && throwable.getClass().getName().equals(cls.getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean containsMatch(int i2, String str) {
        return containsMatch(0L, i2, str);
    }

    public boolean containsMatch(long j2, int i2, String str) {
        List<Status> listFilterStatusListByTimeThreshold = filterStatusListByTimeThreshold(this.sm.getCopyOfStatusList(), j2);
        Pattern patternCompile = Pattern.compile(str);
        for (Status status : listFilterStatusListByTimeThreshold) {
            if (i2 == status.getLevel() && patternCompile.matcher(status.getMessage()).lookingAt()) {
                return true;
            }
        }
        return false;
    }

    public boolean containsMatch(String str) {
        Pattern patternCompile = Pattern.compile(str);
        Iterator<Status> it = this.sm.getCopyOfStatusList().iterator();
        while (it.hasNext()) {
            if (patternCompile.matcher(it.next().getMessage()).lookingAt()) {
                return true;
            }
        }
        return false;
    }

    public int getHighestLevel(long j2) {
        int level = 0;
        for (Status status : filterStatusListByTimeThreshold(this.sm.getCopyOfStatusList(), j2)) {
            if (status.getLevel() > level) {
                level = status.getLevel();
            }
        }
        return level;
    }

    public boolean hasXMLParsingErrors(long j2) {
        return containsMatch(j2, 2, CoreConstants.XML_PARSING);
    }

    public boolean isErrorFree(long j2) {
        return 2 > getHighestLevel(j2);
    }

    public int matchCount(String str) {
        Pattern patternCompile = Pattern.compile(str);
        Iterator<Status> it = this.sm.getCopyOfStatusList().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (patternCompile.matcher(it.next().getMessage()).lookingAt()) {
                i2++;
            }
        }
        return i2;
    }

    public boolean noXMLParsingErrorsOccurred(long j2) {
        return !hasXMLParsingErrors(j2);
    }

    public long timeOfLastReset() {
        List<Status> copyOfStatusList = this.sm.getCopyOfStatusList();
        if (copyOfStatusList == null) {
            return -1L;
        }
        for (int size = copyOfStatusList.size() - 1; size >= 0; size--) {
            Status status = copyOfStatusList.get(size);
            if (CoreConstants.RESET_MSG_PREFIX.equals(status.getMessage())) {
                return status.getDate().longValue();
            }
        }
        return -1L;
    }
}