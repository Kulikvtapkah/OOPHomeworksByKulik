package OOPHomeworksByKulik.Homework4;

import java.util.Comparator;

public class OOPHmw4_1 {
    public static void main(String[] args) {

        TreasureChest<String> nums = new TreasureChest<String>(new String[] { "uuuu", "zdgshhdg", "140", "10" });
        nums.addTreasure("040");
        nums.addTreasure("ukllll");
        nums.addTreasure(12, "hgnj");
        // nums.removeTreasure(2);
        // nums.removeTreasure(4);
        // nums.removeTreasure(0);

        // nums.removeTreasure(0);
        // nums.showTreasures();

        // System.out.println(nums.largestTreasure(Comparator.naturalOrder()));
        // System.out.println(nums.smallestTreasure(Comparator.naturalOrder()));
        TreasureChest<Integer> nums2 = new TreasureChest<Integer>(
                new Integer[] { -2, -2, 2, 2, 2, -2, -2, -2 });
        nums2.selectionTreasureSort(Comparator.naturalOrder());
        nums2.showTreasures();
        System.out.println(nums2.multiplyTreasures().getClass());
        ;
    }

}
