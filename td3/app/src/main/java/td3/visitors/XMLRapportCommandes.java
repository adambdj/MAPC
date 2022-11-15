package td3.visitors;

import td3.commandes.Client;
import td3.commandes.Commande;
import td3.commandes.GroupeClient;
import td3.commandes.Ligne;
import td3.visitors.PrePostVisitor;

public class XMLRapportCommandes implements PrePostVisitor
{
    public XMLRapportCommandes()
    {
    
    }

    @Override
    public void preVisit(GroupeClient gc)
    {
        System.out.println("<groupe");
    }

    @Override
    public void preVisit(Client client)
    {

    }

    @Override
    public void preVisit(Commande commande)
    {

    }

    @Override
    public void preVisit(Ligne ligne)
    {
        System.out.println();
    }

    @Override
    public void postVisit(GroupeClient gc)
    {

    }

    @Override
    public void postVisit(Client client)
    {

    }

    @Override
    public void postVisit(Commande commande)
    {

    }

    @Override
    public void postVisit(Ligne ligne)
    {

    }
    
}
