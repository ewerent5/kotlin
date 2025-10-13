package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.android.ASaxEventRecorder;
import ch.qos.logback.classic.joran.action.ConditionalIncludeAction;
import ch.qos.logback.core.joran.action.IncludeAction;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class FindIncludeAction extends IncludeAction {
    private static final int EVENT_OFFSET = 1;

    public FindIncludeAction() {
        setEventOffset(1);
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction, ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
    }

    @Override // ch.qos.logback.core.joran.action.IncludeAction
    protected SaxEventRecorder createRecorder(InputStream inputStream, URL url) {
        if (!url.toString().endsWith("AndroidManifest.xml")) {
            return new SaxEventRecorder(getContext());
        }
        ASaxEventRecorder aSaxEventRecorder = new ASaxEventRecorder();
        aSaxEventRecorder.setFilter("logback");
        return aSaxEventRecorder;
    }

    @Override // ch.qos.logback.core.joran.action.AbstractIncludeAction, ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) throws IOException {
        if (interpretationContext.isEmpty() || !(interpretationContext.peekObject() instanceof ConditionalIncludeAction.State)) {
            return;
        }
        URL url = ((ConditionalIncludeAction.State) interpretationContext.popObject()).getUrl();
        if (url == null) {
            addInfo("No paths found from includes");
            return;
        }
        addInfo("Path found [" + url.toString() + "]");
        try {
            processInclude(interpretationContext, url);
        } catch (JoranException e2) {
            addError("Failed to process include [" + url.toString() + "]", e2);
        }
    }
}