// Given an array and an index into the array, remove and return the array value at that index.

Array.prototype.removeAt = function(index) {
	index = parseInt(Math.floor(index));
	if (Number.isNaN(index)){
		return NaN;
	}
	var temp = this[index];

	for (var i = index; i < this.length-1; i++) {
		this[i] = this[i+1];
	}
	if (index <= this.length) {
		this.length = this.length-1;
	}
	return temp;
}

// test cases
var array = [0,1,2];
var removedValue = array.removeAt(4);
console.log(array);
console.log(removedValue);