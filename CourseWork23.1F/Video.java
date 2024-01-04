public class Video extends MediaItem
{
  protected String resolution;

public Video(String title,double duration,String resolution)
{
  super(title,duration);
  this.resolution=resolution;
}
public void play()
{
  System.out.println("Playing video: "+title+ " in "+resolution);
}
}