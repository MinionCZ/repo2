import android.util.Log

val values = ArrayList<ArrayList<String>>(3)
fun initValues(){
    for(i in 0..2){
        values.add(ArrayList<String>())
        for (j in 0..2){
            values[i].add("null")
        }
    }
}

fun get(x:Int, y:Int) : String{
    if (x <= 2 && y <=2){
        return values[x][y]
    }
    return "out of range"
}
fun setValue(x:Int, y:Int, value:String){
    if(x <= 2 && y <= 2){
        values[x][y] = value
    }
}
fun printBoard(){
    for (x in 0..2){
        var buffer = ""
        for(y in 0..2){
            buffer += "${values[x][y]} "
        }
        Log.i("App", buffer)
    }
}

fun isEnd() : Boolean{
    for(x in 0..2){
        for (y in 0..2){
            if (get(x, y) == "null"){
                return false
            }
        }
    }
    return true
}
