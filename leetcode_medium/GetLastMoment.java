// 1503. Last Moment Before All Ants Fall Out of the Plank
// We have a wooden plank of the length n units. Some ants are walking on the plank, each ant moves with a speed of 1 unit per second. Some of the ants move to the left, the other move to the right.
// When two ants moving in two different directions meet at some point, they change their directions and continue moving again. Assume changing directions does not take any additional time.
// When an ant reaches one end of the plank at a time t, it falls out of the plank immediately.
// Given an integer n and two integer arrays left and right, the positions of the ants moving to the left and the right, return the moment when the last ant(s) fall out of the plank.

// TC - O(n)
// SC - O(1)

package leetcode_medium;

public class GetLastMoment {
    public static void main(String[] args) {
        int n = 4;
        int left[] = {4, 3};
        int right[] = {0, 1};
        System.out.println(getLastMoment(n, left, right));
    }

    public static int getLastMoment(int n, int[] left, int[] right) {
        int lastMoment = 0;
        for(int position : left) {
            if(position > lastMoment) lastMoment = position;
        }
        for(int position : right) {
            if(n - position > lastMoment) lastMoment = n - position;
        }
        return lastMoment;
    }
}
