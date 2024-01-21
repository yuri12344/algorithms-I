public class QuickFindUF {
    // Quick find is to slow for huge problems, because its quadratic, need to run
    // in array everytime, its N elevated to 2
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    // Eager approach
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}
