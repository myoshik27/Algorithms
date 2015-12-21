// given an array, remove and return the value at the beginning of the array. You may use the .pop() function if necessary

// popFront as a function that is not part of the Array prototype
// function popFront(array) {
// 	if (!Array.isArray(array)) {
// 		throw "parameter is not an array";
// 	}

// 	if (array.length === 0) {
// 		throw "Array is empty";
// 	}

// 	var temp = array[0];
// 	for (var i = 0; i < array.length - 1; i++) {
// 		array[i] = array[i+1];
// 	};

// 	if(array.length > 0) {
// 		array.length = array.length - 1;
// 	}
// 	return temp;
// }

// try {
// 	var array = [1,2,3,4,5];
// 	var removedValue = popFront(array);
// 	console.log("Removed Value: ", removedValue);
// 	console.log("Edited Array: ", array);
// } catch (err) {
// 	console.log("Errors", err);
// }

// Added popFront function to the prototype of the Array object
Array.prototype.popFront = function() {
	var temp = array[0];
	for (var i = 0; i < this.length-1; i++){
		this[i] = this[i+1];
	};

	if (this.length > 0) {
		this.length = this.length-1;
	}
	return temp;
}

// Test Cases

array = [1,2];
console.log(array.popFront());
console.log(array);
console.log(array.popFront());
console.log(array);
console.log(array.popFront());
console.log(array);