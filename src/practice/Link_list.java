/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.Scanner;
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
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
        System.out.println(".");
    }
}
}
