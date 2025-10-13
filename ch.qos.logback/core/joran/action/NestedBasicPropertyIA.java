package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.util.AggregationType;
import java.lang.reflect.InvocationTargetException;
import java.util.Stack;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class NestedBasicPropertyIA extends ImplicitAction {
    Stack<IADataForBasicProperty> actionDataStack = new Stack<>();

    /* renamed from: ch.qos.logback.core.joran.action.NestedBasicPropertyIA$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$util$AggregationType;

        static {
            int[] iArr = new int[AggregationType.values().length];
            $SwitchMap$ch$qos$logback$core$util$AggregationType = iArr;
            try {
                iArr[AggregationType.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY_COLLECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY_COLLECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void body(InterpretationContext interpretationContext, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String strSubst = interpretationContext.subst(str);
        IADataForBasicProperty iADataForBasicPropertyPeek = this.actionDataStack.peek();
        int i2 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$util$AggregationType[iADataForBasicPropertyPeek.aggregationType.ordinal()];
        if (i2 == 4) {
            iADataForBasicPropertyPeek.parentBean.setProperty(iADataForBasicPropertyPeek.propertyName, strSubst);
        } else {
            if (i2 != 5) {
                return;
            }
            iADataForBasicPropertyPeek.parentBean.addBasicProperty(iADataForBasicPropertyPeek.propertyName, strSubst);
        }
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        this.actionDataStack.pop();
    }

    @Override // ch.qos.logback.core.joran.action.ImplicitAction
    public boolean isApplicable(ElementPath elementPath, Attributes attributes, InterpretationContext interpretationContext) {
        String strPeekLast = elementPath.peekLast();
        if (interpretationContext.isEmpty()) {
            return false;
        }
        PropertySetter propertySetter = new PropertySetter(interpretationContext.peekObject());
        propertySetter.setContext(this.context);
        AggregationType aggregationTypeComputeAggregationType = propertySetter.computeAggregationType(strPeekLast);
        int i2 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$util$AggregationType[aggregationTypeComputeAggregationType.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return false;
        }
        if (i2 == 4 || i2 == 5) {
            this.actionDataStack.push(new IADataForBasicProperty(propertySetter, aggregationTypeComputeAggregationType, strPeekLast));
            return true;
        }
        addError("PropertySetter.canContainComponent returned " + aggregationTypeComputeAggregationType);
        return false;
    }
}