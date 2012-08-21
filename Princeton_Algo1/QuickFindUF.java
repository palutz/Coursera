public class QuickFindUF
{
  private int[] ids;

  public QuickFindUF(int n)
  {
    ids = new int[n];
    for (int i = 0; i < n; i++)
      ids[i] = i;
  }

  // Check if the two nodes, p and q are connected, checking
  // if p and q have the same value
  public boolean IsConnected(int p, int q)
  {
    return (id[p] == id[q]);
  }

  // Union: change all the entries to the new value if different, from id[p] to id[p]
  public void Union(int p, int q)
  {
    int pid = id[p];
    int qid = id[q];
    for (int i = 0; i < id.length; i++)
      if(id[i] == pid)
        id[i] = qid;
  }
}
