/*   Created by IntelliJ IDEA.
 *   Author: Mahak Agrawal (191500432)
 *   Date: 2/17/2021
 *   Time: 3:53 PM
 *   File: MainClass.java
 */

package Queue;

public class MainClass {
    public static void main(String[] args) {
        QueueByArray obj = new QueueByArray (6);
        obj.enqueue (68);
        obj.enqueue (45);
        obj.enqueue (35);
        obj.enqueue (5);
        obj.display ();
    }
}
