// given a value add the new node to the front of the list
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

singlyLinkedList.prototype.pushFront = function(value) {
	var newNode = new Node(value);
	newNode.next = this.head;
	this.head = newNode;
}

var list = new singlyLinkedList();

list.add(1);
list.add(2);

list.pushFront(0);

var currentNode = list.head

while(currentNode) {
	console.log(currentNode);
	currentNode = currentNode.next;
}