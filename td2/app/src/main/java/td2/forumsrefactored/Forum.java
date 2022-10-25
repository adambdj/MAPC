package td2.forumsrefactored;

import java.util.List;
import java.util.ArrayList;

public class Forum implements Composant<Theme>
{
    public final String topic ;
    public List<Theme> children ;

    public Forum(String topic)
    {
        this.topic = topic;
        children = new ArrayList<>();
    }

    @Override
    public String sujet()
    {
        return this.topic;
    }

    @Override
    public void add(Theme child)
    {
        this.children.add(child);
    }

    @Override
    public void remove(int index)
    {
        this.children.remove(index);
    }

    @Override
    public int size()
    {
        return this.children.size() ;
    }

    @Override
    public String toString()
    {
        StringBuilder forum = new StringBuilder();
        forum.append("Forum: ");
        forum.append(topic);
        forum.append("\n");
        this.children.forEach(c -> {forum.append(c);});
        return forum.toString();
    }
    
}
