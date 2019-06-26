public class Solution {
    /*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        if (A.length == 0) {
            return 0;
        }

        int front = 0, rear = A.length - 1;
        while (front < rear) {
            while (A[front] != elem && front < rear) {
                front ++;
            }
            while (A[rear] == elem && front < rear) {
                rear --;
            }
            if (front != rear) {
                int temp = A[front];
                A[front] = A[rear];
                A[rear] = temp;
            }
        }

        if(A[front] == elem) {
            return front;
        }
        else {
            return front + 1;
        }
    }
}