function 10by10{
	var array = [];
	for(var i=0;i<10;i++){
		for(var j=0;j<10;j++){
			var	x = Math.floor((Math.random()*2)+1);
			
			if(x%2 === 0){
				var string = "E"
			}else{
				var string = "D"
			}

			array[i][j] = string;
		}
	}
}



