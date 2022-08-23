package chapter01;

/**
 * @Author: chenchen19
 * @Description 模拟数据结构中链表的相关操作
 */

public class LinkedListDemo {

    // 链表中的头结点
    private Node head;
    // 链表中的尾结点
    private Node last;
    // 链表在实际长度
    private int size;

    // 链表插入元素
    public void insert(int data,int index) {
        if(index <0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表节点范围！");
        }
        Node insertNode = new Node(data);
        if (size == 0) {
            // 空链表
            head = insertNode;
            last = insertNode;
        } else if (index == 0) {
            // 插入头部
            insertNode.next = head;
            head = insertNode;
        } else if (size == index) {
            // 插入尾部
            last.next = insertNode;
            last = insertNode;
        } else {
            // 插入中间
            /**
             * 1、先找到插入位置的上一个节点；
             * 2、将待插入的节点的下一个指向节点指向待插入位置的上一个节点的下一个节点指向。
             * 3、待插入位置的上一个节点的下一个节点指向自己。
             */
            Node prevNode = get(index-1);
            insertNode.next = prevNode.next;
            prevNode.next = insertNode;
        }
        size++;
    }

    public Node remove(int index) {
        if(index <0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表节点范围！");
        }
        Node removeNode = null;
        if (index == 0) {
            // 删除头结点
            removeNode = head;
            head.next = head;
        } else if(index == size-1) {
            // 删除尾结点
            Node prevNode = get(index-1);
            removeNode = prevNode.next;
            prevNode.next = null;
            last = prevNode;
        } else {
            Node prevNode = get(index-1);
            Node nextNode = prevNode.next;
            removeNode = prevNode.next;
            prevNode.next = nextNode;
        }
        size--;
        return removeNode;
    }

    public void output() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // 查找链表元素
    private Node get(int index) {
        if(index <0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表节点范围！");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        LinkedListDemo linkedList = new LinkedListDemo();
        linkedList.insert(3,0);
        linkedList.insert(7,1);
        linkedList.insert(9,2);
        linkedList.insert(5,3);
        linkedList.insert(6,1);

        linkedList.remove(0);
        linkedList.output();
    }


    // 链表中的节点
    private static class Node{
        // 节点中需要存放的数据
        int data;
        // 节点中需要指向的下一个节点
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

}
