/*   Created by IntelliJ IDEA.
 *   Author: Mahak Agrawal (191500432)
 *   Date: 2/24/2021
 *   Time: 11:04 AM
 *   File: Main.java
 */

package Queue;

public class Main {
    public static void main(String[] args) {
        DoubleEndedQueue d = new DoubleEndedQueue (7);
        d.insertfront (56);
        d.insertfront (24);
        d.insertfront (5);
        d.insertfront (78);
        d.insertfront (2);
        d.insertrear (78);
        d.insertrear (34);
        d.deletefront ();
        d.deleterear ();
        d.getFront ();
        d.getRear ();
        d.getFront ();
    }
}
