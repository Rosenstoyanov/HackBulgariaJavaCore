package com.hackbulgaria.corejava;

public class DoubleLinkedList {
	public Link first;
	public Link last;

	public DoubleLinkedList() {
		first = null;
		last = null;
	}

	public void insert(Object obj) {
		Link link = new Link(obj);
		if (this.first == null) {
			first = link;
			link.next = null;
			link.previous = null;
		} else {
			last.next = link;
			link.previous = last;
		}
		last = link;
	}

	public void remove(Link dellItem) {
		Link currItem = first;
		Link previous = first;
		Link next = first.next;
		if (dellItem == first) {

		}
		if (dellItem == last) {

		} else {
			for (int i = 0; i < size(); i++) {
				if (currItem == dellItem) {
					previous.next = next;
					next.previous = previous;
				}
				currItem = currItem.next;
				next = next.next;
				previous = previous.next;
			}
		}
	}

	public int size() {
		int returnLength = 0;
		Link curr = first;
		while (curr != last) {
			returnLength += 1;
		}
		return returnLength + 1;
	}

	public Link getIntElement(int elem) {
		int returnLength = 1;
		Link curr = first;
		if (elem <= this.size()) {
			while (curr != last) {
				if (returnLength == elem) {
					return curr;
				}
				returnLength += 1;
			}
		}
		return null;
	}

	public Link getFirst() {
		return this.first;
	}

	public Link getTail() {
		return this.last;
	}

	public void print() {
		Link curr = first;
		while (curr != last) {
			System.out.println(curr.obj);
			curr = curr.next;
		}
		System.out.println(last.obj);
	}
}
