/**
 * Created by pmakhov on 07.08.15.
 */
public class Main
{
  public static void main(String[] args)
  {
    int [][] map = {{4,8,7,3},{2,5,9,3},{6,3,2,5},{4,4,1,6}};
    int size = 4;

    System.out.println(findMax(map));
  }

  public static MapPoint findMax(int [][] matr)
  {
    int max = matr [0][0];
    int ii = 0;
    int jj = 0;
    for (int i = 0; i < matr.length; i++)
      for (int j = 0; j < matr.length; j++)
      {
        if (max < matr[i][j])
        {
          max = matr[i][j];
          ii = i;
          jj = j;
        }
      }

    return new MapPoint(max, ii, jj);
  }

  public static MapPoint getNextPoint(int[][] map, MapPoint mapPoint)
  {

  }
}
