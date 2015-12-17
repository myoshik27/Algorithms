// Given an array and additional value, insert this value at the beginning of the array.


function pushFront(array, value) {
	if (!Array.isArray(array)){
		throw "1st Parameter not an array"
	}

	if (value === undefined) {
		throw "2nd Parameter undefined"
	}
	for (var i = array.length; i > 0; i--) {
		array[i] = array[i-1];
	}
	array[0] = value;
}


try {
	array = [1,2,3,4,5]
	pushFront(array)
} catch(err) {
	console.log("Error: ", err)
}

console.log("New array: ",array)