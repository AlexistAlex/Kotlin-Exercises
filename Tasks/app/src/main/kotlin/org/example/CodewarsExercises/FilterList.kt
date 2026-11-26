fun filterList(l: List<Any>): List<Int>{
    val newList = mutableListOf<Int>()
    for(element in l){
        if(element is Int) {
            newList += element
        }
    }
    return newList
}