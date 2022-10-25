package td2.forums;

public class Message
{
    public final String topic;
    public final String contenu;

    public Message(String topic, String contenu)
    {
        this.topic = topic;
        this.contenu = contenu;
    }

    public String sujet()
    {
        return this.topic;
    }

    @Override
    public String toString()
    {
        return "Post :" + topic + '\n' + contenu + '\n';
    }
}
