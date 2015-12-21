// Given an array, an index, and an additional value, insert the value into the array at the given index.


function insertAt(array, index1, value) {
	if (!(Array.isArray(array))) {
		throw "First Parameter is not an array";
	}

	var index = parseInt(Math.floor(index1));
	
	if (index < 0) {
		index = 0;
	} else if (index > array.length  || Number.isNaN(index)) {
		index = array.length;
	}

	for (i=array.length; i > index; i--) {
		array[i] = array[i-1];
	}
	array[index] = value;
}

// test cases

// index1 is NaN
array = [0,1,2];
insertAt(array,2.3,1.5);
console.log(array);

// array parameter is not an array
try {
	array2 = ["A","B","C"];
	insertAt("C",3,1);
	console.log(array2);
} catch(err) {
	console.log(err);
}

// value is undefined
array3 = [];
insertAt(array3,1);
console.log(array3);
