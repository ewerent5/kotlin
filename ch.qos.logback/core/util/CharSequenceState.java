package ch.qos.logback.core.util;

/* loaded from: classes.dex */
class CharSequenceState {

    /* renamed from: c, reason: collision with root package name */
    final char f3510c;
    int occurrences = 1;

    public CharSequenceState(char c2) {
        this.f3510c = c2;
    }

    void incrementOccurrences() {
        this.occurrences++;
    }
}