// implement a funciton removeNegatives() that accepts an array and removes any values that removes any values that are less than zero. do this without two nested loops and do this in place. Can assume array only consists of numbers

// Added removeNegatives to prototype of the Array Object
Array.prototype.removeNegatives = function() {
	var negCount = 0;
	for (var index = 0; index < this.length; index++) {
		if(this[index] >= 0){
			this[index - negCount] = this[index];
		} else {
			negCount++
		}
	}
	this.length = this.length-negCount;
}

array2 = [-1,2.4,-3.1,4,-5.0,-6];
array2.removeNegatives();
console.log(array2);

/*

// Original Function

function removeNegatives(array){
	// loop through array
	// check value at array[index]
	// if positive value, replace value at array[index - negCount] with array[index]
	// if negative value, increment negCount
	// change array length to array.length - negCount

	var negCount = 0;
	for (var index = 0; index < array.length; index++){
		if(array[index] >= 0){
			array[index - negCount] = array[index];
		} else {
			negCount++;
		}
	}

	array.length = array.length - negCount;

}


array1 = [-1,2.4,-3.1,4,-5.0,-6];
removeNegatives(array1);
console.log(array1)
*/