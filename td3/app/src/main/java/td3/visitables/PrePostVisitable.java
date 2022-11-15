package td3.visitables;

import td3.visitors.PrePostVisitor;
import td3.visitors.Visitor;

public interface PrePostVisitable
{
    void accept(PrePostVisitor v);
}
