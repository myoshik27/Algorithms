// Given an array and additional value, insert this value at the beginning of the array.

// pushFront as a function that is not part of the Array prototype
// function pushFront(array, value) {
// 	if (!Array.isArray(array)){
// 		throw "1st Parameter not an array"
// 	}

// 	if (value === undefined) {
// 		throw "2nd Parameter undefined"
// 	}
// 	for (var i = array.length; i > 0; i--) {
// 		array[i] = array[i-1];
// 	}
// 	array[0] = value;
// }


// try {
// 	array = [1,2,3,4,5]
// 	pushFront(array,6)
// } catch(err) {
// 	console.log("Error: ", err)
// }

// console.log("New array: ",array)


// Added pushFront function to the prototype of the Array object
Array.prototype.pushFront = function(value) {
	for(var i = this.length; i>0; i--){
		array[i] = array[i-1];
	}
	array[0] = value;
}

// Test cases
array = [1,2,3,4,5];
array.pushFront(0);
array.pushFront("Hello");
array.pushFront(false);
array.pushFront(function(value){
	console.log(value);
});

console.log(array);