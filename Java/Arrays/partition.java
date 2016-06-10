public int[] partition(int[] b){

	int front = 0;
	int back = b.length-1;

	// move front and back to starting positions
	while(b[front]<0){
		front++;
		if(front == b.length) return b;
	}
	while(b[back]>0){
		back--;
		if(back == -1) return b;
	}

	int current = front+1;

	while(current <= back){
		if(b[current] < 0){
			swap(b[current], b[front])
			front++;
		} else if(b[current] > 0){
			swap(b[current], b[back])
			back--;
		} else {
			current++;
		}
	} 
	return b;
}