/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.Scanner;
import java.sql.Connection;
/**
 *
 * @author Dell
 */
public class Link_list{
    public static void main(String[] args){
        int num=0;
        Linklisted list = new Linklisted();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of linklist: ");
        num=input.nextInt();
        int element=0;
        for(int i=0;i<num;i++){
            System.out.println("Print number "+i);
            element=input.nextInt();
            Linklisted.Node.insert(list,element);
        }
        int i=0;
        System.out.println("Choose the position need to delete:  ");
        i=input.nextInt();
    
        Linklisted.Node.deleteInKPosition(i,list);

        Linklisted.Node.printList(list);
    }
}
class Linklisted {
    Node head;
    static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
    public static Linklisted insert(Linklisted list, int data){
        Node new_node = new Node(data);
        if(list.head==null){
            list.head=new_node;
        }
        else {
            Node last = list.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=new_node;
        }
        return list;
    }
    public static void printList(Linklisted list){
        Node currentNode=list.head;
        System.out.print("Link list is: ");
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }

    }
    public static void insertInSomePosition(int index, Linklisted list, int data){
        Node currNode=list.head;
        Node newNode=new Node(data);
        if(list.head==null){
            list.head=newNode;
            return ;
        }
        else {
            int i=0;
            while(i<index){
                if(currNode.next==null) {
                    currNode.next=newNode;
                    return ;
                }
                currNode=currNode.next;
                i++;
            }
            Node nextNextNode =currNode.next;
            currNode.next=newNode;
            newNode.next=nextNextNode;
            
        }
    }
    public static void  deleteInKPosition(int k, Linklisted list){
        if(k==1){
            list.head=list.head.next;
            System.out.println("dominhkha");
            return ;
        }
        else {
            Node curr=list.head;
            int i=1;
            while(i<k-1&&curr.next!=null){
                curr=curr.next;
                i++;
            }
            if(curr.next==null&&i<k){
                System.out.println("Index out of Array");
            }
            else if(curr.next==null){
                curr=null;
            }
            else {
                Node nextOfNext=curr.next.next;
                curr.next=nextOfNext;
                return ;
            }

        }

    }
}
}
