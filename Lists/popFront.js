// create a function that removes the front node of a singly linked list and returns the node
function singlyLinkedList() {
	this.head = null;
}

function Node(value) {
	this.val = value;
	this.next = null;
}

singlyLinkedList.prototype.add = function(value) {

	var node = new Node(value);
	var currentNode = this.head;

	if(!this.head) {
		this.head = node;
	} else {
		while(currentNode.next) {
			currentNode = currentNode.next;
		}
		currentNode.next = node;
	}

	return node
}

singlyLinkedList.prototype.popFront = function() {
	var frontNode = this.head;
	if (!this.head) {
		return
	}
	this.head = frontNode.next;
	return frontNode;
}

function printList(list) {
	console.log("======== List ========")
	console.log()
	var currentNode = list.head;

	while(currentNode) {
		console.log(currentNode);
		currentNode = currentNode.next;
	}
	
	console.log()
	console.log("======== End List ========")
}

function main() {
	var list = new singlyLinkedList();
	list.add(0);
	list.add(1);
	list.add(2);
	console.log("======== Popped node ========")
	console.log()
	console.log(list.popFront());
	console.log()
	console.log("======== End Popped node ========")
	console.log()

	printList(list);
}

main();