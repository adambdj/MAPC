package td2.forumsrefactored;

import java.util.List;
import java.util.ArrayList;

public class Theme
{
    public final String topic;
    public List<Salon> children;

    public Theme(String topic)
    {
        this.topic = topic;
        children = new ArrayList<>();
    }

    public String sujet()
    {
        return this.topic;
    }

    public void add(Salon child)
    {
        this.children.add(child);
    }

    public void remove(int index)
    {
        this.children.remove(index);
    }

    public int size()
    {
        return this.children.size();
    }

    @Override
    public String toString()
    {
        StringBuilder forum = new StringBuilder();
        forum.append("Theme: ");
        forum.append(topic);
        forum.append("\n");
        this.children.forEach(c -> {forum.append(c);});
        return forum.toString();
    }

}