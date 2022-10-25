package td2;

import java.util.Objects;

public abstract class ComposantImplementation implements Composant
{

    private final String name;
    private Owner owner;

    public ComposantImplementation(String name, Owner owner)
    {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public Owner getOwner()
    {
        return this.owner;
    }

    @Override
    public void setOwner(Owner owner, boolean recursive)
    {
        this.owner = owner ;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.getName());
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true ;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false ;
        }

        Fichier fichier = (Fichier)obj;
        return Objects.equals(this.getName(),fichier.getName());
    }
}
