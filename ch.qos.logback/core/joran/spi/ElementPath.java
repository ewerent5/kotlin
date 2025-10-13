package ch.qos.logback.core.joran.spi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ElementPath {
    ArrayList<String> partList;

    public ElementPath() {
        this.partList = new ArrayList<>();
    }

    public ElementPath(String str) {
        String[] strArrSplit;
        this.partList = new ArrayList<>();
        if (str == null || (strArrSplit = str.split("/")) == null) {
            return;
        }
        for (String str2 : strArrSplit) {
            if (str2.length() > 0) {
                this.partList.add(str2);
            }
        }
    }

    public ElementPath(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        this.partList = arrayList;
        arrayList.addAll(list);
    }

    private boolean equalityCheck(String str, String str2) {
        return str.equalsIgnoreCase(str2);
    }

    public ElementPath duplicate() {
        ElementPath elementPath = new ElementPath();
        elementPath.partList.addAll(this.partList);
        return elementPath;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ElementPath)) {
            return false;
        }
        ElementPath elementPath = (ElementPath) obj;
        if (elementPath.size() != size()) {
            return false;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!equalityCheck(get(i2), elementPath.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public String get(int i2) {
        return this.partList.get(i2);
    }

    public List<String> getCopyOfPartList() {
        return new ArrayList(this.partList);
    }

    public String peekLast() {
        if (this.partList.isEmpty()) {
            return null;
        }
        return this.partList.get(this.partList.size() - 1);
    }

    public void pop() {
        if (this.partList.isEmpty()) {
            return;
        }
        this.partList.remove(r0.size() - 1);
    }

    public void push(String str) {
        this.partList.add(str);
    }

    public int size() {
        return this.partList.size();
    }

    protected String toStableString() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.partList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            sb.append("[");
            sb.append(next);
            sb.append("]");
        }
        return sb.toString();
    }

    public String toString() {
        return toStableString();
    }
}