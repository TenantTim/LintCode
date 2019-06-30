public class Solution {
    /**
     * @param flowerbed: an array
     * @param n: an Integer
     * @return: if n new flowers can be planted in it without violating the no-adjacent-flowers rule
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int result = 0, current = 0;
        while (current < flowerbed.length) {
            if (flowerbed[current] == 0 /*Current place empty*/ &&
                (current == 0 || current > 0 && flowerbed[current - 1] == 0) /*Left one empty or at border*/ &&
                (current == flowerbed.length - 1 || current < flowerbed.length - 1 && flowerbed[current + 1] == 0) /*Right one empty or at border*/) {
                flowerbed[current] = 1;
                result ++;
            }
            current ++;
        }
        return result >= n;
    }
}