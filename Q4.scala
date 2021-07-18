//19000792
//Q4

object Q4 extends App{
    def even(n:Int):Boolean= {
        if(n%2 == 0){
            true
        } 
        else{
            false
        }
    } 

    def oddEven(start:Int, end:Int):Unit = {
        if(end>=start){
            oddEven(start, end-1)
            if(even(end)){
                println(end + " is Even") 
            }
            else{
                println(end + " is Odd")
            }
        }
    }
    oddEven(1,5)

}
