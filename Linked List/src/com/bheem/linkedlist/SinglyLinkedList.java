package com.bheem.linkedlist;

public class SinglyLinkedList<E> {

	private class Node<E>{
		private E element;
		private Node<E> next;
		public Node(Node<E> n, E e) {
			next = n;
			element = e;
		}
		public Node() {

		}
		public E getElement() {
			return element;}
		public Node<E> getNext(){
			return next;}
		public void setNext(Node<E> n) {
			next = n;}
	}
	private int size =0;
	private Node<E> head;
	private Node<E> tail;

	public int size() {return size;}
	public E first() {return head.element;}
	public E firstEle() {return head.getElement();}

	public E last() {return tail.element;}
	public E lastEle() {return tail.getElement();}

	public void addFirst(E e) {
		Node<E> newNode = new Node<E>();
		newNode.element = e;
		newNode.next = head;
		head = newNode;
		if(size()==0) tail = head;
		size++;
	}
	public void addFirstEle(E e) {
		Node<E> tmp  = new Node<E>(head, e);
		head = tmp;
		if(size()==0) tail = head;
		size++;
	}
	public void addFirstElei(E e) {
		head  = new Node<E>(head, e);
		if(size()==0) tail = head;
		size++;
	}

	public static void main(String[] args) {
		SinglyLinkedList<Integer> sl = new SinglyLinkedList<>();
		sl.addFirst(5);
		sl.addFirst(6);
		sl.addFirst(7);
		sl.addFirst(8);
		System.out.println(sl.first());
		sl.addFirstEle(9);
		System.out.println(sl.firstEle());

	}

}
