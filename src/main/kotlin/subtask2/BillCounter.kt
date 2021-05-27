package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var annaCash = 0
        for (i in bill.indices){
          if (i!=k){
              annaCash +=bill[i]
          }
        }
        if ((annaCash/2)==b){
            return "bon appetit"
        } else
        {
            var allBill = 0
            for (i in bill.indices){
                allBill +=bill[i]
            }
            return ((b)-(annaCash/2)).toString()
        }

    }
}
