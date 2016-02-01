// create a bst method that returns a boolean indicating if the tree contains a given value

function binarySearchTree() {
	this.root = null;
};

function bstNode(value) {
	this.val = value;
	this.left = null;
	this.right = null;
};

binarySearchTree.prototype.add = function(value) {
	var newNode = new bstNode(value);
	if (!this.root) {
		this.root = newNode;
	} 

	var currentNode = this.root;
	while (currentNode !== newNode) {
		if (value < currentNode.val) {
			if (!currentNode.left) {
				currentNode.left = newNode;
			}
			currentNode = currentNode.left;
			
		} else {
			if (!currentNode.right) {
				currentNode.right = newNode;
			}
			currentNode = currentNode.right;
		}
	}
};

binarySearchTree.prototype.contains = function(value) {
	var currentNode = this.root;
	while(currentNode) {
		if (currentNode.val === value) {
			return true;
		} else if (value < currentNode.val) {
			currentNode = currentNode.left;
		} else {
			currentNode = currentNode.right;
		}
	}

	return false;
};

function main() {
	var bst = new binarySearchTree()
	bst.add(5);
	bst.add(4);
	bst.add(1);
	bst.add(7);
	bst.add(8);
	bst.add(0);
	console.log(bst.contains(0));
	console.log(bst.contains(10));
};

main();