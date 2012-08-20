public class QuickFindUF
{
  private int[] ids;

  public QuickFindUF(int n)
  {
    ids = new int[n];
    for (int i = 0; i < n; i++)
      ids[i] = i;
  }

}
