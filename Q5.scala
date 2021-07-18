//19000792
//Q5

object Q5 extends App{
	def even(n:Int):Boolean = {
        if(n%2 == 0){
			true
		} 
        else{
			false
		}
    }     
	  
  	def evenSum(n:Int):Int={
    	if(n==0){
			0
		}
    	else{
			if(even(n)){
				n+evenSum(n-2)
			} 
			else{
				(n-1) + evenSum(n-3)
			}
		}
  	}

	print(evenSum(5))
}