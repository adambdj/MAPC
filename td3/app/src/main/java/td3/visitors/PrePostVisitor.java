package td3.visitors;

import td3.commandes.Client;
import td3.commandes.GroupeClient;
import td3.commandes.Ligne;
import td3.commandes.Commande;

public interface PrePostVisitor extends AbstractVisitor
{
    void preVisit(GroupeClient gc);
    void preVisit(Client client);
    void preVisit(Commande commande);
    void preVisit(Ligne ligne);
    void postVisit(GroupeClient gc);
    void postVisit(Client client);
    void postVisit(Commande commande);
    void postVisit(Ligne ligne);
}
