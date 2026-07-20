import java.util.*;
class NcR
{

  public static int findNcR (int n, int r)
  {
    int nFac = findFactorial(n);
    int rFac = findFactorial(r);
    int NmRFac = findFactorial(n-r)
    int NcRRes = nFac/(rFac*n-rFac);

    return NcRRes;
  }
  public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int r = scn.nextInt();

    int res = findNcR(n,r);
  }
}