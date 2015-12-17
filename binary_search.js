
import random
  
function binary_search(arr,val){
  var max = arr.length-1;
  var min = 0;
  var mid = 0;
  while(max-min>0){
    mid = middle(min,max,mid);
    if (arr[mid] == val){
      return true;
    }else if(arr[mid] > val){
      max = mid;
    }else{
      min = mid;
    }
  return false; 
  }
}

function middle(min,max,center){
  var mid = math.floor((max-min)/2) + center;
  return mid;
}

binary_search([1,2,3,4],3);