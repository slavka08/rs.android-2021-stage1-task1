package subtask3

class StringParser {
    fun getResult(inputString: String): Array<String> {

        val  resultStringMutable = mutableListOf<String>()
        var loopIterator = 0
        while (loopIterator<inputString.length-1){
            if (inputString[loopIterator] == '(')
            {
                val closeBracketIndex = (findCloseBracket(loopIterator,'(',')',inputString))
                if (closeBracketIndex>0)
               {
                   resultStringMutable.add(inputString.substring(loopIterator+1,closeBracketIndex))
               }
            }
            if (inputString[loopIterator] == '[')
            {
                val closeBracketIndex = (findCloseBracket(loopIterator,'[',']',inputString))
                if (closeBracketIndex>0)
                {
                    resultStringMutable.add(inputString.substring(loopIterator+1,closeBracketIndex))
                }
            }
            if (inputString[loopIterator] == '<')
            {
                val closeBracketIndex = (findCloseBracket(loopIterator,'<','>',inputString))
                if (closeBracketIndex>0)
                {
                    resultStringMutable.add(inputString.substring(loopIterator+1,closeBracketIndex))
                }
            }
            loopIterator++
        }
        return resultStringMutable.toTypedArray()
    }


    fun findCloseBracket (startIndex:Int,openBracket:Char,closeBracket:Char,inputString: String):Int{
        var tmpIndex = 0
        var colFindOpenBrace = 0
        for (j in startIndex+1..inputString.length-1 ) {
            if (inputString[j] == openBracket){
                colFindOpenBrace++
            }
            if (inputString[j] == closeBracket){
                if (colFindOpenBrace>0){
                    colFindOpenBrace--
                } else
                {
                tmpIndex = j
                break}
            }
        }
        return tmpIndex
    }
}
