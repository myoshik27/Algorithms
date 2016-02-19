// given a sorted array of numbers, return whether a value is present. Do not sequentially iterate. 'divide and conquer'. Take advantage of the fact that the array is sorted. The value will always be a number

function binarySearch(array, value){

	var startIdx = 0;
	var endIdx = array.length - 1;
	while(endIdx > startIdx) {
		var midIdx = Math.floor((startIdx + endIdx)/2);
		if (value === array[midIdx] || value === array[endIdx] || value === array[startIdx]){
			return true;
		} else if (value > array[midIdx]) {
			startIdx = midIdx + 1;
		} else if (value < array[midIdx]) {
			endIdx = midIdx;
		}
	}
	return false;
}

array = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
console.log(binarySearch(array,15));	// true
console.log(binarySearch(array,20));	// true
console.log(binarySearch(array,1));		// true
console.log(binarySearch(array,20.0));	// true
console.log(binarySearch(array,21));	// false
console.log(binarySearch(array,10.7));	// false
console.log(binarySearch(array,-9));	// false