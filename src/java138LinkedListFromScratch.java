//name: programmerJohn
//pgm desc: Demonstrate the use of a "Singly linked list"
import java.io.*;
import java.util.LinkedList;
public class java138LinkedListFromScratch {

    Node head; //head of linked list

    //static "stand alone" linked list NOde inner class accessible by main()
    static class Node{
        int data;
        Node nextPointer; //next is an reference object pointer

        //constructor for class Node objects
        Node(int d){
            data = d;
            nextPointer = null;
        }
    }

    //insert method for the JLinkedList class
    public static java138LinkedListFromScratch insert( java138LinkedListFromScratch list, int data){

        //create a new node object with the given data
        Node newNode = new Node(data);

        //if the linked list is empty, then make the new node as a head node
        if( list.head == null){
            list.head = newNode;
        }
        else{
            //traverse till the last node and insert the new node there
            Node last = list.head;

            while(last.nextPointer != null){
                last = last.nextPointer;
            }
            //insert the new node at last node
            last.nextPointer = newNode;
        }
        //return the list by head
        return list;
    } // end of insert method

    //method to delete a node in the linked list by value
    public static java138LinkedListFromScratch deleteByKey(java138LinkedListFromScratch list, int key){
        //store the head node
        Node currNode = list.head, prev = null;

        //case 1 - if the head node itself contains the key to obe deleted
        if(currNode != null && currNode.data == key){
            list.head = currNode.nextPointer; //changed head node

            System.out.println(key + " found and deleted");

            //return the updated list
            return list;
        }

        //case 2 - if key is anywhere other than the head
        //search for the key to be deleted & keep track of the previous node in order to cahnge currNode.nextPointer
        while( currNode != null && currNode.data != key){
            //if the currNode does not contain key then continue to next node
            prev = currNode;
            currNode = currNode.nextPointer;
        }

        //if the key was present then it should be at currNode thefore currNode won't be null
        if(currNode != null){
            //since the key is at currNode then un link currNode from linked list
            prev.nextPointer = currNode.nextPointer;

            System.out.println(key + " found and deleted");
        }

        //case 3 - key is not present; therefore currNode should be null
        if(currNode == null){
            System.out.println(key + " not found");
        }
        return list;
    }

    //method to print the Linked List
    public static void printList(java138LinkedListFromScratch list){
        Node currNode = list.head;
        System.out.println("LinkedList: ");

        //traverse through the linked list
        while(currNode != null){
            //print the data at current node
            System.out.println(currNode.data + " ");

            //go to next node
            currNode = currNode.nextPointer;
        }
    }

    //driver main code
    public static void main(String[] args){
        //set up empty linked list
        java138LinkedListFromScratch list = new java138LinkedListFromScratch();

        //insert the values

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        list = insert(list, 9);

        printList(list);

        //delete node with the value 1....this will be at head node
        deleteByKey(list, 1);

        printList(list);

        deleteByKey(list, 4);   //delete node with value of 4

        printList(list);

        deleteByKey(list, 12);  //try to delete a node with a key that is not present

        printList(list);
    }
}
