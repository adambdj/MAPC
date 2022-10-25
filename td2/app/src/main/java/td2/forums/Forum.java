package td2.forums;

import java.util.List;
import java.util.ArrayList;

public class Forum
{
    public final String topic ;
    public List<Theme> children ;

    public Forum(String topic)
    {
        this.topic = topic;
        children = new ArrayList<>();
    }

    public String sujet()
    {
        return this.topic;
    }

    public void add(Theme child)
    {
        this.children.add(child);
    }

    public void remove(int index)
    {
        this.children.remove(index);
    }

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
