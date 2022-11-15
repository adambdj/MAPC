package td3.commandes;

import td3.visitors.Visitor;
import td3.visitors.PrePostVisitor;
import td3.visitables.Visitable;
import td3.visitables.PrePostVisitable;


import java.util.Objects;

public class Ligne implements PrePostVisitable, Visitable
{
    private String name ;
    private int sum ;

    public Ligne(String name)
    {
        this.name = name;
    }

    public Ligne(String name, int sum)
    {
        this.name = name;
        this.sum = sum;
    }

    public String getName()
    {
        return name;
    }

    public int getSum()
    {
        return sum;
    }

    @Override
    public void accept(PrePostVisitor v)
    {
        v.preVisit(this);
        v.postVisit(this);
    }

    @Override
    public void accept(Visitor v)
    {
        v.visit(this);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
        	return true;
        }
        if (o == null || getClass() != o.getClass())
        {
        	return false;
        }
        Ligne ligne = (Ligne) o;
        return sum == ligne.sum && Objects.equals(name, ligne.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, sum);
    }
    
}
