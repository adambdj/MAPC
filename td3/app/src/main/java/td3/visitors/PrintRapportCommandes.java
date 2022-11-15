package td3.visitors;

import td3.commandes.Client;
import td3.commandes.Commande;
import td3.commandes.GroupeClient;
import td3.commandes.Ligne;
import td3.visitors.*;

import java.util.Map;

public class PrintRapportCommandes implements Visitor
{
    private Map<String, Integer> factures ;
    private int cumulCommandes ;
    private int cumulClient ;

    public PrintRapportCommandes()
    {
    }

    @Override
    public void visit(GroupeClient gc)
    {
    }

    @Override
    public void visit(Client client)
    {
        factures.put(client.getName(), cumulClient);
        cumulClient = 0 ;
    }

    @Override
    public void visit(Commande commande)
    {
        cumulClient += cumulCommandes ;
        cumulCommandes = 0 ;
    }

    @Override
    public void visit(Ligne ligne)
    {
        cumulCommandes += ligne.getSum();
    }
    
}
