package td3.visitables;

import td3.visitors.Visitor;

public interface Visitable
{
    void accept(Visitor v);
}
