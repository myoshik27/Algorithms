// Given a numerical array, reverse the order of the values. This should be done in place

Array.prototype.reverse = function() {
	if (this.length > 1) {
		for (var i = 0; i < Math.floor(this.length/2); i++){
			var temp = this[i];
			this[i] = this[this.length-1-i];
			this[this.length-1-i] = temp;
			console.log(this);
		}
	}
}


var array = [0,1,2,3,4];
console.log(Math.floor(array.length/2));
array.reverse()
// console.log(array);