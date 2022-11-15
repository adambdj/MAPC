package td3.commandes;

import td3.visitors.Visitor;
import td3.visitors.PrePostVisitor;
import td3.visitables.Visitable;
import td3.visitables.PrePostVisitable;


import java.util.*;

public class Commande implements PrePostVisitable, Visitable
{
    private final String name ;
    private final Map<String, Ligne> lignes;

    public Commande(String name)
    {
        this.name = name;
        this.lignes = new HashMap<>();
    }

    public String getName()
    {
        return name;
    }

    public void addLigne(Ligne ligne)
    {
        this.lignes.put(ligne.getName(), ligne);
    }

    @Override
    public void accept(PrePostVisitor v)
    {
        v.preVisit(this);
        for(Ligne l: lignes.values()) l.accept(v);
        v.postVisit(this);
    }

    @Override
    public void accept(Visitor v)
    {
        for(Ligne l: lignes.values()) l.accept(v);
        v.visit(this);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o){
        	return true;
        }
        if (o == null || getClass() != o.getClass())
        {
        	return false;
        }
        Commande commande = (Commande) o;
        return Objects.equals(name, commande.name) && Objects.equals(lignes, commande.lignes);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, lignes);
    }
}
