package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.status.StatusListener;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class StatusListenerAction extends Action {
    boolean inError = false;
    StatusListener statusListener = null;

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) throws ActionException {
        this.inError = false;
        String value = attributes.getValue(Action.CLASS_ATTRIBUTE);
        if (OptionHelper.isEmpty(value)) {
            addError("Missing class name for statusListener. Near [" + str + "] line " + getLineNumber(interpretationContext));
            this.inError = true;
            return;
        }
        try {
            if (OnConsoleStatusListener.class.getName().equals(value)) {
                OnConsoleStatusListener.addNewInstanceToContext(this.context);
            } else {
                this.statusListener = (StatusListener) OptionHelper.instantiateByClassName(value, (Class<?>) StatusListener.class, this.context);
                interpretationContext.getContext().getStatusManager().add(this.statusListener);
                StatusListener statusListener = this.statusListener;
                if (statusListener instanceof ContextAware) {
                    ((ContextAware) statusListener).setContext(this.context);
                }
            }
            addInfo("Added status listener of type [" + value + "]");
            interpretationContext.pushObject(this.statusListener);
        } catch (Exception e2) {
            this.inError = true;
            addError("Could not create an StatusListener of type [" + value + "].", e2);
            throw new ActionException(e2);
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        if (this.inError) {
            return;
        }
        StatusListener statusListener = this.statusListener;
        if (statusListener instanceof LifeCycle) {
            ((LifeCycle) statusListener).start();
        }
        if (interpretationContext.peekObject() != this.statusListener) {
            addWarn("The object at the of the stack is not the statusListener pushed earlier.");
        } else {
            interpretationContext.popObject();
        }
    }

    public void finish(InterpretationContext interpretationContext) {
    }
}