package td3.visitors;

import td3.commandes.Client;
import td3.commandes.GroupeClient;
import td3.commandes.Ligne;
import td3.commandes.Commande;

public interface Visitor extends AbstractVisitor
{
    void visit(GroupeClient gc) ;
    void visit(Client client) ;
    void visit(Commande commande) ;
    void visit(Ligne ligne) ;
}