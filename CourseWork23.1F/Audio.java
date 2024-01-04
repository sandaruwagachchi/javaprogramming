public class Audio extends MediaItem
{
  protected String format;

public Audio(String title,double duration,String format)
{ 
  super(title,duration);
  this.format=format;
}
public void play()
{
System.out.println("Playing audio: "+title+" in "+format);
}
}
