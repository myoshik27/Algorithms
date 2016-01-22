/*

Implement the funciton rotateArr(arr,shiftBy) that accepts an array and an offsnumberet. The function should shift the arr values by that amount. Values that shift off the array's end should "wrap around" to appear on the array's other side, so that no data is lost. Assume that arr is always an array and that shiftBy is always a whole number

Optionally, add these advanced features:

1. negative shiftBy values (shift left instead of right)
2. minimize memory usage. With only a few local variables (not a partial array copy), the function should handle arrays and shiftBys that are in the millions
3. minimize how many times you touch each element

*/
 
function rotateArr(arr, shiftBy) {

	var shift = Math.floor(shiftBy) % arr.length;

	if (arr.length <= 1 || shift === 0) {
		console.log("array is one or less or shiftby is 0")
		return
	}

	if (shift < 0) {
		shift = arr.length + shift
	}

	if (arr.length % shift === 0) {
		var marker = 0;
	}

	var counter = 0;
	var current_index = 0;
	var current_val = arr[current_index];
	while (counter < arr.length) {
		console.log("========= iteration " + (counter + 1) + " =========");
		console.log(arr);
		console.log("current_index: ", current_index);
		console.log("current_val: ", current_val);
		console.log("next_index:", (current_index + shift) % arr.length);
		console.log("next_val:", arr[(current_index + shift) % arr.length]);

		var next_index = (current_index + shift) % arr.length;
		var next_val = arr[next_index];
		if (next_index == marker) {
			next_val = arr[next_index + 1];
		}
		arr[next_index] = current_val;
		current_val = next_val;
		current_index = next_index;

		if (next_index == marker) {
			next_index++;
			current_index++;
			marker++;
		};

		console.log(arr)
		console.log("")

		counter++;
	}
}

var array = [1,2,3,4,5,6];
var shift = 4;

rotateArr(array,shift);
console.log(array)