/*   Created by IntelliJ IDEA.
 *   Author: Mahak Agrawal (191500432)
 *   Date: 2/17/2021
 *   Time: 3:35 PM
 *   File: QueueByArray.java
 */

package Queue;

public class QueueByArray {
    int arr[];
    int begining;
    int top;

    public QueueByArray(int size){
        arr = new int[size];
        begining = -1;
        top = -1;
    }
    public boolean isEmpty(){
        if(begining == -1 || begining == (arr.length-1)){
            return true;
        }
        else if(begining == top){
            return true;
        }
        else
            return false;
    }
    public boolean isFull(){
        if(top == arr.length-1){
            return true;
        }
        return false;
    }
    public void enqueue(int value){

        if(isFull ()){
            System.out.println ("Queue full or overflow.");
        }

        else if(isEmpty ()){
            begining++;
            //begining = 0;
            top++;
            arr[top] = value;
            //System.out.println (arr[top]);
        }
        else {
            top++;
            arr[top] = value;
            //System.out.println (arr[top]);
        }
    }
    public void dequeue(){
        if(isEmpty ()){
            System.out.println ("No available element to delte.");
        }
        else {
            System.out.println (""+arr[begining]);
            begining++;
        }
        if(begining > top){
            begining = top = -1;
        }
    }
    public void display(){

        int temp = begining;
        while (temp != top){
            System.out.println (""+arr[temp]);
            temp++;
        }
    }
}
