/**
 * Created by pmakhov on 07.08.15.
 */
public class MapPoint
{
  public MapPoint(int height, int i, int j)
  {
    this.height = height;
    this.i = i;
    this.j = j;
  }

  public int getHeight()
  {
    return height;
  }

  public void setHeight(int height)
  {
    this.height = height;
  }

  public int getI()
  {
    return i;
  }

  public void setI(int i)
  {
    this.i = i;
  }

  public int getJ()
  {
    return j;
  }

  public void setJ(int j)
  {
    this.j = j;
  }

  private int height;
  private int i;
  private int j;

  @Override
  public String toString()
  {
    return this.getHeight() + " " + this.getI() + " " + this.getJ();
  }
}
