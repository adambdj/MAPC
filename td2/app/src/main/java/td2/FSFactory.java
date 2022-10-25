package td2;

public class FSFactory
{
    private static final FSFactory INSTANCE= new FSFactory();

    private FSFactory()
    {

    }

    public static FSFactory getInstance()
    {
        return INSTANCE ;
    }

    public Composant createComposant(ComposantType type, String name, Owner owner)
    {
        switch (type)
        {
            case REPERTOIRE: return new Repertoire(name, owner);
            default: return new Fichier(name, owner);
        }
    }
}
