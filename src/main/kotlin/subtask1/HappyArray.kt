package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        return if (sadArray.isEmpty()){
            sadArray
        } else {
            var workArray = sadArray
            while (checkForSad(workArray)) {
                workArray = workSad(workArray)
            }
            workSad(workArray)
        }
    }

    private fun checkForSad(sadArray: IntArray): Boolean {
        var tmpResult = false
        for (i in 1..sadArray.size - 2) {
            if ((sadArray[i] > sadArray[i - 1] + sadArray[i + 1])) {
                tmpResult = true
            }
        }
        return tmpResult
    }


    private fun workSad(sadArray: IntArray): IntArray {
        val mutableSadArray = mutableListOf<Int>()

        mutableSadArray.add(sadArray[0])
        for (i in 1..sadArray.size-2) {
            if  (sadArray[i] <= sadArray[i - 1] + sadArray[i + 1]){
                mutableSadArray.add(sadArray[i])
            }
        }
        mutableSadArray.add(sadArray[sadArray.size-1])

        return mutableSadArray.toIntArray()
    }
}
