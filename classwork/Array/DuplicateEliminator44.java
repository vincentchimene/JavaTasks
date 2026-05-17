1   import java.util.Scanner;
2
3   public class DuplicateEliminator44{
4
5       public static void eliminateDuplicate(int[] array) {
6
7           for (int index = 0; index < 10; index++) {
8
9               for (int count = index + 1; count < 10; count++) {
10
11                  if (array[index] == array[count]) {
12                      array[count] = -1;
13                  }
14
15              }
16
17          }
18
19          for (int index = 0; index < 10; index++) {
20
21              if ((array[index] != -1) &&
22                  (array[index] >= 10) &&
23                  (array[index] <= 100)) {
24
25                  System.out.print(array[index] + " ");
26              }
27
28          }
29
30      }
31
32      public static void main(String[] args) {
33
34          Scanner inputCollector = new Scanner(System.in);
35
36          int[] array = new int[10];
37
38          for (int index = 0; index < 10; index++) {
39              System.out.print("Enter the element: ");
40              array[index] = inputCollector.nextInt();
41          }
42
43          eliminateDuplicate(array);
44
45      }
46
47  }
