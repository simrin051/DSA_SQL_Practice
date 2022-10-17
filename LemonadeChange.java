/**
 * @param {number[]} bills
 * @return {boolean}
 */
var lemonadeChange = function(bills) {
   let numFive=0,numTen=0;
   for(let bill of bills) {
       if(bill==5) {numFive++; continue;}
       if(bill==10) (numFive--, numTen++);
       if(bill==20) (numTen>0?(numFive--,numTen--):(numFive=numFive-3));
       if(numFive<0) return false; 
   }
   return true;
};
