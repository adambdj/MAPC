package td3.commandes;

import td3.visitors.Visitor;
import td3.visitors.PrePostVisitor;
import td3.visitables.Visitable;
import td3.visitables.PrePostVisitable;

import java.util.*;

public class Client implements PrePostVisitable, Visitable
{
    private final String name ;
    private final Map<String, Commande> commandes;

    public Client(String name)
    {
        this.name = name;
        this.commandes = new HashMap<>();
    }

    public String getName()
    {
        return name;
    }

    public void addCommande(Commande commande)
    {
        this.commandes.put(commande.getName(), commande);
    }

    public void addLigne(String name, Ligne ligne)
    {
        Commande c = this.commandes.get(name) ;
        if(c!= null){c.addLigne(ligne);}
        //else throw new MonException("commande inconnue");
    }

    @Override
    public void accept(PrePostVisitor v)
    {
        v.preVisit(this);
        for(Commande c: commandes.values()) c.accept(v);
        v.postVisit(this);
    }

    @Override
    public void accept(Visitor v)
    {
        for(Commande c: commandes.values()) c.accept(v);
        v.visit(this);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
        {
        	return false;
        }
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(commandes, client.commandes);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, commandes);
    }
}
