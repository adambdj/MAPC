package td2.forumsrefactored;

public class Message implements Composant
{
    public final String topic;
    public final String contenu;

    public Message(String topic, String contenu)
    {
        this.topic = topic;
        this.contenu = contenu;
    }

    @Override
    public String sujet()
    {
        return this.topic;
    }

    @Override
    public String toString()
    {
        return "Post :" + topic + '\n' + contenu + '\n';
    }

    @Override
    public void add(Object child) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(int index) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }
}
