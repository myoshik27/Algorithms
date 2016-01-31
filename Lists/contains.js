// create a function that returns a a boolean whether the value is found in any node within the list
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

singlyLinkedList.prototype.contains = function(value) {
	currentNode = this.head;
	while(currentNode) {
		if (currentNode.val === value) {
			return true
		}

		currentNode = currentNode.next;
	}
	return false
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
	list.add(false);
	list.add("B");
	list.add("c");
	list.add("1");
	list.add(2);

	console.log("List Contains Value: ", list.contains(false));
	console.log("List Contains Value: ", list.contains("b"));
	console.log("List Contains Value: ", list.contains("B"));
	console.log("List Contains Value: ", list.contains(1));
	console.log("List Contains Value: ", list.contains(2));
}

main();