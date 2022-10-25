package td2;

import java.util.Objects;

public class Owner
{
    private String name;

    public Owner(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    @Override
    public boolean equals(Object objet)
    {
        if (this == objet)
        {
            return true;
        }

        if (objet == null || getClass() != objet.getClass())
        {
            return false;
        }

        Owner owner = (Owner) objet;
        return Objects.equals(this.getName(),owner.getName());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.getName());
    }
    
}
