package xebia;

import java.util.ArrayList;
import java.util.List;

public class TreeCalculator
{
   public static int[] treeVisibilityCalculator(int[] tree)
   {
      //Making the first tree as first visible tree
      int curVisibleTree = tree[0];
      int[] visibleTreeArray;
      int j = 0;

      List<Integer> visibleTreeList = new ArrayList<Integer>();
      visibleTreeList.add(curVisibleTree);
      //getting the visible tree list
      for (int i = 1; i < tree.length; i++)
      {
         if (tree[i] > curVisibleTree)
         {
            curVisibleTree = tree[i];
            visibleTreeList.add(curVisibleTree);
         }
      }

      visibleTreeArray = new int[visibleTreeList.size()];

      for (Integer visibleTree : visibleTreeList)
      {
         visibleTreeArray[j++] = visibleTree;
      }

      //returning an int[] array of visible tree
      return visibleTreeArray;
   }

   public static void main(String args[])
   {
      // given an array of tree's height
      int[] tree = { 10, 15, 4, 5, 8, 19, 18, 21, 21, 19, 17, 5, 25, 4 };

      //calling the function for getting the visible tree list
      int[] visibleTreeArray = treeVisibilityCalculator(tree);

      // Priniting the visible tree list
      System.out.println("This is visible tree's list ... ");
      for (int i = 0; i < visibleTreeArray.length; i++)
      {
         System.out.print(" " + visibleTreeArray[i]+ " ");
      }

   }

}
